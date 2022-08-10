package src.lista.Jeep;

import src.lista.Carro;

public abstract class Jeep implements Carro {

    @Override
    public String getMarca() {
        return "Jeep";
    }
}
