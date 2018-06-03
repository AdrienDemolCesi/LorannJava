package model.element.mobile;

import java.awt.Point;

import model.ILevel;
import model.IMobile;
import model.Permeability;
import model.element.Element;
import model.element.Sprite;
import showboard.IBoard;


public abstract class Mobile extends Element implements IMobile {
    /**
     * The x.
     */
    private Point   position;

    /** The alive. */
    protected Boolean alive;
    /** The road. */
    private ILevel  level;

    public int getStartxLorann() {
		return StartxLorann;
	}
	public static void setStartxLorann(int startxLorann) {
		StartxLorann = startxLorann;
	}
	public int getStartyLorann() {
		return StartyLorann;
	}
	public static void setStartyLorann(int startyLorann) {
		StartyLorann = startyLorann;
	}
	public static int getStartxMonster1() {
		return StartxMonster1;
	}
	public static void setStartxMonster1(int startxMonster1) {
		StartxMonster1 = startxMonster1;
	}
	public static int getStartyMonster1() {
		return StartyMonster1;
	}
	public static void setStartyMonster1(int startyMonster1) {
		StartyMonster1 = startyMonster1;
	}
	public static int getStartxMonster2() {
		return StartxMonster2;
	}
	public static void setStartxMonster2(int startxMonster2) {
		StartxMonster2 = startxMonster2;
	}
	public static int getStartyMonster2() {
		return StartyMonster2;
	}
	public static void setStartyMonster2(int startyMonster2) {
		StartyMonster2 = startyMonster2;
	}
	/** The board. */
    private IBoard  board;
    
    
    private int gold = 0;
    public int vie = 11;
    
    public static int StartxLorann ;
    public static int StartyLorann;
    

	public static int StartxMonster1;
    public static int StartyMonster1;
    
    public static int StartxMonster2;
    public static int StartyMonster2;
    
    Mobile(final Sprite sprite, final ILevel level, final Permeability permeability) {
        super(sprite, permeability);
        this.setLevel(level);
        this.position = new Point();
    }
    /**
     * Instantiates a new mobile.
     *
     * @param x
     *            the x
     * @param y
     *            the y
     * @param sprite
     *            the sprite
     * @param road
     *            the road
     * @param permeability
     *            the permeability
     */
    protected Mobile(final int x, final int y, final Sprite sprite, final ILevel level, final Permeability permeability) {
        this(sprite, level, permeability);
        this.setX(x);
        this.setY(y);
    }
    

