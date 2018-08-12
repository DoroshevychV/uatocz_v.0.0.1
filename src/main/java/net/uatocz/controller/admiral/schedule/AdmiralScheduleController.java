package net.uatocz.controller.admiral.schedule;

import net.uatocz.domain.Schedule;
import net.uatocz.service.schedule.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/admiral/schedule")
public class AdmiralScheduleController {

    @Autowired
    ScheduleService scheduleService;

    @PutMapping("/create")
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Schedule schedule){
        scheduleService.create(schedule);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody Integer id){
        scheduleService.delete(id);
    }

    @PostMapping("/edit")
    public void edit(@RequestBody Schedule schedule){
        scheduleService.edit(schedule);
    }

}
