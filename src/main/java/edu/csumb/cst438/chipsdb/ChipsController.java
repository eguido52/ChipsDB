package edu.csumb.cst438.chipsdb;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import edu.csumb.cst438.chipsdb.entities.chip;

@CrossOrigin(origins = "*")
@RestController
public class ChipsController {

    @Autowired
    IChipsRepository chipRepository;

    @GetMapping("/chips")
    public List<chip> getAll(){
        List<chip> result = chipRepository.findAll();
        return result;

    }

    @GetMapping("/chip/{id}")
    public chip getChipById(@PathVariable String id)
    {
        chip result = chipRepository.findByRepoId(id);
        return result;
    }

    @GetMapping("/name/{name}")
    public List<chip> getByName(@PathVariable String name)
    {
        List<chip> result = chipRepository.findByName(name);
        return result;
    }
}