package com.libreriaalura.Libreria_alura.repository;

import com.libreriaalura.Libreria_alura.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ILibroRepository extends JpaRepository <Libro,Long>{
    Optional<Libro> findByTitulo(String titulo);

    @Query("SELEC DISTINCT l.idioma FROM Libro l")
    List<String> idiomasLibros();

    @Query("SELECT l FROM Libro l WHERE l.idioma = :idiomaSeleccionado")
    List<Libro> librosPoridioma(String idiomaSeleccionado);
}
