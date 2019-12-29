package CSC212_AfricTravel;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;

/**
 * AfricTravel, the game.
 * @author Sabra Mouhi, Wasila Yussif, Yolanda Chigiji
 * @reference JJfoley
 */ 
public class AfricTravel implements AfricTravelWorld {
	private Map<String, Country> countries = new HashMap<>();

	/**
	 * Where should the player start?
	 */
	@Override
	public String getStart() {
		return "Madagascar";
	}

	public AfricTravel() throws IOException {
		Country Madagascar = insert(Country.create("Madagascar",
				"Welcome to this amazing Island. You are about to enjoy an amazing tour of Africa. \n"
				+ "The airlines are not working. Which mode of transport would you like to use? \n"));
				Madagascar.addTransportation(new Transportation("Mozambique", "That looks like an old and rusty ship. But it looks good enough to "
				+ "take you somewhere amazing!"));
				Madagascar.addTransportation(new Transportation("Egypt", "You seriously aren't going to miss the once in a lifetime "
				+ "submarine experience, are you?"));
		Madagascar.setImage(ImageIO.read(new File("Madagascar start.png")));

		Country Mozambique = insert(Country.create("Mozambique", "Welcome to Mozambique, a scenic country in southeastern Africa. \n"
				+ "Mozambique is rich in natural resources. "
				+ "It is biologically and culturally diverse and has a tropical climate. \n"));
				Mozambique.addTransportation(new Transportation("South_Africa", "There is a plane about two hours away. "
				+ "You could take the plane. \n"
				+ "    However, you don't have a passport as entry into this country requires that you have a VISA."));
				Mozambique.addTransportation(new Transportation("Zimbabwe",
				"There is a car waiting outside" + "You could take the car and see where you end up."));
				Mozambique.addTransportation(new Transportation("Madagascar",
				"There is a Mozambiquan channel. " + "You could go here and take a ship to some Island."));
		Mozambique.setImage(ImageIO.read(new File("Mozambique.jpg")));
		
		Country South_Africa = insert(Country.create("South_Africa",
				"Welcome South Africa, the southernmost country on the African continent. \n"
				+ "It is renowned for its varied topography, great natural beauty, and cultural diversity. \n"
				+ "We regret to see you leave, please call again soon. \n"));
				South_Africa.addTransportation(new Transportation("Rwanda","Ahh, there is a truck outside. Where could it be going? "
				+ "It can't be a local truck, "+ "but it sure is from some far away place. \n"
				+ "    You could take this truck."));
				South_Africa.addTransportation(
				new Transportation("Nigeria", "There is a tunnel, you can peep to see what is inside. "
				+ "But remember, you could never come back."));
				South_Africa.addTransportation(new Transportation("Guinea",
				"There is a ferry at a coast. " + "Where could it be going? " + "You can get it to find out.\n "
				+ "   You might wanna get some water before leaving this place."));
		South_Africa.setImage(ImageIO.read(new File("South Africa.png")));
		
		Country Zimbabwe = insert(Country.create("Zimbabwe", "Welcome to Zimbabwe, the great house of Stone. \n"
				+ "There are soo many things that you can do in this great country." + " Hopefully you will have fun. \n"
				+ "While you are here, try visiting our renown waterfalls and many other places. \n"));
				Zimbabwe.addTransportation(new Transportation("Botswana",
				"There is a communtor omnibus right next to a shop that sells food. \n"
				+ "    However you don't have money to get onto the omnibus. "
				+ "There should be a way to get money. "));
				Zimbabwe.addTransportation(new Transportation("Victoria_Falls",
				"You see a group of toursits around. " + "Where could they be headed? \n"
				+ "    Can they help you figure out what to do in this great country. "
				+ "So you decide to follow them."));
				Zimbabwe.addTransportation(new Transportation("Great_Zimbabwe",
				"You see a donkey about 100m away. " + "You ride on it in order to discover a new place. "));
				Zimbabwe.addTransportation(new Transportation("Inyanga",
				"There is a red car parked outside. " + "Is it safe to take the car? \n"
				+ "    You might end up going to the Falls."));
				Zimbabwe.addTransportation(new Transportation("Hwange", "There is a bus station around the corner. "
				+ "You could get the bus to get to your next destination."));
				Zimbabwe.addTransportation(new SecretTransportation("Central_Africa_Republic",
				"You see a very suspicious tunnel. " + "You try to follow it. Where could it be leading?"));
		Zimbabwe.setImage(ImageIO.read(new File("Zimbabwe.jpg")));
		
		
		Country Hwange = insert(
				Country.create("Hwange", "You have found the Hwange national Park. Here you can see the wildlife and many more.\n"
				+ "However, beware of the lions and which can easily devour you.\n"));
				Hwange.addTransportation(new Transportation("Victoria_Falls",
				" There is a pride of lions and you want to follow them. But it would wise to follow the tourist instead." ));
				Hwange.addTransportation(new Transportation("Great_Zimbabwe", " Do you see the fancy car over there, just hope in. "));
				Hwange.addTransportation(new Transportation("Inyanga", " The train is leaving very soon. "));
				Hwange.addTransportation(new Transportation("Nigeria", " Wanna take a long ride to an amazing destination with the bus?"));
		Hwange.setImage(ImageIO.read(new File("Hwange.jpg")));
		
		Country Great_Zimbabwe = insert(Country.create("Great_Zimbabwe",
				"You have come to the Great Zimbabwe ruins. " + "These were built some hundreds of years ago. \n"
				+ "This is where the name of the conuntry comes from. \n"
				+ "Please be careful of how to behave here. " + "You can easiy be a victim. \n"));
				Great_Zimbabwe.addTransportation(new Transportation("Hwange",
				"You see a group of people that are wearing animal skin. "
				+ "They seem to be time travellers. " + "Do you want to join them? "));
		Great_Zimbabwe.setImage(ImageIO.read(new File("Great Zimbabwe.jpg")));
		
		
		Country Inyanga = insert(Country.create("Inyanga",
				"Welcome to Inyanga, the tallest mountain in Zimbabwe. " + "We hope you enjoy the tour of the mountain. \n"
				+ "The Locals often say that strange things happen here. "
				+ "If you see anything funny please do not laugh. \n"));
				Inyanga.addTransportation(
				new Transportation("Victoria_Falls", "There seems to be something fishy about this place, "+ "you just want to leave this place with the horse."));
		Inyanga.setImage(ImageIO.read(new File("Inyanga.jpg")));
		
		Country Victoria_Falls = insert(
				Country.create("Victoria_Falls", "You have found one of the seven wonders of the world. \n"
				+ "It is very pretty here, but it is also very cold. " + "You should explore the place more and have fun. \n"));
				Victoria_Falls.addTransportation(
				new Transportation("Ghana", "The bicycle is you only option to leave this place. "));
		Victoria_Falls.setImage(ImageIO.read(new File("VicFalls.jpg")));

		Country Rwanda = insert(Country.create("Rwanda", "One of the smallest countries in Africa yet it has a lot to offer. \n"
				+ "There aren’t too many places in the world where volcano hiking can be accomplished over a weekend.\n"
				+ "Are you excited for this new adventure? \n"));
				Rwanda.addTransportation(new Transportation("Egypt", "The ferry is leaving in 10 minutes. It is your only way out of here. Run!"));
		Rwanda.setImage(ImageIO.read(new File("Rwanda.jpg")));
		
		
		
		Country Nigeria = insert(Country.create("Nigeria", "Welcome to Nigeria, the giants of Africa. "
				+ "The land of riches and happiness. " + "Relax and have fun in Nigeria. \n"
				+"Done with the vist, how do you want to get to you next stop? \n"));
				Nigeria.addTransportation(new Transportation("Ghana", "There is no way out except a train ride."));
		Nigeria.setImage(ImageIO.read(new File("Nigeria.jpg")));
		
		Country Ghana = insert(Country.create("Ghana", "Welcome to the land of Gold and hospitality. "
				+"There are a lot of things and places to explore here. \n" 
				+"So take your time and enjoy the nice weather, places and people here. \n" 
				+"I believed you had lots of fun, but you gotta get going. \n"));
				Ghana.addTransportation(new Transportation("Mozambique", "You could use a nice motor ride to this amazing place."));
				Ghana.addTransportation(new SecretTransportation("Central_Africa_Republic", "Biking would not be a bad idea for this trip."));
				Ghana.addTransportation(new Transportation("Guinea", "Submarine sounds too good to be true but you can take it."));
				Ghana.addTransportation(new Transportation("Kakum", "Wanna have fun on a canopy way?"));
				Ghana.addTransportation(new Transportation("Paga", "A ride on a crocodile's back would be an amazing experience for you."));
				Ghana.addTransportation(new Transportation("Osu_Castle", "Get the incoming ship to a place of love and memories. "));
		Ghana.setImage(ImageIO.read(new File("Nigeria.jpg")));
		
		Country Kakum = insert(Country.create("Kakum", "Welcome to Kakum National Park in the southern part of Ghana. \n"
				+"This tourist site is blessed with beautiful but endangered species like forest elephants, bongo antelopes and Diana monkey. \n" 
				+"A 30 meters suspended Canopy Walkway above the ground with treetop views of the Kakum forest is a \n"
				+"life time experience you want to have. So have fun. \n"));
				Kakum.addTransportation(new Transportation("Paga", "The little boat is so different, do you want to ride it?"));
				Kakum.addTransportation(new Transportation("Osu_Castle", "Taking a walk might be good for your health. "));
				Kakum.addTransportation(new Transportation("Botswana", "The helicopter is flying to a nice place, do you want tke it?"));
		Kakum.setImage(ImageIO.read(new File("Ghana.jpg")));
		
		Country Paga = insert(Country.create("Paga", "Welcome to the Paga National Park located in the northern part of Ghana. \n" 
				+"This pond is made of sacred crocodiles that are believed to hold the souls of the village's deceased. \n" 
				+"If you have never touched a life crocodile before then this is your destination. \n" 
				+"Enjoy yourself but becareful with these animals. \n"));
				Paga.addTransportation(new Transportation("Kakum", "The hoverboard seems fun but scary. You have to leave here. "));
				Paga.addTransportation(new Transportation("Egypt", "A commercial bus is loading passengers to this unknow locations."));
		Paga.setImage(ImageIO.read(new File("Paga.jpg")));
		
		Country Osu_Castle = insert(Country.create("Osu_Castle", "Welcome to Osu Castle located in the  Ghana on the coast of the Atlantic Ocean's Gulf of Guinea. \n"
				+ "This castle was first occupied by the Portuguese and then the Dutch during the slave trade. \n" 
				+ "A lot of slaves were held and tortured here before transported to Europe. \n" 
				+ "If you want to learn about slave trade, I believe here is the right place. \n"));
				Osu_Castle.addTransportation(new Transportation("Kakum", "The train is leaving in 2 min, you got to run."));
				Osu_Castle.addTransportation(new Transportation("Mali", "The truck can help shorten you walk. "));
		Osu_Castle.setImage(ImageIO.read(new File("Osu Castle.jpg")));
		
		Country Guinea = insert(Country.create("Guinea", "Welcome to the country best known for Mount Nimba Strict Nature Reserve. \n"  
				+ "The reserves protects native plants and animal, including chimpanzees viviparous toad. \n"
				+ "The people here are amazing and you will have great time  here. \n" 
				+ "Do not forget to visit the Grand Mosque too. \n" 
				+ "Start thinking about you next transportation before finishing your visit. \n"));
				Guinea.addTransportation(new Transportation("Madagascar", "You only have one way out of here and it is to take the bus."));
		Guinea.setImage(ImageIO.read(new File("guinea.jpg")));
		
		Country Botswana = insert(Country.create("Botswana",
				"Welcome to Botswana, country in the centre of Southern Africa. \n"
				+ "Its eastern and southern borders are marked by river courses and an old wagon road. \n"
				+ "Its western borders are lines of longitude and latitude through the Kalahari. \n"
				+ "And its northern borders combine straight lines with a river course. \n"
				+ "Within the confines of Botswana’s borders is a rich variety of wildlife, \n"
				+ "including many species of mammals, birds, reptiles, amphibians, and fish. \n"));
				Botswana.addTransportation(new Transportation("Morocco", "There is a train leaving in a few minutes. Maybe you can catch it!" ));
				Botswana.addTransportation(new SecretTransportation("Ghana", "There is a chariot outside. Where could this chariot be going?" ));
		Botswana.setImage(ImageIO.read(new File("Botswana.jpg")));
		
		Country Morocco = insert(Country.create("Morocco", "Morocco is a gateway to Africa and a country of dizzying diversity. \n "
				+ "Here you will find epic mountain ranges ancient cities, sweeping deserts – and warm hospitality \n"));
				Morocco.addTransportation(new Transportation("Atlas_Mountains", "How long has it been since you have been on a hike? Grab the free hiking shoes \n"
				+ "    and follow that group of young campers! They seem very hospitable."));
				Morocco.addTransportation(new Transportation("Sahara_Desert", "That looks like a really big car. The group of students are "
				+ "inviting you for a fun ride. \n" + "    Curious to see where they are going?"));
				Morocco.addTransportation(new Transportation("Blue_City","Is that a blue bicycle? Take it and follow that pathway. Don't steer away "
				+ "from it"));
				Morocco.addTransportation(new Transportation("Ghana", "Have you ever seen a suspended monorail? Well, this is your chance to "
				+ "hop on it and see where it's going."));
				Morocco.addTransportation(new Transportation("Egypt", "A trikke scooter? That will definitely be a fun ride!"));
				Morocco.addTransportation(new SecretTransportation("Central_Africa_Republic", "Hot Air Balloon huh? What is that gonna be like?"));
		Morocco.setImage(ImageIO.read(new File("Morocco.jpg")));
		
		Country Atlas_Mountains = insert(Country.create("Atlas_Mountains", "The Atlas Mountains extend across Northwestern Africa. \n"
				+ "You can go for a long hike with adventurers from around the globe to reach the highest point in Morocco: The Toubkal Mountain. \n"
				+ "Make sure you enjoy all of the mesmerizing views as you hike."));
				Atlas_Mountains.addTransportation(new Transportation("Ghana", "Do you still remember how to ride a bike?"));
				Atlas_Mountains.addTransportation(new Transportation("DangerZone", "There is a very narrow path at the edge of the mountain, but"
				+ " it is the fastest way to get faster to the other side. Go"));
		Atlas_Mountains.setImage(ImageIO.read(new File("Atlas_mountains.jpg")));
		Country Sahara_Desert = insert(Country.create("Sahara_Desert", "Welcome to the Sahara where you can stargaze at night with your closest friends, \n"
				+ "meet travelers from all around the world, ride camels and live in a traditional tent. \n"));
				Sahara_Desert.addTransportation(new Transportation("Atlas_Mountains", "Your adventure here is over, hop in the car and see where these \n"
				+ "    tourists will take you"));
				Sahara_Desert.addTransportation(new Transportation("DangerZone", "It is night. There is almost nobody outside and it is very cold. \n "
				+ "   However you can get a camel and explore the desert on your own."));
		Sahara_Desert.setImage(ImageIO.read(new File("SaharaDesert.jpg")));
		
		Country Blue_City = insert(Country.create("Blue_City", "Welcome to Chefchaouen, the blue pearl of Morocco. \n"
				+ "You will be taken away by the striking blue-washed buildings of its old town as well as \n"
				+ "the leather and weaving workshops that line its steep cobbled lanes. \n"));
				Blue_City.addTransportation(new Transportation("Egypt", "Have you tried kayaking before? Get the equipment and join this group of athletic and brave tourists."));
				Blue_City.addTransportation(new Transportation("Sahara_Desert", "This train is going south. Wonder how far it will go. Catch it!"));
		Blue_City.setImage(ImageIO.read(new File("chefchaoun.jpg")));
		
		
		
		Country Egypt = insert(Country.create("Egypt", "Welcome to the land of the Pharaohs. "
				+ "If you are a History geek, this is the right place for you. \n"
				+ "Relax and have fun but don't forget your next destibation. \n"		));
				Egypt.addTransportation(new Transportation("Pyramid", "There is a horse in there. How good are you at horseback riding?"));
				Egypt.addTransportation(new Transportation("Tunisia", "That looks like a good functioning car. Take it and follow the highway."));
				Egypt.addTransportation(new Transportation("Senegal", "Have you ever been on a yacht? This is your chance!"));
		Egypt.setImage(ImageIO.read(new File("Egypt.jpg")));
		
		Country Senegal = insert(Country.create("Senegal", "Senegal is a country full of riches. From its diverse natural heritage, \n"
				+ "the country’s national symbols were chosen: the baobab tree and the lion."
				+ "Just explore the beauty of this amazing country. \n"		));
				Senegal.addTransportation(new Transportation("Tunisia", "Scooters are small and fast enough to get you anywhere. Get that helmet and hop \n"
				+ "   on the yellow scooter, it seems of great condition."));
		Senegal.setImage(ImageIO.read(new File("senegal.jpg")));
		
		Country Pyramid = insert(Country.create("Pyramid", "Welcome to the Pyramids of Giza. You can get a feel of a civilization \n"
				+ "of thousands of years and take cool selfies next to the Great Sphinx \n"));
				Pyramid.addTransportation(new Transportation("Tunisia", "There are a lot of horses here. Maybe you can try to befriend one, it will help you through your adventure."));
				Pyramid.addTransportation(new Transportation("Madagascar", "Another submarine! who would have thought. Do you wanna relive the underwater experience again?" ));
				Pyramid.Items.add("Key");
		Pyramid.setImage(ImageIO.read(new File("pyramids.jpg")));
		
		Country Tunisia = insert(Country.create("Tunisia", "A tiny country indeed, but this North African gem will definitely not fail to amaze you.\n" 
				+ " What about exploring the unique places here? \n"));
				Tunisia.addTransportation(new Transportation("Algeria", "That's a hitchhiking spot, maybe you could go there and see where people can drive you."));
				Tunisia.addTransportation(new Transportation("Morocco", "Your new friend there is inviting you for a ride in their private jet. What do you think?"));
				Tunisia.addTransportation(new Transportation("Lesotho", "Have you ever used a motorbike? Follow that motorbiking crew, I am sure they are "
				+ "going somewhere cool."));
				Tunisia.addTransportation(new Transportation("Mali", "That is a very nice looking van. You can chip in for gas and follow the route." ));
		Tunisia.setImage(ImageIO.read(new File("Tunisia.jpg")));
		
		Country Mali = insert(Country.create("Mali", "Welcome to the biggest country in West Africa. \n" 
				+"Mali is roughly twice the sizes of Texas, the second largest state in America. \n" 
				+"Mali has breathtaking tourist attractions such as the Cliff Of Bandiagara, Mopti,Tomb Of Askia. \n" 
				+"An explorer like you would love it in Mali. \n"
				+"Enough fun, proceed to you next destination.\n"));
				Mali.addTransportation(new Transportation("Zimbabwe", "The glider would help you move around. "));
		Mali.setImage(ImageIO.read(new File("Mali.jpg")));
		
		Country Lesotho = insert(Country.create("Lesotho",
				"Lesotho, country in Southern Africa. A scenic land of tall mountains and narrow valleys.\n"
				+ "Lesotho owes a long history of political autonomy to the mountains that surround it \n"
				+ "and protect it from encroachment. \n"));
				Lesotho.addTransportation(new Transportation("Mali", "This might be your chance to leave the country, take the plane. "));
				Lesotho.addTransportation(new Transportation("Morocco", "There is a motorbike outside if you want to enjoy being on a motorbike."));
				Lesotho.addTransportation(new Transportation("Egypt", "You see a train outside. Where could this train be headed?"));
		Lesotho.setImage(ImageIO.read(new File("Lesotho.jpg")));
		
		Country Algeria = insert(Country.create("Algeria", "You have arrived at the largest country in Africa. "
				+ "And the 10th largest in the world. \n"+"What things you may wanna do in this large country? \n"));
				Algeria.addTransportation(new Transportation("Ghana", "A big old tractor doesn't seem like a bad idea, does it?"));
				Algeria.addTransportation(new Transportation("Botswana", "How good are you at rowing? Use those strong arms to row your way out of here"));
		Algeria.setImage(ImageIO.read(new File("Algeria.jpg")));
		
		Country Central_Africa_Republic = insert(Country.create("Central_Africa_Republic", "Welcome to the center of Africa. "
				+ "A country known for its several national parks and wildlife reserves. \n"
				+ "The culture and tradition of the people here are amazing and beautiful. \n" 
				+ "If you think you a culture lover then here is the place you dont want to miss. \n" 
				+ "As you are enjoying your visit, you might to think about how to get out of here. \n"));
				Central_Africa_Republic.addTransportation(new Transportation("Ghana", "Do you want to take the airplane to you next destination?"));
				Central_Africa_Republic.addTransportation(new Transportation("Morocco", "Or you want a yacht instead?"));
				Central_Africa_Republic.addTransportation(new SecretTransportation("Wakanda", "If you are scared of heights, then the magic carpet is not for you."));
				Central_Africa_Republic.addTransportation(new Transportation("Zimbabwe", "If you want to take is slow and cool, I think the tractor is the best."));
		Central_Africa_Republic.setImage(ImageIO.read(new File("CAR.jpg")));
		
		Country Wakanda = insert(Country.terminal("Wakanda", " Congratulations, you have found the magical land of Wakanda. A new journey awaits....."));
				Wakanda.setImage(ImageIO.read(new File("wakanda.jpg")));
		
		
		Country DangerZone = insert(Country.terminal("DangerZone", " What did you think you were doing?!"
		+ "That was obviously dangerous!!!!!. Unfortunately thats it for you. We hope to see you next time!! "));
				DangerZone.setImage(ImageIO.read(new File("Game Over.png")));
		// creating all the terminal Countries or destinations.

		// Make sure your graph makes sense!
checkAllTransportationGoSomewhere();
		}
	
	/**
	 * This helper method saves us a lot of typing. We always want to map from p.id
	 * to p.
	 * 
	 * @param p - the place.
	 * @return the place you gave us, so that you can store it in a variable.
	 */
	private Country insert(Country c) {
		countries.put(c.getId(), c);
		return c;
	}

	/**
	 * I like this method for checking to make sure that my graph makes sense!
	 */
	private void checkAllTransportationGoSomewhere() {
		boolean missing = false;
		// For every place:
		for (Country c : countries.values()) {
			// For every mode of transportation in that place:
			for (Transportation x : c.getVisibleTransportations()) {
				// That exit goes to somewhere that exists!
				if (!countries.containsKey(x.getDestination())) {
					// Don't leave immediately, but check everything all at once.
					missing = true;
					// Print every exit with a missing place:
					System.out.println("Found transportation traveling to" + x.getDestination()
							+ " which does not exist as a place.");
				}
			}
		}

		// Now that we've checked every mode of transportation for every country, crash
		// if we printed any
		// errors.
		if (missing) {
			throw new RuntimeException("You have some modes of transportation that go nowhere!");
		}
	}

	/**
	 * Get a Place object by name.
	 */
	public Country getCountry(String id) {
		return this.countries.get(id);
	}

}
