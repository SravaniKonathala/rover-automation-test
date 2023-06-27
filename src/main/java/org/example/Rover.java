package org.example;

import java.util.Objects;

public class Rover {
    public static final Integer N = 1;
    public static final Integer E = 2;
    public static final Integer S = 3;
    public static final Integer W = 4;
    public Integer x = 0;
    public Integer y = 0;
    Integer facing = 0;

    public Rover() {
    }
    public void setPosition(Integer x, Integer y, Integer facing) {
        this.x = x;
        this.y = y;
        this.facing = facing;
    }
    public void printPosition() {
        char dir = 0;
        if (facing == 1) {
            dir = 'N';
        } else if (facing == 2) {
            dir = 'E';
        } else if (facing == 3) {
            dir = 'S';
        } else if (facing == 4) {
            dir = 'W';
        }
        System.out.println(x+" "+y+" "+dir);
    }
    public void process(String commands) {
        for (int index = 0; index < commands.length(); index ++ ) {
            process(commands.charAt(index));
        }
    }
    private void process(Character command) {
        if (command.equals('L')) {
            turnLeft();
        } else if (command.equals('R')) {
            turnRight();
        } else if (command.equals('M')) {
            move();
        } else {
            throw new IllegalArgumentException(
                    "Speak in Mars language, please!");
        }
    }
    private void move() {
        if (Objects.equals(facing, N)) {
            this.y++;
        } else if (Objects.equals(facing, E)) {
            this.x++;
        } else if (Objects.equals(facing, S)) {
            this.y--;
        } else if (Objects.equals(facing, W)) {
            this.x--;
        }
    }
    private void turnLeft() {
        facing = (facing - 1) < N ? W : facing - 1;
    }
    private void turnRight() {
        facing = (facing + 1) > W ? N : facing + 1;
    }

    public int covertCharToIntegerValue(char c){
        int value = 0;
        switch (c) {
            case 'N': value = 1; break;
            case 'E': value = 2; break;
            case 'S': value = 3; break;
            case 'W': value = 4; break;
        }
        return value;
    }
}
