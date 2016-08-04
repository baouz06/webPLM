package sort.basic.shell;


import plm.core.model.lesson.ExerciseTemplated;

import plm.universe.sort.SortingWorld;

public class AlgShellSort extends ExerciseTemplated {

	public AlgShellSort() {
		super("AlgShellSort", "AlgShellSort");
		
		SortingWorld[] myWorlds = new SortingWorld[2];
		myWorlds[0] = new SortingWorld("Functional test",10);
		myWorlds[1] = new SortingWorld("Performance test (150 elms)",150);

		setup(myWorlds);
	}
	
}