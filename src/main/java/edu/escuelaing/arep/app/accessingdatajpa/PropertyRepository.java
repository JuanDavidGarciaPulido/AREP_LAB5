package edu.escuelaing.arep.app.accessingdatajpa;


import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyRepository extends JpaRepository<Property, Long> {
}
