package Interfacce;
//------> interfaccia che setta i metodi della riproduzione per audio e video <------
public interface Riproducibile {
    public String play();

    public void abbassaVolume();
    public void alzaVolume();
    public String strVolume();
}
