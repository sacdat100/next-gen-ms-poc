package nextgen;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserActivityController {
	
	static Logger logger = LoggerFactory.getLogger(UserActivityController.class);
	
	@Autowired
    UserActivityRepository repo = null;
    
	@RequestMapping(consumes="application/json", path="/saveact", method=RequestMethod.POST)
	public @ResponseBody String saveActivity(@RequestBody UserActivity activity) {
		logger.info("in saveActivity");
		logger.debug("Recvd ==> " + activity);
		return repo.save(activity)!=null?"Ok":"NotOK";
	}

	@RequestMapping(path="/getactbygrp", method=RequestMethod.POST)
	public @ResponseBody List<UserActivity> getActionByGroup(@RequestParam (value="query") String query) {
		logger.info("in getActionByGroup");
		logger.debug("Recvd ==> " + query);
		return repo.findByActionByGroup(query);
	}
}
