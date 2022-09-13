package me.drex.vanish.mixin.packets;

import me.drex.vanish.util.VanishedEntityPackets;
import net.minecraft.network.protocol.game.ClientboundBlockDestructionPacket;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(ClientboundBlockDestructionPacket.class)
public abstract class ClientboundBlockDestructionPacketMixin implements VanishedEntityPackets {
    @Shadow
    @Final
    private int id;

    @Override
    public int getEntityId() {
        return this.id;
    }
}