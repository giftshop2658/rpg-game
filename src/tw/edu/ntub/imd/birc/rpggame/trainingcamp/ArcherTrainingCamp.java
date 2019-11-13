package tw.edu.ntub.imd.birc.rpggame.trainingcamp;

import tw.edu.ntub.imd.birc.rpggame.character.Archer;
import tw.edu.ntub.imd.birc.rpggame.character.Career;

public class ArcherTrainingCamp implements TrainingCamp {
	
	@Override
	public Career train() {
		Archer archecr = new Archer();
		archecr.setHealthPoint(165);
		archecr.setMagicPoint(79);
		archecr.setAttack(65);
		archecr.setMagicAttack(20);
		archecr.setDefence(10);
		archecr.setMagicDefence(10);
		return archecr;
	}
}
