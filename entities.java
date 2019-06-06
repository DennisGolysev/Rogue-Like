public class Entity extends GameObject {
	private int health_;
	private int damage_;
	private int speed_;
	
	public Entity(int w, int h, int health, int damage, int speed) {
		super(w, h);
		health_ = health;
		damage_ = damage;
		speed_ = speed;
	}
	
	public int GetHealth() {
		return health_;
	}
	
	public int GetDamage() {
		return damage_;
	}
	
	public int GetSpeed() {
		return speed_;
	}
}

public class Player extends Entity {
	
	public Tile(int w, int h, int health, int damage, int speed) {
		super(w, h, health, damage, speed);
	}
}

public class Enemy extends Entity {
	private String id_;
	
	public Tile(int w, int h, int health, int damage, int speed, String id) {
		super(w, h, health, damage, speed);
		id_ = id;
	}
}
