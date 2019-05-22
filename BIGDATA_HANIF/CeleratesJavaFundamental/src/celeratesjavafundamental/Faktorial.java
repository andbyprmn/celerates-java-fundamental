package celeratesjavafundamental;

/**
 *
 * @author andbyprmn
 */
public class Faktorial {
    
    public static void main(String[] args) {
        long batas = 4;
        long faktorial;
        
        System.out.println(0+"!"+" adalah = "+1);
        for (int i = 1; i < batas; i++) {
            faktorial = i;
            for (int faktor = 2; faktor < i; faktor++)
                faktorial*=faktor;
            
            System.out.println(i+"!"+" adalah = "+faktorial);
        }
        
        
    }
    
}
