import java.util.ArrayList;
import java.util.HashMap;

public class Photographer {
  
  private String name;
  private ArrayList<Printable> cameras;
  HashMap<String, Integer> journal = new HashMap<String, Integer>(); 

  public Photographer(String name) {
    this.name = name;
    this.cameras = new ArrayList<Printable>();
    journal.put("Day_01", 300);
    journal.put("Day_02", 200);
    journal.put("Day_03", 450);
  }


  public void addCamera(Printable camera) {
    this.cameras.add(camera);
  }

  public int cameraCount() {
    return this.cameras.size();
  }

  public Printable removeCamera() {
    if(cameraCount() > 0) {
      Printable camera = cameras.remove(0);
      return camera;
    }
    return null;
  }

  public ArrayList cameraDetails() {
    ArrayList<String> details = new ArrayList<String>();
    for (Printable camera : cameras) {
        details.add(camera.details());
      }
    return details;
  }

  public int sumPhotos() {
  ArrayList<Integer> numbers = new ArrayList<Integer>(journal.values());
  int sum = 0;
  for( int i : numbers) {
      sum += i;
  }
  return sum;
}
}