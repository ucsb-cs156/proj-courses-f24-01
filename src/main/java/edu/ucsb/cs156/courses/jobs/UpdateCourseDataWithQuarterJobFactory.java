package edu.ucsb.cs156.courses.jobs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ucsb.cs156.courses.collections.ConvertedSectionCollection;
import edu.ucsb.cs156.courses.services.UCSBCurriculumService;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UpdateCourseDataWithQuarterJobFactory  {

    @Autowired
    private UCSBCurriculumService ucsbCurriculumService;

    @Autowired
    private ConvertedSectionCollection convertedSectionCollection;

    public UpdateCourseDataWithQuarterJob create(String quarterYYYYQ) {
        log.info("ucsbCurriculumService = " + ucsbCurriculumService);
        log.info("convertedSectionCollection = " + convertedSectionCollection);
        return new UpdateCourseDataWithQuarterJob(quarterYYYYQ, ucsbCurriculumService, convertedSectionCollection);
    }
}