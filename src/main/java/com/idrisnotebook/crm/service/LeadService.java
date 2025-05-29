package com.idrisnotebook.crm.service;

import com.idrisnotebook.crm.dto.LeadDTO;

import java.util.List;

public interface LeadService {
    List<LeadDTO> getAllLeads();
    LeadDTO createLead(LeadDTO leadDTO);
}
