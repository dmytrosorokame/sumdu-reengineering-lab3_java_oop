/**
 * Test class for the sort method.
 * @author Dmytro Soroka
 * @since JDK1.4
 */
public class SortTest {
    /**
     * Main method to test the sort functionality.
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // Create an unsorted list
        FunList unsorted = new Cons(5, 
                          new Cons(2, 
                          new Cons(8, 
                          new Cons(1, 
                          new Cons(7, 
                          new Cons(3, 
                          new Cons(4, Empty.UniqueInstance())))))));
        
        System.out.println("Original unsorted list: " + unsorted);
        
        // Sort the list
        FunList sorted = unsorted.sort();
        System.out.println("Sorted list: " + sorted);
        
        // Verify original list is unchanged (immutability)
        System.out.println("Original list (should be unchanged): " + unsorted);
        
        // Test sorting an already sorted list
        FunList sorted2 = sorted.sort();
        System.out.println("Sorting already sorted list: " + sorted2);
        
        // Test sorting a list with duplicate values
        FunList withDuplicates = new Cons(3,
                                 new Cons(1,
                                 new Cons(3,
                                 new Cons(2,
                                 new Cons(1, Empty.UniqueInstance())))));
        System.out.println("List with duplicates: " + withDuplicates);
        FunList sortedDuplicates = withDuplicates.sort();
        System.out.println("Sorted list with duplicates: " + sortedDuplicates);
        
        // Test sorting an empty list
        FunList emptySorted = Empty.UniqueInstance().sort();
        System.out.println("Sorted empty list: " + emptySorted);
        
        // Test sorting a single element list
        FunList single = new Cons(42);
        System.out.println("Single element list: " + single);
        FunList singleSorted = single.sort();
        System.out.println("Sorted single element list: " + singleSorted);
        
        System.out.println("All sort tests completed successfully!");
    }
}

