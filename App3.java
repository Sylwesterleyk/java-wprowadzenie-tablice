class App3 {
    public static void main(String args[]){
            //stworzenie tablicy
        int [] grade = new int [5];

            // przypisanie wartości 1-3 do indeksów tablicy
        grade[0] = 1;
        grade[1] = 1;
        grade[2] = 3;
        grade[3] = 2;
        grade[4] = 2;

            // wyświetlenie wszystkich domyślych ocen
        System.out.println("----------------------------------------------");
        System.out.print("Oceny z matematyki przed zmianą: ");
        System.out.print(""+grade[0]);
        System.out.print(", "+grade[1]);
        System.out.print(", "+grade[2]);
        System.out.print(", "+grade[3]);
        System.out.println(", "+grade[4]);
        System.out.println("----------------------------------------------");

             // wyświetlanie 3 ostatnich ocen
        System.out.print("Trzy ostatnie oceny: "+grade [4]);
        System.out.print(", "+grade[3]);
        System.out.println(", "+grade[2]);
        System.out.println("----------------------------------------------");

            //zmiana drugiej oceny na 5
            grade[1] = 5;

            System.out.print("Oceny z matematyki po zmianie: ");
            System.out.print("" + grade[0]);
            System.out.print(", " + grade[1]);
            System.out.print(", " + grade[2]);
            System.out.print(", " + grade[3]);
            System.out.println(", " + grade[4]);
        System.out.println("----------------------------------------------");

            // ułożenie ocen w tablicy w kolejności od najmniejszej do największej

        int tmp = grade[1];
        grade[1] = grade[4];
        grade[4] = tmp;

        int tmp2 = grade[2];
        grade[2] = grade[3];
        grade[3] = tmp2;

        System.out.print("Oceny ułożone rosnąco: ");
        System.out.print("" + grade[0]);
        System.out.print(", " + grade[1]);
        System.out.print(", " + grade[2]);
        System.out.print(", " + grade[3]);
        System.out.println(", " + grade[4]);
        System.out.println("----------------------------------------------");

    }
}