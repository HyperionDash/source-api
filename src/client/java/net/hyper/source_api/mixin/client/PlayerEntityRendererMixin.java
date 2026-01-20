package net.hyper.source_api.mixin.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.hyper.source_api.ModTags;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.entity.PlayerEntityRenderer;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.util.Hand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerEntityRenderer.class)
@Environment(EnvType.CLIENT)
public class PlayerEntityRendererMixin {
    @Inject(method = "getArmPose", at = @At("TAIL"), cancellable = true)
    private static void doubleHandedWeaponPose(AbstractClientPlayerEntity player, Hand hand, CallbackInfoReturnable<BipedEntityModel.ArmPose> cir) {
        if (player.getStackInHand(Hand.MAIN_HAND). isIn(ModTags.Items.CROSSBOW_CHARGE_MAINHAND))
            cir.setReturnValue(BipedEntityModel.ArmPose.CROSSBOW_CHARGE);
        if (player.getStackInHand(Hand.MAIN_HAND). isIn(ModTags.Items.BOW_AND_ARROW_MAINHAND))
            cir.setReturnValue(BipedEntityModel.ArmPose.BOW_AND_ARROW);
        if (player.getStackInHand(Hand.MAIN_HAND). isIn(ModTags.Items.CROSSBOW_HOLD_MAINHAND))
            cir.setReturnValue(BipedEntityModel.ArmPose.CROSSBOW_HOLD);
        if (player.getStackInHand(Hand.MAIN_HAND). isIn(ModTags.Items.SPYGLASS_MAINHAND))
            cir.setReturnValue(BipedEntityModel.ArmPose.SPYGLASS);
        if (player.getStackInHand(Hand.MAIN_HAND). isIn(ModTags.Items.THROW_SPEAR_MAINHAND))
            cir.setReturnValue(BipedEntityModel.ArmPose.THROW_SPEAR);
        if (player.getStackInHand(Hand.MAIN_HAND). isIn(ModTags.Items.TOOT_HORN_MAINHAND))
            cir.setReturnValue(BipedEntityModel.ArmPose.TOOT_HORN);
        if (player.getStackInHand(Hand.MAIN_HAND). isIn(ModTags.Items.EMPTY_MAINHAND))
            cir.setReturnValue(BipedEntityModel.ArmPose.EMPTY);
        if (player.getStackInHand(Hand.MAIN_HAND). isIn(ModTags.Items.BLOCK_MAINHAND))
            cir.setReturnValue(BipedEntityModel.ArmPose.BLOCK);
        if (player.getStackInHand(Hand.MAIN_HAND). isIn(ModTags.Items.BRUSH_MAINHAND))
            cir.setReturnValue(BipedEntityModel.ArmPose.BRUSH);

        if (player.getStackInHand(Hand.OFF_HAND). isIn(ModTags.Items.CROSSBOW_CHARGE_OFFHAND))
            cir.setReturnValue(BipedEntityModel.ArmPose.CROSSBOW_CHARGE);
        if (player.getStackInHand(Hand.OFF_HAND). isIn(ModTags.Items.BOW_AND_ARROW_OFFHAND))
            cir.setReturnValue(BipedEntityModel.ArmPose.BOW_AND_ARROW);
        if (player.getStackInHand(Hand.OFF_HAND). isIn(ModTags.Items.CROSSBOW_HOLD_OFFHAND))
            cir.setReturnValue(BipedEntityModel.ArmPose.CROSSBOW_HOLD);
        if (player.getStackInHand(Hand.OFF_HAND). isIn(ModTags.Items.SPYGLASS_OFFHAND))
            cir.setReturnValue(BipedEntityModel.ArmPose.SPYGLASS);
        if (player.getStackInHand(Hand.OFF_HAND). isIn(ModTags.Items.THROW_SPEAR_OFFHAND))
            cir.setReturnValue(BipedEntityModel.ArmPose.THROW_SPEAR);
        if (player.getStackInHand(Hand.OFF_HAND). isIn(ModTags.Items.TOOT_HORN_OFFHAND))
            cir.setReturnValue(BipedEntityModel.ArmPose.TOOT_HORN);
        if (player.getStackInHand(Hand.OFF_HAND). isIn(ModTags.Items.EMPTY_OFFHAND))
            cir.setReturnValue(BipedEntityModel.ArmPose.EMPTY);
        if (player.getStackInHand(Hand.OFF_HAND). isIn(ModTags.Items.BLOCK_OFFHAND))
            cir.setReturnValue(BipedEntityModel.ArmPose.BLOCK);
        if (player.getStackInHand(Hand.OFF_HAND). isIn(ModTags.Items.BRUSH_OFFHAND))
            cir.setReturnValue(BipedEntityModel.ArmPose.BRUSH);
    }
}