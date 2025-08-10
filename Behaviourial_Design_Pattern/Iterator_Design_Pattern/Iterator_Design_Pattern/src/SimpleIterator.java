public class SimpleIterator implements Iterator{

    Playlist playlist;

    int index;

    SimpleIterator(Playlist playlist){
        this.playlist=playlist;
        index=0;
    }

    public boolean hasNext(){
        if(index<playlist.getSongs().size()) return true;

        return false;
    }

    public String next(){

        return playlist.getSongs().get(index++);
    }
}
