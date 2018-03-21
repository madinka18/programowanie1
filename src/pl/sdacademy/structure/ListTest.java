package pl.sdacademy.structure;

public class ListTest {

    public static void main(String[] args) {


        OneWayList lista = new OneWayList();
        Node jan = new Node("Jan");
        Node maria = new Node("Maria");
        Node adam = new Node("Adam");


        lista.add(jan);
        lista.add(maria);
        lista.add(adam);
        lista.add(new Node("Michał"));
        lista.add(new Node("Monika"));

        System.out.println(lista);

        lista.remove(4);

        System.out.println(lista);

    }
}