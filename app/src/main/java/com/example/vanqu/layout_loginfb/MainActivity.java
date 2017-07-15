package com.example.vanqu.layout_loginfb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btn;
    EditText UserName,PassWord;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= (Button) findViewById(R.id.btnLogin);
        UserName= (EditText) findViewById(R.id.txtUserName);
        PassWord= (EditText) findViewById(R.id.txtPassWord);
    }

    public void Click(View view) {
        Toast.makeText(this,UserName.getText().toString()+" "+PassWord.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}
