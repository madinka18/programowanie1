package pl.sdacademy.structure;


public class OneWayList {
    private Node first;


    public void add(Node e) {
        if (first == null) {
            first = e;
        } else {
            first.addNext(e);
        }

    }


    @Override
    public String toString() {
        return "{" + first + "}";
    }


    public void remove(int index) {
        if (index == 0) {
            Node node = first.getNext();
            first.removeRef();
            first = node;
        } else {
            Node current = first;
            Node prev = null;
            for (int i = 0; i < index; i++){

                prev = current;
                current = current.getNext();
       }
            Node next = current.getNext();
            current.removeRef();
            prev.setNext(next);
        }
    }
}