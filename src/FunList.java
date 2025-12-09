/**
 * Mimics functional lists.
 * @author Moskalenko Vyacheslav
 * @since JDK1.4
 */
public abstract class FunList {

    /**
     * Returns the first int in the list object.
     * @return the first int in the list object
     */
    public abstract int car();

    /**
     * Returns the tail (all but the first element) of the list object.
     * @return the tail (all but the first element) of the list object
     */
    public abstract FunList cdr();

    /**
     * NOTE: toString () method is NOT abstract. It calls, toStringHelp() , an abstract method.
     * It represents what we call an "invariant" behavior for <code>FunList</code>.
     * It is an example of the "Template Method Pattern". A "template method" is a method that
     * makes calls to at least one abstract method in its own class.
     * @return a String representation of the list object
     */
    public String toString(){
        return "(" + toStringHelp() + " ) ";
    }

    /**
     * Returns a String description of the list object.
     * @return a String description of the list object
     */
    abstract String toStringHelp();

    /**
     * Appends another FunList to this list.
     * Returns a new FunList that contains the elements of this list followed by the elements of other.
     * This method does not modify the input data.
     * @param other the FunList to append to this list
     * @return a new FunList containing elements of this list followed by elements of other
     */
    public abstract FunList append(FunList other);

    /**
     * Inserts an integer into the list in non-descending order.
     * The list must be sorted in non-descending order.
     * Returns a new FunList containing the elements of this list with the integer inserted in the appropriate position.
     * This method does not modify this FunList.
     * @param i the integer to insert
     * @return a new FunList with the integer inserted in order
     */
    public abstract FunList insertInOrder(int i);

    /**
     * Sorts the list in non-descending order.
     * Returns a new sorted FunList containing the same elements as this list.
     * @return a new FunList sorted in non-descending order
     */
    public abstract FunList sort();
}

