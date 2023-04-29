package com.discord.billing;

import com.android.billingclient.api.BillingClient;
import com.discord.billing.BillingManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import nf.t;
import tf.d;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.billing.BillingManager$reconnect$1", f = "BillingManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class BillingManager$reconnect$1 extends k implements Function1<Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BillingManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingManager$reconnect$1(BillingManager billingManager, Continuation<? super BillingManager$reconnect$1> continuation) {
        super(1, continuation);
        this.this$0 = billingManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new BillingManager$reconnect$1(this.this$0, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((BillingManager$reconnect$1) create(continuation)).invokeSuspend(Unit.f22042a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        BillingClient billingClient;
        BillingManager$billingClientStateListener$1 billingManager$billingClientStateListener$1;
        d.d();
        if (this.label == 0) {
            t.b(obj);
            billingClient = this.this$0.billingClient;
            if (billingClient == null) {
                q.y("billingClient");
                billingClient = null;
            }
            billingManager$billingClientStateListener$1 = this.this$0.billingClientStateListener;
            billingClient.j(billingManager$billingClientStateListener$1);
            this.this$0.getOnConnectionUpdated().invoke(b.c(BillingManager.ConnectionState.CONNECTING.getValue()));
            return Unit.f22042a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
