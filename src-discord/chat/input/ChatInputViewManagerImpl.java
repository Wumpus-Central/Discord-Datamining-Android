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
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import java.util.Map;
import kg.x;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0010J\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0012J\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nJ\u0016\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0004J\u0016\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0004J\u0016\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0010J\u0016\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0004J\u0016\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/discord/chat/input/ChatInputViewManagerImpl;", "", "()V", "NAME", "", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "getReactEvents$chat_input_release", "()Lcom/discord/reactevents/ReactEvents;", "createViewInstance", "Lcom/discord/chat/input/views/ChatInputRootView;", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "editable", "", "view", "", "getExportedCustomDirectEventTypeConstants", "", "onDropViewInstance", ReactTextInputShadowNode.PROP_PLACEHOLDER, "placeholderColor", "shouldShowCursor", "text", "textColor", "chat_input_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ChatInputViewManagerImpl {
    public static final String NAME = "DCDChatInput";
    public static final ChatInputViewManagerImpl INSTANCE = new ChatInputViewManagerImpl();
    private static final ReactEvents reactEvents = new ReactEvents(x.a("onChangeContentSize", f0.b(OnContentSizeChangeEvent.class)), x.a("onEndBlur", f0.b(OnEndBlurEvent.class)), x.a("onBeginFocus", f0.b(OnFocusEvent.class)), x.a("onSelectionOrTextChange", f0.b(OnSelectionOrTextChangeEvent.class)), x.a("onPasteImage", f0.b(OnPasteImageEvent.class)), x.a("onRequestSend", f0.b(OnRequestSendEvent.class)));

    private ChatInputViewManagerImpl() {
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, com.facebook.react.uimanager.events.EventDispatcher] */
    public final ChatInputRootView createViewInstance(final ThemedReactContext reactContext) {
        q.g(reactContext, "reactContext");
        final ChatInputRootView chatInputRootView = new ChatInputRootView(reactContext, null, 0, 6, null);
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f22138k = UIManagerHelper.getEventDispatcherForReactTag(reactContext, chatInputRootView.getId());
        chatInputRootView.setListener(new ChatInputRootView.ChatInputListener() { // from class: com.discord.chat.input.ChatInputViewManagerImpl$createViewInstance$1$1
            @Override // com.discord.chat.input.views.ChatInputRootView.ChatInputListener
            public void onContentSizeChange(int i10, int i11) {
                ChatInputViewManagerImpl.INSTANCE.getReactEvents$chat_input_release().emitEvent(ref$ObjectRef.f22138k, reactContext, chatInputRootView, new OnContentSizeChangeEvent(i10, i11));
            }

            @Override // com.discord.chat.input.views.ChatInputRootView.ChatInputListener
            public void onEndBlur(String text) {
                q.g(text, "text");
                ChatInputViewManagerImpl.INSTANCE.getReactEvents$chat_input_release().emitEvent(ref$ObjectRef.f22138k, reactContext, chatInputRootView, new OnEndBlurEvent(text));
            }

            @Override // com.discord.chat.input.views.ChatInputRootView.ChatInputListener
            public void onFocus(int i10, int i11) {
                ChatInputViewManagerImpl.INSTANCE.getReactEvents$chat_input_release().emitEvent(ref$ObjectRef.f22138k, reactContext, chatInputRootView, new OnFocusEvent(i10, i11, 0, 4, (DefaultConstructorMarker) null));
            }

            @Override // com.discord.chat.input.views.ChatInputRootView.ChatInputListener
            public void onImageInserted(Uri uri) {
                q.g(uri, "uri");
                ThemedReactContext themedReactContext = reactContext;
                ChatInputRootView chatInputRootView2 = chatInputRootView;
                String uri2 = uri.toString();
                q.f(uri2, "uri.toString()");
                ChatInputViewManagerImpl.INSTANCE.getReactEvents$chat_input_release().emitEvent(ref$ObjectRef.f22138k, themedReactContext, chatInputRootView2, new OnPasteImageEvent(uri2, reactContext.getContentResolver().getType(uri)));
            }

            @Override // com.discord.chat.input.views.ChatInputRootView.ChatInputListener
            public void onRequestSend() {
                ChatInputViewManagerImpl.INSTANCE.getReactEvents$chat_input_release().emitEvent(ref$ObjectRef.f22138k, reactContext, chatInputRootView, new OnRequestSendEvent());
            }

            @Override // com.discord.chat.input.views.ChatInputRootView.ChatInputListener
            public void onTextOrSelectionChanged(int i10, int i11, String text, String editId) {
                q.g(text, "text");
                q.g(editId, "editId");
                ChatInputViewManagerImpl.INSTANCE.getReactEvents$chat_input_release().emitEvent(ref$ObjectRef.f22138k, reactContext, chatInputRootView, new OnSelectionOrTextChangeEvent(i10, i11, text, editId));
            }
        });
        KeyboardManager.INSTANCE.addKeyboardListener(chatInputRootView);
        return chatInputRootView;
    }

    public final void editable(ChatInputRootView view, boolean z10) {
        q.g(view, "view");
        view.setEditTextEnabled(z10);
    }

    public final Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return reactEvents.exportEventConstants();
    }

    public final ReactEvents getReactEvents$chat_input_release() {
        return reactEvents;
    }

    public final void onDropViewInstance(ChatInputRootView view) {
        q.g(view, "view");
        KeyboardManager.INSTANCE.removeKeyboardListener(view);
    }

    public final void placeholder(ChatInputRootView view, String placeholder) {
        q.g(view, "view");
        q.g(placeholder, "placeholder");
        view.setHint(placeholder);
    }

    public final void placeholderColor(ChatInputRootView view, String placeholderColor) {
        q.g(view, "view");
        q.g(placeholderColor, "placeholderColor");
        view.setHintTextColor(Color.parseColor(placeholderColor));
    }

    public final void shouldShowCursor(ChatInputRootView view, boolean z10) {
        q.g(view, "view");
        view.setCursorVisible(z10);
    }

    public final void text(ChatInputRootView view, String text) {
        q.g(view, "view");
        q.g(text, "text");
        view.setText(text);
    }

    public final void textColor(ChatInputRootView view, String textColor) {
        q.g(view, "view");
        q.g(textColor, "textColor");
        view.setTextColor(Color.parseColor(textColor));
    }
}
