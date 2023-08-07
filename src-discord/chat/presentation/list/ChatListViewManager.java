package com.discord.chat.presentation.list;

import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.viewmanagers.DCDChatListManagerDelegate;
import com.facebook.react.viewmanagers.DCDChatListManagerInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@ReactModule(name = ChatListViewManager.NAME)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0014J$\u0010\u000b\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006H\u0014J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R*\u0010\u0005\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/discord/chat/presentation/list/ChatListViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/discord/chat/presentation/list/ChatListView;", "Lcom/facebook/react/viewmanagers/DCDChatListManagerInterface;", "()V", "mDelegate", "Lcom/facebook/react/viewmanagers/DCDChatListManagerDelegate;", "kotlin.jvm.PlatformType", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getDelegate", "getName", "", "onDropViewInstance", "", "view", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class ChatListViewManager extends SimpleViewManager<ChatListView> implements DCDChatListManagerInterface<ChatListView> {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "DCDChatList";
    private final DCDChatListManagerDelegate<ChatListView, ChatListViewManager> mDelegate = new DCDChatListManagerDelegate<>(this);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/discord/chat/presentation/list/ChatListViewManager$Companion;", "", "()V", "NAME", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override 
    public String getName() {
        return NAME;
    }

    
    @Override 
    public ChatListView createViewInstance(ThemedReactContext reactContext) {
        q.h(reactContext, "reactContext");
        return new ChatListView(reactContext, null, 0, 6, null);
    }

    
    @Override 
    public DCDChatListManagerDelegate<ChatListView, ChatListViewManager> getDelegate() {
        return this.mDelegate;
    }

    public void onDropViewInstance(ChatListView view) {
        q.h(view, "view");
        view.cleanup();
        super.onDropViewInstance((ChatListViewManager) view);
    }
}
