package com.mycompany.myapp.service;

import com.mycompany.myapp.domain.Clinic;
import com.mycompany.myapp.repository.ClinicRepository;
import com.mycompany.myapp.service.dto.ClinicDTO;
import com.mycompany.myapp.service.mapper.ClinicMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Service Implementation for managing {@link Clinic}.
 */
@Service
@Transactional
public class ClinicService {

    private final Logger log = LoggerFactory.getLogger(ClinicService.class);

    private final ClinicRepository clinicRepository;

    private final ClinicMapper clinicMapper;

    public ClinicService(ClinicRepository clinicRepository, ClinicMapper clinicMapper) {
        this.clinicRepository = clinicRepository;
        this.clinicMapper = clinicMapper;
    }

    /**
     * Save a clinic.
     *
     * @param clinicDTO the entity to save.
     * @return the persisted entity.
     */
    public ClinicDTO save(ClinicDTO clinicDTO) {
        log.debug("Request to save Clinic : {}", clinicDTO);
        Clinic clinic = clinicMapper.toEntity(clinicDTO);
        clinic = clinicRepository.save(clinic);
        return clinicMapper.toDto(clinic);
    }

    /**
     * Get all the clinics.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    @Transactional(readOnly = true)
    public Page<ClinicDTO> findAll(Pageable pageable) {
        log.debug("Request to get all Clinics");
        return clinicRepository.findAll(pageable)
            .map(clinicMapper::toDto);
    }


    /**
     * Get one clinic by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Transactional(readOnly = true)
    public Optional<ClinicDTO> findOne(Long id) {
        log.debug("Request to get Clinic : {}", id);
        return clinicRepository.findById(id)
            .map(clinicMapper::toDto);
    }

    /**
     * Delete the clinic by id.
     *
     * @param id the id of the entity.
     */
    public void delete(Long id) {
        log.debug("Request to delete Clinic : {}", id);
        clinicRepository.deleteById(id);
    }
}
