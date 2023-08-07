package com.discord.react_activities;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tH\u0016R.\u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b0\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/discord/react_activities/ReactRootView;", "Lcom/facebook/react/ReactRootView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "onInterceptTouchEventListeners", "Ljava/util/WeakHashMap;", "Landroid/view/View;", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "getOnInterceptTouchEventListeners$react_activity_release", "()Ljava/util/WeakHashMap;", "onInterceptTouchEvent", "", "e", "Companion", "react_activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class ReactRootView extends com.facebook.react.ReactRootView {
    public static final Companion Companion = new Companion(null);
    private final WeakHashMap<View, Function1<MotionEvent, Unit>> onInterceptTouchEventListeners = new WeakHashMap<>();

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b¨\u0006\n"}, d2 = {"Lcom/discord/react_activities/ReactRootView$Companion;", "", "()V", "setOnInterceptTouchEvent", "", "view", "Landroid/view/View;", "callback", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "react_activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void setOnInterceptTouchEvent(View view, Function1<? super MotionEvent, Unit> function1) {
            ReactContext reactContext;
            Activity currentActivity;
            ReactRootView rootView$react_activity_release;
            q.h(view, "view");
            Context context = view.getContext();
            if (context instanceof ReactContext) {
                reactContext = (ReactContext) context;
            } else {
                reactContext = null;
            }
            if (reactContext != null && (currentActivity = reactContext.getCurrentActivity()) != null && (rootView$react_activity_release = ((ReactActivity) currentActivity).getRootView$react_activity_release()) != null) {
                rootView$react_activity_release.getOnInterceptTouchEventListeners$react_activity_release().put(view, function1);
            }
        }
    }

    
    public ReactRootView(Context context) {
        super(context);
        q.h(context, "context");
    }

    public final WeakHashMap<View, Function1<MotionEvent, Unit>> getOnInterceptTouchEventListeners$react_activity_release() {
        return this.onInterceptTouchEventListeners;
    }

    @Override 
    public boolean onInterceptTouchEvent(MotionEvent e10) {
        q.h(e10, "e");
        for (Map.Entry<View, Function1<MotionEvent, Unit>> entry : this.onInterceptTouchEventListeners.entrySet()) {
            Function1<MotionEvent, Unit> value = entry.getValue();
            if (value != null) {
                value.invoke(e10);
            }
        }
        return super.onInterceptTouchEvent(e10);
    }
}
