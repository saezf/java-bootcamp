package audioplayer;

public interface MediaPlayer{
	public void play(String audioType, String fileName);
	public void stop(String audioType, String fileName);
	public void pause(String audioType, String fileName);
}