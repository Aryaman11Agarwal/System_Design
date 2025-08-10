public class Main {
    public static void main(String[] args) {

        Playlist playlist=new Playlist();

        playlist.addSong("SONG1 ");

        playlist.addSong("SONG2");
        playlist.addSong("SONG3 Fav");
        playlist.addSong("SONG4 ");
        playlist.addSong("SONG5 Fav");


        System.out.println("Playing simple iterator \n");

        Iterator it=playlist.getIterator("Simple");
        while(it.hasNext()){
            System.out.println("Playing song "+  it.next());
        }
        System.out.println("\n");
        System.out.println("Playing Shuffle iterator");
        System.out.println("\n");
        it=playlist.getIterator("Shuffle");


        while(it.hasNext()){
            System.out.println("Playing song "+  it.next());
        }

        System.out.println("\n");
        System.out.println("Playing Favourite iterator");
        System.out.println("\n");
        it=playlist.getIterator("Favourite");


        while(it.hasNext()){
            System.out.println("Playing song "+  it.next());


        }
    }
}