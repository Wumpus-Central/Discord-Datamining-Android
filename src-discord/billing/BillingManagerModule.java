package com.discord.billing;

import com.discord.billing.react.events.BillingManagerConnectionStateUpdated;
import com.discord.billing.react.events.BillingManagerDowngradeCommand;
import com.discord.billing.react.events.BillingManagerPurchaseUpdated;
import com.discord.billing.types.SkuType;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import java.util.ArrayList;
import java.util.List;
import kg.x;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\nH\u0007J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\b\u0010\u0015\u001a\u00020\fH\u0016J\u0018\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\b\u0010\u0018\u001a\u00020\nH\u0007J \u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J>\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\u0010!\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J$\u0010\"\u001a\u00020\n*\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010#\u001a\u00020$2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/discord/billing/BillingManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "billingManager", "Lcom/discord/billing/BillingManager;", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "addListener", "", "type", "", "close", "consumePurchase", "purchaseToken", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "getIAPSkus", "skuIds", "Lcom/facebook/react/bridge/ReadableArray;", "getName", "getSubscriptionSkus", "loadPurchases", "open", "purchase", "skuId", "userId", "removeListeners", "count", "", "subscribe", "oldSkuId", "offerId", "getSkus", "skuType", "Lcom/discord/billing/types/SkuType;", "billing_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BillingManagerModule extends ReactContextBaseJavaModule {
    private final BillingManager billingManager;
    private final ReactEvents reactEvents = new ReactEvents(x.a("billing-manager-connection-state-updated", f0.b(BillingManagerConnectionStateUpdated.class)), x.a("billing-manager-purchase-updated", f0.b(BillingManagerPurchaseUpdated.class)), x.a("billing-manager-downgrade-command", f0.b(BillingManagerDowngradeCommand.class)));

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        q.g(reactContext, "reactContext");
        this.billingManager = new BillingManager(new BillingManagerModule$billingManager$1(this, reactContext), new BillingManagerModule$billingManager$2(this, reactContext), new BillingManagerModule$billingManager$3(this, reactContext));
    }

    private final void getSkus(BillingManager billingManager, ReadableArray readableArray, SkuType skuType, Promise promise) {
        ArrayList<Object> arrayList = readableArray.toArrayList();
        q.f(arrayList, "skuIds.toArrayList()");
        List<String> arrayList2 = new ArrayList<>();
        for (Object obj : arrayList) {
            if (obj instanceof String) {
                arrayList2.add(obj);
            }
        }
        billingManager.getSkus(arrayList2, skuType, promise, new BillingManagerModule$getSkus$1(promise));
    }

    @ReactMethod
    public final void addListener(String type) {
        q.g(type, "type");
    }

    @ReactMethod
    public final void close() {
        this.billingManager.close();
    }

    @ReactMethod
    public final void consumePurchase(String purchaseToken, Promise promise) {
        q.g(purchaseToken, "purchaseToken");
        q.g(promise, "promise");
        this.billingManager.consumePurchase(purchaseToken, new BillingManagerModule$consumePurchase$1(promise), new BillingManagerModule$consumePurchase$2(promise));
    }

    @ReactMethod
    public final void getIAPSkus(ReadableArray skuIds, Promise promise) {
        q.g(skuIds, "skuIds");
        q.g(promise, "promise");
        getSkus(this.billingManager, skuIds, SkuType.IAP, promise);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "BillingManager";
    }

    @ReactMethod
    public final void getSubscriptionSkus(ReadableArray skuIds, Promise promise) {
        q.g(skuIds, "skuIds");
        q.g(promise, "promise");
        getSkus(this.billingManager, skuIds, SkuType.SUBSCRIPTIONS, promise);
    }

    @ReactMethod
    public final void loadPurchases(Promise promise) {
        q.g(promise, "promise");
        this.billingManager.loadPurchases(new BillingManagerModule$loadPurchases$1(promise), new BillingManagerModule$loadPurchases$2(promise));
    }

    @ReactMethod
    public final void open() {
        BillingManager billingManager = this.billingManager;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        q.f(reactApplicationContext, "reactApplicationContext");
        billingManager.open(reactApplicationContext);
    }

    @ReactMethod
    public final void purchase(String skuId, String userId, Promise promise) {
        q.g(skuId, "skuId");
        q.g(userId, "userId");
        q.g(promise, "promise");
        this.billingManager.purchase(getCurrentActivity(), skuId, SkuType.IAP, userId, (r22 & 16) != 0 ? null : null, (r22 & 32) != 0 ? null : null, (r22 & 64) != 0 ? null : null, new BillingManagerModule$purchase$1(promise), new BillingManagerModule$purchase$2(promise));
    }

    @ReactMethod
    public final void removeListeners(int i10) {
    }

    @ReactMethod
    public final void subscribe(String skuId, String userId, String str, String str2, String str3, Promise promise) {
        q.g(skuId, "skuId");
        q.g(userId, "userId");
        q.g(promise, "promise");
        this.billingManager.purchase(getCurrentActivity(), skuId, SkuType.SUBSCRIPTIONS, userId, str, str2, str3, new BillingManagerModule$subscribe$1(promise), new BillingManagerModule$subscribe$2(promise));
    }
}
