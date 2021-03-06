/**
 * 
 */
package com.rbs.breach.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rbs.breach.entity.BreachApplication;
import com.rbs.breach.service.IBreachService;

/**
 * @author user
 *
 */
@RestController
public class BreachController {

	@Autowired
	IBreachService breachService;
	
	@PostMapping("/save")
	public BreachApplication saveBreachApplicationForm(@RequestBody BreachApplication application) {
		return breachService.save(application);
	}
}
