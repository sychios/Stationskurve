package com.clearview.stationskurve;

import org.springframework.data.repository.CrudRepository;

// Crud refers to Create/Read/Update/Delete
public interface UserRepository  extends CrudRepository<User, Integer> {
}

