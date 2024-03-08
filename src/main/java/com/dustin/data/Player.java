package com.dustin.data;

import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class Player {
    String id;
    String specialty;
    List<Space> spaces;
    Strategy strategy;

    public Player(List<Space> spaces, int aggressiveness) {
        String id = UUID.randomUUID().toString();
        String specialty = UUID.randomUUID().toString();
        Strategy strategy = Strategy.builder()
                                    .aggressiveness(aggressiveness)
                                    .build();
        this.id = id;
        this.specialty = specialty;
        this.strategy = strategy;
        this.spaces = spaces;
    }
}
