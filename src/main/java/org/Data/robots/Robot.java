package org.Data.robots;

import org.Data.Human.humanMath;

import java.util.Objects;

public class Robot implements humanMath {
    private Integer xPosition;
    private Integer yPosition;
    private boolean isActive;

    void moveX () {
        this.xPosition++;
    }
    void moveY() {
        this.yPosition++;
    }
    void play() {
        isActive = true;
        moveX();
        moveY();
    }

    @Override
    public String toString() {
        return "Robot{" +
                "xPosition=" + xPosition +
                ", yPosition=" + yPosition +
                ", isActive=" + isActive +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Robot robot = (Robot) o;
        return isActive == robot.isActive && Objects.equals(xPosition, robot.xPosition) && Objects.equals(yPosition, robot.yPosition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xPosition, yPosition, isActive);
    }

    public Robot() {
    }

    public Robot(Integer xPosition, Integer yPosition, boolean isActive) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.isActive = isActive;
    }

    public Integer getxPosition() {
        return xPosition;
    }

    public void setxPosition(Integer xPosition) {
        this.xPosition = xPosition;
    }

    public Integer getyPosition() {
        return yPosition;
    }

    public void setyPosition(Integer yPosition) {
        this.yPosition = yPosition;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public double calcMassIndex(double height, double mass) {
        return 0;
    }

    @Override
    public void analyzeIndex(double index) {

    }
}
