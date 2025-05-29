package com.idrisnotebook.crm.controller;

import com.idrisnotebook.crm.dto.LeadDTO;
import com.idrisnotebook.crm.service.LeadService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/leads")
public class LeadController {

    private final LeadService leadService;

    public LeadController(LeadService leadService) {
        this.leadService = leadService;
    }

    @GetMapping
    public List<LeadDTO> getAllLeads() {
        return leadService.getAllLeads();
    }

    @PostMapping
    public LeadDTO createLead(@RequestBody LeadDTO leadDTO) {
        return leadService.createLead(leadDTO);
    }
}
