package com.example.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView on_create_contj;
    TextView on_start_contj;
    TextView on_restart_contj;
    TextView on_resume_contj;
    TextView on_pause_contj;
    TextView on_stop_contj;
    TextView on_destroy_contj;

    int contadorCreate=0;
    int contadorStart=0;
    int contadorRestart=0;
    int contadorResume=0;
    int contadorPause=0;
    int contadorStop=0;
    int contadorDestroy=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        on_create_contj=(TextView)findViewById(R.id.on_create_cont);
        on_start_contj= (TextView)findViewById(R.id.on_start_cont);
        on_restart_contj=(TextView)findViewById(R.id.on_restart_cont);
        on_resume_contj=(TextView)findViewById(R.id.on_resume_cont);
        on_pause_contj=(TextView)findViewById(R.id.on_pause_cont);
        on_stop_contj=(TextView)findViewById(R.id.on_stop_cont);
        on_destroy_contj=(TextView)findViewById(R.id.on_destroy_cont);

        Toast.makeText(getApplicationContext(),getResources().getString(R.string.ToastOnCreate), Toast.LENGTH_SHORT).show();

        contadorCreate=contadorCreate+1;
        on_create_contj.setText(String.valueOf(contadorCreate));

    }
    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(getApplicationContext(),getResources().getString(R.string.ToastOnStart), Toast.LENGTH_SHORT).show();

        contadorStart=contadorStart+1;
        on_start_contj.setText(String.valueOf(contadorStart));
    }

     @Override
     protected void onRestart() {
         super.onRestart();
         Toast.makeText(getApplicationContext(),getResources().getString(R.string.ToastOnRestart), Toast.LENGTH_SHORT).show();

         contadorRestart=contadorRestart+1;
         on_restart_contj.setText(String.valueOf(contadorRestart));
     }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(),getResources().getString(R.string.ToastOnResume), Toast.LENGTH_SHORT).show();

        contadorResume=contadorResume+1;
        on_resume_contj.setText(String.valueOf(contadorResume));
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(),getResources().getString(R.string.ToastOnPause), Toast.LENGTH_SHORT).show();

        contadorPause=contadorPause+1;
        on_pause_contj.setText(String.valueOf(contadorPause));
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(),getResources().getString(R.string.ToastOnStop), Toast.LENGTH_SHORT).show();

        contadorStop=contadorStop+1;
        on_stop_contj.setText(String.valueOf(contadorStop));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),getResources().getString(R.string.ToastOnDestroy), Toast.LENGTH_SHORT).show();

        contadorDestroy=contadorDestroy+1;
        on_destroy_contj.setText(String.valueOf(contadorDestroy));
    }
}