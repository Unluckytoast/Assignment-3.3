public abstract class Skill {
    private String name;
    private String type;
    private int skillLevel;

    public Skill(String name, String type, int skillLevel) /*Constructor */ {
        this.name = name;
        this.type = type;
        this.skillLevel = skillLevel;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    public abstract void identifySkill();
}


