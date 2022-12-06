package sample;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class DetailsController {

    @Resource
    DetailsService service;

    @RequestMapping("/products/{id}")
    public Optional<Detail> getDetail(@PathVariable final int id) {
        return service.getDetailById(id);
    }
}