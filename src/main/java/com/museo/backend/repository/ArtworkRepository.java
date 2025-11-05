// Repositorio que conecta la entidad 'Artwork' con la base de datos
package com.museo.backend.repository;

import com.museo.backend.model.Artwork;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtworkRepository extends JpaRepository<Artwork, String> {
}
