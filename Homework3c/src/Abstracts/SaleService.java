package Abstracts;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface SaleService {
	void add(Game game, Gamer gamer);
	void add1(Game game, Gamer gamer, Campaign campaign);
	

}
