package Concrete;

import Abstracts.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {
	
	public void add(Campaign campaign) {
		System.out.println(campaign.getId() + "sisteme eklendi");
	}
	
	public void update(Campaign campaign) {
		System.out.println(campaign.getId() + "sisteme güncellendi");
	}
	
	public void delete(Campaign campaign) {
		System.out.println(campaign.getId() + "sistemden silindi");
	}

}
