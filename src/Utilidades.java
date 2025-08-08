import java.util.ArrayList;
import java.util.Scanner;

public class Utilidades {

    Scanner lectura = new Scanner(System.in);

    public int imprimeMenu(){
        String menuOpciones = """
                Sea bienvenido/a al Conversor de Moneda +)
                1) Dolar =>> Peso argentino
                2) Peso argentino =>> Dolar
                3) Dolar =>> Real brasileno
                4) Real brasileno =>> Dolar
                5) Dolar =>> Peso colombiano
                6) Peso colombiano =>> Dolar
                7) Salir
                Elija una opcion valida:""";
        System.out.println(menuOpciones);

        var opcion = lectura.nextInt();
        return opcion;

    }

    public int validaInstruccion(int opcion){

        int opcionValida;
        if(opcion >= 1 & opcion <= 6){
            System.out.println("Se selecciono la opcion  " + opcion);
            opcionValida = opcion;
        } else if(opcion == 7 ) {
            System.out.println("Gracias por utilizar el conversor, fin de la ejecucion!");
            opcionValida = opcion;
        } else {
            System.out.println("Opcion no valida");
            opcionValida = 0;
        }
        return opcionValida;

    }

    public ArrayList<String> defineMonedas(int opcionValida){
        ArrayList<String> monedas = new ArrayList<>();
        switch(opcionValida){
            case 1:
                monedas.add("USD");
                monedas.add("ARS");
            case 2:
                monedas.add("ARS");
                monedas.add("USD");
            case 3:
                monedas.add("USD");
                monedas.add("BRL");
            case 4:
                monedas.add("BRL");
                monedas.add("USD");
            case 5:
                monedas.add("USD");
                monedas.add("COP");
            case 6:
                monedas.add("COP");
                monedas.add("USD");
            default:
                monedas.add("USD");
                monedas.add("USD");

        }
        System.out.println("********************************");
        if (monedas.get(0) != "") {
            System.out.println("Conversion entre " + monedas.get(0) + " y " + monedas.get(1));
        }
        return monedas;

    }

    public double recibeMonto(){
        System.out.println("Ingrese el valor que desea convertir: ");
        var monto = lectura.nextDouble();
        return monto;

    }


}
