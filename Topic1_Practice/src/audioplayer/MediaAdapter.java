package audioplayer;

public class MediaAdapter implements MediaPlayer{

	AdvancedMediaPlayer advancedMusicPlayer;
	
	public MediaAdapter(String audioType){
		if(audioType.equalsIgnoreCase("wmv") ){
			advancedMusicPlayer = new WmvPlayer();			
		} else if (audioType.equalsIgnoreCase("mp4")){
			advancedMusicPlayer = new Mp4Player();
		}	
	}
	
	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("wmv")){
			advancedMusicPlayer.playWmv(fileName);
		}else if(audioType.equalsIgnoreCase("mp4")){
			advancedMusicPlayer.playMp4(fileName);
		}
	}
	
	@Override
	public void stop(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("wmv")){
			advancedMusicPlayer.stopWmv(fileName);
		}else if(audioType.equalsIgnoreCase("mp4")){
			advancedMusicPlayer.stopMp4(fileName);
		}
	}
	
	@Override
	public void pause(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("wmv")){
			advancedMusicPlayer.pauseWmv(fileName);
		}else if(audioType.equalsIgnoreCase("mp4")){
			advancedMusicPlayer.pauseMp4(fileName);
		}
	}
}