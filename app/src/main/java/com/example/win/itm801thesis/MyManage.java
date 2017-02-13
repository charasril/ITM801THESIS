package com.example.win.itm801thesis;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by win on 30/1/2560.
 */

public class MyManage {

    //Explicit
    private Context context;
    private MyOpenHelper myOpenHelper;
    private SQLiteDatabase sqLiteDatabase;


    public MyManage(Context context) {
        this.context = context;

        myOpenHelper = new MyOpenHelper(context);
        sqLiteDatabase = myOpenHelper.getWritableDatabase();



    } //Constructor

} //Main Class
