public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    // METODOS DE LIGAR E DESLIGAR A TELEVISÃO
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    // METODOS PARA AUMENTAR E DIMINUIR VOLUME
    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    // METODOS PARA AVANCAR E RETROCEDER O CANAL
    public void aumentarCanal (){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    // METODO PARA ESCOLHER O CANAL
    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }    


}
   