class Entscheidungen {
    
    public static void main(String[] args) {
        /*
            a < b  a kleiner b
            a > b  a größer b
            a <= b a kleiner gleich b
            a >= b a größer gleich b
            a == b a genau gleich b
            a != b a ungleich b
        */
        
        int alter = 9;
        
        if(alter > 20) {
            System.out.println("Person ist bei der Arbeit.");
        } else if(alter > 6) {
            System.out.println("Person ist in der Schule.");
        } else if(alter == 0) {
            System.out.println("Person ist gerade geboren worden!");
        } else {
            System.out.println("Person ist im Kindergarten.");
        }

        switch(alter) {
            case 9: 
                System.out.println("Person ist 9.");
                break;
            case 10:
                System.out.println("Person ist 10.");
                break;
            case 300:
                System.out.println("Person ist uralt.");
                break;
        }
    }
}






