package com.discord.chat.messagemanager;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.MessageBase;
import com.discord.chat.bridge.messageframe.MessageFrame;
import com.discord.chat.bridge.messageframe.MessageFrameType;
import com.discord.chat.bridge.row.MessageRow;
import com.discord.chat.bridge.row.Row;
import com.discord.chat.messagemanager.MessageViewManagers;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.events.CreateChatReactEventsKt;
import com.discord.chat.presentation.list.ChatListUtilsKt;
import com.discord.chat.presentation.list.messagebundling.MessageBundleView;
import com.discord.chat.presentation.message.DecoratedMessageView;
import com.discord.chat.presentation.message.MessageView;
import com.discord.chat.presentation.message.system.SystemMessageWrapperView;
import com.discord.chat.presentation.root.MessageContext;
import com.discord.chat.presentation.root.MessageContextKt;
import com.discord.chat.reactevents.ChatViewEventHandler;
import com.discord.chat.reactevents.OnLongPressMessageBundleItemData;
import com.discord.chat.reactevents.OnTapMessageBundleItemData;
import com.discord.chat.reactevents.OnTapReplyItemData;
import com.discord.chat.reactevents.OnTapViewMoreTextData;
import com.discord.chat.reactevents.OnTruncateMessageData;
import com.discord.misc.utilities.measure.ViewMeasuringWrapper;
import com.discord.reactevents.ReactEvents;
import com.discord.theme.ThemeManager;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import ff.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.l;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0016\u0017\u0018\u0019B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0014\u0010\u000b\u001a\u00020\f*\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J$\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/discord/chat/messagemanager/MessageViewManagers;", "", "()V", "json", "Lkotlinx/serialization/json/Json;", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "convertRowJsonToMessageRow", "Lcom/discord/chat/bridge/row/MessageRow;", "rowJson", "", "getEventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "context", "Landroid/content/Context;", "updateNodeSize", "", "Lcom/facebook/react/bridge/ReactContext;", "id", "", "width", "height", "GuildMultilineSystemMessageViewManager", "MessageBundleViewManager", "MessageViewManager", "SystemMessageViewManager", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class MessageViewManagers {
    public static final MessageViewManagers INSTANCE = new MessageViewManagers();
    private static final Json json = l.b(null, MessageViewManagers$json$1.INSTANCE, 1, null);
    private static final ReactEvents reactEvents;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/discord/chat/messagemanager/MessageViewManagers$GuildMultilineSystemMessageViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/discord/misc/utilities/measure/ViewMeasuringWrapper;", "Lcom/discord/chat/presentation/message/MessageView;", "()V", "createViewInstance", "", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getName", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class GuildMultilineSystemMessageViewManager extends ViewGroupManager<ViewMeasuringWrapper<MessageView>> {
        @Override 
        public String getName() {
            return "DCDGuildMultilineSystemMessageView";
        }

        @Override 
        protected Void createViewInstance(ThemedReactContext reactContext) {
            q.g(reactContext, "reactContext");
            throw new UnsupportedOperationException("multiline system messages are not supported.");
        }
    }

    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0014J\u001e\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\r\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J%\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J-\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"J\u0014\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020%0$H\u0016J\b\u0010&\u001a\u00020\u0010H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006'"}, d2 = {"Lcom/discord/chat/messagemanager/MessageViewManagers$MessageBundleViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/discord/misc/utilities/measure/ViewMeasuringWrapper;", "Lcom/discord/chat/presentation/list/messagebundling/MessageBundleView;", "()V", "messageAccessoriesViewPool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "messageRowViewPool", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "data", "", "wrappedView", "", "emitOnLongPressItem", "", "view", "Landroid/view/View;", "emitOnTapItem", "emitOnTapReply", "messageId", "Lcom/discord/primitives/MessageId;", "emitOnTapReply-Ayv7vGE", "(Landroid/view/View;Ljava/lang/String;)V", "emitOnTapViewMoreText", "emitOnTruncateMessage", "context", "Landroid/content/Context;", "reactTag", "", "emitOnTruncateMessage-JPrav84", "(Landroid/content/Context;ILjava/lang/String;)V", "getExportedCustomDirectEventTypeConstants", "", "", "getName", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class MessageBundleViewManager extends ViewGroupManager<ViewMeasuringWrapper<MessageBundleView>> {
        private final RecyclerView.RecycledViewPool messageRowViewPool;
        private final ReactEvents reactEvents = new ReactEvents(x.a("onTapItem", f0.b(OnTapMessageBundleItemData.class)), x.a("onLongPressItem", f0.b(OnLongPressMessageBundleItemData.class)), x.a("onTruncateMessage", f0.b(OnTruncateMessageData.class)), x.a("onTapReplyItem", f0.b(OnTapReplyItemData.class)), x.a("onTapViewMoreText", f0.b(OnTapViewMoreTextData.class)));
        private final RecyclerView.RecycledViewPool messageAccessoriesViewPool = ChatListUtilsKt.getMessageAccessoriesViewPool();

        public MessageBundleViewManager() {
            RecyclerView.RecycledViewPool recycledViewPool = new RecyclerView.RecycledViewPool();
            recycledViewPool.k(0, 50);
            this.messageRowViewPool = recycledViewPool;
        }

        
        public static final void data$lambda$3(MessageBundleViewManager this$0, ViewMeasuringWrapper wrappedView, View view) {
            q.g(this$0, "this$0");
            q.g(wrappedView, "$wrappedView");
            this$0.emitOnTapItem(wrappedView);
        }

        
        public static final boolean data$lambda$4(MessageBundleViewManager this$0, ViewMeasuringWrapper wrappedView, View view) {
            q.g(this$0, "this$0");
            q.g(wrappedView, "$wrappedView");
            return this$0.emitOnLongPressItem(wrappedView);
        }

        
        public static final void data$lambda$5(MessageBundleViewManager this$0, ViewMeasuringWrapper wrappedView, View view) {
            q.g(this$0, "this$0");
            q.g(wrappedView, "$wrappedView");
            this$0.emitOnTapViewMoreText(wrappedView);
        }

        private final boolean emitOnLongPressItem(View view) {
            this.reactEvents.emitEvent(view, new OnLongPressMessageBundleItemData());
            return true;
        }

        private final void emitOnTapItem(View view) {
            this.reactEvents.emitEvent(view, new OnTapMessageBundleItemData());
        }

        
        
        public final void m143emitOnTapReplyAyv7vGE(View view, String str) {
            this.reactEvents.emitEvent(view, new OnTapReplyItemData(str, null));
        }

        private final void emitOnTapViewMoreText(View view) {
            this.reactEvents.emitEvent(view, new OnTapViewMoreTextData());
        }

        
        
        public final void m144emitOnTruncateMessageJPrav84(Context context, int i10, String str) {
            this.reactEvents.emitEvent(context, new OnTruncateMessageData(str, null), i10);
        }

        @ReactProp(name = "data")
        public final void data(final ViewMeasuringWrapper<MessageBundleView> wrappedView, String data) {
            q.g(wrappedView, "wrappedView");
            q.g(data, "data");
            Json json = MessageViewManagers.json;
            json.a();
            wrappedView.getView().setBundle((MessageBundleView.MessageBundle) json.b(MessageBundleView.MessageBundle.Companion.serializer(), data), new View.OnClickListener() { 
                @Override 
                public final void onClick(View view) {
                    MessageViewManagers.MessageBundleViewManager.data$lambda$3(MessageViewManagers.MessageBundleViewManager.this, wrappedView, view);
                }
            }, new View.OnLongClickListener() { 
                @Override 
                public final boolean onLongClick(View view) {
                    boolean data$lambda$4;
                    data$lambda$4 = MessageViewManagers.MessageBundleViewManager.data$lambda$4(MessageViewManagers.MessageBundleViewManager.this, wrappedView, view);
                    return data$lambda$4;
                }
            }, new MessageViewManagers$MessageBundleViewManager$data$3(this, wrappedView), new View.OnClickListener() { 
                @Override 
                public final void onClick(View view) {
                    MessageViewManagers.MessageBundleViewManager.data$lambda$5(MessageViewManagers.MessageBundleViewManager.this, wrappedView, view);
                }
            });
        }

        @Override 
        public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
            return this.reactEvents.exportEventConstants();
        }

        @Override 
        public String getName() {
            return "DCDGuildFeedMessageItemView";
        }

        
        @Override 
        public ViewMeasuringWrapper<MessageBundleView> createViewInstance(ThemedReactContext reactContext) {
            q.g(reactContext, "reactContext");
            ViewMeasuringWrapper<MessageBundleView> viewMeasuringWrapper = new ViewMeasuringWrapper<>(new MessageBundleView(reactContext, null, 0, 6, null), new MessageViewManagers$MessageBundleViewManager$createViewInstance$1(reactContext));
            MessageBundleView view = viewMeasuringWrapper.getView();
            view.setMessageRowViewPool(this.messageRowViewPool);
            view.setMessageAccessoriesViewPool(this.messageAccessoriesViewPool);
            view.setOnTruncateMessage(new MessageViewManagers$MessageBundleViewManager$createViewInstance$2$1$1(this, view, viewMeasuringWrapper));
            return viewMeasuringWrapper;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0014J\b\u0010\b\u001a\u00020\tH\u0016J\u001e\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\r\u001a\u00020\tH\u0007¨\u0006\u000e"}, d2 = {"Lcom/discord/chat/messagemanager/MessageViewManagers$MessageViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/discord/misc/utilities/measure/ViewMeasuringWrapper;", "Lcom/discord/chat/presentation/message/DecoratedMessageView;", "()V", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getName", "", "row", "", "wrappedView", "rowJson", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class MessageViewManager extends ViewGroupManager<ViewMeasuringWrapper<DecoratedMessageView>> {
        @Override 
        public String getName() {
            return "DCDMessageView";
        }

        @ReactProp(name = "row")
        public final void row(ViewMeasuringWrapper<DecoratedMessageView> wrappedView, String rowJson) {
            MessageFrameType messageFrameType;
            q.g(wrappedView, "wrappedView");
            q.g(rowJson, "rowJson");
            MessageViewManagers messageViewManagers = MessageViewManagers.INSTANCE;
            MessageRow convertRowJsonToMessageRow = messageViewManagers.convertRowJsonToMessageRow(rowJson);
            MessageFrame messageFrame = convertRowJsonToMessageRow.getMessageFrame();
            if (messageFrame != null) {
                messageFrameType = messageFrame.getType();
            } else {
                messageFrameType = null;
            }
            if (messageFrameType == MessageFrameType.MEDIA_VIEWER_MESSAGE_FRAME) {
                ThemeManager themeManager = ThemeManager.INSTANCE;
                themeManager.setThemeOverride(themeManager.getDarkTheme());
            }
            DecoratedMessageView view = wrappedView.getView();
            MessageBase message = convertRowJsonToMessageRow.getMessage();
            q.e(message, "null cannot be cast to non-null type com.discord.chat.bridge.Message");
            MessageContext messageContext = MessageContextKt.getMessageContext(convertRowJsonToMessageRow);
            MessageFrame messageFrame2 = convertRowJsonToMessageRow.getMessageFrame();
            Context context = wrappedView.getContext();
            q.f(context, "wrappedView.context");
            DecoratedMessageView.setMessage$default(view, (Message) message, messageContext, messageFrame2, messageViewManagers.getEventHandler(convertRowJsonToMessageRow, context), null, null, false, convertRowJsonToMessageRow.isHighlight(), false, 368, null);
            ThemeManager.INSTANCE.setThemeOverride(null);
        }

        
        @Override 
        public ViewMeasuringWrapper<DecoratedMessageView> createViewInstance(ThemedReactContext reactContext) {
            q.g(reactContext, "reactContext");
            return new ViewMeasuringWrapper<>(new DecoratedMessageView(reactContext, null, 2, null), new MessageViewManagers$MessageViewManager$createViewInstance$1(reactContext));
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0014J\b\u0010\b\u001a\u00020\tH\u0016J\u001e\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\r\u001a\u00020\tH\u0007¨\u0006\u000e"}, d2 = {"Lcom/discord/chat/messagemanager/MessageViewManagers$SystemMessageViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/discord/misc/utilities/measure/ViewMeasuringWrapper;", "Lcom/discord/chat/presentation/message/system/SystemMessageWrapperView;", "()V", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getName", "", "row", "", "wrappedView", "rowJson", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class SystemMessageViewManager extends ViewGroupManager<ViewMeasuringWrapper<SystemMessageWrapperView>> {
        @Override 
        public String getName() {
            return "DCDSystemMessageView";
        }

        @ReactProp(name = "row")
        public final void row(ViewMeasuringWrapper<SystemMessageWrapperView> wrappedView, String rowJson) {
            q.g(wrappedView, "wrappedView");
            q.g(rowJson, "rowJson");
            MessageViewManagers messageViewManagers = MessageViewManagers.INSTANCE;
            MessageRow convertRowJsonToMessageRow = messageViewManagers.convertRowJsonToMessageRow(rowJson);
            MessageBase message = convertRowJsonToMessageRow.getMessage();
            q.e(message, "null cannot be cast to non-null type com.discord.chat.bridge.Message");
            MessageContext messageContext = MessageContextKt.getMessageContext(convertRowJsonToMessageRow);
            Context context = wrappedView.getContext();
            q.f(context, "wrappedView.context");
            wrappedView.getView().setMessage((Message) message, messageContext, messageViewManagers.getEventHandler(convertRowJsonToMessageRow, context));
        }

        
        @Override 
        public ViewMeasuringWrapper<SystemMessageWrapperView> createViewInstance(ThemedReactContext reactContext) {
            q.g(reactContext, "reactContext");
            return new ViewMeasuringWrapper<>(new SystemMessageWrapperView(reactContext, null, 2, null), new MessageViewManagers$SystemMessageViewManager$createViewInstance$1(reactContext));
        }
    }

    static {
        ReactEvents createChatReactEvents = CreateChatReactEventsKt.createChatReactEvents();
        createChatReactEvents.exportEventConstants();
        reactEvents = createChatReactEvents;
    }

    private MessageViewManagers() {
    }

    
    public final MessageRow convertRowJsonToMessageRow(String str) {
        Json json2 = json;
        json2.a();
        Object b10 = json2.b(Row.Companion.serializer(), str);
        q.e(b10, "null cannot be cast to non-null type com.discord.chat.bridge.row.MessageRow");
        return (MessageRow) b10;
    }

    
    public final ChatEventHandler getEventHandler(MessageRow messageRow, Context context) {
        if (messageRow.getReactTag() != null) {
            return new ChatViewEventHandler(context, reactEvents, new MessageViewManagers$getEventHandler$1(messageRow));
        }
        return ChatEventHandler.Empty.INSTANCE;
    }

    
    public final void updateNodeSize(final ReactContext reactContext, final int i10, final int i11, final int i12) {
        reactContext.runOnNativeModulesQueueThread(new Runnable() { 
            @Override 
            public final void run() {
                MessageViewManagers.updateNodeSize$lambda$1(ReactContext.this, i10, i11, i12);
            }
        });
    }

    
    public static final void updateNodeSize$lambda$1(ReactContext this_updateNodeSize, int i10, int i11, int i12) {
        q.g(this_updateNodeSize, "$this_updateNodeSize");
        NativeModule nativeModule = this_updateNodeSize.getNativeModule(UIManagerModule.class);
        q.d(nativeModule);
        ((UIManagerModule) nativeModule).updateNodeSize(i10, i11, i12);
    }
}
