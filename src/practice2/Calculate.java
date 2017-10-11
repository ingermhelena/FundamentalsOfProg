package practice2;

public class Calculate {
    public static void main(String[] args) {

        System.out.print("Kirjuta nr:");
        Integer num1 = TextIO.getlnInt();
        System.out.print("Kirjuta teine nr:");
        Integer num2 = TextIO.getlnInt();

        System.out.println(num1 + "*" + num2 + " = " + num1*num2);



    }

}
