package src.lista.Jeep;

public class Renegade extends Jeep {
    @Override
    public String getModelo() {
        return "Renegade";
    }

    @Override
    public String getMarca() {
        return super.getMarca();
    }
}
