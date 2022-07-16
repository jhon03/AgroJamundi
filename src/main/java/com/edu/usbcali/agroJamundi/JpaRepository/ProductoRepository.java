package com.edu.usbcali.agroJamundi.JpaRepository;


import com.edu.usbcali.agroJamundi.Domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}
