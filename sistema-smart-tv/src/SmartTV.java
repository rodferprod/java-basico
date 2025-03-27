public class SmartTV {
    boolean ligada  = false;
    int     canal   = 1;
    int     volume  = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        if(canal > 0)
            canal--;
    }

    public void informarCanal(int novoCanal) {
        if(novoCanal > 0)
            canal = novoCanal;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        if(volume > 0)
            volume--;
    }
}
