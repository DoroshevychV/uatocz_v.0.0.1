package net.uatocz.controller.schedule;

import net.uatocz.domain.Schedule;
import net.uatocz.service.schedule.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/schedule")
public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;

    @GetMapping("/all")
    public List<Schedule> getAll(){
        return scheduleService.getAll();
    }

}
