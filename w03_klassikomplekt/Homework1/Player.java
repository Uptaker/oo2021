public class Player {
    public String name;

    // defining the skills
    public Skill ranged = new Skill(SkillTypes.RANGED, "rooty tooty point and shooty");
    public Skill strength = new Skill(SkillTypes.STRENGTH, "*barbaric noises*");
    public Skill magic = new Skill(SkillTypes.MAGIC, "FETUS.. DELETUS!");
    public Skill crafting = new Skill(SkillTypes.CRAFTING, "");
    public Skill cooking = new Skill(SkillTypes.COOKING, "MmMMMmmmMm!");
    public Skill smithing = new Skill(SkillTypes.SMITHING, "Bash!");
    public Skill woodcutting = new Skill(SkillTypes.WOODCUTTING, "Chop!");
    public Skill fishing = new Skill(SkillTypes.FISHING, "><>");
    public Skill farming = new Skill(SkillTypes.FARMING, "It ain't much, but it's honest work.");
    Skill[] skills = { ranged, strength, magic, crafting, cooking, smithing, woodcutting, fishing, farming };

    public Player(String name) {
        this.name = name;
        System.out.println("Account created: " + this.name);
    }

    // authentication
    public void login(Player name) {
        System.out.println("Logged in as: " + name);
    }

    public void logout() {
        System.out.println("We hope you enjoyed your time playing!");
    }

    public void stats() {
        System.out.println("Stats of: " + this.name);
        for (int i = 0; i < skills.length; i++) {
            System.out.println(skills[i].skillType + ": " + skills[i].level + "/5");
        }
    }

    public void listSkills() {
        for (int i = 0; i < skills.length; i++) {
            System.out.println(i + ": " + skills[i].skillType);
        }
    }

    public void trainSkill(int i) {
        skills[i].train();
    }

}
