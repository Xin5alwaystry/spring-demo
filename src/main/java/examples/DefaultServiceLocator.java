package examples;

import examples.impl.First;
import examples.impl.FirstImpl;
import examples.impl.Second;
import examples.impl.SecondImpl;

/**
 * @author xin5
 * @since 2023年01月08日 21:11:29
 */
public class DefaultServiceLocator {
    private static First first = new FirstImpl();
    private static Second second = new SecondImpl();

    public First createFirstInstance() {
        return first;
    }

    public Second createSecondInstance() {
        return second;
    }
}
