import java.util.Scanner;
public class AccessArrayElement {
    public static void main(String[] args) {
        int[] arr = {101, 202, 302, 401, 505};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index: ");
        int index = sc.nextInt();
        if (index >= 0 && index < arr.length) {
            System.out.println("Element at index " + index + " is: " + arr[index]);
        } else {
            System.out.println("Invalid index! Please enter a value between 0 and " + (arr.length - 1));
     }
    sc.close();
    }
}
