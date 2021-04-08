package ro.ase.cts.classes.decorator;

public class ConcreteDecorator extends AbstractDecorator {
	
	public ConcreteDecorator(ICard card) {
		super(card);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void platesteContactless() {
		
		System.out.println(super.getCard().getDetinatorCard()+" a platit contactless");
		
	}


}
