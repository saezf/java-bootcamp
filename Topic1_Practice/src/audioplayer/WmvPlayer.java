package audioplayer;

public class WmvPlayer implements AdvancedMediaPlayer{
	
	@Override
	public void playWmv(String fileName) {
	      System.out.println("Playing vlc file. Name: "+ fileName);	
	}

	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub	
	}
	
	@Override
	public void pauseWmv(String fileName) {
	      System.out.println("Playing vlc file. Name: "+ fileName);	
	}

	@Override
	public void pauseMp4(String fileName) {
		// TODO Auto-generated method stub	
	}
	
	@Override
	public void stopWmv(String fileName) {
	      System.out.println("Playing vlc file. Name: "+ fileName);	
	}

	@Override
	public void stopMp4(String fileName) {
		// TODO Auto-generated method stub	
	}
}