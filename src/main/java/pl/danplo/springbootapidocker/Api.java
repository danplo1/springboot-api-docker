package pl.danplo.springbootapidocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Api {

private List<Animal> animals;

    public Api() {
        this.animals = new ArrayList<>();
        animals.add(new Animal("dog"));
        animals.add(new Animal("cat"));
        animals.add(new Animal("elephant"));
        animals.add(new Animal("parrot"));
        animals.add(new Animal("horse"));

    }

    @GetMapping("/animals")
    public List<Animal> getAnimals(){
        return animals;
    }


    @PostMapping ("/animals")
    public boolean addAnimals(@RequestBody Animal animal){
        return animals.add(animal);
    }

}
