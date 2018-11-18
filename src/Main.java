public class Main {

    public static void main(String[] args) {

        MyList mylist = new MyList(5);
        mylist.add("element 0");
        mylist.add("element 1");
        mylist.add("element 2");
        mylist.add("element 3");
        mylist.add("element 4");

        int indexOfRetrievedElement = 0;
        System.out.println("This is what you selected: [" + mylist.get(indexOfRetrievedElement) + "]");
        System.out.println("This is the entire list: " + mylist.getEntireList());

        int indexOfDeletedElement = 1;
        System.out.println("\nDeleted: [" + mylist.get(indexOfDeletedElement) + "]");
        mylist.deleteAtIndex(indexOfDeletedElement);
        System.out.println("This is the entire list: " + mylist.getEntireList());

        int indexOfAddedElement = 3;
        System.out.println("\nAdd element at index " + indexOfAddedElement);
        mylist.addAt(indexOfAddedElement, "new element");
        System.out.println("This is the entire list: " + mylist.getEntireList());
    }
}
