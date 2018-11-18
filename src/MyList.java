public class MyList {

    private Object[] list;
    private int capacity;
    private int listSize;
    public static final int DEFAULT_CAPACITY = 100;

    //Constructors
    public MyList() {
        this(DEFAULT_CAPACITY);
    }

    public MyList(int capacity) {
        this.capacity = capacity;
        list = new Object[capacity];
        listSize = 0;
    }

    //Methods
    public void add(Object element) {
        if (listSize == capacity) {
            throw new IllegalArgumentException("list capacity exceeded");
        }
        list[listSize] = element;
        listSize++;
    }

    public void addAt(int index, Object element) {
        if (listSize == capacity) {
            throw new IllegalArgumentException("list capacity exceeded");
        }
        if (index < 0 || index >= listSize) {
            throw new IndexOutOfBoundsException("index out of bounds");
        }
        if (listSize - index >= 0) {
            System.arraycopy(list, index, list, index + 1, listSize - index);
        }
        list[index] = element;
        listSize++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= listSize) {
            throw new IndexOutOfBoundsException("index out of bounds");
        }
        for (int i = index; i < listSize - 1; i++) {
            list[i] = list[i + 1];
        }
        list[listSize - 1] = null;
        listSize--;
    }

    public Object getAtIndex(int index) {
        if (index < 0 || index >= listSize) {
            throw new IndexOutOfBoundsException("index out of bounds");
        }
        return list[index];
    }

    public Object getEntireList() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < listSize; i++) {
            if (i == listSize - 1) {
                builder.append(list[i]);
            } else {
                builder.append(list[i]);
                builder.append(", ");
            }
        }
        builder.append("]");
        return builder.toString();
    }
}
