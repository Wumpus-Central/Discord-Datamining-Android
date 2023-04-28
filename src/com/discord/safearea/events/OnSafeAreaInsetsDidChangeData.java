package com.discord.safearea.events;

import bj.C3681n1;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p449yi.AbstractC14435f;

@AbstractC14435f
@Metadata(m15074d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0002()BA\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB-\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\rJ\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001J!\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'HÇ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006*"}, m15073d2 = {"Lcom/discord/safearea/events/OnSafeAreaInsetsDidChangeData;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", ViewProps.TOP, "", ViewProps.BOTTOM, ViewProps.LEFT, ViewProps.RIGHT, "imeInsetsBottom", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IFFFFFLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(FFFFF)V", "getBottom", "()F", "getImeInsetsBottom", "getLeft", "getRight", "getTop", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "safe_area_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes6.dex */
public final class OnSafeAreaInsetsDidChangeData implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final float bottom;
    private final float imeInsetsBottom;
    private final float left;
    private final float right;
    private final float top;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/safearea/events/OnSafeAreaInsetsDidChangeData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/safearea/events/OnSafeAreaInsetsDidChangeData;", "safe_area_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OnSafeAreaInsetsDidChangeData> serializer() {
            return OnSafeAreaInsetsDidChangeData$$serializer.INSTANCE;
        }
    }

    public OnSafeAreaInsetsDidChangeData(float f, float f2, float f3, float f4, float f5) {
        this.top = f;
        this.bottom = f2;
        this.left = f3;
        this.right = f4;
        this.imeInsetsBottom = f5;
    }

    public static /* synthetic */ OnSafeAreaInsetsDidChangeData copy$default(OnSafeAreaInsetsDidChangeData onSafeAreaInsetsDidChangeData, float f, float f2, float f3, float f4, float f5, int i, Object obj) {
        if ((i & 1) != 0) {
            f = onSafeAreaInsetsDidChangeData.top;
        }
        if ((i & 2) != 0) {
            f2 = onSafeAreaInsetsDidChangeData.bottom;
        }
        if ((i & 4) != 0) {
            f3 = onSafeAreaInsetsDidChangeData.left;
        }
        if ((i & 8) != 0) {
            f4 = onSafeAreaInsetsDidChangeData.right;
        }
        if ((i & 16) != 0) {
            f5 = onSafeAreaInsetsDidChangeData.imeInsetsBottom;
        }
        return onSafeAreaInsetsDidChangeData.copy(f, f2, f3, f4, f5);
    }

    public static final void write$Self(OnSafeAreaInsetsDidChangeData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9971q.m14633g(self, "self");
        C9971q.m14633g(output, "output");
        C9971q.m14633g(serialDesc, "serialDesc");
        output.mo13871s(serialDesc, 0, self.top);
        output.mo13871s(serialDesc, 1, self.bottom);
        output.mo13871s(serialDesc, 2, self.left);
        output.mo13871s(serialDesc, 3, self.right);
        output.mo13871s(serialDesc, 4, self.imeInsetsBottom);
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

    public final OnSafeAreaInsetsDidChangeData copy(float f, float f2, float f3, float f4, float f5) {
        return new OnSafeAreaInsetsDidChangeData(f, f2, f3, f4, f5);
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

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public String toString() {
        float f = this.top;
        float f2 = this.bottom;
        float f3 = this.left;
        float f4 = this.right;
        float f5 = this.imeInsetsBottom;
        return "OnSafeAreaInsetsDidChangeData(top=" + f + ", bottom=" + f2 + ", left=" + f3 + ", right=" + f4 + ", imeInsetsBottom=" + f5 + ")";
    }

    public /* synthetic */ OnSafeAreaInsetsDidChangeData(int i, float f, float f2, float f3, float f4, float f5, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            C3681n1.m33818b(i, 31, OnSafeAreaInsetsDidChangeData$$serializer.INSTANCE.getDescriptor());
        }
        this.top = f;
        this.bottom = f2;
        this.left = f3;
        this.right = f4;
        this.imeInsetsBottom = f5;
    }
}
