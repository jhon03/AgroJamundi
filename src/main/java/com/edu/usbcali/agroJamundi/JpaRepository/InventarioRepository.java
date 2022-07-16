package com.edu.usbcali.agroJamundi.JpaRepository;

import com.edu.usbcali.agroJamundi.Domain.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventarioRepository extends JpaRepository<Inventario, Integer> {
}
