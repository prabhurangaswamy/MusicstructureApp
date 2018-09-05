package com.example.prabhu.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle(getResources().getString(R.string.artist));

        Button artistButton = (Button) findViewById(R.id.button_artist);
        Button albumButton = (Button) findViewById(R.id.button_album);
        Button genreButton = (Button) findViewById(R.id.button_genre);
        Button playlistButton = (Button) findViewById(R.id.button_playlist);

        artistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentAlbum = new Intent(view.getContext(), ArtistActivity.class);
                startActivity(intentAlbum);
            }
        });

        albumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentArtist = new Intent(view.getContext(), AlbumActivity.class);
                startActivity(intentArtist);
            }
        });

        genreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentGenre = new Intent(view.getContext(), GenreActivity.class);
                startActivity(intentGenre);
            }
        });

        playlistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentPlaylist = new Intent(view.getContext(), PlaylistActivity.class);
                startActivity(intentPlaylist);
            }
        });
    }
}
