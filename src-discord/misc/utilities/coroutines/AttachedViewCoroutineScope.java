package com.discord.misc.utilities.coroutines;

import android.view.View;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.q;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.j1;
import kotlinx.coroutines.x1;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eR\u0012\u0010\u0005\u001a\u00020\u0006X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/discord/misc/utilities/coroutines/AttachedViewCoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "cancelAllWork", "", "message", "", "cause", "", "misc_utilities_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class AttachedViewCoroutineScope implements CoroutineScope {
    private final  CoroutineScope $$delegate_0 = MainImmediateScopeKt.MainImmediateScope();

    public AttachedViewCoroutineScope(View view) {
        q.h(view, "view");
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { 
            @Override 
            public void onViewAttachedToWindow(View view2) {
                q.h(view2, "view");
            }

            @Override 
            public void onViewDetachedFromWindow(View view2) {
                q.h(view2, "view");
                AttachedViewCoroutineScope attachedViewCoroutineScope = AttachedViewCoroutineScope.this;
                AttachedViewCoroutineScope.cancelAllWork$default(attachedViewCoroutineScope, view2 + " detached from window", null, 2, null);
            }
        });
    }

    public static  void cancelAllWork$default(AttachedViewCoroutineScope attachedViewCoroutineScope, String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        attachedViewCoroutineScope.cancelAllWork(str, th2);
    }

    public final void cancelAllWork(String message, Throwable th2) {
        q.h(message, "message");
        x1.e(getCoroutineContext(), j1.a(message, th2));
    }

    @Override 
    public CoroutineContext getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }
}
