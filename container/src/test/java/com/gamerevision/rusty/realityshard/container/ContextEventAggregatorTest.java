/**
 * Distributed under the GNU GLP v.3
 */

package com.gamerevision.rusty.realityshard.container;

import java.lang.reflect.InvocationTargetException;
import junit.framework.TestCase;


/**
 * JUnit test class
 * 
 * @author _rusty
 */
public class ContextEventAggregatorTest extends TestCase
{
    
    public ContextEventAggregatorTest(String name)
    {
        super(name);
    }
    
    public void testEvent()
    {
        // instantiate the listener and aggregator
        TestShardlet listenerOne = new TestShardlet();
        ContextEventAggregator aggr = new ContextEventAggregator();
        
        // add the listener
        aggr.addListener(listenerOne);
        
        // nao exeQt da fuq
        boolean errorThrown = false;
        try
        {
            aggr.triggerEvent(new TestEventOne());
        }
        catch (InvocationTargetException ex)
        {
            errorThrown = (ex.getTargetException().getClass().equals(UnsupportedOperationException.class));
            // that should have happened, because test listner throws the exception!
        }
        
        assert errorThrown;
    }
}
