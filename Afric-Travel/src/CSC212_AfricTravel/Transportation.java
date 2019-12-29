package CSC212_AfricTravel;

import java.util.Objects;

/**
 * This class represents the transportation the player uses to get from 
 * one country to another.
 * @author Sabra Mouhi, Wasila Yussif, Yolanda Chigiji.
 * @reference JFoley
 */
public class Transportation{
	/**
	 *description of this mode of transportation to the player,
	 * e.g., "Follow the tourists by foot"
	 */
	private String description;
	/**
	 * How do we identify the destination that this mode of transportation
	 *  will take the player to.
	 */
	private String destination;
		
	/**
	 * Create a new transportation.
	 * @param destination - Where it goes.
	 * @param description - What it is.
	 */
	public Transportation(String destination, String description) {
		this.description = description;
		this.destination = destination;
		
	}
	
	/**
	 * A getter for the description of this mode of transportation.
	 * @return What it is.
	 */
	public String getDescription() {
		return this.description;
	}
	
	/**
	 * A getter for the country the player will be transported to.
	 * @return where it goes.
	 */
	public String getDestination() {
		return this.destination;
	}
	
	/**
	 * Make this debug-able when we print it for ourselves.
	 */
	public String toString() {
		return "Transportation("+this.description+", "+this.destination+")";
	}
	
	/**
	 * Make it so we can put this in a HashMap or HashSet.
	 */
	public int hashCode() {
		return Objects.hash(this.description, this.destination);
	}
	
	/**
	 * This is a useful definition of being the same.
	 * @param other - another transportation.
	 * @return if they go to the same place.
	 */
	public boolean goesToSameCountry(Transportation other) {
		return this.destination.equals(other.destination);
	}
	
	/**
	 * The other half of hashCode that lets us put it in a HashMap or HashSet.
	 */
	public boolean equals(Object other) {
		if (other instanceof Transportation) {
			Transportation rhs = (Transportation) other;
			return this.destination.equals(rhs.destination) && this.description.equals(rhs.description); 
		}
		return false;
	}

	/**
	 * this method implies that regular transportations are never secret.
	 * You don't need to search for the mode of transportation to find it.
	 * @return
	 */
    public boolean isSecret() {
    	return false;
    }
/**
 * regular transportation are already visible, therefore the method search won't change
 * anything unless it is a secret transportation.
 */
    public void search() {
    	
    }
    
    /**
     * The user can always use regular transportation without needing a special tool.
     * 
     * @param stuff
     * @return
     */
    
   public boolean isLocked() {
    	return false;
   }

	
}




