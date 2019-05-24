package celeratesjavafundamental;

/**
 *
 * @author andbyprmn
 */
public class Faktorial {
    
    public static void main(String[] args) {
        long batas = 4;
        long faktorial = 1;
        
        for (int i = 1; i < batas; i++) {
            faktorial = 1;
            for (int faktor = 1; faktor < i; faktor++)
                faktorial=i*faktor;
            
            System.out.println(i+"!"+" adalah = "+faktorial);
        }
        
    }
    
}
