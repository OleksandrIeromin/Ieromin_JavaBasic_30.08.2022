import java.util.Arrays;

public class ChineseDynasties {
    public static void main(String[] args) {

        int li = (13+24+46)*860;
        double ming = (9+35+12)*(860*1.5);
        System.out.println("li army " + li);
        System.out.println("ming army " + ming);

        System.out.println("Massives"); // Использовать массивы

        int[] li2 = { 13, 24, 46 };
        int[] ming2 = { 9, 35 , 12};

        int liTotal = (li2[0] + li2[1] + li2[2]) * 860;
        double mingTotal = (ming2[0] + ming2[1] + ming2[2]) * (860 * 1.5);
        System.out.println("li army " + liTotal);
        System.out.println("ming army " + mingTotal);

    }
}
