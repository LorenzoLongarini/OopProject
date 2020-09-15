package it.univpm.objProject.controller;

import org.springframework.web.bind.annotation.RestController;
import it.univpm.objProject.model.*;
import java.util.ArrayList;
import java.util.Map;

import it.univpm.objProject.services.RevisionServiceImpl;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController

public class restController {

	@Autowired
	RevisionServiceImpl revision_service;

	@GetMapping(value = "/data")
	public ArrayList<Revision> get_revision() {
		return revision_service.RevisionVisual();
	}

	@GetMapping(value = "/metadata")
	public ArrayList<Metadata> get_metadata() {
		return revision_service.MetadataVisual();
	}

	@PostMapping(value = "/stats")
	public Stats post_stats(@RequestBody Map info) {
		JSONObject jobj = new JSONObject(info);
		return revision_service.StatsVisual(jobj);
	}

}
