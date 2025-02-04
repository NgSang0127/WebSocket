package org.sang.websocketchat1v1.chatroom;

import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatRoomRepository extends MongoRepository<ChatRoom,String> {

	Optional<ChatRoom> findBySenderIdAndRecipientId(String senderId, String recipientId);
}
