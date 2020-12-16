package tools;

import java.awt.Point;
import java.awt.Shape;
import java.awt.event.KeyEvent;
import java.awt.geom.Line2D;

<<<<<<< Updated upstream
public class LineTool extends AbstractPaintTool {

<<<<<<< Updated upstream
	private static final String MY_NAME = "Line";
	
	private static final int MY_MNEMONIC = KeyEvent.VK_L;
	
	private Point myNextPoint;
	
	public LineTool() {
		super(MY_NAME, MY_MNEMONIC);
		myNextPoint = NO_POINT;
	}
	
	@Override
	public Shape getShape() {
		return new Line2D.Double(getStartPoint().x, getStartPoint().y, myNextPoint.x, myNextPoint.y);
	}
	
=======
=======
/**
 * 
 * @author Kenneth Ahrens
 * @author Katlyn Malone
 * @version Fall 2020
 */

public class LineTool extends AbstractPaintTool {

>>>>>>> Stashed changes
	private static final String NAME = "Line";

	private static final int MNEMONIC = KeyEvent.VK_L;

	private Point myNextPoint;

	public LineTool() {
		super(NAME, MNEMONIC);
		myNextPoint = NO_POINT;
	}

	@Override
	public Shape getShape() {
		return new Line2D.Double(getStartPoint().x, getStartPoint().y,
				myNextPoint.x, myNextPoint.y);
	}

<<<<<<< Updated upstream
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
	@Override
	public void setStartPoint(Point thePoint) {
		super.setStartPoint(thePoint);
		myNextPoint = thePoint;
	}
<<<<<<< Updated upstream
<<<<<<< Updated upstream
	
=======

>>>>>>> Stashed changes
=======

>>>>>>> Stashed changes
	@Override
	public void setNextPoint(Point thePoint) {
		myNextPoint = thePoint;
	}

	@Override
	public void reset() {
		super.reset();
		myNextPoint = NO_POINT;
	}
<<<<<<< Updated upstream
<<<<<<< Updated upstream
	
	
	
	
=======

>>>>>>> Stashed changes
=======
	
	public String getName() {
		return NAME;
	}

>>>>>>> Stashed changes
}
