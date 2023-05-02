package com.discord.progress_dots;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001aB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0013\u001a\u00020\u000bH\u0014J\u0010\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u000bH\u0002J\b\u0010\u0018\u001a\u00020\u000bH\u0002J\u0006\u0010\u0019\u001a\u00020\u000bR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/discord/progress_dots/ProgressDot;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "onScaleDownCompleteListener", "Lkotlin/Function0;", "", "getOnScaleDownCompleteListener", "()Lkotlin/jvm/functions/Function0;", "setOnScaleDownCompleteListener", "(Lkotlin/jvm/functions/Function0;)V", "scaleAndFadeDownAnimation", "Landroid/view/animation/Animation;", "scaleAndFadeUpAnimation", "onDetachedFromWindow", ViewProps.START, "delay", "", "startDownAnimation", "startUpAnimation", "stop", "AnimationListenerImpl", "progress_dots_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProgressDot extends View {
    private Function0<Unit> onScaleDownCompleteListener;
    private final Animation scaleAndFadeDownAnimation;
    private final Animation scaleAndFadeUpAnimation;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0012\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\f\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/discord/progress_dots/ProgressDot$AnimationListenerImpl;", "Landroid/view/animation/Animation$AnimationListener;", "onComplete", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "getOnComplete", "()Lkotlin/jvm/functions/Function0;", "onAnimationEnd", "animation", "Landroid/view/animation/Animation;", "onAnimationRepeat", "onAnimationStart", "progress_dots_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static class AnimationListenerImpl implements Animation.AnimationListener {
        private final Function0<Unit> onComplete;

        public AnimationListenerImpl(Function0<Unit> onComplete) {
            q.g(onComplete, "onComplete");
            this.onComplete = onComplete;
        }

        public final Function0<Unit> getOnComplete() {
            return this.onComplete;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.onComplete.invoke();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressDot(Context context) {
        this(context, null, 0, 6, null);
        q.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressDot(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.g(context, "context");
    }

    public /* synthetic */ ProgressDot(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static /* synthetic */ void start$default(ProgressDot progressDot, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        progressDot.start(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startDownAnimation() {
        startAnimation(this.scaleAndFadeDownAnimation);
    }

    private final void startUpAnimation() {
        startAnimation(this.scaleAndFadeUpAnimation);
    }

    public final Function0<Unit> getOnScaleDownCompleteListener() {
        return this.onScaleDownCompleteListener;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stop();
    }

    public final void setOnScaleDownCompleteListener(Function0<Unit> function0) {
        this.onScaleDownCompleteListener = function0;
    }

    public final void start(long j10) {
        this.scaleAndFadeUpAnimation.setStartOffset(j10);
        this.scaleAndFadeUpAnimation.setAnimationListener(new AnimationListenerImpl(new ProgressDot$start$1(this)));
        this.scaleAndFadeDownAnimation.setAnimationListener(new AnimationListenerImpl(new ProgressDot$start$2(this)));
        startUpAnimation();
    }

    public final void stop() {
        this.scaleAndFadeUpAnimation.cancel();
        this.scaleAndFadeDownAnimation.cancel();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressDot(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.g(context, "context");
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.anim_progress_dots_scale_up);
        q.f(loadAnimation, "loadAnimation(context, R…m_progress_dots_scale_up)");
        this.scaleAndFadeUpAnimation = loadAnimation;
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.anim_progress_dots_scale_down);
        q.f(loadAnimation2, "loadAnimation(context, R…progress_dots_scale_down)");
        this.scaleAndFadeDownAnimation = loadAnimation2;
    }
}
