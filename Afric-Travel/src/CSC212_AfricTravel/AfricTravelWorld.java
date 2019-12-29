package CSC212_AfricTravel;

	/**
	 * This is the interface through which our main method in {@link InteractiveAfrica} interacts with different games.
	 *@author Sabra Mouhi, Wasila Yussif, Yolanda Chigiji. 
     * @reference jFoley
	 */
public interface AfricTravelWorld {
		/**
		 * What is the id of the starting location for this game?
		 * @return the id of a Place.
		 */
		String getStart();
		
		/**
		 * What is the Place for a given id in this game?
		 * @param id - the internal name of the Place.
		 * @return the place object.
		 */
		Country getCountry(String id);
	}


