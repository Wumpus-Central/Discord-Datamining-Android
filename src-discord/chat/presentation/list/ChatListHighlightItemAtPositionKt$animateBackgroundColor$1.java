package com.discord.chat.presentation.list;

import android.animation.Animator;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/Animator;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ChatListHighlightItemAtPositionKt$animateBackgroundColor$1 extends s implements Function1<Animator, Unit> {
    final /* synthetic */ long $delay;
    final /* synthetic */ int $endColor;
    final /* synthetic */ int $startColor;
    final /* synthetic */ View $this_animateBackgroundColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatListHighlightItemAtPositionKt$animateBackgroundColor$1(int i10, int i11, long j10, View view) {
        super(1);
        this.$endColor = i10;
        this.$startColor = i11;
        this.$delay = j10;
        this.$this_animateBackgroundColor = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Animator animator) {
        invoke2(animator);
        return Unit.f22114a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Animator it) {
        q.g(it, "it");
        ChatListHighlightItemAtPositionKt.animateBackgroundColor$anim$default(this.$delay, this.$this_animateBackgroundColor, this.$endColor, this.$startColor, null, 16, null);
    }
}
