package SimulationOfIsland.data;

import SimulationOfIsland.data.descriptionsOfEntitys.BlockEntity;

import java.util.ArrayList;

public class maneFileOfSimulation {
    var maneFileOfSimulationInEntitys = new ArrayList()< BlockEntity >;

    public var getManeFileOfSimulationInEntitys() {
        return maneFileOfSimulationInEntitys;
    }

    public void setManeFileOfSimulationInEntitys(var maneFileOfSimulationInEntitys) {
        this.maneFileOfSimulationInEntitys = maneFileOfSimulationInEntitys;
    }
}
