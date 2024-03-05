package com.dustin.ui.impl;

import com.dustin.data.Space;
import com.dustin.data.TheFloor;
import com.dustin.ui.UiDrawer;

public class UiDrawerImpl implements UiDrawer {

    public String getUI(TheFloor theFloor) {
        StringBuilder ui = new StringBuilder();

        for (int row = 0; row < 9; row++) {
            Space[] theRow = theFloor.getTheFloor()[row];
            ui.append(getRow(theRow));
        }

        return ui.toString();
    }

    private String getRow(Space[] theFloorRow) {
        StringBuilder rowBuilder = new StringBuilder();

        for (Space space : theFloorRow) {
            rowBuilder.append(getBox(space));
        }

        rowBuilder.append("\n");

        return rowBuilder.toString();
    }

    private String getBox(Space space) {
        StringBuilder box = new StringBuilder("[");

        if (space.isOccupied()) {
            box.append("X");
        } else {
            box.append(" ");
        }

        box.append("]");

        return box.toString();
    }
}
