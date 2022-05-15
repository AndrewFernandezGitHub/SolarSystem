package com.company;

public class Main {
    public static void main(String[] args) {
        //write your code here
        SolarSystem FactorX=new SolarSystem();
        FactorX.Sun="1";
        FactorX.Moon="4";
        FactorX.Planet="2";
        FactorX.Stars="10000";

        //adding features to our sun
        FeatureSun XFact=new FeatureSun();
        XFact.color="green";
        XFact.heat="23232324";
        XFact.radius="123345";
    }
}
