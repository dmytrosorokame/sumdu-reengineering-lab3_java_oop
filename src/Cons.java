/**
 * Mimics fundamental function cons for constructs
 * memory objects which hold two values or pointers to values.
 * @author Vyacheslav Moskalenko
 * @since JDK1.4
 */
public class Cons extends FunList {

    /**
     * The data (head) of the list.
     */
    private int _dat;
    
    /**
     * The tail (rest) of the list.
     */
    private FunList _cdr;

    /**
     * Constructs a Cons object with the given head and tail.
     * @param carDat the head (first element) of the list
     * @param cdr the tail (rest) of the list
     */
    public Cons(int carDat, FunList cdr){
        _dat = carDat;
        _cdr = cdr;
    }

    /**
     * Constructs a Cons object with a single element.
     * The tail is set to the unique Empty instance.
     * @param i the single element of the list
     */
    public Cons(int i){
        _dat = i;
        _cdr = Empty.UniqueInstance();
    }

    /**
     * Returns the first int in the list object.
     * @return the first int in the list object
     */
    public int car(){
        return _dat;
    }

    /**
     * Returns the tail (all but the first element) of the list object.
     * @return the tail (all but the first element) of the list object
     */
    public FunList cdr(){
        return _cdr;
    }

    /**
     * Returns a String description of the list object.
     * @return a String description of the list object
     */
    String toStringHelp(){
        return " " + _dat + _cdr.toStringHelp();
    }

    /**
     * Appends another FunList to this list.
     * Returns a new FunList that contains the elements of this list followed by the elements of other.
     * @param other the FunList to append to this list
     * @return a new FunList containing elements of this list followed by elements of other
     */
    public FunList append(FunList other){
        return new Cons(_dat, _cdr.append(other));
    }

    /**
     * Inserts an integer into the list in non-descending order.
     * The list must be sorted in non-descending order.
     * @param i the integer to insert
     * @return a new FunList with the integer inserted in order
     */
    public FunList insertInOrder(int i){
        if (i <= _dat) {
            return new Cons(i, this);
        } else {
            return new Cons(_dat, _cdr.insertInOrder(i));
        }
    }

    /**
     * Sorts the list in non-descending order.
     * Returns a new sorted FunList containing the same elements as this list.
     * @return a new FunList sorted in non-descending order
     */
    public FunList sort(){
        return _cdr.sort().insertInOrder(_dat);
    }
}

