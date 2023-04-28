package com.discord.progress_dots;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.progress_dots.databinding.ProgressDotsViewBinding;
import com.discord.theme.ThemeManagerKt;
import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9610j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9679s;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0010\u001a\u00020\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u0011H\u0014J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0007H\u0016J\u0006\u0010\u0015\u001a\u00020\u0011J\u0012\u0010\u0016\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u000fH\u0002J\b\u0010\u0018\u001a\u00020\u0011H\u0002J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u000fH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m15073d2 = {"Lcom/discord/progress_dots/ProgressDots;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/progress_dots/databinding/ProgressDotsViewBinding;", "dotsAnimationStaggerTimeMs", "", "dotsAnimationTimeMs", "isRunning", "", "onAttachedToWindow", "", "onDetachedFromWindow", "setVisibility", "visibility", "setupColors", ViewProps.START, "isReplay", "stop", "syncPlayingState", "isAttached", "progress_dots_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes3.dex */
public final class ProgressDots extends ConstraintLayout {
    private final ProgressDotsViewBinding binding;
    private final long dotsAnimationStaggerTimeMs;
    private final int dotsAnimationTimeMs;
    private boolean isRunning;

    @Metadata(m15074d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m15073d2 = {"<anonymous>", "", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: com.discord.progress_dots.ProgressDots$1 */
    /* loaded from: classes3.dex */
    static final class C35861 extends AbstractC9679s implements Function0<Unit> {
        C35861() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (ProgressDots.this.isAttachedToWindow()) {
                if (ProgressDots.this.getVisibility() == 0) {
                    ProgressDots.this.start(true);
                }
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressDots(Context context) {
        this(context, null, 0, 6, null);
        C9677q.m14633g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressDots(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C9677q.m14633g(context, "context");
    }

    public /* synthetic */ ProgressDots(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void start(boolean z) {
        boolean z2;
        long j;
        if (!this.isRunning || z) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            if (z) {
                j = this.dotsAnimationStaggerTimeMs;
            } else {
                j = 0;
            }
            this.binding.viewProgressDots1.start(j);
            this.binding.viewProgressDots2.start(this.dotsAnimationStaggerTimeMs + j);
            ProgressDot progressDot = this.binding.viewProgressDots3;
            long j2 = this.dotsAnimationStaggerTimeMs;
            progressDot.start(j + j2 + j2);
            this.isRunning = true;
        }
    }

    static /* synthetic */ void start$default(ProgressDots progressDots, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        progressDots.start(z);
    }

    private final void stop() {
        List<ProgressDot> l;
        ProgressDotsViewBinding progressDotsViewBinding = this.binding;
        l = C9610j.m14817l(progressDotsViewBinding.viewProgressDots1, progressDotsViewBinding.viewProgressDots2, progressDotsViewBinding.viewProgressDots3);
        for (ProgressDot progressDot : l) {
            progressDot.stop();
        }
        this.isRunning = false;
    }

    private final void syncPlayingState(boolean z) {
        boolean z2;
        if (z) {
            if (getVisibility() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                start$default(this, false, 1, null);
                return;
            }
        }
        stop();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        syncPlayingState(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        syncPlayingState(false);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        syncPlayingState(isAttachedToWindow());
    }

    public final void setupColors() {
        ProgressDot progressDot = this.binding.viewProgressDots1;
        C9677q.m14634f(progressDot, "binding.viewProgressDots1");
        ViewBackgroundUtilsKt.setBackgroundOval$default(progressDot, ThemeManagerKt.getTheme().getTextNormal(), 0, 2, null);
        ProgressDot progressDot2 = this.binding.viewProgressDots2;
        C9677q.m14634f(progressDot2, "binding.viewProgressDots2");
        ViewBackgroundUtilsKt.setBackgroundOval$default(progressDot2, ThemeManagerKt.getTheme().getTextNormal(), 0, 2, null);
        ProgressDot progressDot3 = this.binding.viewProgressDots3;
        C9677q.m14634f(progressDot3, "binding.viewProgressDots3");
        ViewBackgroundUtilsKt.setBackgroundOval$default(progressDot3, ThemeManagerKt.getTheme().getTextNormal(), 0, 2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressDots(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C9677q.m14633g(context, "context");
        ProgressDotsViewBinding inflate = ProgressDotsViewBinding.inflate(LayoutInflater.from(context), this);
        C9677q.m14634f(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        int integer = getResources().getInteger(C3587R.integer.progress_dots_animation_time);
        this.dotsAnimationTimeMs = integer;
        this.dotsAnimationStaggerTimeMs = (long) (integer / 1.5d);
        setupColors();
        inflate.viewProgressDots3.setOnScaleDownCompleteListener(new C35861());
    }
}
