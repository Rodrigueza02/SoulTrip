// Service layer for managing paintings
package com.museum.backend.service;

import org.springframework.stereotype.Service;

import com.museum.backend.model.Painting;
import com.museum.backend.repository.PaintingRepository;

import java.util.List;

@Service
public class PaintingService {

    private final PaintingRepository repo;

    public PaintingService(PaintingRepository repo) {
        this.repo = repo;
    }

    public List<Painting> getAllPaintings() {
        return repo.findAll();
    }

    public Painting getPaintingById(String id) {
        return repo.findById(Long.valueOf(id)).orElse(null);
    }

    public Painting createPainting(Painting painting) {
        return repo.save(painting);
    }

    public void deletePainting(String id) {
        repo.deleteById(Long.valueOf(id));
    }
}
