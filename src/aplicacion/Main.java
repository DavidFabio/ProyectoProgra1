package aplicacion;
import dominio.*;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------");
        System.out.println("-----Gran Turismo 5-----");
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
            System.out.println("------------------------");
            System.out.println("---------Menu-----------");
            System.out.println("------------------------");
            System.out.println("Seleccione una opcion (1-4): ");
            System.out.println("Mover / Detener / Acelerar / Obtener velocidad");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1: coche1.mover();break;
                case 2: coche1.detener();break;
                case 3:
                    System.out.println("¿Cuántos km/h quiere acelerar?");
                    int kmh = sc.nextInt();
                    coche1.acelerar(kmh);break;
                case 4: coche1.obtenerVelocidad();break;
            }
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
            System.out.println("------------------------");
            System.out.println("---------Menu-----------");
            System.out.println("------------------------");
            System.out.println("Seleccione una opcion: ");
            System.out.println("Mover/Detener/Acelerar/ObtenerVelocidad");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1: moto1.mover();break;
                case 2: moto1.detener();break;
                case 3:
                    System.out.println("¿Cuántos km/h quiere acelerar?");
                    int kmh = sc.nextInt();
                    moto1.acelerar(kmh);break;
                case 4: moto1.obtenerVelocidad();break;
            }
        }
    }
}