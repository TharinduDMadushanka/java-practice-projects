package com.tharindu;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist, ArrayList<Song> songs) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public Album(){

    }

    public Song findSong(String title){
        for (Song checkSong: songs){
            if (checkSong.getTitle().equals(title)){
                return checkSong;
            }
        }
        return null;
    }

    public boolean addSong(String title, double duration){
        if (findSong(title)==null){
            songs.add(new Song(title,duration));
            System.out.println(title+" Successfully added to the list.");
        }else {
            System.out.println("Song with name "+title+" already exist in the list.");
            return false;
        }
        return false;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){
        int index=trackNumber-1;
        if (index>0 && index<=this.songs.size()){
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have song with track number "+trackNumber);
        return false;
    }
}
