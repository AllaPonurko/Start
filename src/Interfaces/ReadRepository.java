package Interfaces;

import Models.Human;

import java.util.UUID;

public interface ReadRepository {
    void readHumanById(UUID id);
    void readAll();
}
