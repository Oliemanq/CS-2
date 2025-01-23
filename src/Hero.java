/**
 * Hero class defines a hero and the abilities they have.
 * Also includes getters and setters for all variables
 *
 * @author Oliver Heisel
 */
public class Hero {
    private String name;
    private String ability1;
    private String ability2;

    /**
     * Default constructor for Hero class.
     * This takes in the name of the hero and two of their abilities
     *
     * @param name name of the hero
     * @param ability1 name and description of the first ability
     * @param ability2 name and description of the second ability
     */
    public void hero(String name, String ability1, String ability2){
        this.name = name;
        this.ability1 = ability1;
        this.ability2 = ability2;
    }
    /**
     * Getter for name
     * @return name
     */
    public String getName(){
        return name;
    }
    /**
     * Getter for ability1
     * @return ability1 name and description
     */
    public String getAbility1(){
        return ability1;
    }
    /**
     * Getter for ability2
     * @return ability2 name and description
     */
    public String getAbility2(){
        return ability2;
    }

    /**
     * Setter for name
     * @param name new name of the hero
     */
    public void setName(String name){
        this.name = name;
    }
    /**
     * Setter for ability1
     * @param ability1 new name and description of the first ability
     */
    public void setAbility1(String ability1){
        this.ability1 = ability1;
    }
    /**
     * Setter for ability2
     * @param ability2 new name and description of the second ability
     */
    public void setAbility2(String ability2){
        this.ability2 = ability2;
    }
}