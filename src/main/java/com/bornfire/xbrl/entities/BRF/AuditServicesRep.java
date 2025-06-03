package com.bornfire.xbrl.entities.BRF;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AuditServicesRep extends JpaRepository<AuditServicesEntity , Integer>{
	@Query(value = "select * from USER_AUDIT ", nativeQuery = true)
	List<AuditServicesEntity> getauditService();

}