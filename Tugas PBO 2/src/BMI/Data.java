package BMI;
import java.util.Scanner;
import Hitung.*;

public class Data {
    public static void Input(){
        Scanner BB = new Scanner(System.in);
        Scanner TB = new Scanner(System.in);
        int Berat;
        double Tinggi;
        System.out.print("Masukkan Berat Badan (kg) : ");
        Berat = BB.nextInt();
        System.out.print("Masukkan Tinggi Badan (cm) : ");
        Tinggi = TB.nextInt();
        Formula.Hitung(Berat,Tinggi);
    }
}
