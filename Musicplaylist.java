import java.util.*;
class Node{
    String song;
    Node prev;
    Node next;

    Node(String song){
        this.song = song;
        prev = null;
        next = null;
    }
}

class playlist{
    Node head = null;
    Node tail = null;
    Node current = null;

    void insertSong(String song){
        Node newNode = new Node(song);
        if(head == null){
            head = tail = current = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println("song added succesfully");
    }
    void playNext(){
        if(current == null){
            System.out.println("playlist is empty");
        }else if(current.next != null){
            current = current.next;
            System.out.println("now playing : " + current.song);
        }else{
            System.out.println("already at last song");
        }
    }
    void previousSong(){
        if(current == null){
            System.out.println("empty playlist");
        }else if(current.prev != null){
            System.out.println("now playing : " + current.song);
        }else{
            System.out.println("Already at the first song");
        }

    }
    void removeSong(String song){
        Node temp = head;
        while(temp != null && !temp.song.equalsIgnoreCase(song)){
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("Song not found");
        }
        if(temp == head)
            head = head.next;
        if(temp == tail)
            tail = tail.prev;
        if(temp.prev != null)
            temp.prev.next = temp.next;
        if(temp.next != null)
            temp.next.prev = temp.prev;
        if(current == temp)
            current = head;
        System.out.println("Song removed Succesfully");        
    }
    void displayForward(){
        if(head == null){
            System.out.println("playllist empty");
            return;
        }
        Node temp = head;
        System.out.println("\n playlist forward:");
        while(temp != null){
            System.out.println(temp.song);
            temp = temp.next;
        }
    }
    void reverse(){
        if(tail == null){
            System.out.println("playlist empty");
            return;
        }
        Node temp = tail;
        System.out.println("displaying in reverse:");
        while(temp != null){
            System.out.println(temp.song);
            temp = temp.prev;
        }
    }
    void currentSong(){
        if(current != null){
            System.out.println("current song :" + current.song);
        }
    }
}

public class Musicplaylist{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        playlist p = new playlist();
        int choice;
        do{
            System.out.println("\n===== Music Playlist Menu =====");
            System.out.println("1. Insert Song");
            System.out.println("2. Play Next Song");
            System.out.println("3. Play Previous Song");
            System.out.println("4. Remove Song");
            System.out.println("5. Display Playlist (Forward)");
            System.out.println("6. Display Playlist (Reverse)");
            System.out.println("7. Show Current Song"); 
            System.out.println("8. Exit");

            System.out.println("enter your choice :");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice){

                case 1 :
                    System.out.println("enter song name:");
                    String song = sc.nextLine();
                    p.insertSong(song);
                    break;

                case 2 :
                    p.playNext();
                    break;

                case 3 :
                    p.previousSong();
                    break;

                case 4 :
                    System.out.println("enter the song to remove :");
                    String removeSong = sc.nextLine();
                    p.removeSong(removeSong);
                    break;

                case 5 :
                    p.displayForward();
                    break;

                case 6 :
                    p.reverse();
                    break;

                case 7 :
                    p.currentSong();
                    break;

                case 8 :
                    System.out.println("Eixiting playlist:");
                    break;

                default:
                    System.out.println("invalid choice!");
            }
        }while(choice !=8);
        sc.close();
    }
}