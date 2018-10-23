package com.kike.nutri.nutrilife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
import com.kike.nutri.nutrilife.Configs.PlayerConfig;

public class RutinasActivity extends YouTubeBaseActivity {

    YouTubePlayerView youTubePlayerView;
    Button btnPlay;

    YouTubePlayer.OnInitializedListener mOnInitializerListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rutinas);
        youTubePlayerView = findViewById(R.id.youtube_player);
        btnPlay = findViewById(R.id.btn_play);




        mOnInitializerListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("SEukS2YN9B8");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                youTubePlayerView.initialize(PlayerConfig.API_KEY,mOnInitializerListener);
            }
        });



    }
}
