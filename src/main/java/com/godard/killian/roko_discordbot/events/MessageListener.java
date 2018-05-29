package com.godard.killian.roko_discordbot.events;

import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.Message.Attachment;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class MessageListener extends ListenerAdapter{
	public void onMessageReceived(MessageReceivedEvent event) {
		User author = event.getAuthor();
		MessageChannel channel = event.getChannel();
		Message msg = event.getMessage();
		
		String msgReceived = msg.getContentStripped();
		
		for(Attachment a : msg.getAttachments()) {
			String fileName = a.getFileName();
			String proxyUrl = a.getProxyUrl();
			
			System.out.println("filename : " + fileName);
			System.out.println("proxy url : " + proxyUrl);
		}
		
	}
}
