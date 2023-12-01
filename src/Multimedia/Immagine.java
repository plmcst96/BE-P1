package Multimedia;

import Interfacce.Luminosita;

public class Immagine extends ElementoMultimediale implements Luminosita {
    private int lum;
    public Immagine(String titolo, int lum) {
        super(titolo);
        this.lum = lum;
    }

    public String show(){
        System.out.println(this.getTitolo() + " - " + this.strLuminosita());
        return tipoMultimediale();
    }

    @Override
    public String tipoMultimediale() {
        return "immagine";
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
}
