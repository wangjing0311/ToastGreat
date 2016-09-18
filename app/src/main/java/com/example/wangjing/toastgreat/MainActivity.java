package com.example.wangjing.toastgreat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.sdsmdg.tastytoast.TastyToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Download(View v){
        TastyToast.makeText(getApplicationContext(), "Download", TastyToast.LENGTH_LONG, TastyToast.SUCCESS);
    }
    public void Warning(View v){
        TastyToast.makeText(getApplicationContext(), "Warning", TastyToast.LENGTH_LONG, TastyToast.WARNING);
    }
    public void Error(View v){
        TastyToast.makeText(getApplicationContext(), "Error", TastyToast.LENGTH_LONG, TastyToast.ERROR);
    }
    public void Info(View v){
        TastyToast.makeText(getApplicationContext(), "Info", TastyToast.LENGTH_LONG, TastyToast.INFO);
    }
    public void Default(View v){
        TastyToast.makeText(getApplicationContext(), "Default", TastyToast.LENGTH_LONG, TastyToast.DEFAULT);
    }
    public void Confusion(View v){
        TastyToast.makeText(getApplicationContext(), "Confusion", TastyToast.LENGTH_LONG, TastyToast.DEFAULT);
    }
}
