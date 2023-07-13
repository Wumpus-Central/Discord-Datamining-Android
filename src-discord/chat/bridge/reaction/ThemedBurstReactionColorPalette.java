package com.discord.chat.bridge.reaction;

import com.discord.reactions.BurstReactionView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import pi.f;
import si.n1;

@f
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B1\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J!\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!HÇ\u0001R\u001c\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000e¨\u0006$"}, d2 = {"Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;", "Lcom/discord/reactions/BurstReactionView$ThemedBurstColorPalette;", "seen1", "", "light", "Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;", "dark", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/chat/bridge/reaction/BurstReactionColorPalette;Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;)V", "getDark$annotations", "()V", "getDark", "()Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;", "getLight$annotations", "getLight", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class ThemedBurstReactionColorPalette implements BurstReactionView.ThemedBurstColorPalette {
    public static final Companion Companion = new Companion(null);
    private final BurstReactionColorPalette dark;
    private final BurstReactionColorPalette light;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ThemedBurstReactionColorPalette> serializer() {
            return ThemedBurstReactionColorPalette$$serializer.INSTANCE;
        }
    }

    public  ThemedBurstReactionColorPalette(int i10, BurstReactionColorPalette burstReactionColorPalette, BurstReactionColorPalette burstReactionColorPalette2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i10 & 3)) {
            n1.b(i10, 3, ThemedBurstReactionColorPalette$$serializer.INSTANCE.getDescriptor());
        }
        this.light = burstReactionColorPalette;
        this.dark = burstReactionColorPalette2;
    }

    public static  ThemedBurstReactionColorPalette copy$default(ThemedBurstReactionColorPalette themedBurstReactionColorPalette, BurstReactionColorPalette burstReactionColorPalette, BurstReactionColorPalette burstReactionColorPalette2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            burstReactionColorPalette = themedBurstReactionColorPalette.getLight();
        }
        if ((i10 & 2) != 0) {
            burstReactionColorPalette2 = themedBurstReactionColorPalette.getDark();
        }
        return themedBurstReactionColorPalette.copy(burstReactionColorPalette, burstReactionColorPalette2);
    }

    public static  void getDark$annotations() {
    }

    public static  void getLight$annotations() {
    }

    public static final void write$Self(ThemedBurstReactionColorPalette self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        BurstReactionColorPalette$$serializer burstReactionColorPalette$$serializer = BurstReactionColorPalette$$serializer.INSTANCE;
        output.n(serialDesc, 0, burstReactionColorPalette$$serializer, self.getLight());
        output.n(serialDesc, 1, burstReactionColorPalette$$serializer, self.getDark());
    }

    public final BurstReactionColorPalette component1() {
        return getLight();
    }

    public final BurstReactionColorPalette component2() {
        return getDark();
    }

    public final ThemedBurstReactionColorPalette copy(BurstReactionColorPalette light, BurstReactionColorPalette dark) {
        q.g(light, "light");
        q.g(dark, "dark");
        return new ThemedBurstReactionColorPalette(light, dark);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThemedBurstReactionColorPalette)) {
            return false;
        }
        ThemedBurstReactionColorPalette themedBurstReactionColorPalette = (ThemedBurstReactionColorPalette) obj;
        return q.b(getLight(), themedBurstReactionColorPalette.getLight()) && q.b(getDark(), themedBurstReactionColorPalette.getDark());
    }

    public int hashCode() {
        return (getLight().hashCode() * 31) + getDark().hashCode();
    }

    public String toString() {
        BurstReactionColorPalette light = getLight();
        BurstReactionColorPalette dark = getDark();
        return "ThemedBurstReactionColorPalette(light=" + light + ", dark=" + dark + ")";
    }

    public ThemedBurstReactionColorPalette(BurstReactionColorPalette light, BurstReactionColorPalette dark) {
        q.g(light, "light");
        q.g(dark, "dark");
        this.light = light;
        this.dark = dark;
    }

    @Override 
    public BurstReactionColorPalette getDark() {
        return this.dark;
    }

    @Override 
    public BurstReactionColorPalette getLight() {
        return this.light;
    }
}
