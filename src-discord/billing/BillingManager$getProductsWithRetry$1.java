package com.discord.billing;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.discord.billing.BillingManager;
import com.discord.billing.react.events.serialization.SerializeProductDetailsKt;
import com.discord.billing.types.ProductType;
import com.discord.billing.types.QueryProductDetailsParams;
import com.discord.billing.types.SkuType;
import com.discord.crash_reporting.CrashReporting;
import com.discord.misc.utilities.backoff.ExponentialBackoff;
import com.discord.misc.utilities.backoff.MaxAttemptsExceededException;
import com.discord.misc.utilities.gradle.GradleUtils;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableNativeArray;
import gf.s;
import gf.t;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;
import kotlinx.coroutines.CoroutineScope;
import lf.g;
import mf.c;
import mf.d;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.billing.BillingManager$getProductsWithRetry$1", f = "BillingManager.kt", l = {355}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class BillingManager$getProductsWithRetry$1 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ExponentialBackoff $getProductsBackoff;
    final /* synthetic */ Function1<Exception, Unit> $onError;
    final /* synthetic */ Promise $reactPromise;
    final /* synthetic */ List<String> $skuIds;
    final /* synthetic */ SkuType $skuType;
    int label;
    final /* synthetic */ BillingManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/discord/billing/BillingManager$ProductDetailsResponse;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.discord.billing.BillingManager$getProductsWithRetry$1$1", f = "BillingManager.kt", l = {357}, m = "invokeSuspend")
    /* renamed from: com.discord.billing.BillingManager$getProductsWithRetry$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends k implements Function1<Continuation<? super BillingManager.ProductDetailsResponse>, Object> {
        final /* synthetic */ List<String> $skuIds;
        final /* synthetic */ SkuType $skuType;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ BillingManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BillingManager billingManager, SkuType skuType, List<String> list, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.this$0 = billingManager;
            this.$skuType = skuType;
            this.$skuIds = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$skuType, this.$skuIds, continuation);
        }

        public final Object invoke(Continuation<? super BillingManager.ProductDetailsResponse> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.f20717a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            Continuation c10;
            BillingClient billingClient;
            Object d11;
            d10 = d.d();
            int i10 = this.label;
            if (i10 == 0) {
                t.b(obj);
                BillingManager billingManager = this.this$0;
                SkuType skuType = this.$skuType;
                List<String> list = this.$skuIds;
                this.L$0 = billingManager;
                this.L$1 = skuType;
                this.L$2 = list;
                this.label = 1;
                c10 = c.c(this);
                final g gVar = new g(c10);
                billingClient = billingManager.billingClient;
                if (billingClient == null) {
                    q.y("billingClient");
                    billingClient = null;
                }
                billingClient.g(QueryProductDetailsParams.INSTANCE.create(ProductType.valueOf(skuType.name()), list), new t1.d() { // from class: com.discord.billing.BillingManager$getProductsWithRetry$1$1$1$1
                    @Override // t1.d
                    public final void onProductDetailsResponse(BillingResult billingResult, List<ProductDetails> productDetails) {
                        q.g(billingResult, "billingResult");
                        q.g(productDetails, "productDetails");
                        if (!GradleUtils.INSTANCE.isProductionBuild()) {
                            CrashReporting crashReporting = CrashReporting.INSTANCE;
                            int a10 = billingResult.a();
                            CrashReporting.addBreadcrumb$default(crashReporting, "Resuming getProductsBackoff with " + a10, null, null, 6, null);
                        }
                        Continuation<BillingManager.ProductDetailsResponse> continuation = gVar;
                        s.a aVar = s.f15527l;
                        continuation.resumeWith(s.b(new BillingManager.ProductDetailsResponse(billingResult, productDetails)));
                    }
                });
                obj = gVar.b();
                d11 = d.d();
                if (obj == d11) {
                    kotlin.coroutines.jvm.internal.g.c(this);
                }
                if (obj == d10) {
                    return d10;
                }
            } else if (i10 == 1) {
                List list2 = (List) this.L$2;
                SkuType skuType2 = (SkuType) this.L$1;
                BillingManager billingManager2 = (BillingManager) this.L$0;
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/discord/billing/BillingManager$ProductDetailsResponse;", "productDetailsResponse", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.discord.billing.BillingManager$getProductsWithRetry$1$2", f = "BillingManager.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.discord.billing.BillingManager$getProductsWithRetry$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends k implements Function2<BillingManager.ProductDetailsResponse, Continuation<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BillingManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(BillingManager billingManager, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = billingManager;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 r02 = new AnonymousClass2(this.this$0, continuation);
            r02.L$0 = obj;
            return r02;
        }

        public final Object invoke(BillingManager.ProductDetailsResponse productDetailsResponse, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass2) create(productDetailsResponse, continuation)).invokeSuspend(Unit.f20717a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean isRetryableError;
            d.d();
            if (this.label == 0) {
                t.b(obj);
                isRetryableError = this.this$0.isRetryableError(((BillingManager.ProductDetailsResponse) this.L$0).getBillingResult());
                return b.a(isRetryableError);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BillingManager$getProductsWithRetry$1(ExponentialBackoff exponentialBackoff, BillingManager billingManager, Function1<? super Exception, Unit> function1, Promise promise, SkuType skuType, List<String> list, Continuation<? super BillingManager$getProductsWithRetry$1> continuation) {
        super(2, continuation);
        this.$getProductsBackoff = exponentialBackoff;
        this.this$0 = billingManager;
        this.$onError = function1;
        this.$reactPromise = promise;
        this.$skuType = skuType;
        this.$skuIds = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BillingManager$getProductsWithRetry$1(this.$getProductsBackoff, this.this$0, this.$onError, this.$reactPromise, this.$skuType, this.$skuIds, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BillingManager$getProductsWithRetry$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f20717a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        boolean isNotOk;
        d10 = d.d();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                t.b(obj);
                ExponentialBackoff exponentialBackoff = this.$getProductsBackoff;
                AnonymousClass1 r12 = new AnonymousClass1(this.this$0, this.$skuType, this.$skuIds, null);
                AnonymousClass2 r32 = new AnonymousClass2(this.this$0, null);
                this.label = 1;
                obj = exponentialBackoff.performBackoff(r12, r32, this);
                if (obj == d10) {
                    return d10;
                }
            } else if (i10 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            BillingManager.ProductDetailsResponse productDetailsResponse = (BillingManager.ProductDetailsResponse) obj;
            BillingResult component1 = productDetailsResponse.component1();
            List<ProductDetails> component2 = productDetailsResponse.component2();
            if (component2 == null) {
                this.this$0.invoke(this.$onError, "Product fetch, details not found");
            } else {
                isNotOk = this.this$0.isNotOk(component1);
                if (isNotOk) {
                    BillingManager billingManager = this.this$0;
                    Function1<Exception, Unit> function1 = this.$onError;
                    int a10 = component1.a();
                    billingManager.invoke(function1, "Product fetch, bad response code: " + a10);
                } else {
                    try {
                        ReadableNativeArray serializeProductDetails = SerializeProductDetailsKt.serializeProductDetails(component2);
                        if (!GradleUtils.INSTANCE.isProductionBuild()) {
                            CrashReporting crashReporting = CrashReporting.INSTANCE;
                            String jsonString = NativeArrayExtensionsKt.toJsonString(serializeProductDetails);
                            CrashReporting.addBreadcrumb$default(crashReporting, "resolving getProductsBackoff with " + jsonString, null, null, 6, null);
                        }
                        this.$reactPromise.resolve(serializeProductDetails);
                    } catch (AssertionError e10) {
                        this.$reactPromise.reject(e10);
                    }
                }
            }
        } catch (Exception e11) {
            if (e11 instanceof MaxAttemptsExceededException) {
                if (!GradleUtils.INSTANCE.isProductionBuild()) {
                    CrashReporting.INSTANCE.captureException(e11);
                }
            } else if (!(e11 instanceof CancellationException)) {
                CrashReporting.INSTANCE.captureMessage("Found exception when exponentially retrying queryProductDetails call", e11);
            } else {
                throw e11;
            }
        }
        return Unit.f20717a;
    }
}
