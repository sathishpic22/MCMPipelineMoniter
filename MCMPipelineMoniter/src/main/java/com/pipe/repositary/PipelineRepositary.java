package com.pipe.repositary;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pipe.model.PipelineMoniter;

@Repository
public interface PipelineRepositary extends CrudRepository<PipelineMoniter,Long> {

}
