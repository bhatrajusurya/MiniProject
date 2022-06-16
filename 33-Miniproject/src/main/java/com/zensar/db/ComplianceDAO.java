package com.zensar.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.bean.Compliance;
import com.zensar.bean.StatusReport;

@Repository
public interface ComplianceDAO extends JpaRepository<Compliance, Integer> {

	void save(StatusReport statusreport);

}
