package com.discord.billing;

import com.android.billingclient.api.ProductDetails;
import com.discord.billing.react.events.serialization.SerializeProductDetailsKt;
import com.facebook.react.bridge.Promise;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9679s;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, m15073d2 = {"<anonymous>", "", "productDetails", "", "Lcom/android/billingclient/api/ProductDetails;", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
final class BillingManagerModule$getSkus$2 extends AbstractC9679s implements Function1<List<? extends ProductDetails>, Unit> {
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
        return Unit.f25780a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<ProductDetails> productDetails) {
        C9677q.m14633g(productDetails, "productDetails");
        try {
            this.$promise.resolve(SerializeProductDetailsKt.serializeProductDetails(productDetails));
        } catch (AssertionError e) {
            this.$promise.reject(e);
        }
    }
}
