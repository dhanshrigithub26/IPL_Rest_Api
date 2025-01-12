package com.tka.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.tka.Model.*;
@RestController
public class TeamController {
	
	@PostMapping("/api/team")
	public String addTeam(@RequestBody Teams team) {
		return null;
	}
	

}
