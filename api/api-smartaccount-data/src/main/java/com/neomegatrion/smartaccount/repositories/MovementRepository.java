package com.neomegatrion.smartaccount.repositories;

import com.neomegatrion.smartaccount.model.Movement;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovementRepository extends CrudRepository<Movement, Long> {
}
