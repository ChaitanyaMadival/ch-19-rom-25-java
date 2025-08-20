package com.spotify.musicapp;

import com.spotify.musicapp.spotify.Spotify;

public class SpotifyRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Spotify music = new Spotify();

        music.setMusicId(1);
        music.setMusicLanguage("Kannada");
        music.setMusicType("Melody");

        int musicId = music.getMusicId();
        String musicLanguage = music.getMusicLanguage();
        String musicType = music.getMusicType();

        System.out.println("Music ID: "+musicId);
        System.out.println("Music Language: "+musicLanguage);
        System.out.println("Music Type:  "+musicType);

        System.out.println("main ended");
    }
}
