package class21;

public class MusicPlayerTester {
    public static void main(String[] args) {
        MusicPlayer[] arr={new Mp3Player("Come on Aileen",25),
                new CdPlayer(" I love you Aileen",35),
                new StreamingPlayer("Come back Aileen",20)};
        for(MusicPlayer a:arr){
            a.pause("Come on Aileen",35);
            System.out.println("__________________________________");
            a.play(" I love you Aileen",35);
            System.out.println("__________________________________");
            a.stop("Come back Aileen",20);
        }
    }
}
