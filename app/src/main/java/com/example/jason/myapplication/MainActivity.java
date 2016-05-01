package com.example.jason.myapplication;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    //final Context context = this;
    private Button login;
    private Button clear;
    private EditText username, password, repw;
    private TextView usn, pwd, rpwd;
    String usname;
    String pw;
    String repwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = (Button)findViewById(R.id.button);
        clear = (Button)findViewById(R.id.button2);
        username = (EditText)findViewById(R.id.editText);
        password = (EditText)findViewById(R.id.editText2);
        repw = (EditText)findViewById(R.id.editText3);
        usn = (TextView)findViewById(R.id.textView);
        pwd = (TextView)findViewById(R.id.textView2);
        rpwd = (TextView)findViewById(R.id.textView3);
        //login.setOnClickListener(loginlistener);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);

                usname = username.getText().toString().trim();
                pw = password.getText().toString().trim();
                repwd = repw.getText().toString().trim();

                if(usname.matches(""))
                {
                    //usn.setText("usname blank");
                    dialog.setTitle("Login Error");
                    dialog.setMessage("Username Blank");
                }
                else if(pw.matches(""))
                {
                    dialog.setTitle("Login Error");
                    dialog.setMessage("password Blank");
                }
                else if(repwd.matches(""))
                {
                    dialog.setTitle("Login Error");
                    dialog.setMessage("rePassword Blank");
                }
                else if(!pw.matches(repwd))
                {
                    dialog.setTitle("Login Error");
                    dialog.setMessage("Password not match Re-Password");
                }
                else
                {
                    dialog.setTitle("Login OK");
                    dialog.setMessage("WELCOME");
                }
                dialog.show();
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                username.setText("");
                password.setText("");
                repw.setText("");
            }
        });
    }
}
