package net.uatocz.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

    @GetMapping("/prices")
    public String getPrice() {
        return "prices";
    }

    @GetMapping("/schedule")
    public String getSchedule() {
        return "schedule";
    }

    @GetMapping("/admiral")
    public String getAdmiralLogin() {
        return "login";
    }

    @GetMapping("/admiral/home")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String getAdminHomePage() {
        return "/admiral/admin";
    }


    @GetMapping("/admiral/prices")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String getAdminPricesPage() {
        return "/admiral/adm_prices";
    }

    @GetMapping("/admiral/schedule")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String getAdminSchedulePage() {
        return "/admiral/adm_schedule";
    }
}