    /*
     * (non-Javadoc)
     * @see fr.exia.insanevehicles.model.element.mobile.IMobile#moveUp()
     */
    @Override
    public void moveUp() {
        this.setY(this.getY() - 1);
        this.setHasMoved();
        if (this.isCrashed()) {
        	moveDown();
        }
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.insanevehicles.model.element.mobile.IMobile#moveLeft()
     */
    @Override
    public void moveLeft() {
        this.setX(this.getX() - 1);
        this.setHasMoved();
        if (this.isCrashed()) {
        	moveRight();
        }
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.insanevehicles.model.element.mobile.IMobile#moveDown()
     */
    @Override
    public void moveDown() {
        this.setY(this.getY() + 1);
        this.setHasMoved();
        if (this.isCrashed()) {
        	moveUp();
        }
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.insanevehicles.model.element.mobile.IMobile#moveRight()
     */
    @Override
    public void moveRight() {
        this.setX(this.getX() + 1);
        this.setHasMoved();
        if (this.isCrashed()) {
        	moveLeft();
        }
    }
   
    

    
    @Override
    public void moveDownRight() {
        this.setX(this.getX() + 1);
        this.setY(this.getY() + 1);
        this.setHasMoved();
        if (this.isCrashed()) {
        	moveUpLeft();
        }
        
    }
    
    @Override
    public void moveDownLeft() {
        this.setX(this.getX() - 1);
        this.setY(this.getY() + 1);
        this.setHasMoved();
        if (this.isCrashed()) {
        	moveUpRight();
        }
    }
    
    @Override
    public void moveUpRight() {
        this.setX(this.getX() + 1);
        this.setY(this.getY() - 1);
        this.setHasMoved();
        if (this.isCrashed()) {
        	moveDownLeft();
        }
    }
    
    @Override
    public void moveUpLeft() {
        this.setX(this.getX() - 1);
        this.setY(this.getY() - 1);
        this.setHasMoved();
        if (this.isCrashed()) {
        	moveDownRight();
        }
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.insanevehicles.model.element.mobile.IMobile#doNothing()
     */
    @Override
    public void doNothing() {
        this.setHasMoved();
    }

    /**
     * Sets the has moved.
     */
    private void setHasMoved() {
        this.getLevel().setMobileHasChanged();
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.insanevehicles.model.element.mobile.IMobile#getX()
     */
    @Override
    public int getX() {
        return this.getPosition().x;
    }

    /**
     * Sets the x.
     *
     * @param x
     *            the new x
     */
    public final void setX(final int x) {
        this.getPosition().x = x;
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.insanevehicles.model.element.mobile.IMobile#getY()
     */
    @Override
    public int getY() {
        return this.getPosition().y;
    }

    /**
     * Sets the y.
     *
     * @param y
     * 
     */
    public final void setY(final int y) {
        this.getPosition().y = y;

    }
    /**
     * Gets the road.
     *
     * @return the road
     */
    public ILevel getLevel() {
        return this.level;
    }
    /**
     * Sets the road.
     *
     * @param road
     *            the new road
     */
    private void setLevel(final ILevel level) {
        this.level = level;
    }
    /*
     * (non-Javadoc)
     * @see fr.exia.insanevehicles.model.element.mobile.IMobile#isAlive()
     */
    @Override
    public Boolean isAlive() {
        return this.alive;
    }
    /**
     * Dies.
     */
    public void alive() {
    	this.alive = true;
    }
    /**
     * Dies.
     */
    
    /*
     * (non-Javadoc)
     * @see fr.exia.insanevehicles.model.element.mobile.IMobile#isCrashed()
     */
    @Override
    public Boolean isCrashed() {
        return this.getLevel().getOnTheLevelXY(this.getX(), this.getY()).getPermeability() == Permeability.BLOCKING;
    }
    
    /*public Boolean isFacingLorann() {
    return this.getX() == ControllerFacade.getModel().getLorann().getX() && this.getY() == ControllerFacade.getModel().getLorann().getY();
}*/
    
    
    /*public void MonsterisFacingLorann() {
        if(this.isFacingLorann()) {
        	vie--;
        	System.out.println("Vies : "+ vie);
        }
    	if(vie<1) {
    		this.die();
    	}
    }*/
    	
	
	/*public Boolean inFrontOfMotionLessKill() {
        return this.getLevel().getOnTheLevelXY(this.getX(), this.getY()).getPermeability() == Permeability.KILL;
    }*/

    /*
     * (non-Javadoc)
     * @see fr.exia.showboard.IPawn#getPosition()
     */
    /*
     * (non-Javadoc)
     * @see fr.exia.insanevehicles.model.element.mobile.IMobile#getPosition()
     */
    @Override
    public Point getPosition() {
        return this.position;
    }
    /**
     * Sets the position.
     *
     * @param position
     *            the position to set
     */
    public void setPosition(final Point position) {
        this.position = position;
    }
    /**
     * Gets the board.
     *
     * @return the board
     */
    protected IBoard getBoard() {
        return this.board;
    }
	public int getGold() {
		return gold;
	}
	public void setGold(int gold) {
		this.gold = gold;
	}
	
	public void Die(){
		if(vie<1) {
	        this.alive = false;
	        this.setHasMoved();
		}
		else {
			vie--;
			System.out.println("Vies : "+ vie);
			this.Respawn();
		}
	}
	
	public void Respawn() {
    	this.setX(this.getStartxLorann());
    	this.setY(this.getStartyLorann());
	}
	
	
}
