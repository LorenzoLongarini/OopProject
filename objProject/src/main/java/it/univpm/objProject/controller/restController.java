package it.univpm.objProject.controller;

import org.springframework.web.bind.annotation.RestController;
import it.univpm.objProject.model.*;
import java.util.ArrayList;
//import it.univpm.objProject.services.RevisionService;
import it.univpm.objProject.services.RevisionServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

@RestController

public class restController {
	
	@Autowired
	RevisionServiceImpl revision_service;
	
	@GetMapping("/data")
	public ArrayList<Revision> revision(){
		return revision_service.RevisionVisual();
	}
	
	@GetMapping("/metadata")
	public ArrayList<Metadata> metadata(){
		return revision_service.MetadataVisual();
	}
	
}
