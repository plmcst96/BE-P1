import Multimedia.ElementoMultimediale;
import Multimedia.Immagine;
import Multimedia.RegistrazioneAudio;
import Multimedia.Video;

import java.util.Scanner;

public class Main {

    static ElementoMultimediale[] arrMultmedia = new ElementoMultimediale[5];
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        setMultimedia();
        input.close();

        //---------------> test risultato classi <---------------

      /*  Video video = new Video("elf", 5, 8);
        System.out.println(video.play());

        RegistrazioneAudio audio = new RegistrazioneAudio("e poi", 6);
        System.out.println(audio.play());

        Immagine img = new Immagine("me", 8);
        System.out.println(img.show());*/


    }

    public static void setMultimedia() {
        for (int i = 0; i < arrMultmedia.length; i++) {
            String selezione;
            String titolo;
            int durata;
            int lum;

            System.out.println("Crea il tuo file multimediale!");
            do {
                System.out.println("Seleziona il tipo di file multimediale");
                System.out.println("1 - Immagine");
                System.out.println("2 - Audio");
                System.out.println("3 - Video");
                System.out.println("0 - Esci");
                selezione = input.nextLine();

            } while (!selezione.matches("[0123]"));
            if (selezione.equals("0")){
                System.out.println("Fine esecuzione!");
                break;
            }
            System.out.println("Scrivi titolo per il tuo file multimediale!");
            titolo = input.nextLine();

            switch (selezione) {
                case "1": {
                    System.out.println("Scegli la luminosità dell'immagine");
                    lum = input.nextInt();
                    arrMultmedia[i] = new Immagine(titolo, lum);
                    ((Immagine) arrMultmedia[i]).show();
                    break;
                }
                case "2": {
                    System.out.println("Scegli la durata del tuo file audio");
                    durata = input.nextInt();
                    arrMultmedia[i] = new RegistrazioneAudio(titolo, durata);
                    ((RegistrazioneAudio) arrMultmedia[i]).play();
                    break;
                }
                case "3": {
                    System.out.println("Scegli la durata del tuo file video");
                    lum = input.nextInt();
                    System.out.println("Scegli la luminosità del tuo file video");
                    durata = input.nextInt();
                    arrMultmedia[i] = new Video(titolo, durata, lum);
                    ((Video) arrMultmedia[i]).play();
                    break;
                }
                default:
                    System.out.println("è stato selezionato un numero diverso da 3");
            }
        }
    }
}