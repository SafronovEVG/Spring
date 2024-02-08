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

    @GetMapping("/plus")
    public String sum(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return String.valueOf(calculateService.sum(num1, num2));
    }

    @GetMapping("/minus")
    public String minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return String.valueOf(calculateService.minus(num1, num2));
    }
@GetMapping("/multiply")
    public String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return String.valueOf(calculateService.multiply( num1,num2));
    }
    @GetMapping("/divide")
    public String divide(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        return String.valueOf(calculateService.divide( num1, num2));
    }
}
