package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Clinic;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the Clinic entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ClinicRepository extends JpaRepository<Clinic, Long> {
}
