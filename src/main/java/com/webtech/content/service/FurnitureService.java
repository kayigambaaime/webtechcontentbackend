package com.webtech.content.service;

import com.webtech.content.model.Furniture;
import com.webtech.content.userRepository.FurnitureRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FurnitureService {

    private final FurnitureRepository furnitureRepository;

    public FurnitureService(FurnitureRepository furnitureRepository) {
        this.furnitureRepository = furnitureRepository;
    }

    public void saveAll(List<Furniture> furnitureList) {
        furnitureRepository.saveAll(furnitureList);
    }

    public List<Furniture> getAllFurniture() {
        return furnitureRepository.findAll();
    }
}
    