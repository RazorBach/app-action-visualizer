package com.example.appactionvisualizer.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.appactionvisualizer.R;
import com.example.appactionvisualizer.databean.ParameterMapping;
import com.example.appactionvisualizer.ui.activity.parameter.ListItemActivity;

import java.util.List;

/**
 * Adapter of ListItemActivity Recyclerview
 */
public class SelectRecyclerViewAdapter extends RecyclerView.Adapter<SelectRecyclerViewAdapter.ViewHolder> {

  private List<ParameterMapping.Mapping> mappingList;
  private Context context;
  private String key;

  public SelectRecyclerViewAdapter(List<ParameterMapping.Mapping> mappingList, String key, Context context) {
    this.context = context;
    this.mappingList = mappingList;
    this.key = key;
  }

  @Override
  public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(context)
        .inflate(R.layout.list_item, parent, false);
    return new ViewHolder(view);
  }

  @Override
  public void onBindViewHolder(final ViewHolder holder, final int position) {
    final ParameterMapping.Mapping mapping = mappingList.get(position);
    holder.textContent.setText(mapping.getName());
    holder.mView.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        ((ListItemActivity)(context)).finish(mapping.getIdentifier());
      }
    });
  }

  @Override
  public int getItemCount() {
    return mappingList.size();
  }

  public static class ViewHolder extends RecyclerView.ViewHolder {
    public final View mView;
    public final TextView textContent;

    public ViewHolder(View view) {
      super(view);
      mView = view;
      textContent = view.findViewById(R.id.text_content);
    }

    @Override
    public String toString() {
      return super.toString() + " '" + textContent.getText() + "'";
    }
  }
}