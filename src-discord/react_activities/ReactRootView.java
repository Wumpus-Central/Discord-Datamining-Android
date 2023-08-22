package com.discord.react_activities;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0010H\u0016R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR.\u0010\f\u001a\u001c\u0012\u0004\u0012\u00020\u000e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f0\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001b"}, d2 = {"Lcom/discord/react_activities/ReactRootView;", "Lcom/facebook/react/ReactRootView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "exclusionRects", "", "Landroid/graphics/Rect;", "getExclusionRects$react_activity_release", "()Ljava/util/List;", "setExclusionRects$react_activity_release", "(Ljava/util/List;)V", "onInterceptTouchEventListeners", "Ljava/util/WeakHashMap;", "Landroid/view/View;", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "getOnInterceptTouchEventListeners$react_activity_release", "()Ljava/util/WeakHashMap;", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "onInterceptTouchEvent", "", "e", "Companion", "react_activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class ReactRootView extends com.facebook.react.ReactRootView {
    public static final Companion Companion = new Companion(null);
    private static final List<Rect> EMPTY_EXCLUSION_RECTS;
    private List<Rect> exclusionRects = EMPTY_EXCLUSION_RECTS;
    private final WeakHashMap<View, Function1<MotionEvent, Unit>> onInterceptTouchEventListeners = new WeakHashMap<>();

    static {
        List<Rect> d10;
        d10 = i.d(new Rect(0, 0, 0, 0));
        EMPTY_EXCLUSION_RECTS = d10;
    }

    
    public ReactRootView(Context context) {
        super(context);
        q.h(context, "context");
    }

    @Override 
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(this.exclusionRects);
        }
    }

    public final List<Rect> getExclusionRects$react_activity_release() {
        return this.exclusionRects;
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

    public final void setExclusionRects$react_activity_release(List<Rect> list) {
        q.h(list, "<set-?>");
        this.exclusionRects = list;
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000bJ\u001c\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u000fH\u0002J\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\tH\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/discord/react_activities/ReactRootView$Companion;", "", "()V", "EMPTY_EXCLUSION_RECTS", "", "Landroid/graphics/Rect;", "setOnInterceptTouchEvent", "", "view", "Landroid/view/View;", "callback", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "setSystemGestureExclusionRects", "context", "Landroid/content/Context;", "exclusionRects", "getReactRootView", "Lcom/discord/react_activities/ReactRootView;", "react_activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final ReactRootView getReactRootView(Context context) {
            Activity currentActivity;
            ReactContext reactContext = context instanceof ReactContext ? (ReactContext) context : null;
            if (reactContext == null || (currentActivity = reactContext.getCurrentActivity()) == null) {
                return null;
            }
            return ((ReactActivity) currentActivity).getRootView$react_activity_release();
        }

        
        public final void setOnInterceptTouchEvent(View view, Function1<? super MotionEvent, Unit> function1) {
            q.h(view, "view");
            ReactRootView reactRootView = getReactRootView(view);
            if (reactRootView != null) {
                reactRootView.getOnInterceptTouchEventListeners$react_activity_release().put(view, function1);
            }
        }

        public final void setSystemGestureExclusionRects(Context context, List<Rect> exclusionRects) {
            q.h(context, "context");
            q.h(exclusionRects, "exclusionRects");
            ReactRootView reactRootView = getReactRootView(context);
            if (reactRootView != null) {
                if (exclusionRects.isEmpty()) {
                    reactRootView.setExclusionRects$react_activity_release(ReactRootView.EMPTY_EXCLUSION_RECTS);
                } else {
                    reactRootView.setExclusionRects$react_activity_release(exclusionRects);
                }
                reactRootView.invalidate();
            }
        }

        private final ReactRootView getReactRootView(View view) {
            Context context = view.getContext();
            q.g(context, "context");
            return getReactRootView(context);
        }
    }
}
