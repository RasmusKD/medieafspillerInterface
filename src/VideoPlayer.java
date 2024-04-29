public class VideoPlayer implements MediaPlayable {

    @Override
    public void play() {
        System.out.println("playing video...");
    }

    @Override
    public void pause() {
        System.out.println("Video paused.");
    }

    @Override
    public void stop() {
        System.out.println("Video stopped.");
    }
}
