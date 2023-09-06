package com.discord.chat.presentation.list;

import android.animation.Animator;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/Animator;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class ChatListHighlightItemAtPositionKt$animateBackgroundColor$1 extends s implements Function1<Animator, Unit> {
    final  long $delay;
    final  int $endColor;
    final  int $startColor;
    final  View $this_animateBackgroundColor;

    
    
    public ChatListHighlightItemAtPositionKt$animateBackgroundColor$1(int i10, int i11, long j10, View view) {
        super(1);
        this.$endColor = i10;
        this.$startColor = i11;
        this.$delay = j10;
        this.$this_animateBackgroundColor = view;
    }

    @Override 
    public   Unit invoke(Animator animator) {
        invoke2(animator);
        return Unit.f21436a;
    }

    
    public final void invoke2(Animator it) {
        q.h(it, "it");
        ChatListHighlightItemAtPositionKt.animateBackgroundColor$anim$default(this.$delay, this.$this_animateBackgroundColor, this.$endColor, this.$startColor, null, 16, null);
    }
}
