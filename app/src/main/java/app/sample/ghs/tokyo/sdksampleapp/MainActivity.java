package app.sample.ghs.tokyo.sdksampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import app.sample.ghs.tokyo.ghssamplesdk.GHSSDK;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GHSSDK.hello();
    }
}
