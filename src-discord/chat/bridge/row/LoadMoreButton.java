package com.discord.chat.bridge.row;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import ti.f;
import wi.m0;
import wi.n1;

@f
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002,-BI\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB5\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014JD\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020\u0007HÖ\u0001J!\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+HÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006."}, d2 = {"Lcom/discord/chat/bridge/row/LoadMoreButton;", "", "seen1", "", "action", "Lcom/discord/chat/bridge/row/LoadingAction;", "text", "", ViewProps.BACKGROUND_COLOR, "cornerRadius", ViewProps.COLOR, "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/chat/bridge/row/LoadingAction;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/discord/chat/bridge/row/LoadingAction;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;)V", "getAction", "()Lcom/discord/chat/bridge/row/LoadingAction;", "getBackgroundColor", "()I", "getColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCornerRadius", "getText", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "(Lcom/discord/chat/bridge/row/LoadingAction;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;)Lcom/discord/chat/bridge/row/LoadMoreButton;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class LoadMoreButton {
    public static final Companion Companion = new Companion(null);
    private final LoadingAction action;
    private final int backgroundColor;
    private final Integer color;
    private final Integer cornerRadius;
    private final String text;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/row/LoadMoreButton$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/row/LoadMoreButton;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LoadMoreButton> serializer() {
            return LoadMoreButton$$serializer.INSTANCE;
        }
    }

    public  LoadMoreButton(int i10, LoadingAction loadingAction, String str, int i11, Integer num, Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i10 & 7)) {
            n1.b(i10, 7, LoadMoreButton$$serializer.INSTANCE.getDescriptor());
        }
        this.action = loadingAction;
        this.text = str;
        this.backgroundColor = i11;
        if ((i10 & 8) == 0) {
            this.cornerRadius = null;
        } else {
            this.cornerRadius = num;
        }
        if ((i10 & 16) == 0) {
            this.color = null;
        } else {
            this.color = num2;
        }
    }

    public static  LoadMoreButton copy$default(LoadMoreButton loadMoreButton, LoadingAction loadingAction, String str, int i10, Integer num, Integer num2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            loadingAction = loadMoreButton.action;
        }
        if ((i11 & 2) != 0) {
            str = loadMoreButton.text;
        }
        if ((i11 & 4) != 0) {
            i10 = loadMoreButton.backgroundColor;
        }
        if ((i11 & 8) != 0) {
            num = loadMoreButton.cornerRadius;
        }
        if ((i11 & 16) != 0) {
            num2 = loadMoreButton.color;
        }
        return loadMoreButton.copy(loadingAction, str, i10, num, num2);
    }

    public static final void write$Self(LoadMoreButton self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        q.h(self, "self");
        q.h(output, "output");
        q.h(serialDesc, "serialDesc");
        boolean z11 = false;
        output.o(serialDesc, 0, LoadingAction$$serializer.INSTANCE, self.action);
        output.x(serialDesc, 1, self.text);
        output.v(serialDesc, 2, self.backgroundColor);
        if (!output.z(serialDesc, 3) && self.cornerRadius == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            output.B(serialDesc, 3, m0.f29833a, self.cornerRadius);
        }
        if (output.z(serialDesc, 4) || self.color != null) {
            z11 = true;
        }
        if (z11) {
            output.B(serialDesc, 4, m0.f29833a, self.color);
        }
    }

    public final LoadingAction component1() {
        return this.action;
    }

    public final String component2() {
        return this.text;
    }

    public final int component3() {
        return this.backgroundColor;
    }

    public final Integer component4() {
        return this.cornerRadius;
    }

    public final Integer component5() {
        return this.color;
    }

    public final LoadMoreButton copy(LoadingAction action, String text, int i10, Integer num, Integer num2) {
        q.h(action, "action");
        q.h(text, "text");
        return new LoadMoreButton(action, text, i10, num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadMoreButton)) {
            return false;
        }
        LoadMoreButton loadMoreButton = (LoadMoreButton) obj;
        return q.c(this.action, loadMoreButton.action) && q.c(this.text, loadMoreButton.text) && this.backgroundColor == loadMoreButton.backgroundColor && q.c(this.cornerRadius, loadMoreButton.cornerRadius) && q.c(this.color, loadMoreButton.color);
    }

    public final LoadingAction getAction() {
        return this.action;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Integer getColor() {
        return this.color;
    }

    public final Integer getCornerRadius() {
        return this.cornerRadius;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = ((((this.action.hashCode() * 31) + this.text.hashCode()) * 31) + this.backgroundColor) * 31;
        Integer num = this.cornerRadius;
        int i10 = 0;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.color;
        if (num2 != null) {
            i10 = num2.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        LoadingAction loadingAction = this.action;
        String str = this.text;
        int i10 = this.backgroundColor;
        Integer num = this.cornerRadius;
        Integer num2 = this.color;
        return "LoadMoreButton(action=" + loadingAction + ", text=" + str + ", backgroundColor=" + i10 + ", cornerRadius=" + num + ", color=" + num2 + ")";
    }

    public LoadMoreButton(LoadingAction action, String text, int i10, Integer num, Integer num2) {
        q.h(action, "action");
        q.h(text, "text");
        this.action = action;
        this.text = text;
        this.backgroundColor = i10;
        this.cornerRadius = num;
        this.color = num2;
    }

    public  LoadMoreButton(LoadingAction loadingAction, String str, int i10, Integer num, Integer num2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(loadingAction, str, i10, (i11 & 8) != 0 ? null : num, (i11 & 16) != 0 ? null : num2);
    }
}
