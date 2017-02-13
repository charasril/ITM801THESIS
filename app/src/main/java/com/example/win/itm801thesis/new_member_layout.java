package com.example.win.itm801thesis;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
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
//    String  textEditFname,textEditLname,textEditUser,textEditPassword,textEditRepassword;
    private EditText editTextFname, editTextLname,editTextUser,editTextPassword,editTextRepassword;
    private Button buttonSave, buttonClear,buttonClose ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.new_member_layout);
        editTextFname = (EditText) findViewById(R.id.editText_fname);
        editTextFname.setOnEditorActionListener(null);

        editTextLname = (EditText) findViewById(R.id.editText_lname);
        editTextLname.setOnEditorActionListener(null);

        editTextUser = (EditText) findViewById(R.id.editText_user);
        editTextUser.setOnEditorActionListener(null);

        editTextPassword = (EditText) findViewById(R.id.editText_password);
        editTextPassword.setOnEditorActionListener(null);

        editTextRepassword = (EditText) findViewById(R.id.editText_repassword);
        editTextRepassword.setOnEditorActionListener(null);

        buttonSave = (Button) findViewById(R.id.button_user_save);
        buttonSave.setOnClickListener(this);

        buttonClear = (Button) findViewById(R.id.button_user_clear);
        buttonClear.setOnClickListener(this);

        buttonClose = (Button) findViewById(R.id.button_user_exit);
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




        }
    } //onSaveProcess จัดกเ็บ



    private void onClearScreenProcess() {
        if (ib_edit == true) {
            msgChoice = msgDialog(this,"Clear","Do you want to Cancel?",2);
            if (msgChoice == 1) {
                editTextFname.setText(null);
                editTextLname.setText(null);
                editTextPassword.setText(null);
                editTextUser.setText(null);
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

    private Integer msgDialog(Activity msgActivity, String msgHeader, String msgQuestion, int msgButton) {
            AlertDialog.Builder dialog = new AlertDialog.Builder(msgActivity);
            dialog.setTitle(msgHeader);
            dialog.setCancelable(true);
            dialog.setMessage(msgQuestion);
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
            return msgReturn;
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
