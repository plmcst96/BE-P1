package Multimedia;

import Interfacce.Riproducibile;

public class RegistrazioneAudio extends ElementoMultimediale implements Riproducibile {
    final int durata;
    private int volume;

    public RegistrazioneAudio(String titolo, int durata) {
        super(titolo);
        this.durata = durata;
        this.volume = 6;
    }


    @Override
    public void play() {
        for (int i = 0; i < this.durata; i++)
            System.out.println(this.getTitolo() + " - " + this.strVolume());

    }

    @Override
    public void abbassaVolume() {
        if (this.volume > 0) this.volume--;
        else System.out.println("Il volume è al minimo");
    }

    @Override
    public void alzaVolume() {
        if (this.volume < 10) this.volume++;
        else System.out.println("Il volume è al massimo");
    }

    @Override
    public String strVolume() {
        return "!".repeat(Math.max(0, this.volume));
    }

    @Override
    public String tipoMultimedia() {
        return "audio";
    }
}
