import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ShuffleIterator implements Iterator{

    private Playlist playlist;
    int index;

    private ArrayList<String> shuffledSongs;

    ShuffleIterator(Playlist playlist){
        this.playlist=playlist;
        shuffledSongs= new ArrayList<>(playlist.getSongs());
        index=0;
        Collections.shuffle(shuffledSongs);
    }

    public boolean hasNext(){
        if(index<shuffledSongs.size()) return true;

        return false;
    }

    public String next(){

        return shuffledSongs.get(index++);
    }


}
