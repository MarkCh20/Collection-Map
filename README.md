# My Custom Data Structures

This repository contains custom implementations of several fundamental data structures, including `MyArrayList`, `MyLinkedList`, `MyQueue`, `MyStack`, and `MyHashMap`. These implementations are based on basic algorithms and avoid using Java's built-in collection classes.

## Table of Contents

1. [Introduction](#introduction)
2. [Implemented Data Structures](#implemented-data-structures)
3. [Method Descriptions](#method-descriptions)

## Introduction

In this project, we implement several common data structures in Java, including:

- **MyArrayList**: A custom implementation of an array-based dynamic list.
- **MyLinkedList**: A custom implementation of a doubly linked list.
- **MyQueue**: A custom queue implementation using FIFO (First-In-First-Out) principle.
- **MyStack**: A custom stack implementation using LIFO (Last-In-First-Out) principle.
- **MyHashMap**: A custom implementation of a hashmap using linked nodes.

## Implemented Data Structures

### 1. **MyArrayList**

A custom version of Java's `ArrayList`. The list is stored internally using an array. The main features include:

- **Dynamic resizing** when the array exceeds capacity.
- **Methods**: `add()`, `remove()`, `clear()`, `size()`, `get()`

### 2. **MyLinkedList**

A doubly linked list where each node has a reference to both its previous and next node. The linked list supports:

- **Adding elements** at the end.
- **Removing elements** by index.
- **Methods**: `add()`, `remove()`, `clear()`, `size()`, `get()`

### 3. **MyQueue**

A queue implementation following the FIFO principle. You can enqueue (add) and dequeue (remove) elements. The queue supports:

- **Adding elements** to the back of the queue.
- **Removing elements** from the front of the queue.
- **Methods**: `add()`, `clear()`, `size()`, `peek()`, `poll()`

### 4. **MyStack**

A stack implementation following the LIFO principle. Elements are added to and removed from the top of the stack. The stack supports:

- **Pushing elements** onto the stack.
- **Popping elements** from the stack.
- **Methods**: `push()`, `remove()`, `clear()`, `size()`, `peek()`, `pop()`

### 5. **MyHashMap**

A basic hashmap implementation using linked nodes. The hashmap supports:

- **Adding key-value pairs**.
- **Removing pairs** by key.
- **Retrieving values** by key.
- **Methods**: `put()`, `remove()`, `clear()`, `size()`, `get()`

## Method Descriptions

### **MyArrayList Methods**

- **`add(Object value)`**: Adds the element at the end of the list.
- **`remove(int index)`**: Removes the element at the specified index.
- **`clear()`**: Clears all elements in the list.
- **`size()`**: Returns the number of elements in the list.
- **`get(int index)`**: Retrieves the element at the specified index.

### **MyLinkedList Methods**

- **`add(Object value)`**: Adds an element at the end of the linked list.
- **`remove(int index)`**: Removes the element at the specified index.
- **`clear()`**: Clears all nodes from the linked list.
- **`size()`**: Returns the number of elements in the list.
- **`get(int index)`**: Retrieves the element at the specified index.

### **MyQueue Methods**

- **`add(Object value)`**: Adds the element to the back of the queue.
- **`clear()`**: Clears the queue.
- **`size()`**: Returns the number of elements in the queue.
- **`peek()`**: Returns the first element of the queue without removing it.
- **`poll()`**: Removes and returns the first element of the queue.

### **MyStack Methods**

- **`push(Object value)`**: Adds the element to the top of the stack.
- **`remove(int index)`**: Removes the element at the specified index.
- **`clear()`**: Clears the stack.
- **`size()`**: Returns the number of elements in the stack.
- **`peek()`**: Returns the top element of the stack without removing it.
- **`pop()`**: Removes and returns the top element of the stack.

### **MyHashMap Methods**

- **`put(Object key, Object value)`**: Adds a key-value pair to the map.
- **`remove(Object key)`**: Removes the key-value pair for the specified key.
- **`clear()`**: Clears the entire map.
- **`size()`**: Returns the number of key-value pairs in the map.
- **`get(Object key)`**: Retrieves the value for the specified key.
