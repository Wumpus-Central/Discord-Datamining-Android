package com.discord.chat.presentation.message.decorations;

import android.content.Context;
import com.discord.chat.bridge.BackgroundHighlight;
import com.discord.chat.presentation.list.item.ChatListItem;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/discord/chat/presentation/message/decorations/BackgroundHighlightDrawer;", "Lcom/discord/chat/presentation/message/decorations/HighlightedMessageDrawer;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BackgroundHighlightDrawer extends HighlightedMessageDrawer {

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "invoke", "(Lcom/discord/chat/presentation/list/item/ChatListItem;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.discord.chat.presentation.message.decorations.BackgroundHighlightDrawer$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    static final class AnonymousClass1 extends s implements Function1<ChatListItem, Integer> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        public final Integer invoke(ChatListItem it) {
            BackgroundHighlight backgroundHighlight;
            q.g(it, "it");
            backgroundHighlight = BackgroundHighlightDecorationKt.getBackgroundHighlight(it);
            if (backgroundHighlight != null) {
                return backgroundHighlight.getBackgroundColor();
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "invoke", "(Lcom/discord/chat/presentation/list/item/ChatListItem;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.discord.chat.presentation.message.decorations.BackgroundHighlightDrawer$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    static final class AnonymousClass2 extends s implements Function1<ChatListItem, Integer> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(1);
        }

        public final Integer invoke(ChatListItem it) {
            BackgroundHighlight backgroundHighlight;
            q.g(it, "it");
            backgroundHighlight = BackgroundHighlightDecorationKt.getBackgroundHighlight(it);
            if (backgroundHighlight != null) {
                return backgroundHighlight.getGutterColor();
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "invoke", "(Lcom/discord/chat/presentation/list/item/ChatListItem;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.discord.chat.presentation.message.decorations.BackgroundHighlightDrawer$3  reason: invalid class name */
    /* loaded from: classes4.dex */
    static final class AnonymousClass3 extends s implements Function1<ChatListItem, Boolean> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        AnonymousClass3() {
            super(1);
        }

        public final Boolean invoke(ChatListItem it) {
            BackgroundHighlight backgroundHighlight;
            q.g(it, "it");
            backgroundHighlight = BackgroundHighlightDecorationKt.getBackgroundHighlight(it);
            return Boolean.valueOf(backgroundHighlight != null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundHighlightDrawer(Context context) {
        super(context, AnonymousClass1.INSTANCE, AnonymousClass2.INSTANCE, AnonymousClass3.INSTANCE);
        q.g(context, "context");
    }
}
