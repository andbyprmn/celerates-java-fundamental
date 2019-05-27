package celeratesjavafundamental;

/**
 *
 * @author andbyprmn
 */
public class Faktorial {
    
    public static void main(String[] args) {
        long batas = 4;
        long faktorial = 0;
        
//        for (int i = 0; i < 1; i++) {
//            faktorial = 1;
//            System.out.println(i+"!"+" adalah = "+faktorial);
//        }
            for (int faktor = 0; faktor < 2; faktor++){
                faktorial = 1;
                System.out.println(faktor+"!"+" adalah = "+faktorial);
        }
            for (int faktor2 = 2; faktor2 < batas; faktor2++){
                faktorial = faktor2 * faktorial;
                System.out.println(faktor2+"!"+" adalah = "+faktorial);
        }
    }


//        for(int i = 1; i <= batas; i++){
//            faktorial = i * faktorial;
//            System.out.println(i+"!"+" adalah = "+faktorial);
//        }
    }

