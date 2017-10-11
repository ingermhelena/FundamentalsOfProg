package practice2;

public class Name {
    public static void main(String[] args) {

        System.out.print("Insert your name: ");
        String name = TextIO.getlnString();

        int nameLength = name.length();
        System.out.println(nameLength);
        System.out.println("four".length());
    }
}
