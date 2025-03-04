# 📚 Java Placement Preparation Guide

A curated list of Java logics essential for placement preparation. Each topic is crafted with concise examples and explanations to enhance your understanding and make your coding journey smoother. 🚀

---

## ✨ Topics Covered

- **Anagram**
- **Compare Strings in Java.**
- **Find Duplicates in Array.**
- **LCM Finder.**
- **Palindrome in String.**
- **Print All Divisors.**
- **Reverse Word in String.**
- **String and String Buffer.**
- **Anagram Method 2**
- **Count Words in a String.**
- **First Non-Repeated Character**
- **Median of an Array.**
- **Prime Number Checker**
- **Remove Duplicates from String**
- **Reversing Number.**
- **String Palindrome Checker**
- **Armstrong Number**
- **Fibonacci Series**
- **Greatest Common Divisor**
- **Palindrome**
- **Print Alternative Numbers**
- **Reverse Array**
- **Streams**
- **Ways to Print Elements in Java.**

---

## 🛠️ Java Concepts and Code Snippets

### 1. **Anagram.**
```java
import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String str1, String str2) {
        char[] arr1 = str1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] arr2 = str2.replaceAll("\\s", "").toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent")); // true
    }
}
```

### 2. **Compare Strings in Java.**
```java
public class CompareStrings {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "java";

        // Case-sensitive comparison
        System.out.println(str1.equals(str2)); // false

        // Case-insensitive comparison
        System.out.println(str1.equalsIgnoreCase(str2)); // true
    }
}
```

### 3. **Find Duplicates in Array.**
```java
import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 1};
        HashSet<Integer> duplicates = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    duplicates.add(arr[i]);
                }
            }
        }

        System.out.println("Duplicates: " + duplicates);
    }
}
```

### 4. **LCM Finder.**
```java
public class LCMFinder {
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        System.out.println("LCM of 12 and 15: " + lcm(12, 15)); // 60
    }
}
```

### 5. **Palindrome in String**
```java
public class Palindrome {
    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam")); // true
    }
}
```

---

## 🎨 Beautiful UI for GitHub

### Markdown Styling Tips
1. **Emojis**: Add emojis to headers and bullet points for a vibrant appearance.
2. **Code Blocks**: Use syntax highlighting for Java with triple backticks and `java`.
3. **Sections**: Use horizontal rules (`---`) to separate sections.
4. **Lists**: Combine ordered and unordered lists to organize content.

---

## 🌟 Additional Features
- **Clear Explanations** for each logic.
- **Compact Code Snippets** for quick understanding.
- **Interactive Examples** where applicable.

Happy coding and best of luck with your placements! 🎉
