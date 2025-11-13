// Service layer for managing artworks
package com.museo.backend.service;

import com.museo.backend.model.Artwork;
import com.museo.backend.repository.ArtworkRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtworkService {

    private final ArtworkRepository repo;

    public ArtworkService(ArtworkRepository repo) {
        this.repo = repo;
    }

    public List<Artwork> getAllArtworks() {
        return repo.findAll();
    }

    public Artwork getArtworkById(String id) {
        return repo.findById(Long.valueOf(id)).orElse(null);
    }

    public Artwork createArtwork(Artwork artwork) {
        return repo.save(artwork);
    }

    public void deleteArtwork(String id) {
        repo.deleteById(Long.valueOf(id));
    }
}
