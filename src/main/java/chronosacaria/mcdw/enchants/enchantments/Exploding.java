package chronosacaria.mcdw.enchants.enchantments;

import chronosacaria.mcdw.Mcdw;
import chronosacaria.mcdw.configs.McdwConfig;
import chronosacaria.mcdw.enchants.types.AOEEnchantment;
import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Exploding extends AOEEnchantment {
    McdwConfig.McdwEnchantsConfig config = AutoConfig.getConfigHolder(McdwConfig.McdwEnchantsConfig.class).getConfig();

    public Exploding (Rarity weight, EnchantmentTarget type, EquipmentSlot[] slotTypes) {
        super(weight, type, slotTypes);
        Registry.register(Registry.ENCHANTMENT,new Identifier(Mcdw.MOD_ID, "exploding"),this);
    }

    public int getMaxLevel() {
        return 3;
    }

    @Override
    protected boolean canAccept (Enchantment other){
        return config.enableAOEMixing || !(other instanceof AOEEnchantment);
    }
    
}
