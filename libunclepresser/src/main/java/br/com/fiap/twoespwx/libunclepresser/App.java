/* 
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 *
 * Grupo: Romã
 * Autores: 
 *      - Henrique Lima    -   riquelima00@gmail.com
 *      - Augusto Fisco Milreu     -   gutofisco@gmail.com
 *      - Kayque Moraes    -   kaymoaraesdias@gmail.com
        - Anny Carolina Andrade Dias - annydiasandrade@gmail.com
 */

 package br.com.fiap.twoespwx.libunclepresser;

 import java.io.File;
 import java.io.FileNotFoundException;
 import java.io.FileWriter;
 import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 
 public class app {
     public static void main(String[] args) {
         try {
             File inputFile = new File("libunclepresser\\inputs\\input1.txt");
             Scanner sc = new Scanner(inputFile);
 
             StringBuilder input = new StringBuilder();
             while (sc.hasNextLine()) {
                 input.append(sc.nextLine());
             }
             sc.close();

             long inputFileSize = inputFile.length();
             double inputFileSizeKB = inputFileSize / 1024.0;

             int totalCaracteresEntrada = input.toString().length();

             Map<Character, Integer> characterFrequencies = new HashMap<>();
             for (char c : input.toString().toCharArray()) {
                characterFrequencies.put(c, characterFrequencies.getOrDefault(c, 0) + 1);
            }
 
             String result = runLengthEncoding(input.toString());
             File outputFile = new File("libunclepresser\\outputs\\OUTPUT1.TXT");
             double compressionRate = (inputFileSize - outputFile.length()) / (double) inputFileSize * 100;
 
             // Escreve no arquivo com a formatação desejada
             FileWriter writer = new FileWriter("libunclepresser\\outputs\\OUTPUT1.TXT");
             writer.write("LIB UNCLE PRESSER - GRUPO BATATA-DOCE\n");
             writer.write("----------------------------------------------------\n");
             writer.write("INPUT FILENAME: input1.txt\n");
             writer.write("OUTPUT FILENAME: OUTPUT1.TXT\n");
             writer.write("----------------------------------------------------\n");
             writer.write("INPUT FILE SIZE: " + String.format("%.1f", inputFileSizeKB) + "KB\n");
             writer.write("TOTAL INPUT CHARACTERS: " + totalCaracteresEntrada + "\n");
             writer.write("----------------------------------------------------\n");
             writer.write("FREQUENCIES:\n");
             for (Map.Entry<Character, Integer> entry : characterFrequencies.entrySet()) {
                 char character = entry.getKey();
                 int count = entry.getValue();
                 double percentage = (double) count / totalCaracteresEntrada * 100;
                 writer.write(character + ": " + count + " (" + String.format("%.2f", percentage) + "%) \n");
             }
             writer.write("----------------------------------------------------\n");
             writer.write("OPTIONS:\n");
             writer.write("ALGORITHM: Run-Length Encoding (RLE)\n");
             writer.write("TEXT-CODIFICATION: UTF-8\n");
             writer.write("COMPRESSION RATE: ~" + String.format("%.0f", compressionRate) + "%\n");
             writer.write("----------------------------------------------------\n");
             writer.write("OUTPUT FILE SIZE: " + outputFile.length() + " BYTES\n");
             writer.write("----------------------------------------------------\n");
             writer.write("SCORE: WELL-DONE\n");
             writer.close();
 
         } catch (FileNotFoundException e) {
             System.err.println("Erro ao abrir arquivo de entrada: " + e.getMessage());
         } catch (IOException e) {
             System.err.println("Erro ao escrever no arquivo de saída: " + e.getMessage());
         }
     }
 
     public static String runLengthEncoding(String input) {
         String result = "";
         int count = 0;
 
         for (int i = 0; i < input.length(); i++) {
             if (i == 0) {
                 result = result + input.charAt(0);
                 count++;
             }
 
             if ((i != 0) && (input.charAt(i) == input.charAt(i - 1))) {
                 count++;
             } else if ((i != 0) && (input.charAt(i) != input.charAt(i - 1))) {
                 result = result + count + input.charAt(i);
                 count = 1;
             }
 
             if (i == input.length() - 1) {
                 result = result + count;
             }
         }
 
         System.out.println("Saída: " + result);
         return result;
     }
 }
