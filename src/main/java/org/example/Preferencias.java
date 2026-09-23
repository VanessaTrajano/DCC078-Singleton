package org.example;

public class Preferencias {

    private Preferencias() {};
    private static Preferencias instance = new Preferencias();
    public static Preferencias getInstance() {
        return instance;
    }

    private boolean ehTemaClaro;
    private boolean modoOfflineAtivo;
    private int volume;

    public boolean getEhTemaClaro() {
        return ehTemaClaro;
    }

    public void setEhTemaClaro(boolean ehTemaClaro) {
        this.ehTemaClaro = ehTemaClaro;
    }

    public boolean getModoOfflineAtivo() {
        return modoOfflineAtivo;
    }

    public void setModoOfflineAtivo(boolean modoOfflineAtivo) {
        this.modoOfflineAtivo = modoOfflineAtivo;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}