/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javawhile;

import java.util.Scanner;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Javawhile {
    public static void main(String[] args) {

        // ========== EXERCÍCIO 1 ==========
        System.out.println("Números pares de 1 a 20:");
        int i = 1;
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

        // ========== EXERCÍCIO 2 ==========
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDigite um número para ver a tabuada: ");
        int numero = scanner.nextInt();

        int i2 = 1;
        System.out.println("Tabuada de " + numero + ":");
        while (i2 <= 10) {
            System.out.println(numero + " x " + i2 + " = " + (numero * i2));
            i2++;
        }

        // ========== EXERCÍCIO 3 ==========
        int inicio = 100;
        int fim = 125;
        int contador = 0;
        int i3 = inicio;

        while (i3 <= fim) {
            contador++;
            i3++;
        }
        System.out.println("\nQuantidade de números entre 100 e 125: " + contador);

        // ========== EXERCÍCIO 4 ==========
        System.out.print("\nDigite o valor inicial: ");
        int inicio2 = scanner.nextInt();

        System.out.print("Digite o valor final: ");
        int fim2 = scanner.nextInt();

        int soma2 = 0;
        int i4 = inicio2;

        while (i4 <= fim2) {
            if (i4 % 2 != 0) {
                soma2 += i4;
            }
            i4++;
        }

        System.out.println("Soma dos ímpares entre " + inicio2 + " e " + fim2 + " é: " + soma2);

        scanner.close();
    }
}


            
            

            
            
            
        
     
    


    

