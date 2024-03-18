////package rocks.zipcode;
////
////public class readThis {
////    HashSet: A collection that doesn't allow duplicate elements and doesn't maintain any order. Useful when you want to prevent duplicates and don't care about the order of elements.
////
////    ArrayList: A resizable array. It allows duplicates and maintains the order of elements. Useful when you need an array that can grow, and you care about the index of elements.
////
////    HashMap: A collection that stores pairs of keys and values. Each key maps to exactly one value, and you can't have duplicate keys. Useful when you want to retrieve (look up) values based on a key.
////
////    LinkedList: A list of elements where each element is linked to the next and previous one. Useful for efficient insertion and deletion at any position, but slower than an ArrayList for random access.
////
////    ArrayDeque: A resizable array that allows addition and removal of elements from both ends (front and back). Useful for stacks (LIFO) or queues (FIFO).
////
////    Vector: Similar to an ArrayList, but it's synchronized, meaning it's thread-safe (can be used safely in multithreaded environments). However, it's less efficient in single-threaded contexts due to this overhead.
////
////    TreeMap: A collection that stores pairs of keys and values based on a tree structure. It maintains the keys in a sorted order. Useful for efficient retrieval, insertion, and deletion when order matters.
////
////    Stack: A collection that supports LIFO (Last In First Out) operations. Elements are added to and removed from the top of the stack. It is a legacy class and ArrayDeque is preferred for new code.
////
////        TreeSet: A collection that stores unique elements in a sorted order. Similar to HashSet but maintains a sorted order.
////
////    Iterator: An interface that provides methods to iterate over any collection, one element at a time. Useful for going through a collection, element by element, in a loop.
////
////    PriorityQueue: A collection that orders its elements according to their natural ordering (Comparable) or by a Comparator provided at queue construction time. Elements are ordered either by minimum value first or by a provided priority.
////
////        Comparable: An interface defining a method for comparing an object with other objects of the same type. Useful for defining the natural ordering of objects (e.g., sorting in a collection).
////}
//-------------------------------------
//HashSet:
//
//Unique methods: add(E e), remove(Object o), contains(Object o)
//Characteristics: Does not allow duplicate values and has no guaranteed order.
//ArrayList:
//
//Unique methods: add(int index, E element), remove(int index), get(int index), set(int index, E element)
//Characteristics: Maintains insertion order, allows random access to elements.
//    HashMap:
//
//Unique methods: put(K key, V value), get(Object key), remove(Object key), containsKey(Object key)
//Characteristics: Stores key-value pairs, allows null keys and values, does not maintain order.
//LinkedList:
//
//Unique methods: addFirst(E e), addLast(E e), removeFirst(), removeLast()
//Characteristics: Elements are doubly linked, better for frequent insertions and deletions.
//ArrayDeque:
//
//Unique methods: addFirst(E e), addLast(E e), removeFirst(), removeLast(), peekFirst(), peekLast()
//Characteristics: Can be used as both stack (LIFO) and queue (FIFO), no capacity restrictions.
//    Vector:
//
//Unique methods: add(E e), get(int index), remove(int index), set(int index, E element)
//Characteristics: Similar to ArrayList but synchronized for thread safety.
//TreeMap:
//
//Unique methods: put(K key, V value), get(Object key), firstKey(), lastKey(), pollFirstEntry(), pollLastEntry()
//Characteristics: Sorts the keys in natural order or using a Comparator.
//Stack:
//
//Unique methods: push(E item), pop(), peek()
//Characteristics: Last-in-first-out (LIFO) data structure.
//TreeSet:
//
//Unique methods: add(E e), remove(Object o), first(), last(), higher(E e), lower(E e)
//Characteristics: Stores unique elements in a sorted order.
//    Iterator:
//
//Unique methods: next(), hasNext(), remove()
//Characteristics: Allows traversing elements of a collection one by one.
//    PriorityQueue:
//
//Unique methods: add(E e), offer(E e), poll(), peek()
//Characteristics: Elements are ordered according to their natural ordering or by a Comparator.
//Comparable:
//
//Unique method: compareTo(T o)
//Characteristics: Provides a single sorting sequence. In contrast, Comparator provides multiple sorting sequences.
