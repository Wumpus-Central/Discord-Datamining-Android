package com.discord.chat.reactevents;

import com.discord.chat.bridge.contentnode.CustomEmojiContentNode;
import com.discord.chat.bridge.contentnode.EmojiContentNode;
import com.discord.chat.bridge.contentnode.UnicodeEmojiContentNode;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C9971q;
import nf.C11088q;
import nf.C11098x;

@Metadata(m15074d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\b\u0010\r\u001a\u00020\u000eH\u0016J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m15073d2 = {"Lcom/discord/chat/reactevents/TapEmojiData;", "Lcom/discord/reactevents/ReactEvent;", "emoji", "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;", "(Lcom/discord/chat/bridge/contentnode/EmojiContentNode;)V", "component1", "copy", "equals", "", "other", "", "hashCode", "", "serialize", "Lcom/facebook/react/bridge/WritableMap;", "toString", "", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class TapEmojiData implements ReactEvent {
    private final EmojiContentNode emoji;

    public TapEmojiData(EmojiContentNode emoji) {
        C9971q.m14633g(emoji, "emoji");
        this.emoji = emoji;
    }

    private final EmojiContentNode component1() {
        return this.emoji;
    }

    public static /* synthetic */ TapEmojiData copy$default(TapEmojiData tapEmojiData, EmojiContentNode emojiContentNode, int i, Object obj) {
        if ((i & 1) != 0) {
            emojiContentNode = tapEmojiData.emoji;
        }
        return tapEmojiData.copy(emojiContentNode);
    }

    public final TapEmojiData copy(EmojiContentNode emoji) {
        C9971q.m14633g(emoji, "emoji");
        return new TapEmojiData(emoji);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TapEmojiData) && C9971q.m14638b(this.emoji, ((TapEmojiData) obj).emoji);
    }

    public int hashCode() {
        return this.emoji.hashCode();
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        WritableNativeMap writableNativeMap;
        Pair[] pairArr = new Pair[1];
        EmojiContentNode emojiContentNode = this.emoji;
        if (emojiContentNode instanceof UnicodeEmojiContentNode) {
            writableNativeMap = NativeMapExtensionsKt.nativeMapOf(C11098x.m10921a("surrogate", ((UnicodeEmojiContentNode) emojiContentNode).getSurrogate()), C11098x.m10921a("content", ((UnicodeEmojiContentNode) this.emoji).getContent()));
        } else if (emojiContentNode instanceof CustomEmojiContentNode) {
            writableNativeMap = NativeMapExtensionsKt.nativeMapOf(C11098x.m10921a("id", String.valueOf(((CustomEmojiContentNode) emojiContentNode).getId())), C11098x.m10921a("alt", ((CustomEmojiContentNode) this.emoji).getAlt()), C11098x.m10921a("src", ((CustomEmojiContentNode) this.emoji).getSrc()));
        } else {
            throw new C11088q();
        }
        pairArr[0] = C11098x.m10921a("node", writableNativeMap);
        return NativeMapExtensionsKt.nativeMapOf(pairArr);
    }

    public String toString() {
        EmojiContentNode emojiContentNode = this.emoji;
        return "TapEmojiData(emoji=" + emojiContentNode + ")";
    }
}
