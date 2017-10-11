package practice2;

public class Group {
    public static void main(String[] args) {

    System.out.print("Insert number of people :");
    Integer num1 = TextIO.getlnInt();
    System.out.print("Insert group size :");
    Integer num2 = TextIO.getlnInt();

    System.out.println("There are full groups of " + num1/num2 + " people");



    }
}
