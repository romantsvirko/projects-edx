package examples;

//import java.util.Scanner;

public class TestRevised {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;
        String str1 = "Frodo Baggins";
        System.out.println(str1.replace("r", "range"));
        //String three = "1";
        //int number = 20;
        z = mystery(x, z, y);
        System.out.println(x + " " + y + " " + z);
        x = mystery(z, z, x);
        System.out.println(x + " " + y + " " + z);
        y = mystery(y, y, z);
        System.out.println(x + " " + y + " " + z);

    }
    public static int mystery(int z, int x, int y) {
        z--;
        x = 2 * y + z;
        y = x - 1;
        System.out.println(y + " " + z);
        return x;
    }
}
