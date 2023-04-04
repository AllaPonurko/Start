package Interfaces;

import Models.Human;

import java.util.UUID;

public interface ReadRepository {
    public void readHumanById(UUID Id);
    public void readAll();
}
