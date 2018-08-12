package com.neomegatrion.smartaccount.services;

import com.neomegatrion.smartaccount.model.Movement;

import java.util.List;

public interface IMovementService {

    List<Movement> findAll();

    Movement save(Movement m);
}
