package com.campusdual.classroom;

public class Exercise04 {
    public static void main(String[] args) {
        //En el método main() se mostrarán ejemplos de cálculos matemáticos sin el uso de estructuras de control.
        // Desde este método se invocará a cada uno de los métodos restantes para hacer los mismos cálculos, pero utilizando
        //  estructuras de control. Es necesario comprobar que se obtienen los mismos resultados de ambas formas.

        System.out.println("Ejemplos de cálculos SIN estructuras de control:");
        System.out.println("Suma de los primeros 5 números: " + (1 + 2 + 3 + 4 + 5));
        System.out.println("Suma de los primeros 20 números pares: " + (2 + 4 + 6 + 8 + 10 + 12 + 14 + 16 + 18 + 20 + 22 + 24 + 26 + 28 + 30 + 32 + 34 + 36 + 38 + 40));
        System.out.println("Obtén el factorial del número 7 → (7!): " + (7 * 6 * 5 * 4 * 3 * 2 * 1));
        System.out.println("######################################################################");
        System.out.println("Ejemplos de cálculos CON estructuras de control:");
        System.out.println(sumNum(5));
        System.out.println(sumEvenNum(20));
        System.out.println(factorial(7));
        System.out.println(recursiveFactorial(7));
    }

    public static int sumNum(int num) {
       //El método sumNum() recibe un número entero por parámetro. El método calculará la suma de los primeros números enteros que se solicite en el parámetro.
        int suma=0;
        for(int i=1;i<=num;i++){
            suma+=i;
        }
        return suma;
    }

    public static int sumEvenNum(int num) {
        //El método sumEvenNum() recibe un número entero por parámetro. El método calculará la suma de los primeros números enteros pares que se solicite en el parámetro.
        int suma=0;
        int increment=0;
        int contador=0;

        while(contador<=num){
            if(increment%2==0){
                suma+=increment;
                contador++;
            }
            increment++;

        }

        return suma;
    }

    public static int factorial(int num) {
        //El método factorial() recibe un número entero por parámetro. El método calculará el factorial del número que se solicite en el parámetro.
        int factorial=1;
        for(int i=1;i<=num;i++){
            factorial*=i;
        }
        return factorial;
    }

    public static int recursiveFactorial(int num) {
       //El método recursiveFactorial() recibe un número entero por parámetro. El método hará la misma operación que el método factorial() pero
        // sirviéndose de la recursividad, es decir, invocándose a sí mismo (buscar información sobre recursividad).
        return num * factorial(num - 1);

    }
}
