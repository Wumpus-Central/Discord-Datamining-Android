package com.discord.chat.listmanager;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/discord/chat/listmanager/ChatListAction;", "", "()V", "Clear", "Noop", "ScrollTo", "StickToBottomIfAtBottom", "Lcom/discord/chat/listmanager/ChatListAction$Clear;", "Lcom/discord/chat/listmanager/ChatListAction$Noop;", "Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;", "Lcom/discord/chat/listmanager/ChatListAction$StickToBottomIfAtBottom;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class ChatListAction {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/discord/chat/listmanager/ChatListAction$Clear;", "Lcom/discord/chat/listmanager/ChatListAction;", "()V", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Clear extends ChatListAction {
        public static final Clear INSTANCE = new Clear();

        private Clear() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/discord/chat/listmanager/ChatListAction$Noop;", "Lcom/discord/chat/listmanager/ChatListAction;", "()V", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Noop extends ChatListAction {
        public static final Noop INSTANCE = new Noop();

        private Noop() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;", "Lcom/discord/chat/listmanager/ChatListAction;", ViewProps.POSITION, "", "animated", "", "jumped", "isHighlight", "(IZZZ)V", "getAnimated", "()Z", "getJumped", "getPosition", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "toString", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class ScrollTo extends ChatListAction {
        private final boolean animated;
        private final boolean isHighlight;
        private final boolean jumped;
        private final int position;

        public /* synthetic */ ScrollTo(int i10, boolean z10, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, (i11 & 2) != 0 ? false : z10, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? false : z12);
        }

        public static /* synthetic */ ScrollTo copy$default(ScrollTo scrollTo, int i10, boolean z10, boolean z11, boolean z12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = scrollTo.position;
            }
            if ((i11 & 2) != 0) {
                z10 = scrollTo.animated;
            }
            if ((i11 & 4) != 0) {
                z11 = scrollTo.jumped;
            }
            if ((i11 & 8) != 0) {
                z12 = scrollTo.isHighlight;
            }
            return scrollTo.copy(i10, z10, z11, z12);
        }

        public final int component1() {
            return this.position;
        }

        public final boolean component2() {
            return this.animated;
        }

        public final boolean component3() {
            return this.jumped;
        }

        public final boolean component4() {
            return this.isHighlight;
        }

        public final ScrollTo copy(int i10, boolean z10, boolean z11, boolean z12) {
            return new ScrollTo(i10, z10, z11, z12);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ScrollTo)) {
                return false;
            }
            ScrollTo scrollTo = (ScrollTo) obj;
            return this.position == scrollTo.position && this.animated == scrollTo.animated && this.jumped == scrollTo.jumped && this.isHighlight == scrollTo.isHighlight;
        }

        public final boolean getAnimated() {
            return this.animated;
        }

        public final boolean getJumped() {
            return this.jumped;
        }

        public final int getPosition() {
            return this.position;
        }

        public int hashCode() {
            int i10 = this.position * 31;
            boolean z10 = this.animated;
            int i11 = 1;
            if (z10) {
                z10 = true;
            }
            int i12 = z10 ? 1 : 0;
            int i13 = z10 ? 1 : 0;
            int i14 = z10 ? 1 : 0;
            int i15 = (i10 + i12) * 31;
            boolean z11 = this.jumped;
            if (z11) {
                z11 = true;
            }
            int i16 = z11 ? 1 : 0;
            int i17 = z11 ? 1 : 0;
            int i18 = z11 ? 1 : 0;
            int i19 = (i15 + i16) * 31;
            boolean z12 = this.isHighlight;
            if (!z12) {
                i11 = z12 ? 1 : 0;
            }
            return i19 + i11;
        }

        public final boolean isHighlight() {
            return this.isHighlight;
        }

        public String toString() {
            int i10 = this.position;
            boolean z10 = this.animated;
            boolean z11 = this.jumped;
            boolean z12 = this.isHighlight;
            return "ScrollTo(position=" + i10 + ", animated=" + z10 + ", jumped=" + z11 + ", isHighlight=" + z12 + ")";
        }

        public ScrollTo(int i10, boolean z10, boolean z11, boolean z12) {
            super(null);
            this.position = i10;
            this.animated = z10;
            this.jumped = z11;
            this.isHighlight = z12;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/discord/chat/listmanager/ChatListAction$StickToBottomIfAtBottom;", "Lcom/discord/chat/listmanager/ChatListAction;", "()V", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class StickToBottomIfAtBottom extends ChatListAction {
        public static final StickToBottomIfAtBottom INSTANCE = new StickToBottomIfAtBottom();

        private StickToBottomIfAtBottom() {
            super(null);
        }
    }

    private ChatListAction() {
    }

    public /* synthetic */ ChatListAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
