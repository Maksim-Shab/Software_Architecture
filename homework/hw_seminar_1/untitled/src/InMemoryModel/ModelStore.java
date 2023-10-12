package InMemoryModel;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

import java.util.ArrayList;

public class ModelStore {
    public ArrayList<PoligonalModel> Models = new ArrayList<>();
    public ArrayList<Scene> Scenes = new ArrayList<>();
    public ArrayList<Flash> Flashes = new ArrayList<>();
    public ArrayList<Camera> Cameras = new ArrayList<>();
    private ArrayList<IModelChangedObserver> changeObservers = new ArrayList<>();

    public void GetScena(int nam) {
//        return Scene;
    }

    public void NotifyChange(IModelChanger) {

    }
}
