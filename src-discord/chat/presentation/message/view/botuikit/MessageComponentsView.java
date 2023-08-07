package com.discord.chat.presentation.message.view.botuikit;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.chat.databinding.MessageComponentsViewBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ&\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/discord/chat/presentation/message/view/botuikit/MessageComponentsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/chat/databinding/MessageComponentsViewBinding;", "setComponents", "", "componentProvider", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "components", "", "Lcom/discord/chat/bridge/botuikit/Component;", "actionListener", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentActionListener;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class MessageComponentsView extends ConstraintLayout {
    private final MessageComponentsViewBinding binding;

    
    public MessageComponentsView(Context context) {
        this(context, null, 0, 6, null);
        q.h(context, "context");
    }

    
    public MessageComponentsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.h(context, "context");
    }

    public  MessageComponentsView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    
    
    public final void setComponents(com.discord.chat.presentation.message.view.botuikit.ComponentProvider r8, java.util.List<? extends com.discord.chat.bridge.botuikit.Component> r9, com.discord.chat.presentation.message.view.botuikit.ComponentActionListener r10) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.botuikit.MessageComponentsView.setComponents(com.discord.chat.presentation.message.view.botuikit.ComponentProvider, java.util.List, com.discord.chat.presentation.message.view.botuikit.ComponentActionListener):void");
    }

    
    public MessageComponentsView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.h(context, "context");
        MessageComponentsViewBinding inflate = MessageComponentsViewBinding.inflate(LayoutInflater.from(context), this);
        q.g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
    }
}
