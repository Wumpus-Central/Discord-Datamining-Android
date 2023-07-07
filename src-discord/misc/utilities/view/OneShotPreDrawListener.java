package com.discord.misc.utilities.view;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB%\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\b\u0010\r\u001a\u00020\u0003H\u0016J\b\u0010\u000e\u001a\u00020\bH\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/discord/misc/utilities/view/OneShotPreDrawListener;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "proceedWithDrawingPass", "", "view", "Landroid/view/View;", "action", "Lkotlin/Function0;", "", "(ZLandroid/view/View;Lkotlin/jvm/functions/Function0;)V", "viewTreeObserver", "Landroid/view/ViewTreeObserver;", "kotlin.jvm.PlatformType", "onPreDraw", "removeListener", "Companion", "misc_utilities_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OneShotPreDrawListener implements ViewTreeObserver.OnPreDrawListener {
    public static final Companion Companion = new Companion(null);
    private final Function0<Unit> action;
    private final boolean proceedWithDrawingPass;
    private final View view;
    private ViewTreeObserver viewTreeObserver;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¨\u0006\f"}, d2 = {"Lcom/discord/misc/utilities/view/OneShotPreDrawListener$Companion;", "", "()V", "add", "Lcom/discord/misc/utilities/view/OneShotPreDrawListener;", "proceedWithDrawingPass", "", "view", "Landroid/view/View;", "action", "Lkotlin/Function0;", "", "misc_utilities_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final OneShotPreDrawListener add(boolean z10, View view, Function0<Unit> action) {
            q.g(view, "view");
            q.g(action, "action");
            OneShotPreDrawListener oneShotPreDrawListener = new OneShotPreDrawListener(z10, view, action, null);
            view.getViewTreeObserver().addOnPreDrawListener(oneShotPreDrawListener);
            return oneShotPreDrawListener;
        }
    }

    private OneShotPreDrawListener(boolean z10, View view, Function0<Unit> function0) {
        this.proceedWithDrawingPass = z10;
        this.view = view;
        this.action = function0;
        this.viewTreeObserver = view.getViewTreeObserver();
    }

    public /* synthetic */ OneShotPreDrawListener(boolean z10, View view, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, view, function0);
    }

    private final void removeListener() {
        if (this.viewTreeObserver.isAlive()) {
            this.viewTreeObserver.removeOnPreDrawListener(this);
        } else {
            this.view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        removeListener();
        this.action.invoke();
        return this.proceedWithDrawingPass;
    }
}
