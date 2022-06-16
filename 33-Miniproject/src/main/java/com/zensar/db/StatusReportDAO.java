
package com.zensar.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.zensar.bean.StatusReport;

@Repository
public interface StatusReportDAO extends JpaRepository<StatusReport, Integer> {
}
