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
import kotlin.collections.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0010\u001a\u00020\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u0011H\u0014J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0007H\u0016J\u0006\u0010\u0015\u001a\u00020\u0011J\u0012\u0010\u0016\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u000fH\u0002J\b\u0010\u0018\u001a\u00020\u0011H\u0002J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u000fH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/discord/progress_dots/ProgressDots;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/progress_dots/databinding/ProgressDotsViewBinding;", "dotsAnimationStaggerTimeMs", "", "dotsAnimationTimeMs", "isRunning", "", "onAttachedToWindow", "", "onDetachedFromWindow", "setVisibility", "visibility", "setupColors", ViewProps.START, "isReplay", "stop", "syncPlayingState", "isAttached", "progress_dots_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProgressDots extends ConstraintLayout {
    private final ProgressDotsViewBinding binding;
    private final long dotsAnimationStaggerTimeMs;
    private final int dotsAnimationTimeMs;
    private boolean isRunning;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.discord.progress_dots.ProgressDots$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    static final class AnonymousClass1 extends s implements Function0<Unit> {
        AnonymousClass1() {
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
        q.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressDots(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.g(context, "context");
    }

    public /* synthetic */ ProgressDots(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void start(boolean z10) {
        boolean z11;
        long j10;
        if (!this.isRunning || z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            if (z10) {
                j10 = this.dotsAnimationStaggerTimeMs;
            } else {
                j10 = 0;
            }
            this.binding.viewProgressDots1.start(j10);
            this.binding.viewProgressDots2.start(this.dotsAnimationStaggerTimeMs + j10);
            ProgressDot progressDot = this.binding.viewProgressDots3;
            long j11 = this.dotsAnimationStaggerTimeMs;
            progressDot.start(j10 + j11 + j11);
            this.isRunning = true;
        }
    }

    static /* synthetic */ void start$default(ProgressDots progressDots, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        progressDots.start(z10);
    }

    private final void stop() {
        List<ProgressDot> l10;
        ProgressDotsViewBinding progressDotsViewBinding = this.binding;
        l10 = j.l(progressDotsViewBinding.viewProgressDots1, progressDotsViewBinding.viewProgressDots2, progressDotsViewBinding.viewProgressDots3);
        for (ProgressDot progressDot : l10) {
            progressDot.stop();
        }
        this.isRunning = false;
    }

    private final void syncPlayingState(boolean z10) {
        boolean z11;
        if (z10) {
            if (getVisibility() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
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
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        syncPlayingState(isAttachedToWindow());
    }

    public final void setupColors() {
        ProgressDot progressDot = this.binding.viewProgressDots1;
        q.f(progressDot, "binding.viewProgressDots1");
        ViewBackgroundUtilsKt.setBackgroundOval$default(progressDot, ThemeManagerKt.getTheme().getTextNormal(), 0, 2, null);
        ProgressDot progressDot2 = this.binding.viewProgressDots2;
        q.f(progressDot2, "binding.viewProgressDots2");
        ViewBackgroundUtilsKt.setBackgroundOval$default(progressDot2, ThemeManagerKt.getTheme().getTextNormal(), 0, 2, null);
        ProgressDot progressDot3 = this.binding.viewProgressDots3;
        q.f(progressDot3, "binding.viewProgressDots3");
        ViewBackgroundUtilsKt.setBackgroundOval$default(progressDot3, ThemeManagerKt.getTheme().getTextNormal(), 0, 2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressDots(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.g(context, "context");
        ProgressDotsViewBinding inflate = ProgressDotsViewBinding.inflate(LayoutInflater.from(context), this);
        q.f(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        int integer = getResources().getInteger(R.integer.progress_dots_animation_time);
        this.dotsAnimationTimeMs = integer;
        this.dotsAnimationStaggerTimeMs = (long) (integer / 1.5d);
        setupColors();
        inflate.viewProgressDots3.setOnScaleDownCompleteListener(new AnonymousClass1());
    }
}
