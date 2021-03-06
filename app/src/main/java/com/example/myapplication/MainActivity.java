package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = (VideoView) findViewById(R.id.videoView);
        Uri uri = Uri.parse ("android.resource://" + getPackageName() + "/" + R.raw.video);
        videoView.setVideoURI(uri);
    }

@Override
    protected void onResume(){
        super.onResume();
        videoView.start();

}

}
