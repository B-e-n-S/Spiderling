package spiderling.lib.checks.digital;

import spiderling.lib.checks.Check.CheckDigital;
import spiderling.lib.logic.GettableBoolean;

/**
 * Checks the value of any {@link GettableBoolean GettableBoolean}.
 *
 * @author Sean Zammit
 */
public class ChGettableBoolean extends CheckDigital
{
    GettableBoolean gettable;

    /**
     * Constructor for a check based on the value of any {@link GettableBoolean GettableBoolean}.
     *
     * @param gettable The gettable being checked.
     * @param isTrue Whether the required value is true.
     */
    public ChGettableBoolean(GettableBoolean gettable, boolean isTrue) {
        super(isTrue);
        this.gettable = gettable;
    }

    public boolean isDone() {
        return gettable.get() == type;
    }
}