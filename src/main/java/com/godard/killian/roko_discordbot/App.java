package com.godard.killian.roko_discordbot;

import javax.security.auth.login.LoginException;

import com.godard.killian.roko_discordbot.events.MessageListener;
import com.godard.killian.roko_discordbot.events.ReadyListener;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;

public class App {
	public static void main(String[] args) {
		try {
			JDA jda = new JDABuilder(AccountType.BOT)
					.setToken("NDUwMzMwOTEwMDAxMjAxMTUy.De3Vcw.J5MsgNYzhIsm6dvoaqz_s3Dtjeo")
					.addEventListener(new MessageListener()).buildBlocking();
		} catch (LoginException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
