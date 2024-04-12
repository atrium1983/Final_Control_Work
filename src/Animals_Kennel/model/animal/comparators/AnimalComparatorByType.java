package Animals_Kennel.model.animal.comparators;

import Animals_Kennel.model.animal.Animal;

import java.util.Comparator;

public class AnimalComparatorByType implements Comparator<Animal>{
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getAnimalType().compareTo(o2.getAnimalType());
    }
}
