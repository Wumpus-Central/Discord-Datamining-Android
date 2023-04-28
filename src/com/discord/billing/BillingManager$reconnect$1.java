package com.discord.billing;

import com.android.billingclient.api.BillingClient;
import com.discord.billing.BillingManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9636e;
import kotlin.coroutines.jvm.internal.AbstractC9643k;
import kotlin.coroutines.jvm.internal.C9633b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9677q;
import nf.C10848t;
import tf.C12962d;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m15073d2 = {"", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
@AbstractC9636e(m14702c = "com.discord.billing.BillingManager$reconnect$1", m14701f = "BillingManager.kt", m14700l = {}, m14699m = "invokeSuspend")
/* loaded from: classes.dex */
public final class BillingManager$reconnect$1 extends AbstractC9643k implements Function1<Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BillingManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingManager$reconnect$1(BillingManager billingManager, Continuation<? super BillingManager$reconnect$1> continuation) {
        super(1, continuation);
        this.this$0 = billingManager;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new BillingManager$reconnect$1(this.this$0, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((BillingManager$reconnect$1) create(continuation)).invokeSuspend(Unit.f25780a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Object invokeSuspend(Object obj) {
        BillingClient billingClient;
        BillingManager$billingClientStateListener$1 billingManager$billingClientStateListener$1;
        C12962d.m4646d();
        if (this.label == 0) {
            C10848t.m10930b(obj);
            billingClient = this.this$0.billingClient;
            if (billingClient == null) {
                C9677q.m14615y("billingClient");
                billingClient = null;
            }
            billingManager$billingClientStateListener$1 = this.this$0.billingClientStateListener;
            billingClient.mo32703j(billingManager$billingClientStateListener$1);
            this.this$0.getOnConnectionUpdated().invoke(C9633b.m14704c(BillingManager.ConnectionState.CONNECTING.getValue()));
            return Unit.f25780a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
