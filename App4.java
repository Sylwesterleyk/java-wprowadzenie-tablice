class App4 {
    public static void main(String args[]) {

        // określenie rozmiaru tablicy
        char[][] crossword = new char[3][];
        crossword[0] = new char[4];
        crossword[1] = new char[3];
        crossword[2] = new char[6];

        //przypisanie konkretnych znaków do indeksów tablicy
        crossword[0][0] = 'w';
        crossword[0][1] = 'i';
        crossword[0][2] = 'l';
        crossword[0][3] = 'k';
        crossword[1][0] = 'k';
        crossword[1][1] = 'o';
        crossword[1][2] = 't';
        crossword[2][0] = 'ż';
        crossword[2][1] = 'y';
        crossword[2][2] = 'r';
        crossword[2][3] = 'a';
        crossword[2][4] = 'f';
        crossword[2][5] = 'a';

        //wyświetl trzecią literę drugiego hasła
        System.out.println("--------------------");
        System.out.println("Trzecia litera drugiego hasła: " + crossword[1][2]);

        //wyświetl pierwszą literę pierwszego hasła
        System.out.println("--------------------");
        System.out.println("Pierwsza litera trzeciego hasła: " + crossword[2][0]);

        //zamień ostatnią literętrzeciego hasła na y
        crossword[2][5] = 'y';

        //wyświetl długość drugiego hasła
        System.out.println("--------------------");
        System.out.println("Długość drugiego hasła: " + crossword[1].length);

        //wyświetl całą krzyżówkę

        System.out.println("--------------------");
        System.out.println("");
        System.out.println(crossword[0][0] + " " + crossword[0][1] + " " + crossword[0][2] + " " + crossword[0][3]);
        System.out.println(crossword[1][0] + " " + crossword[1][1] + " " + crossword[1][2]);
        System.out.println(crossword[2][0] + " " + crossword[2][1] + " " + crossword[2][2] + " " + crossword[2][3] + " " + crossword[2][4] + " " + crossword[2][5]);
        System.out.println("");
        System.out.println("--------------------");

    }
}