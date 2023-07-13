package com.discord.chat.bridge.botuikit;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import pi.f;
import si.a2;
import si.n1;

@f
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002'(BI\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB;\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J!\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&HÇ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012¨\u0006)"}, d2 = {"Lcom/discord/chat/bridge/botuikit/ComponentEmoji;", "", "seen1", "", "id", "", ZeroconfModule.KEY_SERVICE_NAME, "src", "animated", "", "surrogates", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getAnimated", "()Z", "getId", "()Ljava/lang/String;", "getName", "getSrc", "getSurrogates", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class ComponentEmoji {
    public static final Companion Companion = new Companion(null);
    private final boolean animated;

    
    private final String f6880id;
    private final String name;
    private final String src;
    private final String surrogates;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/botuikit/ComponentEmoji$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/botuikit/ComponentEmoji;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ComponentEmoji> serializer() {
            return ComponentEmoji$$serializer.INSTANCE;
        }
    }

    public  ComponentEmoji(int i10, String str, String str2, String str3, boolean z10, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i10 & 2)) {
            n1.b(i10, 2, ComponentEmoji$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.f6880id = null;
        } else {
            this.f6880id = str;
        }
        this.name = str2;
        if ((i10 & 4) == 0) {
            this.src = null;
        } else {
            this.src = str3;
        }
        if ((i10 & 8) == 0) {
            this.animated = false;
        } else {
            this.animated = z10;
        }
        if ((i10 & 16) == 0) {
            this.surrogates = null;
        } else {
            this.surrogates = str4;
        }
    }

    public static  ComponentEmoji copy$default(ComponentEmoji componentEmoji, String str, String str2, String str3, boolean z10, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = componentEmoji.f6880id;
        }
        if ((i10 & 2) != 0) {
            str2 = componentEmoji.name;
        }
        if ((i10 & 4) != 0) {
            str3 = componentEmoji.src;
        }
        if ((i10 & 8) != 0) {
            z10 = componentEmoji.animated;
        }
        if ((i10 & 16) != 0) {
            str4 = componentEmoji.surrogates;
        }
        return componentEmoji.copy(str, str2, str3, z10, str4);
    }

    public static final void write$Self(ComponentEmoji self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        boolean z11;
        boolean z12;
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        boolean z13 = false;
        if (!output.w(serialDesc, 0) && self.f6880id == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            output.z(serialDesc, 0, a2.f26230a, self.f6880id);
        }
        output.s(serialDesc, 1, self.name);
        if (!output.w(serialDesc, 2) && self.src == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            output.z(serialDesc, 2, a2.f26230a, self.src);
        }
        if (!output.w(serialDesc, 3) && !self.animated) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z12) {
            output.r(serialDesc, 3, self.animated);
        }
        if (output.w(serialDesc, 4) || self.surrogates != null) {
            z13 = true;
        }
        if (z13) {
            output.z(serialDesc, 4, a2.f26230a, self.surrogates);
        }
    }

    public final String component1() {
        return this.f6880id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.src;
    }

    public final boolean component4() {
        return this.animated;
    }

    public final String component5() {
        return this.surrogates;
    }

    public final ComponentEmoji copy(String str, String name, String str2, boolean z10, String str3) {
        q.g(name, "name");
        return new ComponentEmoji(str, name, str2, z10, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComponentEmoji)) {
            return false;
        }
        ComponentEmoji componentEmoji = (ComponentEmoji) obj;
        return q.b(this.f6880id, componentEmoji.f6880id) && q.b(this.name, componentEmoji.name) && q.b(this.src, componentEmoji.src) && this.animated == componentEmoji.animated && q.b(this.surrogates, componentEmoji.surrogates);
    }

    public final boolean getAnimated() {
        return this.animated;
    }

    public final String getId() {
        return this.f6880id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSrc() {
        return this.src;
    }

    public final String getSurrogates() {
        return this.surrogates;
    }

    public int hashCode() {
        String str = this.f6880id;
        int i10 = 0;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.name.hashCode()) * 31;
        String str2 = this.src;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z10 = this.animated;
        if (z10) {
            z10 = true;
        }
        int i11 = z10 ? 1 : 0;
        int i12 = z10 ? 1 : 0;
        int i13 = z10 ? 1 : 0;
        int i14 = (hashCode2 + i11) * 31;
        String str3 = this.surrogates;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return i14 + i10;
    }

    public String toString() {
        String str = this.f6880id;
        String str2 = this.name;
        String str3 = this.src;
        boolean z10 = this.animated;
        String str4 = this.surrogates;
        return "ComponentEmoji(id=" + str + ", name=" + str2 + ", src=" + str3 + ", animated=" + z10 + ", surrogates=" + str4 + ")";
    }

    public ComponentEmoji(String str, String name, String str2, boolean z10, String str3) {
        q.g(name, "name");
        this.f6880id = str;
        this.name = name;
        this.src = str2;
        this.animated = z10;
        this.surrogates = str3;
    }

    public  ComponentEmoji(String str, String str2, String str3, boolean z10, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? null : str4);
    }
}
