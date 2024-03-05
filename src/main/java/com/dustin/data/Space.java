package com.dustin.data;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Space {
    boolean occupied;
    String ownerId;

    public String toString() {
        if (occupied) {
            return "[x]";
        } else {
            return "[ ]";
        }
    }
}
