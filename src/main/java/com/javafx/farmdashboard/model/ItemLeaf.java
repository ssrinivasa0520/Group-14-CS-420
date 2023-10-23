package com.javafx.farmdashboard.model;

import com.javafx.farmdashboard.Constants;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data()
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ItemLeaf implements ItemI {

    private boolean isContainer;

    private Constants.ItemType type;

    private ItemI parent;

    private List<ItemI> children;

    private String name;

    private Double posX;

    private Double posY;

    private Double price;

    private Double length;

    private Double width;

    public boolean isDefault() {
        return this.type == Constants.ItemType.DEFAULT;
    }

    public boolean isFarm() {
        return this.type == Constants.ItemType.FARM;
    }

    public boolean isCommandCenter() {
        return this.type == Constants.ItemType.COMMAND_CENTER;
    }

    public boolean isDrone() {
        return this.type == Constants.ItemType.DRONE;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
