package com.godard.killian.roko_discordbot.events;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.godard.killian.roko_discordbot.services.ImageTextDetection;

import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.Message.Attachment;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class MessageListener extends ListenerAdapter {
	private Attachment attachment;

	public void onMessageReceived(MessageReceivedEvent event) {
		User author = event.getAuthor();
		MessageChannel channel = event.getChannel();
		Message msg = event.getMessage();

		String msgReceived = msg.getContentStripped();

		for (Attachment a : msg.getAttachments()) {
			attachment = a;
			String fileName = a.getFileName();
			String proxyUrl = a.getProxyUrl();

			System.out.println("filename : " + fileName);
			System.out.println("proxy url : " + proxyUrl);
		}

		String filename = "/Users/killian/Documents/test.jpg";
		

		Boolean isDownloaded = false;
		
		Path path = Paths.get(filename);
		
//		if(Files.exists(path)) {
//			System.out.println("file already exists !");
//		} else {
//			isDownloaded= attachment.download(path.toFile());
//		}
		
		System.out.println("isDownloaded = " + isDownloaded.toString());
		
		
		try {
			ImageTextDetection.getInstance().detectText(filename, System.out);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
