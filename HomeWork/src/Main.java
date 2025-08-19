public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossHealth(700);
        boss.setBossDamage(50);
        boss.setBossDefence("Magical");
        System.out.println("Boss health: " + boss.getBossHealth() + " damage: " + boss.getBossDamage()
                + " defence: " + boss.getBossDefence());
        
        int count = 0;
        for (Hero hero : createHeroes()) {
            System.out.println(
                    "Hero№ " + count +
                            " Health " + hero.getHeroHealth() +
                            ", Damage " + hero.getHeroDamage() +
                            ", Superpower " + (hero.getHeroSuperpower() == null ? "No superpower" : hero.getHeroSuperpower()));
            count++;
        }

    }

    public static Hero[] createHeroes() {
        Hero hercules = new Hero(280, 20);
        Hero witcher = new Hero(270, 15, "Magical");
        Hero thor = new Hero(250, 30, "Thunderer");


        Hero[] heroList = {hercules, witcher, thor};
        return heroList;
    }
}


