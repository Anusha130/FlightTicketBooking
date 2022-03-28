package com.kingflyer.flightBooking.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kingflyer.flightBooking.Model.Fleet;


@Repository
public interface FleetRepo extends CrudRepository<Fleet, Integer>{

}
