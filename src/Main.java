public class Main {
    public static void main(String[] args) {

        MediaPlayable[] players = new MediaPlayable[2];
        players[0] = new AudioPlayer();
        players[1] = new VideoPlayer();

        for (MediaPlayable player : players) {
            System.out.println(player.getClass());
            player.play();
            player.pause();
            player.stop();
            System.out.println();
        }
    }
}