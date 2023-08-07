package com.discord.chat.input;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import com.discord.chat.input.bridge.ChatInputNode;
import com.discord.chat.input.bridge.ChatInputNode$$serializer;
import com.discord.chat.input.views.ChatInputRootView;
import com.discord.misc.utilities.keyboard.KeyboardExtensionsKt;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.UIBlock;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.l;
import wi.f;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007JB\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000fH\u0007J \u0010 \u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\nH\u0007J\u0018\u0010!\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u000fH\u0007J\"\u0010\"\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000fH\u0007J\u0012\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%*\u00020\u001cH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/discord/chat/input/ChatInputManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "json", "Lkotlinx/serialization/json/Json;", "backspace", "", "tag", "", "blur", "closeCustomKeyboard", "focus", "getName", "", "getText", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "markTextInputChanged", "openCustomKeyboard", "openSystemKeyboard", "reloadInputViews", "replaceRange", "location", "length", "text", "styleBlocks", "Lcom/facebook/react/bridge/ReadableArray;", "keepCursorPosition", "", "editId", "setSelectedRange", "setText", "updateTextBlocks", "blocks", "toStyleBlocks", "", "Lcom/discord/chat/input/bridge/ChatInputNode;", "chat_input_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class ChatInputManagerModule extends ReactContextBaseJavaModule {
    private final Json json = l.b(null, ChatInputManagerModule$json$1.INSTANCE, 1, null);

    
    public ChatInputManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        q.h(reactContext, "reactContext");
    }

    
    public final List<ChatInputNode> toStyleBlocks(ReadableArray readableArray) {
        Json json = this.json;
        String jsonString = NativeArrayExtensionsKt.toJsonString(readableArray);
        json.a();
        return (List) json.b(new f(ChatInputNode$$serializer.INSTANCE), jsonString);
    }

    @ReactMethod
    public final void backspace(final int i10) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        q.g(reactApplicationContext, "reactApplicationContext");
        NativeModule nativeModule = reactApplicationContext.getNativeModule(UIManagerModule.class);
        q.e(nativeModule);
        ((UIManagerModule) nativeModule).addUIBlock(new UIBlock() { 
            @Override 
            public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View resolveView = nativeViewHierarchyManager.resolveView(i10);
                if (resolveView != null) {
                    ((ChatInputRootView) resolveView).backspace();
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.discord.chat.input.views.ChatInputRootView");
            }
        });
    }

    @ReactMethod
    public final void blur(final int i10) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        q.g(reactApplicationContext, "reactApplicationContext");
        NativeModule nativeModule = reactApplicationContext.getNativeModule(UIManagerModule.class);
        q.e(nativeModule);
        ((UIManagerModule) nativeModule).addUIBlock(new UIBlock() { 
            @Override 
            public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View resolveView = nativeViewHierarchyManager.resolveView(i10);
                if (resolveView != null) {
                    ((ChatInputRootView) resolveView).clearInputFocus();
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.discord.chat.input.views.ChatInputRootView");
            }
        });
    }

    @ReactMethod
    public final void closeCustomKeyboard(int i10) {
    }

    @ReactMethod
    public final void focus(final int i10) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        q.g(reactApplicationContext, "reactApplicationContext");
        NativeModule nativeModule = reactApplicationContext.getNativeModule(UIManagerModule.class);
        q.e(nativeModule);
        ((UIManagerModule) nativeModule).addUIBlock(new UIBlock() { 
            @Override 
            public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View resolveView = nativeViewHierarchyManager.resolveView(i10);
                if (resolveView != null) {
                    ((ChatInputRootView) resolveView).requestInputFocus();
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.discord.chat.input.views.ChatInputRootView");
            }
        });
    }

    @Override 
    public String getName() {
        return "DCDChatInputManager";
    }

    @ReactMethod
    public final void getText(final int i10, final Promise promise) {
        q.h(promise, "promise");
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        q.g(reactApplicationContext, "reactApplicationContext");
        NativeModule nativeModule = reactApplicationContext.getNativeModule(UIManagerModule.class);
        q.e(nativeModule);
        ((UIManagerModule) nativeModule).addUIBlock(new UIBlock() { 
            @Override 
            public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View resolveView = nativeViewHierarchyManager.resolveView(i10);
                if (resolveView != null) {
                    promise.resolve(((ChatInputRootView) resolveView).getText());
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.discord.chat.input.views.ChatInputRootView");
            }
        });
    }

    @ReactMethod
    public final void markTextInputChanged(int i10) {
    }

    @ReactMethod
    public final void openCustomKeyboard(final int i10) {
        final Window window;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null && (window = currentActivity.getWindow()) != null) {
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            q.g(reactApplicationContext, "reactApplicationContext");
            NativeModule nativeModule = reactApplicationContext.getNativeModule(UIManagerModule.class);
            q.e(nativeModule);
            ((UIManagerModule) nativeModule).addUIBlock(new UIBlock() { 
                @Override 
                public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                    View resolveView = nativeViewHierarchyManager.resolveView(i10);
                    if (resolveView != null) {
                        KeyboardExtensionsKt.hideKeyboard((ChatInputRootView) resolveView, window);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.discord.chat.input.views.ChatInputRootView");
                }
            });
        }
    }

    @ReactMethod
    public final void openSystemKeyboard(final int i10) {
        final Window window;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null && (window = currentActivity.getWindow()) != null) {
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            q.g(reactApplicationContext, "reactApplicationContext");
            NativeModule nativeModule = reactApplicationContext.getNativeModule(UIManagerModule.class);
            q.e(nativeModule);
            ((UIManagerModule) nativeModule).addUIBlock(new UIBlock() { 
                @Override 
                public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                    View resolveView = nativeViewHierarchyManager.resolveView(i10);
                    if (resolveView != null) {
                        ((ChatInputRootView) resolveView).showKeyboard(window);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.discord.chat.input.views.ChatInputRootView");
                }
            });
        }
    }

    @ReactMethod
    public final void reloadInputViews(int i10) {
    }

    @ReactMethod
    public final void replaceRange(final int i10, final int i11, final int i12, final String text, final ReadableArray styleBlocks, final boolean z10, final String str) {
        q.h(text, "text");
        q.h(styleBlocks, "styleBlocks");
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        q.g(reactApplicationContext, "reactApplicationContext");
        NativeModule nativeModule = reactApplicationContext.getNativeModule(UIManagerModule.class);
        q.e(nativeModule);
        ((UIManagerModule) nativeModule).addUIBlock(new UIBlock() { 
            @Override 
            public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                List<ChatInputNode> styleBlocks2;
                View resolveView = nativeViewHierarchyManager.resolveView(i10);
                if (resolveView != null) {
                    int i13 = i11;
                    int i14 = i12;
                    String str2 = text;
                    styleBlocks2 = this.toStyleBlocks(styleBlocks);
                    ((ChatInputRootView) resolveView).replaceRange(i13, i14, str2, styleBlocks2, z10, str);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.discord.chat.input.views.ChatInputRootView");
            }
        });
    }

    @ReactMethod
    public final void setSelectedRange(final int i10, final int i11, final int i12) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        q.g(reactApplicationContext, "reactApplicationContext");
        NativeModule nativeModule = reactApplicationContext.getNativeModule(UIManagerModule.class);
        q.e(nativeModule);
        ((UIManagerModule) nativeModule).addUIBlock(new UIBlock() { 
            @Override 
            public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View resolveView = nativeViewHierarchyManager.resolveView(i10);
                if (resolveView != null) {
                    int i13 = i11;
                    ((ChatInputRootView) resolveView).setSelection(i13, i12 + i13);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.discord.chat.input.views.ChatInputRootView");
            }
        });
    }

    @ReactMethod
    public final void setText(final int i10, final String text) {
        q.h(text, "text");
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        q.g(reactApplicationContext, "reactApplicationContext");
        NativeModule nativeModule = reactApplicationContext.getNativeModule(UIManagerModule.class);
        q.e(nativeModule);
        ((UIManagerModule) nativeModule).addUIBlock(new UIBlock() { 
            @Override 
            public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View resolveView = nativeViewHierarchyManager.resolveView(i10);
                if (resolveView != null) {
                    ChatInputRootView chatInputRootView = (ChatInputRootView) resolveView;
                    chatInputRootView.setText(text);
                    ChatInputRootView.setSelection$default(chatInputRootView, text.length(), 0, 2, null);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.discord.chat.input.views.ChatInputRootView");
            }
        });
    }

    @ReactMethod
    public final void updateTextBlocks(final int i10, ReadableArray blocks, final String str) {
        q.h(blocks, "blocks");
        final List<ChatInputNode> styleBlocks = toStyleBlocks(blocks);
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        q.g(reactApplicationContext, "reactApplicationContext");
        NativeModule nativeModule = reactApplicationContext.getNativeModule(UIManagerModule.class);
        q.e(nativeModule);
        ((UIManagerModule) nativeModule).addUIBlock(new UIBlock() { 
            @Override 
            public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View resolveView = nativeViewHierarchyManager.resolveView(i10);
                if (resolveView != null) {
                    ChatInputRootView chatInputRootView = (ChatInputRootView) resolveView;
                    String str2 = str;
                    if (str2 == null) {
                        str2 = "";
                    }
                    chatInputRootView.clearAndApplyChatNodes(str2, styleBlocks);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.discord.chat.input.views.ChatInputRootView");
            }
        });
    }
}
