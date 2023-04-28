package com.discord.chat.presentation.message.view.voicemessages;

import android.animation.ValueAnimator;
import com.discord.chat.databinding.AudioPlayerViewBinding;
import com.discord.theme.ThemeManagerKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9679s;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, m15073d2 = {"<anonymous>", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
final class AudioPlayerWipeAnimatorManager$progressColorAnimator$2 extends AbstractC9679s implements Function0<ValueAnimator> {
    final /* synthetic */ AudioPlayerViewBinding $binding;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioPlayerWipeAnimatorManager$progressColorAnimator$2(AudioPlayerViewBinding audioPlayerViewBinding) {
        super(0);
        this.$binding = audioPlayerViewBinding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1$lambda$0(AudioPlayerViewBinding binding, ValueAnimator valueAnimator) {
        C9677q.m14633g(binding, "$binding");
        AudioWaveView audioWaveView = binding.wave;
        Object animatedValue = valueAnimator.getAnimatedValue();
        C9677q.m14635e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        audioWaveView.setAudioProgressPaintColor(((Integer) animatedValue).intValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ValueAnimator invoke() {
        ValueAnimator ofArgb = ValueAnimator.ofArgb(-1, ThemeManagerKt.getTheme().getInteractiveActive());
        final AudioPlayerViewBinding audioPlayerViewBinding = this.$binding;
        ofArgb.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.discord.chat.presentation.message.view.voicemessages.j
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AudioPlayerWipeAnimatorManager$progressColorAnimator$2.invoke$lambda$1$lambda$0(AudioPlayerViewBinding.this, valueAnimator);
            }
        });
        return ofArgb;
    }
}
