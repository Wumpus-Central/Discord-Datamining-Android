package com.discord.chat.input.views;

import com.discord.chat.input.views.ChatInputRootView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9636e;
import kotlin.coroutines.jvm.internal.AbstractC9643k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.C9748d;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import nf.C10848t;
import tf.C12962d;

@Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
@AbstractC9636e(m14702c = "com.discord.chat.input.views.ChatInputRootView$onAttachedToWindow$1", m14701f = "ChatInputRootView.kt", m14700l = {210}, m14699m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ChatInputRootView$onAttachedToWindow$1 extends AbstractC9643k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ChatInputRootView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatInputRootView$onAttachedToWindow$1(ChatInputRootView chatInputRootView, Continuation<? super ChatInputRootView$onAttachedToWindow$1> continuation) {
        super(2, continuation);
        this.this$0 = chatInputRootView;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatInputRootView$onAttachedToWindow$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatInputRootView$onAttachedToWindow$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f25780a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Object invokeSuspend(Object obj) {
        Object d;
        d = C12962d.m4646d();
        int i = this.label;
        if (i == 0) {
            C10848t.m10930b(obj);
            Flow b = C9748d.m14431b(this.this$0.currentTextFlow, 100L);
            final ChatInputRootView chatInputRootView = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.discord.chat.input.views.ChatInputRootView$onAttachedToWindow$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((ChatInputRootView.CurrentTextAndSelection) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(ChatInputRootView.CurrentTextAndSelection currentTextAndSelection, Continuation<? super Unit> continuation) {
                    if (currentTextAndSelection == null) {
                        return Unit.f25780a;
                    }
                    ChatInputRootView.ChatInputListener listener = ChatInputRootView.this.getListener();
                    if (listener != null) {
                        listener.onTextOrSelectionChanged(currentTextAndSelection.getSelectionStart(), currentTextAndSelection.getSelectionEnd(), currentTextAndSelection.getText(), currentTextAndSelection.getEditId());
                    }
                    return Unit.f25780a;
                }
            };
            this.label = 1;
            if (b.collect(flowCollector, this) == d) {
                return d;
            }
        } else if (i == 1) {
            C10848t.m10930b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f25780a;
    }
}
