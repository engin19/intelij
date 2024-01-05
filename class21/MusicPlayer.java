package class21;
/*Task1) Music Player System: Create a class MusicPlayer w
ith methods like play(), pause(), stop(), and fields such as currentTrack and volume.
Implement subclasses for different types of music players, like MP3Player, CDPlayer,
and StreamingPlayer, each with their unique implementations of the play()
 method (e.g., streaming from the internet, playing from a CD).
*/
public abstract class MusicPlayer {
    String currentTrack;
    int volume;

    public MusicPlayer(String currentTrack, int volume) {
        this.currentTrack=currentTrack;
        this.volume=volume;
    }



    abstract void play(String currentTrack, int volume);
    abstract void pause(String currentTrack, int volume);
    abstract void stop(String currentTrack, int volume);
}
 class Mp3Player extends MusicPlayer {
    public Mp3Player(String currentTrack, int volume) {
        super(currentTrack, volume);
    }
    @Override
    void play(String currentTrack, int volume){
        System.out.println("MP3 player is playing "+currentTrack+" volume is "+volume);
    }
    @Override
    void pause(String currentTrack, int volume){
        System.out.println("MP3 player currently paused");
    }
    @Override
    void stop(String currentTrack, int volume){
        System.out.println("MP3 player stopped");
    }
}
class CdPlayer extends MusicPlayer{
    public CdPlayer(String currentTrack,int volume){
        super(currentTrack,volume);
    }


    @Override
    void play(String currentTrack, int volume){
        System.out.println("CD player is playing "+currentTrack+" volume is "+volume);
    }
    @Override
    void pause(String currentTrack, int volume){
        System.out.println("CD player currently paused");
    }
    @Override
    void stop(String currentTrack, int volume){
        System.out.println("CD player stopped");
    }
}
class StreamingPlayer extends MusicPlayer{
    public StreamingPlayer(String currentTrack,int volume){
        super(currentTrack,volume);
    }


    @Override
    void play(String currentTrack, int volume){
        System.out.println("Streaming player is playing "+currentTrack+" volume is "+volume);
    }
    @Override
    void pause(String currentTrack, int volume){
        System.out.println("Streaming player currently paused");
    }
    @Override
    void stop(String currentTrack, int volume){
        System.out.println("Streaming player stopped");
    }
}
