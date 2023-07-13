package com.discord.chat.presentation.message.view.botuikit;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JB\u0010\u0007\u001a\n\u0012\u0004\u0012\u0002H\t\u0018\u00010\b\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u0002H\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086\b¢\u0006\u0002\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "getConfiguredComponentView", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentView;", "T", "Lcom/discord/chat/bridge/botuikit/Component;", "listener", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentActionListener;", "component", "root", "Landroid/view/ViewGroup;", "childIndex", "", "(Lcom/discord/chat/presentation/message/view/botuikit/ComponentActionListener;Lcom/discord/chat/bridge/botuikit/Component;Landroid/view/ViewGroup;I)Lcom/discord/chat/presentation/message/view/botuikit/ComponentView;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class ComponentProvider {
    private final Context context;

    public ComponentProvider(Context context) {
        q.g(context, "context");
        this.context = context;
    }

    
    
    public final  <T extends com.discord.chat.bridge.botuikit.Component> com.discord.chat.presentation.message.view.botuikit.ComponentView<T> getConfiguredComponentView(com.discord.chat.presentation.message.view.botuikit.ComponentActionListener r5, T r6, android.view.ViewGroup r7, int r8) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.botuikit.ComponentProvider.getConfiguredComponentView(com.discord.chat.presentation.message.view.botuikit.ComponentActionListener, com.discord.chat.bridge.botuikit.Component, android.view.ViewGroup, int):com.discord.chat.presentation.message.view.botuikit.ComponentView");
    }

    public final Context getContext() {
        return this.context;
    }
}
