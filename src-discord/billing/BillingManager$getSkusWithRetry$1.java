package com.discord.billing;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.SkuDetails;
import com.discord.billing.BillingManager;
import com.discord.billing.react.events.serialization.SerializeSkuDetailsKt;
import com.discord.billing.types.SkuDetailsParams;
import com.discord.billing.types.SkuType;
import com.discord.crash_reporting.CrashReporting;
import com.discord.misc.utilities.backoff.ExponentialBackoff;
import com.discord.misc.utilities.backoff.MaxAttemptsExceededException;
import com.facebook.react.bridge.Promise;
import java.util.List;
import jg.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.p;
import pg.c;
import pg.d;
import v2.g;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.billing.BillingManager$getSkusWithRetry$1", f = "BillingManager.kt", l = {285}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class BillingManager$getSkusWithRetry$1 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ExponentialBackoff $getSkusBackoff;
    final /* synthetic */ Function1<Exception, Unit> $onError;
    final /* synthetic */ Promise $reactPromise;
    final /* synthetic */ List<String> $skuIds;
    final /* synthetic */ SkuType $skuType;
    int label;
    final /* synthetic */ BillingManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/discord/billing/BillingManager$SkuDetailsResponse;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.discord.billing.BillingManager$getSkusWithRetry$1$1", f = "BillingManager.kt", l = {489}, m = "invokeSuspend")
    /* renamed from: com.discord.billing.BillingManager$getSkusWithRetry$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends k implements Function1<Continuation<? super BillingManager.SkuDetailsResponse>, Object> {
        final /* synthetic */ Function1<Exception, Unit> $onError;
        final /* synthetic */ List<String> $skuIds;
        final /* synthetic */ SkuType $skuType;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ BillingManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(BillingManager billingManager, SkuType skuType, List<String> list, Function1<? super Exception, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.this$0 = billingManager;
            this.$skuType = skuType;
            this.$skuIds = list;
            this.$onError = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$skuType, this.$skuIds, this.$onError, continuation);
        }

        public final Object invoke(Continuation<? super BillingManager.SkuDetailsResponse> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.f22076a);
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
                final BillingManager billingManager = this.this$0;
                SkuType skuType = this.$skuType;
                List<String> list = this.$skuIds;
                final Function1<Exception, Unit> function1 = this.$onError;
                this.L$0 = billingManager;
                this.L$1 = skuType;
                this.L$2 = list;
                this.L$3 = function1;
                this.label = 1;
                c10 = c.c(this);
                final p pVar = new p(c10, 1);
                pVar.B();
                billingClient = billingManager.billingClient;
                if (billingClient == null) {
                    q.y("billingClient");
                    billingClient = null;
                }
                billingClient.i(SkuDetailsParams.INSTANCE.create(skuType, list), new g() { // from class: com.discord.billing.BillingManager$getSkusWithRetry$1$1$1$1

                    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
                    /* renamed from: com.discord.billing.BillingManager$getSkusWithRetry$1$1$1$1$1  reason: invalid class name */
                    /* loaded from: classes.dex */
                    static final class AnonymousClass1 extends s implements Function1<Throwable, Unit> {
                        final /* synthetic */ BillingResult $billingResult;
                        final /* synthetic */ Function1<Exception, Unit> $onError;
                        final /* synthetic */ BillingManager this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass1(BillingManager billingManager, Function1<? super Exception, Unit> function1, BillingResult billingResult) {
                            super(1);
                            this.this$0 = billingManager;
                            this.$onError = function1;
                            this.$billingResult = billingResult;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                            invoke2(th2);
                            return Unit.f22076a;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2(Throwable it) {
                            q.g(it, "it");
                            BillingManager billingManager = this.this$0;
                            Function1<Exception, Unit> function1 = this.$onError;
                            int a10 = this.$billingResult.a();
                            billingManager.invoke(function1, "Sku fetch, bad response code: " + a10);
                        }
                    }

                    @Override // v2.g
                    public final void onSkuDetailsResponse(BillingResult billingResult, List<SkuDetails> list2) {
                        q.g(billingResult, "billingResult");
                        pVar.o(new BillingManager.SkuDetailsResponse(billingResult, list2), new AnonymousClass1(billingManager, function1, billingResult));
                    }
                });
                obj = pVar.y();
                d11 = d.d();
                if (obj == d11) {
                    kotlin.coroutines.jvm.internal.g.c(this);
                }
                if (obj == d10) {
                    return d10;
                }
            } else if (i10 == 1) {
                Function1 function12 = (Function1) this.L$3;
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
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/discord/billing/BillingManager$SkuDetailsResponse;", "skuDetailsResponse", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.discord.billing.BillingManager$getSkusWithRetry$1$2", f = "BillingManager.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.discord.billing.BillingManager$getSkusWithRetry$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends k implements Function2<BillingManager.SkuDetailsResponse, Continuation<? super Boolean>, Object> {
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

        public final Object invoke(BillingManager.SkuDetailsResponse skuDetailsResponse, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass2) create(skuDetailsResponse, continuation)).invokeSuspend(Unit.f22076a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BillingManager$getSkusWithRetry$1(ExponentialBackoff exponentialBackoff, BillingManager billingManager, Function1<? super Exception, Unit> function1, Promise promise, SkuType skuType, List<String> list, Continuation<? super BillingManager$getSkusWithRetry$1> continuation) {
        super(2, continuation);
        this.$getSkusBackoff = exponentialBackoff;
        this.this$0 = billingManager;
        this.$onError = function1;
        this.$reactPromise = promise;
        this.$skuType = skuType;
        this.$skuIds = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BillingManager$getSkusWithRetry$1(this.$getSkusBackoff, this.this$0, this.$onError, this.$reactPromise, this.$skuType, this.$skuIds, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BillingManager$getSkusWithRetry$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f22076a);
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
                ExponentialBackoff exponentialBackoff = this.$getSkusBackoff;
                AnonymousClass1 r12 = new AnonymousClass1(this.this$0, this.$skuType, this.$skuIds, this.$onError, null);
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
                    int a10 = component1.a();
                    billingManager.invoke(function1, "Sku fetch, bad response code: " + a10);
                } else {
                    this.$reactPromise.resolve(SerializeSkuDetailsKt.serializeSkuDetails(component2));
                }
            }
        } catch (Exception e10) {
            if (e10 instanceof MaxAttemptsExceededException) {
                CrashReporting.INSTANCE.captureException(e10);
            } else {
                CrashReporting.INSTANCE.captureMessage("Found exception when exponentially retrying querySkuDetails call", e10);
            }
        }
        return Unit.f22076a;
    }
}
