package com.discord.chat.presentation.message.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.transition.Transition;
import androidx.transition.c;
import androidx.transition.i;
import androidx.transition.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class SpoilerView$onClick$1 extends s implements Function0<Unit> {
    final  View $overlayView;
    final  boolean $showImage;
    final  SpoilerView this$0;

    
    
    public SpoilerView$onClick$1(SpoilerView spoilerView, boolean z10, View view) {
        super(0);
        this.this$0 = spoilerView;
        this.$showImage = z10;
        this.$overlayView = view;
    }

    @Override 
    
    public final void invoke2() {
        ViewParent viewParent;
        if (this.this$0.getParent().getParent() instanceof ViewGroup) {
            viewParent = this.this$0.getParent().getParent();
        } else {
            viewParent = this.this$0.getParent() instanceof ViewGroup ? this.this$0.getParent() : this.this$0;
        }
        q.f(viewParent, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) viewParent;
        c cVar = new c(this.$showImage ? 2 : 1);
        final boolean z10 = this.$showImage;
        final SpoilerView spoilerView = this.this$0;
        cVar.X(150L);
        cVar.b(new i() { 
            @Override 
            public void onTransitionEnd(Transition transition) {
                Function0 function0;
                Function0 function02;
                q.h(transition, "transition");
                if (z10) {
                    function02 = spoilerView.onReveal;
                    function02.invoke();
                    spoilerView.isOverlayVisible = false;
                    return;
                }
                function0 = spoilerView.onHide;
                function0.invoke();
                spoilerView.isOverlayVisible = true;
            }
        });
        j.a(viewGroup, cVar);
        this.$overlayView.setVisibility(this.$showImage ^ true ? 0 : 8);
    }
}
