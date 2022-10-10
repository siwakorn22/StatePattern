
public class HasQuarterState implements State {
	GumballMachine gumballMachine;
	
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You can't insert another quarter");
		// TODO Auto-generated method stub

	}

	@Override
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
		// TODO Auto-generated method stub

	}

	@Override
	public void turnCrank() {
		System.out.println("You turned...");
		gumballMachine.setState(gumballMachine.getSoldState());
		// TODO Auto-generated method stub

	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed");
		// TODO Auto-generated method stub

	}

}
