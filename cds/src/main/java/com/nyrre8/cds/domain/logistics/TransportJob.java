package com.nyrre8.cds.domain.logistics;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "transport_jobs")
@Data
public class TransportJob {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cargoType;
    private double weight;
    private String destination;
    private String status;
}
