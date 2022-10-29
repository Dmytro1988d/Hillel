package HW18;

public class Main {
    public static void main(String[] args) {
        MusicStyles[] musicgroup = new MusicStyles[3];

        musicgroup[0] = new ClassicMusic();
        musicgroup[1] = new PopMusic();
        musicgroup[2] = new RockMusic();
        for (MusicStyles u : musicgroup
        ) {
            u.playMusic();

        }
    }
}
