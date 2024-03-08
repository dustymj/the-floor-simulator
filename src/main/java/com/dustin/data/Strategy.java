package com.dustin.data;

import lombok.Builder;
import lombok.Data;

import java.util.Random;

@Data
@Builder
public class Strategy {

    // Percent chance that they will attack a space adjacent to them
    int aggressiveness;

    public boolean willChallenge() {
        Random random = new Random();

        int chance = random.nextInt(100) + 1;

        return chance >= aggressiveness;
    }

    // TODO once spaces are determined.
    public Space pickDefender() {
        return null;
    }
}
