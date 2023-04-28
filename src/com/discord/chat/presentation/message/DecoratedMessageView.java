package com.discord.chat.presentation.message;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.messageframe.MessageFrame;
import com.discord.chat.databinding.DecoratedMessageViewBinding;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.list.item.MessageItem;
import com.discord.chat.presentation.message.MessageView;
import com.discord.chat.presentation.message.decorations.BackgroundHighlightDrawer;
import com.discord.chat.presentation.message.decorations.HighlightedMessageDrawer;
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider;
import com.discord.chat.presentation.root.MessageContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163j$.util.Spliterator;

@Metadata(m15074d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014Jf\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\n2\b\b\u0002\u0010 \u001a\u00020\n2\b\b\u0002\u0010!\u001a\u00020\nR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, m15073d2 = {"Lcom/discord/chat/presentation/message/DecoratedMessageView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/DecoratedMessageViewBinding;", "drawHighlight", "", "highlightDrawer", "Lcom/discord/chat/presentation/message/decorations/BackgroundHighlightDrawer;", "messageFrame", "Lcom/discord/chat/bridge/messageframe/MessageFrame;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "setMessage", "message", "Lcom/discord/chat/bridge/Message;", "messageContext", "Lcom/discord/chat/presentation/root/MessageContext;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "componentProvider", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "onChainPart", "Lkotlin/Function0;", "Lcom/discord/chat/presentation/message/MessageView$ChainPart;", "allowChildGestures", "isHighlight", "renderContentOnly", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class DecoratedMessageView extends FrameLayout {
    private final DecoratedMessageViewBinding binding;
    private boolean drawHighlight;
    private final BackgroundHighlightDrawer highlightDrawer;
    private MessageFrame messageFrame;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DecoratedMessageView(Context context) {
        this(context, null, 2, null);
        C9971q.m14633g(context, "context");
    }

    public /* synthetic */ DecoratedMessageView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public static /* synthetic */ void setMessage$default(DecoratedMessageView decoratedMessageView, Message message, MessageContext messageContext, MessageFrame messageFrame, ChatEventHandler chatEventHandler, ComponentProvider componentProvider, Function0 function0, boolean z, boolean z2, boolean z3, int i, Object obj) {
        MessageFrame messageFrame2;
        ChatEventHandler.Empty empty;
        ComponentProvider componentProvider2;
        DecoratedMessageView$setMessage$1 decoratedMessageView$setMessage$1;
        boolean z4;
        boolean z5;
        boolean z6;
        if ((i & 4) != 0) {
            messageFrame2 = null;
        } else {
            messageFrame2 = messageFrame;
        }
        if ((i & 8) != 0) {
            empty = ChatEventHandler.Empty.INSTANCE;
        } else {
            empty = chatEventHandler;
        }
        if ((i & 16) != 0) {
            componentProvider2 = null;
        } else {
            componentProvider2 = componentProvider;
        }
        if ((i & 32) != 0) {
            decoratedMessageView$setMessage$1 = DecoratedMessageView$setMessage$1.INSTANCE;
        } else {
            decoratedMessageView$setMessage$1 = function0;
        }
        if ((i & 64) != 0) {
            z4 = true;
        } else {
            z4 = z;
        }
        if ((i & 128) != 0) {
            z5 = false;
        } else {
            z5 = z2;
        }
        if ((i & Spliterator.NONNULL) != 0) {
            z6 = false;
        } else {
            z6 = z3;
        }
        decoratedMessageView.setMessage(message, messageContext, messageFrame2, empty, componentProvider2, decoratedMessageView$setMessage$1, z4, z5, z6);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        C9971q.m14633g(canvas, "canvas");
        super.onDraw(canvas);
        if (this.drawHighlight) {
            HighlightedMessageDrawer.drawHighlight$default(this.highlightDrawer, canvas, this, 0, 0, 12, null);
        }
    }

    public final void setMessage(Message message, MessageContext messageContext, MessageFrame messageFrame, ChatEventHandler eventHandler, ComponentProvider componentProvider, Function0<? extends MessageView.ChainPart> onChainPart, boolean z, boolean z2, boolean z3) {
        C9971q.m14633g(message, "message");
        C9971q.m14633g(messageContext, "messageContext");
        C9971q.m14633g(eventHandler, "eventHandler");
        C9971q.m14633g(onChainPart, "onChainPart");
        this.binding.messageView.setMessage(message, messageContext, messageFrame, eventHandler, componentProvider, onChainPart, z, z2, z3);
        this.drawHighlight = this.highlightDrawer.getShouldRenderHighlight().invoke(new MessageItem(message, messageFrame, messageContext, z, z2, null, null, z3, 96, null)).booleanValue();
        this.messageFrame = messageFrame;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DecoratedMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C9971q.m14633g(context, "context");
        DecoratedMessageViewBinding inflate = DecoratedMessageViewBinding.inflate(LayoutInflater.from(context), this);
        C9971q.m14634f(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        this.highlightDrawer = new BackgroundHighlightDrawer(context);
        setWillNotDraw(false);
    }
}
