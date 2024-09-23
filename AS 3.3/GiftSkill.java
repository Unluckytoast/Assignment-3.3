public class GiftSkill extends Skill {
    public GiftSkill(String name, int skillLevel) {
        super(name, "Gift", skillLevel);
    }


    @Override//Implenting identifyskill method 
    public void identifySkill() {
        System.out.println("Gift Skill of " + getName() + " has a level of " + getSkillLevel());
    }
}
