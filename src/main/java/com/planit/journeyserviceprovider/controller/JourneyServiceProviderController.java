package com.planit.journeyserviceprovider.controller;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JourneyServiceProviderController {
	
	@GetMapping("/getJourneyServices")
	public List<Map<String, Object>> getJourneyServices(){
		return List.of(
				Map.of("order",1,"serviceName","TEMP-JOURNEY-SERVICE-1")
//				Map.of,("order",2,"serviceName","TEMP-JOURNEY-SERVICE-2")
				);
	}
	
	@GetMapping("/getJourneyFilters")
	public List<Map<String, Object>> getJourneyFilters(){
		return Collections.emptyList();
	}
	
	@GetMapping("/getWeighingService")
	public String getWeighingService(){
		return "WEIGHING-SERVICE";
	}
	
	@GetMapping("/getHeuristicService")
	public String getHeuristicService(){
		return "HEURISTIC-SERVICE";
	}
}
