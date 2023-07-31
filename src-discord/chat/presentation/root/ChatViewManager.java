package com.discord.chat.presentation.root;

import android.content.Context;
import com.discord.chat.presentation.events.CreateChatReactEventsKt;
import com.discord.chat.reactevents.ChatViewEventHandler;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.DCDChatManagerDelegate;
import com.facebook.react.viewmanagers.DCDChatManagerInterface;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@ReactModule(name = ChatViewManager.NAME)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001!B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0014J$\u0010\r\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006H\u0014J\u0014\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0017H\u0017J\u0018\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0017H\u0017J\u0018\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0017H\u0017J\u0018\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0017H\u0017J\u0018\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u001dH\u0017J\u001a\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0017J\u0018\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0017H\u0017J\u0018\u0010 \u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0017H\u0017R*\u0010\u0005\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/discord/chat/presentation/root/ChatViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/discord/chat/presentation/root/ChatView;", "Lcom/facebook/react/viewmanagers/DCDChatManagerInterface;", "()V", "delegate", "Lcom/facebook/react/viewmanagers/DCDChatManagerDelegate;", "kotlin.jvm.PlatformType", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getDelegate", "getExportedCustomDirectEventTypeConstants", "", "", "", "getName", "setAlwaysRespectKeyboard", "", "view", "value", "", "setAnimateEmoji", "setHACK_fixModalInteraction", "setInverted", "inverted", "setKeyboardResponderProxyTag", "", "setRoleStyle", "setScrollEnabled", "setShouldAnimateAndroid", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class ChatViewManager extends ViewGroupManager<ChatView> implements DCDChatManagerInterface<ChatView> {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "DCDChat";
    private final DCDChatManagerDelegate<ChatView, ChatViewManager> delegate = new DCDChatManagerDelegate<>(this);
    private final ReactEvents reactEvents = CreateChatReactEventsKt.createChatReactEvents();

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/discord/chat/presentation/root/ChatViewManager$Companion;", "", "()V", "NAME", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override 
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return this.reactEvents.exportEventConstants();
    }

    @Override 
    public String getName() {
        return NAME;
    }

    @ReactProp(name = "alwaysRespectKeyboard")
    public void setAlwaysRespectKeyboard(ChatView view, boolean z10) {
        q.g(view, "view");
    }

    @ReactProp(name = "animateEmoji")
    public void setAnimateEmoji(ChatView view, boolean z10) {
        q.g(view, "view");
    }

    @ReactProp(name = "HACK_fixModalInteraction")
    public void setHACK_fixModalInteraction(ChatView view, boolean z10) {
        q.g(view, "view");
    }

    @ReactProp(name = "keyboardResponderProxyTag")
    public void setKeyboardResponderProxyTag(ChatView view, int i10) {
        q.g(view, "view");
    }

    @ReactProp(name = "roleStyle")
    public void setRoleStyle(ChatView view, String str) {
        q.g(view, "view");
    }

    @ReactProp(name = "scrollEnabled")
    public void setScrollEnabled(ChatView view, boolean z10) {
        q.g(view, "view");
    }

    
    @Override 
    public ChatView createViewInstance(ThemedReactContext reactContext) {
        q.g(reactContext, "reactContext");
        ChatView chatView = new ChatView(reactContext);
        Context context = chatView.getContext();
        q.f(context, "chatView.context");
        chatView.setEventHandler(new ChatViewEventHandler(context, this.reactEvents, new ChatViewManager$createViewInstance$1$1(chatView)));
        return chatView;
    }

    
    @Override 
    public DCDChatManagerDelegate<ChatView, ChatViewManager> getDelegate() {
        return this.delegate;
    }

    @ReactProp(name = "inverted")
    public void setInverted(ChatView view, boolean z10) {
        q.g(view, "view");
        view.setInverted(z10);
    }

    @ReactProp(name = "shouldAnimateAndroid")
    public void setShouldAnimateAndroid(ChatView view, boolean z10) {
        q.g(view, "view");
        view.setAnimated(z10);
    }
}
