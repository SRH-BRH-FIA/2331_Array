public class Main {

    // Aufrauf dieser Methode erfolgt per Call-By-Reference
    // d.h. es handelt sich um die identische Variable wie vom Aufrufer
    private static void machWasMitDemArray(double[] feld) {
        System.out.println("Der 7. Eintrag = " + feld[6] );

        feld[0] = -13;
    }

    // Aufgabe: Mittelwert berechnen und an erster Stelle speichern
    public static void mittelwertBerechnen(double[] werte) {
        //werte.length: gibt die Größe des Arrays an
        double summe = 0.0;
        for (int i=0; i < werte.length; i++) {
            summe += werte[i];
        }
        double mittelwert = summe / werte.length;
        werte[0] = mittelwert;
    }

    public static void main(String[] args) {

        // Ein Array!
        // Konvention: Index startet bei 0 !
        //  Index größer als Dimension führt zu Fehler!
        double[] monat = { 17, 13, 38, 23 };
        // Index            0   1   2   3

        double[] tag = new double[ 365 ];

        for (int i=0; i<=3; i++) {
            System.out.println( monat[ i ] );
        }
        for (int i=0; i<365; i++) {
            System.out.print(tag[i] + ",");
        }
        System.out.println();

        tag[6] = 42.9;
        // Ausgabe des 7. Elements vom tag-Array
        System.out.println( tag[6] );

        machWasMitDemArray( tag );

        System.out.println("Das 1. Element vom Array tag: " + tag[0]);

        mittelwertBerechnen( monat );
        System.out.println("Der Mittelwert des Monatsarrays ist " +
                monat[0]);

        mittelwertBerechnen( tag );
        System.out.println("Der Mittelwert des Tagarrays ist " +
                tag[0]);
    }

}
