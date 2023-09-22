package com.discord.chat.input;

import android.view.View;
import com.discord.chat.input.views.ChatInputRootView;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.common.ViewUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\r"}, d2 = {"Lcom/discord/chat/input/ChatInputManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "getText", "", "tag", "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "chat_input_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class ChatInputManagerModule extends ReactContextBaseJavaModule {
    
    public ChatInputManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        q.h(reactContext, "reactContext");
    }

    
    public static final void getText$lambda$0(int i10, ChatInputManagerModule this$0, Promise promise) {
        q.h(this$0, "this$0");
        q.h(promise, "$promise");
        int uIManagerType = ViewUtil.getUIManagerType(i10);
        UIManager uIManager = UIManagerHelper.getUIManager(this$0.getReactApplicationContext(), uIManagerType);
        try {
            q.e(uIManager);
            View resolveView = uIManager.resolveView(i10);
            if (resolveView == null) {
                promise.reject(new Exception("View not found for tag " + i10 + " of UIManagerType " + uIManagerType));
            } else {
                promise.resolve(((ChatInputRootView) resolveView).getText());
            }
        } catch (IllegalViewOperationException e10) {
            promise.reject(e10);
        }
    }

    @Override 
    public String getName() {
        return "DCDChatInputManager";
    }

    @ReactMethod
    public final void getText(final int i10, final Promise promise) {
        q.h(promise, "promise");
        getReactApplicationContext().runOnUiQueueThread(new Runnable() { 
            @Override 
            public final void run() {
                ChatInputManagerModule.getText$lambda$0(i10, this, promise);
            }
        });
    }
}
