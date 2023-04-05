package Interfaces;

import Models.Human;

import java.util.UUID;

public interface ReadRepository<IEntity,TId> {
    void readHumanById(UUID id);
    void readAll();
}
