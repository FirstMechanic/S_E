package Part_1;

public class P1_E13_do_while {
    public static void main(String[] args)
        throws java.io.IOException{

        char ch, ignor, answer = 'k';
        do {
            System.out.println("Задуманая буква A-Z.\n" + "Попробуй угадай.");
            ch = (char) System.in.read();

           do { ignor = (char) System.in.read(); }  while (ignor != '\n');
//Очищает буфер. Если без етого оно делает сразу пару цыклов.
            if (ch == answer) System.out.println("Правильно!");
            else {
                System.out.println("Извините, нужная буква находится");
                if (ch < answer) System.out.println("ближе к концу алфавита");
                else System.out.println("ближе к началу алфавита");
                System.out.println("Повторите попытку!\n"); }
        }
         while (answer !=ch);
    }
}
