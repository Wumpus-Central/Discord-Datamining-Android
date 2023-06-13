package com.discord.chat.presentation.message;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.discord.chat.bridge.messageframe.MessageFrame;
import com.discord.chat.bridge.messageframe.MessageFrameJump;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000eH\u0002J(\u0010\u000f\u001a\u0002H\u0010\"\n\b\u0000\u0010\u0010\u0018\u0001*\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0013H\u0082\b¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/discord/chat/presentation/message/MessageFrameHeaderView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "configure", "", "messageFrame", "Lcom/discord/chat/bridge/messageframe/MessageFrame;", "configureMessageFrameJump", "Lcom/discord/chat/bridge/messageframe/MessageFrameJump;", "getOrCreate", "T", "Landroid/view/View;", "createBlock", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Landroid/view/View;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MessageFrameHeaderView extends FrameLayout {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageFrameHeaderView(Context context) {
        this(context, null, 0, 6, null);
        q.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageFrameHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.g(context, "context");
    }

    public /* synthetic */ MessageFrameHeaderView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final void configureMessageFrameJump(MessageFrameJump messageFrameJump) {
        View childAt = getChildAt(0);
        if (!(childAt instanceof MessageFrameJumpHeaderView)) {
            if (childAt != null) {
                removeViewAt(0);
            }
            Context context = getContext();
            q.f(context, "context");
            childAt = new MessageFrameJumpHeaderView(context, null, 0, 6, null);
            childAt.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            addView(childAt);
        }
        ((MessageFrameJumpHeaderView) childAt).configure(messageFrameJump);
    }

    private final /* synthetic */ <T extends View> T getOrCreate(Function0<? extends T> function0) {
        T child = (T) getChildAt(0);
        q.m(3, "T");
        if (child instanceof View) {
            q.f(child, "child");
            return child;
        }
        if (child != null) {
            removeViewAt(0);
        }
        T t10 = (T) ((View) function0.invoke());
        t10.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        addView(t10);
        return t10;
    }

    public final void configure(MessageFrame messageFrame) {
        q.g(messageFrame, "messageFrame");
        boolean z10 = true;
        if (getChildCount() > 1) {
            z10 = false;
        }
        if (!z10) {
            throw new IllegalStateException("Should not have more than one child".toString());
        } else if (messageFrame instanceof MessageFrameJump) {
            configureMessageFrameJump((MessageFrameJump) messageFrame);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageFrameHeaderView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.g(context, "context");
    }
}
