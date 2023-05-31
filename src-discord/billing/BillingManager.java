package com.discord.billing;

import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.m;
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
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.j;
import kotlin.collections.w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.q;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.l;
import kotlinx.coroutines.n1;
import kotlinx.coroutines.y0;
import v2.a;
import v2.b;
import v2.c;
import v2.d;
import v2.e;
import v2.f;
import v2.g;

@Metadata(d1 = {"\u0000\u0095\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001C\b\u0000\u0018\u00002\u00020\u0001:\u0004PQRSBO\u0012\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\t0\u0011\u0012\u001e\u0010:\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t09\u0012\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0004\bN\u0010OJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002J>\u0010\u0015\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0016\u0010\u0014\u001a\u0012\u0012\b\u0012\u00060\u0012j\u0002`\u0013\u0012\u0004\u0012\u00020\t0\u0011H\u0002J>\u0010\u0016\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0016\u0010\u0014\u001a\u0012\u0012\b\u0012\u00060\u0012j\u0002`\u0013\u0012\u0004\u0012\u00020\t0\u0011H\u0002Jf\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u000b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001d2\u0016\u0010\u0014\u001a\u0012\u0012\b\u0012\u00060\u0012j\u0002`\u0013\u0012\u0004\u0012\u00020\t0\u0011H\u0002Jr\u0010%\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u000b2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001d2\u0016\u0010\u0014\u001a\u0012\u0012\b\u0012\u00060\u0012j\u0002`\u0013\u0012\u0004\u0012\u00020\t0\u0011H\u0002J\b\u0010&\u001a\u00020\tH\u0002J\b\u0010'\u001a\u00020\u0004H\u0002J\u0010\u0010)\u001a\u00020\t2\u0006\u0010(\u001a\u00020\u0007H\u0002J\f\u0010*\u001a\u00020\u0004*\u00020\u0002H\u0002J%\u0010,\u001a\u00020\t*\u0012\u0012\b\u0012\u00060\u0012j\u0002`\u0013\u0012\u0004\u0012\u00020\t0\u00112\u0006\u0010+\u001a\u00020\u000bH\u0082\u0002J\u000e\u0010/\u001a\u00020\t2\u0006\u0010.\u001a\u00020-J\u0006\u00100\u001a\u00020\tJ<\u00101\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0016\u0010\u0014\u001a\u0012\u0012\b\u0012\u00060\u0012j\u0002`\u0013\u0012\u0004\u0012\u00020\t0\u0011Jr\u0010(\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u000b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001d2\u0016\u0010\u0014\u001a\u0012\u0012\b\u0012\u00060\u0012j\u0002`\u0013\u0012\u0004\u0012\u00020\t0\u0011J4\u00102\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u000b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001d2\u0016\u0010\u0014\u001a\u0012\u0012\b\u0012\u00060\u0012j\u0002`\u0013\u0012\u0004\u0012\u00020\t0\u0011J0\u00103\u001a\u00020\t2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001d2\u0018\b\u0002\u0010\u0014\u001a\u0012\u0012\b\u0012\u00060\u0012j\u0002`\u0013\u0012\u0004\u0012\u00020\t0\u0011R#\u00105\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\t0\u00118\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R/\u0010:\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t098\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R#\u0010>\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\t0\u00118\u0006¢\u0006\f\n\u0004\b>\u00106\u001a\u0004\b?\u00108R\u0016\u0010A\u001a\u00020@8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010G\u001a\u00020F8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bG\u0010HR\u001a\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bJ\u0010K\u0012\u0004\bL\u0010M¨\u0006T"}, d2 = {"Lcom/discord/billing/BillingManager;", "", "Lcom/android/billingclient/api/BillingResult;", "billingResult", "", "isRetryableError", "", "Lcom/android/billingclient/api/Purchase;", "purchases", "", "handlePurchases", "", "skuIds", "Lcom/discord/billing/types/SkuType;", "skuType", "Lcom/facebook/react/bridge/Promise;", "reactPromise", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onError", "getSkusWithRetry", "getProductsWithRetry", "Landroid/app/Activity;", "activity", "skuId", "userId", "oldSkuId", "purchaseToken", "Lkotlin/Function0;", "onSuccess", "purchaseWithSkuDetails", "productId", "Lcom/discord/billing/types/ProductType;", "productType", "oldProductId", "offerId", "purchaseWithProductDetails", "reconnect", "isBillingClientReady", "purchase", "verifyPurchase", "isNotOk", "errorMessage", "invoke", "Lcom/facebook/react/bridge/ReactApplicationContext;", "context", "open", "close", "getSkus", "consumePurchase", "loadPurchases", "", "onConnectionUpdated", "Lkotlin/jvm/functions/Function1;", "getOnConnectionUpdated", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/Function3;", "onPurchaseUpdated", "Lkotlin/jvm/functions/Function3;", "getOnPurchaseUpdated", "()Lkotlin/jvm/functions/Function3;", "onDowngradeCommand", "getOnDowngradeCommand", "Lcom/android/billingclient/api/BillingClient;", "billingClient", "Lcom/android/billingclient/api/BillingClient;", "com/discord/billing/BillingManager$billingClientStateListener$1", "billingClientStateListener", "Lcom/discord/billing/BillingManager$billingClientStateListener$1;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/discord/misc/utilities/backoff/ExponentialBackoff;", "backoff", "Lcom/discord/misc/utilities/backoff/ExponentialBackoff;", "getBackoff$annotations", "()V", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;)V", "ConnectionState", "DowngradeCommand", "ProductDetailsResponse", "SkuDetailsResponse", "billing_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BillingManager {
    private BillingClient billingClient;
    private CoroutineScope coroutineScope;
    private final Function1<Integer, Unit> onConnectionUpdated;
    private final Function1<Integer, Unit> onDowngradeCommand;
    private final Function3<String, String, String, Unit> onPurchaseUpdated;
    private final BillingManager$billingClientStateListener$1 billingClientStateListener = new a() { // from class: com.discord.billing.BillingManager$billingClientStateListener$1
        @Override // v2.a
        public void onBillingServiceDisconnected() {
            BillingClient billingClient;
            BillingManager.this.getOnConnectionUpdated().invoke(Integer.valueOf(BillingManager.ConnectionState.DISCONNECTED.getValue()));
            billingClient = BillingManager.this.billingClient;
            if (billingClient == null) {
                q.y("billingClient");
                billingClient = null;
            }
            if (!billingClient.d()) {
                BillingManager.this.reconnect();
            }
        }

        @Override // v2.a
        public void onBillingSetupFinished(BillingResult billingResult) {
            boolean isNotOk;
            ExponentialBackoff exponentialBackoff;
            q.g(billingResult, "billingResult");
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
    private final ExponentialBackoff backoff = new ExponentialBackoff(n1.f22390k, 1000, 300000, 10);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/discord/billing/BillingManager$ConnectionState;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "DISCONNECTED", "CONNECTING", "CONNECTED", "ERROR", "billing_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public enum ConnectionState {
        DISCONNECTED(0),
        CONNECTING(1),
        CONNECTED(2),
        ERROR(3);
        
        private final int value;

        ConnectionState(int i10) {
            this.value = i10;
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/discord/billing/BillingManager$DowngradeCommand;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "EXECUTE", "CLEAR", "billing_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public enum DowngradeCommand {
        EXECUTE(0),
        CLEAR(1);
        
        private final int value;

        DowngradeCommand(int i10) {
            this.value = i10;
        }

        public final int getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/discord/billing/BillingManager$ProductDetailsResponse;", "", "billingResult", "Lcom/android/billingclient/api/BillingResult;", "productDetails", "", "Lcom/android/billingclient/api/ProductDetails;", "(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V", "getBillingResult", "()Lcom/android/billingclient/api/BillingResult;", "getProductDetails", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "billing_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class ProductDetailsResponse {
        private final BillingResult billingResult;
        private final List<ProductDetails> productDetails;

        public ProductDetailsResponse(BillingResult billingResult, List<ProductDetails> list) {
            q.g(billingResult, "billingResult");
            this.billingResult = billingResult;
            this.productDetails = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ProductDetailsResponse copy$default(ProductDetailsResponse productDetailsResponse, BillingResult billingResult, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                billingResult = productDetailsResponse.billingResult;
            }
            if ((i10 & 2) != 0) {
                list = productDetailsResponse.productDetails;
            }
            return productDetailsResponse.copy(billingResult, list);
        }

        public final BillingResult component1() {
            return this.billingResult;
        }

        public final List<ProductDetails> component2() {
            return this.productDetails;
        }

        public final ProductDetailsResponse copy(BillingResult billingResult, List<ProductDetails> list) {
            q.g(billingResult, "billingResult");
            return new ProductDetailsResponse(billingResult, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductDetailsResponse)) {
                return false;
            }
            ProductDetailsResponse productDetailsResponse = (ProductDetailsResponse) obj;
            return q.b(this.billingResult, productDetailsResponse.billingResult) && q.b(this.productDetails, productDetailsResponse.productDetails);
        }

        public final BillingResult getBillingResult() {
            return this.billingResult;
        }

        public final List<ProductDetails> getProductDetails() {
            return this.productDetails;
        }

        public int hashCode() {
            int hashCode = this.billingResult.hashCode() * 31;
            List<ProductDetails> list = this.productDetails;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            BillingResult billingResult = this.billingResult;
            List<ProductDetails> list = this.productDetails;
            return "ProductDetailsResponse(billingResult=" + billingResult + ", productDetails=" + list + ")";
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/discord/billing/BillingManager$SkuDetailsResponse;", "", "billingResult", "Lcom/android/billingclient/api/BillingResult;", "skuDetails", "", "Lcom/android/billingclient/api/SkuDetails;", "(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V", "getBillingResult", "()Lcom/android/billingclient/api/BillingResult;", "getSkuDetails", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "billing_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class SkuDetailsResponse {
        private final BillingResult billingResult;
        private final List<SkuDetails> skuDetails;

        /* JADX WARN: Multi-variable type inference failed */
        public SkuDetailsResponse(BillingResult billingResult, List<? extends SkuDetails> list) {
            q.g(billingResult, "billingResult");
            this.billingResult = billingResult;
            this.skuDetails = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SkuDetailsResponse copy$default(SkuDetailsResponse skuDetailsResponse, BillingResult billingResult, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                billingResult = skuDetailsResponse.billingResult;
            }
            if ((i10 & 2) != 0) {
                list = skuDetailsResponse.skuDetails;
            }
            return skuDetailsResponse.copy(billingResult, list);
        }

        public final BillingResult component1() {
            return this.billingResult;
        }

        public final List<SkuDetails> component2() {
            return this.skuDetails;
        }

        public final SkuDetailsResponse copy(BillingResult billingResult, List<? extends SkuDetails> list) {
            q.g(billingResult, "billingResult");
            return new SkuDetailsResponse(billingResult, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SkuDetailsResponse)) {
                return false;
            }
            SkuDetailsResponse skuDetailsResponse = (SkuDetailsResponse) obj;
            return q.b(this.billingResult, skuDetailsResponse.billingResult) && q.b(this.skuDetails, skuDetailsResponse.skuDetails);
        }

        public final BillingResult getBillingResult() {
            return this.billingResult;
        }

        public final List<SkuDetails> getSkuDetails() {
            return this.skuDetails;
        }

        public int hashCode() {
            int hashCode = this.billingResult.hashCode() * 31;
            List<SkuDetails> list = this.skuDetails;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            BillingResult billingResult = this.billingResult;
            List<SkuDetails> list = this.skuDetails;
            return "SkuDetailsResponse(billingResult=" + billingResult + ", skuDetails=" + list + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.discord.billing.BillingManager$billingClientStateListener$1] */
    public BillingManager(Function1<? super Integer, Unit> onConnectionUpdated, Function3<? super String, ? super String, ? super String, Unit> onPurchaseUpdated, Function1<? super Integer, Unit> onDowngradeCommand) {
        q.g(onConnectionUpdated, "onConnectionUpdated");
        q.g(onPurchaseUpdated, "onPurchaseUpdated");
        q.g(onDowngradeCommand, "onDowngradeCommand");
        this.onConnectionUpdated = onConnectionUpdated;
        this.onPurchaseUpdated = onPurchaseUpdated;
        this.onDowngradeCommand = onDowngradeCommand;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void consumePurchase$lambda$1(BillingManager this$0, Function1 onError, Function0 onSuccess, BillingResult billingResult, String str) {
        q.g(this$0, "this$0");
        q.g(onError, "$onError");
        q.g(onSuccess, "$onSuccess");
        q.g(billingResult, "billingResult");
        q.g(str, "<anonymous parameter 1>");
        if (this$0.isNotOk(billingResult)) {
            int a10 = billingResult.a();
            this$0.invoke(onError, "Consume purchase, bad response: " + a10);
            return;
        }
        onSuccess.invoke();
    }

    private static /* synthetic */ void getBackoff$annotations() {
    }

    private final void getProductsWithRetry(List<String> list, SkuType skuType, Promise promise, Function1<? super Exception, Unit> function1) {
        CoroutineScope coroutineScope;
        CoroutineScope coroutineScope2;
        if (!isBillingClientReady()) {
            invoke(function1, "Billing connection is not ready.");
            return;
        }
        CoroutineScope coroutineScope3 = this.coroutineScope;
        if (coroutineScope3 == null) {
            q.y("coroutineScope");
            coroutineScope = null;
        } else {
            coroutineScope = coroutineScope3;
        }
        ExponentialBackoff exponentialBackoff = new ExponentialBackoff(coroutineScope, 0L, 0L, 0, 14, null);
        CoroutineScope coroutineScope4 = this.coroutineScope;
        if (coroutineScope4 == null) {
            q.y("coroutineScope");
            coroutineScope2 = null;
        } else {
            coroutineScope2 = coroutineScope4;
        }
        l.d(coroutineScope2, y0.a(), null, new BillingManager$getProductsWithRetry$1(exponentialBackoff, this, function1, promise, skuType, list, null), 2, null);
    }

    private final void getSkusWithRetry(List<String> list, SkuType skuType, Promise promise, Function1<? super Exception, Unit> function1) {
        CoroutineScope coroutineScope;
        CoroutineScope coroutineScope2;
        if (!isBillingClientReady()) {
            invoke(function1, "Billing connection is not ready.");
            return;
        }
        CoroutineScope coroutineScope3 = this.coroutineScope;
        if (coroutineScope3 == null) {
            q.y("coroutineScope");
            coroutineScope = null;
        } else {
            coroutineScope = coroutineScope3;
        }
        ExponentialBackoff exponentialBackoff = new ExponentialBackoff(coroutineScope, 0L, 0L, 0, 14, null);
        CoroutineScope coroutineScope4 = this.coroutineScope;
        if (coroutineScope4 == null) {
            q.y("coroutineScope");
            coroutineScope2 = null;
        } else {
            coroutineScope2 = coroutineScope4;
        }
        l.d(coroutineScope2, y0.a(), null, new BillingManager$getSkusWithRetry$1(exponentialBackoff, this, function1, promise, skuType, list, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePurchases(BillingResult billingResult, List<? extends Purchase> list) {
        boolean z10;
        if (isNotOk(billingResult)) {
            this.onDowngradeCommand.invoke(Integer.valueOf(DowngradeCommand.CLEAR.getValue()));
            return;
        }
        if (list == null || list.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.onDowngradeCommand.invoke(Integer.valueOf(DowngradeCommand.EXECUTE.getValue()));
            return;
        }
        for (Purchase purchase : list) {
            verifyPurchase(purchase);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invoke(Function1<? super Exception, Unit> function1, String str) {
        q.g(function1, "<this>");
        function1.invoke(new IllegalStateException(str));
    }

    private final boolean isBillingClientReady() {
        BillingClient billingClient = this.billingClient;
        if (billingClient != null) {
            if (billingClient == null) {
                q.y("billingClient");
                billingClient = null;
            }
            if (billingClient.d()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isNotOk(BillingResult billingResult) {
        return billingResult.a() != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isRetryableError(BillingResult billingResult) {
        Set i10;
        if (!isNotOk(billingResult)) {
            return false;
        }
        i10 = w.i(6, -1, 2);
        if (i10.contains(Integer.valueOf(billingResult.a()))) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void loadPurchases$default(BillingManager billingManager, Function0 function0, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function0 = BillingManager$loadPurchases$1.INSTANCE;
        }
        if ((i10 & 2) != 0) {
            function1 = BillingManager$loadPurchases$2.INSTANCE;
        }
        billingManager.loadPurchases(function0, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void purchaseWithProductDetails(final Activity activity, final String str, ProductType productType, final String str2, final String str3, final String str4, final String str5, final Function0<Unit> function0, final Function1<? super Exception, Unit> function1) {
        List<String> n10;
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        BillingClient billingClient = this.billingClient;
        if (billingClient == null) {
            q.y("billingClient");
            billingClient = null;
        }
        QueryProductDetailsParams queryProductDetailsParams = QueryProductDetailsParams.INSTANCE;
        n10 = j.n(str, str3);
        billingClient.g(queryProductDetailsParams.create(productType, n10), new d() { // from class: com.discord.billing.a
            @Override // v2.d
            public final void onProductDetailsResponse(BillingResult billingResult, List list) {
                BillingManager.purchaseWithProductDetails$lambda$5(BillingManager.this, function1, str, str3, str4, str2, str5, activity, function0, ref$BooleanRef, billingResult, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void purchaseWithProductDetails$lambda$5(BillingManager this$0, Function1 onError, String productId, String str, String str2, String userId, String str3, Activity activity, Function0 onSuccess, Ref$BooleanRef completed, BillingResult billingResult, List productDetails) {
        q.g(this$0, "this$0");
        q.g(onError, "$onError");
        q.g(productId, "$productId");
        q.g(userId, "$userId");
        q.g(activity, "$activity");
        q.g(onSuccess, "$onSuccess");
        q.g(completed, "$completed");
        q.g(billingResult, "billingResult");
        q.g(productDetails, "productDetails");
        synchronized (this$0) {
            if (!completed.f22101k) {
                completed.f22101k = true;
                Unit unit = Unit.f22076a;
                if (this$0.isNotOk(billingResult)) {
                    int a10 = billingResult.a();
                    this$0.invoke(onError, "Purchase failed, bad code: " + a10);
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
                        q.y("billingClient");
                        billingClient = null;
                    }
                    billingClient.e(activity, createWithProductDetails);
                    onSuccess.invoke();
                } catch (AssertionError e10) {
                    String message = e10.getMessage();
                    q.d(message);
                    this$0.invoke(onError, message);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void purchaseWithSkuDetails(final Activity activity, final String str, SkuType skuType, final String str2, final String str3, final String str4, final Function0<Unit> function0, final Function1<? super Exception, Unit> function1) {
        List<String> n10;
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        BillingClient billingClient = this.billingClient;
        if (billingClient == null) {
            q.y("billingClient");
            billingClient = null;
        }
        SkuDetailsParams skuDetailsParams = SkuDetailsParams.INSTANCE;
        n10 = j.n(str, str3);
        billingClient.i(skuDetailsParams.create(skuType, n10), new g() { // from class: com.discord.billing.c
            @Override // v2.g
            public final void onSkuDetailsResponse(BillingResult billingResult, List list) {
                BillingManager.purchaseWithSkuDetails$lambda$3(BillingManager.this, function1, str, str3, str4, str2, activity, function0, ref$BooleanRef, billingResult, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void purchaseWithSkuDetails$lambda$3(BillingManager this$0, Function1 onError, String skuId, String str, String str2, String userId, Activity activity, Function0 onSuccess, Ref$BooleanRef completed, BillingResult billingResult, List list) {
        q.g(this$0, "this$0");
        q.g(onError, "$onError");
        q.g(skuId, "$skuId");
        q.g(userId, "$userId");
        q.g(activity, "$activity");
        q.g(onSuccess, "$onSuccess");
        q.g(completed, "$completed");
        q.g(billingResult, "billingResult");
        synchronized (this$0) {
            if (!completed.f22101k) {
                completed.f22101k = true;
                Unit unit = Unit.f22076a;
                if (this$0.isNotOk(billingResult)) {
                    int a10 = billingResult.a();
                    this$0.invoke(onError, "Purchase failed, bad code: " + a10);
                    return;
                }
                BillingFlowParams create = com.discord.billing.types.BillingFlowParams.INSTANCE.create(list, skuId, str, str2, userId);
                if (create == null) {
                    this$0.invoke(onError, "Purchase failed, Sku details not found.");
                    return;
                }
                BillingClient billingClient = this$0.billingClient;
                if (billingClient == null) {
                    q.y("billingClient");
                    billingClient = null;
                }
                billingClient.e(activity, create);
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
        if (purchase.c() == 1 && !purchase.g()) {
            ArrayList<String> f10 = purchase.f();
            q.f(f10, "purchase.skus");
            for (String sku : f10) {
                Function3<String, String, String, Unit> function3 = this.onPurchaseUpdated;
                String d10 = purchase.d();
                q.f(d10, "purchase.purchaseToken");
                String b10 = purchase.b();
                q.f(b10, "purchase.packageName");
                q.f(sku, "sku");
                function3.invoke(d10, b10, sku);
            }
        }
    }

    public final void close() {
        BillingClient billingClient = this.billingClient;
        if (billingClient != null) {
            if (billingClient == null) {
                q.y("billingClient");
                billingClient = null;
            }
            billingClient.b();
            this.backoff.cancel();
            return;
        }
        this.onConnectionUpdated.invoke(Integer.valueOf(ConnectionState.ERROR.getValue()));
    }

    public final void consumePurchase(String purchaseToken, final Function0<Unit> onSuccess, final Function1<? super Exception, Unit> onError) {
        q.g(purchaseToken, "purchaseToken");
        q.g(onSuccess, "onSuccess");
        q.g(onError, "onError");
        if (!isBillingClientReady()) {
            invoke(onError, "Consume purchase, billing connection is not ready.");
            return;
        }
        b a10 = b.b().b(purchaseToken).a();
        q.f(a10, "newBuilder()\n           …\n                .build()");
        BillingClient billingClient = this.billingClient;
        if (billingClient == null) {
            q.y("billingClient");
            billingClient = null;
        }
        billingClient.a(a10, new c() { // from class: com.discord.billing.b
            @Override // v2.c
            public final void a(BillingResult billingResult, String str) {
                BillingManager.consumePurchase$lambda$1(BillingManager.this, onError, onSuccess, billingResult, str);
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

    public final void getSkus(List<String> skuIds, SkuType skuType, Promise reactPromise, Function1<? super Exception, Unit> onError) {
        q.g(skuIds, "skuIds");
        q.g(skuType, "skuType");
        q.g(reactPromise, "reactPromise");
        q.g(onError, "onError");
        if (!isBillingClientReady()) {
            invoke(onError, "Billing connection is not ready.");
            return;
        }
        BillingClient billingClient = this.billingClient;
        if (billingClient == null) {
            q.y("billingClient");
            billingClient = null;
        }
        BillingResult c10 = billingClient.c("fff");
        q.f(c10, "billingClient.isFeatureS…tureType.PRODUCT_DETAILS)");
        if (isNotOk(c10)) {
            getSkusWithRetry(skuIds, skuType, reactPromise, onError);
        } else {
            getProductsWithRetry(skuIds, skuType, reactPromise, onError);
        }
    }

    public final void loadPurchases(Function0<Unit> onSuccess, Function1<? super Exception, Unit> onError) {
        q.g(onSuccess, "onSuccess");
        q.g(onError, "onError");
        if (!isBillingClientReady()) {
            invoke(onError, "Failed to load purchases, billing connection is not ready.");
            return;
        }
        BillingClient billingClient = this.billingClient;
        BillingClient billingClient2 = null;
        if (billingClient == null) {
            q.y("billingClient");
            billingClient = null;
        }
        billingClient.h("inapp", new e() { // from class: com.discord.billing.d
            @Override // v2.e
            public final void a(BillingResult billingResult, List list) {
                BillingManager.this.handlePurchases(billingResult, list);
            }
        });
        BillingClient billingClient3 = this.billingClient;
        if (billingClient3 == null) {
            q.y("billingClient");
        } else {
            billingClient2 = billingClient3;
        }
        billingClient2.h("subs", new e() { // from class: com.discord.billing.d
            @Override // v2.e
            public final void a(BillingResult billingResult, List list) {
                BillingManager.this.handlePurchases(billingResult, list);
            }
        });
        onSuccess.invoke();
    }

    public final void open(ReactApplicationContext context) {
        LifecycleOwner lifecycleOwner;
        androidx.lifecycle.g a10;
        q.g(context, "context");
        BillingClient a11 = BillingClient.f(context).b().c(new f() { // from class: com.discord.billing.e
            @Override // v2.f
            public final void a(BillingResult billingResult, List list) {
                BillingManager.this.handlePurchases(billingResult, list);
            }
        }).a();
        q.f(a11, "newBuilder(context)\n    …\n                .build()");
        this.billingClient = a11;
        Activity currentActivity = context.getCurrentActivity();
        BillingClient billingClient = null;
        if (currentActivity instanceof LifecycleOwner) {
            lifecycleOwner = (LifecycleOwner) currentActivity;
        } else {
            lifecycleOwner = null;
        }
        if (!(lifecycleOwner == null || (a10 = m.a(lifecycleOwner)) == null)) {
            this.coroutineScope = a10;
        }
        BillingClient billingClient2 = this.billingClient;
        if (billingClient2 == null) {
            q.y("billingClient");
            billingClient2 = null;
        }
        if (!billingClient2.d()) {
            try {
                BillingClient billingClient3 = this.billingClient;
                if (billingClient3 == null) {
                    q.y("billingClient");
                } else {
                    billingClient = billingClient3;
                }
                billingClient.j(this.billingClientStateListener);
                this.onConnectionUpdated.invoke(Integer.valueOf(ConnectionState.CONNECTING.getValue()));
            } catch (Exception unused) {
                this.onConnectionUpdated.invoke(Integer.valueOf(ConnectionState.ERROR.getValue()));
            }
        }
    }

    public final void purchase(Activity activity, String skuId, SkuType skuType, String userId, String str, String str2, String str3, Function0<Unit> onSuccess, Function1<? super Exception, Unit> onError) {
        q.g(skuId, "skuId");
        q.g(skuType, "skuType");
        q.g(userId, "userId");
        q.g(onSuccess, "onSuccess");
        q.g(onError, "onError");
        if (!isBillingClientReady()) {
            invoke(onError, "Purchase failed, billing connection is not ready.");
        } else if (activity == null) {
            invoke(onError, "Purchase failed, missing current activity.");
        } else {
            BillingClient billingClient = this.billingClient;
            if (billingClient == null) {
                q.y("billingClient");
                billingClient = null;
            }
            BillingResult c10 = billingClient.c("fff");
            q.f(c10, "billingClient.isFeatureS…tureType.PRODUCT_DETAILS)");
            if (!isNotOk(c10)) {
                purchaseWithProductDetails(activity, skuId, ProductType.valueOf(skuType.name()), userId, str, str2, str3, onSuccess, onError);
            } else if (str3 != null) {
                invoke(onError, "Purchase failed, offerId passed for device not supported");
            } else {
                purchaseWithSkuDetails(activity, skuId, skuType, userId, str, str2, onSuccess, onError);
            }
        }
    }
}
