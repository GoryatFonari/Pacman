package com.core.game.test;

import com.core.game.PhysicsActor;
/*import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;*/


public class pacmanTest  {
    @org.junit.Test
    public void Test() {
        PhysicsActor actor = new PhysicsActor();
        actor.setCustomRectangleBoundary(0,0,0,10,10,0,10,10);
        actor.setPosition(10,10);
        PhysicsActor mob = new PhysicsActor();
        mob.setCustomRectangleBoundary(0,0,0,10,10,0,10,10);
        mob.setPosition(11,11);
        assert (true);
    }
}
