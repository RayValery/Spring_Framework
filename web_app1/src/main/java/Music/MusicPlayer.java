package Music;

import Music.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import static Music.MusicType.CLASSICAL_MUSIC;
import static Music.MusicType.ROCK_MUSIC;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    @Value("musicPlayer.name")
    private String name;
    @Value("musicPlayer.volume")
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
    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public MusicPlayer(){}


    public void playMusicList(MusicType musicType){
        if (musicType == CLASSICAL_MUSIC){
            System.out.println("Play "+ classicalMusic.getSong());
        }
        if (musicType == ROCK_MUSIC){
            System.out.println("Play "+ rockMusic.getSong());
        }
    }
}
