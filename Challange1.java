package Challange;

import java.text.NumberFormat;
import java.util.Scanner;

    public class Challange1 {
        
        public static void main(String[] args) {
            
            Scanner hab =  new Scanner(System.in)  ;
            
             String Nama, Kelas, Absen ;
             int p, rms, m ;
             double jasa, komisi, pendapatan ;
             
             
             
             
       
        System.out.println("==Isi Identitas dulu gayn :D==");
        System.err.print("Nama Panggilan aja : ");
         Nama = hab.next();
        
        
        System.err.print("Kelas X/XI/XII : ");
        
        Kelas = hab.next();
        System.err.print("Absen : ");
        Absen = hab.next();
        
        System.out.println("========================================================");
        System.err.println("===============TOOLS CEK KOMISI HALAL :V==============="); 
  System.out.println("1. Next"); 
  System.out.println("2. Cara pakai tools nya"); 
  System.out.println("3. About Creator XD"); 
 
  System.out.println("𝘽𝙖𝙘𝙖 𝙙𝙪𝙡𝙪 𝙜𝙖𝙣 :𝘿");
  System.out.println("Pilih salah 1 / 2 / 3 sam :v :");
  
   System.err.println("=====================================================");
        p = hab.nextInt();
        
            switch (p) {
                case 1:
                    System.out.println("=====Pencapaian kamu=====");
                    System.out.println("1. Terjual Rp.1k - 20k ");
                    System.out.println("2. Terjual 20k - 50k");
                    System.out.println("3. Terjual 50k - 100k");
                    System.out.println("4. Terjual 100k++ ");
                    System.out.println("5. Terjual 150k++ ");
                    System.out.println("==============================");
                    System.out.println("Tentukan Anda masuk golongan mana? : ");
                    p = hab.nextInt();
                    System.out.println("Kalau boleh tau berapa :v ? :");
                    m = hab.nextInt();
                    //Pilihan 1
                    if (p == 1){
                        jasa = (10000);
                        System.err.println("===Anda Menjual barang 1k - 20k===");
                        System.out.println("==============================");
                        System.err.println("Barang anda terjual: Rp." + NumberFormat.getCurrencyInstance().format(m));
                        
                        System.err.println("Anda mendapat uang jasa sebesar : Rp." + NumberFormat.getCurrencyInstance().format(jasa));
                        komisi = (0.1 * m);
                        System.out.println("Pendapatan Anda : Rp." + NumberFormat.getCurrencyInstance().format(komisi));
                        pendapatan = (jasa + komisi);
                        System.out.println("===========================================================");
                        System.err.println("Pendapatan Anda : Rp." + NumberFormat.getCurrencyInstance().format(pendapatan));
                    }          //Pilihan 2 
                    if (p == 2){
                        jasa = (20000);
                        System.err.println("===Anda Menjual barang diatas 20k - 50k===");
                        System.out.println("==============================");
                        System.err.println("Barang anda terjual: Rp." + NumberFormat.getCurrencyInstance().format(m));
                        System.err.println("Anda mendapat uang jasa sebesar : Rp." + NumberFormat.getCurrencyInstance().format(jasa));
                        komisi = (0.15 * m);
                        System.out.println("Komisi : " +komisi);
                        pendapatan = (jasa + komisi);
                        System.out.println("===========================================================");
                        System.err.println("Pendapatan Anda : Rp." + NumberFormat.getCurrencyInstance().format(pendapatan));
                    }           //Pilihan 3        
                    if (p == 3){
                        jasa = (30000);
                        System.err.println("===Anda Menjual barang 50k - 100k===");
                        System.out.println("==============================");
                        System.err.println("Barang anda terjual: Rp." + NumberFormat.getCurrencyInstance().format(m));
                        System.err.println("Anda mendapat uang jasa sebesar : Rp." + NumberFormat.getCurrencyInstance().format(jasa));
                        komisi = (0.20 * m);
                        System.out.println("Komisi : " +komisi);
                        pendapatan = (jasa + komisi);
                        System.out.println("===========================================================");
                        System.err.println("Pendapatan Anda : Rp." + NumberFormat.getCurrencyInstance().format(pendapatan));
                    }           //Pilihan 4
                    if (p == 4){
                        jasa = (50000);
                        System.err.println("===Anda Menjual barang diatas Rp.100k===");
                        System.out.println("==============================");
                        System.err.println("Barang anda terjual: Rp." + NumberFormat.getCurrencyInstance().format(m));
                        System.err.println("Anda mendapat uang jasa sebesar : Rp." + NumberFormat.getCurrencyInstance().format(jasa));
                        komisi = (0.30 * m);
                        System.out.println("Komisi : " +komisi);
                        pendapatan = (jasa + komisi);
                        System.out.println("===========================================================");
                        System.err.println("Pendapatan Anda : Rp." + NumberFormat.getCurrencyInstance().format(pendapatan));
                    }           //Pilihan 5
                    if (p == 5){
                        System.out.println("==============================");
                        
                        System.err.println("===Anda Menjual barang diatas Rp.150k===");
                        System.err.println("Barang anda terjual: Rp." + NumberFormat.getCurrencyInstance().format(m));
                        
                        jasa = (75000);
                        
                        System.err.println("Anda mendapat uang jasa sebesar : Rp." + NumberFormat.getCurrencyInstance().format(jasa));
                        komisi = (0.40 * m);
                        System.out.println("Komisi : " +komisi);
                        pendapatan = (jasa + komisi);
                        System.out.println("===========================================================");
                        System.err.println("Pendapatan Anda : Rp." + NumberFormat.getCurrencyInstance().format(pendapatan));
                    }           break;
                case 2:
                    System.out.println("===================================================");
                    System.out.println("1. Pilih Angka 1 pada menu awal");
                    System.out.println("2. Pilih Pencapaian barang terjual anda");
                    System.out.println("3. Tulis Pencapaian Anda Menggunakan -ANGKA-");
                    System.out.println("4. Jeng jeng :v Keluar tuh komisinya dan pendapatan ");
                    System.out.println("5. Traktir Temen Temen!!! :V");
                    System.out.println("===================================================");
                    System.out.println("99. back menu awal : ");
                    break;
                case 3:
                    System.err.println("𝗧𝗢𝗢𝗟𝗦 𝗕𝗬 @𝗦𝘆𝗶𝗵𝘂𝗯");
                    System.out.println("==============================");   
                    System.out.println("𝐈𝐧𝐬𝐭𝐚𝐠𝐫𝐚𝐦 : @bolt.agar");
                    System.out.println("𝐖𝐡𝐚𝐭𝐬𝐀𝐩𝐩 : 081 553 224 622");
                    
                    
                    
                    break;
                default:
                    break;
            
            
            }
    }
    }
    
