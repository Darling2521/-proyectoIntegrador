package edu.yavirac.backendpi.feature.prospect;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("prospects")
public class Prospect {
    @Id
    @Column("prospect_id")
    private long prospectId;
    
}
