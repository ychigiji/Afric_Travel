package CSC212_AfricTravel;

public class SecretTransportation extends Transportation {
	
	private boolean isSecret;

	public SecretTransportation(String destination, String description) {
		super(destination, description);
		this.isSecret = true;
	}
/**
* This method implies that secretTransportations are always secret
* and different than the regular exits.
*/
	@Override
	public boolean isSecret() {
	return this.isSecret;

	}
/**
* This method implies that an exit is secret until you search it.
*/
	@Override
	public void search() {
	this.isSecret = false;
	
	}

	
}
