package Interfaces;

import Models.Human;

public interface CreateRepository<IEntity> {
     default void AddHuman(Interfaces.IEntity human) {

    }
}
