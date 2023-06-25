package com.discord.span.utilities.common;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import qi.f;
import ti.n1;

@f
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J!\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cHÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/discord/span/utilities/common/BackgroundStyle;", "", "seen1", "", ViewProps.BACKGROUND_COLOR, "cornerRadius", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(II)V", "getBackgroundColor", "()I", "getCornerRadius", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "span_utilities_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BackgroundStyle {
    public static final Companion Companion = new Companion(null);
    private final int backgroundColor;
    private final int cornerRadius;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/span/utilities/common/BackgroundStyle$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/span/utilities/common/BackgroundStyle;", "span_utilities_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
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

    public BackgroundStyle(int i10, int i11) {
        this.backgroundColor = i10;
        this.cornerRadius = i11;
    }

    public static /* synthetic */ BackgroundStyle copy$default(BackgroundStyle backgroundStyle, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = backgroundStyle.backgroundColor;
        }
        if ((i12 & 2) != 0) {
            i11 = backgroundStyle.cornerRadius;
        }
        return backgroundStyle.copy(i10, i11);
    }

    public static final void write$Self(BackgroundStyle self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        output.r(serialDesc, 0, self.backgroundColor);
        output.r(serialDesc, 1, self.cornerRadius);
    }

    public final int component1() {
        return this.backgroundColor;
    }

    public final int component2() {
        return this.cornerRadius;
    }

    public final BackgroundStyle copy(int i10, int i11) {
        return new BackgroundStyle(i10, i11);
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
        int i10 = this.backgroundColor;
        int i11 = this.cornerRadius;
        return "BackgroundStyle(backgroundColor=" + i10 + ", cornerRadius=" + i11 + ")";
    }

    public /* synthetic */ BackgroundStyle(int i10, int i11, int i12, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i10 & 3)) {
            n1.b(i10, 3, BackgroundStyle$$serializer.INSTANCE.getDescriptor());
        }
        this.backgroundColor = i11;
        this.cornerRadius = i12;
    }
}
