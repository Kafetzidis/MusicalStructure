package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import static com.example.android.musicalstructure.R.id.playlists;

public class PlaylistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);

        ImageButton albums = (ImageButton) findViewById(R.id.albums);
        ImageButton songs = (ImageButton) findViewById(R.id.songs);
        ImageButton artists = (ImageButton) findViewById(R.id.artists);
        ImageButton nowPlaying = (ImageButton) findViewById(R.id.now_playing);

        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(PlaylistsActivity.this, AlbumsActivity.class);
                startActivity(albumsIntent);
            }
        });

        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(PlaylistsActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }
        });

        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(PlaylistsActivity.this, ArtistsActivity.class);
                startActivity(artistsIntent);
            }
        });

        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(PlaylistsActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });
    }
}
