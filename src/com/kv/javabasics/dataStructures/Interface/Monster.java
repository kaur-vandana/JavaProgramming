package com.kv.javabasics.dataStructures.Interface;

//public class Monster implements ISaveable {

public class Monster {
    private String name;
    private  int hitPoints;
    private  int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }


    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

//    @Override
//    public List<String> write() {
//        List<String> list = new ArrayList<>();
//        String str = toString();
//
//    }

//    @Override
//    void read(List<String> readMe) {
//
//    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }
}
