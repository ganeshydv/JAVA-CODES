
// Java Program to Illustrate Multidimensional ArrayList

// Importing required classes
import java.util.*;

// Main class
// MultidimensionalArrayList
class Array_list_2d {

  // Method 1
  // To create and return 2D ArrayList
  static List create2DArrayList()
  {

    // Creating a 2D ArrayList of Integer type
    ArrayList<ArrayList<Integer> > x
      = new ArrayList<ArrayList<Integer> >();

    // One space allocated for R0
    x.add(new ArrayList<Integer>());

    // Adding 3 to R0 created above x(R0, C0)
    x.get(0).add(0, 3);

    // Creating R1 and adding values
    // Note: Another way for adding values in 2D
    // collections
    x.add(
      new ArrayList<Integer>(Arrays.asList(3, 4, 6)));

    // Adding 366 to x(R1, C0)
    x.get(1).add(0, 366);

    // Adding 576 to x(R1, C4)
    x.get(1).add(4, 576);

    // Now, adding values to R2
    x.add(2, new ArrayList<>(Arrays.asList(3, 84)));

    // Adding values to R3
    x.add(new ArrayList<Integer>(
      Arrays.asList(83, 6684, 776)));

    // Adding values to R4
    x.add(new ArrayList<>(Arrays.asList(8)));

    // Appending values to R4
    x.get(4).addAll(Arrays.asList(9, 10, 11));

    // Appending values to R1, but start appending from
    // C3
    x.get(1).addAll(3, Arrays.asList(22, 1000));

    // This method will return 2D array
    return x;
  }

  // Method 2
  // Main driver method
  public static void main(String args[])
  {
    // Display message prior for better readability
    System.out.println("2D ArrayList :");

    // Printing 2D ArrayList by calling Method 1
    System.out.println(create2DArrayList());
  }
}
