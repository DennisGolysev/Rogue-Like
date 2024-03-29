public class Roomgeneration {
	private int pity_;
	private int maxH_;
	private int maxW_;
	private Room root_;
	private Random ran_;
	
	public Roomgeneration() {
		ran_ = new Random();
		pity_ = ran_.nextInt(5) + 1;
		maxH_ = 11;
		maxW_ = 11;+
		
		root_ = GenerateRoom();
	}
	
	public Room GenerateRoom() {
		int nCount = ran_.nextInt(3) + 1;
		RoomSource source = new RoomSource(0, null);
		return new Room(maxH_, maxW_, nCount, source);
	}
}

public class Room {
	private int roomDifficulty_;
	private int h_;
	private int w_;
	private Random ran_;
	
	private boolean[] doors;
	private Room[] neighbours;
	
	public Room(int difficulty, int h, int w, int nCount, RoomSource source) {
		ran_ = new Random();
		roomDifficulty_ = difficulty;
		h_ = h;
		w_ = w;
		
		if(source.GetSource() != null) {
			doors[source.GetSide()] = true;
			neighbours[source.GetSide()] = source.GetSource();
		}
		
		for(int i = 0; i < nCount; i++) {
			doors[i] = true;
		}
	}
	
	//Spieler übermittelt:
	//Himmelsrichtigung des neuen Raums in int (Norden ist 0)
	public void GenerateRoom(int side) {
		if(doors[side]) {
			int nCount = ran_.nextInt(3) + 1;
			RoomDirection rDir = new RoomDirection(side);
			RoomSource newSource = new RoomSource(rDir.inc(2), this),
			neighbours[side] = new Room(roomDifficulty_ + 1, h_, w_, nCount, newSource);
		}
	}
	
	//Gegner
	public void GenerateEnemy() {
		
	}
	
	//Gegenstände
	public void GenerateLayout() {
		
	}
}

public class RoomDirection {
    private int value;

    public RoomDirection(int value) {
        this.value = value;
    }

    public void inc(int num) {
        for(int i = 0; i < num; i++) {
            if(value < 3) {
                value = value + 1;
            } else {
                value = 0;
            }
        }
    }
}

public class RoomSource {
    private int side_;
	private Room source_;

    public RoomSource(int side, Room source) {
        this.side_ = side;
		this.source_ = source;
    }

    public int GetSide() {
        return side_;
    }
	
	public Room GetSource() {
		return source_;
	}
}
