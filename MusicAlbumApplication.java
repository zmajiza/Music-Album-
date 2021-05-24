/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zmajiza;

import zmajiza.MusicAlbum;

/**
 *
 * @author majiza Zizo
 */
public class MusicAlbumApplication extends MusicAlbum {
    public static void main(String[] args)
	{
		MusicAlbum obj = new MusicAlbum();

		//REGISTER ALBUM
		obj.set("Burna Boy", "Way To Big", 17);
		//Songs
		obj.setTrackNameAndMinutes("Way To Big", "02:31");
		obj.setTrackNameAndMinutes("Alarm Clock", "02:30");
		obj.setTrackNameAndMinutes("Wonderful", "05:14");
		obj.setTrackNameAndMinutes("Comma", "03:00");
		obj.setTrackNameAndMinutes("Wettin Dey Sup", "03:04");
		obj.setTrackNameAndMinutes("23", "01:26");
		obj.setTrackNameAndMinutes("Bebo", "03:44");
		obj.setTrackNameAndMinutes("Level Up", "03:21");
		obj.setTrackNameAndMinutes("Time Flies", "03:34");
		obj.setTrackNameAndMinutes("King", "03:09");
		obj.setTrackNameAndMinutes("Bank On It", "03:34");
		obj.setTrackNameAndMinutes("Monster", "02:10");
		obj.setTrackNameAndMinutes("Another One Down", "03:12");
		obj.setTrackNameAndMinutes("Everything", "02:47");
		obj.setTrackNameAndMinutes("Legendary", "02:29");
		obj.setTrackNameAndMinutes("Real Life", "03:14");
		obj.setTrackNameAndMinutes("Onyeka", "03:20");
		

		//Display Album
		System.out.println("Artist: " + obj.getArtist() + "\n" + "Album Name: " + obj.getAlbumTitle() + "\n" + "Number of songs: " + obj.getNumberOfTracks());
		obj.printTrackNameAndMinutes();

		obj.clearMap();

		

		//REGISTER ALBUM
		obj.set("Pop Smoke", "Mood Swings", 14);
		//Songs
		obj.setTrackNameAndMinutes("44 Bulldog", "01:58");
		obj.setTrackNameAndMinutes("Mood Swings [Explicit]", "03:06");
		obj.setTrackNameAndMinutes("Diana.", "02:40");
		obj.setTrackNameAndMinutes("Enjoy Yourself", "03:29");
		obj.setTrackNameAndMinutes("Snitching", "03:35");
		obj.setTrackNameAndMinutes("Aim For The Moon [Explicit]", "03:47");
		obj.setTrackNameAndMinutes("Tunnel Version", "04:35");
		obj.setTrackNameAndMinutes("What Do You Know About Love [Explicit version]", "02:57");
		obj.setTrackNameAndMinutes("Gangstas", "05:08");
		obj.setTrackNameAndMinutes("Dior", "03:33");
		obj.setTrackNameAndMinutes("Got It On Me", "04:14");
		obj.setTrackNameAndMinutes("Something Special", "07:41");
		obj.setTrackNameAndMinutes("The Woo", "04:09");
		obj.setTrackNameAndMinutes("Creature", "04:09");
		

		//Display Album
		System.out.println("Artist: " + obj.getArtist() + "\n" + "Album Name: " + obj.getAlbumTitle() + "\n" + "Number of songs: " + obj.getNumberOfTracks());
		obj.printTrackNameAndMinutes();

		obj.clearMap();

		//REGISTER ALBUM
		obj.set("Bille Eilish", "Ocean Eyes", 12);
		//Songs
		obj.setTrackNameAndMinutes("Bad Guy", "03:16");
		obj.setTrackNameAndMinutes("When The Party Is Over", "02:28");
		obj.setTrackNameAndMinutes("Bury A Friend", "03:38");
		obj.setTrackNameAndMinutes("Bellyache", "02:57");
		obj.setTrackNameAndMinutes("Xanny", "01:57");
		obj.setTrackNameAndMinutes("Ocean Eyes", "02:43");
		obj.setTrackNameAndMinutes("Lovely", "03:38");
		obj.setTrackNameAndMinutes("Hostage", "04:26");
		obj.setTrackNameAndMinutes("Ilomilo", "02:13");
		obj.setTrackNameAndMinutes("Everything I wanted", "05:06");
		obj.setTrackNameAndMinutes("No Time To Die", "02:48");
		obj.setTrackNameAndMinutes("idontwannabeyouanymore", "03:58");
		
		//Display Album
		System.out.println("Artist: " + obj.getArtist() + "\n" + "Album Name: " + obj.getAlbumTitle() + "\n" + "Number of songs: " + obj.getNumberOfTracks());
		obj.printTrackNameAndMinutes();

		obj.clearMap();
	}
    
}
