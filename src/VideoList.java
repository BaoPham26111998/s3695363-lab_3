import java.util.ArrayList;

public class VideoList {
private ArrayList<Video> theList;
	
	public VideoList() {
		this.theList = new ArrayList<Video>();
	}
	
	public ArrayList<Video> getList() {
		return this.theList;
	}

	int tmpVideo = 0;

	public boolean hasNext(){
		if(tmpVideo >= theList.size()){
			tmpVideo=0;
			return false;
		}
		return true;
	}

	public Object next(){

		return theList.get(tmpVideo++);
	}
	
	public Video getVideo(String id) {
		for (int i = 0; i < this.theList.size(); i++) {
			Video temp = this.theList.get(i);
			if (temp.getID().equals(id))
				return temp;
		}
		System.out.println("Video " + id + " not found");
		return null;
	}
	
	public boolean addVideo(Video vid) {
		for (int i = 0; i < this.theList.size(); i++) {
			Video temp = this.theList.get(i);
			if (temp.getID().equals(vid.getID()))
				return false;
		}
		theList.add(vid);
		return true;
	}
}
