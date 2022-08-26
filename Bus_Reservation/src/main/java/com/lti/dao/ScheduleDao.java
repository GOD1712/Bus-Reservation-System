package com.lti.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.entity.Schedule;

@Repository
public interface ScheduleDao extends JpaRepository<Schedule, Integer> {

}
