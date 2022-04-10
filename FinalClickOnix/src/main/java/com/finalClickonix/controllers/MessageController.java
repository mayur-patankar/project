package com.finalClickonix.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.finalClickonix.dto.MessageDTO;
import com.finalClickonix.entity.Message;
import com.finalClickonix.repository.CustMessRepo;

@CrossOrigin
@RestController
public class MessageController {
	
	@Autowired
	CustMessRepo cmr;
	
	@PostMapping("/getMessages")
	public List<String> getMessage(@RequestBody MessageDTO mdto)
	{
		String to = mdto.getTo();
		String from = mdto.getFrom();
		List<String> ll = new ArrayList<String>();
		ll.add(from);
		ll.add(to);
		List<Message> lm =  cmr.findMessages(ll);
		List<String> lm2 = new ArrayList<String>();
		int l = lm.size();
		l--;
		for(int i = l; i>=0; i--)
		{
			Message m = lm.get(i);
			String ext = m.getF()+"//"+m.getM()+"//"+m.getT();
			lm2.add(ext);
		}
		return lm2;
	}
}
