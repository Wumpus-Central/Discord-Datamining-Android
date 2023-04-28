package com.discord.chat.presentation.list;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.C4254R;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a(\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0002\u001a2\u0010\b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0002\u001a\u001e\u0010\n\u001a\u00020\u0001*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0000\u001a\u001e\u0010\u000e\u001a\u00020\u0001*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0000¨\u0006\u000f"}, m15073d2 = {"animateBackgroundColor", "", "Landroid/view/View;", "delay", "", "startColor", "", "endColor", "animateHighlightBackgroundColor", "fullColor", "chatListEmphasizeHighlightItemAtPosition", "Landroidx/recyclerview/widget/RecyclerView;", ViewProps.POSITION, "delayMilliseconds", "chatListHighlightItemAtPosition", "chat_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class ChatListHighlightItemAtPositionKt {
    private static final void animateBackgroundColor(View view, long j, int i, int i2) {
        animateBackgroundColor$anim(j, view, i, i2, new ChatListHighlightItemAtPositionKt$animateBackgroundColor$1(i2, i, j, view));
    }

    private static final void animateBackgroundColor$anim(long j, final View view, int i, int i2, final Function1<? super Animator, Unit> function1) {
        ValueAnimator animator = ValueAnimator.ofArgb(i, i2);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.discord.chat.presentation.list.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ChatListHighlightItemAtPositionKt.animateBackgroundColor$anim$lambda$1$lambda$0(view, valueAnimator);
            }
        });
        C9971q.m14634f(animator, "animator");
        animator.addListener(new Animator.AnimatorListener() { // from class: com.discord.chat.presentation.list.ChatListHighlightItemAtPositionKt$animateBackgroundColor$anim$lambda$1$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
                C9971q.m14633g(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                C9971q.m14633g(animator2, "animator");
                Function1.this.invoke(animator2);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
                C9971q.m14633g(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
                C9971q.m14633g(animator2, "animator");
            }
        });
        animator.setStartDelay(j + 100);
        animator.setDuration(600L);
        animator.start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void animateBackgroundColor$anim$default(long j, View view, int i, int i2, Function1 function1, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            function1 = ChatListHighlightItemAtPositionKt$animateBackgroundColor$anim$1.INSTANCE;
        }
        animateBackgroundColor$anim(j, view, i, i2, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateBackgroundColor$anim$lambda$1$lambda$0(View this_animateBackgroundColor, ValueAnimator valueAnimator) {
        C9971q.m14633g(this_animateBackgroundColor, "$this_animateBackgroundColor");
        Object animatedValue = valueAnimator.getAnimatedValue();
        C9971q.m14635e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        this_animateBackgroundColor.setBackgroundColor(((Integer) animatedValue).intValue());
    }

    private static final void animateHighlightBackgroundColor(View view, long j, int i, int i2, int i3) {
        animateHighlightBackgroundColor$anim$4(j, view, i, i2, i3);
    }

    private static final void animateHighlightBackgroundColor$anim$4(long j, final View view, int i, int i2, int i3) {
        ValueAnimator ofArgb = ValueAnimator.ofArgb(i, i2, i2, i3);
        ofArgb.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.discord.chat.presentation.list.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ChatListHighlightItemAtPositionKt.animateHighlightBackgroundColor$anim$4$lambda$3$lambda$2(view, valueAnimator);
            }
        });
        ofArgb.setStartDelay(j + 100);
        ofArgb.setDuration(1000L);
        ofArgb.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateHighlightBackgroundColor$anim$4$lambda$3$lambda$2(View this_animateHighlightBackgroundColor, ValueAnimator valueAnimator) {
        C9971q.m14633g(this_animateHighlightBackgroundColor, "$this_animateHighlightBackgroundColor");
        Object animatedValue = valueAnimator.getAnimatedValue();
        C9971q.m14635e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        this_animateHighlightBackgroundColor.setBackgroundColor(((Integer) animatedValue).intValue());
    }

    public static final void chatListEmphasizeHighlightItemAtPosition(RecyclerView recyclerView, int i, long j) {
        View N;
        C9971q.m14633g(recyclerView, "<this>");
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null && (N = layoutManager.mo35490N(i)) != null) {
            Context context = recyclerView.getContext();
            C9971q.m14634f(context, "context");
            int colorCompat = ColorUtilsKt.getColorCompat(context, 17170445);
            Context context2 = recyclerView.getContext();
            C9971q.m14634f(context2, "context");
            animateHighlightBackgroundColor(N, j, colorCompat, ColorUtilsKt.getColorCompat(context2, ThemeManagerKt.getTheme().getColorRes(C4254R.color.brand_new_360_alpha_20, C4254R.color.brand_new_360_alpha_25)), ThemeManagerKt.getTheme().getBackgroundMessageHighlight());
        }
    }

    public static /* synthetic */ void chatListEmphasizeHighlightItemAtPosition$default(RecyclerView recyclerView, int i, long j, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = 300;
        }
        chatListEmphasizeHighlightItemAtPosition(recyclerView, i, j);
    }

    public static final void chatListHighlightItemAtPosition(RecyclerView recyclerView, int i, long j) {
        View N;
        C9971q.m14633g(recyclerView, "<this>");
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null && (N = layoutManager.mo35490N(i)) != null) {
            Context context = recyclerView.getContext();
            C9971q.m14634f(context, "context");
            animateBackgroundColor(N, j, ColorUtilsKt.getColorCompat(context, 17170445), ThemeManagerKt.getTheme().getBackgroundModifierSelected());
        }
    }

    public static /* synthetic */ void chatListHighlightItemAtPosition$default(RecyclerView recyclerView, int i, long j, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = 300;
        }
        chatListHighlightItemAtPosition(recyclerView, i, j);
    }
}
