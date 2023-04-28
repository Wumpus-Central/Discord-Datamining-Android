package com.discord.span.utilities.common;

import bj.C2560n1;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p450yi.AbstractC14370f;

@AbstractC14370f
@Metadata(m15074d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J!\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cHÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u001f"}, m15073d2 = {"Lcom/discord/span/utilities/common/BackgroundStyle;", "", "seen1", "", ViewProps.BACKGROUND_COLOR, "cornerRadius", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(II)V", "getBackgroundColor", "()I", "getCornerRadius", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "span_utilities_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes7.dex */
public final class BackgroundStyle {
    public static final Companion Companion = new Companion(null);
    private final int backgroundColor;
    private final int cornerRadius;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/span/utilities/common/BackgroundStyle$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/span/utilities/common/BackgroundStyle;", "span_utilities_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BackgroundStyle> serializer() {
            return BackgroundStyle$$serializer.INSTANCE;
        }
    }

    public BackgroundStyle(int i, int i2) {
        this.backgroundColor = i;
        this.cornerRadius = i2;
    }

    public static /* synthetic */ BackgroundStyle copy$default(BackgroundStyle backgroundStyle, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = backgroundStyle.backgroundColor;
        }
        if ((i3 & 2) != 0) {
            i2 = backgroundStyle.cornerRadius;
        }
        return backgroundStyle.copy(i, i2);
    }

    public static final void write$Self(BackgroundStyle self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9677q.m14633g(self, "self");
        C9677q.m14633g(output, "output");
        C9677q.m14633g(serialDesc, "serialDesc");
        output.mo13866x(serialDesc, 0, self.backgroundColor);
        output.mo13866x(serialDesc, 1, self.cornerRadius);
    }

    public final int component1() {
        return this.backgroundColor;
    }

    public final int component2() {
        return this.cornerRadius;
    }

    public final BackgroundStyle copy(int i, int i2) {
        return new BackgroundStyle(i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BackgroundStyle)) {
            return false;
        }
        BackgroundStyle backgroundStyle = (BackgroundStyle) obj;
        return this.backgroundColor == backgroundStyle.backgroundColor && this.cornerRadius == backgroundStyle.cornerRadius;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getCornerRadius() {
        return this.cornerRadius;
    }

    public int hashCode() {
        return (this.backgroundColor * 31) + this.cornerRadius;
    }

    public String toString() {
        int i = this.backgroundColor;
        int i2 = this.cornerRadius;
        return "BackgroundStyle(backgroundColor=" + i + ", cornerRadius=" + i2 + ")";
    }

    public /* synthetic */ BackgroundStyle(int i, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            C2560n1.m33818b(i, 3, BackgroundStyle$$serializer.INSTANCE.getDescriptor());
        }
        this.backgroundColor = i2;
        this.cornerRadius = i3;
    }
}
