/*
 * Nome do grupo: Romã
 * 
 * Nome dos integrantes:
 * 
 * -Henrique Lima - riquelima00@gmail.com | RM551528
 * -Augusto Fisco Milreu - gutofisco@gmail.com | RM98245
 * -Kayque Moraes - kaymoaraesdias@gmail.com |RM97592
   -Anny Carolina Andrade Dias - annydiasandrade@gmail.com | RM98295
 * 
 * 
 * 
 */


package main.java.br.com.fiap.twoespx.libunclegerardo;

import java.util.Scanner;



 public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho da cadeia aleatória: ");
        int tamanhoCadeia = scanner.nextInt();

        NucleotideoRandomGenerator generator = new SimpleNucleotideRandomGenerator();
        System.out.println(generator.generate(tamanhoCadeia));
    }

 }
