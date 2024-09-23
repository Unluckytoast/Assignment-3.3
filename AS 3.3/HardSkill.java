public class HardSkill extends Skill {
    public HardSkill(String name, int skillLevel) {
        super(name, "Hard", skillLevel);
    }

    @Override//Implenting identifyskill method 
    public void identifySkill() {
        System.out.println("Hard Skill of " + getName() + " has a level of " + getSkillLevel());
    }
}
