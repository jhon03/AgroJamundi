package com.edu.usbcali.agroJamundi.JpaRepository;

import com.edu.usbcali.agroJamundi.Domain.Agricultor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgricultorRepository  extends JpaRepository <Agricultor, Integer> {
}
