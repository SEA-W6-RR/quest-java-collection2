public class Hero implements Comparable<Hero> {

    // attributs
    private String name;
    private int age;

    // constructeurs
    public Hero(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // accesseurs (getters)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // mutateurs (setters)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Compare Two Heroes based on their name
    /**
     * @param   anotherHero - The Hero to be compared.
     * @return  A negative integer, zero, or a positive integer as this hero
     *          is less than, equal to, or greater than the supplied hero object.
     */
    @Override
    public int compareTo(Hero anotherHero) {
        return this.getName().compareTo(anotherHero.getName());
    }
}