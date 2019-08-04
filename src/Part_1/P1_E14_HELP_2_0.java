package Part_1;

public class P1_E14_HELP_2_0 {

    public static void main(String[] args)
        throws java.io.IOException {
            char ch, ignore;
        do {
            System.out.println("Справка:");
            System.out.println("    1. if");
            System.out.println("    2. switch");
            System.out.println("    3. for");
            System.out.println("    4. while");
            System.out.println("    5. do-while\n");
            System.out.println("Выберите: ");

            ch = (char) System.in.read();

            do { ignore = (char) System.in.read(); } while (ignore != '\n');

        } while (ch < '1' | ch > '5');
            switch (ch) {

                case '1':
                    System.out.println("Инструкция if:\n");
                    System.out.println("if(условие) инструкция;");
                    System.out.println("else инструкция;");
                    break;
                case '2':
                    System.out.println("Инструкция switch:\n");
                    System.out.println("switch(выражение) {");
                    System.out.println(" case константа;");
                    System.out.println(" последовательность инструкций");
                    System.out.println(" break;");
                    System.out.println(" // ...");
                    System.out.println("}");
                    break;
                case '3':
                    System.out.println("Цикл for:\n");
                    System.out.print("for(инициализация; условие; итерация)");
                    System.out.println(" инструкция;");
                    break;
                case '4' :
                    System.out.println("Цикл while:\n");
                    System.out.println("while(условие) инструкция;");
                    break;
                case '5' :
                    System.out.println("Цикл do-while: \n " );
                    System.out.println("do {");
                    System.out.println(" инструкция;");
                    System.out.println("} while (условие);");
                    break;
            }




    }
}
