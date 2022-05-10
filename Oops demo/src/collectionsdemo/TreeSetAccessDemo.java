package collectionsdemo;

import java.util.TreeSet;

//Accessing the elements of a TreeSet
//Treeset sorts elements in ascending order by default
public class TreeSetAccessDemo {
	 //sorts the elements by ignoring the case.
	public static void main(String[] args) {
		
	TreeSet<String> students = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);//String.Case_Insensitive_order uses capital and small letters

    students.add("Julia");
    students.add("Robert");
    students.add("Mark");
    students.add("Steven");
    students.add("mike");

    System.out.println("Students TreeSet : " + students);

    // Finding the size of a TreeSet
    System.out.println("Number of elements in the TreeSet : " + students.size());

    // Check if an element exists in the TreeSet
    String name = "Julia";
    if(students.contains(name)) {
        System.out.println("TreeSet contains the element : " + name);
    } else {
        System.out.println("TreeSet does not contain the element : " + name);
    }

    // Navigating through the TreeSet
    System.out.println("First element : " + students.first());
    System.out.println("Last element : " + students.last());

    name = "Robert";
    System.out.println("Element just greater than "  + name + " : " + students.higher(name));
    System.out.println("Element just lower than "  + name + " : " + students.lower(name));

	

	}

}
