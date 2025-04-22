package Clase.test;

import Clase.impl.Operacionesimpl;
import Clase.interfaz.Operaciones;

import javax.swing.*;
import java.util.Scanner;

public class OperacionesTest {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Operaciones op = new Operacionesimpl();



        Scanner entrada = new Scanner(System.in);
        //System.out.println("Ingrese un valor");
        //Double x=entrada.nextDouble();

        double x = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el primer numero"));

        //System.out.println("Ingrese el segundo numero: ");
        //Double y=entrada.nextDouble();

        double y = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el segundo numero"));


        System.out.println("la suma es " + op.sumar(x,y));
        JOptionPane.showMessageDialog(null, "La suma es " + op.sumar(x,y));
    }
}
