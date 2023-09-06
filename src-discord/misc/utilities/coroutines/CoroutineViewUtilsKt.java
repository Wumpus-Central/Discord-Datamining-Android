package com.discord.misc.utilities.coroutines;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.core.view.w0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.discord.misc.utilities.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;
import kotlinx.coroutines.CoroutineScope;
import qf.d;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0000\u001aC\u0010\u000f\u001a\u00020\f*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\"\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Landroid/view/View;", "", "verifyAttached", "Lcom/discord/misc/utilities/coroutines/AttachedViewCoroutineScope;", "attachedScope", "Landroidx/lifecycle/LifecycleOwner;", "requireLifecycleOwner", "Landroidx/lifecycle/Lifecycle$State;", "state", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "", "block", "repeatOnLifecycleOwner", "(Landroid/view/View;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAttachedScope", "(Landroid/view/View;)Lcom/discord/misc/utilities/coroutines/AttachedViewCoroutineScope;", "misc_utilities_release"}, k = 2, mv = {1, 8, 0})

public final class CoroutineViewUtilsKt {
    public static final AttachedViewCoroutineScope attachedScope(View view, boolean z10) {
        AttachedViewCoroutineScope attachedViewCoroutineScope;
        q.h(view, "<this>");
        if (!z10 || w0.T(view)) {
            int i10 = R.id.view_coroutine_scope;
            Object tag = view.getTag(i10);
            if (tag instanceof AttachedViewCoroutineScope) {
                attachedViewCoroutineScope = (AttachedViewCoroutineScope) tag;
            } else {
                attachedViewCoroutineScope = null;
            }
            if (attachedViewCoroutineScope != null) {
                return attachedViewCoroutineScope;
            }
            AttachedViewCoroutineScope attachedViewCoroutineScope2 = new AttachedViewCoroutineScope(view);
            view.setTag(i10, attachedViewCoroutineScope2);
            return attachedViewCoroutineScope2;
        }
        throw new IllegalStateException(("View not attached to window: " + view).toString());
    }

    public static final AttachedViewCoroutineScope getAttachedScope(View view) {
        q.h(view, "<this>");
        return attachedScope(view, false);
    }

    public static final Object repeatOnLifecycleOwner(View view, Lifecycle.State state, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object d10;
        Object b10 = RepeatOnLifecycleKt.b(requireLifecycleOwner(view), state, function2, continuation);
        d10 = d.d();
        return b10 == d10 ? b10 : Unit.f21436a;
    }

    public static final LifecycleOwner requireLifecycleOwner(View view) {
        q.h(view, "<this>");
        for (Context context = view.getContext(); context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof LifecycleOwner) {
                return (LifecycleOwner) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        throw new IllegalArgumentException("Failed to find LifecycleOwner for " + view);
    }
}
