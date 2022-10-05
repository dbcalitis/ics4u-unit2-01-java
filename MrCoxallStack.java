/*
* MrCoxallStack Class
*
* @author  Daria Bernice Calitis
* @version 11.0.16
* @since   2022-10-03
*/

import java.util.ArrayList;

/**
 * MrCoxallStack Class.
 */
public class MrCoxallStack {
    /**
     * Array stack.
     */
    private ArrayList<Number> stack = new ArrayList<Number>();

    /**
     * The pushItem() function.
     *
     * <p>
     * It adds a number to the stack ArrayList.
     * </p>
     *
     * @param pushedNumber - the number to be added to the stack.
     */
    public void pushItem(int pushedNumber) {
        stack.add(pushedNumber);
    }

    /**
     * The showStack() function.
     *
     * <p>
     * Shows the items of the stack.
     * </p>
     */
    public void showStack() {
        System.out.println(stack);
    }
}
