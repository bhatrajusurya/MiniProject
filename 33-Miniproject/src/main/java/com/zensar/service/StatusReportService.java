
package com.zensar.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zensar.bean.StatusReport;
import com.zensar.db.StatusReportDAO;

@Service
public class StatusReportService {
	@Autowired
	StatusReportDAO dao; // addStatuReport

	public StatusReport addStatusReport(StatusReport statusreport) {
		return this.dao.save(statusreport);
	}

//deleteStatuReport
	public boolean removeStatusReport(StatusReport statusreport) {
		dao.delete(statusreport);
		return true;
	}

//updateStatuReport
	public StatusReport updateStatusReport(StatusReport statusreport) {
		return this.dao.save(statusreport);
	}

//getAllStatuReport
	public List<StatusReport> getAllStatusReport() {
		return this.dao.findAll();
	}
}
