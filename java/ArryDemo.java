import java.util.Scanner;
import java.util.Arrays;
public class ArrayDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;
//        System.out.println("Enter" + arr.length + " elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=1 + (int) (Math.random()*100);
//            arr[i] = in.nextInt();
            sum += arr[i];
        }
        for (int i : arr)
            System.out.println(i);
        System.out.println("sum of arr elements:" + sum);
        System.out.println("avg of arr elements:" + (sum / arr.length));
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("min:" + min + "max:" + max);
        System.out.println("please enter the element to search");
        int x = in.nextInt();
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                System.out.println(x + "is founded at index:" + i);
                flag = true;
                break;
            }
        }
        if (flag == false)
            System.out.println(x + "is not founded");
        Arrays.sort(arr);
        System.out.println("shorted array");
        for (int i:arr)
        System.out.println(i);


    }

}
