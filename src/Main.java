import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> programmingLanguages = new LinkedList<>();
        programmingLanguages.add("Java");
        programmingLanguages.addFirst("Rust");
        programmingLanguages.addLast("JavaScript");
        programmingLanguages.add(0,"Python");
        System.out.println("Весь список ЯП: " + programmingLanguages);
        System.out.println("Первый элемент списка: " + programmingLanguages.peekFirst());
        System.out.println("Последний элемент списка: " +programmingLanguages.peekLast());
        System.out.println("Первый элемент списка с удалением: " +programmingLanguages.pollFirst());
        System.out.println("Последний элемент списка с удалением: " +programmingLanguages.pollLast() );
    }
}