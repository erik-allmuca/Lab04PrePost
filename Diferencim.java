public class MenaxhimiStokut {
    public static void main(String[] args) {
        int shitje1 = 55; 
        double teArdhura = 1000.0;
        double bonus = 0.0;
        int stoku = 15;


        if (shitje1 > 50) {
            bonus += 0.03 * teArdhura;
            System.out.println("Bonus shtuar me += : " + bonus);
        }


        int sasiaShitur = 7;
        for (int i = 0; i < sasiaShitur; i++) {
            stoku--;
            System.out.println("Stoku zbritur me -- : " + stoku);
            if (stoku < 10) {
                System.out.println("Paralajmërim: Stoku poshtë limitit minimal (10)!");
            }
        }
    }
}
