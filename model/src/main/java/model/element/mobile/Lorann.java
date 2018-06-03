package model.element.mobile;

import java.io.IOException;

import model.ILevel;
import model.Permeability;
import model.element.Sprite;



public class Lorann extends Mobile{
	
    int i = 1;
	
	/** The Constant SPRITE. */
    private static final Sprite sprite          = new Sprite('@', "lorann_l.png");

    /** The Constant spriteTurnLeft. */
    private static final Sprite spriteMoveLeft  = new Sprite('@', "lorann_l.png");

    /** The Constant spriteTurnRight. */
    private static final Sprite spriteMoveRight = new Sprite('@', "lorann_r.png");
    
    /** The Constant spriteMoveUp. */
    private static final Sprite spriteMoveUp  = new Sprite('@', "lorann_u.png");

    /** The Constant spriteMoveDown. */
    private static final Sprite spriteMoveDown = new Sprite('@', "lorann_b.png");
    
    /** The Constant spriteMoveDownRight. */
    private static final Sprite spriteMoveDownRight = new Sprite('@', "lorann_br.png");
    
    /** The Constant spriteMoveDownLeft. */
    private static final Sprite spriteMoveDownLeft = new Sprite('@', "lorann_bl.png");
    
    /** The Constant spriteMoveDownRight. */
    private static final Sprite spriteMoveUpRight = new Sprite('@', "lorann_ur.png");
    
    /** The Constant spriteMoveDownLeft. */
    private static final Sprite spriteMoveUpLeft = new Sprite('@', "lorann_ul.png");

    /** The Constant spriteDie. */
    private static final Sprite spriteDie  = new Sprite('@', "lorann_die.png");

    /**
     * Instantiates a new my vehicle.
     *
     * @param x
     *            the x
     * @param y
     *            the y
     * @param road
     *            the road
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public Lorann(final int x, final int y, final ILevel level) throws IOException {
        super(x, y, sprite, level, Permeability.LORANN);
        sprite.loadImage();
        spriteMoveLeft.loadImage();
        spriteMoveRight.loadImage();
        spriteMoveUp.loadImage();
        spriteMoveDown.loadImage();
        spriteDie.loadImage();
        spriteMoveDownRight.loadImage();
        spriteMoveDownLeft.loadImage();
        spriteMoveUpRight.loadImage();
        spriteMoveUpLeft.loadImage();
        
        
        
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.insanevehicles.model.element.mobile.Mobile#moveLeft()
     */
    @Override
    public final void moveLeft() {
        super.moveLeft();
        this.setSprite(spriteMoveLeft);
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.insanevehicles.model.element.mobile.Mobile#moveRight()
     */
    @Override
    public final void moveRight() {
        super.moveRight();
        this.setSprite(spriteMoveRight);
    }
    
    /*
     * (non-Javadoc)
     * @see fr.exia.insanevehicles.model.element.mobile.Mobile#moveLeft()
     */
    @Override
    public final void moveUp() {
        super.moveUp();
        this.setSprite(spriteMoveUp);
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.insanevehicles.model.element.mobile.Mobile#moveRight()
     */
    @Override
    public final void moveDown() {
        super.moveDown();
        this.setSprite(spriteMoveDown);
    }
    
    @Override
    public final void moveDownRight() {
        super.moveDownRight();
        this.setSprite(spriteMoveDownRight);
    }
    
    @Override
    public final void moveDownLeft() {
        super.moveDownLeft();
        this.setSprite(spriteMoveDownLeft);
    }
    
    @Override
    public final void moveUpRight() {
        super.moveUpRight();
        this.setSprite(spriteMoveUpRight);
    }
    
    @Override
    public final void moveUpLeft() {
        super.moveUpLeft();
        this.setSprite(spriteMoveUpLeft);
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.insanevehicles.model.element.mobile.Mobile#die()
     */
    @Override
	public final void Die() {
        super.Die();
        this.setSprite(spriteDie);
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.insanevehicles.model.element.mobile.Mobile#doNothing()
     */
    
    public final void doNothing() {
        super.doNothing();
        this.setSprite(sprite);
    }
    
    @Override
    public final void doNothingUp() {
        super.doNothing();
        this.setSprite(spriteMoveUp);
    }

	@Override
	public void doNothingRight() {
        super.doNothing();
        this.setSprite(spriteMoveRight);
		
	}

	@Override
	public void doNothingLeft() {
        super.doNothing();
        this.setSprite(spriteMoveLeft);
		
	}
	
	@Override
	public void doNothingDown() {
        super.doNothing();
        this.setSprite(spriteMoveDown);
		
	}

	@Override
	public void MonsterisFacingLorann() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doNothingUpLeft() {
        this.setSprite(spriteMoveUpLeft);
		
	}

	@Override
	public void doNothingUpRight() {
        this.setSprite(spriteMoveUpRight);		
	}

	@Override
	public void doNothingDownRight() {
        this.setSprite(spriteMoveDownRight);		
	}

	@Override
	public void doNothingDownLeft() {
        this.setSprite(spriteMoveDownLeft);		
	}

	@Override
	public Boolean isFacingMonster() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void LorannisFacingMonster() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SetVie(int vie) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getVie() {
		// TODO Auto-generated method stub
		return 0;
	}
}
