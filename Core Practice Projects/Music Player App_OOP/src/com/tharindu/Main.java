package com.tharindu;

import java.util.*;

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
        Scanner sc =new Scanner(System.in);
        boolean quit =false;
        boolean forward=true;
        ListIterator<Song> listIterator=playList.listIterator();

        if (playList.size()==0){
            System.out.println("This play list have no songs.");
        }else {
            System.out.println("Now playing "+listIterator.next().toString());
            printMenu();
        }

        while (!quit){
            int action =sc.nextInt();
            sc.nextLine();

            switch (action){

                case 0:
                    System.out.println("Playlist complete!");
                    quit=true;
                    break;

                case 1:
                    if (!forward){
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward=true;
                    }
                    if (listIterator.hasNext()){
                        System.out.println("Now playing "+listIterator.next().toString());
                    }else {
                        System.out.println("There are no songs exist reach to the end of list.");
                        forward=false;
                    }
                    break;

                case 2:
                    if (forward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward=false;
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("Now playing "+listIterator.previous().toString());
                    }else {
                        System.out.println("We are in the first song.");
                        forward=false;
                    }
                    break;

                case 3:
                    if (forward){
                        if (listIterator.hasPrevious()){
                            System.out.println("Now playing "+listIterator.previous().toString());
                            forward=false;
                        }else {
                            System.out.println("We are at the start of the playlist");
                        }
                    }else {
                        if (listIterator.hasNext()){
                            System.out.println("Now playing "+ listIterator.next().toString());
                            forward=true;
                        }else {
                            System.out.println("We have reached to the end of list.");
                        }
                    }
                    break;

                case 4:
                    printList(playList);
                    break;

                case 5:
                    printMenu();

                case 6:
                    if (playList.size()>0){
                        listIterator.remove();
                        if (listIterator.hasNext()){
                            System.out.println("Now playing "+listIterator.next().toString());
                        }else {
                            if (listIterator.hasPrevious()){
                                System.out.println("Now playing "+listIterator.previous().toString());
                            }
                        }
                    }
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available options.\n");
        System.out.println("0 - to quit\n"+
                "1 - play next song\n"+
                "2 - play previous song\n"+
                "3 - replay the current song\n"+
                "4 - list of all songs\n"+
                "5 - print all available options\n"+
                "6 - delete current song");
        System.out.print("press:");
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