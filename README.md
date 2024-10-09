# Collection Topics in Java

This repository provides an in-depth exploration of Java's Collection Framework, covering various interfaces, classes, and important concepts related to collections. The goal is to help Java developers understand how to efficiently manage and manipulate groups of objects in Java.

## Table of Contents

1. [Introduction to Collections](#introduction-to-collections)
2. [Collection Interfaces](#collection-interfaces)
    - List
    - Set
    - Queue
3. [Common Collection Classes](#common-collection-classes)
    - ArrayList
    - LinkedList
    - HashSet
    - TreeSet
    - PriorityQueue
    - HashMap
    - TreeMap
4. [Comparator and Comparable](#comparator-and-comparable)
5. [Synchronized Collections](#synchronized-collections)
6. [Best Practices](#best-practices)
7. [Useful Resources](#useful-resources)

## Introduction to Collections

Java's Collection Framework provides a set of interfaces and classes to store and manipulate data efficiently. It includes classes like `ArrayList`, `HashSet`, and `HashMap`, and provides algorithms to perform operations like sorting and searching.

## Collection Interfaces

The Collection Framework is built around several key interfaces:

- **List**: An ordered collection that allows duplicates.
  - Implementations: `ArrayList`, `LinkedList`
- **Set**: A collection that does not allow duplicates.
  - Implementations: `HashSet`, `TreeSet`
- **Queue**: A collection used to hold multiple elements prior to processing.
  - Implementations: `PriorityQueue`

## Common Collection Classes

### ArrayList
A resizable array implementation of the `List` interface. It allows fast access by index but slow insertion and removal operations.

### LinkedList
Implements both the `List` and `Deque` interfaces. It is better suited for scenarios where frequent insertion and deletion of elements are needed.

### HashSet
An implementation of the `Set` interface that uses a hash table for storage, ensuring that no duplicates are present.

### TreeSet
An implementation of the `Set` interface that sorts elements in their natural order or using a custom comparator.

### PriorityQueue
A queue that orders elements based on their priority, where elements with higher priority are processed before those with lower priority.

### HashMap
A `Map` that stores key-value pairs, using a hash table for fast access. Keys must be unique.

### TreeMap
A `Map` that stores key-value pairs in a sorted order based on keys.

## Comparator and Comparable

Java provides two interfaces, `Comparator` and `Comparable`, to define the natural and custom ordering of objects in a collection.

- **Comparable**: Used to define the natural ordering of objects.
- **Comparator**: Used to define custom sorting logic for objects.

## Synchronized Collections

Java provides synchronized wrappers for collections to ensure thread safety, which can be achieved by using methods like `Collections.synchronizedList()` or `Collections.synchronizedSet()`.

## Best Practices

- Prefer `ArrayList` over `LinkedList` for read-heavy operations.
- Use `HashSet` or `HashMap` when order is not important and you need fast access.
- For thread-safe collections, use `ConcurrentHashMap` or synchronized collections.
- Minimize the use of `Vector` and `Hashtable` as they are considered legacy.

## Useful Resources

- [Java Collection Framework Documentation](https://docs.oracle.com/javase/8/docs/technotes/guides/collections/overview.html)
- [GeeksforGeeks: Java Collections](https://www.geeksforgeeks.org/collections-in-java-2/)

---

Feel free to explore and contribute to this repository by submitting pull requests or opening issues.
