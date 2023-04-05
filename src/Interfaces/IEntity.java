package Interfaces;

import java.util.UUID;

public interface IEntity {
    default UUID getId() {
        return null;
    }
}
