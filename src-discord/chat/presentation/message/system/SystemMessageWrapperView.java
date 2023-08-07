package com.discord.chat.presentation.message.system;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.MessageKt;
import com.discord.chat.databinding.DecoratedMessageViewBinding;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.list.delegate.CallSystemMessageDelegate;
import com.discord.chat.presentation.list.delegate.SystemMessageDelegate;
import com.discord.chat.presentation.list.item.MessageItem;
import com.discord.chat.presentation.message.MessageView;
import com.discord.chat.presentation.message.decorations.BackgroundHighlightDrawer;
import com.discord.chat.presentation.message.decorations.HighlightedMessageDrawer;
import com.discord.chat.presentation.root.MessageContext;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0014J\u001e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/discord/chat/presentation/message/system/SystemMessageWrapperView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/DecoratedMessageViewBinding;", "drawHighlight", "", "highlightDrawer", "Lcom/discord/chat/presentation/message/decorations/BackgroundHighlightDrawer;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "setMessage", "message", "Lcom/discord/chat/bridge/Message;", "messageContext", "Lcom/discord/chat/presentation/root/MessageContext;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class SystemMessageWrapperView extends FrameLayout {
    private final DecoratedMessageViewBinding binding;
    private boolean drawHighlight;
    private final BackgroundHighlightDrawer highlightDrawer;

    
    public SystemMessageWrapperView(Context context) {
        this(context, null, 2, null);
        q.h(context, "context");
    }

    public  SystemMessageWrapperView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    @Override 
    protected void onDraw(Canvas canvas) {
        q.h(canvas, "canvas");
        super.onDraw(canvas);
        if (this.drawHighlight) {
            HighlightedMessageDrawer.drawHighlight$default(this.highlightDrawer, canvas, this, 0, 0, 12, null);
        }
    }

    public final void setMessage(Message message, MessageContext messageContext, ChatEventHandler eventHandler) {
        View view;
        q.h(message, "message");
        q.h(messageContext, "messageContext");
        q.h(eventHandler, "eventHandler");
        MessageView messageView = this.binding.messageView;
        q.g(messageView, "binding.messageView");
        MessageView.setMessage$default(messageView, message, messageContext, null, eventHandler, null, null, false, false, false, 500, null);
        SystemMessageWrapperView$setMessage$eventHandlerProvider$1 systemMessageWrapperView$setMessage$eventHandlerProvider$1 = new SystemMessageWrapperView$setMessage$eventHandlerProvider$1(eventHandler);
        removeAllViews();
        if (MessageKt.isCallMessage(message)) {
            view = new CallSystemMessageDelegate(systemMessageWrapperView$setMessage$eventHandlerProvider$1).createAndBindStandaloneView(this, message);
        } else {
            view = new SystemMessageDelegate(systemMessageWrapperView$setMessage$eventHandlerProvider$1, new RecyclerView.RecycledViewPool()).createAndBindStandaloneView(this, message, messageContext);
        }
        addView(view, -1, -2);
        this.drawHighlight = this.highlightDrawer.getShouldRenderHighlight().invoke(new MessageItem(message, null, messageContext, false, false, null, null, false, ItemTouchHelper.c.DEFAULT_SWIPE_ANIMATION_DURATION, null)).booleanValue();
    }

    
    public SystemMessageWrapperView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.h(context, "context");
        DecoratedMessageViewBinding inflate = DecoratedMessageViewBinding.inflate(LayoutInflater.from(context), this);
        q.g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        this.highlightDrawer = new BackgroundHighlightDrawer(context);
        setWillNotDraw(false);
    }
}
