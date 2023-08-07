package com.discord.chat.reactevents;

import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import ti.f;
import wi.n1;

@f
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 12\u00020\u0001:\u000201Ba\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010BM\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003Jc\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001J!\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/HÇ\u0001R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0013R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013¨\u00062"}, d2 = {"Lcom/discord/chat/reactevents/ChatScrollPositionEvent;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "isAtBottom", "", "isNearBottom", "isNearTop", "dragging", "decelerating", "shouldShowJumpToPresent", "isFirstMessageVisible", "firstVisibleMessageIndex", "lastVisibleMessageIndex", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZZZZZZZIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ZZZZZZZII)V", "getDecelerating", "()Z", "getDragging", "getFirstVisibleMessageIndex", "()I", "getLastVisibleMessageIndex", "getShouldShowJumpToPresent", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class ChatScrollPositionEvent implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final boolean decelerating;
    private final boolean dragging;
    private final int firstVisibleMessageIndex;
    private final boolean isAtBottom;
    private final boolean isFirstMessageVisible;
    private final boolean isNearBottom;
    private final boolean isNearTop;
    private final int lastVisibleMessageIndex;
    private final boolean shouldShowJumpToPresent;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/reactevents/ChatScrollPositionEvent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/reactevents/ChatScrollPositionEvent;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ChatScrollPositionEvent> serializer() {
            return ChatScrollPositionEvent$$serializer.INSTANCE;
        }
    }

    public  ChatScrollPositionEvent(int i10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, int i11, int i12, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i10 & 511)) {
            n1.b(i10, 511, ChatScrollPositionEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.isAtBottom = z10;
        this.isNearBottom = z11;
        this.isNearTop = z12;
        this.dragging = z13;
        this.decelerating = z14;
        this.shouldShowJumpToPresent = z15;
        this.isFirstMessageVisible = z16;
        this.firstVisibleMessageIndex = i11;
        this.lastVisibleMessageIndex = i12;
    }

    public static final void write$Self(ChatScrollPositionEvent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.h(self, "self");
        q.h(output, "output");
        q.h(serialDesc, "serialDesc");
        output.r(serialDesc, 0, self.isAtBottom);
        output.r(serialDesc, 1, self.isNearBottom);
        output.r(serialDesc, 2, self.isNearTop);
        output.r(serialDesc, 3, self.dragging);
        output.r(serialDesc, 4, self.decelerating);
        output.r(serialDesc, 5, self.shouldShowJumpToPresent);
        output.r(serialDesc, 6, self.isFirstMessageVisible);
        output.q(serialDesc, 7, self.firstVisibleMessageIndex);
        output.q(serialDesc, 8, self.lastVisibleMessageIndex);
    }

    public final boolean component1() {
        return this.isAtBottom;
    }

    public final boolean component2() {
        return this.isNearBottom;
    }

    public final boolean component3() {
        return this.isNearTop;
    }

    public final boolean component4() {
        return this.dragging;
    }

    public final boolean component5() {
        return this.decelerating;
    }

    public final boolean component6() {
        return this.shouldShowJumpToPresent;
    }

    public final boolean component7() {
        return this.isFirstMessageVisible;
    }

    public final int component8() {
        return this.firstVisibleMessageIndex;
    }

    public final int component9() {
        return this.lastVisibleMessageIndex;
    }

    public final ChatScrollPositionEvent copy(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, int i10, int i11) {
        return new ChatScrollPositionEvent(z10, z11, z12, z13, z14, z15, z16, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatScrollPositionEvent)) {
            return false;
        }
        ChatScrollPositionEvent chatScrollPositionEvent = (ChatScrollPositionEvent) obj;
        return this.isAtBottom == chatScrollPositionEvent.isAtBottom && this.isNearBottom == chatScrollPositionEvent.isNearBottom && this.isNearTop == chatScrollPositionEvent.isNearTop && this.dragging == chatScrollPositionEvent.dragging && this.decelerating == chatScrollPositionEvent.decelerating && this.shouldShowJumpToPresent == chatScrollPositionEvent.shouldShowJumpToPresent && this.isFirstMessageVisible == chatScrollPositionEvent.isFirstMessageVisible && this.firstVisibleMessageIndex == chatScrollPositionEvent.firstVisibleMessageIndex && this.lastVisibleMessageIndex == chatScrollPositionEvent.lastVisibleMessageIndex;
    }

    public final boolean getDecelerating() {
        return this.decelerating;
    }

    public final boolean getDragging() {
        return this.dragging;
    }

    public final int getFirstVisibleMessageIndex() {
        return this.firstVisibleMessageIndex;
    }

    public final int getLastVisibleMessageIndex() {
        return this.lastVisibleMessageIndex;
    }

    public final boolean getShouldShowJumpToPresent() {
        return this.shouldShowJumpToPresent;
    }

    public int hashCode() {
        boolean z10 = this.isAtBottom;
        int i10 = 1;
        if (z10) {
            z10 = true;
        }
        int i11 = z10 ? 1 : 0;
        int i12 = z10 ? 1 : 0;
        int i13 = z10 ? 1 : 0;
        int i14 = i11 * 31;
        boolean z11 = this.isNearBottom;
        if (z11) {
            z11 = true;
        }
        int i15 = z11 ? 1 : 0;
        int i16 = z11 ? 1 : 0;
        int i17 = z11 ? 1 : 0;
        int i18 = (i14 + i15) * 31;
        boolean z12 = this.isNearTop;
        if (z12) {
            z12 = true;
        }
        int i19 = z12 ? 1 : 0;
        int i20 = z12 ? 1 : 0;
        int i21 = z12 ? 1 : 0;
        int i22 = (i18 + i19) * 31;
        boolean z13 = this.dragging;
        if (z13) {
            z13 = true;
        }
        int i23 = z13 ? 1 : 0;
        int i24 = z13 ? 1 : 0;
        int i25 = z13 ? 1 : 0;
        int i26 = (i22 + i23) * 31;
        boolean z14 = this.decelerating;
        if (z14) {
            z14 = true;
        }
        int i27 = z14 ? 1 : 0;
        int i28 = z14 ? 1 : 0;
        int i29 = z14 ? 1 : 0;
        int i30 = (i26 + i27) * 31;
        boolean z15 = this.shouldShowJumpToPresent;
        if (z15) {
            z15 = true;
        }
        int i31 = z15 ? 1 : 0;
        int i32 = z15 ? 1 : 0;
        int i33 = z15 ? 1 : 0;
        int i34 = (i30 + i31) * 31;
        boolean z16 = this.isFirstMessageVisible;
        if (!z16) {
            i10 = z16 ? 1 : 0;
        }
        return ((((i34 + i10) * 31) + this.firstVisibleMessageIndex) * 31) + this.lastVisibleMessageIndex;
    }

    public final boolean isAtBottom() {
        return this.isAtBottom;
    }

    public final boolean isFirstMessageVisible() {
        return this.isFirstMessageVisible;
    }

    public final boolean isNearBottom() {
        return this.isNearBottom;
    }

    public final boolean isNearTop() {
        return this.isNearTop;
    }

    @Override 
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public String toString() {
        boolean z10 = this.isAtBottom;
        boolean z11 = this.isNearBottom;
        boolean z12 = this.isNearTop;
        boolean z13 = this.dragging;
        boolean z14 = this.decelerating;
        boolean z15 = this.shouldShowJumpToPresent;
        boolean z16 = this.isFirstMessageVisible;
        int i10 = this.firstVisibleMessageIndex;
        int i11 = this.lastVisibleMessageIndex;
        return "ChatScrollPositionEvent(isAtBottom=" + z10 + ", isNearBottom=" + z11 + ", isNearTop=" + z12 + ", dragging=" + z13 + ", decelerating=" + z14 + ", shouldShowJumpToPresent=" + z15 + ", isFirstMessageVisible=" + z16 + ", firstVisibleMessageIndex=" + i10 + ", lastVisibleMessageIndex=" + i11 + ")";
    }

    public ChatScrollPositionEvent(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, int i10, int i11) {
        this.isAtBottom = z10;
        this.isNearBottom = z11;
        this.isNearTop = z12;
        this.dragging = z13;
        this.decelerating = z14;
        this.shouldShowJumpToPresent = z15;
        this.isFirstMessageVisible = z16;
        this.firstVisibleMessageIndex = i10;
        this.lastVisibleMessageIndex = i11;
    }
}
