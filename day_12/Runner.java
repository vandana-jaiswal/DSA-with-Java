// leetcode problem solev q2

public class Runner {

    public static void main(String[] args) {
        int[] a = { 4, 6, 8 };
        int[] b = { 8, 7, 3 };

        int maxLength = Math.max(a.length, b.length);
        int[] newArr = new int[maxLength];
        int carry = 0;

        for (int i = 0; i < maxLength; i++) {
            int add = carry + a[i] + b[i];
            int r = add % 10;
            carry = (add - r) / 10;
            newArr[i] = r;
        }

        System.out.println(newArr);

        for(int j = 0; j < maxLength; j++) {
            System.out.println(newArr[j]);
        }
    }
}
