public class DemoArithmetischeOperationen {

    // psvm+TAB
    // main+TAB
    // public static => bitte immer so verwenden
    public static void main(String[] args) {
        // Ganzzahlen: byte, short, int, long
        // Dezimalzahlen: (float), double
        // Wahrheitstyp: boolean (true, false)
        // Character: char

        int number = 37; // Deklaration, Initialisierung
        double pi;          // Deklaration
        pi = 3.1415;        // Initialisierung

        // Operatoren
        // +, -, *, /
        // % ==> Modulo

        int perfectNumber = 42;

        int erg;    // Deklaration
        erg = number + perfectNumber; // Zuweisung passiert immer von rechts nach links

        //soutv
        System.out.println("erg = " + erg);

        erg = 27 % 10;
        System.out.println("27 modulo 10 = " + erg);

        //double erg = 27.12; Variablenamen müssen immer eindeutig sein!!
        // = => Zuweisungsoperator
        //erg = erg * 8;
        System.out.println("erg * 8 = " + (erg * 8));

        printInvoiceAmount(2.4);

        printInteger(129);
    }

    // Methode => Unterprogramm, Prozedur, Function, "sub"
    // public static => ist fix, wenn wir direkt in der main-Anwendung programmieren
    // Rückgabewert => nichts => void, spezieller Datentyp (int, double, ...)
    // Namen => Naming Convention => camelCase
    // Parameterliste => Die Variablen, welche die Methode (ich)
    //      benötigt, um die Aufgabe zu erfüllen
    public static void printInteger(int number) {
        //System.out.println("printInteger: " + number);
        printInvoiceAmount(number);
        System.out.println("printInteger ist nun fertig!");
    }

    public static void printInvoiceAmount(double amount){
        System.out.println("Nettowert: -----" + amount + " EUR");
        double tax = calculateSalesTax(amount);
        System.out.println("Mwst:  -----" + tax + " EUR");
        System.out.println("Gesamtbetrag:  -----" + (amount + tax) + " EUR");
    }

    // retourniert einen Double
    // alle Methoden mit Rückgabewert, benötigen ein return
    public static double calculateSalesTax(double amount) {
        double tax;
        tax = amount / 100 * 20;
        return tax;
    }

    // wichtig für die Eindeutigkeit einer Methode => name + parameter
    public static double calculateSalesTax(double amount, int tax) {
        double erg = amount / 100 * tax;
        return erg;
    }

    public static double calculateSalesTax2(double amount, int tax) {
        return amount / 100 * tax; // return + berechnung in einer Zeile
    }

    // calculateSalesTax, calculateSalesTax2, calculateSalesTax3 machen das Gleiche!
    public static double calculateSalesTax3(double amount, int tax) { return amount / 100 * tax;  }



}
