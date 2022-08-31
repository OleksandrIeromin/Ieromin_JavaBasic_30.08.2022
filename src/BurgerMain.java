class Burger {
    // Сделать класс Burger, который будет иметь поля: булочка, мясо, сыр, зелень, майонез
    public static String bun, cheese, greens;
    String name, meat, mayonnaise;

    //Сделать три конструктора, которые будут позволять делать бургеры трех видов
    Burger() {
        name = "Standart Burger";
        bun = "Yes";
        meat = "Yes";
        cheese = "Yes";
        greens = "Yes";
        mayonnaise = "Yes";

//В каждый конструктор добавить вывод в консоль состава данного варианта бургера

        System.out.println("Burger name: " + "'" + name + "'");
        System.out.println("bun: " + bun + ";");
        System.out.println("meat: " + meat + ";");
        System.out.println("cheese: " + cheese + ";");
        System.out.println("greens: " + greens + ";");
        System.out.println("mayonnaise: " + mayonnaise + ".");
        System.out.println("");
    }

    public Burger(String name, String mayonnaise) {
        name = "Diet Burger";
        meat = "Yes";
        mayonnaise = "No";

        System.out.println("Burger name: " + "'" + name + "'");
        System.out.println("bun: " + bun + ";");
        System.out.println("meat: " + meat + ";");
        System.out.println("cheese: " + cheese + ";");
        System.out.println("greens: " + greens + ";");
        System.out.println("mayonnaise: " + mayonnaise + ".");
        System.out.println("");
    }

    public Burger(String meat) {
        name = "Double Burger";
        meat = "Double";
        mayonnaise = "Yes";

        System.out.println("Burger name: " + "'" + name + "'");
        System.out.println("bun: " + bun + ";");
        System.out.println("meat: " + meat + ";");
        System.out.println("cheese: " + cheese + ";");
        System.out.println("greens: " + greens + ";");
        System.out.println("mayonnaise: " + mayonnaise + ".");
        System.out.println("");
    }
}

//Сделать класс BurgerMain, в котором создать три разных бургера. Их состав будет автоматически выводиться на экран при запуске программы.

public class BurgerMain {
    public static void main(String[] arg) {
        new Burger();
        new Burger("", "");
        new Burger("");
    }
}
