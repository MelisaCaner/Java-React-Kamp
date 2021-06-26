package Concrete;

import Abstracts.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService {

	@Override
	public void add(Gamer gamer) {
		System.out.println(gamer.getFirstName() + gamer.getLastName() + " kiþisi eklendi");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName() + gamer.getLastName() + " kiþisi güncellendi");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName() + gamer.getLastName() + "  kiþisi silindi");
		
	}

}
