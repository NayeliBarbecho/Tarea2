/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.estructuralinkedlist;

import Modelo.Agenda;
import Modelo.Contacto;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class EstructuraLinkedList {

    public static void main(String[] args) {
        Agenda<String,String> agenda = new Agenda<>();
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        while (option != 3) {
            System.out.println("Menu:");
            System.out.println("1. Agregar ");
            System.out.println("2. Eliminar");
            System.out.println("3. Buscar");
            System.out.println("4. Salir");
            System.out.print("seleccione una opcion: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                     System.out.print("Introduzca el nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Introduzca el telefono: ");
                    String telefono = scanner.nextLine();
                    Contacto<String, String> contacto1 = new Contacto<>(nombre, telefono);
                    agenda.agregar(contacto1);
                    System.out.println("Contacto añadido");
                    break;
                case 2:
                    System.out.print("introduzca el nombre: ");
                    nombre = scanner.nextLine();
                    agenda.borrar(nombre);
                    System.out.println("Contacto eliminado");
                    break;
                case 3:
                    System.out.print("introduzca el nombre: ");
                    nombre = scanner.nextLine();
                    
                    agenda.buscar(nombre);
                    
                    System.out.println("Contacto encontrado "+nombre);
                    break;
                
                case 4:
                    System.out.println("Programa finalizado");
                    break;
                default:
                    System.out.println("No se encuentra en el rango de opciones");
            }
        }
    }
        
    
       
       
}
