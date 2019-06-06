public abstract class GameObject {
	private int w_;
	private int h_;
	
	public GameObject(int w, int h) {
		w_ = w;
		h_ = h;
	}
}	

public class Tile extends GameObject {
	
	public Tile(int w, int h) {
		super(w, h);
	}
}
