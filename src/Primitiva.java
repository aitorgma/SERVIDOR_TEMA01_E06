import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Primitiva {
private final Set<Integer> numSorteo;

//Constructor para generar los números del sorteo
public Primitiva (){
    numSorteo = new TreeSet<>(); // Utilizamos TreeSet para guadarlos ordenados y sin duplicados
    Random random = new Random(); //generar nº aleatorio

    while (numSorteo.size() <6){

        int num= random.nextInt(49) + 1;  // Genera número random entre 1 y 49
        numSorteo.add(num); //Se añade sin repetir por el TreeSet
    }

}
// Método para comprobar el boleto
public int ComprobarBoleto (Set<Integer> boleto) {
    int aciertos= 0;

    for (int num : boleto){
        if (numSorteo.contains(num)) {
            aciertos++;

        }
    }
    return aciertos;
}

public void mostrarSorteo(){
    System.out.println("Los numeros ganadores son: " + numSorteo);
}

//Getter números sorteo
    public Set<Integer> getNumSorteo() {
        return this.numSorteo;
    }


    @Override  //Mostrar los números en el terminal
    public String toString() {
        return numSorteo.toString();
    }


}
