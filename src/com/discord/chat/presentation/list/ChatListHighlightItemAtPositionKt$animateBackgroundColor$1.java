package com.discord.chat.presentation.list;

import android.animation.Animator;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9679s;
import kotlin.jvm.internal.C9677q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m15073d2 = {"<anonymous>", "", "it", "Landroid/animation/Animator;", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class ChatListHighlightItemAtPositionKt$animateBackgroundColor$1 extends AbstractC9679s implements Function1<Animator, Unit> {
    final /* synthetic */ long $delay;
    final /* synthetic */ int $endColor;
    final /* synthetic */ int $startColor;
    final /* synthetic */ View $this_animateBackgroundColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatListHighlightItemAtPositionKt$animateBackgroundColor$1(int i, int i2, long j, View view) {
        super(1);
        this.$endColor = i;
        this.$startColor = i2;
        this.$delay = j;
        this.$this_animateBackgroundColor = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Animator animator) {
        invoke2(animator);
        return Unit.f25780a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Animator it) {
        C9677q.m14633g(it, "it");
        ChatListHighlightItemAtPositionKt.animateBackgroundColor$anim$default(this.$delay, this.$this_animateBackgroundColor, this.$endColor, this.$startColor, null, 16, null);
    }
}
