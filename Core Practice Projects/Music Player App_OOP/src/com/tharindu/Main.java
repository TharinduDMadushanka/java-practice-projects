package com.tharindu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    private static ArrayList<Album> albums=new ArrayList<>();
    public static void main(String[] args) {



        Album album=new Album("Album1","Thari");

        album.addSong("TNT",4.5);
        album.addSong("A",4.6);
        album.addSong("B",4.7);
        album.addSong("C",4.8);
        albums.add(album);

        album =new Album("Album2","Eminem");

        album.addSong("F",4.5);
        album.addSong("G",3.5);
        album.addSong("H",4.1);
        albums.add(album);

        LinkedList<Song> playList1 =new LinkedList<>();

        albums.get(0).addToPlayList("TNT",playList1);
        albums.get(0).addToPlayList("A",playList1);
        albums.get(0).addToPlayList("B",playList1);
        albums.get(0).addToPlayList("C",playList1);

        play(playList1);
    }

    private static void play(LinkedList<Song> playList){
        System.out.println("This is play method");
    }

    private static void printMenu(){
        System.out.println("Available options.\n press");
        System.out.println("0 - to quit\n"+
                "1 - play next song\n"+
                "2 - play previous song\n "+
                "3 - replay the current song \n"+
                "4 - list of all songs \n"+
                "5 - print all available options \n"+
                "6 - delete current song");
    }

    private static void printList(LinkedList<Song> playList){
        Iterator<Song> iterator =playList.iterator();
        System.out.println("------------------");

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("------------------");
    }
}