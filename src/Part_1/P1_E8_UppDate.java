package Part_1;

public class P1_E8_UppDate {
    public static void main(String[] args)
        throws java.io.IOException {

        char ch, answer = 'B';

        System.out.println("Угадай букву, получи плюху: ");

        ch = (char) System.in.read();

        if (ch==answer) System.out.println("Получи плюху");
            else {
                System.out.println("Пробуй еще..");

            if (ch<answer) System.out.println("Ближе к началу алфавита");
                else System.out.println("Ближе к концу алфавита");




            }
    }
}
