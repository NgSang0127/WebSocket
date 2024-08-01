package org.sang.websocketchat1v1.chat;

import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.sang.websocketchat1v1.chatroom.ChatRoomService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChatMessageService {

	private final ChatMessageRepository chatMessageRepo;
	private final ChatRoomService chatRoomService;

	public ChatMessage save(ChatMessage chatMessage) {
		var chatId = chatRoomService.getChatRoomId(chatMessage.getSenderId(),
				chatMessage.getRecipientId(), true)
				.orElseThrow();
		chatMessage.setChatId(chatId);
		chatMessageRepo.save(chatMessage);
		return chatMessage;

	}

	public List<ChatMessage> findChatMessages(
			String senderId, String recipientId
	){
		var chatId=chatRoomService.getChatRoomId(senderId,recipientId,false);
		return chatId.map(chatMessageRepo::findByChatId).orElse(new ArrayList<>());
	}


}
