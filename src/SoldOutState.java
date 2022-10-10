
public class SoldOutState implements State {
	
	GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You can t' insert a quater, the machine is sold out");
		
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You can't eject, you haven't inserted a quarter yet");
		
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned, but there are are no gumballs");
		
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		
	}
	
}
