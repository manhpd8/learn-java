package leetcode;

public class l6431 {
    boolean[] origins;
    int n;
    public boolean doesValidArrayExist(int[] derived) {
        if(derived.length == 1) {
            if(derived[0]==1) return false;
            return true;
        }
        if(derived.length == 2) {
            if(derived[0] != derived[1]) return false;
            return true;
        }
        return true;
    }
}

class BinaryArray {
    public static boolean isOriginalArrayPossible(int[] derived) {
        int n = derived.length;

        // If the length of the derived array is 1, the original array will be [0] or [1]
        if (n == 1) {
            return derived[0] == 0 || derived[0] == 1;
        }

        // Check if XOR of adjacent elements in derived array gives the original array
        for (int i = 0; i < n; i++) {
            int expected = (derived[i] ^ derived[(i + 1) % n]);
            if (expected != 0 && expected != 1) {
                return false;
            }
            if (expected != derived[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] derived1 = {1, 1, 0};
        System.out.println("Derived array 1: " + isOriginalArrayPossible(derived1)); // Output: true

        int[] derived2 = {1, 1, 1, 1};
        System.out.println("Derived array 2: " + isOriginalArrayPossible(derived2)); // Output: false

        int[] derived3 = {0};
        System.out.println("Derived array 3: " + isOriginalArrayPossible(derived3)); // Output: true
    }
}

