class App2 {
    public static void main(String args[]){
            // numer studenta
        int index = 234121;

            //  oceny studenta
        byte [] grade = new byte[4];
        double [] halfGrade = new double[3];

        grade [0] = 4;
        grade [1] = 6;
        grade [2] = 1;
        grade [3] = 6;

        halfGrade [0] = 4.5;
        halfGrade [1] = 5.5;
        halfGrade [2] = 3.5;

            // wyświetlany tekst
        System.out.println("--------------------------------------------------");
        System.out.println("Student: "+index);
        System.out.print("Oceny z informatyki: "+grade[0]);
        System.out.print(", "+halfGrade[0]);
        System.out.print(", "+grade[1]);
        System.out.print(", "+halfGrade[1]);
        System.out.print(", "+grade[2]);
        System.out.print(", "+halfGrade[2]);
        System.out.println(", "+grade[3]);
        System.out.println("--------------------------------------------------");



    }
}