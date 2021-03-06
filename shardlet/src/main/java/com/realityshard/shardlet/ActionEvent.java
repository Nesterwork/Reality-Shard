/**
 * For copyright information see the LICENSE document.
 */

package com.realityshard.shardlet;

/**
 * An event that is able to hold a ShardletAction payload
 * which is basically a message from or to a client.
 * 
 * @author _rusty
 */
public interface ActionEvent extends Event
{
    
    /**
     * Getter.
     * 
     * @return      The <code>ShardletAction</code> of the event (a.k.a. the network message or payload)
     */
    public ShardletAction getAction();
}
