package com.discord.chat.input;

import android.graphics.Color;
import android.net.Uri;
import bj.C3681n1;
import com.discord.chat.input.ChatInputViewManager;
import com.discord.chat.input.events.FocusEvent;
import com.discord.chat.input.events.OnContentSizeChangeEvent;
import com.discord.chat.input.events.OnEndBlurEvent;
import com.discord.chat.input.events.OnPasteImageEvent;
import com.discord.chat.input.events.OnSelectionOrTextChangeEvent;
import com.discord.chat.input.views.ChatInputRootView;
import com.discord.keyboard.KeyboardManager;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import nf.C11098x;
import p449yi.AbstractC14435f;

@Metadata(m15074d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0014J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\fH\u0007J\u0014\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0018\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u000fH\u0007J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u000fH\u0007J\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u000fH\u0007J\u0018\u0010\u0019\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u000fH\u0007J\u0018\u0010\u001a\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\fH\u0007J\u0018\u0010\u001b\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u000fH\u0007J\u0018\u0010\u001c\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u000fH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m15073d2 = {"Lcom/discord/chat/input/ChatInputViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/discord/chat/input/views/ChatInputRootView;", "()V", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "editable", "", "view", "", "getExportedCustomDirectEventTypeConstants", "", "", "", "getName", "keyboardAppearance", "", "markAsSpoilerTitle", "spoilerTitle", "onDropViewInstance", ReactTextInputShadowNode.PROP_PLACEHOLDER, "placeholderColor", "selectionColor", "shouldShowCursor", "text", "textColor", "OnRequestSendEvent", "chat_input_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class ChatInputViewManager extends ViewGroupManager<ChatInputRootView> {
    private final ReactEvents reactEvents = new ReactEvents(C11098x.m10921a("onChangeContentSize", C9951f0.m14684b(OnContentSizeChangeEvent.class)), C11098x.m10921a("onEndBlur", C9951f0.m14684b(OnEndBlurEvent.class)), C11098x.m10921a("onBeginFocus", C9951f0.m14684b(FocusEvent.class)), C11098x.m10921a("onSelectionOrTextChange", C9951f0.m14684b(OnSelectionOrTextChangeEvent.class)), C11098x.m10921a("onPasteImage", C9951f0.m14684b(OnPasteImageEvent.class)), C11098x.m10921a("onRequestSend", C9951f0.m14684b(OnRequestSendEvent.class)));

    @AbstractC14435f
    @Metadata(m15074d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00122\u00020\u0001:\u0002\u0011\u0012B\u0019\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J!\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010HÇ\u0001¨\u0006\u0013"}, m15073d2 = {"Lcom/discord/chat/input/ChatInputViewManager$OnRequestSendEvent;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "serialize", "Lcom/facebook/react/bridge/WritableNativeMap;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_input_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class OnRequestSendEvent implements ReactEvent {
        public static final Companion Companion = new Companion(null);

        @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/chat/input/ChatInputViewManager$OnRequestSendEvent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/input/ChatInputViewManager$OnRequestSendEvent;", "chat_input_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<OnRequestSendEvent> serializer() {
                return ChatInputViewManager$OnRequestSendEvent$$serializer.INSTANCE;
            }
        }

        public OnRequestSendEvent() {
        }

        public static final void write$Self(OnRequestSendEvent self, CompositeEncoder output, SerialDescriptor serialDesc) {
            C9971q.m14633g(self, "self");
            C9971q.m14633g(output, "output");
            C9971q.m14633g(serialDesc, "serialDesc");
        }

        public /* synthetic */ OnRequestSendEvent(int i, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 0) != 0) {
                C3681n1.m33818b(i, 0, ChatInputViewManager$OnRequestSendEvent$$serializer.INSTANCE.getDescriptor());
            }
        }

        @Override // com.discord.reactevents.ReactEvent
        public WritableNativeMap serialize() {
            return NativeMapExtensionsKt.nativeMapOf(new Pair[0]);
        }
    }

    @ReactProp(name = "editable")
    public final void editable(ChatInputRootView view, boolean z) {
        C9971q.m14633g(view, "view");
        view.setEditTextEnabled(z);
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
    public final void keyboardAppearance(ChatInputRootView view, int i) {
        C9971q.m14633g(view, "view");
    }

    @ReactProp(name = "markAsSpoilerTitle")
    public final void markAsSpoilerTitle(ChatInputRootView view, String spoilerTitle) {
        C9971q.m14633g(view, "view");
        C9971q.m14633g(spoilerTitle, "spoilerTitle");
    }

    @ReactProp(name = ReactTextInputShadowNode.PROP_PLACEHOLDER)
    public final void placeholder(ChatInputRootView view, String placeholder) {
        C9971q.m14633g(view, "view");
        C9971q.m14633g(placeholder, "placeholder");
        view.setHint(placeholder);
    }

    @ReactProp(name = "placeholderColor")
    public final void placeholderColor(ChatInputRootView view, String placeholderColor) {
        C9971q.m14633g(view, "view");
        C9971q.m14633g(placeholderColor, "placeholderColor");
        view.setHintTextColor(Color.parseColor(placeholderColor));
    }

    @ReactProp(name = "selectionColor")
    public final void selectionColor(ChatInputRootView view, String selectionColor) {
        C9971q.m14633g(view, "view");
        C9971q.m14633g(selectionColor, "selectionColor");
    }

    @ReactProp(name = "shouldShowCursor")
    public final void shouldShowCursor(ChatInputRootView view, boolean z) {
        C9971q.m14633g(view, "view");
        view.setCursorVisible(z);
    }

    @ReactProp(name = "text")
    public final void text(ChatInputRootView view, String text) {
        C9971q.m14633g(view, "view");
        C9971q.m14633g(text, "text");
        view.setText(text);
    }

    @ReactProp(name = "textColor")
    public final void textColor(ChatInputRootView view, String textColor) {
        C9971q.m14633g(view, "view");
        C9971q.m14633g(textColor, "textColor");
        view.setTextColor(Color.parseColor(textColor));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public ChatInputRootView createViewInstance(final ThemedReactContext reactContext) {
        C9971q.m14633g(reactContext, "reactContext");
        final ChatInputRootView chatInputRootView = new ChatInputRootView(reactContext, null, 0, 6, null);
        chatInputRootView.setListener(new ChatInputRootView.ChatInputListener() { // from class: com.discord.chat.input.ChatInputViewManager$createViewInstance$1$1
            @Override // com.discord.chat.input.views.ChatInputRootView.ChatInputListener
            public void onContentSizeChange(int i, int i2) {
                ReactEvents reactEvents;
                reactEvents = ChatInputViewManager.this.reactEvents;
                reactEvents.emitEvent(chatInputRootView, new OnContentSizeChangeEvent(i, i2));
            }

            @Override // com.discord.chat.input.views.ChatInputRootView.ChatInputListener
            public void onEndBlur(String text) {
                ReactEvents reactEvents;
                C9971q.m14633g(text, "text");
                reactEvents = ChatInputViewManager.this.reactEvents;
                reactEvents.emitEvent(chatInputRootView, new OnEndBlurEvent(text));
            }

            @Override // com.discord.chat.input.views.ChatInputRootView.ChatInputListener
            public void onFocus(int i, int i2) {
                ReactEvents reactEvents;
                reactEvents = ChatInputViewManager.this.reactEvents;
                reactEvents.emitEvent(chatInputRootView, new FocusEvent(i, i2, 0, 4, (DefaultConstructorMarker) null));
            }

            @Override // com.discord.chat.input.views.ChatInputRootView.ChatInputListener
            public void onImageInserted(Uri uri) {
                ReactEvents reactEvents;
                C9971q.m14633g(uri, "uri");
                reactEvents = ChatInputViewManager.this.reactEvents;
                ChatInputRootView chatInputRootView2 = chatInputRootView;
                String uri2 = uri.toString();
                C9971q.m14634f(uri2, "uri.toString()");
                reactEvents.emitEvent(chatInputRootView2, new OnPasteImageEvent(uri2, reactContext.getContentResolver().getType(uri)));
            }

            @Override // com.discord.chat.input.views.ChatInputRootView.ChatInputListener
            public void onRequestSend() {
                ReactEvents reactEvents;
                reactEvents = ChatInputViewManager.this.reactEvents;
                reactEvents.emitEvent(chatInputRootView, new ChatInputViewManager.OnRequestSendEvent());
            }

            @Override // com.discord.chat.input.views.ChatInputRootView.ChatInputListener
            public void onTextOrSelectionChanged(int i, int i2, String text, String editId) {
                ReactEvents reactEvents;
                C9971q.m14633g(text, "text");
                C9971q.m14633g(editId, "editId");
                reactEvents = ChatInputViewManager.this.reactEvents;
                reactEvents.emitEvent(chatInputRootView, new OnSelectionOrTextChangeEvent(i, i2, text, editId));
            }
        });
        KeyboardManager.INSTANCE.addKeyboardListener(chatInputRootView);
        return chatInputRootView;
    }

    public void onDropViewInstance(ChatInputRootView view) {
        C9971q.m14633g(view, "view");
        super.onDropViewInstance((ChatInputViewManager) view);
        KeyboardManager.INSTANCE.removeKeyboardListener(view);
    }
}
