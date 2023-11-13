package cajero;

import java.util.Scanner;

public class Cajero {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opc, cantidad_inicial, d_retiro, d_depocito;
        System.out.println("Ingresa la cantidad para inicializar su cuenta: ");
        cantidad_inicial = entrada.nextInt();
 
            if (cantidad_inicial < 50) {
                System.out.println("Transaccion no realizada");
                System.out.println("Solo transacciones mayores a 50 pesos!!");
            }
       

       
        if (cantidad_inicial > 50) {
            System.out.println("Transaccion realizada");

            while (true) {
                System.out.println("CAJERO AUTOMATICA THE CRAZY ");
                System.out.println("1.-Consultar saldo: ");
                System.out.println("2.-Retirar dinero: ");
                System.out.println("3.-Depocitar saldo: ");
                System.out.println("4.-Salir del programa: ");
                opc = entrada.nextInt();

                switch (opc) {
                    case 1:
                        System.out.println("Consultando Saldo");
                        System.out.println("Su saldo es de: " + cantidad_inicial);

                        break;
                    case 2:
                        System.out.println("Retirando saldo");
                        System.out.println("Cuanto dinero decea retirar: ");
                        d_retiro = entrada.nextInt();
                        if (d_retiro < 50) {
                            System.out.println("Transaccion no realizada");
                            System.out.println("Solo retiros mayorea a 50 pesos");
                        }
                        if (d_retiro < 6001) {
                            System.out.println("Transaccion realizada");
                            cantidad_inicial = cantidad_inicial - d_retiro;
                        }
                        if (d_retiro > cantidad_inicial) {
                            System.out.println("Dinero insuficiente");
                        }
                        break;
                    case 3:
                        System.out.println("Depocitando saldo");
                        System.out.println("Cuanto dinero decea depocitar: ");
                        d_depocito = entrada.nextInt();
                        if (d_depocito < 50) {
                            System.out.println("Transaccion no realizada");
                            System.out.println("Solo depocitos mayores a 50 pesos");
                        }
                        if (d_depocito > 50 && d_depocito < 20001) {
                            System.out.println("Transaccion realizada");
                            cantidad_inicial = cantidad_inicial + d_depocito;
                        }
                        break;
                    case 4:
                        entrada.close();
                        return;
                    default:
                        System.out.println("Opcion no valido");
                       break;

                }
            }
        }

    }
    }
