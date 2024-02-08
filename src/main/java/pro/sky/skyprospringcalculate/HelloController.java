package pro.sky.skyprospringcalculate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class HelloController {
    private final CalculateService calculateService;

    public HelloController(CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    @GetMapping
    public String calculate() {
        return calculateService.calculate();
    }

    @GetMapping("/sum")
    public String sum(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return String.valueOf(calculateService.sum(num1, num2));
    }
}
