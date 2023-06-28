package com.myspring.model;

import java.util.HashMap;
import java.util.List;

public interface GuestDAO {
	public void dao_guestInsert(String mid, Guest guest);
	public List<Guest> dao_guestList(String mid, HashMap<String, String> hm);
	public int dao_guestCount(String mid, HashMap<String, String> hm);

	
}
