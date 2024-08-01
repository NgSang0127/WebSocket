package org.sang.websocketchat1v1.chat;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatMessageRepository extends MongoRepository<ChatMessage,String> {

	List<ChatMessage> findByChatId(String s);
}
