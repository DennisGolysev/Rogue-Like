public class Item extends GameObject {
	
	public Item(int w, int h) {
		super(w, h);
	}
}

public class Armor extends Item {
	private int armorPoints_;
	
	public Armor(int w, int h, int armorPoints) {
		super(w, h);
		armorPoints_ = armorPoints;
	}
}

public class Weapon extends Item {
	private int damage_;
	private int range_;
	
	public Weapon(int w, int h, int damage, int range) {
		super(w, h);
		damage_ = damage;
		range_ = range;
	}
}

public class RangedWeapon extends Weapon {
	private int range_;
	
	public RangedWeapon(int w, int h, int damage, int range) {
		super(w, h, damage, range);
	}
}

public class MeleeWeapon extends Weapon {
	
	public MeleeWeapon(int w, int h, int damage, int range) {
		super(w, h, damage, range);
	}
}

public class Consumable extends Item {
	
	public Consumable(int w, int h) {
		super(w, h);
	}
}

public class Potion extends Consumable {
	private int healthAdded_;
	
	public Potion(int w, int h, int healthAdded) {
		super(w, h);
		healthAdded_ = healthAdded;
	}
}
