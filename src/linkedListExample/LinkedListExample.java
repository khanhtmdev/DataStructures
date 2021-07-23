package linkedListExample;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // khai báo 1 LinkedList có tên là listString
        // có kiểu là String
        LinkedList<String> list = new LinkedList<>();

        // thêm các phần tử vào list
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");

        // hiển thị các phần tử của list
        System.out.println("Các phần tử có trong list là: ");
        System.out.println(list);

        // sử dụng vòng lặp for - hiển thị các phần tử của list
        System.out.println("Các phần tử có trong list là: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // sử dụng Iterator - hiển thị các phần tử của list
        Iterator<String> iterator = list.iterator();
        System.out.println("Các phần tử có trong list là: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
