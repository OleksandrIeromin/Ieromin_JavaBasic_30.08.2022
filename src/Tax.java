public class Tax {
    public static void main(String[] args) {

        int income = 105;
        double tax_rate_percent = 20;
        double tax_sum = (tax_rate_percent/100) * income;

        System.out.println("Tax sum is " + tax_sum + "$ from income " + income + "$");
    }
}
