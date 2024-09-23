public class TalentSkill extends Skill {
    public TalentSkill(String name, int skillLevel) {
        super(name, "Talent", skillLevel);
    }

   
    @Override/* Implenting identifyskill method */
    public void identifySkill() {
        System.out.println("Talent Skill of " + getName() + " has a level of " + getSkillLevel());
    }
}
