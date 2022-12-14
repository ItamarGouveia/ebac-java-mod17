package src.lista;

import src.lista.Audi.RoadsterTTS;
import src.lista.Audi.SedanA4;
import src.lista.Audi.SportbackA3;
import src.lista.Chevrolet.Camaro;
import src.lista.Chevrolet.Spin;
import src.lista.Jeep.Commander;
import src.lista.Jeep.Renegade;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        List<Carro> carros = new ArrayList<>();

        carros.add(new SportbackA3());
        carros.add(new SedanA4());
        carros.add(new RoadsterTTS());

        //Chevrolet
        carros.add(new Camaro());
        carros.add(new Spin());

        //Jeep
        carros.add(new Commander());
        carros.add(new Renegade());

        listarCarros(carros);
        listaExtrendsCarro(carros);
        imprimirGeneric(carros);
    }

    public static void listarCarros(List<Carro> carros ){
        System.out.println("Imprimindo uma lista de carros");
        for(Carro carro : carros){
            System.out.println(carro.getMarca() + "-" + carro.getModelo());
        }
        System.out.println("");
    }

    public static void listaExtrendsCarro(List<? extends Carro> carros){
        System.out.println("Imprimindo a lista de classes que extendem carro");
        for(Carro carro : carros){
            System.out.println(carro.getMarca() + "-" + carro.getModelo());
        }
        System.out.println("");
    }

    public static void imprimirGeneric(List<?> lista){
        System.out.println("Método que funcionará para imprimir lista de <qualquer coisa>");
        for(Object st : lista ){
            System.out.println("Qualquer coisa: " + st);
        }
    }
}
