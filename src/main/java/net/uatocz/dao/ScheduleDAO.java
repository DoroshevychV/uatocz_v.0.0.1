package net.uatocz.dao;

import net.uatocz.domain.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleDAO extends JpaRepository<Schedule,Integer> {
}
