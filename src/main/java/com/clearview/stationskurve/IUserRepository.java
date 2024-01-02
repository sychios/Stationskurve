package com.clearview.stationskurve;

import org.springframework.data.repository.CrudRepository;

import com.clearview.stationskurve.User;

// Crud refers to Create/Read/Update/Delete
public interface IUserRepository  extends CrudRepository<User, Integer> {
}
