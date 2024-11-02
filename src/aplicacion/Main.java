package aplicacion;
import dominio.*;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion=7;
        long velocidad = Math.round(Math.random() * 200);
        long precio = Math.round(Math.random() * 1000000);
        System.out.println("------------------------");
        System.out.println("-----Concesionario------");
        System.out.println("------------------------");
        System.out.println("Seleccionar tipo de vehículo: Coche / Moto");
        Scanner sc = new Scanner(System.in);
        String tipo = sc.nextLine();
        if (tipo.equals("Coche")) {
            System.out.println("Introduce la marca de tu coche: ");
            String marca = sc.nextLine();
            System.out.println("Introduce el modelo de tu coche: ");
            String modelo = sc.nextLine();
            System.out.println("Introduce el motor de tu coche: ");
            String motor = sc.nextLine();
            System.out.println("Introduce el color de tu coche: ");
            String color = sc.nextLine();
            System.out.println("Introduce el tipo de ventanillas: ");
            String ventanilla = sc.nextLine();
            System.out.println("Introduce el tipo de radio: ");
            String radio = sc.nextLine();
            coche coche1 = new coche(modelo, motor, color, marca, ventanilla, radio);
            do {
                System.out.println();
                System.out.println("------------------------");
                System.out.println("---------Menu-----------");
                System.out.println("------------------------");
                System.out.println("Seleccione una opcion (1-6): ");
                System.out.println("Mover / Detener / Acelerar / Obtener velocidad / Obtener Precio / Salir del concesionario");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        coche1.mover();
                        break;
                    case 2:
                        coche1.detener();
                        break;
                    case 3:
                        System.out.println("¿Cuántos km/h quiere acelerar?");
                        int kmh = sc.nextInt();
                        coche1.acelerar(kmh);
                        break;
                    case 4:
                        coche1.obtenerVelocidad(velocidad);
                        break;
                    case 5:
                        coche1.obtenerPrecio(precio);
                        break;
                    case 6:
                        System.out.println("bye bye");
                        break;
                }
            }while(opcion != 6);
        }
        else{
            System.out.println("Introduce la marca de tu moto: ");
            String marca = sc.nextLine();
            System.out.println("Introduce el modelo de tu moto: ");
            String modelo = sc.nextLine();
            System.out.println("Introduce el motor de tu moto: ");
            String motor = sc.nextLine();
            System.out.println("Introduce el color de tu moto: ");
            String color = sc.nextLine();
            System.out.println("Introduce el tipo de pedales: ");
            String pedales = sc.nextLine();
            System.out.println("Introduce el tipo de manillares: ");
            String manillares = sc.nextLine();
            moto moto1 = new moto(modelo, motor, color, marca, pedales, manillares);
            do {
                System.out.println();
                System.out.println("------------------------");
                System.out.println("---------Menu-----------");
                System.out.println("------------------------");
                System.out.println("Seleccione una opcion (1-6): ");
                System.out.println("Mover / Detener / Acelerar / Obtener velocidad / Obtener Precio / Salir del concesionario");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        moto1.mover();
                        break;
                    case 2:
                        moto1.detener();
                        break;
                    case 3:
                        System.out.println("¿Cuántos km/h quiere acelerar?");
                        int kmh = sc.nextInt();
                        moto1.acelerar(kmh);
                        break;
                    case 4:

                        moto1.obtenerVelocidad(velocidad);
                        break;
                    case 5:
                        moto1.obtenerPrecio(precio);
                        break;
                }
            }while(opcion != 6);
        }
    }
}