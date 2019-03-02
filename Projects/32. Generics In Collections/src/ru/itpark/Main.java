package ru.itpark;

public class Main {

    public static void main(String[] args) {
	    MyCollection<String> collection = new MyLinkedList<>();
	    collection.addFirst("Hello");
	    collection.addFirst("Bye");
	    collection.addFirst("Marsel");

	    MyIterator<String> iterator = collection.iterator();

	    while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
