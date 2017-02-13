package com.example.win.itm801thesis;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.VisibleForTesting;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
//import android.view.

/**
 * Created by win on 12/2/2560.
 */

public class new_member_layout extends Activity implements View.OnClickListener {
    private boolean ib_edit = false;
    private Integer msgReturn ,msgChoice;
    String  textEditFname,textEditLname,textEditUser,textEditPassword,textEditRepassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.new_member_layout);
        EditText editTextFname = (EditText) findViewById(R.id.editText_fname);
        editTextFname.setOnEditorActionListener(null);

        EditText editTextLname = (EditText) findViewById(R.id.editText_lname);
        editTextLname.setOnEditorActionListener(null);

        EditText editTextUser = (EditText) findViewById(R.id.editText_user);
        editTextUser.setOnEditorActionListener(null);

        EditText editTextPassword = (EditText) findViewById(R.id.editText_password);
        editTextPassword.setOnEditorActionListener(null);

        EditText editTextRepassword = (EditText) findViewById(R.id.editText_repassword);
        editTextRepassword.setOnEditorActionListener(null);

        Button buttonSave = (Button) findViewById(R.id.button_user_save);
        buttonSave.setOnClickListener(this);

        Button buttonClear = (Button) findViewById(R.id.button_user_clear);
        buttonClear.setOnClickListener(this);

        Button buttonClose = (Button) findViewById(R.id.button_user_exit);
        buttonClose.setOnClickListener(this);

        editTextFname.setFocusable(true);
        ib_edit = false;
    }

    @Override
    public void onContentChanged() {
        super.onContentChanged();
        ib_edit = true;
    } //onContentChanged ตรวจสอบีการ Key ข้อมูล


    private void onSaveProcess () {
        msgChoice = msgDialog(this,"Save","Do you want to Save New User",2);
        if (msgChoice ==1) {

//            textEditFname    = ;
            textEditLname    = this.textEditLname;
            textEditUser     = this.textEditUser;
            textEditPassword = this.textEditPassword;



        }
    } //onSaveProcess จัดกเ็บ



    private void onClearScreenProcess() {
        if (ib_edit == true) {
            msgChoice = msgDialog(this,"Clear","Do you want to Cancel?",2);
            if (msgChoice == 1) {
                EditText editTextFname = (EditText) findViewById(R.id.editText_fname);
                editTextFname.setText(null);

                EditText editTextLname = (EditText) findViewById(R.id.editText_lname);
                editTextLname.setText(null);

                EditText editTextPassword = (EditText) findViewById(R.id.editText_password);
                editTextPassword.setText(null);

                EditText editTextUser = (EditText) findViewById(R.id.editText_user);
                editTextUser.setText(null);

                EditText editTextRepassword = (EditText) findViewById(R.id.editText_repassword);
                editTextFname.setText(null);

                ib_edit = false;
                editTextFname.setFocusable(true);

            }
      }

    } //onClearScreenProcess ล้างหน้จอ



    @Override
    public void onBackPressed() {
        super.onBackPressed();

        msgDialog(this,"Exit","Do you want to Exit?",2);


    } //onBackPressed
    private void onExit() {

        if (ib_edit == true) {
            msgChoice = msgDialog(this,"Close","Do you want to Close?",2);
            if (msgChoice ==1) {
                finish();
            }
        }

    } //onExit

    private Integer msgDialog(new_member_layout new_member_layout, String save, String s, int i) {
            AlertDialog.Builder dialog = new AlertDialog.Builder(this);
            dialog.setTitle("Clear");
            dialog.setCancelable(true);
            dialog.setMessage("Do you want to Cancel");
            dialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    msgReturn = which;
                }
            }) ;


            dialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    msgReturn = which;
                }
            });
            dialog.show();

    } //msgDialog

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id){
            case R.id.button_user_save :
                onSaveProcess();
                break;
            case R.id.button_user_clear :
                onClearScreenProcess();
                break;
            case R.id.button_user_exit :
                onExit();
                break;

        }

    }


}
