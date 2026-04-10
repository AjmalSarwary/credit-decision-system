package com.nyrre8.cds.service.strategy;
import com.nyrre8.cds.domain.logistics.TransportJob;

public interface ValidationStrategy {
    boolean isValid(TransportJob job);
}
