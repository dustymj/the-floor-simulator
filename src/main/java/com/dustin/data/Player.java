package com.dustin.data;

import lombok.Data;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Data
public class Player {
    String id;
    int roundsPlayed;
    boolean defendingExpertise;
    List<Space> spaces;
    Strategy strategy;
    Color color;

    public Player(Space space, int aggressiveness) {
        String id = UUID.randomUUID().toString();
        Strategy strategy = Strategy.builder()
                                    .aggressiveness(aggressiveness)
                                    .build();
        this.id = id;
        this.roundsPlayed = 0;
        this.defendingExpertise = true;

        this.strategy = strategy;

        this.spaces = new ArrayList<>();
        this.spaces.add(space);

        this.color = getRandomColor();
    }

    public void wonDuel(boolean defending) {
        defendingExpertise = false;
    }

    public int getNumberOfSpaces() {
        return spaces.size();
    }

    public Color getRandomColor() {
        Random random = new Random();

        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);

        return new Color(red, green, blue);
    }
}
