package audioplayer;

public class TestAudioPlayer {
   public static void main(String[] args) {
      AudioPlayer audioPlayer = new AudioPlayer();

      audioPlayer.play("mp3", "Stairway to Heaven.mp3");
      audioPlayer.play("mp4", "Back in Black.mp4");
      audioPlayer.play("vlc", "Welcome to the Jungle.vlc");
      audioPlayer.play("avi", "Gimme Shelter.avi");
   }
}