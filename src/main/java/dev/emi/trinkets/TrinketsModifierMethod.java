package dev.emi.trinkets;

import java.util.UUID;

import com.google.common.collect.Multimap;

import dev.emi.trinkets.api.SlotReference;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.item.ItemStack;

public interface TrinketsModifierMethod {
    Multimap<EntityAttribute, EntityAttributeModifier> mixinFunc(Multimap<EntityAttribute, EntityAttributeModifier> map, ItemStack stack, SlotReference slot, LivingEntity entity, UUID uuid);
}
