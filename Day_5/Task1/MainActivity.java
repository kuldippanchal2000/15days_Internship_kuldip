package com.example.mydemo_intent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("onCreate called");
    }
    @override
protected void onStart(){
super.onStart();
Log.d("onStart called");
}
   @override
protected void onResume(){
super.onResume();
Log.d("onResume called");
}   @override
protected void onPause(){
super.onPause();
Log.d("onPause called");
}   @override
protected void onStop(){
super.onStop();
Log.d("onStop called");
}   @override
protected void onRestart(){
super.onRestart();
Log.d("onRestart called");
}   @override
protected void onDestroy(){
super.onDestroy();
Log.d("onDestroy called");
}

}
