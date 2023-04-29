package com.discord.billing;

import com.android.billingclient.api.ProductDetails;
import com.discord.billing.react.events.serialization.SerializeProductDetailsKt;
import com.facebook.react.bridge.Promise;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "productDetails", "", "Lcom/android/billingclient/api/ProductDetails;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class BillingManagerModule$getSkus$2 extends s implements Function1<List<? extends ProductDetails>, Unit> {
    final /* synthetic */ Promise $promise;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingManagerModule$getSkus$2(Promise promise) {
        super(1);
        this.$promise = promise;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends ProductDetails> list) {
        invoke2((List<ProductDetails>) list);
        return Unit.f22042a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<ProductDetails> productDetails) {
        q.g(productDetails, "productDetails");
        try {
            this.$promise.resolve(SerializeProductDetailsKt.serializeProductDetails(productDetails));
        } catch (AssertionError e10) {
            this.$promise.reject(e10);
        }
    }
}