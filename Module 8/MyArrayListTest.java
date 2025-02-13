package Module_8;

// Carmen Mendoza
// CSD 402 

import java.util.ArrayList;
import java.util.Scanner;

public class MyArrayListTest {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        
        System.out.println("Enter integers (0 to stop and include in list):");
        while (true) {
            int num = scanner.nextInt();
            numbers.add(num);
            if (num == 0) {
                break;
            }
        }
        
        scanner.close();
        
        int maxNumber = max(numbers);
        System.out.println("The largest number in the list is: " + maxNumber);
    }
    
    public static Integer max(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }
        
        int max = list.get(0);
        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}

