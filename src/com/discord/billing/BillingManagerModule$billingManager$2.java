package com.discord.billing;

import com.discord.billing.react.events.BillingManagerPurchaseUpdated;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AbstractC9679s;
import kotlin.jvm.internal.C9677q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0006"}, m15073d2 = {"<anonymous>", "", "purchaseToken", "", "packageName", "sku", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public final class BillingManagerModule$billingManager$2 extends AbstractC9679s implements Function3<String, String, String, Unit> {
    final /* synthetic */ ReactApplicationContext $reactContext;
    final /* synthetic */ BillingManagerModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingManagerModule$billingManager$2(BillingManagerModule billingManagerModule, ReactApplicationContext reactApplicationContext) {
        super(3);
        this.this$0 = billingManagerModule;
        this.$reactContext = reactApplicationContext;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2, String str3) {
        invoke2(str, str2, str3);
        return Unit.f25780a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String purchaseToken, String packageName, String sku) {
        ReactEvents reactEvents;
        C9677q.m14633g(purchaseToken, "purchaseToken");
        C9677q.m14633g(packageName, "packageName");
        C9677q.m14633g(sku, "sku");
        reactEvents = this.this$0.reactEvents;
        reactEvents.emitModuleEvent(this.$reactContext, new BillingManagerPurchaseUpdated(purchaseToken, packageName, sku));
    }
}
