package com.discord.chat.presentation.message.view.media;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/discord/chat/presentation/message/view/media/ViewScrollStateListener;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ViewAttachedListener$scrollStateListener$2 extends s implements Function0<ViewScrollStateListener> {
    final /* synthetic */ ViewAttachedListener this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewAttachedListener$scrollStateListener$2(ViewAttachedListener viewAttachedListener) {
        super(0);
        this.this$0 = viewAttachedListener;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ViewScrollStateListener invoke() {
        View view;
        Function1 function1;
        view = this.this$0.view;
        function1 = this.this$0.viewScrolling;
        return new ViewScrollStateListener(view, function1);
    }
}
