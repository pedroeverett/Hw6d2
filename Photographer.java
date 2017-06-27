import java.util.ArrayList;

public class Photographer {
  
  private String name;
  private ArrayList<Printable> cameras;

  public Photographer(String name) {
    this.name = name;
    this.cameras = new ArrayList<Printable>();
  }

  public void addCamera(Printable camera) {
    this.cameras.add(camera);
  }

  public int cameraCount() {
    return this.cameras.size();
  }

}