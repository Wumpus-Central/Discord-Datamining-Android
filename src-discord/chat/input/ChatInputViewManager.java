package com.discord.chat.input;

import com.discord.chat.input.views.ChatInputRootView;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\nH\u0007J\u0014\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016J\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\rH\u0007J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0018\u0010\u0015\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\rH\u0007J\u0018\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\rH\u0007J\u0018\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\rH\u0007J\u0018\u0010\u0018\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\nH\u0007J\u0018\u0010\u0019\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\rH\u0007J\u0018\u0010\u001a\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\rH\u0007¨\u0006\u001b"}, d2 = {"Lcom/discord/chat/input/ChatInputViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/discord/chat/input/views/ChatInputRootView;", "()V", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "editable", "", "view", "", "getExportedCustomDirectEventTypeConstants", "", "", "", "getName", "keyboardAppearance", "", "markAsSpoilerTitle", "spoilerTitle", "onDropViewInstance", ReactTextInputShadowNode.PROP_PLACEHOLDER, "placeholderColor", "selectionColor", "shouldShowCursor", "text", "textColor", "chat_input_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ChatInputViewManager extends ViewGroupManager<ChatInputRootView> {
    @ReactProp(name = "editable")
    public final void editable(ChatInputRootView view, boolean z10) {
        q.g(view, "view");
        ChatInputViewManagerImpl.INSTANCE.editable(view, z10);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return ChatInputViewManagerImpl.INSTANCE.getExportedCustomDirectEventTypeConstants();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return ChatInputViewManagerImpl.NAME;
    }

    @ReactProp(name = "keyboardAppearance")
    public final void keyboardAppearance(ChatInputRootView view, int i10) {
        q.g(view, "view");
    }

    @ReactProp(name = "markAsSpoilerTitle")
    public final void markAsSpoilerTitle(ChatInputRootView view, String spoilerTitle) {
        q.g(view, "view");
        q.g(spoilerTitle, "spoilerTitle");
    }

    @ReactProp(name = ReactTextInputShadowNode.PROP_PLACEHOLDER)
    public final void placeholder(ChatInputRootView view, String placeholder) {
        q.g(view, "view");
        q.g(placeholder, "placeholder");
        ChatInputViewManagerImpl.INSTANCE.placeholder(view, placeholder);
    }

    @ReactProp(name = "placeholderColor")
    public final void placeholderColor(ChatInputRootView view, String placeholderColor) {
        q.g(view, "view");
        q.g(placeholderColor, "placeholderColor");
        ChatInputViewManagerImpl.INSTANCE.placeholderColor(view, placeholderColor);
    }

    @ReactProp(name = "selectionColor")
    public final void selectionColor(ChatInputRootView view, String selectionColor) {
        q.g(view, "view");
        q.g(selectionColor, "selectionColor");
    }

    @ReactProp(name = "shouldShowCursor")
    public final void shouldShowCursor(ChatInputRootView view, boolean z10) {
        q.g(view, "view");
        ChatInputViewManagerImpl.INSTANCE.shouldShowCursor(view, z10);
    }

    @ReactProp(name = "text")
    public final void text(ChatInputRootView view, String text) {
        q.g(view, "view");
        q.g(text, "text");
        ChatInputViewManagerImpl.INSTANCE.text(view, text);
    }

    @ReactProp(name = "textColor")
    public final void textColor(ChatInputRootView view, String textColor) {
        q.g(view, "view");
        q.g(textColor, "textColor");
        ChatInputViewManagerImpl.INSTANCE.textColor(view, textColor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public ChatInputRootView createViewInstance(ThemedReactContext reactContext) {
        q.g(reactContext, "reactContext");
        return ChatInputViewManagerImpl.INSTANCE.createViewInstance(reactContext);
    }

    public void onDropViewInstance(ChatInputRootView view) {
        q.g(view, "view");
        super.onDropViewInstance((ChatInputViewManager) view);
        ChatInputViewManagerImpl.INSTANCE.onDropViewInstance(view);
    }
}
