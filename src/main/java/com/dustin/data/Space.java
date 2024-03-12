package com.dustin.data;

import lombok.Data;

@Data
public class Space {
    int row;
    int column;
    Player player;

    public Space(int row, int column) {
        this.row = row;
        this.column = column;
    }
}
