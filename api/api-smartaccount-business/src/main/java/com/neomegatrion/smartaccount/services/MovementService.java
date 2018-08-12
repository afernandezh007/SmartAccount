package com.neomegatrion.smartaccount.services;

import com.neomegatrion.smartaccount.model.Movement;
import com.neomegatrion.smartaccount.repositories.MovementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovementService implements IMovementService{

    @Autowired
    private MovementRepository movementRepository;

    @Override
    public List<Movement> findAll() {

        Iterable<Movement> all = movementRepository.findAll();
        List<Movement> returnList = new ArrayList<>();
        all.forEach(returnList::add);

        return returnList;
    }

    @Override
    public Movement save(Movement m) {
        return movementRepository.save(m);
    }
}
