package com.practica.bank;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.practica.bank.dialogs.LoginDialog;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_bankomats_list).setOnClickListener(this);
        findViewById(R.id.btn_currency).setOnClickListener(this);
        findViewById(R.id.btn_login).setOnClickListener(this);
        TextView date = findViewById(R.id.current_date);
        date.setText(new SimpleDateFormat("dd.MM.yyyy").format(new Date()));
        
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_bankomats_list:
                Intent intent = new Intent(this, HomeActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_currency:
                intent = new Intent(this, CurrencyActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_login:
                LoginDialog loginDialog = new LoginDialog(this) {
                    @Override
                    public void run(String login, String password) {

                    }
                };
                loginDialog.show();
                //loginDialog.show(getSupportFragmentManager(),null);
//                intent = new Intent(this,HomeActivity.class);
//                startActivity(intent);
                break;
        }

    }
}