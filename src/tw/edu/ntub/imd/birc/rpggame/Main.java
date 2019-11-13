package tw.edu.ntub.imd.birc.rpggame;

import tw.edu.ntub.imd.birc.rpggame.character.Career;
import tw.edu.ntub.imd.birc.rpggame.trainingcamp.ArcherTrainingCamp;
import tw.edu.ntub.imd.birc.rpggame.trainingcamp.TrainingCamp;
import tw.edu.ntub.imd.birc.rpggame.trainingcamp.WarriorTrainingCamp;
import tw.edu.ntub.imd.birc.rpggame.trainingcamp.WizardTrainingCamp;

public class Main {

	public static void main(String[] args) {
		TrainingCamp warriorTrainingCamp = new WarriorTrainingCamp();
		Career warrior = warriorTrainingCamp.train();
		System.out.println(warrior);
		
		TrainingCamp archerTrainingCamp = new ArcherTrainingCamp();
		Career archer = archerTrainingCamp.train();
		System.out.println(archer);
		
		TrainingCamp wizardTrainingCamp = new WizardTrainingCamp();
		Career wizard = wizardTrainingCamp.train();
		System.out.println(archer);
	}

}
