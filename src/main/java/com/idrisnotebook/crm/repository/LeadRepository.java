package com.idrisnotebook.crm.repository;

import com.idrisnotebook.crm.model.Lead;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeadRepository extends JpaRepository<Lead, Long> {
}
