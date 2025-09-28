package app;

import model.CuentaAhorros;

public class Aplicacion {
    public static void main(String [] args){
    CuentaAhorros cuenta= new CuentaAhorros(200000f, 15f);

        System.out.println("Estado inicial de la Cuenta:");
        cuenta.imprimir();

        System.out.println("\nConsignando $18000...");
        cuenta.consignar(18000f);


        System.out.println("\nRetirando $3000...");
        cuenta.retirar(3000f);

        System.out.println("\nRetirando $5000...");
        cuenta.retirar(5000f);

        System.out.println("\nRetirando $8000...");
        cuenta.retirar(8000f);

        System.out.println("\nRetirando $1000...");
        cuenta.retirar(1000f);

        System.out.println("\nRetirando $7000...");
        cuenta.retirar(7000f);



        System.out.println("\nIntentando retirar $230000...");
        cuenta.retirar(230000f);


        System.out.println("\nGenerando extracto mensual...");
        cuenta.extractoMensual();


        System.out.println("\nEstado final:");
        cuenta.imprimir();
    }


    }
