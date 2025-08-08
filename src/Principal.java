import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Conversor de monedas");

        ConsultaTasas consulta = new ConsultaTasas();

        //System.out.println(tasas);
        //System.out.println(tasas.conversion_rates());
        //System.out.println(tasas.conversion_rates().size());

        while(true){
            Utilidades utilidades = new Utilidades();
            int opcion = utilidades.validaInstruccion(utilidades.imprimeMenu());
            if (opcion == 7){
                break;
            }
            if (opcion !=0 ){
                ArrayList<String> monedas = utilidades.defineMonedas(opcion);
                //System.out.println("Ingrese monto a convertir");

                TasasConversion tasas = consulta.tasas(monedas.getFirst());
                //System.out.println(tasas);
                //System.out.println(tasas.conversion_rates().size());
                System.out.println(tasas.conversion_rates().get(monedas.getFirst()) + " " + tasas.base_code() +
                        " equivale a "
                        + tasas.conversion_rates().get(monedas.get(1)) + " " + monedas.get(1));

                double monto = utilidades.recibeMonto();
                Convierte convierte = new Convierte(tasas.conversion_rates().get(monedas.getFirst()),
                        tasas.conversion_rates().get(monedas.get(1)), monto);
                double montoConvertido = convierte.convertir(convierte);

                System.out.println("El valor de " + monto + " [" + tasas.base_code() +
                        "] corresponde a el valor final de =>>> "
                        + montoConvertido + " [" + monedas.get(1) + "]");


            }
        }



    }
}
