package Music;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import static Music.MusicType.CLASSICAL_MUSIC;
import static Music.MusicType.ROCK_MUSIC;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusicList(CLASSICAL_MUSIC);
        musicPlayer.playMusicList(ROCK_MUSIC);



        context.close();
    }

}
