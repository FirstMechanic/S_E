package Part_1;

public class P1_E3 {
    public static void main(String[] args) {
        /*
        Таблиця переведення доларов в грн
         */
    double dol, grn;
    int count;
        count = 0; //треба це писать, не забувать
                // в числах должна точка стоять, не кома

        for (dol = 1; dol <= 100; dol++) {
                 grn = dol * 25.32;
                 System.out.println( dol + " долар, равен " + grn + " гривен");
                 count++;

             if (count == 10) {
             count = 0;
             System.out.println();
    }
    }




    }
}
