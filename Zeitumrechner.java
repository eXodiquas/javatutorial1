class Zeitumrechner {
    
    public static void main(String[] args) {

        //Eingabe der Zeit in Sekunden.
        int zeit = 75844;

        //Umrechnung der Zeit in ganze Stunden.
        int stunden = zeit / 3600;
        //Umrechnung der Zeit, minus den Sekunden die bereits in Stunden stecken, in Minuten.
        int minuten = (zeit - stunden * 3600) / 60;
        //Umrechnung der Zeit, minus den Sekunden die bereits in den Stunden und den Minuten stecken, in Sekunden.
        int sekunden = zeit - stunden * 3600 - minuten * 60;

        //Ausgabe des Ergebnisses auf der Kommandozeile.
        System.out.println(stunden + " Stunde(n), " + minuten + " Minute(n) und " + sekunden + " Sekunde(n).");
    }
}