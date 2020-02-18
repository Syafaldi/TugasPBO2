package Hitung;
import BMI.Main;
public class Formula {
    public static void Hitung(int berat,double tinggi){
    double BMI;
    double tinggim = tinggi/100.0;
    BMI = berat/(tinggim*tinggim);
    Main.output(BMI);
    }
}
