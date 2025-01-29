public class Main {
    public static void main(String[] args) {

        System.out.println(" \n ---Test MyArrayList--- \n ");

        // Test MyArrayList
        MyArrayList arrayList = new MyArrayList();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        System.out.println("MyArrayList size: " + arrayList.size()); // 3
        System.out.println("Element at index 1: " + arrayList.get(1)); // B
        arrayList.remove(1);
        System.out.println("After removing index 1: " + arrayList.get(1)); // C
        arrayList.clear();
        System.out.println("MyArrayList size after clear: " + arrayList.size()); // 0

        System.out.println(" \n ---Test MyLinkedList--- \n ");

        // Test MyLinkedList
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        System.out.println("MyLinkedList size: " + linkedList.size()); // 3
        System.out.println("Element at index 1: " + linkedList.get(1)); // B
        linkedList.remove(1);
        System.out.println("After removing index 1: " + linkedList.get(1)); // C
        linkedList.clear();
        System.out.println("MyLinkedList size after clear: " + linkedList.size()); // 0

        System.out.println(" \n ---Test MyQueue--- \n ");

        // Test MyQueue
        MyQueue queue = new MyQueue();
        queue.add("1");
        queue.add("2");
        queue.add("3");
        System.out.println("Queue size: " + queue.size()); // 3
        System.out.println("Queue peek: " + queue.peek()); // 1
        System.out.println("Queue poll: " + queue.poll()); // 1
        System.out.println("Queue size after poll: " + queue.size()); // 2
        System.out.println("Queue peek after poll: " + queue.peek()); // 2
        queue.clear();
        System.out.println("Queue size after clear: " + queue.size()); // 0

        System.out.println(" \n ---Test MyStack--- \n ");

        // Test MyStack
        MyStack stack = new MyStack();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        System.out.println("Stack size: " + stack.size()); // 3
        stack.remove(1);
        System.out.println("Stack size after remove: " + stack.size()); // 2
        System.out.println("Stack peek: " + stack.peek()); // 3
        System.out.println("Stack pop: " + stack.pop()); // 3
        System.out.println("Stack size after pop: " + stack.size()); // 1
        System.out.println("Stack peek after pop: " + stack.peek()); // 1
        stack.clear();
        System.out.println("Stack size after clear: " + stack.size()); // 0

        System.out.println(" \n ---Test MyHashMap--- \n ");

        // Test MyHashMap
        MyHashMap hashMap = new MyHashMap();
        hashMap.put("key1", "value1");
        hashMap.put("key2", "value2");
        hashMap.put("key3", "value3");
        System.out.println("HashMap size: " + hashMap.size()); // 3
        System.out.println("HashMap get key2: " + hashMap.get("key2")); // value2
        hashMap.remove("key2");
        System.out.println("HashMap size after remove: " + hashMap.size()); // 2
        hashMap.clear();
        System.out.println("HashMap size after clear: " + hashMap.size()); // 0

    }
}