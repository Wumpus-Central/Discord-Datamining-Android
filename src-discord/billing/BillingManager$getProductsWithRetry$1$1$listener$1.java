package com.discord.billing;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.discord.billing.BillingManager;
import com.discord.logging.Log;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.CompletableDeferred;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "billingResult", "Lcom/android/billingclient/api/BillingResult;", "skuDetails", "", "Lcom/android/billingclient/api/ProductDetails;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class BillingManager$getProductsWithRetry$1$1$listener$1 extends s implements Function2<BillingResult, List<? extends ProductDetails>, Unit> {
    final  CompletableDeferred<BillingManager.ProductDetailsResponse> $deferred;

    
    
    public BillingManager$getProductsWithRetry$1$1$listener$1(CompletableDeferred<BillingManager.ProductDetailsResponse> completableDeferred) {
        super(2);
        this.$deferred = completableDeferred;
    }

    @Override 
    public   Unit invoke(BillingResult billingResult, List<? extends ProductDetails> list) {
        invoke2(billingResult, (List<ProductDetails>) list);
        return Unit.f21442a;
    }

    
    public final void invoke2(BillingResult billingResult, List<ProductDetails> skuDetails) {
        q.h(billingResult, "billingResult");
        q.h(skuDetails, "skuDetails");
        if (!this.$deferred.U(new BillingManager.ProductDetailsResponse(billingResult, skuDetails))) {
            Log.i$default(Log.INSTANCE, "getProductsWithRetry", "CompletableDeferred completed multiple times, indicating multiple callbacks from queryProductDetailsAsync", (Throwable) null, 4, (Object) null);
        }
    }
}
