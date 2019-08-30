package Part_2;

public class P2_E4 {
    public static void main(String[] args) {
        double num, sroot, rerr;
        for (num=1.0; num < 10; num++){
            sroot =Math.sqrt(num);
            System.out.println("Корень из "+ num + " равен " + sroot);

            // Округление
            rerr = num - (sroot*sroot);
            System.out.println( "Округление = "+ rerr);
            System.out.println();
        }

    }
}
