package CSC212_AfricTravel;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * This is our main class for AfricTravel. It interacts with an AfricTravelWorld and
 * handles user-input.
 * @author Sabra Mouhi, Wasila Yussif, Yolanda Chigiji. 
 * @reference jFoley
 */

public class InteractiveAfrica {
	/**
	 * This method enables the player to play the game.
	 * 
	 * @param input - a helper object to ask the user questions.
	 * @param game  - the countries and transportation that make up the game we're playing.
	 * @return where - the country the player visited.
	 */
	static String runGame(TextInput input, AfricTravelWorld game, Afric_Travel_Graphics_window map ) {
		// This is the current location of the player (initialize as start).
		// Maybe we'll expand this to a Player object.
		String country = game.getStart();
		
		
		/**
		 * This is the list of items the player carries in their bag. 
		 */
		
		int points = 0;
		
		
		/** The player can keep playing the game as long as they are not in 
		 * a terminal country. However, they can quit whenever they want using 
		 * this method.
		 */
		while (true) {
			/**Print the description of the country the player arrived at and the items there.
			*/
			Country here = game.getCountry(country);
			map.setImage(here);
			
			System.out.println();
			System.out.println("... --- ...");
//			System.out.println("Country = " + country);
//			System.out.println("here = " + here);
			
			here.printDescription();
			
			
			/**
			 * If the player has already visited a certain country more than 
			 * once the game informs them about it.
			 */

			if (here.hasVisited()) {
				points -= 10;
				
				System.out.println("You have visited this country before...");
				System.out.println("You have "+ points + " points");
			}
			else if (here.hasVisited() == false) {
				points += 50;
				System.out.println("You have "+ points + " points");
				
			}
						
			here.visit();
			
			if (here.isTerminalState()) {
				break;
				
			}
		
		/** Show the player the different modes of transportation available
		 * to travel to another country.
		 */
		List<Transportation> transportations = here.getVisibleTransportations();
		for (int i = 0; i < transportations.size(); i++) {
			Transportation t = transportations.get(i);
			if (t.isSecret() == false) {
				System.out.println(" " + i + ". " + t.getDescription());
			}
		}
		
		
	/**Figure out what action player wants to take.
	 * e.g: quit, help, take..etc
	 */
		
	   List<String> words = input.getUserWords("?");
	   if (words.size() > 1) {
		   System.out.println("Only give the system 1 word at a time!");
		   continue;
	}			
	
	/** Get the word they typed as lowercase, and no spaces.
	*Do not uppercase action -- I have lowercased it.
	*/
	String action = words.get(0).toLowerCase().trim();

	/**
	 * This list contains things that the player picked up from their 
	 * different traveling locations. E.g: keys, souvenirs..etc
	 */
	List<String> Bag = new ArrayList<>();
	
	/**
	* When the player types Take, they move the picked up item in the location
	* from its initial list " to carrying list.
	*/
	if (action.equals("take")) {
		for (int i = 0; i < here.Items.size(); i++) {
		Bag.add(here.Items.get(i));
		here.Items.remove(i);	
			}
			
		/** This statement prints out the last item added to our carrying list
		* we don't want it to print every item on our list. Just the last one 
		* taken. 
		*/

		System.out.println("You take " + Bag.get(Bag.size()-1));
	    continue;
			}
		/**
		 * myItems is a command that prints out the items that the player took.
		 * Meaning the items on the bag list. 
		 * 
		 */
		if (action.equals("myItems")) {
			for (int i = 0; i < Bag.size(); i++) {
				if (Bag.size() == 0) {
					System.out.println("You have nothing.");
				} else {
					System.out.println("You have a " + Bag.get(i));
				}
			}
		}

		/**
	     * When the user types in search, secret exits are made visible to them.
		 */
		if (action.equals("search")) {
			here.searchTransportation();
			continue;
		}

		/**
		 * When the user types quit/escape/q they can quit the game.
		 */
		if (action.equals("quit") || action.equals("q") || action.equals("escape")) {
			if (input.confirm("Are you sure you want to quit?")) {
				return country;
				} else {
					continue;
					}
			}
		/**
		 * When the user types in help, The code explains to them what to do next
		 */
		if (action.equals("help")) {
			System.out.println("Type the number of the transportation mode " + "Or type in quit/escape/q to quit the Game");
		    continue;
				}

		// From here on out, what they typed better be a number!
		Integer transportationNum = null;
			try {
			   transportationNum = Integer.parseInt(action);
				} catch (NumberFormatException nfe) {
					System.out.println("That's not something I understand! Try a number!");
					continue;
				}

				if (transportationNum < 0 || transportationNum >= transportations.size()) {
					System.out.println("I don't know what to do with that number!");
					continue;
				}

				// Move to the room they indicated.
				Transportation destination = transportations.get(transportationNum);
				country = destination.getDestination();
		}

			return country;

		
	}

			/**
			 * This is where we play the game.
			 * 
			 * @param args
			 * @throws IOException 
			 */
		public static void main(String[] args) throws IOException {
			// This is a text input source (provides getUserWords() and confirm()).
			TextInput input = TextInput.fromArgs(args);

			// This is the game we're playing: AfricTravel
			AfricTravelWorld game = new AfricTravel();
			
			
			//Creating the new graphics window
			Afric_Travel_Graphics_window map = new Afric_Travel_Graphics_window ();
			//Graphics2D graphics =  (Graphics2D)Graphics.create();
			map.startViewer();
			
			// Actually play the game.
			runGame(input, game, map);
			
			
			
			/**
			 * This is the BurtonHall version of the game if you want to play it, uncomment it
			 * and comment the SpookyMansion instead.
			 */
			 

			

			// You get here by typing "quit" or by reaching a Terminal Place.
			
			System.out.println("\n\n>>> GAME OVER <<<");
			
			
		}

	}


	
