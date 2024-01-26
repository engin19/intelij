package reviewWeek12;

public class BrainNotFoundException extends RuntimeException{
    /***
     * Whenever we have to solve a homework or when we are
     * in the mock interviews that's where this exception occurs
     * @param errorMsg whenever this exception is thrown if we
     *                 want to pass an error msg that's when we
     *                 will be using this param.
     */
        BrainNotFoundException(String errorMsg){
            super(errorMsg);
        }

    }

