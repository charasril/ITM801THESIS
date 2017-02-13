package com.example.win.itm801thesis;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by win on 30/1/2560.
 */

public class MyOpenHelperWayPoint extends SQLiteOpenHelper{
    //Explicit
    private Context context;
    public static final String database_name = "ITM801TRAFFIC.db";
    private static final int database_version = 1;
    private String userName;
    private static final int userNum = 0;


    private static final String userTABLE_WayPointHist = "create table userWayPointHist (" +
            "_id integer pimary key," +
            "OriginFName text, " +
            "OriginLName text, " +
            "OriginLat text," +
            "OriginLng text," +
            "DetinationName text," +
            "DestinationLat text," +
            "DestinationLng text," +
            "Way text);";



    public MyOpenHelperWayPoint(Context context) {
        super(context,database_name,null,database_version);
        this.context = context;
    } //Constructor

    @Override
    public void onCreate(SQLiteDatabase db) {
         db.execSQL(userTABLE_WayPointHist);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


}//Main Class
