package Concrete;

import Abstracts.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements SaleService {

	@Override
	public void add(Game game, Gamer gamer) {
		System.out.println(game.getName() + game.getExpense() + "Tl'ye" + gamer.getFirstName() + gamer.getLastName() + "oyuncusuna satýldý.");
		
	}

	@Override
	public void add1(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(game.getName() + game.getAfterDiscount() + "liraya" + gamer.getFirstName() + gamer.getLastName() + "'kiþisine satýldý");
		
	}

}
