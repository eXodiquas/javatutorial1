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
        
        int alter1 = 9;
        
        if(alter1 > 20) {
            System.out.println("Person ist bei der Arbeit.");
        } else if(alter1 > 6) {
            System.out.println("Person ist in der Schule.");
        } else if(alter1 == 0) {
            System.out.println("Person ist gerade geboren worden!");
        } else {
            System.out.println("Person ist im Kindergarten.");
        }

        int alter2 = 13;

        switch(alter2) {
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
        

        //bedingung ? fall1 : fall2

        int a = 16;
        int b = 15;
        int ternary = a>b?5:10;

        System.out.println(ternary);
    }
}






