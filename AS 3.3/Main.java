// Main.java
public class Main {
    public static void main(String[] args) {
// Created instance of each skill
        HardSkill programming = new HardSkill("Programming", 6);
        SoftSkill communication = new SoftSkill("Communication", 8);
        GiftSkill mercy = new GiftSkill("Conflict Resolution", 7);
        TalentSkill organization = new TalentSkill("Organization", 9);

        // Call the identifySkill method for each skill
        programming.identifySkill();
        communication.identifySkill();
        mercy.identifySkill();
        organization.identifySkill();
    }
}

