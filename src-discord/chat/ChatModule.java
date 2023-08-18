package com.discord.chat;

import android.view.View;
import com.discord.chat.listmanager.ChatListManager;
import com.discord.chat.presentation.root.ChatView;
import com.discord.chatreplay.logger.ReleaseRowLogger;
import com.discord.chatreplay.logger.RowLogger;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.recycler_view.scroller.Scroller;
import com.discord.tti_manager.TTIMetrics;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.UIBlock;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.j;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.o1;
import kotlinx.coroutines.s2;
import kotlinx.coroutines.z;
import kotlinx.coroutines.z1;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.l;

@ReactModule(name = "DCDChatManager")
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b4\u00105J'\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0004\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0082\bJ>\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\tH\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\u000e\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002J \u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0007J\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u001a\u001a\u00020\u0006H\u0007J\b\u0010\u001b\u001a\u00020\u0006H\u0007J\u0010\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0016H\u0007J\u0018\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0016H\u0007J \u0010!\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0016H\u0007J \u0010#\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0016H\u0007J \u0010$\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0016H\u0007R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R \u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00100\u0082\u0002\u0004\n\u0002\b\u0019¨\u00066"}, d2 = {"Lcom/discord/chat/ChatModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "", "tag", "Lkotlin/Function1;", "Lcom/discord/chat/presentation/root/ChatView;", "", "block", "withChatView", "Lkotlin/Function2;", "Lcom/discord/chat/listmanager/ChatListManager;", "Lkotlin/coroutines/Continuation;", "", "withChatManager", "(ILkotlin/jvm/functions/Function2;)V", "Lcom/discord/chatreplay/logger/RowLogger;", "rowUpdateLoggerFor", "", "getName", "invalidate", "getChatListManager", "rowsJSON", "", "isLoadingAtTop", "updateRows", "clearRows", "greetCTAWillShow", "greetCTAWillHide", "fadeIn", "animated", "scrollToBottom", "scrollToTop", "offset", "scrollToRelativeOffset", "index", "scrollTo", "scrollIntoView", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "Lkotlinx/serialization/json/Json;", "json", "Lkotlinx/serialization/json/Json;", "Lkotlinx/coroutines/CoroutineScope;", "moduleScope", "Lkotlinx/coroutines/CoroutineScope;", "", "listManagers", "Ljava/util/Map;", "previousRowUpdateTag", "I", "rowUpdateLoggers", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class ChatModule extends ReactContextBaseJavaModule {
    private final CoroutineScope moduleScope;
    private final ReactApplicationContext reactContext;
    private final Json json = l.b(null, ChatModule$json$1.INSTANCE, 1, null);
    private final Map<Integer, ChatListManager> listManagers = new LinkedHashMap();
    private int previousRowUpdateTag = -1;
    private final Map<Integer, RowLogger> rowUpdateLoggers = new LinkedHashMap();

    
    public ChatModule(ReactApplicationContext reactContext) {
        super(reactContext);
        q.h(reactContext, "reactContext");
        this.reactContext = reactContext;
        z b10 = s2.b(null, 1, null);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        q.g(newSingleThreadExecutor, "newSingleThreadExecutor()");
        this.moduleScope = m0.a(b10.e0(o1.a(newSingleThreadExecutor)));
    }

    
    public final RowLogger rowUpdateLoggerFor(int i10) {
        Map<Integer, RowLogger> map = this.rowUpdateLoggers;
        Integer valueOf = Integer.valueOf(i10);
        RowLogger rowLogger = map.get(valueOf);
        if (rowLogger == null) {
            rowLogger = new ReleaseRowLogger();
            map.put(valueOf, rowLogger);
        }
        return rowLogger;
    }

    private final void withChatManager(int i10, Function2<? super ChatListManager, ? super Continuation<? super Unit>, ? extends Object> function2) {
        j.d(this.moduleScope, null, null, new ChatModule$withChatManager$1(function2, getChatListManager(i10), null), 3, null);
    }

    private final void withChatView(final int i10, final Function1<? super ChatView, Unit> function1) {
        NativeModule nativeModule = this.reactContext.getNativeModule(UIManagerModule.class);
        q.e(nativeModule);
        ((UIManagerModule) nativeModule).addUIBlock(new UIBlock() { 
            @Override 
            public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                Function1 function12 = Function1.this;
                View resolveView = nativeViewHierarchyManager.resolveView(i10);
                if (resolveView != null) {
                    function12.invoke((ChatView) resolveView);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.discord.chat.presentation.root.ChatView");
            }
        });
    }

    @ReactMethod
    public final void clearRows(int i10) {
        withChatManager(i10, new ChatModule$clearRows$1(this, i10, null));
    }

    @ReactMethod
    public final void fadeIn(int i10) {
    }

    public final synchronized ChatListManager getChatListManager(int i10) {
        ChatListManager chatListManager;
        Map<Integer, ChatListManager> map = this.listManagers;
        Integer valueOf = Integer.valueOf(i10);
        chatListManager = map.get(valueOf);
        if (chatListManager == null) {
            chatListManager = new ChatListManager(this.moduleScope);
            map.put(valueOf, chatListManager);
        }
        return chatListManager;
    }

    @Override 
    public String getName() {
        return "DCDChatManager";
    }

    @ReactMethod
    public final void greetCTAWillHide() {
    }

    @ReactMethod
    public final void greetCTAWillShow() {
    }

    @Override 
    public void invalidate() {
        super.invalidate();
        CoroutineContext coroutineContext = this.moduleScope.getCoroutineContext();
        String simpleName = ChatModule.class.getSimpleName();
        z1.e(coroutineContext, new CancellationException(simpleName + " invalidate()"));
    }

    @ReactMethod
    public final void scrollIntoView(final int i10, final int i11, final boolean z10) {
        NativeModule nativeModule = this.reactContext.getNativeModule(UIManagerModule.class);
        q.e(nativeModule);
        ((UIManagerModule) nativeModule).addUIBlock(new UIBlock() { 
            @Override 
            public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View resolveView = nativeViewHierarchyManager.resolveView(i10);
                if (resolveView != null) {
                    ((ChatView) resolveView).scrollTo(i11, Scroller.TargetAlignment.Anywhere.INSTANCE, z10, false);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.discord.chat.presentation.root.ChatView");
            }
        });
    }

    @ReactMethod
    public final void scrollTo(final int i10, final int i11, final boolean z10) {
        NativeModule nativeModule = this.reactContext.getNativeModule(UIManagerModule.class);
        q.e(nativeModule);
        ((UIManagerModule) nativeModule).addUIBlock(new UIBlock() { 
            @Override 
            public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View resolveView = nativeViewHierarchyManager.resolveView(i10);
                if (resolveView != null) {
                    ((ChatView) resolveView).scrollTo(i11, new Scroller.TargetAlignment.Top(SizeUtilsKt.getDpToPx(4)), z10, false);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.discord.chat.presentation.root.ChatView");
            }
        });
    }

    @ReactMethod
    public final void scrollToBottom(final int i10, final boolean z10) {
        NativeModule nativeModule = this.reactContext.getNativeModule(UIManagerModule.class);
        q.e(nativeModule);
        ((UIManagerModule) nativeModule).addUIBlock(new UIBlock() { 
            @Override 
            public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View resolveView = nativeViewHierarchyManager.resolveView(i10);
                if (resolveView != null) {
                    ((ChatView) resolveView).scrollTo(0, Scroller.TargetAlignment.Anywhere.INSTANCE, z10, false);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.discord.chat.presentation.root.ChatView");
            }
        });
    }

    @ReactMethod
    public final void scrollToRelativeOffset(int i10, int i11, boolean z10) {
    }

    @ReactMethod
    public final void scrollToTop(int i10, boolean z10) {
    }

    @ReactMethod
    public final void updateRows(int i10, String rowsJSON, boolean z10) {
        q.h(rowsJSON, "rowsJSON");
        TTIMetrics.record$default(TTIMetrics.INSTANCE, "ChatModule.updateRows() Start", 0L, null, false, 14, null);
        withChatManager(i10, new ChatModule$updateRows$1(this, i10, rowsJSON, null));
    }
}
