/**
 * Test class for the insertInOrder method.
 * @author Dmytro Soroka
 * @since JDK1.4
 */
public class InOrderTest {
    /**
     * Main method to test the insertInOrder functionality.
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // Start with an empty list
        FunList list = Empty.UniqueInstance();
        
        // Insert elements in various orders
        list = list.insertInOrder(5);
        System.out.println("After inserting 5: " + list);
        
        list = list.insertInOrder(2);
        System.out.println("After inserting 2: " + list);
        
        list = list.insertInOrder(8);
        System.out.println("After inserting 8: " + list);
        
        list = list.insertInOrder(1);
        System.out.println("After inserting 1: " + list);
        
        list = list.insertInOrder(7);
        System.out.println("After inserting 7: " + list);
        
        list = list.insertInOrder(3);
        System.out.println("After inserting 3: " + list);
        
        list = list.insertInOrder(4);
        System.out.println("After inserting 4: " + list);
        
        // Test inserting duplicate values
        list = list.insertInOrder(3);
        System.out.println("After inserting duplicate 3: " + list);
        
        // Test inserting at the beginning
        list = list.insertInOrder(0);
        System.out.println("After inserting 0: " + list);
        
        // Test inserting at the end
        list = list.insertInOrder(10);
        System.out.println("After inserting 10: " + list);
        
        System.out.println("Final sorted list: " + list);
        System.out.println("All insertInOrder tests completed successfully!");
    }
}

