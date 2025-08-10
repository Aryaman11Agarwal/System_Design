import java.util.ArrayList;

public class FavouriteIterator implements Iterator{


    private Playlist playlist;
    int index;
    FavouriteIterator(Playlist playlist){
        this.playlist=playlist;

        index=0;


    }

    public boolean hasNext(){


        while(index<playlist.getSongs().size()){
            if(playlist.getSongs().get(index).contains("Fav")) return true;

            index++;
        }

        return false;
    }

    public String next(){

        return playlist.getSongs().get(index++);

    }
}
