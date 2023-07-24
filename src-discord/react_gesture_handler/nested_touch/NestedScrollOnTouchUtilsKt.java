package com.discord.react_gesture_handler.nested_touch;

import android.view.View;
import android.widget.TextView;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a\u0016\u0010\f\u001a\u00020\r*\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007\u001a \u0010\u0011\u001a\u00020\r*\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u0007\u001a \u0010\u0013\u001a\u00020\r*\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\tH\u0007\u001a\f\u0010\u0015\u001a\u00020\r*\u00020\u0002H\u0002\u001a\f\u0010\u0016\u001a\u00020\t*\u00020\tH\u0002\"&\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\"&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u0001X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0005\"\u0004\b\u000b\u0010\u0007¨\u0006\u0017"}, d2 = {"viewClickListeners", "Ljava/util/WeakHashMap;", "Landroid/view/View;", "Landroid/view/View$OnClickListener;", "getViewClickListeners", "()Ljava/util/WeakHashMap;", "setViewClickListeners", "(Ljava/util/WeakHashMap;)V", "viewLongClickListeners", "Landroid/view/View$OnLongClickListener;", "getViewLongClickListeners", "setViewLongClickListeners", "enableNestedSpanClickListener", "", "Landroid/widget/TextView;", "viewManagesAccessibility", "", "setOnClickListenerNested", "onClickListener", "setOnLongClickListenerNested", "onLongPress", "updateClickablity", "updateWithOngoingGestureCancelling", "react_gesture_handler_release"}, k = 2, mv = {1, 8, 0}, xi = 48)

public final class NestedScrollOnTouchUtilsKt {
    private static WeakHashMap<View, View.OnClickListener> viewClickListeners = new WeakHashMap<>();
    private static WeakHashMap<View, View.OnLongClickListener> viewLongClickListeners = new WeakHashMap<>();

    public static final void enableNestedSpanClickListener(TextView textView, boolean z10) {
        q.g(textView, "<this>");
        textView.setOnTouchListener(new NestedScrollOnTouchListener(textView, z10));
    }

    public static  void enableNestedSpanClickListener$default(TextView textView, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        enableNestedSpanClickListener(textView, z10);
    }

    public static final WeakHashMap<View, View.OnClickListener> getViewClickListeners() {
        return viewClickListeners;
    }

    public static final WeakHashMap<View, View.OnLongClickListener> getViewLongClickListeners() {
        return viewLongClickListeners;
    }

    public static final void setOnClickListenerNested(View view, boolean z10, View.OnClickListener onClickListener) {
        q.g(view, "<this>");
        if (onClickListener == null) {
            viewClickListeners.remove(view);
        } else {
            viewClickListeners.put(view, onClickListener);
        }
        view.setOnTouchListener(new NestedScrollOnTouchListener(view, z10));
        updateClickablity(view);
    }

    public static  void setOnClickListenerNested$default(View view, boolean z10, View.OnClickListener onClickListener, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        setOnClickListenerNested(view, z10, onClickListener);
    }

    public static final void setOnLongClickListenerNested(View view, boolean z10, View.OnLongClickListener onLongClickListener) {
        q.g(view, "<this>");
        if (onLongClickListener == null) {
            viewLongClickListeners.remove(view);
        } else {
            viewLongClickListeners.put(view, updateWithOngoingGestureCancelling(onLongClickListener));
        }
        view.setOnTouchListener(new NestedScrollOnTouchListener(view, z10));
        updateClickablity(view);
    }

    public static  void setOnLongClickListenerNested$default(View view, boolean z10, View.OnLongClickListener onLongClickListener, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        setOnLongClickListenerNested(view, z10, onLongClickListener);
    }

    public static final void setViewClickListeners(WeakHashMap<View, View.OnClickListener> weakHashMap) {
        q.g(weakHashMap, "<set-?>");
        viewClickListeners = weakHashMap;
    }

    public static final void setViewLongClickListeners(WeakHashMap<View, View.OnLongClickListener> weakHashMap) {
        q.g(weakHashMap, "<set-?>");
        viewLongClickListeners = weakHashMap;
    }

    private static final void updateClickablity(View view) {
        boolean z10;
        if (viewClickListeners.containsKey(view) || viewLongClickListeners.containsKey(view)) {
            z10 = true;
        } else {
            z10 = false;
        }
        view.setClickable(z10);
        view.setFocusable(z10);
    }

    private static final View.OnLongClickListener updateWithOngoingGestureCancelling(final View.OnLongClickListener onLongClickListener) {
        return new View.OnLongClickListener() { 
            @Override 
            public final boolean onLongClick(View view) {
                boolean updateWithOngoingGestureCancelling$lambda$1;
                updateWithOngoingGestureCancelling$lambda$1 = NestedScrollOnTouchUtilsKt.updateWithOngoingGestureCancelling$lambda$1(onLongClickListener, view);
                return updateWithOngoingGestureCancelling$lambda$1;
            }
        };
    }

    
    
    
    
    
    
    
    
    
    public static final boolean updateWithOngoingGestureCancelling$lambda$1(android.view.View.OnLongClickListener r4, android.view.View r5) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt.updateWithOngoingGestureCancelling$lambda$1(android.view.View$OnLongClickListener, android.view.View):boolean");
    }
}
