import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in an array: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the elements of array A:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println("Enter the value of integer B:");
        int B=sc.nextInt();
        if (count(A,B))
        {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }
    public static boolean count(int[] A,int B) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (A[i] + A[j] == B) {
                    return true;
                }
            }
        }
        return false;
    }
}