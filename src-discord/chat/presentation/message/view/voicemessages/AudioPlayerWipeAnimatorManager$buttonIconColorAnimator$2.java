package com.discord.chat.presentation.message.view.voicemessages;

import android.animation.ValueAnimator;
import com.discord.chat.databinding.AudioPlayerViewBinding;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class AudioPlayerWipeAnimatorManager$buttonIconColorAnimator$2 extends s implements Function0<ValueAnimator> {
    final  AudioPlayerViewBinding $binding;

    
    
    public AudioPlayerWipeAnimatorManager$buttonIconColorAnimator$2(AudioPlayerViewBinding audioPlayerViewBinding) {
        super(0);
        this.$binding = audioPlayerViewBinding;
    }

    
    public static final void invoke$lambda$1$lambda$0(AudioPlayerViewBinding binding, ValueAnimator it) {
        q.h(binding, "$binding");
        q.h(it, "it");
        SimpleDraweeView simpleDraweeView = binding.button;
        q.g(simpleDraweeView, "binding.button");
        Object animatedValue = it.getAnimatedValue();
        q.f(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        ColorUtilsKt.setTintColor(simpleDraweeView, (Integer) animatedValue);
    }

    
    @Override 
    public final ValueAnimator invoke() {
        ValueAnimator ofArgb = ValueAnimator.ofArgb(-1, -16777216);
        final AudioPlayerViewBinding audioPlayerViewBinding = this.$binding;
        ofArgb.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { 
            @Override 
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AudioPlayerWipeAnimatorManager$buttonIconColorAnimator$2.invoke$lambda$1$lambda$0(AudioPlayerViewBinding.this, valueAnimator);
            }
        });
        return ofArgb;
    }
}
