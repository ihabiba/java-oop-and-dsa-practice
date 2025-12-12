public class LinkedList {
    // Head of the list
    Node head;


    // 1. Add a node at the beginning of the list
    public void addFirst(String name, double cgpa) {
        Node newNode = new Node(name, cgpa);
        newNode.next = head; // Point the new node to the current head
        head = newNode; // Update head to the new node
    }
	 // Time Complexity: O(1)
    // Explanation: This method inserts a new node at the beginning of the list by updating the head pointer.
    // The size of the list does not affect the time complexity since no traversal is needed.



    // 2. Add a node at the end of the list
    public void addLast(String name, double cgpa) {
        Node newNode = new Node(name, cgpa);
        if (head == null) {
            head = newNode; // If the list is empty, newNode becomes the head
        } else {
            Node current = head;
            while (current.next != null) { // Traverse to the last node
                current = current.next;
            }
            current.next = newNode; // Link the last node to the newNode
        }
    }
	 // Time Complexity:
    // - Best-case: O(1), if the list is empty.
    // - Worst-case: O(n), if the list is non-empty and requires traversal to the last node.
    // Explanation: As the size of the list grows, the time needed to traverse to the last node increases linearly.



    // 3. Insert a node at a specific index 
    public void insertAt(int index, String name, double cgpa) {
    // Validate the index
    if (index < 0 || index > getSize()) {
        System.out.println("Invalid index!");  // Edge case: Negative index or index beyond the list size
        return;
    }

    // Create the new node
    Node newNode = new Node(name, cgpa);

    if (index == 0) {
        addFirst(name, cgpa); // Call the addFirst method for index 0
	    } else {
        Node current = head;

        // Traverse the list to find the node before the insertion point
        for (int count = 0; count < index - 1; count++) {
            current = current.next;
        }

        // Insert the new node at the specified index
        newNode.next = current.next;
        current.next = newNode;
    }
   }
	 // Time Complexity:
    // - Best-case: O(1), if inserting at the beginning (index 0).
    // - Worst-case: O(n), if inserting at the middle or end of the list.
    // Explanation: For middle or end positions, traversal is required to locate the correct insertion point.
    // The time increases linearly with the size of the list.



    // 4. Delete the first node
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty!"); // Edge case: Attempt to delete from an empty list

        } else {
            head = head.next; // Move the head to the next node
        }
    }
	 // Time Complexity: O(1)
    // Explanation: This method removes the first node by updating the head pointer.
    // The operation is constant time and does not depend on the size of the list.



    // 5. Delete the last node
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty!"); // Edge case: Attempt to delete from an empty list
        } else if (head.next == null) {
            head = null; // Edge case: Deleting the only node in the list            
        } else {
            Node current = head;
            while (current.next.next != null) { // Traverse to the second-last node
                current = current.next;
            }
            current.next = null; // Remove the last node
        }
    }
	 // Time Complexity:
    // - Best-case: O(1), if there is only one node in the list.
    // - Worst-case: O(n), if the list has multiple nodes.
    // Explanation: The method needs to traverse the list to find the second-last node.
    // The larger the list, the longer the traversal.


    // 6. Delete a node at a specific index 
    public void deleteAt(int index) {
    // Validate the index
    if (index < 0 || index > getSize() || head == null) {
        System.out.println("Invalid index!"); // Edge case: Negative index, index beyond list size
		  return;
    }

    // Deleting the first node
    if (index == 0) {
        head = head.next;
    } else {
        Node current = head;



        // Traverse the list to find the node before the deletion point
        for (int count = 0; count < index - 1; count++) {
            current = current.next;
        }

        // Remove the node at the specified index
        current.next = current.next.next;
    }
}
	 // Time Complexity:
    // - Best-case: O(1), if deleting the first node (index 0).
    // - Worst-case: O(n), if deleting a node in the middle or end.
    // Explanation: The method must traverse the list to find the node before the one being deleted.
    // The time required depends on the index and the size of the list.



    // 7. Search for a student by name
    public int search(String name) {
    Node current = head;
    int index = 0;

    while (current != null) {
        if (current.name.equals(name)) {
            return index; // Return the index if the name matches
        }
        current = current.next;
        index++;
    }

    return -1; // Return -1 if the name is not found
}
	 // Time Complexity:
    // - Best-case: O(1), if the node being searched is at the head.
    // - Worst-case: O(n), if the node is at the end or not in the list.
    // Explanation: The method uses linear traversal to search for a node by name.
    // The time required increases linearly with the size of the list.



    // 8. Display the list
    public void display() {
    Node current = head;
    StringBuilder sb = new StringBuilder(); 
    sb.append("["); 

    while (current != null) {
        sb.append(current.name + ", CGPA: " + current.cgpa);
        if (current.next != null) {
            sb.append(", "); // Add comma between elements
        }
        current = current.next;
    }

    sb.append("]"); 
    System.out.println(sb.toString()); // Print the formatted list
}
	 // Time Complexity: O(n)
    // Explanation: The method traverses the entire list to print all nodes.
    // The time required increases linearly with the size of the list because each node must be visited.




    // 9. Get the size of the list
    public int getSize() {
        Node current = head;
        int count = 0;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }
	 // Time Complexity: O(n)
    // Explanation: The method traverses the entire list to count the number of nodes.
    // The time required increases linearly with the size of the list since every node must be visited.

}
