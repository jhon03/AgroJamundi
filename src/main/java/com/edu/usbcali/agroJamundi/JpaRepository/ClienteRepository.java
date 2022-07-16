package com.edu.usbcali.agroJamundi.JpaRepository;

import com.edu.usbcali.agroJamundi.Domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
