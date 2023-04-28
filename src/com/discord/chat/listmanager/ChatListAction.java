package com.discord.chat.listmanager;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, m15073d2 = {"Lcom/discord/chat/listmanager/ChatListAction;", "", "()V", "Clear", "Noop", "ScrollTo", "StickToBottomIfAtBottom", "Lcom/discord/chat/listmanager/ChatListAction$Clear;", "Lcom/discord/chat/listmanager/ChatListAction$Noop;", "Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;", "Lcom/discord/chat/listmanager/ChatListAction$StickToBottomIfAtBottom;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public abstract class ChatListAction {

    @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m15073d2 = {"Lcom/discord/chat/listmanager/ChatListAction$Clear;", "Lcom/discord/chat/listmanager/ChatListAction;", "()V", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Clear extends ChatListAction {
        public static final Clear INSTANCE = new Clear();

        private Clear() {
            super(null);
        }
    }

    @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m15073d2 = {"Lcom/discord/chat/listmanager/ChatListAction$Noop;", "Lcom/discord/chat/listmanager/ChatListAction;", "()V", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Noop extends ChatListAction {
        public static final Noop INSTANCE = new Noop();

        private Noop() {
            super(null);
        }
    }

    @Metadata(m15074d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m15073d2 = {"Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;", "Lcom/discord/chat/listmanager/ChatListAction;", ViewProps.POSITION, "", "animated", "", "jumped", "isHighlight", "(IZZZ)V", "getAnimated", "()Z", "getJumped", "getPosition", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "toString", "", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class ScrollTo extends ChatListAction {
        private final boolean animated;
        private final boolean isHighlight;
        private final boolean jumped;
        private final int position;

        public /* synthetic */ ScrollTo(int i, boolean z, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? false : z3);
        }

        public static /* synthetic */ ScrollTo copy$default(ScrollTo scrollTo, int i, boolean z, boolean z2, boolean z3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = scrollTo.position;
            }
            if ((i2 & 2) != 0) {
                z = scrollTo.animated;
            }
            if ((i2 & 4) != 0) {
                z2 = scrollTo.jumped;
            }
            if ((i2 & 8) != 0) {
                z3 = scrollTo.isHighlight;
            }
            return scrollTo.copy(i, z, z2, z3);
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

        public final ScrollTo copy(int i, boolean z, boolean z2, boolean z3) {
            return new ScrollTo(i, z, z2, z3);
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
            int i = this.position * 31;
            boolean z = this.animated;
            int i2 = 1;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = (i + i3) * 31;
            boolean z2 = this.jumped;
            if (z2) {
                z2 = true;
            }
            int i7 = z2 ? 1 : 0;
            int i8 = z2 ? 1 : 0;
            int i9 = z2 ? 1 : 0;
            int i10 = (i6 + i7) * 31;
            boolean z3 = this.isHighlight;
            if (!z3) {
                i2 = z3 ? 1 : 0;
            }
            return i10 + i2;
        }

        public final boolean isHighlight() {
            return this.isHighlight;
        }

        public String toString() {
            int i = this.position;
            boolean z = this.animated;
            boolean z2 = this.jumped;
            boolean z3 = this.isHighlight;
            return "ScrollTo(position=" + i + ", animated=" + z + ", jumped=" + z2 + ", isHighlight=" + z3 + ")";
        }

        public ScrollTo(int i, boolean z, boolean z2, boolean z3) {
            super(null);
            this.position = i;
            this.animated = z;
            this.jumped = z2;
            this.isHighlight = z3;
        }
    }

    @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m15073d2 = {"Lcom/discord/chat/listmanager/ChatListAction$StickToBottomIfAtBottom;", "Lcom/discord/chat/listmanager/ChatListAction;", "()V", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
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
