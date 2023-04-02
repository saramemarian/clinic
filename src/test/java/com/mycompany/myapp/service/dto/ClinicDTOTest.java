package com.mycompany.myapp.service.dto;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.mycompany.myapp.web.rest.TestUtil;

public class ClinicDTOTest {

    @Test
    public void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(ClinicDTO.class);
        ClinicDTO clinicDTO1 = new ClinicDTO();
        clinicDTO1.setId(1L);
        ClinicDTO clinicDTO2 = new ClinicDTO();
        assertThat(clinicDTO1).isNotEqualTo(clinicDTO2);
        clinicDTO2.setId(clinicDTO1.getId());
        assertThat(clinicDTO1).isEqualTo(clinicDTO2);
        clinicDTO2.setId(2L);
        assertThat(clinicDTO1).isNotEqualTo(clinicDTO2);
        clinicDTO1.setId(null);
        assertThat(clinicDTO1).isNotEqualTo(clinicDTO2);
    }
}
