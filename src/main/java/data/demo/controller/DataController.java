package data.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import data.demo.dto.Message;
import data.demo.dto.MessageOuter;
import data.demo.repo.IDataRepository;

@RestController
public class DataController {
	@Autowired
	private IDataRepository dataRepository;

	
	@GetMapping("/all")
		public ResponseEntity<?> getAll(){
		MessageOuter outerMsg  = dataRepository.getMessage("success");
		
		List<String> hounds = new ArrayList<String>(
				Arrays.asList("afghan", "basset", "blood","english","ibizan", "plott","walker"));
		List<String> terriers = new ArrayList<String>(
				Arrays.asList( "american", "australian", "bedlington", "border",  "cairn",  "dandie",   "fox",
            "irish", "kerryblue", "lakeland", "norfolk", "norwich", "patterdale", "russell", "scottish",
            "sealyham", "silky", "tibetan","toy", "westhighland","wheaten", "yorkshire"));
		List<String> waterDogs = new ArrayList<String>(Arrays.asList("spanish"));
		List<String> wolfHounds = new ArrayList<String>(Arrays.asList("irish"));
		List<String> spaniel = new ArrayList<String>(Arrays.asList(		
		"blenheim","brittany","cocker", "irish", "japanese","sussex","welsh"));
		List<String> sheepdog = new ArrayList<String>(Arrays.asList("english","shetland"));
		List<String> setter = new ArrayList<String>(Arrays.asList( "english", "gordon","irish"));
		List<String> schnauzer = new ArrayList<String>(Arrays.asList( "giant", "miniature"));
		List<String> retriever = new ArrayList<String>(Arrays.asList( "chesapeake", "curly", "flatcoated", "golden"));
		List<String> mastiff = new ArrayList<String>(Arrays.asList( "bull", "english", "tibetan"));
		
		outerMsg.message.setMastiff(mastiff);
		outerMsg.message.setRetriever(retriever);
		outerMsg.message.setSetter(schnauzer);
		outerMsg.message.setSetter(setter);
		outerMsg.message.setSheepdog(sheepdog);
		outerMsg.message.setSpaniel(spaniel);
		outerMsg.message.setWolfhound(wolfHounds);
		outerMsg.message.setWaterdog(waterDogs);
		outerMsg.message.setHound(hounds);
		outerMsg.message.setTerrier(terriers);
		
			return new ResponseEntity<MessageOuter>(outerMsg,HttpStatus.OK);
		}
	}

