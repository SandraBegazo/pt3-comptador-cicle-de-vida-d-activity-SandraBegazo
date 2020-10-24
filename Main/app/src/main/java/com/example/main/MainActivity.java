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

        Toast.makeText(this, "OnCreate", Toast.LENGTH_SHORT).show();


    }
    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show();
    }

     @Override
     protected void onRestart() {
         super.onRestart();
         Toast.makeText(this, "OnRestart", Toast.LENGTH_SHORT).show();
     }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "OnDestroy", Toast.LENGTH_SHORT).show();
    }
}