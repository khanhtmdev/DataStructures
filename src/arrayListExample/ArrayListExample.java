package arrayListExample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        // khai báo 1 ArrayList có tên là listString
        // có kiểu là String
        ArrayList<String> list = new ArrayList<>();

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
        for (String str : list) {
            System.out.println(str);
        }

        // sử dụng Iterator - hiển thị các phần tử của list
        Iterator<String> iterator = list.iterator();
        System.out.println("Các phần tử có trong list là: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

//        // sử dụng ListIterator - hiển thị các phần tử của list
//        ListIterator<String> listIterator = list.listIterator();
//        System.out.println("Các phần tử có trong list là: ");
//        while (listIterator.hasNext()) {
//            System.out.println(listIterator.next());
//        }

        System.out.println("ví dụ sử dụng phương thức addAll()");
        System.out.println("-----------------------------------");
        // thêm các phần tử của list vào listA
        ArrayList<String> listA = new ArrayList<>();
        listA.addAll(list);
        System.out.print("listA:");
        showList(listA);

        System.out.println("\nví dụ sử dụng phương thức retainAll()");
        System.out.println("-----------------------------------");
        // khởi tạo listB
        ArrayList<String> listB = new ArrayList<>();
        listB.add("Java");
        // xóa những phần tử không thuộc listB khỏi listA
        listA.retainAll(listB);
        System.out.print("listA:");
        showList(listA);

        System.out.println("\nví dụ sử dụng phương thức removeAll()");
        System.out.println("-----------------------------------");
        // xóa những phần tử thuộc listB  khỏi list
        list.removeAll(listB);
        System.out.print("list:");
        showList(list);

        // truy cập phần tử có chỉ số 3 của list
        System.out.println(list.get(3));

        // cập nhật giá trị cho phần tử có chỉ số là 3 (Java)
        list.set(3, "Python");
        System.out.println("list trước khi cập nhật: ");
        System.out.println(list);

        System.out.println("Số phần tử của list ban đầu : " + list);
        System.out.println("Các phần tử của list ban đầu: " + list.size());
        // remove phần tử có chỉ số index = 1 khỏi list
        list.remove(1);
        System.out.println("\nSố phần tử của list sau khi remove phan tu co index = 1: "
                + list);
        System.out.println("Các phần tử của list sau khi remove phan tu co index = 1: "
                + list.size());
        // remove phần tử "PHP" khỏi list
        list.remove("PHP");
        System.out.println("\nSố phần tử của list sau khi remove phan tu \"PHP\": "
                + list);
        System.out.println("Các phần tử của list sau khi remove phan tu \"PHP\": "
                + list.size());

        // kiểm tra xem PHP có tồn tại trong list hay không?
        System.out.println(list.contains("PHP"));
        // kiểm tra xem ANDROID có tồn tại trong list hay không?
        System.out.println(list.contains("ANDROID"));

        // kiểm tra xem Java có tồn tại trong list hay không?
        System.out.println(list.indexOf("Java"));
        // kiểm tra xem ANDROID có tồn tại trong list hay không?
        System.out.println(list.indexOf("ANDROID"));

    }

    public static void showList(ArrayList<String> list) {
        // Show list through for-each
        for (String obj : list) {
            System.out.print("\t" + obj + ", ");
        }
        System.out.println();
    }
}
