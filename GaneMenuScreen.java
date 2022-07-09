// 
// Decompiled by Procyon v0.5.36
// 

package me.breathtaken.duperprpr.mixin;

import net.minecraft.class_2596;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.class_2813;
import net.minecraft.class_1713;
import net.minecraft.class_1935;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import net.minecraft.class_364;
import net.minecraft.class_4185;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.class_2561;
import net.minecraft.class_433;
import org.spongepowered.asm.mixin.Mixin;
import net.minecraft.class_437;

@Mixin({ class_433.class })
public class GaneMenuScreen extends class_437
{
    private boolean status;
    
    protected GaneMenuScreen() {
        super(class_2561.method_30163("Balls"));
        this.status = false;
    }
    
    @Inject(at = { @At("TAIL") }, method = { "init" })
    private void init(final CallbackInfo info) {
        this.method_37063((class_364)new class_4185(35, 15, 120, 25, class_2561.method_30163(invokedynamic(makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;, this.status ? "ON" : "OFF")), button -> {
            this.status = !this.status;
            button.method_25355(class_2561.method_30163(invokedynamic(makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;, this.status ? "ON" : "OFF")));
        }));
    }
    
    @Inject(at = { @At("HEAD") }, method = { "tick" })
    private void tick(final CallbackInfo ci) {
        if (!this.status) {
            return;
        }
        final Int2ObjectMap<class_1799> duperprpr = (Int2ObjectMap<class_1799>)new Int2ObjectArrayMap();
        duperprpr.put(0, (Object)new class_1799((class_1935)class_1802.field_8116, 1));
        for (int i = 0; i < 11; ++i) {
            this.field_22787.field_1724.field_3944.method_2883((class_2596)new class_2813(this.field_22787.field_1724.field_7512.field_7763, 123344, 2957234, 2859623, class_1713.field_7790, new class_1799((class_1935)class_1802.field_8162, -1), (Int2ObjectMap)duperprpr));
        }
    }
}
