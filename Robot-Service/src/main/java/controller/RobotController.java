package controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.RobotService;

@RestController
@RequestMapping("/robots")
public class RobotController {

    @Autowired
    RobotService robotService;

    @GetMapping("/{id}")
    ResponseEntity<String> getRobots(@PathVariable Integer id) {
        robotService.getRobotProperties(id);
        return ResponseEntity.ok("robots");
    }
}
