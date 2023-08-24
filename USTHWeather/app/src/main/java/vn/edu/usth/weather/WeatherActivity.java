package vn.edu.usth.weather;
import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
public class WeatherActivity extends AppCompatActivity {
    private static String TAG = "WeatherActivity";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.i(TAG, "onCreate: This is a log message.");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG, "onResume: This is a log message.");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: This is a log message.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: This is a log message.");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG, "onResume: This is a log message.");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onResume: This is a log message.");
    }
}






