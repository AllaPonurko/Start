package Interfaces;

import Models.Human;

public interface DeleteRepository <IEntity>{
    void deleteHuman(Interfaces.IEntity human);
}
