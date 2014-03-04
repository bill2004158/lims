package com.marcelmika.lims.jabber.service;

import com.marcelmika.lims.events.conversation.GetConversationsRequestEvent;
import com.marcelmika.lims.events.conversation.GetConversationsResponseEvent;

/**
 * @author Ing. Marcel Mika
 * @link http://marcelmika.com
 * Date: 2/22/14
 * Time: 8:08 PM
 */
public interface ConversationJabberService {

    /**
     * Get all conversations related to the particular user
     *
     * @param event request event for method
     * @return response event for  method
     */
    public GetConversationsResponseEvent getConversations(GetConversationsRequestEvent event);

}