package com.discord.chat.presentation.list;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.R;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a(\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0002\u001a2\u0010\b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0002\u001a\u001e\u0010\n\u001a\u00020\u0001*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0000\u001a\u001e\u0010\u000e\u001a\u00020\u0001*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0000¨\u0006\u000f"}, d2 = {"animateBackgroundColor", "", "Landroid/view/View;", "delay", "", "startColor", "", "endColor", "animateHighlightBackgroundColor", "fullColor", "chatListEmphasizeHighlightItemAtPosition", "Landroidx/recyclerview/widget/RecyclerView;", ViewProps.POSITION, "delayMilliseconds", "chatListHighlightItemAtPosition", "chat_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ChatListHighlightItemAtPositionKt {
    private static final void animateBackgroundColor(View view, long j10, int i10, int i11) {
        animateBackgroundColor$anim(j10, view, i10, i11, new ChatListHighlightItemAtPositionKt$animateBackgroundColor$1(i11, i10, j10, view));
    }

    private static final void animateBackgroundColor$anim(long j10, final View view, int i10, int i11, final Function1<? super Animator, Unit> function1) {
        ValueAnimator animator = ValueAnimator.ofArgb(i10, i11);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.discord.chat.presentation.list.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ChatListHighlightItemAtPositionKt.animateBackgroundColor$anim$lambda$1$lambda$0(view, valueAnimator);
            }
        });
        q.f(animator, "animator");
        animator.addListener(new Animator.AnimatorListener() { // from class: com.discord.chat.presentation.list.ChatListHighlightItemAtPositionKt$animateBackgroundColor$anim$lambda$1$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
                q.g(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                q.g(animator2, "animator");
                Function1.this.invoke(animator2);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
                q.g(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
                q.g(animator2, "animator");
            }
        });
        animator.setStartDelay(j10 + 100);
        animator.setDuration(600L);
        animator.start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void animateBackgroundColor$anim$default(long j10, View view, int i10, int i11, Function1 function1, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            function1 = ChatListHighlightItemAtPositionKt$animateBackgroundColor$anim$1.INSTANCE;
        }
        animateBackgroundColor$anim(j10, view, i10, i11, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateBackgroundColor$anim$lambda$1$lambda$0(View this_animateBackgroundColor, ValueAnimator valueAnimator) {
        q.g(this_animateBackgroundColor, "$this_animateBackgroundColor");
        Object animatedValue = valueAnimator.getAnimatedValue();
        q.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        this_animateBackgroundColor.setBackgroundColor(((Integer) animatedValue).intValue());
    }

    private static final void animateHighlightBackgroundColor(View view, long j10, int i10, int i11, int i12) {
        animateHighlightBackgroundColor$anim$4(j10, view, i10, i11, i12);
    }

    private static final void animateHighlightBackgroundColor$anim$4(long j10, final View view, int i10, int i11, int i12) {
        ValueAnimator ofArgb = ValueAnimator.ofArgb(i10, i11, i11, i12);
        ofArgb.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.discord.chat.presentation.list.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ChatListHighlightItemAtPositionKt.animateHighlightBackgroundColor$anim$4$lambda$3$lambda$2(view, valueAnimator);
            }
        });
        ofArgb.setStartDelay(j10 + 100);
        ofArgb.setDuration(1000L);
        ofArgb.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateHighlightBackgroundColor$anim$4$lambda$3$lambda$2(View this_animateHighlightBackgroundColor, ValueAnimator valueAnimator) {
        q.g(this_animateHighlightBackgroundColor, "$this_animateHighlightBackgroundColor");
        Object animatedValue = valueAnimator.getAnimatedValue();
        q.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        this_animateHighlightBackgroundColor.setBackgroundColor(((Integer) animatedValue).intValue());
    }

    public static final void chatListEmphasizeHighlightItemAtPosition(RecyclerView recyclerView, int i10, long j10) {
        View N;
        q.g(recyclerView, "<this>");
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null && (N = layoutManager.N(i10)) != null) {
            Context context = recyclerView.getContext();
            q.f(context, "context");
            int colorCompat = ColorUtilsKt.getColorCompat(context, 17170445);
            Context context2 = recyclerView.getContext();
            q.f(context2, "context");
            animateHighlightBackgroundColor(N, j10, colorCompat, ColorUtilsKt.getColorCompat(context2, ThemeManagerKt.getTheme().getColorRes(R.color.brand_new_360_alpha_20, R.color.brand_new_360_alpha_25)), ThemeManagerKt.getTheme().getBackgroundMessageHighlight());
        }
    }

    public static /* synthetic */ void chatListEmphasizeHighlightItemAtPosition$default(RecyclerView recyclerView, int i10, long j10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j10 = 300;
        }
        chatListEmphasizeHighlightItemAtPosition(recyclerView, i10, j10);
    }

    public static final void chatListHighlightItemAtPosition(RecyclerView recyclerView, int i10, long j10) {
        View N;
        q.g(recyclerView, "<this>");
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null && (N = layoutManager.N(i10)) != null) {
            Context context = recyclerView.getContext();
            q.f(context, "context");
            animateBackgroundColor(N, j10, ColorUtilsKt.getColorCompat(context, 17170445), ThemeManagerKt.getTheme().getBackgroundModifierSelected());
        }
    }

    public static /* synthetic */ void chatListHighlightItemAtPosition$default(RecyclerView recyclerView, int i10, long j10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j10 = 300;
        }
        chatListHighlightItemAtPosition(recyclerView, i10, j10);
    }
}
