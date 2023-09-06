package com.discord.safearea.react.events;

import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import ui.f;
import xi.n1;

@f
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0002()BA\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB-\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\rJ\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001J!\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'HÇ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006*"}, d2 = {"Lcom/discord/safearea/react/events/OnSafeAreaInsetsDidChangeData;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", ViewProps.TOP, "", ViewProps.BOTTOM, ViewProps.LEFT, ViewProps.RIGHT, "imeInsetsBottom", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IFFFFFLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(FFFFF)V", "getBottom", "()F", "getImeInsetsBottom", "getLeft", "getRight", "getTop", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "safe_area_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class OnSafeAreaInsetsDidChangeData implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final float bottom;
    private final float imeInsetsBottom;
    private final float left;
    private final float right;
    private final float top;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/safearea/react/events/OnSafeAreaInsetsDidChangeData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/safearea/react/events/OnSafeAreaInsetsDidChangeData;", "safe_area_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OnSafeAreaInsetsDidChangeData> serializer() {
            return OnSafeAreaInsetsDidChangeData$$serializer.INSTANCE;
        }
    }

    public OnSafeAreaInsetsDidChangeData(float f10, float f11, float f12, float f13, float f14) {
        this.top = f10;
        this.bottom = f11;
        this.left = f12;
        this.right = f13;
        this.imeInsetsBottom = f14;
    }

    public static  OnSafeAreaInsetsDidChangeData copy$default(OnSafeAreaInsetsDidChangeData onSafeAreaInsetsDidChangeData, float f10, float f11, float f12, float f13, float f14, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = onSafeAreaInsetsDidChangeData.top;
        }
        if ((i10 & 2) != 0) {
            f11 = onSafeAreaInsetsDidChangeData.bottom;
        }
        if ((i10 & 4) != 0) {
            f12 = onSafeAreaInsetsDidChangeData.left;
        }
        if ((i10 & 8) != 0) {
            f13 = onSafeAreaInsetsDidChangeData.right;
        }
        if ((i10 & 16) != 0) {
            f14 = onSafeAreaInsetsDidChangeData.imeInsetsBottom;
        }
        return onSafeAreaInsetsDidChangeData.copy(f10, f11, f12, f13, f14);
    }

    public static final void write$Self(OnSafeAreaInsetsDidChangeData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.h(self, "self");
        q.h(output, "output");
        q.h(serialDesc, "serialDesc");
        output.s(serialDesc, 0, self.top);
        output.s(serialDesc, 1, self.bottom);
        output.s(serialDesc, 2, self.left);
        output.s(serialDesc, 3, self.right);
        output.s(serialDesc, 4, self.imeInsetsBottom);
    }

    public final float component1() {
        return this.top;
    }

    public final float component2() {
        return this.bottom;
    }

    public final float component3() {
        return this.left;
    }

    public final float component4() {
        return this.right;
    }

    public final float component5() {
        return this.imeInsetsBottom;
    }

    public final OnSafeAreaInsetsDidChangeData copy(float f10, float f11, float f12, float f13, float f14) {
        return new OnSafeAreaInsetsDidChangeData(f10, f11, f12, f13, f14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnSafeAreaInsetsDidChangeData)) {
            return false;
        }
        OnSafeAreaInsetsDidChangeData onSafeAreaInsetsDidChangeData = (OnSafeAreaInsetsDidChangeData) obj;
        return Float.compare(this.top, onSafeAreaInsetsDidChangeData.top) == 0 && Float.compare(this.bottom, onSafeAreaInsetsDidChangeData.bottom) == 0 && Float.compare(this.left, onSafeAreaInsetsDidChangeData.left) == 0 && Float.compare(this.right, onSafeAreaInsetsDidChangeData.right) == 0 && Float.compare(this.imeInsetsBottom, onSafeAreaInsetsDidChangeData.imeInsetsBottom) == 0;
    }

    public final float getBottom() {
        return this.bottom;
    }

    public final float getImeInsetsBottom() {
        return this.imeInsetsBottom;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getTop() {
        return this.top;
    }

    public int hashCode() {
        return (((((((Float.floatToIntBits(this.top) * 31) + Float.floatToIntBits(this.bottom)) * 31) + Float.floatToIntBits(this.left)) * 31) + Float.floatToIntBits(this.right)) * 31) + Float.floatToIntBits(this.imeInsetsBottom);
    }

    @Override 
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public String toString() {
        float f10 = this.top;
        float f11 = this.bottom;
        float f12 = this.left;
        float f13 = this.right;
        float f14 = this.imeInsetsBottom;
        return "OnSafeAreaInsetsDidChangeData(top=" + f10 + ", bottom=" + f11 + ", left=" + f12 + ", right=" + f13 + ", imeInsetsBottom=" + f14 + ")";
    }

    public  OnSafeAreaInsetsDidChangeData(int i10, float f10, float f11, float f12, float f13, float f14, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i10 & 31)) {
            n1.b(i10, 31, OnSafeAreaInsetsDidChangeData$$serializer.INSTANCE.getDescriptor());
        }
        this.top = f10;
        this.bottom = f11;
        this.left = f12;
        this.right = f13;
        this.imeInsetsBottom = f14;
    }
}
