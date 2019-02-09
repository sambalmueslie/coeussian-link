package ut.de.sambalmueslie;

import org.junit.Test;
import de.sambalmueslie.api.MyPluginComponent;
import de.sambalmueslie.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}