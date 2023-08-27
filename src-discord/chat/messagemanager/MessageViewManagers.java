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
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.DCDGuildFeedMessageItemViewManagerDelegate;
import com.facebook.react.viewmanagers.DCDGuildFeedMessageItemViewManagerInterface;
import com.facebook.react.viewmanagers.DCDGuildMultilineSystemMessageViewManagerDelegate;
import com.facebook.react.viewmanagers.DCDGuildMultilineSystemMessageViewManagerInterface;
import com.facebook.react.viewmanagers.DCDMessageViewManagerDelegate;
import com.facebook.react.viewmanagers.DCDMessageViewManagerInterface;
import com.facebook.react.viewmanagers.DCDSystemMessageViewManagerDelegate;
import com.facebook.react.viewmanagers.DCDSystemMessageViewManagerInterface;
import java.util.Map;
import jf.x;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.l;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0016\u0017\u0018\u0019B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0014\u0010\u000b\u001a\u00020\f*\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J$\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/discord/chat/messagemanager/MessageViewManagers;", "", "()V", "json", "Lkotlinx/serialization/json/Json;", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "convertRowJsonToMessageRow", "Lcom/discord/chat/bridge/row/MessageRow;", "rowJson", "", "getEventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "context", "Landroid/content/Context;", "updateNodeSize", "", "Lcom/facebook/react/bridge/ReactContext;", "id", "", "width", "height", "GuildMultilineSystemMessageViewManager", "MessageBundleViewManager", "MessageViewManager", "SystemMessageViewManager", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class MessageViewManagers {
    public static final MessageViewManagers INSTANCE = new MessageViewManagers();
    private static final Json json = l.b(null, MessageViewManagers$json$1.INSTANCE, 1, null);
    private static final ReactEvents reactEvents;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00142\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0004:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014J0\u0010\r\u001a*\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \b*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007H\u0014J\b\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u000fH\u0017R6\u0010\u0006\u001a*\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \b*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/discord/chat/messagemanager/MessageViewManagers$GuildMultilineSystemMessageViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/discord/misc/utilities/measure/ViewMeasuringWrapper;", "Lcom/discord/chat/presentation/message/MessageView;", "Lcom/facebook/react/viewmanagers/DCDGuildMultilineSystemMessageViewManagerInterface;", "()V", "delegate", "Lcom/facebook/react/viewmanagers/DCDGuildMultilineSystemMessageViewManagerDelegate;", "kotlin.jvm.PlatformType", "createViewInstance", "", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getDelegate", "getName", "", "setRow", "", "view", "value", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ReactModule(name = GuildMultilineSystemMessageViewManager.NAME)
    
    public static final class GuildMultilineSystemMessageViewManager extends ViewGroupManager<ViewMeasuringWrapper<MessageView>> implements DCDGuildMultilineSystemMessageViewManagerInterface<ViewMeasuringWrapper<MessageView>> {
        public static final Companion Companion = new Companion(null);
        public static final String NAME = "DCDGuildMultilineSystemMessageView";
        private final DCDGuildMultilineSystemMessageViewManagerDelegate<ViewMeasuringWrapper<MessageView>, GuildMultilineSystemMessageViewManager> delegate = new DCDGuildMultilineSystemMessageViewManagerDelegate<>(this);

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/discord/chat/messagemanager/MessageViewManagers$GuildMultilineSystemMessageViewManager$Companion;", "", "()V", "NAME", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        
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
        protected Void createViewInstance(ThemedReactContext reactContext) {
            q.h(reactContext, "reactContext");
            throw new UnsupportedOperationException("multiline system messages are not supported.");
        }

        
        @Override 
        public DCDGuildMultilineSystemMessageViewManagerDelegate<ViewMeasuringWrapper<MessageView>, GuildMultilineSystemMessageViewManager> getDelegate() {
            return this.delegate;
        }

        @ReactProp(name = "row")
        public void setRow(ViewMeasuringWrapper<MessageView> view, String str) {
            q.h(view, "view");
            throw new UnsupportedOperationException("multiline system messages are not supported.");
        }
    }

    @Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 -2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0004:\u0001-B\u0005¢\u0006\u0002\u0010\u0005J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0014J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J%\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J-\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#J0\u0010$\u001a*\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \b*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007H\u0014J\u0014\u0010%\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0&H\u0016J\b\u0010)\u001a\u00020'H\u0016J \u0010*\u001a\u00020\u00162\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010,\u001a\u0004\u0018\u00010'H\u0017R6\u0010\u0006\u001a*\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \b*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006."}, d2 = {"Lcom/discord/chat/messagemanager/MessageViewManagers$MessageBundleViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/discord/misc/utilities/measure/ViewMeasuringWrapper;", "Lcom/discord/chat/presentation/list/messagebundling/MessageBundleView;", "Lcom/facebook/react/viewmanagers/DCDGuildFeedMessageItemViewManagerInterface;", "()V", "delegate", "Lcom/facebook/react/viewmanagers/DCDGuildFeedMessageItemViewManagerDelegate;", "kotlin.jvm.PlatformType", "messageAccessoriesViewPool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "messageRowViewPool", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "emitOnLongPressItem", "", "view", "Landroid/view/View;", "emitOnTapItem", "", "emitOnTapReply", "messageId", "Lcom/discord/primitives/MessageId;", "emitOnTapReply-Ayv7vGE", "(Landroid/view/View;Ljava/lang/String;)V", "emitOnTapViewMoreText", "emitOnTruncateMessage", "context", "Landroid/content/Context;", "reactTag", "", "emitOnTruncateMessage-JPrav84", "(Landroid/content/Context;ILjava/lang/String;)V", "getDelegate", "getExportedCustomDirectEventTypeConstants", "", "", "", "getName", "setData", "wrappedView", "value", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ReactModule(name = MessageBundleViewManager.NAME)
    
    public static final class MessageBundleViewManager extends ViewGroupManager<ViewMeasuringWrapper<MessageBundleView>> implements DCDGuildFeedMessageItemViewManagerInterface<ViewMeasuringWrapper<MessageBundleView>> {
        public static final Companion Companion = new Companion(null);
        public static final String NAME = "DCDGuildFeedMessageItemView";
        private final RecyclerView.RecycledViewPool messageRowViewPool;
        private final DCDGuildFeedMessageItemViewManagerDelegate<ViewMeasuringWrapper<MessageBundleView>, MessageBundleViewManager> delegate = new DCDGuildFeedMessageItemViewManagerDelegate<>(this);
        private final ReactEvents reactEvents = new ReactEvents(x.a("onTapItem", f0.b(OnTapMessageBundleItemData.class)), x.a("onLongPressItem", f0.b(OnLongPressMessageBundleItemData.class)), x.a("onTruncateMessage", f0.b(OnTruncateMessageData.class)), x.a("onTapReplyItem", f0.b(OnTapReplyItemData.class)), x.a("onTapViewMoreText", f0.b(OnTapViewMoreTextData.class)));
        private final RecyclerView.RecycledViewPool messageAccessoriesViewPool = ChatListUtilsKt.getMessageAccessoriesViewPool();

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/discord/chat/messagemanager/MessageViewManagers$MessageBundleViewManager$Companion;", "", "()V", "NAME", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        
        public static final class Companion {
            private Companion() {
            }

            public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public MessageBundleViewManager() {
            RecyclerView.RecycledViewPool recycledViewPool = new RecyclerView.RecycledViewPool();
            recycledViewPool.k(0, 50);
            this.messageRowViewPool = recycledViewPool;
        }

        private final boolean emitOnLongPressItem(View view) {
            ReactEvents reactEvents = this.reactEvents;
            Context context = view.getContext();
            q.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            reactEvents.emitEvent((ReactContext) context, view, new OnLongPressMessageBundleItemData());
            return true;
        }

        private final void emitOnTapItem(View view) {
            ReactEvents reactEvents = this.reactEvents;
            Context context = view.getContext();
            q.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            reactEvents.emitEvent((ReactContext) context, view, new OnTapMessageBundleItemData());
        }

        
        
        public final void m152emitOnTapReplyAyv7vGE(View view, String str) {
            ReactEvents reactEvents = this.reactEvents;
            Context context = view.getContext();
            q.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            reactEvents.emitEvent((ReactContext) context, view, new OnTapReplyItemData(str, null));
        }

        private final void emitOnTapViewMoreText(View view) {
            ReactEvents reactEvents = this.reactEvents;
            Context context = view.getContext();
            q.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            reactEvents.emitEvent((ReactContext) context, view, new OnTapViewMoreTextData());
        }

        
        
        public final void m153emitOnTruncateMessageJPrav84(Context context, int i10, String str) {
            this.reactEvents.emitEvent(context, new OnTruncateMessageData(str, null), i10);
        }

        
        public static final void setData$lambda$6$lambda$3(MessageBundleViewManager this$0, ViewMeasuringWrapper wrappedView, View view) {
            q.h(this$0, "this$0");
            q.h(wrappedView, "$wrappedView");
            this$0.emitOnTapItem(wrappedView);
        }

        
        public static final boolean setData$lambda$6$lambda$4(MessageBundleViewManager this$0, ViewMeasuringWrapper wrappedView, View view) {
            q.h(this$0, "this$0");
            q.h(wrappedView, "$wrappedView");
            return this$0.emitOnLongPressItem(wrappedView);
        }

        
        public static final void setData$lambda$6$lambda$5(MessageBundleViewManager this$0, ViewMeasuringWrapper wrappedView, View view) {
            q.h(this$0, "this$0");
            q.h(wrappedView, "$wrappedView");
            this$0.emitOnTapViewMoreText(wrappedView);
        }

        @Override 
        public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
            return this.reactEvents.exportEventConstants();
        }

        @Override 
        public String getName() {
            return NAME;
        }

        
        @Override 
        public ViewMeasuringWrapper<MessageBundleView> createViewInstance(ThemedReactContext reactContext) {
            q.h(reactContext, "reactContext");
            ViewMeasuringWrapper<MessageBundleView> viewMeasuringWrapper = new ViewMeasuringWrapper<>(new MessageBundleView(reactContext, null, 0, 6, null), new MessageViewManagers$MessageBundleViewManager$createViewInstance$1(reactContext));
            MessageBundleView view = viewMeasuringWrapper.getView();
            view.setMessageRowViewPool(this.messageRowViewPool);
            view.setMessageAccessoriesViewPool(this.messageAccessoriesViewPool);
            view.setOnTruncateMessage(new MessageViewManagers$MessageBundleViewManager$createViewInstance$2$1$1(this, view, viewMeasuringWrapper));
            return viewMeasuringWrapper;
        }

        
        @Override 
        public DCDGuildFeedMessageItemViewManagerDelegate<ViewMeasuringWrapper<MessageBundleView>, MessageBundleViewManager> getDelegate() {
            return this.delegate;
        }

        @ReactProp(name = "data")
        public void setData(final ViewMeasuringWrapper<MessageBundleView> wrappedView, String str) {
            q.h(wrappedView, "wrappedView");
            if (str != null) {
                Json json = MessageViewManagers.json;
                json.a();
                wrappedView.getView().setBundle((MessageBundleView.MessageBundle) json.b(MessageBundleView.MessageBundle.Companion.serializer(), str), new View.OnClickListener() { 
                    @Override 
                    public final void onClick(View view) {
                        MessageViewManagers.MessageBundleViewManager.setData$lambda$6$lambda$3(MessageViewManagers.MessageBundleViewManager.this, wrappedView, view);
                    }
                }, new View.OnLongClickListener() { 
                    @Override 
                    public final boolean onLongClick(View view) {
                        boolean data$lambda$6$lambda$4;
                        data$lambda$6$lambda$4 = MessageViewManagers.MessageBundleViewManager.setData$lambda$6$lambda$4(MessageViewManagers.MessageBundleViewManager.this, wrappedView, view);
                        return data$lambda$6$lambda$4;
                    }
                }, new MessageViewManagers$MessageBundleViewManager$setData$1$3(this, wrappedView), new View.OnClickListener() { 
                    @Override 
                    public final void onClick(View view) {
                        MessageViewManagers.MessageBundleViewManager.setData$lambda$6$lambda$5(MessageViewManagers.MessageBundleViewManager.this, wrappedView, view);
                    }
                });
            }
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00132\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0004:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0005J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0014J0\u0010\f\u001a*\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \b*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007H\u0014J\b\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u000eH\u0017R6\u0010\u0006\u001a*\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \b*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/discord/chat/messagemanager/MessageViewManagers$MessageViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/discord/misc/utilities/measure/ViewMeasuringWrapper;", "Lcom/discord/chat/presentation/message/DecoratedMessageView;", "Lcom/facebook/react/viewmanagers/DCDMessageViewManagerInterface;", "()V", "delegate", "Lcom/facebook/react/viewmanagers/DCDMessageViewManagerDelegate;", "kotlin.jvm.PlatformType", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getDelegate", "getName", "", "setRow", "", "wrappedView", "value", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ReactModule(name = MessageViewManager.NAME)
    
    public static final class MessageViewManager extends ViewGroupManager<ViewMeasuringWrapper<DecoratedMessageView>> implements DCDMessageViewManagerInterface<ViewMeasuringWrapper<DecoratedMessageView>> {
        public static final Companion Companion = new Companion(null);
        public static final String NAME = "DCDMessageView";
        private final DCDMessageViewManagerDelegate<ViewMeasuringWrapper<DecoratedMessageView>, MessageViewManager> delegate = new DCDMessageViewManagerDelegate<>(this);

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/discord/chat/messagemanager/MessageViewManagers$MessageViewManager$Companion;", "", "()V", "NAME", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        
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
        public ViewMeasuringWrapper<DecoratedMessageView> createViewInstance(ThemedReactContext reactContext) {
            q.h(reactContext, "reactContext");
            return new ViewMeasuringWrapper<>(new DecoratedMessageView(reactContext, null, 2, null), new MessageViewManagers$MessageViewManager$createViewInstance$1(reactContext));
        }

        
        @Override 
        public DCDMessageViewManagerDelegate<ViewMeasuringWrapper<DecoratedMessageView>, MessageViewManager> getDelegate() {
            return this.delegate;
        }

        @ReactProp(name = "row")
        public void setRow(ViewMeasuringWrapper<DecoratedMessageView> wrappedView, String str) {
            q.h(wrappedView, "wrappedView");
            if (str != null) {
                MessageViewManagers messageViewManagers = MessageViewManagers.INSTANCE;
                MessageRow convertRowJsonToMessageRow = messageViewManagers.convertRowJsonToMessageRow(str);
                MessageFrame messageFrame = convertRowJsonToMessageRow.getMessageFrame();
                if ((messageFrame != null ? messageFrame.getType() : null) == MessageFrameType.MEDIA_VIEWER_MESSAGE_FRAME) {
                    ThemeManager themeManager = ThemeManager.INSTANCE;
                    themeManager.setThemeOverride(themeManager.getDarkTheme());
                }
                DecoratedMessageView view = wrappedView.getView();
                MessageBase message = convertRowJsonToMessageRow.getMessage();
                q.f(message, "null cannot be cast to non-null type com.discord.chat.bridge.Message");
                MessageContext messageContext = MessageContextKt.getMessageContext(convertRowJsonToMessageRow);
                MessageFrame messageFrame2 = convertRowJsonToMessageRow.getMessageFrame();
                Context context = wrappedView.getContext();
                q.g(context, "wrappedView.context");
                DecoratedMessageView.setMessage$default(view, (Message) message, messageContext, messageFrame2, messageViewManagers.getEventHandler(convertRowJsonToMessageRow, context), null, null, false, convertRowJsonToMessageRow.isHighlight(), false, 368, null);
                ThemeManager.INSTANCE.setThemeOverride(null);
            }
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00132\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0004:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0005J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0014J0\u0010\f\u001a*\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \b*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007H\u0014J\b\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u000eH\u0017R6\u0010\u0006\u001a*\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \b*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/discord/chat/messagemanager/MessageViewManagers$SystemMessageViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/discord/misc/utilities/measure/ViewMeasuringWrapper;", "Lcom/discord/chat/presentation/message/system/SystemMessageWrapperView;", "Lcom/facebook/react/viewmanagers/DCDSystemMessageViewManagerInterface;", "()V", "delegate", "Lcom/facebook/react/viewmanagers/DCDSystemMessageViewManagerDelegate;", "kotlin.jvm.PlatformType", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getDelegate", "getName", "", "setRow", "", "wrappedView", "value", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ReactModule(name = SystemMessageViewManager.NAME)
    
    public static final class SystemMessageViewManager extends ViewGroupManager<ViewMeasuringWrapper<SystemMessageWrapperView>> implements DCDSystemMessageViewManagerInterface<ViewMeasuringWrapper<SystemMessageWrapperView>> {
        public static final Companion Companion = new Companion(null);
        public static final String NAME = "DCDSystemMessageView";
        private final DCDSystemMessageViewManagerDelegate<ViewMeasuringWrapper<SystemMessageWrapperView>, SystemMessageViewManager> delegate = new DCDSystemMessageViewManagerDelegate<>(this);

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/discord/chat/messagemanager/MessageViewManagers$SystemMessageViewManager$Companion;", "", "()V", "NAME", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        
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
        public ViewMeasuringWrapper<SystemMessageWrapperView> createViewInstance(ThemedReactContext reactContext) {
            q.h(reactContext, "reactContext");
            return new ViewMeasuringWrapper<>(new SystemMessageWrapperView(reactContext, null, 2, null), new MessageViewManagers$SystemMessageViewManager$createViewInstance$1(reactContext));
        }

        
        @Override 
        public DCDSystemMessageViewManagerDelegate<ViewMeasuringWrapper<SystemMessageWrapperView>, SystemMessageViewManager> getDelegate() {
            return this.delegate;
        }

        @ReactProp(name = "row")
        public void setRow(ViewMeasuringWrapper<SystemMessageWrapperView> wrappedView, String str) {
            q.h(wrappedView, "wrappedView");
            if (str != null) {
                MessageViewManagers messageViewManagers = MessageViewManagers.INSTANCE;
                MessageRow convertRowJsonToMessageRow = messageViewManagers.convertRowJsonToMessageRow(str);
                MessageBase message = convertRowJsonToMessageRow.getMessage();
                q.f(message, "null cannot be cast to non-null type com.discord.chat.bridge.Message");
                MessageContext messageContext = MessageContextKt.getMessageContext(convertRowJsonToMessageRow);
                Context context = wrappedView.getContext();
                q.g(context, "wrappedView.context");
                wrappedView.getView().setMessage((Message) message, messageContext, messageViewManagers.getEventHandler(convertRowJsonToMessageRow, context));
            }
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
        q.f(b10, "null cannot be cast to non-null type com.discord.chat.bridge.row.MessageRow");
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
        q.h(this_updateNodeSize, "$this_updateNodeSize");
        NativeModule nativeModule = this_updateNodeSize.getNativeModule(UIManagerModule.class);
        q.e(nativeModule);
        ((UIManagerModule) nativeModule).updateNodeSize(i10, i11, i12);
    }
}
