package src.lista.Chevrolet;

public class Spin extends Chevrolet{
    @Override
    public String getModelo() {
        return "Spin";
    }

    @Override
    public String getMarca() {
        return super.getMarca();
    }
}
