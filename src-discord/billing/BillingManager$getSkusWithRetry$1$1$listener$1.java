package com.discord.billing;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.SkuDetails;
import com.discord.billing.BillingManager;
import com.discord.logging.Log;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.CompletableDeferred;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "billingResult", "Lcom/android/billingclient/api/BillingResult;", "skuDetails", "", "Lcom/android/billingclient/api/SkuDetails;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class BillingManager$getSkusWithRetry$1$1$listener$1 extends s implements Function2<BillingResult, List<? extends SkuDetails>, Unit> {
    final  CompletableDeferred<BillingManager.SkuDetailsResponse> $deferred;

    
    
    public BillingManager$getSkusWithRetry$1$1$listener$1(CompletableDeferred<BillingManager.SkuDetailsResponse> completableDeferred) {
        super(2);
        this.$deferred = completableDeferred;
    }

    @Override 
    public   Unit invoke(BillingResult billingResult, List<? extends SkuDetails> list) {
        invoke2(billingResult, list);
        return Unit.f21600a;
    }

    
    public final void invoke2(BillingResult billingResult, List<? extends SkuDetails> skuDetails) {
        q.h(billingResult, "billingResult");
        q.h(skuDetails, "skuDetails");
        if (!this.$deferred.V(new BillingManager.SkuDetailsResponse(billingResult, skuDetails))) {
            Log.i$default(Log.INSTANCE, "getSkusWithRetry", "CompletableDeferred completed multiple times, indicating multiple callbacks from querySkuDetailsAsync", (Throwable) null, 4, (Object) null);
        }
    }
}
