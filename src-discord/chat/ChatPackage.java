package com.discord.chat;

import android.view.ViewGroup;
import com.discord.chat.messagemanager.MessageViewManagers;
import com.discord.chat.presentation.list.ChatListViewManager;
import com.discord.chat.presentation.root.ChatViewManager;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.LayoutShadowNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.j;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J4\u0010\b\u001a&\u0012\"\u0012 \u0012\u000e\b\u0001\u0012\n \u000b*\u0004\u0018\u00010\n0\n\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\f0\f0\t0\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\r"}, d2 = {"Lcom/discord/chat/ChatPackage;", "Lcom/facebook/react/ReactPackage;", "()V", "createNativeModules", "", "Lcom/discord/chat/ChatModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "createViewManagers", "Lcom/facebook/react/uimanager/BaseViewManager;", "Landroid/view/ViewGroup;", "kotlin.jvm.PlatformType", "Lcom/facebook/react/uimanager/LayoutShadowNode;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class ChatPackage implements ReactPackage {
    @Override 
    public List<ChatModule> createNativeModules(ReactApplicationContext reactContext) {
        List<ChatModule> n10;
        q.g(reactContext, "reactContext");
        n10 = j.n(new ChatModule(reactContext));
        return n10;
    }

    @Override 
    public List<BaseViewManager<? extends ViewGroup, LayoutShadowNode>> createViewManagers(ReactApplicationContext reactContext) {
        List<BaseViewManager<? extends ViewGroup, LayoutShadowNode>> n10;
        q.g(reactContext, "reactContext");
        n10 = j.n(new ChatViewManager(), new ChatListViewManager(), new MessageViewManagers.MessageViewManager(), new MessageViewManagers.MessageBundleViewManager(), new MessageViewManagers.SystemMessageViewManager(), new MessageViewManagers.GuildMultilineSystemMessageViewManager());
        return n10;
    }
}
