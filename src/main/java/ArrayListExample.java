import java.util.ArrayList;
import java.util.Random;

public class ArrayListExample {
    static Random random = new Random();

    public static void main(String[] args) {
        createArray();
        System.out.println();
        searchOfEvenNumber(createArray());

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int a = random.nextInt(10);
            list.add(a);
        }
        System.out.println(list);
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list2.add(list.get(i));
            }
        }
        System.out.println(list2);
    }
    public static ArrayList<Integer> createArray() {
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int a = random.nextInt(20);
            array.add(a);
        }
        for (Integer k : array) {
            System.out.print(k + " ");
        }
        return array;
    }
    public static ArrayList<Integer> searchOfEvenNumber(ArrayList<Integer> arr) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0) {
                nums.add(arr.get(i));
            }
        }
        return nums;
    }
}


