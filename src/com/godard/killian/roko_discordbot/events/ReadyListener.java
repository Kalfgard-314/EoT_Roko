package com.godard.killian.roko_discordbot.events;

import java.util.List;

import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.entities.Guild;
import net.dv8tion.jda.core.entities.TextChannel;
import net.dv8tion.jda.core.events.ReadyEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class ReadyListener extends ListenerAdapter {
	
	public void onReady(ReadyEvent e){
		String out = "Roko is now alive on server : \n";
		
		JDA jda = e.getJDA();
		
		for(Guild g : jda.getGuilds()) {
			out += g.getName() + " (" + g.getId() + ") \n";
		}
		
		System.out.println(out);
		List<TextChannel> channels = jda.getTextChannelsByName("debug-roko", true);
		
		for(TextChannel channel : channels) {
			channel.sendMessage(out).queue();;
		}
	}

}
