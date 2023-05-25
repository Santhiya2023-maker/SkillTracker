package com.example.service;

import com.example.entity.SkillEntity;
import com.example.model.in.Domain;
import com.example.model.in.SkillTrackerRequest;
import com.example.model.in.Technical;
import com.example.repository.SkillRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class SkillService {
    private final SkillRepository skillRepository;

    public void saveSkills(SkillTrackerRequest skillTrackerRequest) {
        List<Domain> domains = skillTrackerRequest.getDomain();
        List<Technical> technicals = skillTrackerRequest.getTechnical();
        List<SkillEntity> skillEntities = new ArrayList<>();

        for (Domain domain : domains) {
            SkillEntity skillEntity = new SkillEntity();
            skillEntity.setSkillName(domain.getSkill());
            skillEntity.setCategory(domain.getCategories());
            skillEntity.setCreatedDate(LocalDate.now());
            skillEntities.add(skillEntity);
        }
        for (Technical technical : technicals) {
            SkillEntity skillEntity = new SkillEntity();
            skillEntity.setSkillName(technical.getSkill());
            skillEntity.setCategory(technical.getCategories());
            skillEntity.setCreatedDate(LocalDate.now());
            skillEntities.add(skillEntity);
        }
        skillRepository.saveAll(skillEntities);
    }
}