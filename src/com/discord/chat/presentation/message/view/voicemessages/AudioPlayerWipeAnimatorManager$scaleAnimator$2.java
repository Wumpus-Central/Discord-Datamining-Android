package com.discord.chat.presentation.message.view.voicemessages;

import android.animation.ValueAnimator;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import com.discord.chat.databinding.AudioPlayerViewBinding;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9679s;
import kotlin.jvm.internal.C9677q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, m15073d2 = {"<anonymous>", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class AudioPlayerWipeAnimatorManager$scaleAnimator$2 extends AbstractC9679s implements Function0<ValueAnimator> {
    final /* synthetic */ AudioPlayerViewBinding $binding;
    final /* synthetic */ AudioPlayerWipeAnimatorManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioPlayerWipeAnimatorManager$scaleAnimator$2(AudioPlayerViewBinding audioPlayerViewBinding, AudioPlayerWipeAnimatorManager audioPlayerWipeAnimatorManager) {
        super(0);
        this.$binding = audioPlayerViewBinding;
        this.this$0 = audioPlayerWipeAnimatorManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1$lambda$0(AudioPlayerViewBinding binding, AudioPlayerWipeAnimatorManager this$0, ValueAnimator valueAnimator) {
        float f;
        Drawable buttonContainerDefaultDrawable;
        ColorDrawable buttonContainerActiveDrawable;
        Drawable buttonContainerDefaultDrawable2;
        ColorDrawable buttonContainerActiveDrawable2;
        C9677q.m14633g(binding, "$binding");
        C9677q.m14633g(this$0, "this$0");
        Object animatedValue = valueAnimator.getAnimatedValue();
        C9677q.m14635e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        if (binding.playerContainer.getWidth() <= 0 || binding.wipe.getWidth() <= 0) {
            f = 0.0f;
        } else {
            f = (binding.playerContainer.getWidth() / binding.wipe.getWidth()) * 2;
        }
        float f2 = 1;
        float f3 = (f * floatValue) + f2;
        binding.wipe.setScaleX(f3);
        binding.wipe.setScaleY(f3);
        buttonContainerDefaultDrawable = this$0.getButtonContainerDefaultDrawable();
        if (buttonContainerDefaultDrawable != null) {
            buttonContainerDefaultDrawable.setAlpha((int) ((f2 - floatValue) * 255));
        }
        buttonContainerActiveDrawable = this$0.getButtonContainerActiveDrawable();
        buttonContainerActiveDrawable.setAlpha((int) (floatValue * 255));
        View view = binding.buttonContainer;
        buttonContainerDefaultDrawable2 = this$0.getButtonContainerDefaultDrawable();
        buttonContainerActiveDrawable2 = this$0.getButtonContainerActiveDrawable();
        view.setBackground(new LayerDrawable(new Drawable[]{buttonContainerDefaultDrawable2, buttonContainerActiveDrawable2}));
        View view2 = binding.buttonContainer;
        C9677q.m14634f(view2, "binding.buttonContainer");
        ViewClippingUtilsKt.clipToCircle(view2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ValueAnimator invoke() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        final AudioPlayerViewBinding audioPlayerViewBinding = this.$binding;
        final AudioPlayerWipeAnimatorManager audioPlayerWipeAnimatorManager = this.this$0;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.discord.chat.presentation.message.view.voicemessages.k
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AudioPlayerWipeAnimatorManager$scaleAnimator$2.invoke$lambda$1$lambda$0(AudioPlayerViewBinding.this, audioPlayerWipeAnimatorManager, valueAnimator);
            }
        });
        return ofFloat;
    }
}
