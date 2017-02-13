package com.example.win.itm801thesis;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by win on 30/1/2560.
 */

public class MyOpenHelper extends SQLiteOpenHelper{
    //Explicit
    private Context context;
    public static final String database_name = "ITM801TRAFFIC.db";
    private static final int database_version = 1;
    private String userName;
    private static final int userNum = 0;


//    private static final String userTABLE_WayPointHist = "create table userWayPointHist (" +
//            "_id integer pimary key," +
//            "OriginFName text, " +
//            "OriginLName text, " +
//            "OriginLat text," +
//            "OriginLng text," +
//            "DetinationName text," +
//            "DestinationLat text," +
//            "DestinationLng text," +
//            "Way text);";

    private static final String userTABLE = "create table userTABLE (" +
            "_id integer pimary key," +
            "userFName text, " +
            "userLName text, " +
            "userName text, " +
            "userPassword text, " +
            "userRePassword text);";


    public MyOpenHelper(Context context) {
        super(context,database_name,null,database_version);
        this.context = context;
    } //Constructor

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(userTABLE);
//        db.execSQL(userTABLE_WayPointHist);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

//    public void onSeach(SQLiteDatabase db,Context context){
//
//       this.context = context;
//       String seachUser = "select count(*) from userTABLE where userName = "+context+";";
//        db.execSQL(seachUser);
//
//    }
}//Main Class
