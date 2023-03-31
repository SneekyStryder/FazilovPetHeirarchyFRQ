import java.util.ArrayList;

public class Kennel {
    private ArrayList<Pet> petList;

    public Kennel() {
        petList = new ArrayList<>();
    }

    public void addPetToList(Pet pet) {
        petList.add(pet);
    }

    public void allSpeak() {
        for (Pet pet: petList) {
            System.out.println(pet.getName() + " "  + pet.speak());
        }
    }
}
