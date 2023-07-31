package com.discord.chat.reactevents;

import android.content.Context;
import android.view.View;
import com.discord.chat.presentation.root.ChatView;
import com.discord.reactevents.ReactEvent;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.UIBlock;
import com.facebook.react.uimanager.UIManagerModule;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "event", "Lcom/discord/reactevents/ReactEvent;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class ChatViewEventHandler$emitReactEvent$1 extends s implements Function1<ReactEvent, Unit> {
    final  Context $context;
    final  ReactEvents $reactEvents;
    final  Function0<Integer> $reactTag;

    
    
    public ChatViewEventHandler$emitReactEvent$1(Context context, Function0<Integer> function0, ReactEvents reactEvents) {
        super(1);
        this.$context = context;
        this.$reactTag = function0;
        this.$reactEvents = reactEvents;
    }

    @Override 
    public   Unit invoke(ReactEvent reactEvent) {
        invoke2(reactEvent);
        return Unit.f20679a;
    }

    
    public final void invoke2(final ReactEvent event) {
        q.g(event, "event");
        Context context = this.$context;
        q.e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        final int intValue = this.$reactTag.invoke().intValue();
        final ReactEvents reactEvents = this.$reactEvents;
        final Context context2 = this.$context;
        NativeModule nativeModule = ((ReactContext) context).getNativeModule(UIManagerModule.class);
        q.d(nativeModule);
        ((UIManagerModule) nativeModule).addUIBlock(new UIBlock() { 
            @Override 
            public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View resolveView = nativeViewHierarchyManager.resolveView(intValue);
                if (resolveView != null) {
                    reactEvents.emitEvent((ReactContext) context2, (ChatView) resolveView, event);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.discord.chat.presentation.root.ChatView");
            }
        });
    }
}
