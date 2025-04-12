# 📚 Java Collection Framework – ArrayList Module

This module demonstrates comprehensive usage of the `ArrayList` class in Java through practical examples spread across five Java files. These examples cover all major operations such as creating, adding, removing, accessing, and iterating through elements in an `ArrayList`.

---

## 📂 Files and Covered Methods

### 1. ✅ `CreatingArrayList.java`
Demonstrates how to create and initialize ArrayLists.

- `new ArrayList<>()` – Default capacity
- `new ArrayList<>(capacity)` – Custom initial capacity
- `ensureCapacity(int minCapacity)`
- `List.of(...)` – Convert array to list (immutable)
- `new ArrayList<>(List.of(...))` – Create mutable list
- `subList(int from, int to)` – Create a sublist

---

### 2. ✅ `AddElementsInArrayList.java`
Shows various ways to add elements into an `ArrayList`.

- `add(E element)` – Add single item
- `add(int index, E element)` – Add item at specific position
- `addAll(Collection c)` – Add multiple elements
- `Collections.addAll(list, items...)` – Another way to add multiple items
- `set(index, element)` – Replace/Update an element

---

### 3. ✅ `RemoveElementsFromArrayList.java`
Demonstrates all possible removal techniques from an `ArrayList`.

- `remove(Object o)` – Remove by value
- `remove(int index)` – Remove by index
- `removeFirst()` and `removeLast()` – From Java 21 onwards
- `removeIf(Predicate)` – Conditional removal
- `removeAll(Collection c)` – Bulk removal
- `clear()` – Remove all items
- `isEmpty()` – Check if list is empty
- `retainAll(Collection c)` – Keep only common elements with another list

---

### 4. ✅ `GetIndexInArrayList.java`
Illustrates how to get the index of elements.

- `indexOf(Object o)` – First occurrence
- `lastIndexOf(Object o)` – Last occurrence

---

### 5. ✅ `ShowDataInArrayList.java`
Shows how to display or access data in different ways.

- `System.out.println(list)` – Direct printing
- `.contains(Object o)` – Check presence
- `.size()` – Number of elements
- Enhanced `for-each` loop
- `Iterator` and `ListIterator` for forward and backward iteration

--- 

### 6. ✅ `SortingInArrayList.java`
Shows how to sort data in different ways.

- `Collections.sort()` - Sorting ascending order using Collection class
- `Collections.reverse()` - Reverse a sorted list to get in descendent order
- `.sort()` - Easy Sort
- `.sort(Collections.reverseOrder())` - Descending Order Sorting

### 7. `Good To Know`
- `trimToSize` - Reduce the capacity of a list to exactly the size of the list.

## 💡 Key Concepts Demonstrated

| Concept          | Method(s)                                                                                     |
|------------------|-----------------------------------------------------------------------------------------------|
| Create ArrayList | `new ArrayList<>()`, `List.of()`, `ensureCapacity()`                                          |
| Add Elements     | `add()`, `addAll()`, `Collections.addAll()`                                                   |
| Access Elements  | `get()`, `indexOf()`, `lastIndexOf()`, `contains()`                                           |
| Update Elements  | `set()`                                                                                       |
| Remove Elements  | `remove()`, `removeIf()`, `clear()`, `retainAll()`                                            |
| Iteration        | `for-each`, `Iterator`, `ListIterator`                                                        |
| Sorting          | `Collections.sort()`, `Collections.reverse()`, `.sort()`, `.sort(Collections.reverseOrder())` |
| Utility          | `size()`, `isEmpty()`, `trimToSize()`                                                         |

---

## 🛠️ How to Run

1. Clone this repository
2. Navigate to `JavaCollectionFramework/ArrayList/`
3. Compile and run any of the `.java` files using your IDE or command line:

```bash
javac AddElementsInArrayList.java
java AddElementsInArrayList
