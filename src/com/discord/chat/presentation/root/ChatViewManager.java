package com.discord.chat.presentation.root;

import android.content.Context;
import com.discord.chat.presentation.events.CreateChatReactEventsKt;
import com.discord.chat.reactevents.ChatViewEventHandler;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0014J\u0014\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0018\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0012H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m15073d2 = {"Lcom/discord/chat/presentation/root/ChatViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/discord/chat/presentation/root/ChatView;", "()V", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getExportedCustomDirectEventTypeConstants", "", "", "", "getName", "setAnimated", "", "view", "animated", "", "setInverted", "inverted", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class ChatViewManager extends ViewGroupManager<ChatView> {
    private final ReactEvents reactEvents = CreateChatReactEventsKt.createChatReactEvents();

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return this.reactEvents.exportEventConstants();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "DCDChat";
    }

    @ReactProp(name = "shouldAnimateAndroid")
    public final void setAnimated(ChatView view, boolean z) {
        C9677q.m14633g(view, "view");
        view.setAnimated(z);
    }

    @ReactProp(name = "inverted")
    public final void setInverted(ChatView view, boolean z) {
        C9677q.m14633g(view, "view");
        view.setInverted(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public ChatView createViewInstance(ThemedReactContext reactContext) {
        C9677q.m14633g(reactContext, "reactContext");
        ChatView chatView = new ChatView(reactContext);
        Context context = chatView.getContext();
        C9677q.m14634f(context, "chatView.context");
        chatView.setEventHandler(new ChatViewEventHandler(context, this.reactEvents, new ChatViewManager$createViewInstance$1$1(chatView)));
        return chatView;
    }
}
