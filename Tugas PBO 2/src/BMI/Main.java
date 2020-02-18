package BMI;
import Hitung.Hasil;

import java.util.Scanner;

public class Main {
    static String Nama,Umur;

    public static void main(String[] args) {

        Scanner nama = new Scanner(System.in);
        Scanner umur = new Scanner(System.in);

        System.out.print("Nama : ");
        Nama = nama.nextLine();
        System.out.print("Umur : ");
        Umur = umur.nextLine();
        Data.Input();
    }
    public static void output(double b){
        System.out.println("=====================OUTPUT=====================");
        System.out.println("Nama    : "+Nama);
        System.out.println("Umur    : "+Umur);
        System.out.println("BMI     : "+ b);
        Hasil.akhir(b);
    }
}
