public class Main {
    public static void main(String[] args) {

        String s = "race a car";
        boolean isPalindrome = true;

        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        char[] arr = s.toCharArray();
        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome);

    }
}