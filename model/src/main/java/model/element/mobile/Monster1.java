package model.element.mobile;

import java.io.IOException;

import model.ILevel;
import model.Permeability;
import model.element.Sprite;

public class Monster1 extends Mobile {
	
	
	 private static final Sprite SPRITE = new Sprite('C', "monster_1.png");

	    public Monster1(final int x, final int y, final ILevel level) throws IOException {
	        super(x, y, SPRITE, level, Permeability.KILL);
	        SPRITE.loadImage();

	    }

	    @Override
	    public final void moveLeft() {
	        super.moveLeft();
	    }
	    
	    @Override
	    public final void moveRight() {
	        super.moveRight();
	    }
	    
	    @Override
	    public final void moveUp() {
	        super.moveUp();
	    }
	    
	    
	    
	    public final void doNothing() {
	        super.doNothing();
	        this.setSprite(sprite);
	    }
	    
	    
	    public int getY() {
	        return this.getPosition().y;
	    }
	    
	    public int getX() {
	        return this.getPosition().x;
	    }
		@Override
		public void doNothingDown() {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void doNothingLeft() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void doNothingRight() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void doNothingUp() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void MonsterisFacingLorann() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void doNothingUpLeft() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void doNothingUpRight() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void doNothingDownRight() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void doNothingDownLeft() {
			// TODO Auto-generated method stub
			
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
