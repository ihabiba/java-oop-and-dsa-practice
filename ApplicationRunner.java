import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select an operation:");
            System.out.println("1. Add First");
            System.out.println("2. Add Last");
            System.out.println("3. Insert At");
            System.out.println("4. Delete First");
            System.out.println("5. Delete Last");
            System.out.println("6. Delete At");
            System.out.println("7. Search");
            System.out.println("8. Display List");
            System.out.println("9. Run Test Case 3");
				System.out.println("10. Get Size");
            System.out.println("11. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  
				
            if (choice < 1 || choice > 11) {
                System.out.println("Invalid choice! Please enter a number between 1 and 10.");
                continue; // Skip the rest of the loop and ask for a valid choice
            }

            if (choice == 11) {
                break;  // exit the loop
            }

            String name;
            double cgpa;
            int index;

            switch (choice) {
                case 1: // add first
                    System.out.print("Enter name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter CGPA: ");
                    cgpa = scanner.nextDouble();
                    long startTime = System.nanoTime();
                    list.addFirst(name, cgpa);
                    long endTime = System.nanoTime();
						  System.out.println("New list:");
                    list.display();
                    System.out.println("Completed in " + (endTime - startTime) + " ns, Time Complexity: O(1)");
                    break;

                case 2:// add last
                    System.out.print("Enter name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter CGPA: ");
                    cgpa = scanner.nextDouble();
                    startTime = System.nanoTime();
                    list.addLast(name, cgpa);
                    endTime = System.nanoTime();
						  System.out.println("New list:");
                    list.display();
						  System.out.println("Completed in " + (endTime - startTime) + " ns, Time Complexity: O(n)");
                    break;

                case 3:// insert at
                    System.out.print("Enter index: ");
                    index = scanner.nextInt();
                    scanner.nextLine();  
                    System.out.print("Enter name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter CGPA: ");
                    cgpa = scanner.nextDouble();
                    startTime = System.nanoTime();
                    list.insertAt(index, name, cgpa);
                    endTime = System.nanoTime();
						  System.out.println("New list:");
                    list.display();
						  System.out.println("Completed in " + (endTime - startTime) + " ns, Time Complexity: O(n)");
                    break;

                case 4: // delete first
                    startTime = System.nanoTime();
                    list.deleteFirst();
                    endTime = System.nanoTime();
						  System.out.println("New list:");
                    list.display();
						  System.out.println("Completed in " + (endTime - startTime) + " ns, Time Complexity: O(1)");
                    break;

                case 5: // delete last
                    startTime = System.nanoTime();
                    list.deleteLast();
                    endTime = System.nanoTime();
						  System.out.println("New list:");
                    list.display();
						  System.out.println("Completed in " + (endTime - startTime) + " ns, Time Complexity: O(n)");
                    break;

                case 6: // delete at
                    System.out.print("Enter index: ");
                    index = scanner.nextInt();
                    scanner.nextLine(); 
                    startTime = System.nanoTime();
                    list.deleteAt(index);
                    endTime = System.nanoTime();
						  System.out.println("New list:");
                    list.display();
						  System.out.println("Completed in " + (endTime - startTime) + " ns, Time Complexity: O(n)");
                    break;

                case 7: // for searching
                    System.out.print("Enter name to search: ");
                    name = scanner.nextLine();
                    startTime = System.nanoTime();
                    int result = list.search(name);
                    endTime = System.nanoTime();
                    if (result != -1) {
                        System.out.println(name + " found at index " + result);
                    } else {
                        System.out.println(name + " not found");
                    }
                    System.out.println("Completed in " + (endTime - startTime) + " ns, Time Complexity: O(n)");
                    break;

                case 8: // to display list
                    System.out.println("Current list:");
                    list.display();
                    break;

                case 9: // Test Case 3: Large list operations
                    testCase3(list);  // Calling the testCase3 method for large list operations
                    break;
						  
					case 10: // get size of list
                    startTime = System.nanoTime();
                    int size = list.getSize();
                    endTime = System.nanoTime();
                    System.out.println("Size of the list: " + size);
                    System.out.println("Operation completed in " + (endTime - startTime) + " ns, Time Complexity: O(n)");
                    break;
            }
        }

        scanner.close();
    }

    private static void testCase3(LinkedList list) {
        Scanner scanner = new Scanner(System.in);
		  
		  System.out.println("Test Case 3: Large List Operations performance testing");


        System.out.print("Enter the number of students to add: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();  

        long startTime = System.nanoTime();
        for (int i = 1; i <= numStudents; i++) {
            String studentName = "student" + i;
            double studentCGPA = 4.0 - (i % 100) * 0.01;
            list.addLast(studentName, studentCGPA);
        }
        long endTime = System.nanoTime();

        System.out.println(numStudents + " students added to the list.");
		  System.out.println("Completed in " + (endTime - startTime) + " ns, Time Complexity: O(n)");
    }
}
