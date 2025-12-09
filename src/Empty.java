/**
 * Mimics functional empty list.
 * Implements Singleton pattern to ensure only one instance exists.
 * @author Vyacheslav Moskalenko
 * @since JDK1.4
 */
public class Empty extends FunList{

    /**
     * The unique instance of Empty.
     */
    private static Empty _instance = new Empty();

    /**
     * Private constructor to prevent instantiation from outside.
     * Accessible only from within this class.
     * Body is blank because there is nothing to initialize.
     */
    private Empty(){}

    /**
     * Returns the unique instance of Empty.
     * Static methods can access static fields.
     * @return the unique instance of Empty
     */
    public static Empty UniqueInstance(){
        return _instance;
    }

    /**
     * Throws an exception since an empty list has no first element.
     * @return nothing, always throws an exception
     * @throws java.util.NoSuchElementException always, since car requires a non-Empty FunList
     */
    public int car(){
        throw new java.util.NoSuchElementException("car requires a non Empty Funlist");
    }

    /**
     * Throws an exception since an empty list has no tail.
     * @return nothing, always throws an exception
     * @throws java.util.NoSuchElementException always, since cdr requires a non-Empty FunList
     */
    public FunList cdr(){
        throw new java.util.NoSuchElementException("cdr requires a non Empty Funlist");
    }

    /**
     * Returns an empty string since this is an empty list.
     * @return an empty string
     */
    String toStringHelp(){
        return "";
    }

    /**
     * Appends another FunList to this empty list.
     * Since this list is empty, returns the other list.
     * @param other the FunList to append
     * @return the other FunList
     */
    public FunList append(FunList other){
        return other;
    }

    /**
     * Inserts an integer into an empty list.
     * Returns a new Cons containing only the integer.
     * @param i the integer to insert
     * @return a new Cons containing only the integer
     */
    public FunList insertInOrder(int i){
        return new Cons(i);
    }

    /**
     * Sorts an empty list.
     * Returns the unique Empty instance since an empty list is already sorted.
     * @return the unique Empty instance
     */
    public FunList sort(){
        return UniqueInstance();
    }
}

