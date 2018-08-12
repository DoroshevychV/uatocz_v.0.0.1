package net.uatocz.service.schedule.impl;

import net.uatocz.dao.ScheduleDAO;
import net.uatocz.domain.Schedule;
import net.uatocz.service.schedule.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleSI implements ScheduleService {

    @Autowired
    ScheduleDAO scheduleDAO;

    @Override
    public void create(Schedule schedule) {
        scheduleDAO.save(schedule);
    }

    @Override
    public void delete(Integer id) {
        scheduleDAO.deleteById(id);
    }

    @Override
    public void edit(Schedule schedule) {
//        Schedule schedule1 = getOneById(schedule.getId());
//        System.out.println(schedule.getId());
//        if(schedule!=null){
//            System.out.println("TRUUEEEEEEEEEE");
//        }
        scheduleDAO.save(schedule);
    }

    @Override
    public List<Schedule> getAll() {
        return scheduleDAO.findAll();
    }

    @Override
    public Schedule getOneById(Integer id) {
        return scheduleDAO.getOne(id);
    }
}
