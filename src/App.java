import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        
            Primitiva primitiva = new Primitiva();
            Set<Integer> boleto = new TreeSet<>(); //Boleto participante a comprobar
            System.out.println("Introduce los 6 números del boleto a comprobar");
            try (Scanner scan = new Scanner(System.in)) {
            while (boleto.size()<6) {  // bucle para introducir los 6 números del boleto
                try {
                    int num = Integer.parseInt(scan.nextLine());
                    if (num < 1 || num>49){
                        System.out.println("El número debe estar entre 1 y 49");
                    }
                    else if (boleto.contains(num)){
                        System.out.println("Número ya introducido");
                    }
                    else {
                        boleto.add(num);
                    }
                }
                catch (NumberFormatException e){
                    System.out.println("Debes introducir un número válido");
                    
                }
            }
            
            primitiva.ComprobarBoleto(boleto);
            int aciertos = primitiva.ComprobarBoleto(boleto);
            System.out.println("\nBoleto ganador" + primitiva);
            System.out.println("\nBoleto del jugador" + boleto);
            System.out.println("\nHa tenido un total de "+ aciertos + " aciertos");
            if (aciertos <6){
                System.out.println("Sigues siendo pobre !Ánimo!");
            }
        }

    }
    
}
