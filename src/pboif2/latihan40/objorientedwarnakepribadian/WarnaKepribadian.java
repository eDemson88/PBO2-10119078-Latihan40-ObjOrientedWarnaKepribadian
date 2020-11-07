/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.latihan40.objorientedwarnakepribadian;

import java.util.Scanner;
/**
 *
 * @author ryzen
 */
public class WarnaKepribadian {
    public String nama,warna,warnaUp;
    public static String RESET = "\u001B[0m";
                  String RED = "\u001B[31m";
                  String GREEN = "\u001B[32m";
                  String YELLOW = "\u001B[33m";
                  String BLUE = "\u001B[34m";
                  String PURPLE = "\u001B[35m";
                  String CYAN = "\u001B[36m";
                  String WHITE = "\u001B[37m";
            
                  String bgRed = "\u001b[41m";
                  String bgGreen = "\u001b[42m";
                  String bgYellow = "\u001b[43m";
                  String bgBlue = "\u001b[44m";
                  String bgPurple = "\u001b[45m";
    
    
    public void getInfo(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukan nama kamu: ");
        nama = scanner.nextLine();
        
        System.out.print("Pilih warna favoritmu: ");
        warna = scanner.next();
        warnaUp = warna.toUpperCase();
    }
    
    public String hasilKepribadian(){
        
        System.out.println("");
        System.out.println("====Hasil Test Kepribadian " + nama + "====");
        
        System.out.print("Warna Favoritmu adalah...... ");
            switch(warnaUp){
                case "MERAH":
                  System.out.print(RED + " Merah \n" + RESET);
                    System.out.println("1. Terbuka,\n"
                    + "2. Berani,\n"
                    + "3. Agresif,\n"
                    + "4. Impulsif,\n"
                    + "5. Penuh Semangat,\n"
                    + "6. Optimis, \n"
                    + "7. Disiplin.");
                break;
                               
                case "HIJAU":
                  System.out.print(GREEN + " Hijau \n" + RESET);
                    System.out.println("1. Harmonis,\n"
                    + "2. Lembut,\n"
                    + "3. Jujur,\n"
                    + "4. Terus terang,\n"
                    + "5. Damai,\n"
                    + "6. Sabar, \n"
                    + "7. Tidak suka menonjol.");
                break;
                   
                case "KUNING":
                  System.out.print(YELLOW + " Kuning \n" + RESET);
                    System.out.println("1. Petualang,\n"
                    + "2. Cerdik,\n"
                    + "3. Humoris,\n"
                    + "4. Bebas,\n"
                    + "5. Independen,\n"
                    + "6. Ceria, \n"
                    + "7. Bijaksana.");
                break;
                                
                case "BIRU":
                  System.out.print(BLUE + " Biru \n" + RESET);
                    System.out.println("1. Sabar,\n"
                    + "2. Sensitif,\n"
                    + "3. Pengendalian diri yang bagus,\n"
                    + "4. Loyal,\n"
                    + "5. Terlalu hati hati,\n"
                    + "6. Konservatif, \n"
                    + "7. Stabil.");
                break;
                                
                case "UNGU":
                  System.out.print(PURPLE + " Ungu \n" + RESET);
                    System.out.println("1. Individualistik,\n"
                    + "2. Sensitif,\n"
                    + "3. Unik,\n"
                    + "4. Kreatif,\n"
                    + "5. Toleran,\n"
                    + "6. Tempramental, \n"
                    + "7. Harga diri tinggi.");
                break;
                default:
                    System.out.println(" Uh-oh sepertinya warna favoritmu belum terdefinisikan nih, tunggu ya kak");
                break;
     
            }
        
        
        return(warnaUp);
    }
    
}
