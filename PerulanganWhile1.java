package Pekan1;
import java.util.Scanner;
    public class PerulanganWhile1 {
        public static void main(String[] args) {
            boolean running = true;
            int counter = 0;
            String jawab;
            Scanner hab = new Scanner(System.in);
            
            while ( running ) {
                System.out.println("Apakah anda ingin keluar ? ");
                        System.out.print("Jawab [ya/tidak]> ");
                        jawab = hab.nextLine();
                        
                        if (jawab.equalsIgnoreCase("ya")) {
                            running = false;
                            
                        }
                        counter++;
            }
            System.out.println("Anda sudah melakukan perulangan sebanyak" +counter + "kali");
            
        }

    
    }
        
    
      