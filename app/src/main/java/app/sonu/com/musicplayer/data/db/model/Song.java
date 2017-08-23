package app.sonu.com.musicplayer.data.db.model;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;

import app.sonu.com.musicplayer.mediaplayernew.musicsource.MusicProviderSource;

/**
 * Created by sonu on 1/7/17.
 */

public class Song {

    private int queuePosition;
    private int songId;
    private String title;
    private String artist;
    private String album;
    private int duration;
    private String path;
    private String composer;

    public Song(MediaBrowserCompat.MediaItem item) {
        MediaDescriptionCompat description
            = item.getDescription();

        Bundle extras = description.getExtras();

        this.songId = 1;
        this.title = item.getDescription().getTitle().toString();
        this.artist = extras.getString(MediaMetadataCompat.METADATA_KEY_ARTIST);
        this.album = extras.getString(MediaMetadataCompat.METADATA_KEY_ALBUM);
        this.duration = (int) extras.getLong(MediaMetadataCompat.METADATA_KEY_DURATION);
        this.path = extras.getString(MusicProviderSource.CUSTOM_METADATA_KEY_TRACK_SOURCE);
        this.composer = null;
    }

    public Song(Cursor cursor) {
        this.songId = Integer.parseInt(cursor.getString(0));
        this.title = cursor.getString(1);
        this.artist = cursor.getString(2);
        this.album = cursor.getString(3);
        this.duration = Integer.parseInt(cursor.getString(4));
        this.path = cursor.getString(5);
        this.composer = cursor.getString(6);
    }

    public int getQueuePosition() {
        return queuePosition;
    }

    public void setQueuePosition(int queuePosition) {
        this.queuePosition = queuePosition;
    }

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    @Override
    public String toString() {
        return "Song{" +
                "songId=" + songId +
                ", title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", album='" + album + '\'' +
                ", duration=" + duration +
                ", path='" + path + '\'' +
                ", composer='" + composer + '\'' +
                '}';
    }
}
