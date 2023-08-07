package com.discord.chat.presentation.media;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ&\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000bR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/discord/chat/presentation/media/AttachStateManager;", "", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "currentListener", "Landroid/view/View$OnAttachStateChangeListener;", "cancel", "", "onAttachStateChange", "onAttach", "Lkotlin/Function0;", "onDetach", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class AttachStateManager {
    private View.OnAttachStateChangeListener currentListener;
    private final View view;

    public AttachStateManager(View view) {
        q.h(view, "view");
        this.view = view;
    }

    
    public static  void onAttachStateChange$default(AttachStateManager attachStateManager, Function0 function0, Function0 function02, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function0 = AttachStateManager$onAttachStateChange$1.INSTANCE;
        }
        if ((i10 & 2) != 0) {
            function02 = AttachStateManager$onAttachStateChange$2.INSTANCE;
        }
        attachStateManager.onAttachStateChange(function0, function02);
    }

    public final void cancel() {
        this.view.removeOnAttachStateChangeListener(this.currentListener);
        this.currentListener = null;
    }

    public final void onAttachStateChange(final Function0<Unit> onAttach, final Function0<Unit> onDetach) {
        q.h(onAttach, "onAttach");
        q.h(onDetach, "onDetach");
        this.view.removeOnAttachStateChangeListener(this.currentListener);
        View.OnAttachStateChangeListener attachStateManager$onAttachStateChange$3 = new View.OnAttachStateChangeListener() { 
            @Override 
            public void onViewAttachedToWindow(View view) {
                q.h(view, "view");
                onAttach.invoke();
            }

            @Override 
            public void onViewDetachedFromWindow(View view) {
                q.h(view, "view");
                onDetach.invoke();
            }
        };
        this.currentListener = attachStateManager$onAttachStateChange$3;
        this.view.addOnAttachStateChangeListener(attachStateManager$onAttachStateChange$3);
    }
}
