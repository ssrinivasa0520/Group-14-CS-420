package com.javafx.farmdashboard.components;

import com.javafx.farmdashboard.helpers.DroneAnimator;
import com.javafx.farmdashboard.model.Coordinates;
import com.javafx.farmdashboard.model.Item;
import com.javafx.farmdashboard.model.ItemI;
import javafx.scene.image.ImageView;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
public class DroneComponent {

    private ImageView drone;

    private DroneAnimator droneAnimator;

    public static ItemI droneItem;

    private ItemViewComponent itemViewComponent;

    private DroneActionComponent droneActionComponent;

    public DroneComponent(ImageView imageView, ItemViewComponent itemViewComponent, DroneActionComponent droneActionComponent) {
        drone = imageView;
        droneAnimator = new DroneAnimator(drone);
        this.itemViewComponent = itemViewComponent;
        this.droneActionComponent = droneActionComponent;
    }

    public static boolean isDronePresent() {
        return Objects.nonNull(droneItem);
    }

    public void scanFarm() {
        if(isDronePresent()) {
            double offsetX = droneItem.getWidth() / 2;
            double offsetY = droneItem.getLength() / 2;
            droneAnimator.scanFarm(new Coordinates(droneItem.getPosX(), droneItem.getPosY(), offsetX, offsetY), (status) -> {
                itemViewComponent.setDisable(true);
                droneActionComponent.setDisable(true);
            }, (status) -> {
                itemViewComponent.setDisable(false);
                droneActionComponent.setDisable(false);
            });
        }
    }

    public void visitItem() {
        ItemI selectedItem = itemViewComponent.getSelectedItem();
        if(isDronePresent()) {
            double offsetX = droneItem.getWidth() / 2;
            double offsetY = droneItem.getLength() / 2;
            droneAnimator.visitItem(new Coordinates(selectedItem.getPosX(), selectedItem.getPosY(), offsetX, offsetY), (status) -> {
                itemViewComponent.setDisable(true);
                droneActionComponent.setDisable(true);
            }, (status) -> {
                itemViewComponent.setDisable(false);
                droneActionComponent.setDisable(false);
            });
        }
    }
}
