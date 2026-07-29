# Basic Recursion (Java)

This directory contains implementations for fundamental recursion problems. 

Recursion is a core concept where a function calls itself to solve smaller instances of the same problem. These exercises are the foundation for mastering more advanced topics like Dynamic Programming, Backtracking, and Tree/Graph traversals.

---

## Topics Covered

- Base conditions (stopping the recursion)
- Parameterized vs Functional recursion
- Forward and backward recursive calls (e.g., printing 1 to N vs N to 1)
- Multiple recursive calls (e.g., reversing an array, palindrome)

---

# Problem Index

| # | Problem | Core Idea | Time | Space | Source |
|---|----------|-----------|------|-------|--------|
| 1 | Print Name N Times | Pass a counter and print string until counter reaches N | `O(N)` | `O(N)` | [rec1.java](./rec1.java) |
| 2 | Print 1 to N | Forward recursion: print `c`, then call `f(c + 1)` | `O(N)` | `O(N)` | [recincnum.java](./recincnum.java) |
| 3 | Print N to 1 | Backward recursion: print `n`, then call `f(n - 1)` | `O(N)` | `O(N)` | [recdecnum.java](./recdecnum.java) |
| 4 | Sum of First N Numbers | `f(n) = n + f(n - 1)` (Functional) or passing sum as parameter | `O(N)` | `O(N)` | [sumofn.java](./sumofn.java) |
| 5 | Factorial of N | `f(n) = n * f(n - 1)` | `O(N)` | `O(N)` | [factorial.java](./factorial.java) |
| 6 | Reverse Array | Swap `arr[left]` and `arr[right]`, then call `f(left+1, right-1)` | `O(N)` | `O(N)` | [recrevarray.java](./recrevarray.java) |
| 7 | Check Palindrome String | Compare `s[left]` and `s[right]`. If equal, call `f(left+1, right-1)` | `O(N)` | `O(N)` | [ispalindromeRec.java](./ispalindromeRec.java) |
| 8 | Nth Fibonacci Number | Multiple recursion calls: `f(n-1) + f(n-2)` | `O(2^N)` | `O(N)` | [Fibonacci.java](./Fibonacci.java) |

---

# Biggest Lessons Learned

While solving these basic recursion problems, I grasped the core mechanics of how recursive functions operate on the call stack:

### 1. The Base Condition
Every recursive function **must** have a base condition to prevent a stack overflow. It's the condition that tells the function when to stop calling itself and return.
```java
if (left >= right) {
    return true; // Base condition
}
```

### 2. Parameterized vs Functional Recursion
- **Parameterized**: The result is accumulated in a parameter and passed down the recursive calls. (e.g., `void solve(int i, int sum)`)
- **Functional**: The function expects the recursive call to return a value, and it uses that value to compute the final answer. (e.g., `int solve(int n) { return n * solve(n-1); }`)

### 3. State Management via Pointers
For arrays and strings, recursion often involves two pointers (like `left` and `right`). At each step, we process the elements at these pointers and move them inward.
```java
swap(arr[left], arr[right]);
solve(arr, left + 1, right - 1);
```

### 4. Backtracking (Printing 1 to N without `c+1`)
By placing the `System.out.println` *after* the recursive call, we can print from 1 to N even if our parameter counts down from N to 1. This happens because the printing is delayed until the function starts returning (unwinding the call stack).

---

### 5. Edge Cases & Gotchas
- **Stack Overflow**: The most common error in recursion. Always ensure the base case is reachable and inputs won't exceed the JVM's maximum stack depth.
- **Pass by Value vs Reference**: In Java, arrays are passed by reference, so modifying `arr` in a recursive call modifies the original array. Strings and primitives are passed by value, meaning they don't change in the caller's scope unless returned.
- **Multiple Recursion Time Complexity**: When a function calls itself multiple times (like in naive Fibonacci `f(n-1) + f(n-2)`), the time complexity grows exponentially, typically `O(2^N)`. This requires optimization (like Memoization in DP) for larger inputs.

---

# 📈 Revision Checklist

Can I write the recursive function for these without looking?

- [ ] Print Name N times
- [ ] Print 1 to N
- [ ] Print N to 1
- [ ] Sum of first N numbers (Parameterized & Functional)
- [ ] Factorial of N
- [ ] Reverse an array using recursion
- [ ] Check if a string is palindrome using recursion
- [ ] Find the Nth Fibonacci Number

---

**Status:** ✅ Completed
