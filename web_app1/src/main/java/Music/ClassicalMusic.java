package Music;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component("ClassMusicBean")
public class ClassicalMusic implements Music {
    //private Music.Music.ClassicalMusic(){}

    /*public static Music.Music.ClassicalMusic factoryMethod(){
        return new Music.Music.ClassicalMusic();
    }*/
    private List songs = Arrays.asList("Classic song 1", "Ckassic song 2", "Classic song 3");

    public String getSong() {
        return songs.get((int)(Math.random()*3)).toString();
    }
    @PostConstruct
    private void doInit(){
        System.out.println("Initialization...");
    }
    @PreDestroy
    private void doDestroy(){
        System.out.println("Drestroying...");
    }
}
