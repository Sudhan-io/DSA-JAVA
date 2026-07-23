# Basic Maths (Java)

This directory contains implementations for fundamental mathematical algorithms commonly used in problem-solving.

These problems serve as building blocks for logic building, handling edge cases (like trailing zeros or negative numbers), and understanding time complexity optimization (like `O(sqrt(N))`).

---

## Topics Covered

- Number extraction (`% 10` and `/ 10`)
- Reverse logic
- Time complexity optimization (`sqrt(N)` approaches)
- GCD / HCF (Euclidean algorithm)
- Mathematical series and checks (Prime, Armstrong, Palindrome)

---

# Problem Index

| # | Problem | Core Idea | Time | Space | Source |
|---|----------|-----------|------|-------|--------|
| 1 | Count Digits | Successively divide by 10 (`n /= 10`) or use `Math.log10(n) + 1` | `O(log10(N))` | `O(1)` | [digitsofno.java](./digitsofno.java) |
| 2 | All Divisors | Iterate up to `sqrt(N)` to find pairs of divisors in `O(sqrt(N))` time | `O(√N)` | `O(1)` | [divs.java](./divs.java) |
| 3 | GCD / HCF | Euclidean Algorithm: `gcd(a, b) = gcd(a % b, b)` until one becomes 0 | `O(log(min(a,b)))` | `O(1)` | [gcdoftwonum.java](./gcdoftwonum.java) |
| 4 | Armstrong Number | Sum of digits each raised to the power of total digits equals original number | `O(log10(N))` | `O(1)` | [isarmstrong.java](./isarmstrong.java) |
| 5 | Palindrome Number | Check if reverse of the number equals the original number | `O(log10(N))` | `O(1)` | [ispalindrome.java](./ispalindrome.java) |
| 6 | Prime Number Check | A prime has exactly 2 divisors (1 and itself). Loop up to `sqrt(N)` | `O(√N)` | `O(1)` | [isprime.java](./isprime.java) |
| 7 | Reverse Number | Repeatedly extract last digit (`% 10`) and append to reversed number (`rev = rev * 10 + digit`) | `O(log10(N))` | `O(1)` | [revnum.java](./revnum.java) |

---

# Biggest Lessons Learned

While solving these math problems, I learned that basic mathematical operations are incredibly powerful when combined with loops:

### 1. Extracting Digits
To peel off digits from a number one by one, use the modulo and division operators:
```java
int lastDigit = n % 10;
n = n / 10;
```

### 2. Building/Reversing a Number
To append a digit to the end of a new number:
```java
reversedNumber = (reversedNumber * 10) + lastDigit;
```

### 3. The `sqrt(N)` Optimization
For finding divisors or checking primes, you rarely need to iterate up to `N`. Iterating up to `sqrt(N)` is sufficient because divisors exist in pairs (`a * b = N`). If `a <= sqrt(N)`, then `b` will naturally be `>= sqrt(N)`.
```java
for (int i = 1; i <= Math.sqrt(n); i++) {
    // Check divisibility
}
```

### 4. Euclidean Algorithm (GCD)
The fastest way to compute the Greatest Common Divisor is by repeatedly taking the modulo:
```text
gcd(a, b) = gcd(a % b, b) (where a > b)
Keep doing this until one number is 0. The other number is the GCD.
```

---

### 5. Edge Cases & Gotchas
- **Negative Numbers**: When reversing a number or checking for palindromes, negative numbers behave differently. Modulo of a negative number in Java retains the sign, which can cause unexpected results.
- **Integer Overflow**: Reversing a 32-bit integer might cause it to exceed `Integer.MAX_VALUE` (or drop below `Integer.MIN_VALUE`). Always keep bounds in mind for reverse algorithms.

---

# 📈 Revision Checklist

Can I write the optimized approach for these without looking?

- [ ] Count Digits (Logarithmic approach)
- [ ] Reverse Number
- [ ] Palindrome Number
- [ ] Armstrong Number
- [ ] Print all Divisors (in `O(sqrt(N))` time)
- [ ] Check for Prime (in `O(sqrt(N))` time)
- [ ] GCD / HCF (using Euclidean Algorithm)

---

**Status:** ✅ Completed
