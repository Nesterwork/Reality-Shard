/**
 * For copyright information see the LICENSE document.
 */

package com.realityshard.shardlet;

import java.util.Enumeration;


/**
 * A generic configuration object used by a servlet container
 * to pass information to a protocol filter during initialization.
 * 
 * @author _rusty
 */
public interface ConfigProtocolFilter 
{
    
    /**
     * Getter.
     * 
     * @return      The name of the shardlet or filter that this config object is made for.
     */
    public String getName();

    
    /**
     * Getter.
     * 
     * @param       name                    The name of the (generic) parameter.
     *                                      The object will try to find it based on that string.
     * @return      The parameter's value if found
     */
    public String getInitParameter(String name);


    /**
     * Getter.
     * 
     * @return      All parameter names (the keys without values)
     */
    public Enumeration<String> getInitParameterNames();

}

