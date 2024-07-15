//import java.util.ArrayList;
import java.util.List;

import Ejercicio.EjercicioDos;
//import Ejercicio.EjercicioUno;

public class App {
    public static void main(String[] args) throws Exception {

        EjercicioDos ejerDos = new EjercicioDos();

        int n1 = 1;
        List<String> result1 = ejerDos.generateParenthesis(n1);
        System.out.println("Resolución del Ejercicio Dos con 1 de entrada:");
        System.out.println(result1);

        int n2 = 3;
        List<String> result2 = ejerDos.generateParenthesis(n2);
        System.out.println("Resolución del Ejercicio Dos con 3 de entrada:");
        System.out.println(result2);
    }
}
