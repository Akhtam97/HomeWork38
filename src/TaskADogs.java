public class TaskADogs {
    private double weight;
    private String name;
    private Breed breed;

    public TaskADogs(double weight, String name, Breed breed) {
        this.weight = weight;
        this.name = name;
        this.breed = breed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Мой Вес = " + weight + "\n" +
                "Мое Имя = " + name + "\n" +
                "Я Породы  = " + breed;
    }
}
