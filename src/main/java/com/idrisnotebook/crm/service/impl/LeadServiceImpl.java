package com.idrisnotebook.crm.service.impl;

import com.idrisnotebook.crm.dto.LeadDTO;
import com.idrisnotebook.crm.model.Lead;
import com.idrisnotebook.crm.repository.LeadRepository;
import com.idrisnotebook.crm.service.LeadService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LeadServiceImpl implements LeadService {

    private final LeadRepository leadRepository;

    public LeadServiceImpl(LeadRepository leadRepository) {
        this.leadRepository = leadRepository;
    }

    @Override
    public List<LeadDTO> getAllLeads() {
        return leadRepository.findAll().stream()
                .map(lead -> new LeadDTO(lead.getId(), lead.getName(), lead.getStatus()))
                .collect(Collectors.toList());
    }

    @Override
    public LeadDTO createLead(LeadDTO leadDTO) {
        Lead lead = new Lead();
        lead.setName(leadDTO.getName());
        lead.setStatus(leadDTO.getStatus());
        lead = leadRepository.save(lead);
        return new LeadDTO(lead.getId(), lead.getName(), lead.getStatus());
    }
}
