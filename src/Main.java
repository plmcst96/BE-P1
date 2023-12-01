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
    }

    public static void setMultimedia() {
        // ------> qui creo un ciclo per l'array <-------

        for (int i = 0; i < arrMultmedia.length; i++) {
            String selezione;
            String titolo;
            String durata;
            String lum;

            System.out.println("Crea il tuo file multimediale!");

            // ------> qui col do/while ciclo le possibili casistiche in base alla scelta dell'utente <-------

            do {
                System.out.println("Seleziona il tipo di file multimediale");
                System.out.println("1 - Immagine");
                System.out.println("2 - Audio");
                System.out.println("3 - Video");
                System.out.println("0 - Esci");
                selezione = input.nextLine();

                //-------> Errore se l'utente non preme i numeri accettati <------

                if (!selezione.matches("[0123]")) {
                    System.out.println("Errore: Inserire un numero compreso tra 0 e 3.");
                }

            } while (!selezione.matches("[0123]"));

            //------> se l'utente preme 0 esce dal ciclo <------

            if (selezione.equals("0")){
                System.out.println("Fine esecuzione!");
                break;
            }
            System.out.println("Scrivi titolo per il tuo file multimediale!");
            titolo = input.nextLine();

            //------> vari condizioni possibili in base alla scelta dell'utente <------

            switch (selezione) {
                case "1": {
                    System.out.println("Scegli la luminosità dell'immagine");
                    lum = input.nextLine();
                    arrMultmedia[i] = new Immagine(titolo, Integer.parseInt(lum));
                    ((Immagine) arrMultmedia[i]).show();
                    break;
                }
                case "2": {
                    System.out.println("Scegli la durata del tuo file audio");
                    durata = input.nextLine();
                    arrMultmedia[i] = new RegistrazioneAudio(titolo, Integer.parseInt(durata));
                    ((RegistrazioneAudio) arrMultmedia[i]).play();
                    break;
                }
                case "3": {
                    System.out.println("Scegli la durata del tuo file video");
                    lum = input.nextLine();
                    System.out.println("Scegli la luminosità del tuo file video");
                    durata = input.nextLine();
                    arrMultmedia[i] = new Video(titolo, Integer.parseInt(durata), Integer.parseInt(lum));
                    ((Video) arrMultmedia[i]).play();
                    break;
                }
                default:
                    System.err.println("Errore: Selezione non valida.");
                    break;
            }
        }
    }
}