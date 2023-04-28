package com.discord.chat.presentation.message.decorations;

import android.content.Context;
import com.discord.chat.bridge.BackgroundHighlight;
import com.discord.chat.presentation.list.item.ChatListItem;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9679s;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m15073d2 = {"Lcom/discord/chat/presentation/message/decorations/BackgroundHighlightDrawer;", "Lcom/discord/chat/presentation/message/decorations/HighlightedMessageDrawer;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class BackgroundHighlightDrawer extends HighlightedMessageDrawer {

    @Metadata(m15074d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m15073d2 = {"<anonymous>", "", "it", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "invoke", "(Lcom/discord/chat/presentation/list/item/ChatListItem;)Ljava/lang/Integer;"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: com.discord.chat.presentation.message.decorations.BackgroundHighlightDrawer$1 */
    /* loaded from: classes4.dex */
    static final class C32091 extends AbstractC9679s implements Function1<ChatListItem, Integer> {
        public static final C32091 INSTANCE = new C32091();

        C32091() {
            super(1);
        }

        public final Integer invoke(ChatListItem it) {
            BackgroundHighlight backgroundHighlight;
            C9677q.m14633g(it, "it");
            backgroundHighlight = BackgroundHighlightDecorationKt.getBackgroundHighlight(it);
            if (backgroundHighlight != null) {
                return backgroundHighlight.getBackgroundColor();
            }
            return null;
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m15073d2 = {"<anonymous>", "", "it", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "invoke", "(Lcom/discord/chat/presentation/list/item/ChatListItem;)Ljava/lang/Integer;"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: com.discord.chat.presentation.message.decorations.BackgroundHighlightDrawer$2 */
    /* loaded from: classes4.dex */
    static final class C32102 extends AbstractC9679s implements Function1<ChatListItem, Integer> {
        public static final C32102 INSTANCE = new C32102();

        C32102() {
            super(1);
        }

        public final Integer invoke(ChatListItem it) {
            BackgroundHighlight backgroundHighlight;
            C9677q.m14633g(it, "it");
            backgroundHighlight = BackgroundHighlightDecorationKt.getBackgroundHighlight(it);
            if (backgroundHighlight != null) {
                return backgroundHighlight.getGutterColor();
            }
            return null;
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m15073d2 = {"<anonymous>", "", "it", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "invoke", "(Lcom/discord/chat/presentation/list/item/ChatListItem;)Ljava/lang/Boolean;"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: com.discord.chat.presentation.message.decorations.BackgroundHighlightDrawer$3 */
    /* loaded from: classes4.dex */
    static final class C32113 extends AbstractC9679s implements Function1<ChatListItem, Boolean> {
        public static final C32113 INSTANCE = new C32113();

        C32113() {
            super(1);
        }

        public final Boolean invoke(ChatListItem it) {
            BackgroundHighlight backgroundHighlight;
            C9677q.m14633g(it, "it");
            backgroundHighlight = BackgroundHighlightDecorationKt.getBackgroundHighlight(it);
            return Boolean.valueOf(backgroundHighlight != null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundHighlightDrawer(Context context) {
        super(context, C32091.INSTANCE, C32102.INSTANCE, C32113.INSTANCE);
        C9677q.m14633g(context, "context");
    }
}
