package com.libreriaalura.Libreria_alura.repository;

import com.libreriaalura.Libreria_alura.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface IAutorRepository extends JpaRepository<Autor, Long> {
    Optional<Autor> findByNombre(String nombre);

    @Query("SELEC a FROM Autor a WHERE a.fechaDemuerte <= :fechaDemuerte")
    List<Autor> autoresPorFechaDemuerte(int fechaDemuerte);
}
