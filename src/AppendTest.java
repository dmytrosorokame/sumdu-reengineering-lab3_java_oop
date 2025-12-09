/**
 * Test class for the append method and Singleton pattern.
 * @author Dmytro Soroka
 * @since JDK1.4
 */
public class AppendTest {
    /**
     * Main method to test the append functionality and Singleton pattern.
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // Test Singleton pattern
        Empty empty1 = Empty.UniqueInstance();
        Empty empty2 = Empty.UniqueInstance();
        System.out.println("Singleton test - same instance: " + (empty1 == empty2));
        
        // Test Cons(int i) constructor with Singleton
        FunList list1 = new Cons(1);
        FunList list2 = new Cons(2);
        FunList list3 = new Cons(3);
        
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("List 3: " + list3);
        
        // Test append method
        FunList appended = list1.append(list2);
        System.out.println("List 1 appended with List 2: " + appended);
        
        FunList appended2 = appended.append(list3);
        System.out.println("Result appended with List 3: " + appended2);
        
        // Test appending empty list
        FunList withEmpty = list1.append(Empty.UniqueInstance());
        System.out.println("List 1 appended with empty: " + withEmpty);
        
        // Test appending to empty list
        FunList emptyAppended = Empty.UniqueInstance().append(list1);
        System.out.println("Empty appended with List 1: " + emptyAppended);
        
        System.out.println("All tests completed successfully!");
    }
}

