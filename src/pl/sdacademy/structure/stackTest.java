package pl.sdacademy.structure;

public class stackTest {
    public static void main(String[] args) {
        stack Stack = new stack();
        Stack.push(6);
        Stack.push(7);
        Stack.push(8);
        Stack.push(9);
        Stack.push(10);


        Stack.print();

        System.out.println("    Zdejmuje : " + Stack.pop());

        Stack.print();

    }
}
