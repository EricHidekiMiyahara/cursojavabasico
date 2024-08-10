// Source code is decompiled from a .class file using FernFlower decompiler.
package com.loaine.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer28 {
   public Exer28() {
   }

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Entre com o tipo da carne:");
      System.out.println("1 - file duplo");
      System.out.println("2 - alcatra");
      System.out.println("3 - picanha");
      int tipo = scan.nextInt();
      System.out.println("Entre com a quantidade (kg):");
      double qtd = scan.nextDouble();
      double precoKg = 0.0;
      if (tipo == 1) {
         System.out.println(qtd + "kg - file duplo");
         if (qtd < 5.0) {
            precoKg = 4.9;
         } else {
            precoKg = 5.8;
         }
      } else if (tipo == 2) {
         System.out.println(qtd + "kg - alcatra");
         if (qtd < 5.0) {
            precoKg = 5.9;
         } else {
            precoKg = 6.8;
         }
      } else if (tipo == 3) {
         System.out.println(qtd + "kg - picanha");
         if (qtd < 5.0) {
            precoKg = 6.9;
         } else {
            precoKg = 7.8;
         }
      }

      double total = qtd * precoKg;
      System.out.println(qtd + "kg * " + precoKg + " = " + total);
      System.out.println("Compra no cart\u00e3o? digite 1 para sim:");
      int cartao = scan.nextInt();
      if (cartao == 1) {
         double desconto = total / 100.0 * 5.0;
         System.out.println("Desconto de: " + desconto);
         System.out.println("Valor a pagar: " + (total - desconto));
      } else {
         System.out.println("Valor a pagar: " + total);
      }

   }
}
