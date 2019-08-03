package Part_1;

public class P1_E7 {
    public static void main(String[] args)


    throws java.io.IOException{


        char ch, answer='H';

        System.out.println("Задумана буква A-Z.");
        System.out.println("Попытайся угадать: ");

        ch = (char) System.in.read();

        if(ch==answer) System.out.println("Ты угадал! Поздравляю!");
        else System.out.println("Увы, попытайя еще...");

// Все работает, регистр учитывать нужно
    }
}
