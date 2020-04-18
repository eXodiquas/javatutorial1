import java.util.*; 

class MethodenKlassen {

    public static void main(String[] args) { 
        Rechteck[] rechtarr = new Rechteck[3];

        Rechteck r1 = new Rechteck(3, 6);
        Rechteck r2 = new Rechteck(5, 7);
        Quadrat r3 = null;

        rechtarr[0] = r1;
        rechtarr[1] = r2;
        rechtarr[2] = r3;

        for(int i = 0; i < rechtarr.length; i++) {
            if(rechtarr[i] != null) {
                System.out.println(rechtarr[i].umfang());
            } else {
                System.out.println("An dieser Stelle wäre null gestanden.");
            }
        }

        
    }
}