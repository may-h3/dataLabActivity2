import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }

  public lowestRating()
  {
    private int ratingValue = 0;
    private String cerealName;
    private arrayList<Cereal> cereal = new arrayList<Cereal>; 
    
    //sorts the cereals from lowest rating to highest rating
    for (int i = 1; i < cereal.size(); i++)
    {
      for (int j = 0; j < i+1; j++)
      {
        if (cereal.getRating(i) > cereal.getRating(j))
        {
          cereal.set(j+1, cereal.getRating(i));
        }
        else if (cereal.getRating(i) < cereal.getRating(j))
        {
          cereal.set(j, cereal.getRating(i));
        }
      }
    }
    
    ratingValue = cereal.getRating(0); //sets ratingValue equal to the rating of the first cereal in the arraylist 
    cerealName = cereal.getName(0); //sets cerealName equal to the name of the first cereal in the arraylist 

    System.out.println(cerealName + " has a rating of " + ratingValue + ", which is the lowest rating.");
  }
}