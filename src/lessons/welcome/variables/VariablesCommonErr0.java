package lessons.welcome.variables;

import plm.core.model.Game;

public class VariablesCommonErr0 extends plm.universe.bugglequest.SimpleBuggle {
	@Override
	public void forward(int i)  { 
		throw new RuntimeException(Game.i18n.tr("Sorry Dave, I cannot let you use forward with an argument in this exercise. Use a loop instead."));
	}

	@Override
	public void backward(int i) {
		throw new RuntimeException(Game.i18n.tr("Sorry Dave, I cannot let you use backward with an argument in this exercise. Use a loop instead."));
	}


	@Override
	public void run() {
		int nbSteps = 0;
		int backwardSteps = 0;
			
		while(!estSurBiscuit())
		{
			nbSteps = 0;
			backwardSteps = 0;

			forward();
			nbSteps++;

			if(isOverBaggle())
			{		
				pickupBaggle();
				while(backwardSteps != nbSteps)
				{
					backward();
					backwardSteps++;
				}
				dropBaggle();
			}
		}
	}
}
