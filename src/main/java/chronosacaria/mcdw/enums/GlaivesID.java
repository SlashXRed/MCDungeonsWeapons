package chronosacaria.mcdw.enums;

import chronosacaria.mcdw.Mcdw;
import chronosacaria.mcdw.bases.McdwGlaive;
import chronosacaria.mcdw.items.ItemsInit;

import java.util.EnumMap;
import java.util.HashMap;

public enum GlaivesID implements McdwWeaponID {
    SPEAR_CACKLING_BROOM,
    SPEAR_GLAIVE,
    SPEAR_GRAVE_BANE,
    SPEAR_VENOM_GLAIVE;

    public static HashMap<GlaivesID, Boolean> getEnabledItems(){
        return Mcdw.CONFIG.mcdwEnableItemsConfig.glaivesEnabled;
    }

    public static EnumMap<GlaivesID, McdwGlaive> getItemsEnum() {
        return ItemsInit.glaiveItems;
    }

    public static HashMap<GlaivesID, Float> getSpawnRates() {
        return Mcdw.CONFIG.mcdwNewlootConfig.glaiveSpawnRates;
    }

    public Boolean isEnabled(){
        return getEnabledItems().get(this);
    }

    @Override
    public McdwGlaive getItem() {
        return getItemsEnum().get(this);
    }

    @Override
    public Float getItemSpawnRate() {
        return getSpawnRates().get(this);
    }
}