import java.io.*;
import java.util.Scanner;
/**
 * Latihan17
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program : Nilai Terbesar dan Terkecil
 */

public class Latihan23 {

    public static void main(String[] args)throws Exception{
        BufferedReader kata = new BufferedReader(new InputStreamReader(System.in));
        int a,i;
        float rata,total=0;
        int maks=-1000; //asumsi paling minimum
        int min=1000; //asumsi paling maksimum

        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        System.out.print("Masukan Nama Petugas : ");
        String petugas = new Scanner(System.in).nextLine();

        System.out.print("Masukan Banyaknya Nilai Mahasiswa: ");
        a = Integer.parseInt(kata.readLine());

        int[] Angka=new int[a];
        Scanner input = new Scanner(System.in);

        for(i=0;i<a;i++){
        System.out.print("Nilai Mahasiswa ke-" +(i+1)+" = ");
        Angka[i]=input.nextInt();
        }

        for (i=0;i<Angka.length;i++){
        if(Angka[i]>maks)
        {
            maks=Angka[i];
        }
        if(Angka[i]<min)
        {
            min=Angka[i];
        }
            total=total+Angka[i];
            System.out.println("");
        }


        System.out.println("=====Hasil Nilai Mahasiswa=====");
        for(i=0;i<a;i++){
            System.out.println("Nilai Mahasiswa ke-" +(i+1)+" = " + Angka[i]);
            }
        
        System.out.println("");
        System.out.println("Nilai Maksimum "+ maks);
        System.out.println("Nilai Minimum "+min);
        System.out.println("");
        System.out.println("Petugas : "+ petugas);
    }
}
