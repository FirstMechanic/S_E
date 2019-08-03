package Part_1;

public class P1_E12 {
    public static void main(String args[])
            throws java.io.IOException {
        int i;
        System.out.println("Для остановки нажмите клавишу S");
        for (i = 1; (char) System.in.read() != 'S'; i++)
            System.out.println("Проход #" + i);
        //Туго робить
        //чот не то
    }
}
