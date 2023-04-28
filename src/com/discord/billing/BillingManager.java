package com.discord.billing;

import android.app.Activity;
import android.content.Context;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.discord.billing.BillingManager;
import com.discord.billing.types.ProductType;
import com.discord.billing.types.QueryProductDetailsParams;
import com.discord.billing.types.SkuDetailsParams;
import com.discord.billing.types.SkuType;
import com.discord.misc.utilities.backoff.ExponentialBackoff;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9906j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.C10150n1;
import p377v2.AbstractC13391a;
import p377v2.AbstractC13396c;
import p377v2.AbstractC13398d;
import p377v2.AbstractC13400e;
import p377v2.AbstractC13401f;
import p377v2.AbstractC13402g;
import p377v2.C13393b;

@Metadata(m15074d1 = {"\u0000\u0097\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t*\u0001B\b\u0000\u0018\u00002\u00020\u0001:\u0002LMBO\u0012\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u00070\r\u0012\u001e\u00109\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000708\u0012\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u00070\r¢\u0006\u0004\bJ\u0010KJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0002JP\u0010\u0013\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0018\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0004\u0012\u0004\u0012\u00020\u00070\r2\u0016\u0010\u0012\u001a\u0012\u0012\b\u0012\u00060\u0010j\u0002`\u0011\u0012\u0004\u0012\u00020\u00070\rH\u0002Jf\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\t2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u001a2\u0016\u0010\u0012\u001a\u0012\u0012\b\u0012\u00060\u0010j\u0002`\u0011\u0012\u0004\u0012\u00020\u00070\rH\u0002Jr\u0010!\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\t2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u001a2\u0016\u0010\u0012\u001a\u0012\u0012\b\u0012\u00060\u0010j\u0002`\u0011\u0012\u0004\u0012\u00020\u00070\rH\u0002J\b\u0010\"\u001a\u00020\u0007H\u0002J\b\u0010$\u001a\u00020#H\u0002J\u0010\u0010&\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u0005H\u0002J\f\u0010'\u001a\u00020#*\u00020\u0002H\u0002J%\u0010)\u001a\u00020\u0007*\u0012\u0012\b\u0012\u00060\u0010j\u0002`\u0011\u0012\u0004\u0012\u00020\u00070\r2\u0006\u0010(\u001a\u00020\tH\u0082\u0002J\u000e\u0010,\u001a\u00020\u00072\u0006\u0010+\u001a\u00020*J\u0006\u0010-\u001a\u00020\u0007Jh\u0010\u0013\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0018\u0010.\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0004\u0012\u0004\u0012\u00020\u00070\r2\u0018\u00100\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u0004\u0012\u0004\u0012\u00020\u00070\r2\u0016\u0010\u0012\u001a\u0012\u0012\b\u0012\u00060\u0010j\u0002`\u0011\u0012\u0004\u0012\u00020\u00070\rJr\u0010%\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\t2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u001a2\u0016\u0010\u0012\u001a\u0012\u0012\b\u0012\u00060\u0010j\u0002`\u0011\u0012\u0004\u0012\u00020\u00070\rJ4\u00101\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u001a2\u0016\u0010\u0012\u001a\u0012\u0012\b\u0012\u00060\u0010j\u0002`\u0011\u0012\u0004\u0012\u00020\u00070\rJ0\u00102\u001a\u00020\u00072\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u001a2\u0018\b\u0002\u0010\u0012\u001a\u0012\u0012\b\u0012\u00060\u0010j\u0002`\u0011\u0012\u0004\u0012\u00020\u00070\rR#\u00104\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u00070\r8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R/\u00109\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007088\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R#\u0010=\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u00070\r8\u0006¢\u0006\f\n\u0004\b=\u00105\u001a\u0004\b>\u00107R\u0016\u0010@\u001a\u00020?8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001a\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bF\u0010G\u0012\u0004\bH\u0010I¨\u0006N"}, m15073d2 = {"Lcom/discord/billing/BillingManager;", "", "Lcom/android/billingclient/api/BillingResult;", "billingResult", "", "Lcom/android/billingclient/api/Purchase;", "purchases", "", "handlePurchases", "", "skuIds", "Lcom/discord/billing/types/SkuType;", "skuType", "Lkotlin/Function1;", "Lcom/android/billingclient/api/SkuDetails;", "onSuccess", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onError", "getSkus", "Landroid/app/Activity;", "activity", "skuId", "userId", "oldSkuId", "purchaseToken", "Lkotlin/Function0;", "purchaseWithSkuDetails", "productId", "Lcom/discord/billing/types/ProductType;", "productType", "oldProductId", "offerId", "purchaseWithProductDetails", "reconnect", "", "isBillingClientReady", "purchase", "verifyPurchase", "isNotOk", "errorMessage", "invoke", "Landroid/content/Context;", "context", "open", "close", "onQuerySkuDetailsAsyncSuccess", "Lcom/android/billingclient/api/ProductDetails;", "onQueryProductDetailsAsyncSuccess", "consumePurchase", "loadPurchases", "", "onConnectionUpdated", "Lkotlin/jvm/functions/Function1;", "getOnConnectionUpdated", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/Function3;", "onPurchaseUpdated", "Lkotlin/jvm/functions/Function3;", "getOnPurchaseUpdated", "()Lkotlin/jvm/functions/Function3;", "onDowngradeCommand", "getOnDowngradeCommand", "Lcom/android/billingclient/api/BillingClient;", "billingClient", "Lcom/android/billingclient/api/BillingClient;", "com/discord/billing/BillingManager$billingClientStateListener$1", "billingClientStateListener", "Lcom/discord/billing/BillingManager$billingClientStateListener$1;", "Lcom/discord/misc/utilities/backoff/ExponentialBackoff;", "backoff", "Lcom/discord/misc/utilities/backoff/ExponentialBackoff;", "getBackoff$annotations", "()V", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;)V", "ConnectionState", "DowngradeCommand", "billing_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BillingManager {
    private BillingClient billingClient;
    private final Function1<Integer, Unit> onConnectionUpdated;
    private final Function1<Integer, Unit> onDowngradeCommand;
    private final Function3<String, String, String, Unit> onPurchaseUpdated;
    private final BillingManager$billingClientStateListener$1 billingClientStateListener = new AbstractC13391a() { // from class: com.discord.billing.BillingManager$billingClientStateListener$1
        @Override // p377v2.AbstractC13391a
        public void onBillingServiceDisconnected() {
            BillingClient billingClient;
            BillingManager.this.getOnConnectionUpdated().invoke(Integer.valueOf(BillingManager.ConnectionState.DISCONNECTED.getValue()));
            billingClient = BillingManager.this.billingClient;
            if (billingClient == null) {
                C9971q.m14615y("billingClient");
                billingClient = null;
            }
            if (!billingClient.mo32708d()) {
                BillingManager.this.reconnect();
            }
        }

        @Override // p377v2.AbstractC13391a
        public void onBillingSetupFinished(BillingResult billingResult) {
            boolean isNotOk;
            ExponentialBackoff exponentialBackoff;
            C9971q.m14633g(billingResult, "billingResult");
            isNotOk = BillingManager.this.isNotOk(billingResult);
            if (isNotOk) {
                BillingManager.this.reconnect();
                return;
            }
            exponentialBackoff = BillingManager.this.backoff;
            exponentialBackoff.succeed();
            BillingManager.this.getOnConnectionUpdated().invoke(Integer.valueOf(BillingManager.ConnectionState.CONNECTED.getValue()));
            BillingManager.loadPurchases$default(BillingManager.this, null, null, 3, null);
        }
    };
    private final ExponentialBackoff backoff = new ExponentialBackoff(C10150n1.f22356k, 1000, 300000, 10);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m15073d2 = {"Lcom/discord/billing/BillingManager$ConnectionState;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "DISCONNECTED", "CONNECTING", "CONNECTED", "ERROR", "billing_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes.dex */
    public enum ConnectionState {
        DISCONNECTED(0),
        CONNECTING(1),
        CONNECTED(2),
        ERROR(3);
        
        private final int value;

        ConnectionState(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m15073d2 = {"Lcom/discord/billing/BillingManager$DowngradeCommand;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "EXECUTE", "CLEAR", "billing_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes.dex */
    public enum DowngradeCommand {
        EXECUTE(0),
        CLEAR(1);
        
        private final int value;

        DowngradeCommand(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.discord.billing.BillingManager$billingClientStateListener$1] */
    public BillingManager(Function1<? super Integer, Unit> onConnectionUpdated, Function3<? super String, ? super String, ? super String, Unit> onPurchaseUpdated, Function1<? super Integer, Unit> onDowngradeCommand) {
        C9971q.m14633g(onConnectionUpdated, "onConnectionUpdated");
        C9971q.m14633g(onPurchaseUpdated, "onPurchaseUpdated");
        C9971q.m14633g(onDowngradeCommand, "onDowngradeCommand");
        this.onConnectionUpdated = onConnectionUpdated;
        this.onPurchaseUpdated = onPurchaseUpdated;
        this.onDowngradeCommand = onDowngradeCommand;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void consumePurchase$lambda$2(BillingManager this$0, Function1 onError, Function0 onSuccess, BillingResult billingResult, String str) {
        C9971q.m14633g(this$0, "this$0");
        C9971q.m14633g(onError, "$onError");
        C9971q.m14633g(onSuccess, "$onSuccess");
        C9971q.m14633g(billingResult, "billingResult");
        C9971q.m14633g(str, "<anonymous parameter 1>");
        if (this$0.isNotOk(billingResult)) {
            int a = billingResult.m32801a();
            this$0.invoke(onError, "Consume purchase, bad response: " + a);
            return;
        }
        onSuccess.invoke();
    }

    private static /* synthetic */ void getBackoff$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getSkus$lambda$1(BillingManager this$0, Function1 onError, Function1 onQueryProductDetailsAsyncSuccess, Ref$BooleanRef completed, BillingResult billingResult, List productDetails) {
        C9971q.m14633g(this$0, "this$0");
        C9971q.m14633g(onError, "$onError");
        C9971q.m14633g(onQueryProductDetailsAsyncSuccess, "$onQueryProductDetailsAsyncSuccess");
        C9971q.m14633g(completed, "$completed");
        C9971q.m14633g(billingResult, "billingResult");
        C9971q.m14633g(productDetails, "productDetails");
        synchronized (this$0) {
            if (!completed.f22067k) {
                completed.f22067k = true;
                Unit unit = Unit.f22042a;
                if (this$0.isNotOk(billingResult)) {
                    int a = billingResult.m32801a();
                    this$0.invoke(onError, "Product fetch, bad response code: " + a);
                    return;
                }
                onQueryProductDetailsAsyncSuccess.invoke(productDetails);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getSkus$lambda$4(BillingManager this$0, Function1 onError, Function1 onSuccess, Ref$BooleanRef completed, BillingResult billingResult, List list) {
        C9971q.m14633g(this$0, "this$0");
        C9971q.m14633g(onError, "$onError");
        C9971q.m14633g(onSuccess, "$onSuccess");
        C9971q.m14633g(completed, "$completed");
        C9971q.m14633g(billingResult, "billingResult");
        synchronized (this$0) {
            if (!completed.f22067k) {
                completed.f22067k = true;
                Unit unit = Unit.f22042a;
                if (this$0.isNotOk(billingResult)) {
                    int a = billingResult.m32801a();
                    this$0.invoke(onError, "Sku fetch, bad response code: " + a);
                } else if (list == null) {
                    this$0.invoke(onError, "Sku fetch, details not found");
                } else {
                    onSuccess.invoke(list);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePurchases(BillingResult billingResult, List<? extends Purchase> list) {
        boolean z;
        if (isNotOk(billingResult)) {
            this.onDowngradeCommand.invoke(Integer.valueOf(DowngradeCommand.CLEAR.getValue()));
            return;
        }
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.onDowngradeCommand.invoke(Integer.valueOf(DowngradeCommand.EXECUTE.getValue()));
            return;
        }
        for (Purchase purchase : list) {
            verifyPurchase(purchase);
        }
    }

    private final void invoke(Function1<? super Exception, Unit> function1, String str) {
        C9971q.m14633g(function1, "<this>");
        function1.invoke(new IllegalStateException(str));
    }

    private final boolean isBillingClientReady() {
        BillingClient billingClient = this.billingClient;
        if (billingClient != null) {
            if (billingClient == null) {
                C9971q.m14615y("billingClient");
                billingClient = null;
            }
            if (billingClient.mo32708d()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isNotOk(BillingResult billingResult) {
        return billingResult.m32801a() != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void loadPurchases$default(BillingManager billingManager, Function0 function0, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = BillingManager$loadPurchases$1.INSTANCE;
        }
        if ((i & 2) != 0) {
            function1 = BillingManager$loadPurchases$2.INSTANCE;
        }
        billingManager.loadPurchases(function0, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void purchaseWithProductDetails(final Activity activity, final String str, ProductType productType, final String str2, final String str3, final String str4, final String str5, final Function0<Unit> function0, final Function1<? super Exception, Unit> function1) {
        List<String> n;
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        BillingClient billingClient = this.billingClient;
        if (billingClient == null) {
            C9971q.m14615y("billingClient");
            billingClient = null;
        }
        QueryProductDetailsParams queryProductDetailsParams = QueryProductDetailsParams.INSTANCE;
        n = C9906j.m14815n(str, str3);
        billingClient.mo32706g(queryProductDetailsParams.create(productType, n), new AbstractC13398d() { // from class: com.discord.billing.a
            @Override // p377v2.AbstractC13398d
            /* renamed from: a */
            public final void mo3761a(BillingResult billingResult, List list) {
                BillingManager.purchaseWithProductDetails$lambda$8(BillingManager.this, function1, str, str3, str4, str2, str5, activity, function0, ref$BooleanRef, billingResult, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void purchaseWithProductDetails$lambda$8(BillingManager this$0, Function1 onError, String productId, String str, String str2, String userId, String str3, Activity activity, Function0 onSuccess, Ref$BooleanRef completed, BillingResult billingResult, List productDetails) {
        C9971q.m14633g(this$0, "this$0");
        C9971q.m14633g(onError, "$onError");
        C9971q.m14633g(productId, "$productId");
        C9971q.m14633g(userId, "$userId");
        C9971q.m14633g(activity, "$activity");
        C9971q.m14633g(onSuccess, "$onSuccess");
        C9971q.m14633g(completed, "$completed");
        C9971q.m14633g(billingResult, "billingResult");
        C9971q.m14633g(productDetails, "productDetails");
        synchronized (this$0) {
            if (!completed.f22067k) {
                completed.f22067k = true;
                Unit unit = Unit.f22042a;
                if (this$0.isNotOk(billingResult)) {
                    int a = billingResult.m32801a();
                    this$0.invoke(onError, "Purchase failed, bad code: " + a);
                    return;
                }
                try {
                    BillingFlowParams createWithProductDetails = com.discord.billing.types.BillingFlowParams.INSTANCE.createWithProductDetails(productDetails, productId, str, str2, userId, str3);
                    if (createWithProductDetails == null) {
                        this$0.invoke(onError, "Purchase failed, product details not found.");
                        return;
                    }
                    BillingClient billingClient = this$0.billingClient;
                    if (billingClient == null) {
                        C9971q.m14615y("billingClient");
                        billingClient = null;
                    }
                    billingClient.mo32707e(activity, createWithProductDetails);
                    onSuccess.invoke();
                } catch (AssertionError e) {
                    String message = e.getMessage();
                    C9971q.m14636d(message);
                    this$0.invoke(onError, message);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void purchaseWithSkuDetails(final Activity activity, final String str, SkuType skuType, final String str2, final String str3, final String str4, final Function0<Unit> function0, final Function1<? super Exception, Unit> function1) {
        List<String> n;
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        BillingClient billingClient = this.billingClient;
        if (billingClient == null) {
            C9971q.m14615y("billingClient");
            billingClient = null;
        }
        SkuDetailsParams skuDetailsParams = SkuDetailsParams.INSTANCE;
        n = C9906j.m14815n(str, str3);
        billingClient.mo32704i(skuDetailsParams.create(skuType, n), new AbstractC13402g() { // from class: com.discord.billing.d
            @Override // p377v2.AbstractC13402g
            /* renamed from: a */
            public final void mo3758a(BillingResult billingResult, List list) {
                BillingManager.purchaseWithSkuDetails$lambda$6(BillingManager.this, function1, str, str3, str4, str2, activity, function0, ref$BooleanRef, billingResult, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void purchaseWithSkuDetails$lambda$6(BillingManager this$0, Function1 onError, String skuId, String str, String str2, String userId, Activity activity, Function0 onSuccess, Ref$BooleanRef completed, BillingResult billingResult, List list) {
        C9971q.m14633g(this$0, "this$0");
        C9971q.m14633g(onError, "$onError");
        C9971q.m14633g(skuId, "$skuId");
        C9971q.m14633g(userId, "$userId");
        C9971q.m14633g(activity, "$activity");
        C9971q.m14633g(onSuccess, "$onSuccess");
        C9971q.m14633g(completed, "$completed");
        C9971q.m14633g(billingResult, "billingResult");
        synchronized (this$0) {
            if (!completed.f22067k) {
                completed.f22067k = true;
                Unit unit = Unit.f22042a;
                if (this$0.isNotOk(billingResult)) {
                    int a = billingResult.m32801a();
                    this$0.invoke(onError, "Purchase failed, bad code: " + a);
                    return;
                }
                BillingFlowParams create = com.discord.billing.types.BillingFlowParams.INSTANCE.create(list, skuId, str, str2, userId);
                if (create == null) {
                    this$0.invoke(onError, "Purchase failed, Sku details not found.");
                    return;
                }
                BillingClient billingClient = this$0.billingClient;
                if (billingClient == null) {
                    C9971q.m14615y("billingClient");
                    billingClient = null;
                }
                billingClient.mo32707e(activity, create);
                onSuccess.invoke();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reconnect() {
        try {
            this.backoff.fail(new BillingManager$reconnect$1(this, null));
        } catch (Exception unused) {
            this.onConnectionUpdated.invoke(Integer.valueOf(ConnectionState.ERROR.getValue()));
        }
    }

    private final void verifyPurchase(Purchase purchase) {
        if (purchase.m32770c() == 1 && !purchase.m32766g()) {
            ArrayList<String> f = purchase.m32767f();
            C9971q.m14634f(f, "purchase.skus");
            for (String sku : f) {
                Function3<String, String, String, Unit> function3 = this.onPurchaseUpdated;
                String d = purchase.m32769d();
                C9971q.m14634f(d, "purchase.purchaseToken");
                String b = purchase.m32771b();
                C9971q.m14634f(b, "purchase.packageName");
                C9971q.m14634f(sku, "sku");
                function3.invoke(d, b, sku);
            }
        }
    }

    public final void close() {
        BillingClient billingClient = this.billingClient;
        if (billingClient != null) {
            if (billingClient == null) {
                C9971q.m14615y("billingClient");
                billingClient = null;
            }
            billingClient.mo32710b();
            this.backoff.cancel();
            return;
        }
        this.onConnectionUpdated.invoke(Integer.valueOf(ConnectionState.ERROR.getValue()));
    }

    public final void consumePurchase(String purchaseToken, final Function0<Unit> onSuccess, final Function1<? super Exception, Unit> onError) {
        C9971q.m14633g(purchaseToken, "purchaseToken");
        C9971q.m14633g(onSuccess, "onSuccess");
        C9971q.m14633g(onError, "onError");
        if (!isBillingClientReady()) {
            invoke(onError, "Consume purchase, billing connection is not ready.");
            return;
        }
        C13393b a = C13393b.m3766b().m3763b(purchaseToken).m3764a();
        C9971q.m14634f(a, "newBuilder()\n           …\n                .build()");
        BillingClient billingClient = this.billingClient;
        if (billingClient == null) {
            C9971q.m14615y("billingClient");
            billingClient = null;
        }
        billingClient.mo32711a(a, new AbstractC13396c() { // from class: com.discord.billing.c
            @Override // p377v2.AbstractC13396c
            /* renamed from: a */
            public final void mo3762a(BillingResult billingResult, String str) {
                BillingManager.consumePurchase$lambda$2(BillingManager.this, onError, onSuccess, billingResult, str);
            }
        });
    }

    public final Function1<Integer, Unit> getOnConnectionUpdated() {
        return this.onConnectionUpdated;
    }

    public final Function1<Integer, Unit> getOnDowngradeCommand() {
        return this.onDowngradeCommand;
    }

    public final Function3<String, String, String, Unit> getOnPurchaseUpdated() {
        return this.onPurchaseUpdated;
    }

    public final void getSkus(List<String> skuIds, SkuType skuType, Function1<? super List<? extends SkuDetails>, Unit> onQuerySkuDetailsAsyncSuccess, final Function1<? super List<ProductDetails>, Unit> onQueryProductDetailsAsyncSuccess, final Function1<? super Exception, Unit> onError) {
        C9971q.m14633g(skuIds, "skuIds");
        C9971q.m14633g(skuType, "skuType");
        C9971q.m14633g(onQuerySkuDetailsAsyncSuccess, "onQuerySkuDetailsAsyncSuccess");
        C9971q.m14633g(onQueryProductDetailsAsyncSuccess, "onQueryProductDetailsAsyncSuccess");
        C9971q.m14633g(onError, "onError");
        if (!isBillingClientReady()) {
            invoke(onError, "Billing connection is not ready.");
            return;
        }
        BillingClient billingClient = this.billingClient;
        BillingClient billingClient2 = null;
        if (billingClient == null) {
            C9971q.m14615y("billingClient");
            billingClient = null;
        }
        BillingResult c = billingClient.mo32709c("fff");
        C9971q.m14634f(c, "billingClient.isFeatureS…tureType.PRODUCT_DETAILS)");
        if (isNotOk(c)) {
            getSkus(skuIds, skuType, onQuerySkuDetailsAsyncSuccess, onError);
            return;
        }
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        BillingClient billingClient3 = this.billingClient;
        if (billingClient3 == null) {
            C9971q.m14615y("billingClient");
        } else {
            billingClient2 = billingClient3;
        }
        billingClient2.mo32706g(QueryProductDetailsParams.INSTANCE.create(ProductType.valueOf(skuType.name()), skuIds), new AbstractC13398d() { // from class: com.discord.billing.b
            @Override // p377v2.AbstractC13398d
            /* renamed from: a */
            public final void mo3761a(BillingResult billingResult, List list) {
                BillingManager.getSkus$lambda$1(BillingManager.this, onError, onQueryProductDetailsAsyncSuccess, ref$BooleanRef, billingResult, list);
            }
        });
    }

    public final void loadPurchases(Function0<Unit> onSuccess, Function1<? super Exception, Unit> onError) {
        C9971q.m14633g(onSuccess, "onSuccess");
        C9971q.m14633g(onError, "onError");
        if (!isBillingClientReady()) {
            invoke(onError, "Failed to load purchases, billing connection is not ready.");
            return;
        }
        BillingClient billingClient = this.billingClient;
        BillingClient billingClient2 = null;
        if (billingClient == null) {
            C9971q.m14615y("billingClient");
            billingClient = null;
        }
        billingClient.mo32705h("inapp", new AbstractC13400e() { // from class: com.discord.billing.g
            @Override // p377v2.AbstractC13400e
            /* renamed from: a */
            public final void mo3760a(BillingResult billingResult, List list) {
                BillingManager.this.handlePurchases(billingResult, list);
            }
        });
        BillingClient billingClient3 = this.billingClient;
        if (billingClient3 == null) {
            C9971q.m14615y("billingClient");
        } else {
            billingClient2 = billingClient3;
        }
        billingClient2.mo32705h("subs", new AbstractC13400e() { // from class: com.discord.billing.g
            @Override // p377v2.AbstractC13400e
            /* renamed from: a */
            public final void mo3760a(BillingResult billingResult, List list) {
                BillingManager.this.handlePurchases(billingResult, list);
            }
        });
        onSuccess.invoke();
    }

    public final void open(Context context) {
        C9971q.m14633g(context, "context");
        BillingClient a = BillingClient.m32847f(context).m32845b().m32844c(new AbstractC13401f() { // from class: com.discord.billing.e
            @Override // p377v2.AbstractC13401f
            /* renamed from: a */
            public final void mo3759a(BillingResult billingResult, List list) {
                BillingManager.this.handlePurchases(billingResult, list);
            }
        }).m32846a();
        C9971q.m14634f(a, "newBuilder(context)\n    …\n                .build()");
        this.billingClient = a;
        BillingClient billingClient = null;
        if (a == null) {
            C9971q.m14615y("billingClient");
            a = null;
        }
        if (!a.mo32708d()) {
            try {
                BillingClient billingClient2 = this.billingClient;
                if (billingClient2 == null) {
                    C9971q.m14615y("billingClient");
                } else {
                    billingClient = billingClient2;
                }
                billingClient.mo32703j(this.billingClientStateListener);
                this.onConnectionUpdated.invoke(Integer.valueOf(ConnectionState.CONNECTING.getValue()));
            } catch (Exception unused) {
                this.onConnectionUpdated.invoke(Integer.valueOf(ConnectionState.ERROR.getValue()));
            }
        }
    }

    public final void purchase(Activity activity, String skuId, SkuType skuType, String userId, String str, String str2, String str3, Function0<Unit> onSuccess, Function1<? super Exception, Unit> onError) {
        C9971q.m14633g(skuId, "skuId");
        C9971q.m14633g(skuType, "skuType");
        C9971q.m14633g(userId, "userId");
        C9971q.m14633g(onSuccess, "onSuccess");
        C9971q.m14633g(onError, "onError");
        if (!isBillingClientReady()) {
            invoke(onError, "Purchase failed, billing connection is not ready.");
        } else if (activity == null) {
            invoke(onError, "Purchase failed, missing current activity.");
        } else {
            BillingClient billingClient = this.billingClient;
            if (billingClient == null) {
                C9971q.m14615y("billingClient");
                billingClient = null;
            }
            BillingResult c = billingClient.mo32709c("fff");
            C9971q.m14634f(c, "billingClient.isFeatureS…tureType.PRODUCT_DETAILS)");
            if (!isNotOk(c)) {
                purchaseWithProductDetails(activity, skuId, ProductType.valueOf(skuType.name()), userId, str, str2, str3, onSuccess, onError);
            } else if (str3 != null) {
                invoke(onError, "Purchase failed, offerId passed for device not supported");
            } else {
                purchaseWithSkuDetails(activity, skuId, skuType, userId, str, str2, onSuccess, onError);
            }
        }
    }

    private final void getSkus(List<String> list, SkuType skuType, final Function1<? super List<? extends SkuDetails>, Unit> function1, final Function1<? super Exception, Unit> function12) {
        if (!isBillingClientReady()) {
            invoke(function12, "Billing connection is not ready.");
            return;
        }
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        BillingClient billingClient = this.billingClient;
        if (billingClient == null) {
            C9971q.m14615y("billingClient");
            billingClient = null;
        }
        billingClient.mo32704i(SkuDetailsParams.INSTANCE.create(skuType, list), new AbstractC13402g() { // from class: com.discord.billing.f
            @Override // p377v2.AbstractC13402g
            /* renamed from: a */
            public final void mo3758a(BillingResult billingResult, List list2) {
                BillingManager.getSkus$lambda$4(BillingManager.this, function12, function1, ref$BooleanRef, billingResult, list2);
            }
        });
    }
}
