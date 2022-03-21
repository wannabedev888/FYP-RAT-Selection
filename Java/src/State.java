
public class State {
	private QLearning learner;
	private int time_state;
	private int location_state;
	private int scenario_state;
	
	public State (QLearning learner, int time_state, int location_state, int scenario_state) {
		this.learner = learner;
		this.time_state = time_state;
		this.location_state = location_state;
		this.scenario_state = scenario_state;
	}
	
	public QLearning getlearner() {
		return learner;
	}
}
