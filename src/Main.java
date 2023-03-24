import Persona.Persona;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Ejercicio1();
        Ejercicio2();
        Ejercicio3();
    }

    public static void Ejercicio1() {

        Scanner reader  = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int entero = reader.nextInt();

        if (entero % 2 == 0) {
            System.out.print("\nTodos los numeros pares de " + entero + " : ");
            while (entero >= 0) {
                System.out.print(entero + ",");
                entero = entero - 2;
            }

        } else {
            System.out.print("\nTodos los numeros impares de " + entero + " : ");
            while (entero >= 1) {
                System.out.print(entero + ",");
                entero = entero - 2;
            }
        }

    }

    public static void Ejercicio2() {
        char sexo;
        int edad;

        int mayoresDeEdad = 0, menoresDeEdad = 0, hombresMayoresDeEdad = 0, mujeresMenoresDeEdad = 0, mujeresTotal = 0;
        double porcentajeMayoresDeEdadTotal = 0, porcentajeMujeresTotal = 0;

        Persona[] personas = new Persona[50];

        Scanner reader  = new Scanner(System.in);

        for (int i = 0; i < 50; i++) {
            System.out.println("Introduzca los datos de la persona " + (i + 1) + ": ");
            System.out.print("Sexo M/F : ");
            sexo = reader.next().charAt(0);
            System.out.print("Edad: ");
            edad = reader.nextInt();
            personas[i] = new Persona(sexo, edad);
        }

        for (int z = 0; z < 50; z++) {
            if (personas[z].getEdad() >= 18) {
                mayoresDeEdad++;
                if (personas[z].getSexo() == 'M') {
                    hombresMayoresDeEdad++;
                }
            } else {
                menoresDeEdad++;
                if (personas[z].getSexo() == 'F') {
                    mujeresMenoresDeEdad++;
                }
            }
            if (personas[z].getSexo() == 'F') {
                mujeresTotal++;
            }
        }

        porcentajeMayoresDeEdadTotal = (mayoresDeEdad / 50.0) * 100;
        porcentajeMujeresTotal = (mujeresTotal / 50.0) * 100;

        System.out.println("El numero total de personas mayores de edad es : " + mayoresDeEdad);
        System.out.println("El numero total de personas menores de edad es : " + menoresDeEdad);
        System.out.println("El numero total de hombres mayores de edad es : " + hombresMayoresDeEdad);
        System.out.println("El numero total de mujeres menores de edad es : " + mujeresMenoresDeEdad);
        System.out.println("Porcentaje de personas mayores de edad: " + porcentajeMayoresDeEdadTotal + "%");
        System.out.println("Porcentaje de mujeres: " + porcentajeMujeresTotal + "%");

    }

    public static void Ejercicio3() {
        Scanner reader  = new Scanner(System.in);

        int horasTotal = 0 ,horasRegulares = 40,  horasExtras = 0;
        double tarifa , sueldo , tarifaExtra = 1.5; // 1.5 = augemto tarifa del 50%


        System.out.print("\nIntroduzca las horas trabajadas: ");
        horasTotal = reader.nextInt();
        System.out.print("Introduzca su tarifa por hora: ");
        tarifa = reader.nextDouble();

        if (horasTotal > horasRegulares) {
            horasExtras = horasTotal - horasRegulares;
            sueldo = horasTotal * tarifa + horasExtras * tarifa * tarifaExtra;
        } else {
            sueldo = horasTotal * tarifa;
        }

        System.out.println("\nTu sueldo será de: " + sueldo+"€");
    }
}


