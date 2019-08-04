package Part_1;

public class P1_E15 {
    public static void main(String[] args) {
        /*
        int a, b;
        a=10;
        b=a%3;
        System.out.println(b);
*/
        int i;
        for (i=0; i<100; i++)
        {

            if ((i%3) != 0) continue;
            System.out.println(i);
        }




    }
}
