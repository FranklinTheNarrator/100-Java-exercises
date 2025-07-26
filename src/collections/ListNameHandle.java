package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ListNameHandle {
    ArrayList<String> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public ArrayList<String> storeNames() {
        while (true) {
            String name = scanner.nextLine();

            if (name.equals("q")) {
                break;
            } else { list.add(name); }
        }

        return list;
    }

    public void printList() {
        for (String element : list) { System.out.println(element); }
    }
}
