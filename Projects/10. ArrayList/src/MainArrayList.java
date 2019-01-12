public class MainArrayList {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        list1.add("Marsel");
        list1.add("Hello");
        list1.add("How");

        ArrayList list2 = new ArrayList();
        list2.add("Igor");
        list2.add("Hello");
        list2.add("All okey?");

        list1.add("hello");

        list1.print();
        list2.print();
    }
}
