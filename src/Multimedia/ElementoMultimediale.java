package Multimedia;

public abstract class  ElementoMultimediale {
    private final String titolo;

    public ElementoMultimediale(String titolo){
        this.titolo = titolo;
    }

    public String getTitolo() {
        return titolo;
    }

    public abstract String tipoMultimediale();
}
