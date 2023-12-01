package Multimedia;

import Interfacce.Luminosita;
import Interfacce.Riproducibile;

public class Video extends RegistrazioneAudio implements Luminosita, Riproducibile {
    private int lum;

    public Video(String titolo, int durata, int lum) {
        super(titolo, durata);
        this.lum = lum;
    }

    @Override
    public String play(){
        for (int i = 0; i < this.durata; i++)
            System.out.println(this.getTitolo() + " - " + this.strVolume() + " - " + this.strLuminosita());
        return this.tipoMultimediale();
    }

    @Override
    public void aumentaLuminosita() {
        if (this.lum < 10) this.lum++;
        else System.out.println("La luminosità è al massimo");
    }

    @Override
    public void abbassaLuminosita() {
        if (this.lum > 0) this.lum--;
        else System.out.println("La luminosità è al minimo");
    }

    @Override
    public String strLuminosita() {
        return "*".repeat(Math.max(0, this.lum));
    }

    @Override
    public String tipoMultimediale(){
        return "video";
    }


}