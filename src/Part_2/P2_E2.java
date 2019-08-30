package Part_2;

public class P2_E2 {
    public static void main(String[] args) {
         int i;

         for (i=0; i<=3; i++)
         switch (i) {
             case 0:
                 System.out.println("i = 0");
             case 1:
                 System.out.println("i=1");
                 break;

             case 2:
                 System.out.println("i=2");
             case 3:
                 System.out.println("i=3");
                 System.out.println();

                 default:
                     System.out.println("STOP");

// По чудному воно робить, умов немає. Якщо без BREAK то виконується все

         }

    }
}
