package es.upm.miw.pd.doo.colops;


public class Main {

    public static void main(String[] args) {
        Operations operations = new Operations();
        operations.add(new Summation(3, 4));

        System.out.println("Total_1: " + operations.total());

        operations.add(new Subtraction(1, 1));
        operations.add(new Summation(3, 5));
        operations.add(new Subtraction(4, 1));
        operations.add(new Summation(3, 6));
        operations.add(new Subtraction(3, 2));

        System.out.println("Total_2: " + operations.total());
        
        operations.reset();
        operations.add(new Subtraction(4, 1));
        operations.add(new Multiplication(3, 6));
        operations.add(new Subtraction(3, 2));

        System.out.println("Total_3: " + operations.total());
    }

}