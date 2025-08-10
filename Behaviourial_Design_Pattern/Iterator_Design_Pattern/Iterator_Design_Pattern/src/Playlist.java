import java.util.ArrayList;

public class Playlist {

    private ArrayList<String> songs;

    Playlist(){
        this.songs=new ArrayList<>();
    }
    public void addSong(String song){
        songs.add(song);
    }

    public ArrayList<String> getSongs(){
        return songs;
    }
    public Iterator getIterator(String type){

        if(type=="Simple"){
            return new SimpleIterator(this);
        } else if (type == "Shuffle") {
            return new ShuffleIterator(this);
        } else if (type == "Favourite") {
            return new FavouriteIterator(this);
        } else {
            return null;
        }

    }
}
