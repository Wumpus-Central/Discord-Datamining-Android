package com.discord.chat.input;

import android.graphics.Color;
import android.net.Uri;
import com.discord.chat.input.events.OnContentSizeChangeEvent;
import com.discord.chat.input.events.OnEndBlurEvent;
import com.discord.chat.input.events.OnFocusEvent;
import com.discord.chat.input.events.OnPasteImageEvent;
import com.discord.chat.input.events.OnRequestSendEvent;
import com.discord.chat.input.events.OnSelectionOrTextChangeEvent;
import com.discord.chat.input.views.ChatInputRootView;
import com.discord.keyboard.KeyboardManager;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import java.util.Map;
import kg.x;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0014J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\fH\u0007J\u0014\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0018\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u000fH\u0007J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u000fH\u0007J\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u000fH\u0007J\u0018\u0010\u0019\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u000fH\u0007J\u0018\u0010\u001a\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\fH\u0007J\u0018\u0010\u001b\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u000fH\u0007J\u0018\u0010\u001c\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u000fH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/discord/chat/input/ChatInputViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/discord/chat/input/views/ChatInputRootView;", "()V", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "editable", "", "view", "", "getExportedCustomDirectEventTypeConstants", "", "", "", "getName", "keyboardAppearance", "", "markAsSpoilerTitle", "spoilerTitle", "onDropViewInstance", ReactTextInputShadowNode.PROP_PLACEHOLDER, "placeholderColor", "selectionColor", "shouldShowCursor", "text", "textColor", "chat_input_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ChatInputViewManager extends ViewGroupManager<ChatInputRootView> {
    private final ReactEvents reactEvents = new ReactEvents(x.a("onChangeContentSize", f0.b(OnContentSizeChangeEvent.class)), x.a("onEndBlur", f0.b(OnEndBlurEvent.class)), x.a("onBeginFocus", f0.b(OnFocusEvent.class)), x.a("onSelectionOrTextChange", f0.b(OnSelectionOrTextChangeEvent.class)), x.a("onPasteImage", f0.b(OnPasteImageEvent.class)), x.a("onRequestSend", f0.b(OnRequestSendEvent.class)));

    @ReactProp(name = "editable")
    public final void editable(ChatInputRootView view, boolean z10) {
        q.g(view, "view");
        view.setEditTextEnabled(z10);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return this.reactEvents.exportEventConstants();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "DCDChatInput";
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
        view.setHint(placeholder);
    }

    @ReactProp(name = "placeholderColor")
    public final void placeholderColor(ChatInputRootView view, String placeholderColor) {
        q.g(view, "view");
        q.g(placeholderColor, "placeholderColor");
        view.setHintTextColor(Color.parseColor(placeholderColor));
    }

    @ReactProp(name = "selectionColor")
    public final void selectionColor(ChatInputRootView view, String selectionColor) {
        q.g(view, "view");
        q.g(selectionColor, "selectionColor");
    }

    @ReactProp(name = "shouldShowCursor")
    public final void shouldShowCursor(ChatInputRootView view, boolean z10) {
        q.g(view, "view");
        view.setCursorVisible(z10);
    }

    @ReactProp(name = "text")
    public final void text(ChatInputRootView view, String text) {
        q.g(view, "view");
        q.g(text, "text");
        view.setText(text);
    }

    @ReactProp(name = "textColor")
    public final void textColor(ChatInputRootView view, String textColor) {
        q.g(view, "view");
        q.g(textColor, "textColor");
        view.setTextColor(Color.parseColor(textColor));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public ChatInputRootView createViewInstance(final ThemedReactContext reactContext) {
        q.g(reactContext, "reactContext");
        final ChatInputRootView chatInputRootView = new ChatInputRootView(reactContext, null, 0, 6, null);
        chatInputRootView.setListener(new ChatInputRootView.ChatInputListener() { // from class: com.discord.chat.input.ChatInputViewManager$createViewInstance$1$1
            @Override // com.discord.chat.input.views.ChatInputRootView.ChatInputListener
            public void onContentSizeChange(int i10, int i11) {
                ReactEvents reactEvents;
                reactEvents = ChatInputViewManager.this.reactEvents;
                reactEvents.emitEvent(reactContext, chatInputRootView, new OnContentSizeChangeEvent(i10, i11));
            }

            @Override // com.discord.chat.input.views.ChatInputRootView.ChatInputListener
            public void onEndBlur(String text) {
                ReactEvents reactEvents;
                q.g(text, "text");
                reactEvents = ChatInputViewManager.this.reactEvents;
                reactEvents.emitEvent(reactContext, chatInputRootView, new OnEndBlurEvent(text));
            }

            @Override // com.discord.chat.input.views.ChatInputRootView.ChatInputListener
            public void onFocus(int i10, int i11) {
                ReactEvents reactEvents;
                reactEvents = ChatInputViewManager.this.reactEvents;
                reactEvents.emitEvent(reactContext, chatInputRootView, new OnFocusEvent(i10, i11, 0, 4, (DefaultConstructorMarker) null));
            }

            @Override // com.discord.chat.input.views.ChatInputRootView.ChatInputListener
            public void onImageInserted(Uri uri) {
                ReactEvents reactEvents;
                q.g(uri, "uri");
                reactEvents = ChatInputViewManager.this.reactEvents;
                ThemedReactContext themedReactContext = reactContext;
                ChatInputRootView chatInputRootView2 = chatInputRootView;
                String uri2 = uri.toString();
                q.f(uri2, "uri.toString()");
                reactEvents.emitEvent(themedReactContext, chatInputRootView2, new OnPasteImageEvent(uri2, reactContext.getContentResolver().getType(uri)));
            }

            @Override // com.discord.chat.input.views.ChatInputRootView.ChatInputListener
            public void onRequestSend() {
                ReactEvents reactEvents;
                reactEvents = ChatInputViewManager.this.reactEvents;
                reactEvents.emitEvent(reactContext, chatInputRootView, new OnRequestSendEvent());
            }

            @Override // com.discord.chat.input.views.ChatInputRootView.ChatInputListener
            public void onTextOrSelectionChanged(int i10, int i11, String text, String editId) {
                ReactEvents reactEvents;
                q.g(text, "text");
                q.g(editId, "editId");
                reactEvents = ChatInputViewManager.this.reactEvents;
                reactEvents.emitEvent(reactContext, chatInputRootView, new OnSelectionOrTextChangeEvent(i10, i11, text, editId));
            }
        });
        KeyboardManager.INSTANCE.addKeyboardListener(chatInputRootView);
        return chatInputRootView;
    }

    public void onDropViewInstance(ChatInputRootView view) {
        q.g(view, "view");
        super.onDropViewInstance((ChatInputViewManager) view);
        KeyboardManager.INSTANCE.removeKeyboardListener(view);
    }
}
