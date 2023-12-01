import Multimedia.RegistrazioneAudio;
import Multimedia.Video;

public class Main {
    public static void main(String[] args) {
     Video video = new Video("elf", 5, 8);
        System.out.println(video.play());

        RegistrazioneAudio audio = new RegistrazioneAudio("e poi", 6);
        System.out.println(audio.play());


    }
}