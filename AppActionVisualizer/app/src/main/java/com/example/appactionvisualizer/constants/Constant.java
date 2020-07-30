package com.example.appactionvisualizer.constants;


public class Constant {
  public final static String ACTION_TYPE = "ACTION_TYPE";
  public final static String APP_ACTION = "APP_NAME";
  public final static String ACTION = "ACTION";
  public final static String FULFILLMENT_OPTION = "FULFILLMENT";
  public final static String ENTITY_SET = "PARAMETER_MAPPING";
  public final static String KEY = "KEY";
  public final static String ERROR_FILL_PARAMETER = "Please select all parameters";
  public final static String ERROR_NO_PLACE = "Could not find address";
  public final static String PICK_UP_LATITUDE = "PICK_UP_LATITUDE";
  public final static String PICK_UP_LONGITUDE = "PICK_UP_LONGITUDE";
  public final static String DROP_OFF_LATITUDE = "DROP_OFF_LATITUDE";
  public final static String DROP_OFF_LONGITUDE = "DROP_OFF_LONGITUDE";
  public final static String PICK_UP_LATITUDE_FIELD = "taxiReservation.pickupLocation.geo.latitude";
  public final static String PICK_UP_LONGITUDE_FIELD = "taxiReservation.pickupLocation.geo.longitude";
  public final static String DROP_OFF_LATITUDE_FIELD = "taxiReservation.dropoffLocation.geo.latitude";
  public final static String DROP_OFF_LONGITUDE_FIELD = "taxiReservation.dropoffLocation.geo.longitude";


  public final static String ENTITY_FIELD_IDENTIFIER = "identifier";
  public final static String ENTITY_FIELD_NAME = "name";
  public final static String ENTITY_ITEM_LIST = "itemListElement";
  public final static String ENTITY_URL = "url";

  public final static int MAX_RESULTS = 5;

  //Activity result code
  public final static int SELECT_ADDRESS = 0x1;
  public final static int INPUT_PARAMETER = 0x10;
  public final static int INPUT_URL = 0x100;


}
