package com.hotelapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotelapp.models.Hotel;
import com.hotelapp.models.Menu;

@Repository
public interface MenuRepository extends JpaRepository<Menu,Integer> {

}
