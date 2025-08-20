package com.spotify.musicapp.spotify;

public class Spotify {
    private int musicId;
    private  String musicLanguage;
    private String musicType;

    public int getMusicId() {
        return musicId;
    }

    public String getMusicLanguage() {
        return musicLanguage;
    }

    public String getMusicType() {
        return musicType;
    }

    public void setMusicId(int musicId) {
        this.musicId = musicId;
    }

    public void setMusicLanguage(String musicLanguage) {
        this.musicLanguage = musicLanguage;
    }

    public void setMusicType(String musicType) {
        this.musicType = musicType;
    }
}
