package lessons.turtleart;

import plm.universe.turtles.Turtle;

class ScalaSquareEntity extends Turtle {

	/* BEGIN TEMPLATE */
	override def run() {
		/* BEGIN SOLUTION */
        addSizeHint(35,50, 35,250);
        addSizeHint(250,35, 50,35);

        for (i <- 1 to 4) {
        	forward(200);
        	right(90);
        }
		/* END SOLUTION */
	}
	/* END TEMPLATE */
}
