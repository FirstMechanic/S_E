package Part_1;

public class P1_E10_HELP {
    public static void main(String[] args)

        throws java.io.IOException {


        System.out.println("Выберите: ");
        System.out.println("    1. if");
        System.out.println("    2. switch");
        char ch;

        ch = (char) System.in.read();

        switch (ch){

            case '1':
                System.out.println("Инструкция if:\n");
                System.out.println("if(условие) инструкция;");
                System.out.println("else инструкция;");
                break;
            case '2':
                        System.out.println("Инструкция switch:\n");
                        System.out.println("switch(выражение) {");
                        System.out.println(" case константа:");
                        System.out.println(" последовательность инструкций");
                        System.out.println(" break;");
                        System.out.println(" // ...");
                        System.out.println("}");
                        break;
            default:
                System.out.println("Запрос не найден");

                }



    }
}
