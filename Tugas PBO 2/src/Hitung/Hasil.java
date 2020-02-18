package Hitung;

public class Hasil {
    public static void akhir(double h){
    if (h < 18.50)
        System.out.println("Underweight (BMI < 18.5)");
    else
        if (h>=18.50 && h<=24.99)
            System.out.println("BMI Normal (18.5 >= BMI <=24.99)");
        else
            if (h>=25.00 && h<=29.99)
                System.out.println("Overweight (25 >= BMI <= 29.99)");
            else
                if (h>=30)
                    System.out.println("Obesitas (BMI >=30)");
    }
}
