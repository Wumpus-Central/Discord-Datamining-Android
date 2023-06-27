package com.discord.chat.bridge;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import qi.f;
import ti.m0;
import ti.n1;

@f
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B-\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\u001d\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J!\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eHÇ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000b¨\u0006!"}, d2 = {"Lcom/discord/chat/bridge/BackgroundHighlight;", "", "seen1", "", ViewProps.BACKGROUND_COLOR, "gutterColor", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Integer;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getBackgroundColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getGutterColor", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/discord/chat/bridge/BackgroundHighlight;", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BackgroundHighlight {
    public static final Companion Companion = new Companion(null);
    private final Integer backgroundColor;
    private final Integer gutterColor;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/BackgroundHighlight$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/BackgroundHighlight;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BackgroundHighlight> serializer() {
            return BackgroundHighlight$$serializer.INSTANCE;
        }
    }

    public BackgroundHighlight() {
        this((Integer) null, (Integer) null, 3, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ BackgroundHighlight(int i10, Integer num, Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 0) != 0) {
            n1.b(i10, 0, BackgroundHighlight$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = num;
        }
        if ((i10 & 2) == 0) {
            this.gutterColor = null;
        } else {
            this.gutterColor = num2;
        }
    }

    public static /* synthetic */ BackgroundHighlight copy$default(BackgroundHighlight backgroundHighlight, Integer num, Integer num2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = backgroundHighlight.backgroundColor;
        }
        if ((i10 & 2) != 0) {
            num2 = backgroundHighlight.gutterColor;
        }
        return backgroundHighlight.copy(num, num2);
    }

    public static final void write$Self(BackgroundHighlight self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        boolean z11 = false;
        if (!output.w(serialDesc, 0) && self.backgroundColor == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            output.e(serialDesc, 0, m0.f27015a, self.backgroundColor);
        }
        if (output.w(serialDesc, 1) || self.gutterColor != null) {
            z11 = true;
        }
        if (z11) {
            output.e(serialDesc, 1, m0.f27015a, self.gutterColor);
        }
    }

    public final Integer component1() {
        return this.backgroundColor;
    }

    public final Integer component2() {
        return this.gutterColor;
    }

    public final BackgroundHighlight copy(Integer num, Integer num2) {
        return new BackgroundHighlight(num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BackgroundHighlight)) {
            return false;
        }
        BackgroundHighlight backgroundHighlight = (BackgroundHighlight) obj;
        return q.b(this.backgroundColor, backgroundHighlight.backgroundColor) && q.b(this.gutterColor, backgroundHighlight.gutterColor);
    }

    public final Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Integer getGutterColor() {
        return this.gutterColor;
    }

    public int hashCode() {
        Integer num = this.backgroundColor;
        int i10 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.gutterColor;
        if (num2 != null) {
            i10 = num2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        Integer num = this.backgroundColor;
        Integer num2 = this.gutterColor;
        return "BackgroundHighlight(backgroundColor=" + num + ", gutterColor=" + num2 + ")";
    }

    public BackgroundHighlight(Integer num, Integer num2) {
        this.backgroundColor = num;
        this.gutterColor = num2;
    }

    public /* synthetic */ BackgroundHighlight(Integer num, Integer num2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : num2);
    }
}
