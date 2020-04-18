class Rechteck {
    private int seiteA;
    private int seiteB;

    public Rechteck(int a, int b) {
        this.seiteA = a;
        this.seiteB = b;
    }
    
    public int flaecheninhalt() {
        return this.seiteA * this.seiteB;
    }

    //Diese Methode gibt mir den Umfang des Rechtecks zurück!
    public int umfang() {
        return 2 * this.seiteA + 2 * this.seiteB;
    }

    public void setzeSeiteA(int a) {
        if(a > 10) {
            this.seiteA = 10;
        } else {
            this.seiteA = a;
        }
    }

    public int gebeSeiteA() {
        return this.seiteA;
    }

    public String toString() {
        return "Seite A: " + this.seiteA + " Seite B: " + this.seiteB;
    }
}