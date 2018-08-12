package net.uatocz.service.schedule;

import net.uatocz.domain.Schedule;

import java.util.List;

public interface ScheduleService {

    void create(Schedule schedule);

    void delete(Integer id);

    void edit(Schedule schedule);

    List<Schedule> getAll();

    Schedule getOneById(Integer id);
}
