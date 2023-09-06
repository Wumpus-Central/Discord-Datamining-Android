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
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.DCDChatInputManagerDelegate;
import com.facebook.react.viewmanagers.DCDChatInputManagerInterface;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import java.util.Map;
import kf.x;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;

@ReactModule(name = ChatInputViewManager.NAME)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001,B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0014J$\u0010\u000f\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006H\u0014J\u0014\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J\u0018\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001aH\u0017J\u0018\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001dH\u0017J\u001a\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0012H\u0017J\u001a\u0010 \u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u0012H\u0017J\u001a\u0010\"\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u0012H\u0017J\u001a\u0010$\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0012H\u0017J\u0018\u0010&\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u001aH\u0017J\u001a\u0010(\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010\u0012H\u0017J\u001a\u0010*\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010+\u001a\u0004\u0018\u00010\u0012H\u0017R*\u0010\u0005\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006-"}, d2 = {"Lcom/discord/chat/input/ChatInputViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/discord/chat/input/views/ChatInputRootView;", "Lcom/facebook/react/viewmanagers/DCDChatInputManagerInterface;", "()V", "delegate", "Lcom/facebook/react/viewmanagers/DCDChatInputManagerDelegate;", "kotlin.jvm.PlatformType", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "getReactEvents$chat_input_release", "()Lcom/discord/reactevents/ReactEvents;", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getDelegate", "getExportedCustomDirectEventTypeConstants", "", "", "", "getName", "onDropViewInstance", "", "view", "setEditable", "editable", "", "setKeyboardAppearance", "keyboardAppearance", "", "setMarkAsSpoilerTitle", "spoilerTitle", "setPlaceholder", ReactTextInputShadowNode.PROP_PLACEHOLDER, "setPlaceholderColor", "placeholderColor", "setSelectionColor", "selectionColor", "setShouldShowCursor", "shouldShowCursor", "setText", "text", "setTextColor", "textColor", "Companion", "chat_input_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class ChatInputViewManager extends ViewGroupManager<ChatInputRootView> implements DCDChatInputManagerInterface<ChatInputRootView> {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "DCDChatInput";
    private final DCDChatInputManagerDelegate<ChatInputRootView, ChatInputViewManager> delegate = new DCDChatInputManagerDelegate<>(this);
    private final ReactEvents reactEvents = new ReactEvents(x.a("onChangeContentSize", f0.b(OnContentSizeChangeEvent.class)), x.a("onEndBlur", f0.b(OnEndBlurEvent.class)), x.a("onBeginFocus", f0.b(OnFocusEvent.class)), x.a("onSelectionOrTextChange", f0.b(OnSelectionOrTextChangeEvent.class)), x.a("onPasteImage", f0.b(OnPasteImageEvent.class)), x.a("onRequestSend", f0.b(OnRequestSendEvent.class)));

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/discord/chat/input/ChatInputViewManager$Companion;", "", "()V", "NAME", "", "chat_input_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
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

    public final ReactEvents getReactEvents$chat_input_release() {
        return this.reactEvents;
    }

    @ReactProp(name = "keyboardAppearance")
    public void setKeyboardAppearance(ChatInputRootView view, int i10) {
        q.h(view, "view");
    }

    @ReactProp(name = "markAsSpoilerTitle")
    public void setMarkAsSpoilerTitle(ChatInputRootView view, String str) {
        q.h(view, "view");
    }

    @ReactProp(name = "selectionColor")
    public void setSelectionColor(ChatInputRootView view, String str) {
        q.h(view, "view");
    }

    
    @Override 
    public ChatInputRootView createViewInstance(final ThemedReactContext reactContext) {
        q.h(reactContext, "reactContext");
        final ChatInputRootView chatInputRootView = new ChatInputRootView(reactContext, null, 0, 6, null);
        chatInputRootView.setListener(new ChatInputRootView.ChatInputListener() { 
            @Override 
            public void onContentSizeChange(int i10, int i11) {
                ChatInputViewManager.this.getReactEvents$chat_input_release().emitEvent(reactContext, chatInputRootView, new OnContentSizeChangeEvent(i10, i11));
            }

            @Override 
            public void onEndBlur(String text) {
                q.h(text, "text");
                ChatInputViewManager.this.getReactEvents$chat_input_release().emitEvent(reactContext, chatInputRootView, new OnEndBlurEvent(text));
            }

            @Override 
            public void onFocus(int i10, int i11) {
                ChatInputViewManager.this.getReactEvents$chat_input_release().emitEvent(reactContext, chatInputRootView, new OnFocusEvent(i10, i11, 0, 4, (DefaultConstructorMarker) null));
            }

            @Override 
            public void onImageInserted(Uri uri) {
                q.h(uri, "uri");
                ReactEvents reactEvents$chat_input_release = ChatInputViewManager.this.getReactEvents$chat_input_release();
                ThemedReactContext themedReactContext = reactContext;
                ChatInputRootView chatInputRootView2 = chatInputRootView;
                String uri2 = uri.toString();
                q.g(uri2, "uri.toString()");
                reactEvents$chat_input_release.emitEvent(themedReactContext, chatInputRootView2, new OnPasteImageEvent(uri2, reactContext.getContentResolver().getType(uri)));
            }

            @Override 
            public void onRequestSend() {
                ChatInputViewManager.this.getReactEvents$chat_input_release().emitEvent(reactContext, chatInputRootView, new OnRequestSendEvent());
            }

            @Override 
            public void onTextOrSelectionChanged(int i10, int i11, String text, String editId) {
                q.h(text, "text");
                q.h(editId, "editId");
                ChatInputViewManager.this.getReactEvents$chat_input_release().emitEvent(reactContext, chatInputRootView, new OnSelectionOrTextChangeEvent(i10, i11, text, editId));
            }
        });
        KeyboardManager.INSTANCE.addKeyboardListener(chatInputRootView);
        return chatInputRootView;
    }

    
    @Override 
    public DCDChatInputManagerDelegate<ChatInputRootView, ChatInputViewManager> getDelegate() {
        return this.delegate;
    }

    public void onDropViewInstance(ChatInputRootView view) {
        q.h(view, "view");
        KeyboardManager.INSTANCE.removeKeyboardListener(view);
    }

    @ReactProp(name = "editable")
    public void setEditable(ChatInputRootView view, boolean z10) {
        q.h(view, "view");
        view.setEditTextEnabled(z10);
    }

    @ReactProp(name = ReactTextInputShadowNode.PROP_PLACEHOLDER)
    public void setPlaceholder(ChatInputRootView view, String str) {
        q.h(view, "view");
        view.setHint(str);
    }

    @ReactProp(name = "placeholderColor")
    public void setPlaceholderColor(ChatInputRootView view, String str) {
        q.h(view, "view");
        view.setHintTextColor(Color.parseColor(str));
    }

    @ReactProp(name = "shouldShowCursor")
    public void setShouldShowCursor(ChatInputRootView view, boolean z10) {
        q.h(view, "view");
        view.setCursorVisible(z10);
    }

    @ReactProp(name = "text")
    public void setText(ChatInputRootView view, String str) {
        q.h(view, "view");
        if (str != null) {
            view.setText(str);
        }
    }

    @ReactProp(name = "textColor")
    public void setTextColor(ChatInputRootView view, String str) {
        q.h(view, "view");
        view.setTextColor(Color.parseColor(str));
    }
}
