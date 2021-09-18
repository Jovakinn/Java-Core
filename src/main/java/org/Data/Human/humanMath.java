package org.Data.Human;

public interface humanMath {
     double calcMassIndex(double height, double mass);
     void analyzeIndex(double index);
     static boolean checkOnEvenMassIndex(double massIndex) {
         return massIndex % 2 == 1;
     }
}
