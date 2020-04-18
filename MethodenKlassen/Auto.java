class Auto {
    public static int anzahl_autos = 0;

    public String marke;
    public int ps;
    public int tueren;
    public double kofferraumvolumen;

    public Auto(String m, int p, int t, double k) {
        this.marke = m;
        this.ps = p;
        this.tueren = t;
        this.kofferraumvolumen = k;
        anzahl_autos += 1;
        System.out.println("Ich habe soeben ein Auto gebaut! Yippy!");
    }

    public void tunen(int anzahl) {
        this.ps += anzahl;
    }

    public void zerstoere() {
        anzahl_autos -= 1;
    }
}