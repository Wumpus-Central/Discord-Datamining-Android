package com.discord.chat.presentation.message;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.MessageAccessoriesAdapter;
import com.discord.chat.presentation.message.decorations.MessageAccessoriesHorizontalSpacingDecoration;
import com.discord.chat.presentation.message.decorations.ThreadSpineItemDecoration;
import com.discord.chat.presentation.message.messagepart.MessageAccessory;
import com.discord.chat.presentation.message.messagepart.ThreadEmbedMessageAccessory;
import com.discord.chat.presentation.message.view.MessageContentView;
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider;
import com.discord.chat.presentation.root.ChatView;
import com.discord.primitives.GuildId;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u008b\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001'\u0018\u0000 32\u00020\u0001:\u000234B\u001d\b\u0007\u0012\u0006\u0010.\u001a\u00020-\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b1\u00102J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002JM\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0017J\u001a\u0010\u001d\u001a\u00020\u00042\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00040\u001aR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00065"}, d2 = {"Lcom/discord/chat/presentation/message/MessageAccessoriesView;", "Landroidx/recyclerview/widget/RecyclerView;", "", "leftMargin", "", "updateLeftMargin", "Lcom/discord/primitives/MessageId;", "messageId", "Lcom/discord/primitives/ChannelId;", "channelId", "Lcom/discord/primitives/GuildId;", "guildId", "", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "items", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "eventHandler", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "messageComponentProvider", "setAccessories-RC8ZMxU", "(Ljava/lang/String;JLcom/discord/primitives/GuildId;Ljava/util/List;Lcom/discord/chat/presentation/events/ChatEventHandler;Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;)V", "setAccessories", "Landroid/view/MotionEvent;", "e", "", "onTouchEvent", "Lkotlin/Function1;", "Lcom/discord/chat/presentation/message/view/MessageContentView;", "onViewChanged", "setOnCurrentContentViewChanged", "Lcom/discord/chat/presentation/message/decorations/ThreadSpineItemDecoration;", "threadSpineDecoration", "Lcom/discord/chat/presentation/message/decorations/ThreadSpineItemDecoration;", "Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;", "accessoriesAdapter", "Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;", "Lcom/discord/chat/presentation/message/MessageAccessoriesView$ContentViewTracker;", "contentViewTracker", "Lcom/discord/chat/presentation/message/MessageAccessoriesView$ContentViewTracker;", "com/discord/chat/presentation/message/MessageAccessoriesView$defaultItemAnimator$1", "defaultItemAnimator", "Lcom/discord/chat/presentation/message/MessageAccessoriesView$defaultItemAnimator$1;", "Lcom/discord/chat/presentation/message/decorations/MessageAccessoriesHorizontalSpacingDecoration;", "messageAccessoriesDecoration", "Lcom/discord/chat/presentation/message/decorations/MessageAccessoriesHorizontalSpacingDecoration;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "ContentViewTracker", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class MessageAccessoriesView extends RecyclerView {
    public static final Companion Companion = new Companion(null);
    private static int embedContentMarginPx;
    private static int leftMarginPx;
    private static int rightMarginPx;
    private final MessageAccessoriesAdapter accessoriesAdapter;
    private final ContentViewTracker contentViewTracker;
    private final MessageAccessoriesView$defaultItemAnimator$1 defaultItemAnimator;
    private MessageAccessoriesHorizontalSpacingDecoration messageAccessoriesDecoration;
    private ThreadSpineItemDecoration threadSpineDecoration;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/discord/chat/presentation/message/MessageAccessoriesView$Companion;", "", "()V", "embedContentMarginPx", "", "leftMarginPx", "rightMarginPx", "getWidth", "constrainedWidth", "getWidthForEmbedContent", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getWidth(int i10) {
            return (i10 - MessageAccessoriesView.leftMarginPx) - MessageAccessoriesView.rightMarginPx;
        }

        public final int getWidthForEmbedContent(int i10) {
            return getWidth(i10) - (MessageAccessoriesView.embedContentMarginPx * 2);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016R\"\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\nR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/discord/chat/presentation/message/MessageAccessoriesView$ContentViewTracker;", "Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$MessageContentViewLifecycleListener;", "Lkotlin/Function1;", "Lcom/discord/chat/presentation/message/view/MessageContentView;", "", "onViewChanged", "setOnViewChanged", "messageContentView", "onAttachedToWindow", "onDetachedFromWindow", "Lkotlin/jvm/functions/Function1;", "currentContentView", "Lcom/discord/chat/presentation/message/view/MessageContentView;", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})
    
    private static final class ContentViewTracker implements MessageAccessoriesAdapter.MessageContentViewLifecycleListener {
        private MessageContentView currentContentView;
        private Function1<? super MessageContentView, Unit> onViewChanged = MessageAccessoriesView$ContentViewTracker$onViewChanged$1.INSTANCE;

        @Override 
        public void onAttachedToWindow(MessageContentView messageContentView) {
            q.g(messageContentView, "messageContentView");
            this.currentContentView = messageContentView;
            this.onViewChanged.invoke(messageContentView);
        }

        @Override 
        public void onDetachedFromWindow() {
            this.currentContentView = null;
        }

        public final void setOnViewChanged(Function1<? super MessageContentView, Unit> onViewChanged) {
            q.g(onViewChanged, "onViewChanged");
            this.onViewChanged = onViewChanged;
            MessageContentView messageContentView = this.currentContentView;
            if (messageContentView != null) {
                onViewChanged.invoke(messageContentView);
            }
        }
    }

    
    public MessageAccessoriesView(Context context) {
        this(context, null, 2, null);
        q.g(context, "context");
    }

    public  MessageAccessoriesView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    @Override 
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return false;
    }

    
    public final void m209setAccessoriesRC8ZMxU(String messageId, long j10, GuildId guildId, List<? extends MessageAccessory> items, ChatEventHandler eventHandler, ComponentProvider componentProvider) {
        MessageAccessoriesView$defaultItemAnimator$1 messageAccessoriesView$defaultItemAnimator$1;
        q.g(messageId, "messageId");
        q.g(items, "items");
        q.g(eventHandler, "eventHandler");
        if (ChatView.Companion.getAreChatAnimationsEnabled()) {
            messageAccessoriesView$defaultItemAnimator$1 = this.defaultItemAnimator;
        } else {
            messageAccessoriesView$defaultItemAnimator$1 = null;
        }
        setItemAnimator(messageAccessoriesView$defaultItemAnimator$1);
        ThreadSpineItemDecoration threadSpineItemDecoration = this.threadSpineDecoration;
        boolean z10 = false;
        if (!(items instanceof Collection) || !items.isEmpty()) {
            Iterator<T> it = items.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((MessageAccessory) it.next()) instanceof ThreadEmbedMessageAccessory) {
                        z10 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        threadSpineItemDecoration.setShowThreadSpine(z10);
        this.accessoriesAdapter.setEventHandler(eventHandler);
        this.accessoriesAdapter.setComponentProvider(componentProvider);
        this.accessoriesAdapter.m196setItemsbo5iIEc(messageId, j10, guildId, items);
    }

    public final void setOnCurrentContentViewChanged(Function1<? super MessageContentView, Unit> onViewChanged) {
        q.g(onViewChanged, "onViewChanged");
        this.contentViewTracker.setOnViewChanged(onViewChanged);
    }

    public final void updateLeftMargin(int i10) {
        if (i10 != leftMarginPx) {
            leftMarginPx = i10;
            removeItemDecoration(this.messageAccessoriesDecoration);
            MessageAccessoriesHorizontalSpacingDecoration messageAccessoriesHorizontalSpacingDecoration = new MessageAccessoriesHorizontalSpacingDecoration(leftMarginPx, rightMarginPx);
            this.messageAccessoriesDecoration = messageAccessoriesHorizontalSpacingDecoration;
            addItemDecoration(messageAccessoriesHorizontalSpacingDecoration);
        }
    }

    
    
    
    
    public MessageAccessoriesView(android.content.Context r11, android.util.AttributeSet r12) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.MessageAccessoriesView.<init>(android.content.Context, android.util.AttributeSet):void");
    }
}
