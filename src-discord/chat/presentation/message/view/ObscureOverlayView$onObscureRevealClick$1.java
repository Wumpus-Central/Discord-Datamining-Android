package com.discord.chat.presentation.message.view;

import android.transition.Fade;
import android.transition.TransitionManager;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.discord.chat.databinding.ObscureOverlayViewBinding;
import eightbitlab.com.blurview.BlurView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class ObscureOverlayView$onObscureRevealClick$1 extends s implements Function0<Unit> {
    final  boolean $showImage;
    final  ObscureOverlayView this$0;

    
    
    public ObscureOverlayView$onObscureRevealClick$1(ObscureOverlayView obscureOverlayView, boolean z10) {
        super(0);
        this.this$0 = obscureOverlayView;
        this.$showImage = z10;
    }

    @Override 
    
    public final void invoke2() {
        ViewParent viewParent;
        ObscureOverlayViewBinding obscureOverlayViewBinding;
        if (this.this$0.getParent().getParent() instanceof ViewGroup) {
            viewParent = this.this$0.getParent().getParent();
        } else {
            viewParent = this.this$0.getParent() instanceof ViewGroup ? this.this$0.getParent() : this.this$0;
        }
        q.f(viewParent, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) viewParent;
        Fade fade = new Fade(this.$showImage ? 2 : 1);
        fade.setDuration(150L);
        TransitionManager.beginDelayedTransition(viewGroup, fade);
        obscureOverlayViewBinding = this.this$0.binding;
        BlurView blurView = obscureOverlayViewBinding.blurView;
        q.g(blurView, "binding.blurView");
        blurView.setVisibility(this.$showImage ^ true ? 0 : 8);
        this.this$0.isObscureRevealed = this.$showImage;
    }
}
