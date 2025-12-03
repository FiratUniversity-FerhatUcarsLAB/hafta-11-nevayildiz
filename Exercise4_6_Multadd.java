public class Exercise4_6_Multadd {


    // multadd metodu: a * b + c işlemini yapar
    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    // expSum metodu: xe^(-x) + (1 - e^(-x)) işlemini yapar
    public static double expSum(double x) {
        return multadd(x, Math.exp(-x), 1 - Math.exp(-x));
    }

    public static void main(String[] args) {
        // multadd test
        System.out.println("Multadd test: 2*3 + 4 = " + multadd(2, 3, 4));

        // sin(π/4) + cos(π/4)/2 ifadesini hesapla
        double expr1 = multadd(Math.sin(Math.PI / 4), 1, Math.cos(Math.PI / 4) / 2);
        System.out.println("sin(π/4) + cos(π/4)/2 = " + expr1);

        // log 10 + log 20 ifadesini hesapla
        double expr2 = multadd(Math.log(10), 1, Math.log(20));
        System.out.println("log 10 + log 20 = " + expr2);

        // expSum metodunu test et
        double x = 2.0; // örnek değer
        double result = expSum(x);
        System.out.println("expSum(" + x + ") = " + result);
    }
}


   
