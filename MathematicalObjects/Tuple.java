public class Tuple <T> {
/* Java class implementation for the mathematical object of a tuple which is an ordered collection of elements */

    private T[] tupleElements; 

    public Tuple(){ /*default constructor*/ }

    public Tuple(T[] tuple){
        this.tupleElements = tuple;
    }

}
