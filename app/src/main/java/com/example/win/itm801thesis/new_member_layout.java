package com.example.win.itm801thesis;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

/**
 * Created by win on 12/2/2560.
 */

public class new_member_layout extends Activity {
    private boolean ib_edit = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.new_member_layout);
        EditText editTextFname = (EditText) findViewById(R.id.editText_fname);
        EditText editTextLname = (EditText) findViewById(R.id.editText_lname);
        EditText editTextUser = (EditText) findViewById(R.id.editText_user);
        EditText editTextPassword = (EditText) findViewById(R.id.editText_password);
        EditText editTextRepassword = (EditText) findViewById(R.id.editText_repassword);

        Button buttonSave = (Button) findViewById(R.id.button_user_save);
        Button buttonClear = (Button) findViewById(R.id.button_user_clear);

    }

    @Override
    public void onContentChanged() {
        super.onContentChanged();
        ib_edit = true;

    } //onContentChanged


//    public void onSaveProcess {
//
//    } //onSaveProcess จัดกเ็บ

    private void onClearScreenProcess
    {
        if (ib_edit == true) {
            AlertDialog.Builder dialog = new AlertDialog.Builder(this);
            dialog.setTitle("Clear");
            dialog.setCancelable(true);
            dialog.setMessage("Do you want to Cancel");
            dialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                        // set text ทุกตัวให้เป็น่าว่าง
                        // set text ทุกตัวให้เป็น่าว่าง
                }
            }) ;


            dialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            dialog.show();

      }

    } //onClearScreenProcess ล้างหน้จอ


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("Exit");
        dialog.setCancelable(true);
        dialog.setMessage("Do you want to Exit?");
        dialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        }) ;


        dialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
        public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        dialog.show();
    }



}
