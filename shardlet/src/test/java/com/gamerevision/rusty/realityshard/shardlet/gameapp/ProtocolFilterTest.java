/**
 * For copyright information see the LICENSE document.
 */

package com.gamerevision.rusty.realityshard.shardlet.gameapp;

import com.gamerevision.rusty.realityshard.shardlet.Config;
import com.gamerevision.rusty.realityshard.shardlet.ProtocolFilter;
import com.gamerevision.rusty.realityshard.shardlet.ShardletAction;
import com.gamerevision.rusty.realityshard.shardlet.ShardletException;
import java.io.IOException;
import org.slf4j.LoggerFactory;


/**
 * Does nothing, just for testing
 * 
 * @author _rusty
 */
public class ProtocolFilterTest implements ProtocolFilter
{

    @Override
    public void init(Config filterConfig) 
            throws ShardletException 
    {
    }

    @Override
    public void doInFilter(ShardletAction action) 
            throws IOException, ShardletException 
    {
        action.setAttribute("ProtocolFilter.test", "It's a me, tha ProtocolFilter attribute!");
    }

    @Override
    public void doOutFilter(ShardletAction action) 
            throws IOException, ShardletException 
    {
        LoggerFactory.getLogger(ProtocolFilterTest.class).debug((String) action.getAttribute("ProtocolFilter.test"));
    }

}
