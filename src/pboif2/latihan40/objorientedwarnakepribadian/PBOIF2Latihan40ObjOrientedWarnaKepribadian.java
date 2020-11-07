/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.latihan40.objorientedwarnakepribadian;

/**
 *
 * @author ryzen
 */
public class PBOIF2Latihan40ObjOrientedWarnaKepribadian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WarnaKepribadian info = new WarnaKepribadian();
        

        
        System.out.print(info.RED + "YUK " + info.RESET);
        System.out.print(info.GREEN + "CEK " + info.RESET);
        System.out.print(info.YELLOW + "KEPRIBADIANMU " + info.RESET);
        System.out.print(info.CYAN + "DARI " + info.RESET);
        System.out.print(info.PURPLE + "WARNA " + info.RESET);
        System.out.println(info.BLUE + "FAVORITMU " + info.RESET);
        
        System.out.println("");
        
        System.out.print(info.bgRed + info.WHITE + "\t MERAH \t\t\n" + info.RESET);
        System.out.print(info.bgGreen + info.WHITE + "\t HIJAU \t\t\n" + info.RESET);
        System.out.print(info.bgYellow + info.WHITE + "\t KUNING \t\n" + info.RESET);
        System.out.print(info.bgBlue + info.WHITE + "\t BIRU \t\t\n" + info.RESET);
        System.out.print(info.bgPurple + info.WHITE + "\t UNGU \t\t\n" + info.RESET);
        
        
        info.getInfo();
        info.hasilKepribadian();
        
        
    }
    
   
}
