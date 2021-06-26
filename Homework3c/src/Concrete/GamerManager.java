package Concrete;

import Abstracts.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService {

	@Override
	public void add(Gamer gamer) {
		System.out.println(gamer.getFirstName() + gamer.getLastName() + " ki�isi eklendi");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName() + gamer.getLastName() + " ki�isi g�ncellendi");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName() + gamer.getLastName() + "  ki�isi silindi");
		
	}

}
