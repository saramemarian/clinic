package com.mycompany.myapp.service.dto;

import java.io.Serializable;

/**
 * A DTO for the {@link com.mycompany.myapp.domain.Clinic} entity.
 */
public class ClinicDTO implements Serializable {
    
    private Long id;

    private String name;

    private Integer status;

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ClinicDTO)) {
            return false;
        }

        return id != null && id.equals(((ClinicDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "ClinicDTO{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", status=" + getStatus() +
            "}";
    }
}
