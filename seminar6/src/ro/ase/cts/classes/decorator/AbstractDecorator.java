package ro.ase.cts.classes.decorator;

public abstract class AbstractDecorator implements ICard{
	
	private ICard card;

	@Override
	public void platesteOnline() {
		card.platesteOnline();
		
	}
	
	

	public AbstractDecorator(ICard card) {
		super();
		this.card = card;
	}



	@Override
	public void platesteFizic() {
		card.platesteFizic();
	}
	
	@Override
	public String getDetinatorCard()
	{
		return card.getDetinatorCard();
	}
	
	public ICard getCard() {
		return card;
	}

	public abstract void platesteContactless();
}
