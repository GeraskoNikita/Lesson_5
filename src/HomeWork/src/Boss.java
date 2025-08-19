public class Boss {
    private int bossHealth;
    private int bossDamage;
    private String bossDefence;

    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }

    public void setBossDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }

    public void setBossDefence(String bossDefence) {
        this.bossDefence = bossDefence;
    }

    public int getBossHealth() {
        return bossHealth;
    }

    public int getBossDamage() {
        return bossDamage;
    }

    public String getBossDefence() {
        return bossDefence;
    }
}
