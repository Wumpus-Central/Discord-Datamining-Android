package com.discord.billing;

import com.android.billingclient.api.SkuDetails;
import com.discord.billing.react.events.serialization.SerializeSkuDetailsKt;
import com.facebook.react.bridge.Promise;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, m15073d2 = {"<anonymous>", "", "skuDetails", "", "Lcom/android/billingclient/api/SkuDetails;", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
final class BillingManagerModule$getSkus$1 extends AbstractC9973s implements Function1<List<? extends SkuDetails>, Unit> {
    final /* synthetic */ Promise $promise;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingManagerModule$getSkus$1(Promise promise) {
        super(1);
        this.$promise = promise;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends SkuDetails> list) {
        invoke2(list);
        return Unit.f22042a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<? extends SkuDetails> skuDetails) {
        C9971q.m14633g(skuDetails, "skuDetails");
        this.$promise.resolve(SerializeSkuDetailsKt.serializeSkuDetails(skuDetails));
    }
}
