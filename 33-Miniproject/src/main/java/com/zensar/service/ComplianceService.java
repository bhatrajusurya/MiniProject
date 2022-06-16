
package com.zensar.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zensar.bean.Compliance;
import com.zensar.bean.StatusReport;
import com.zensar.db.ComplianceDAO;

@Service
public class ComplianceService {
	@Autowired
	ComplianceDAO dao;

	public Compliance createRL(Compliance co) {
		return this.dao.save(co);
	}

	public List<Compliance> getAllCompliances() {
		return this.dao.findAll();
	}

	public void createStatusReport(StatusReport statusreport) {
		this.dao.save(statusreport);
	}
}
