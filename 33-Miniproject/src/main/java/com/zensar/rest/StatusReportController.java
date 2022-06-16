package com.zensar.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.bean.StatusReport;
import com.zensar.service.StatusReportService;

@RestController
public class StatusReportController {

	@Autowired
	StatusReportService service;

	@PostMapping(value = "/addStausReport")
	public StatusReport f1(@RequestBody StatusReport statusreport) {
		return this.service.addStatusReport(statusreport);
	}

	@DeleteMapping(value = "/deleteStausReport")
	public boolean f2(@RequestBody StatusReport statusreport) {
		service.removeStatusReport(statusreport);
		return true;
	}

	@PutMapping(value = "/updateStausReport")
	public StatusReport f3(@RequestBody StatusReport statusreport) {
		return this.service.updateStatusReport(statusreport);
	}

	@GetMapping(value = "/getAllStausReport")
	public List<StatusReport> getAllStatusReport() {
		return this.service.getAllStatusReport();
	}
}