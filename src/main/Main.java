package main;

import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class Main extends ListenerAdapter {

	String gayGif = "https://cdn.discordapp.com/attachments/1085610363770372261/1085623927541342229/tongue.gif";
	String priscoGif = "https://tenor.com/view/cowboy-black-slap-muscle-man-fall-gif-16591809";
	String jamesGif = "https://imgur.com/cKUrxGv";
	String willGif = "https://discord.com/channels/1003844653877043200/1053422186670596126/1085453389661483060";
	String etGif = "https://discord.com/channels/1003844653877043200/1053422186670596126/1085625805050216558";

	public static void main(String[] args) {
		String token = "TOKEN";
		JDABuilder builder = JDABuilder.createDefault(token);

		builder.setActivity(Activity.playing(" with gabe lowjob"));

		builder.enableIntents(GatewayIntent.MESSAGE_CONTENT);

		builder.addEventListeners(new Main());

		builder.build();
	}

	@Override
	public void onMessageReceived(MessageReceivedEvent event) {
		String prefix = event.getMessage().getContentRaw().substring(0, 1);
		String command = event.getMessage().getContentRaw().substring(1);
		
		if (prefix.equals("!")) {

			if (event.getAuthor().isBot()) {

				return;
			}
			
			switch(command) {
			case "marco":
				if(event.getAuthor().getId().)) {
					event.getChannel().sendMessage("polo" + "").queue();
				}else {
					event.getChannel().sendMessage("goofy ahhhh :rofl: you arent the creator").queue();
				}
				
				break;
				
			case "gay":
				
				nsfwCommands(event, gayGif);
				break;
			case "prisco":
				nsfwCommands(event, priscoGif);
				break;
				
			case "james":
				nsfwCommands(event, jamesGif);
				break;
			case "will":
				nsfwCommands(event, willGif);
				break;
			case "et":
				nsfwCommands(event, etGif);
				break;
				
			case "commands":
				event.getChannel().sendMessage("```Funny: \n"
						+ " !gay \n"
						+ " !prisco \n"
						+ " !james \n"
						+ " !will \n"
						+ " !et \n"
						+ "Debug: \n"
						+ " !marco```").queue();;
						
			
			}
			
		}
		
		String author = event.getAuthor().getName();
		String message = event.getMessage().getContentDisplay();
		String channel = event.getMessage().getChannel().toString();

		int hour = event.getMessage().getTimeCreated().getHour();
		int minute = event.getMessage().getTimeCreated().getMinute();

		System.out.println("received message from " + author + ": " + message + "  @" + hour + ":" + minute + " in - " + channel);
		
	}

	private void nsfwCommands(MessageReceivedEvent event, String message) {
		if (event.getChannel().getName().equals("gabe-lachman")) {
			System.out.println("1");
			event.getChannel().sendMessage(message).queue();
		} else {
			System.out.println("2");
			event.getChannel().sendMessage("cant use this command HERE!!! (not in #gabe-lachman :wink:)").queue();
		}

	}

}
