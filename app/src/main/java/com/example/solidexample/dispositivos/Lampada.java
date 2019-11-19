package com.example.solidexample.dispositivos;

public class Lampada implements IDispositivo{
    public boolean ligado;

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    @Override
    public void acionar() {
        if(!this.ligado){
            this.ligar();
        }else{
            this.desligar();
        }
    }
    @Override
    public void ligar() {
        //....
    }

    @Override
    public void desligar() {
        //....
    }
}
