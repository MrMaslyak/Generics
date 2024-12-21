import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UniqueElements<String> uniqueElements = new UniqueElements<>();
        uniqueElements.add("Hello");
        uniqueElements.add("World");
        uniqueElements.add("!");
        uniqueElements.print();
        uniqueElements.contains("Hello");
        System.out.println("----------------------------------------------------------------");
        UniqueElements<Integer> uniqueElements2 = new UniqueElements<>();
        uniqueElements2.add(1);
        uniqueElements2.add(2);
        uniqueElements2.add(3);
        uniqueElements2.print();
        uniqueElements2.contains(4);
        System.out.println("----------------------------------------------------------------");
        List<Integer> integers = List.of(-5, 3, 8, 1);
        System.out.println(findMax(integers));
        List<String> strings = List.of("Hello", "World", "!");
        System.out.println(findMax(strings));
        List<Double> doubles = List.of(1.5, 2.5, 3.5);
        System.out.println(findMax(doubles));
        System.out.println("----------------------------------------------------------------");
        List<Integer> integer = List.of(1,2,3,4);
        System.out.println(reverse(integer));

    }

    public static <T extends Comparable<T>> T findMax(List<T> elements) {
        if (elements.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }

        T max = elements.get(0);
        for (T element : elements) {
            if (element == null) {
                throw new IllegalArgumentException("List contains null element");
            }
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public static <T> List<T> reverse(List<T> list){
        List<T> reversedList = new ArrayList<>(list.size());
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }


}