package com.discord.billing;

import com.discord.billing.react.events.BillingManagerPurchaseUpdated;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "purchaseToken", "", "packageName", "sku", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class BillingManagerModule$billingManager$2 extends s implements Function3<String, String, String, Unit> {
    final  ReactApplicationContext $reactContext;
    final  BillingManagerModule this$0;

    
    
    public BillingManagerModule$billingManager$2(BillingManagerModule billingManagerModule, ReactApplicationContext reactApplicationContext) {
        super(3);
        this.this$0 = billingManagerModule;
        this.$reactContext = reactApplicationContext;
    }

    @Override 
    public   Unit invoke(String str, String str2, String str3) {
        invoke2(str, str2, str3);
        return Unit.f20666a;
    }

    
    public final void invoke2(String purchaseToken, String packageName, String sku) {
        ReactEvents reactEvents;
        q.g(purchaseToken, "purchaseToken");
        q.g(packageName, "packageName");
        q.g(sku, "sku");
        reactEvents = this.this$0.reactEvents;
        reactEvents.emitModuleEvent(this.$reactContext, new BillingManagerPurchaseUpdated(purchaseToken, packageName, sku));
    }
}
