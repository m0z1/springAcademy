package com.myspring.model;

import java.util.HashMap;
import java.util.List;

public interface GuestService {
	//�߰�
	public void guestInsert(Guest guest);
	
	public List<Guest> guestList(HashMap<String, String> hm); // ��ü����(�˻�����)
	public int guestCount(HashMap<String, String> hm); //����(�˻�����)
	
}