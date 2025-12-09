# Lab 3: OOP in Java

## Description

Implementation of a functional list (FunList) with Lisp-style operations:

- `car()` — returns the first element
- `cdr()` — returns the tail
- `append()` — concatenates two lists
- `insertInOrder()` — inserts element into sorted list
- `sort()` — sorts the list

The `Empty` class implements the **Singleton** pattern — only one empty list instance exists.

## Structure

```
src/
├── FunList.java      # Abstract class
├── Cons.java         # Non-empty list
├── Empty.java        # Empty list (Singleton)
├── AppendTest.java   # Test for append
├── InOrderTest.java  # Test for insertInOrder
└── SortTest.java     # Test for sort
docs/                 # JavaDoc documentation
```

## Usage

```bash
cd src

# Compile
javac *.java

# Run tests
java AppendTest
java InOrderTest
java SortTest

# Generate docs
javadoc -private -d ../docs *.java

# Open docs
cd docs
open index.html
```

## JavaDoc

![Package summary](screenshots/javadoc_1.png)

![Class details](screenshots/javadoc_2.png)
