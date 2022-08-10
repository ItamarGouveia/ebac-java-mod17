package src.lista.Audi;

import src.lista.Carro;

public abstract class Audi implements Carro {
    @Override
    public String getMarca() {
        return "Audi";
    }
}
