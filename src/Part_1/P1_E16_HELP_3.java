package Part_1;

public class P1_E16_HELP_3 {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch, ignore;


     for(;;) {
         do {
             System.out.println("Справка:");
             System.out.println("    1. if");
             System.out.println("    2. switch");
             System.out.println("    3. for");
             System.out.println("    4. while");
             System.out.println("    5. do-while");
             System.out.println("    6. break");
             System.out.println("    7. continue\n");
             System.out.println("Выберите (q-EXIT): ");

             ch = (char) System.in.read();

             do {
                 ignore = (char) System.in.read();
             } while (ignore != '\n');

         } while (ch < '1' | ch > '7' & ch!= 'q');

         if (ch=='q') break;
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
             case '4':
                 System.out.println("Цикл while:\n");
                 System.out.println("while(условие) инструкция;");
                 break;
             case '5':
                 System.out.println("Цикл do-while: \n ");
                 System.out.println("do {");
                 System.out.println(" инструкция;");
                 System.out.println("} while (условие);");
                 break;
             case '6' :
                 System.out.println("Инструкция break:\n");
                 System.out.println("break; или break метка;");
                 break;
             case '7':
                 System.out.println("Инструкция continue:\n");
                 System.out.println("continue; или continue метка;");
                 break;
         }


     }
    }
}
