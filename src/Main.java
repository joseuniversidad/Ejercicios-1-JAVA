

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("Hello world\n");
        int ingresado;
        do {

            Scanner opc = new Scanner(System.in);
            System.out.println("---------------------------------------------------------------------------------------------------------------------");
            System.out.println("=====================================================================================================================");
            System.out.println("||                                                                                                                 ||");
            System.out.println("||                                                                                                                 ||");
            System.out.println("||                  DIGITE UN NUMERO ENTRE 1-7 QUE TE GUSTARIA EJECUTAR \n                                         ||");
            System.out.println("||                  1- Determinar si es mayor o menor de edad                                                      ||");
            System.out.println("||                  2- Determinar Cual de los dos numeros ingresados es mayor                                      ||");
            System.out.println("||                  3- Determinar si el numero es PAR o IMPAR                                                      ||");
            System.out.println("||                  4- Calcular Factorial de un numero                                                             ||");
            System.out.println("||                  5- Numeros primos al limite del numero Ingresado por el usuario CICLO FOR                      ||");
            System.out.println("||                  6- Numeros primos al limite del numero Ingresado por el usuario CICLO WHILE                    ||");
            System.out.println("||                  7- Estructura de control de Seleccion Switch, determinado el dia  por el numero ingresado      ||");
            System.out.println("||                                                                                                                 ||");
            System.out.println("||                                                                                                                 ||");
            System.out.println("=====================================================================================================================");
            System.out.println("---------------------------------------------------------------------------------------------------------------------");
            ingresado = opc.nextInt();
            switch (ingresado) {

                //DETERMINANDO SI ES MAYOR DE DAD
                case 1:
                    Scanner entrada = new Scanner(System.in);
                    int numero;

                    System.out.println("Ingrese su edad");
                    numero = entrada.nextInt();

                    if (numero >= 18) {
                        System.out.println("Eres mayor de edad\n");
                    } else {
                        System.out.println("Eres menor de edad\n");
                    }
                    break;

                //DETERMINAR CUAL DE LOS 2 NUMEROS ES MAYOR
                case 2:
                    Scanner mayor = new Scanner(System.in);
                    int numero1, numero2;

                    System.out.println("Ingrese el primer numero");
                    numero1 = mayor.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    numero2 = mayor.nextInt();

                    if (numero1 > numero2) {
                        System.out.println("El primer numero es mayor\n");
                    } else if (numero2 > numero1) {
                        System.out.println("El segundo numero es mayor\n");
                    } else {
                        System.out.println("Los 2 numeros ingresados son 0\n");
                    }
                    break;

                //DETERMINAR SI EL NUMERO ES PAR O IMPAR
                case 3:
                    Scanner determinando = new Scanner(System.in);
                    int nume;

                    System.out.println("Ingresa un numero entero para determinar si es par o impar");
                    nume = determinando.nextInt();
                    if (nume % 2 == 0) {
                        System.out.println("El numero es PAR\n");
                    } else if (nume % 2 == 1) {
                        System.out.println("El numero es IMPAR\n");
                    } else {
                        System.out.println("El numero no es ENTERO, vuelve a intentarlo\n");
                    }
                    break;

                //CALCULANDO FACTORIAL CON NUMERO INGRESADO
                case 4:
                    Scanner calculando = new Scanner(System.in);
                    int fact, d;
                    float facto;
                    facto = 1;
                    d = 1;

                    System.out.println("Ingresa un digito para calcular su factorial");
                    fact = calculando.nextInt();
                    while (d <= fact) {
                        facto = facto * d;
                        d++;
                    }
                    System.out.println("El factorial de " + fact + " es: " + facto);
                    System.out.println("\n");
                    break;


                //NUMERO MAYOR A 10 y MENOR QUE 30
                case 5:
                    Scanner revisar = new Scanner(System.in);
                    int num;

                    System.out.println("Ingrese un numero mayor a 10 y menor que 30");
                    num = revisar.nextInt();

                    for (int i = 1; i <= num; i++) {
                        if (i % 2 == 1) {
                            System.out.println(i);
                        }
                    }
                    System.out.println("\n");
                    break;

                //NUMERO MAYOR A 10 Y MENOR QUE 30 CON EL BUCLE WHILE
                case 6:
                    int i = 1, num1;
                    Scanner revisar2 = new Scanner(System.in);

                    System.out.println("Ingresa un numero mayor a 10 y menor que 30");
                    num1 = revisar2.nextInt();

                    while (i <= num1) {
                        if (num1 % 2 == 1) {
                            System.out.println(i);
                            i += 2;
                        }
                    }
                    System.out.println("\n");
                    break;

                //ESTRUTURA DE CONTROL DE SELECCION SWITCH
                case 7:
                    Scanner dato = new Scanner(System.in);
                    int usuario;
                    System.out.println("Ingresa un numero del 1-5, para saber que Dia es");
                    usuario = dato.nextInt();

                    switch (usuario) {
                        case 1:
                            System.out.println("Lunes");
                            break;
                        case 2:
                            System.out.println("Martes");
                            break;
                        case 3:
                            System.out.println("Miercoles");
                            break;
                        case 4:
                            System.out.println("Jueves");
                            break;
                        case 5:
                            System.out.println("Viernes");
                            break;
                        default:
                            System.out.println("El numero no esta en el rango del 1-5");

                    }
                    break;
                default:
                    System.out.println("EL NUMERO NO ESTA EN EL RANGO INDICADO, VUELVE A INTENTARLO");


            }
        }while (ingresado!=7);

    }
}