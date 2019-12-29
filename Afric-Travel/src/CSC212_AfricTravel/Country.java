package CSC212_AfricTravel;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;


/**
 * This represents a country in our travel game.
 * @authors Sabra Mouhi, Wasila Yussif, Yolanda Chigiji
 * @reference JFoley
 */

public class Country {
	/**
	 * This is the list of countries the player travels to.
	 */
     private List<Transportation> transportations;
     /**
      * This is the identifier of the country.
      */
     private String id; 
     /**
      * Describe the country or tourist attractions to the player.
      */
     private String description;
     /**
      * This is the list of souvenirs and special tools that the player can 
      * find in a country.
      */
     public List<String> Items = new ArrayList<>();
     /**
      * Determine if the country is a terminal destination.
      */
     private boolean terminal; 
     /**
      * Determine if the country has been visited already. 
      */
     private boolean visited;
	public BufferedImage image;
     /**
 	 * Internal only constructor for Country. Use {@link #create(String, String)} or {@link #terminal(String, String)} instead.
 	 * @param id - the internal id of this country.
 	 * @param description - the user-facing description of the country.
 	 * @param terminal - Determine if the country is a terminal destination.
 	 */
 	protected Country(String id, String description, boolean terminal) {
 		this.id = id;
 		this.description = description;
 		this.transportations = new ArrayList<>();
 		this.terminal = terminal;
 		this.visited = false;
 	}/**
	 * if the player revisits the same country more than once, the game informs them
	 * that the country has already been visited.
	 * @return
	 */
	public boolean hasVisited() {
		return this.visited;
	}
	
	public void visit() {
		this.visited = true;
}/**
	 * Create a mode of transportation for the player to travel to another country.
	 * @param transportation - the description and destination of the other country.
	 */
	public void addTransportation(Transportation transportation) {
		this.transportations.add(transportation);
	}
	
	public void setImage(BufferedImage image) {
		this.image = image;
		
	}
	
	/**
	 * For gameplay, whether arriving to this country ends the game.
	 * @return true if this is the end.
	 */
	public boolean isTerminalState() {
		return this.terminal;
	}
	/**
	 * The internal id of this country, for referring to it in {@link Transportation} objects.
	 * @return the id.
	 */
	public String getId() {
		return this.id;
	}
	/**
	 * The narrative description of this place.
	 * @return what we show to a player about this country.
	 * e.g: Short description of the country, as well as tourist attractions
	 * for a certain countries.
	 */
	public String getDescription() {
		return this.description;
	}
	/**
	 * All the tools and souvenirs in Items get printed out along with the description
	 * of the country until they are taken by the player.
	 */
	public void printDescription() {
		System.out.println(getDescription());
		for (int i = 0; i < this.Items.size(); i++) {
		System.out.println("There is a " + this.Items.get(i));
		}
	}
	
	/**
	 * Get a view of the options of transportation given in a certain country.
	 * @return all countries from this place.
	 */
	public List<Transportation> getVisibleTransportations() {
		List<Transportation> visible = new ArrayList<>();
		for (Transportation t : this.transportations) {
			visible.add(t);
		}
		return visible;
	}
	/**
	 * Search all secretTransportation to turn them from 
	 * invisible to visible for the player.
	 */
	public void searchTransportation() {
		for (Transportation t  : this.transportations) {
			if (t.isSecret() == true) {
				((SecretTransportation) t).search();
			}
		}
	} 
	/**
	 * this method returns a list of items in a country.
	 * @return
	 */
	public List<String> getItems() {        
		return this.Items;
	}
	
	/**
	 * This is a terminal location (good or bad).
	 * @param id - this is the id of the place (for creating {@link Transportation} objects that go here).
	 * @param description - this is the description of the country.
	 * @return the country object.
	 */
	public static Country terminal(String id, String description) {
		return new Country(id, description, true);
	}
	
	/**
	 * Create a country with an id and description.
	 * @param id - this is the id of the country (for creating {@link Transportation} objects that go here).
	 * @param description - this is what we show to the user.
	 * @return the new country object (add Transportation to it).
	 */
	public static Country create(String id, String description) {
		return new Country(id, description, false);
	}
	
	/**
	 * Implements what we need to put Place in a HashSet or HashMap.
	 */
	public int hashCode() {
		return this.id.hashCode();
	}
	
	/**
	 * Give a string for debugging what place is what.
	 */
	public String toString() {
		return "Place("+this.id+" with "+this.transportations.size()+" transportations.)";
	}
	
	/**
	 * Whether this is the same place as another.
	 */
	public boolean equals(Object other) {
		if (other instanceof Country) {
			return this.id.equals(((Country) other).id);
		}
		return false;
	}
	
	
}

	
	
	
