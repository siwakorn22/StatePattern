
public class NoQuarterState implements State {
	
	GumballMachine gumballMachine;
	
	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter");	
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned, but there's no quarter");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispense() {
		System.out.println("You need to pay first");
		// TODO Auto-generated method stub
		
	}


}