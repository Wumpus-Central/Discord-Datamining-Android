package com.discord.chat.input.views;

import com.discord.chat.input.views.ChatInputRootView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9636e;
import kotlin.coroutines.jvm.internal.AbstractC9643k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.C9840j;
import kotlinx.coroutines.C9926t0;
import kotlinx.coroutines.C9946y0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import nf.C10848t;
import tf.C12962d;

@Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
@AbstractC9636e(m14702c = "com.discord.chat.input.views.ChatInputRootView$onKeyboardStateChanged$1", m14701f = "ChatInputRootView.kt", m14700l = {281}, m14699m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ChatInputRootView$onKeyboardStateChanged$1 extends AbstractC9643k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ChatInputRootView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
    @AbstractC9636e(m14702c = "com.discord.chat.input.views.ChatInputRootView$onKeyboardStateChanged$1$1", m14701f = "ChatInputRootView.kt", m14700l = {282}, m14699m = "invokeSuspend")
    /* renamed from: com.discord.chat.input.views.ChatInputRootView$onKeyboardStateChanged$1$1 */
    /* loaded from: classes4.dex */
    public static final class C31651 extends AbstractC9643k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C31651(Continuation<? super C31651> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C31651(continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C31651) create(coroutineScope, continuation)).invokeSuspend(Unit.f25780a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = C12962d.m4646d();
            int i = this.label;
            if (i == 0) {
                C10848t.m10930b(obj);
                this.label = 1;
                if (C9926t0.m13992a(100L, this) == d) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatInputRootView$onKeyboardStateChanged$1(ChatInputRootView chatInputRootView, Continuation<? super ChatInputRootView$onKeyboardStateChanged$1> continuation) {
        super(2, continuation);
        this.this$0 = chatInputRootView;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatInputRootView$onKeyboardStateChanged$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatInputRootView$onKeyboardStateChanged$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f25780a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Object invokeSuspend(Object obj) {
        Object d;
        d = C12962d.m4646d();
        int i = this.label;
        if (i == 0) {
            C10848t.m10930b(obj);
            CoroutineDispatcher a = C9946y0.m13947a();
            C31651 r1 = new C31651(null);
            this.label = 1;
            if (C9840j.m14192g(a, r1, this) == d) {
                return d;
            }
        } else if (i == 1) {
            C10848t.m10930b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.this$0.editText.clearFocus();
        ChatInputRootView.ChatInputListener listener = this.this$0.getListener();
        if (listener != null) {
            listener.onEndBlur(String.valueOf(this.this$0.editText.getText()));
        }
        return Unit.f25780a;
    }
}
