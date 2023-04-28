package com.discord.chat.presentation.list.messagebundling;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AbstractC9679s;
import kotlin.jvm.internal.C9677q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0007"}, m15073d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "<anonymous parameter 1>", "", "height", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class MessageBundleAdapter$delegates$1 extends AbstractC9679s implements Function3<View, Integer, Integer, Unit> {
    final /* synthetic */ MessageBundleAdapter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageBundleAdapter$delegates$1(MessageBundleAdapter messageBundleAdapter) {
        super(3);
        this.this$0 = messageBundleAdapter;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(View view, Integer num, Integer num2) {
        invoke(view, num.intValue(), num2.intValue());
        return Unit.f25780a;
    }

    public final void invoke(View view, int i, int i2) {
        C9677q.m14633g(view, "view");
        this.this$0.handleTruncation(view, i2);
    }
}
