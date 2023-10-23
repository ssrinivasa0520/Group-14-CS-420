package com.javafx.farmdashboard.components;

import com.javafx.farmdashboard.helpers.ItemCreator;
import com.javafx.farmdashboard.model.Item;
import com.javafx.farmdashboard.model.ItemI;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

public class ItemViewComponent {

    TreeView<ItemI> itemView;

    public ItemViewComponent(TreeView<ItemI> treeView) {
        this.itemView = treeView;

        initialize();
    }

    public void initialize() {
        ItemI farm = ItemCreator.createFarm();

        TreeItem<ItemI> rootItem = new TreeItem<>(farm);
        rootItem.setExpanded(true);
        itemView.setRoot(rootItem);
        itemView.getSelectionModel().select(rootItem);
    }

    public TreeItem<ItemI> getRootTreeItem() {
        return itemView.getRoot();
    }

    public ItemI getRootItem() {
        return getRootTreeItem().getValue();
    }

    public TreeItem<ItemI> getSelectedTreeItem() { return itemView.getSelectionModel().getSelectedItem(); }

    public ItemI getSelectedItem() { return getSelectedTreeItem().getValue(); }

    public void refresh() {
        itemView.refresh();
    }

    public void setDisable(boolean disabled) {
        itemView.setDisable(disabled);
    }

}
