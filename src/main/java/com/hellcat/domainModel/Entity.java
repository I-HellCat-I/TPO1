package com.hellcat.domainModel;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Entity {
    public Pose pose;
    protected static Entities actuallyItIs = Entities.Entity;
    public Entities thinksItIs;

    Entity(){
        thinksItIs = actuallyItIs;
        pose = Pose.Natural;
    }

    public boolean twist(Entities newEntity){
        if (actuallyItIs != Entities.Censored){
            actuallyItIs = newEntity;
            return true;
        }
        return false;
    }

    public boolean realiseWhatItIs(){
        thinksItIs = actuallyItIs;
        return true;
    }

    public boolean isRealised(){
        return thinksItIs == actuallyItIs;
    }
}
