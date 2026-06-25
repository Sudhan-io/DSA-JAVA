# Pattern Printing (Java)

This directory contains my implementations of the classic pattern printing problems commonly used to develop a strong understanding of nested loops and iteration.

These exercises serve as the foundation for matrix traversal, coordinate-based thinking, and many introductory DSA problems.

---

## Topics Covered

- Nested loops
- Row and column relationships
- Space management
- Symmetry
- Number patterns
- Character patterns
- Boundary conditions
- Mathematical observations

---

# Pattern Index

| # | Pattern | Core Idea | Source |
|---|----------|-----------|--------|
| 1 | Square Pattern | Fixed rows × fixed columns | [star1.java](./star1.java) |
| 2 | Increasing Triangle | Columns depend on current row (`j <= i`) | [star2.java](./Star2.java) |
| 3 | Increasing Number Triangle | Print column number instead of `*` | [star3.java](./star3.java) |
| 4 | Repeating Number Triangle | Print current row number | [star4.java](./star4.java) |
| 5 | Decreasing Triangle | Columns decrease with each row | [star5.java](./star5.java) |
| 6 | Decreasing Number Triangle | Reverse number triangle | [star6.java](./star6.java) |
| 7 | Pyramid | Leading spaces + odd number of stars | [star7.java](./star7.java) |
| 8 | Inverted Pyramid | Reverse pyramid logic | [star8.java](./star8.java) |
| 9 | Diamond | Pyramid + Inverted Pyramid | [star9.java](./star9.java) |
| 10 | Half Diamond | Increasing triangle + decreasing triangle | [star10.java](./star10.java) |
| 11 | Binary Triangle | Alternate 0 and 1 using parity | [star11.java](./star11.java) |
| 12 | Number Crown | Mirror symmetry with spaces | [star12.java](./star12.java) |
| 13 | Floyd's Triangle | Running counter across rows | [star13.java](./star13.java) |
| 14 | Alphabet Triangle | Sequential characters | [star14.java](./star14.java) |
| 15 | Reverse Alphabet Triangle | Characters with decreasing columns | [star15.java](./star15.java) |
| 16 | Repeating Alphabet Triangle | Repeat current alphabet | [star16.java](./star16.java) |
| 17 | Alphabet Pyramid | Increasing then decreasing characters | [star17.java](./star17.java) |
| 18 | Reverse Alphabet Pattern | Character offset calculation | [star18.java](./star18.java) |
| 19 | Hollow Diamond | Boundary-based printing | [star19.java](./star19.java) |
| 20 | Butterfly Pattern | Two mirrored triangles | [star20.java](./star20.java) |
| 21 | Hollow Rectangle | Print only border cells | [star21.java](./star21.java) |
| 22 | Concentric Square | Minimum distance from boundary | [star22.java](./star22.java) |

---

#  Pattern Categories

## 1. Square Patterns

```
*****
*****
*****
*****
*****
```

Concepts Learned

- Constant rows
- Constant columns
- Fixed nested loops

---

## 2. Increasing Triangle

```
*
**
***
****
*****
```

Concepts Learned

- Inner loop depends on current row
- j <= i

---

## 3. Increasing Number Triangle

```
1
12
123
1234
12345
```

Concepts Learned

- Printing column number
- j instead of *

---

## 4. Repeating Number Triangle

```
1
22
333
4444
55555
```

Concepts Learned

- Printing current row number
- i instead of *

---

## 5. Decreasing Triangle

```
*****
****
***
**
*
```

Concepts Learned

- Reverse logic
- n - i relationship

---

## 6. Decreasing Number Triangle

```
12345
1234
123
12
1
```

Concepts Learned

- Reverse inner loop
- Shrinking columns

---

## 7. Pyramid

```
    *
   ***
  *****
 *******
*********
```

Concepts Learned

- Leading spaces
- Odd number of stars
- Center alignment

---

## 8. Inverted Pyramid

```
*********
 *******
  *****
   ***
    *
```

Concepts Learned

- Reverse pyramid
- Spaces increase
- Stars decrease

---

## 9. Diamond

```
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
```

Concepts Learned

- Combine two pyramids
- Symmetry

---

## 10. Half Diamond

```
*
**
***
****
*****
****
***
**
*
```

Concepts Learned

- Increasing + Decreasing Triangle

---

## 11. Binary Triangle

```
1
01
101
0101
10101
```

Concepts Learned

- Alternating values
- (i + j) % 2

---

## 12. Number Crown

```
1      1
12    21
123  321
12344321
```

Concepts Learned

- Multiple inner loops
- Mirror symmetry

---

## 13. Floyd's Triangle

```
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
```

Concepts Learned

- Running counter
- State carried between rows

---

## 14. Alphabet Triangle

```
A
AB
ABC
ABCD
ABCDE
```

Concepts Learned

- Characters
- ASCII arithmetic

---

## 15. Reverse Alphabet Triangle

```
ABCDE
ABCD
ABC
AB
A
```

Concepts Learned

- Reverse alphabet printing

---

## 16. Repeating Alphabet Triangle

```
A
BB
CCC
DDDD
EEEEE
```

Concepts Learned

- Current row character

---

## 17. Alphabet Pyramid

```
    A
   ABA
  ABCBA
 ABCDCBA
```

Concepts Learned

- Increasing characters
- Decreasing characters
- Symmetry

---

## 18. Reverse Alphabet Triangle

```
E
DE
CDE
BCDE
ABCDE
```

Concepts Learned

- Character offsets

---

## 19. Hollow Diamond

```
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********
```
Concepts Learned

- Boundary conditions
- Spaces inside shapes

---

## 20. Butterfly Pattern

```
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
```
Concepts Learned

- Left stars
- Middle spaces
- Right stars

---

## 21. Hollow Rectangle

```
****
*  *
*  *
****
```

Concepts Learned

- Boundary checking
- if conditions

---

## 22. Concentric Square

```
4444444
4333334
4322234
4321234
4322234
4333334
4444444
```

Concepts Learned

- Distance from boundaries
- Mathematical thinking

---

# Biggest Lessons Learned

While solving these patterns I learned that almost every problem can be solved by answering four questions.

### 1. How many rows?

Usually

```java
for(int i = 1; i <= n; i++)
```

---

### 2. How many columns?

Usually depends on

- n
- i
- n - i
- 2*i-1

---

### 3. What should be printed?

Examples

- *
- j
- i
- character
- counter
- space

---

### 4. Is there any symmetry?

Many difficult-looking problems are simply:

- Upper Half
- Lower Half

or

- Left Half
- Right Half

---

#  Common Formula Sheet

| Pattern | Formula |
|----------|----------|
| Increasing Stars | `j <= i` |
| Decreasing Stars | `j <= n-i+1` |
| Pyramid Stars | `2*i-1` |
| Pyramid Spaces | `n-i` |
| Inverted Pyramid Stars | `2*(n-i)+1` |
| Floyd Triangle | Counter++ |
| Binary Triangle | `(i+j)%2` |
| Characters | `'A'+offset` |

---


# 📈 Revision Checklist

Can I solve these without looking?

- [x] Square
- [x] Triangle
- [x] Reverse Triangle
- [x] Pyramid
- [x] Inverted Pyramid
- [x] Diamond
- [x] Half Diamond
- [x] Floyd Triangle
- [x] Binary Triangle
- [x] Number Crown
- [x] Butterfly
- [x] Hollow Rectangle
- [x] Hollow Diamond
- [x] Concentric Square
- [x] Alphabet Patterns


---

**Status:** ✅ Completed