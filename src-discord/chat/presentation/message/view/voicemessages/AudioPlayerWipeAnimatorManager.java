package com.discord.chat.presentation.message.view.voicemessages;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.discord.chat.R;
import com.discord.chat.databinding.AudioPlayerViewBinding;
import com.discord.theme.ThemeManagerKt;
import ff.n;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 02\u00020\u0001:\u00010B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J \u0010)\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\bH\u0002J\u0018\u0010\u001d\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b2\u0006\u0010-\u001a\u00020\bH\u0002J\u0018\u0010!\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b2\u0006\u0010-\u001a\u00020\bH\u0002J\u0018\u0010$\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b2\u0006\u0010-\u001a\u00020\bH\u0002J\u0018\u0010'\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b2\u0006\u0010-\u001a\u00020\bH\u0002J\u0016\u0010.\u001a\u00020/2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010,\u001a\u00020\bR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u001a\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b\u001d\u0010\u001eR#\u0010 \u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0014\u001a\u0004\b!\u0010\u001eR#\u0010#\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0014\u001a\u0004\b$\u0010\u001eR#\u0010&\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0014\u001a\u0004\b'\u0010\u001e¨\u00061"}, d2 = {"Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;", "", "context", "Landroid/content/Context;", "binding", "Lcom/discord/chat/databinding/AudioPlayerViewBinding;", "(Landroid/content/Context;Lcom/discord/chat/databinding/AudioPlayerViewBinding;)V", "animateToPlay", "", "animatorSet", "Landroid/animation/AnimatorSet;", "argbEvaluator", "Landroid/animation/ArgbEvaluator;", "brand500", "", "buttonContainerActiveDrawable", "Landroid/graphics/drawable/ColorDrawable;", "getButtonContainerActiveDrawable", "()Landroid/graphics/drawable/ColorDrawable;", "buttonContainerActiveDrawable$delegate", "Lkotlin/Lazy;", "buttonContainerDefaultDrawable", "Landroid/graphics/drawable/Drawable;", "getButtonContainerDefaultDrawable", "()Landroid/graphics/drawable/Drawable;", "buttonContainerDefaultDrawable$delegate", "buttonIconColorAnimator", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "getButtonIconColorAnimator", "()Landroid/animation/ValueAnimator;", "buttonIconColorAnimator$delegate", "progressColorAnimator", "getProgressColorAnimator", "progressColorAnimator$delegate", "scaleAnimator", "getScaleAnimator", "scaleAnimator$delegate", "textColorAnimator", "getTextColorAnimator", "textColorAnimator$delegate", "getAnimatorSet", "currentPlayTime", "", "shouldAnimate", "shouldPlay", "startAnimator", "", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AudioPlayerWipeAnimatorManager {
    public static final Companion Companion = new Companion(null);
    private static final long WASH_ANIMATION_MS = 200;
    private boolean animateToPlay;
    private AnimatorSet animatorSet;
    private final ArgbEvaluator argbEvaluator = new ArgbEvaluator();
    private final int brand500;
    private final Lazy buttonContainerActiveDrawable$delegate;
    private final Lazy buttonContainerDefaultDrawable$delegate;
    private final Lazy buttonIconColorAnimator$delegate;
    private final Lazy progressColorAnimator$delegate;
    private final Lazy scaleAnimator$delegate;
    private final Lazy textColorAnimator$delegate;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager$Companion;", "", "()V", "WASH_ANIMATION_MS", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AudioPlayerWipeAnimatorManager(Context context, AudioPlayerViewBinding binding) {
        Lazy b10;
        Lazy b11;
        Lazy b12;
        Lazy b13;
        Lazy b14;
        Lazy b15;
        q.g(context, "context");
        q.g(binding, "binding");
        this.brand500 = context.getColor(R.color.brand_500);
        b10 = n.b(new AudioPlayerWipeAnimatorManager$buttonContainerDefaultDrawable$2(context));
        this.buttonContainerDefaultDrawable$delegate = b10;
        b11 = n.b(AudioPlayerWipeAnimatorManager$buttonContainerActiveDrawable$2.INSTANCE);
        this.buttonContainerActiveDrawable$delegate = b11;
        b12 = n.b(new AudioPlayerWipeAnimatorManager$scaleAnimator$2(binding, this));
        this.scaleAnimator$delegate = b12;
        b13 = n.b(new AudioPlayerWipeAnimatorManager$textColorAnimator$2(binding));
        this.textColorAnimator$delegate = b13;
        b14 = n.b(new AudioPlayerWipeAnimatorManager$buttonIconColorAnimator$2(binding));
        this.buttonIconColorAnimator$delegate = b14;
        b15 = n.b(new AudioPlayerWipeAnimatorManager$progressColorAnimator$2(binding));
        this.progressColorAnimator$delegate = b15;
    }

    private final AnimatorSet getAnimatorSet(boolean z10, long j10, boolean z11) {
        long j11;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(getScaleAnimator(z10), getTextColorAnimator(z10), getButtonIconColorAnimator(z10), getProgressColorAnimator(z10));
        if (z11) {
            j11 = WASH_ANIMATION_MS;
        } else {
            j11 = 0;
        }
        animatorSet.setDuration(j11);
        if (Build.VERSION.SDK_INT >= 26) {
            animatorSet.setCurrentPlayTime(j10);
        }
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.discord.chat.presentation.message.view.voicemessages.AudioPlayerWipeAnimatorManager$getAnimatorSet$lambda$7$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                q.g(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                q.g(animator, "animator");
                AudioPlayerWipeAnimatorManager.this.animatorSet = null;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                q.g(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                q.g(animator, "animator");
            }
        });
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ColorDrawable getButtonContainerActiveDrawable() {
        return (ColorDrawable) this.buttonContainerActiveDrawable$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Drawable getButtonContainerDefaultDrawable() {
        return (Drawable) this.buttonContainerDefaultDrawable$delegate.getValue();
    }

    private final ValueAnimator getButtonIconColorAnimator() {
        return (ValueAnimator) this.buttonIconColorAnimator$delegate.getValue();
    }

    private final ValueAnimator getProgressColorAnimator() {
        return (ValueAnimator) this.progressColorAnimator$delegate.getValue();
    }

    private final ValueAnimator getScaleAnimator() {
        return (ValueAnimator) this.scaleAnimator$delegate.getValue();
    }

    private final ValueAnimator getTextColorAnimator() {
        return (ValueAnimator) this.textColorAnimator$delegate.getValue();
    }

    public final void startAnimator(boolean z10, boolean z11) {
        AnimatorSet animatorSet;
        long j10;
        long j11;
        long j12 = 0;
        if (z11) {
            boolean z12 = this.animateToPlay;
            if (z12 != z10) {
                if (!(z12 == z10 || (animatorSet = this.animatorSet) == null)) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        if (animatorSet != null) {
                            j10 = animatorSet.getDuration();
                        } else {
                            j10 = 0;
                        }
                        AnimatorSet animatorSet2 = this.animatorSet;
                        if (animatorSet2 != null) {
                            j11 = animatorSet2.getCurrentPlayTime();
                        } else {
                            j11 = 0;
                        }
                        Long valueOf = Long.valueOf(j10 - j11);
                        long longValue = valueOf.longValue();
                        boolean z13 = false;
                        if (0 <= longValue && longValue < 201) {
                            z13 = true;
                        }
                        if (!z13) {
                            valueOf = null;
                        }
                        if (valueOf != null) {
                            j12 = valueOf.longValue();
                        }
                    }
                    AnimatorSet animatorSet3 = this.animatorSet;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                    }
                }
            } else {
                return;
            }
        }
        this.animateToPlay = z10;
        AnimatorSet animatorSet4 = getAnimatorSet(z10, j12, z11);
        animatorSet4.start();
        this.animatorSet = animatorSet4;
    }

    private final ValueAnimator getButtonIconColorAnimator(boolean z10) {
        ValueAnimator buttonIconColorAnimator = getButtonIconColorAnimator();
        if (z10) {
            buttonIconColorAnimator.setIntValues(-1, this.brand500);
        } else {
            buttonIconColorAnimator.setIntValues(this.brand500, -1);
        }
        buttonIconColorAnimator.setEvaluator(this.argbEvaluator);
        return buttonIconColorAnimator;
    }

    private final ValueAnimator getProgressColorAnimator(boolean z10) {
        ValueAnimator progressColorAnimator = getProgressColorAnimator();
        if (z10) {
            progressColorAnimator.setIntValues(ThemeManagerKt.getTheme().getInteractiveActive(), -1);
        } else {
            progressColorAnimator.setIntValues(-1, ThemeManagerKt.getTheme().getInteractiveActive());
        }
        progressColorAnimator.setEvaluator(this.argbEvaluator);
        return progressColorAnimator;
    }

    private final ValueAnimator getScaleAnimator(boolean z10) {
        ValueAnimator scaleAnimator = getScaleAnimator();
        if (z10) {
            scaleAnimator.setFloatValues(0.0f, 1.0f);
        } else {
            scaleAnimator.setFloatValues(1.0f, 0.0f);
        }
        return scaleAnimator;
    }

    private final ValueAnimator getTextColorAnimator(boolean z10) {
        ValueAnimator textColorAnimator = getTextColorAnimator();
        if (z10) {
            textColorAnimator.setIntValues(ThemeManagerKt.getTheme().getInteractiveNormal(), -1);
        } else {
            textColorAnimator.setIntValues(-1, ThemeManagerKt.getTheme().getInteractiveNormal());
        }
        textColorAnimator.setEvaluator(this.argbEvaluator);
        return textColorAnimator;
    }
}
