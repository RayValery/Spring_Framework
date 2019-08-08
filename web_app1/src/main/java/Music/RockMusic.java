package Music;

import Music.Music;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class RockMusic implements Music {
    private List<String> songs = Arrays.asList("Rock song 1", "Rock song 2", "Rock song 3");

    public String getSong() {
        return songs.get((int)(Math.random()*3)).toString();
    }
}
