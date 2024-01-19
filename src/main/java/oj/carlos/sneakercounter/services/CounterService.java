package oj.carlos.sneakercounter.services;

import oj.carlos.sneakercounter.entities.Counter;
import oj.carlos.sneakercounter.entities.PK.CounterPK;
import oj.carlos.sneakercounter.entities.User;
import oj.carlos.sneakercounter.exceptions.ResourceNotFoundException;
import oj.carlos.sneakercounter.repositories.CounterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CounterService
{
    @Autowired
    private CounterRepository repository;

    public List<Counter> findAll(){

        return repository.findAll();

    }
    public Counter create(Counter counter){
        return repository.save(counter);
    }
    public void update(Long userId, Long sneakerId, int n){
        List<Counter> list = this.findAll();
        Counter counter1;
        for(Counter counter : list){
            if(counter.getUser().getId() == userId && counter.getSneaker().getId() == sneakerId){
                counter1 = counter;
                counter1.setCounter(n);
                repository.save(counter1);
            }
        }


    }
}
