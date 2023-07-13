package FinalExamOldExams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int entryInt = Integer.parseInt(scanner.nextLine());
        Map<String,Integer> heroHitP = new LinkedHashMap<>();
        Map<String,Integer> heroManaP = new LinkedHashMap<>();

        for (int i = 0; i < entryInt ; i++) {
            String inputArr = scanner.nextLine();
            String heroName = inputArr.split(" ")[0];
            int hp = Integer.parseInt(inputArr.split(" ")[1]);
            int mp = Integer.parseInt(inputArr.split(" ")[2]);

            heroHitP.putIfAbsent(heroName,hp);
            heroManaP.putIfAbsent(heroName,mp);
        }

        while(true){
            String commandArr = scanner.nextLine();
            if (commandArr.contains("End")){
                break;
            }

            String command = commandArr.split(" - ")[0];
            String currentHero = commandArr.split(" - ")[1];

            switch (command){
                case "CastSpell" :
                    int mpRequired = Integer.parseInt(commandArr.split(" - ")[2]);
                    String spellName = commandArr.split(" - ")[3];

                    //if enough MP to case a spell
                    if (heroManaP.get(currentHero) >= mpRequired){
                        heroManaP.put(currentHero,heroManaP.get(currentHero) - mpRequired);     // update mp after using it
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n",currentHero,spellName,heroManaP.get(currentHero));
                    }else{
                        System.out.printf("%s does not have enough MP to cast %s!%n",currentHero,spellName);
                    }
                    break;
                case "TakeDamage" :
                    int damagePoints = Integer.parseInt(commandArr.split(" - ")[2]);
                    String attacker = commandArr.split(" - ")[3];
                    if(heroHitP.get(currentHero) < damagePoints){
                        //here dies
                        System.out.printf("%s has been killed by %s!%n",currentHero,attacker);
                        heroManaP.remove(currentHero);
                        heroHitP.remove(currentHero);
                    }else{
                        //hero  is only damanged
                        heroHitP.put(currentHero,heroHitP.get(currentHero) - damagePoints);     //update hp after damage
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n",currentHero,damagePoints,attacker,heroHitP.get(currentHero));
                    }
                    break;
                case "Recharge" :
                    int amountRecharge = Integer.parseInt(commandArr.split(" - ")[2]);

                    //heal mp
                    int currentMP = heroManaP.get(currentHero);
                    if(currentMP < 200){
                        int freeCapacityToBeFilled = 200 - currentMP;
                        if (amountRecharge > freeCapacityToBeFilled){
                            heroManaP.put(currentHero,200);
                            System.out.printf("%s recharged for %d MP!%n",currentHero,freeCapacityToBeFilled);
                        }else if (amountRecharge < freeCapacityToBeFilled){
                            heroManaP.put(currentHero,heroManaP.get(currentHero) + amountRecharge);
                            System.out.printf("%s recharged for %d MP!%n",currentHero,amountRecharge);
                        }else {
                            heroManaP.put(currentHero,200);
                            System.out.printf("%s recharged for %d MP!%n",currentHero,amountRecharge);
                        }
                    }

                    break;
                case "Heal" :
                    //hp heal
                    int hpPointsHeal = Integer.parseInt(commandArr.split(" - ")[2]);
                    int currentHP = heroHitP.get(currentHero);
                    if(currentHP < 100){
                        int freeCapacityToBeFilled = 100 - currentHP;
                        if (hpPointsHeal > freeCapacityToBeFilled){
                            heroHitP.put(currentHero,100);
                            System.out.printf("%s healed for %d HP!%n",currentHero,freeCapacityToBeFilled);
                        }else if (hpPointsHeal < freeCapacityToBeFilled){
                            heroHitP.put(currentHero,heroHitP.get(currentHero) + hpPointsHeal);
                            System.out.printf("%s healed for %d HP!%n",currentHero,hpPointsHeal);
                        }else {
                            heroHitP.put(currentHero,100);
                            System.out.printf("%s healed for %d HP!%n",currentHero,hpPointsHeal);
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        for (Map.Entry<String, Integer> heroHP : heroHitP.entrySet()) {
            for (Map.Entry<String, Integer> heroMP : heroManaP.entrySet()) {
                if (heroHP.getKey().equals(heroMP.getKey())){
                    System.out.printf(heroHP.getKey() +"%n" +
                                        " " + " " + "HP: " + heroHP.getValue()+"%n" +
                                        " " + " " + "MP: " + heroMP.getValue()+"%n" );
                }
            }

        }

    }
}
/*
"{hero name}
  HP: {current HP}
  MP: {current MP}"
 */