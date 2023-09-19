package com.discord.billing;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.discord.billing.BillingManager;
import com.discord.billing.react.events.serialization.SerializeSkuDetailsKt;
import com.discord.billing.types.SkuDetailsParams;
import com.discord.billing.types.SkuType;
import com.discord.crash_reporting.CrashReporting;
import com.discord.misc.utilities.backoff.ExponentialBackoff;
import com.discord.misc.utilities.backoff.MaxAttemptsExceededException;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableNativeArray;
import com.facebook.react.views.image.ReactImageView;
import java.util.List;
import java.util.concurrent.CancellationException;
import kf.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.y;
import qf.d;


@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.billing.BillingManager$getSkusWithRetry$1", f = "BillingManager.kt", l = {ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS}, m = "invokeSuspend")

public final class BillingManager$getSkusWithRetry$1 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final  ExponentialBackoff $getSkusBackoff;
    final  Function1<Exception, Unit> $onError;
    final  Promise $reactPromise;
    final  List<String> $skuIds;
    final  SkuType $skuType;
    int label;
    final  BillingManager this$0;

    
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/discord/billing/BillingManager$SkuDetailsResponse;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.discord.billing.BillingManager$getSkusWithRetry$1$1", f = "BillingManager.kt", l = {312}, m = "invokeSuspend")
    
    
    public static final class AnonymousClass1 extends k implements Function1<Continuation<? super BillingManager.SkuDetailsResponse>, Object> {
        final  List<String> $skuIds;
        final  SkuType $skuType;
        int label;
        final  BillingManager this$0;

        
        AnonymousClass1(BillingManager billingManager, SkuType skuType, List<String> list, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.this$0 = billingManager;
            this.$skuType = skuType;
            this.$skuIds = list;
        }

        @Override 
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$skuType, this.$skuIds, continuation);
        }

        public final Object invoke(Continuation<? super BillingManager.SkuDetailsResponse> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.f21444a);
        }

        @Override 
        public final Object invokeSuspend(Object obj) {
            Object d10;
            SkuDetailsResponseListener skusWithRetry$createSkuDetailsResponseListener;
            BillingClient billingClient;
            d10 = d.d();
            int i10 = this.label;
            if (i10 == 0) {
                t.b(obj);
                BillingClient billingClient2 = null;
                CompletableDeferred b10 = y.b(null, 1, null);
                skusWithRetry$createSkuDetailsResponseListener = BillingManager.getSkusWithRetry$createSkuDetailsResponseListener(new BillingManager$getSkusWithRetry$1$1$listener$1(b10));
                billingClient = this.this$0.billingClient;
                if (billingClient == null) {
                    q.z("billingClient");
                } else {
                    billingClient2 = billingClient;
                }
                billingClient2.l(SkuDetailsParams.INSTANCE.create(this.$skuType, this.$skuIds), skusWithRetry$createSkuDetailsResponseListener);
                this.label = 1;
                obj = b10.G(this);
                if (obj == d10) {
                    return d10;
                }
            } else if (i10 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/discord/billing/BillingManager$SkuDetailsResponse;", "skuDetailsResponse", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.discord.billing.BillingManager$getSkusWithRetry$1$2", f = "BillingManager.kt", l = {}, m = "invokeSuspend")
    
    
    public static final class AnonymousClass2 extends k implements Function2<BillingManager.SkuDetailsResponse, Continuation<? super Boolean>, Object> {
         Object L$0;
        int label;
        final  BillingManager this$0;

        
        AnonymousClass2(BillingManager billingManager, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = billingManager;
        }

        @Override 
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 r02 = new AnonymousClass2(this.this$0, continuation);
            r02.L$0 = obj;
            return r02;
        }

        public final Object invoke(BillingManager.SkuDetailsResponse skuDetailsResponse, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass2) create(skuDetailsResponse, continuation)).invokeSuspend(Unit.f21444a);
        }

        @Override 
        public final Object invokeSuspend(Object obj) {
            boolean isRetryableError;
            d.d();
            if (this.label == 0) {
                t.b(obj);
                isRetryableError = this.this$0.isRetryableError(((BillingManager.SkuDetailsResponse) this.L$0).getBillingResult());
                return b.a(isRetryableError);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    
    
    
    public BillingManager$getSkusWithRetry$1(ExponentialBackoff exponentialBackoff, BillingManager billingManager, Function1<? super Exception, Unit> function1, Promise promise, SkuType skuType, List<String> list, Continuation<? super BillingManager$getSkusWithRetry$1> continuation) {
        super(2, continuation);
        this.$getSkusBackoff = exponentialBackoff;
        this.this$0 = billingManager;
        this.$onError = function1;
        this.$reactPromise = promise;
        this.$skuType = skuType;
        this.$skuIds = list;
    }

    @Override 
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BillingManager$getSkusWithRetry$1(this.$getSkusBackoff, this.this$0, this.$onError, this.$reactPromise, this.$skuType, this.$skuIds, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BillingManager$getSkusWithRetry$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f21444a);
    }

    @Override 
    public final Object invokeSuspend(Object obj) {
        Object d10;
        boolean z10;
        boolean isNotOk;
        boolean z11;
        d10 = d.d();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                t.b(obj);
                ExponentialBackoff exponentialBackoff = this.$getSkusBackoff;
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
            BillingManager.SkuDetailsResponse skuDetailsResponse = (BillingManager.SkuDetailsResponse) obj;
            BillingResult component1 = skuDetailsResponse.component1();
            List<SkuDetails> component2 = skuDetailsResponse.component2();
            if (component2 == null) {
                this.this$0.invoke(this.$onError, "Sku fetch, details not found");
            } else {
                isNotOk = this.this$0.isNotOk(component1);
                if (isNotOk) {
                    BillingManager billingManager = this.this$0;
                    Function1<Exception, Unit> function1 = this.$onError;
                    int b10 = component1.b();
                    billingManager.invoke(function1, "Sku fetch, bad response code: " + b10);
                } else {
                    ReadableNativeArray serializeSkuDetails = SerializeSkuDetailsKt.serializeSkuDetails(component2);
                    z11 = this.this$0.isProdBuild;
                    if (!z11) {
                        CrashReporting crashReporting = CrashReporting.INSTANCE;
                        String jsonString = NativeArrayExtensionsKt.toJsonString(serializeSkuDetails);
                        CrashReporting.addBreadcrumb$default(crashReporting, "resolving getSkusBackoff with " + jsonString, null, null, 6, null);
                    }
                    this.$reactPromise.resolve(serializeSkuDetails);
                }
            }
        } catch (Exception e10) {
            if (e10 instanceof MaxAttemptsExceededException) {
                z10 = this.this$0.isProdBuild;
                if (!z10) {
                    CrashReporting.INSTANCE.captureException(e10);
                }
            } else if (!(e10 instanceof CancellationException)) {
                CrashReporting.INSTANCE.captureException(e10);
            } else {
                throw e10;
            }
        }
        return Unit.f21444a;
    }
}
