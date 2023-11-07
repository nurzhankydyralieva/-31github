package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class MusicPlayer {
    private Music music;
    private Music music1;


    public MusicPlayer(@Qualifier("rockMusic") Music music, @Qualifier("classicMusic") Music music1) {
        this.music = music;
        this.music1 = music1;
    }

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer() {
    }

    public String playMusic() {
        return "Play music " + music.getSong() + ", " + music1.getSong();
    }
}
