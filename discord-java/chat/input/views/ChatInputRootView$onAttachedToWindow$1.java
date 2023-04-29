package com.discord.chat.input.views;

import com.discord.chat.input.views.ChatInputRootView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import nf.t;
import tf.d;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.chat.input.views.ChatInputRootView$onAttachedToWindow$1", f = "ChatInputRootView.kt", l = {210}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ChatInputRootView$onAttachedToWindow$1 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ChatInputRootView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatInputRootView$onAttachedToWindow$1(ChatInputRootView chatInputRootView, Continuation<? super ChatInputRootView$onAttachedToWindow$1> continuation) {
        super(2, continuation);
        this.this$0 = chatInputRootView;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatInputRootView$onAttachedToWindow$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatInputRootView$onAttachedToWindow$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f22042a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        d10 = d.d();
        int i10 = this.label;
        if (i10 == 0) {
            t.b(obj);
            Flow b10 = kotlinx.coroutines.flow.d.b(this.this$0.currentTextFlow, 100L);
            final ChatInputRootView chatInputRootView = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.discord.chat.input.views.ChatInputRootView$onAttachedToWindow$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((ChatInputRootView.CurrentTextAndSelection) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(ChatInputRootView.CurrentTextAndSelection currentTextAndSelection, Continuation<? super Unit> continuation) {
                    if (currentTextAndSelection == null) {
                        return Unit.f22042a;
                    }
                    ChatInputRootView.ChatInputListener listener = ChatInputRootView.this.getListener();
                    if (listener != null) {
                        listener.onTextOrSelectionChanged(currentTextAndSelection.getSelectionStart(), currentTextAndSelection.getSelectionEnd(), currentTextAndSelection.getText(), currentTextAndSelection.getEditId());
                    }
                    return Unit.f22042a;
                }
            };
            this.label = 1;
            if (b10.collect(flowCollector, this) == d10) {
                return d10;
            }
        } else if (i10 == 1) {
            t.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f22042a;
    }
}
