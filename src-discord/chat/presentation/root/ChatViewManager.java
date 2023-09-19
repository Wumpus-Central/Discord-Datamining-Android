package com.discord.chat.presentation.root;

import android.content.Context;
import com.discord.chat.presentation.events.CreateChatReactEventsKt;
import com.discord.chat.reactevents.ChatViewEventHandler;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.reactevents.ReactEvents;
import com.discord.recycler_view.scroller.Scroller;
import com.facebook.react.bridge.ReadableArray;
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
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001*B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0014J$\u0010\r\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006H\u0014J\u0014\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\"\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J \u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J \u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0018\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0018\u0010 \u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u001dH\u0017J\u0018\u0010\"\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u001dH\u0017J\u0018\u0010#\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u001dH\u0017J\u0018\u0010$\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u001dH\u0017J\u0018\u0010&\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u001bH\u0017J\u001a\u0010'\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u0010H\u0017J\u0018\u0010(\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u001dH\u0017J\u0018\u0010)\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u001dH\u0017R*\u0010\u0005\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/discord/chat/presentation/root/ChatViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/discord/chat/presentation/root/ChatView;", "Lcom/facebook/react/viewmanagers/DCDChatManagerInterface;", "()V", "delegate", "Lcom/facebook/react/viewmanagers/DCDChatManagerDelegate;", "kotlin.jvm.PlatformType", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getDelegate", "getExportedCustomDirectEventTypeConstants", "", "", "", "getName", "receiveCommand", "", "view", "commandId", "args", "Lcom/facebook/react/bridge/ReadableArray;", ChatViewManager.COMMAND_SCROLL_INTO_VIEW, "index", "", "animated", "", ChatViewManager.COMMAND_SCROLL_TO, ChatViewManager.COMMAND_SCROLL_TO_BOTTOM, "setAlwaysRespectKeyboard", "value", "setAnimateEmoji", "setHACK_fixModalInteraction", "setInverted", "inverted", "setKeyboardResponderProxyTag", "setRoleStyle", "setScrollEnabled", "setShouldAnimateAndroid", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class ChatViewManager extends ViewGroupManager<ChatView> implements DCDChatManagerInterface<ChatView> {
    private static final String COMMAND_SCROLL_INTO_VIEW = "scrollIntoView";
    private static final String COMMAND_SCROLL_TO = "scrollTo";
    private static final String COMMAND_SCROLL_TO_BOTTOM = "scrollToBottom";
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "DCDChat";
    private final DCDChatManagerDelegate<ChatView, ChatViewManager> delegate = new DCDChatManagerDelegate<>(this);
    private final ReactEvents reactEvents = CreateChatReactEventsKt.createChatReactEvents();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/discord/chat/presentation/root/ChatViewManager$Companion;", "", "()V", "COMMAND_SCROLL_INTO_VIEW", "", "COMMAND_SCROLL_TO", "COMMAND_SCROLL_TO_BOTTOM", "NAME", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
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
        q.h(view, "view");
    }

    @ReactProp(name = "animateEmoji")
    public void setAnimateEmoji(ChatView view, boolean z10) {
        q.h(view, "view");
    }

    @ReactProp(name = "HACK_fixModalInteraction")
    public void setHACK_fixModalInteraction(ChatView view, boolean z10) {
        q.h(view, "view");
    }

    @ReactProp(name = "keyboardResponderProxyTag")
    public void setKeyboardResponderProxyTag(ChatView view, int i10) {
        q.h(view, "view");
    }

    @ReactProp(name = "roleStyle")
    public void setRoleStyle(ChatView view, String str) {
        q.h(view, "view");
    }

    @ReactProp(name = "scrollEnabled")
    public void setScrollEnabled(ChatView view, boolean z10) {
        q.h(view, "view");
    }

    
    @Override 
    public ChatView createViewInstance(ThemedReactContext reactContext) {
        q.h(reactContext, "reactContext");
        ChatView chatView = new ChatView(reactContext);
        Context context = chatView.getContext();
        q.g(context, "chatView.context");
        chatView.setEventHandler(new ChatViewEventHandler(context, this.reactEvents, new ChatViewManager$createViewInstance$1$1(chatView)));
        return chatView;
    }

    
    @Override 
    public DCDChatManagerDelegate<ChatView, ChatViewManager> getDelegate() {
        return this.delegate;
    }

    public void receiveCommand(ChatView view, String commandId, ReadableArray readableArray) {
        q.h(view, "view");
        q.h(commandId, "commandId");
        int hashCode = commandId.hashCode();
        if (hashCode != -938100109) {
            if (hashCode != -402165208) {
                if (hashCode == 1908871954 && commandId.equals(COMMAND_SCROLL_INTO_VIEW) && readableArray != null) {
                    scrollIntoView(view, readableArray.getInt(0), readableArray.getBoolean(1));
                }
            } else if (commandId.equals(COMMAND_SCROLL_TO) && readableArray != null) {
                scrollTo(view, readableArray.getInt(0), readableArray.getBoolean(1));
            }
        } else if (commandId.equals(COMMAND_SCROLL_TO_BOTTOM) && readableArray != null) {
            scrollToBottom(view, readableArray.getBoolean(0));
        }
    }

    public void scrollIntoView(ChatView view, int i10, boolean z10) {
        q.h(view, "view");
        view.scrollTo(i10, Scroller.TargetAlignment.Anywhere.INSTANCE, z10, false);
    }

    public void scrollTo(ChatView view, int i10, boolean z10) {
        q.h(view, "view");
        view.scrollTo(i10, new Scroller.TargetAlignment.Top(SizeUtilsKt.getDpToPx(4)), z10, false);
    }

    public void scrollToBottom(ChatView view, boolean z10) {
        q.h(view, "view");
        view.scrollTo(0, Scroller.TargetAlignment.Anywhere.INSTANCE, z10, false);
    }

    @ReactProp(name = "inverted")
    public void setInverted(ChatView view, boolean z10) {
        q.h(view, "view");
        view.setInverted(z10);
    }

    @ReactProp(name = "shouldAnimateAndroid")
    public void setShouldAnimateAndroid(ChatView view, boolean z10) {
        q.h(view, "view");
        view.setAnimated(z10);
    }
}
