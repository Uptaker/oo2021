public class Skill {

    public int level = 0;
    public SkillTypes skillType;
    public String trainMsg;
    private int xp = 0;
    private boolean maxed = false;

    public Skill(SkillTypes skillType, String trainMsg) {
        this.skillType = skillType;
        this.trainMsg = trainMsg;
    }

    public void levelUp() {
        level++;
        System.out.println("You've achieved a new level in: " + this.skillType);
        System.out.println("Your level is now: " + this.level);
    }

    public void train() {
        xp = xp + 10;
        if (!maxed) {
            System.out.println(trainMsg);
        }
        if (xp == 50) {
            levelUp();
        } else if (xp == 120) {
            levelUp();
        } else if (xp == 250) {
            levelUp();
        } else if (xp == 500) {
            levelUp();
        } else if (xp == 850) {
            levelUp();
            maxed = true;
            System.out.println("You've MAXED!");
        } else if (xp > 850) {
            System.out.println(this.skillType + ": You've achieved the maximum level!");
        }
    }

}
