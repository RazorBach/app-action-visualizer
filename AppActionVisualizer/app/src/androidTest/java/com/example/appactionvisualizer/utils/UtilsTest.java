package com.example.appactionvisualizer.utils;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;

import com.example.appactionvisualizer.R;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class UtilsTest {
  // Context of the app under test.
  private Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();

  /**
   * Use an existing resource name to test getResId()
   */
  @Test
  public void getResIdTest() {
    assertNotEquals(Utils.getResId("com_taxis99", R.drawable.class), -1);
  }

  /**
   * Use an existing package name to test getResIdByPackageName()
   */
  @Test
  public void getResIdByPackageNameTest() {
    assertNotEquals(Utils.getResIdByPackageName("com.nike.plusgps", R.drawable.class), -1);
  }

  /**
   * Use an existing package name to test getAppNameByPackageName()
   */
  @Test
  public void getAppNameByPackageNameTest() {
    assertEquals(Utils.getAppNameByPackageName(appContext, "com.ubercab.eats"), "Uber Eats");
  }
}