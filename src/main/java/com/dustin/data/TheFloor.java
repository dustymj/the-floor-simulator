package com.dustin.data;

import lombok.Data;

@Data
public class TheFloor {
    private Space[][] theFloor;

    public TheFloor() {
        Space[][] theFloor = new Space[9][9];

        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                theFloor[row][column] = createSpace(row, column);
            }
        }

        this.theFloor = theFloor;
    }

    private Space createSpace(int row, int column) {
        Space space = new Space(row, column);
        Player player = new Player(space, 50);

        space.setPlayer(player);

        return space;
    }
}
