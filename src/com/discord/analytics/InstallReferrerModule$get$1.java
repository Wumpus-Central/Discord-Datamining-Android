package com.discord.analytics;

import android.content.SharedPreferences;
import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.react.bridge.Promise;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9636e;
import kotlin.coroutines.jvm.internal.AbstractC9643k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C9932u2;
import kotlinx.coroutines.CoroutineScope;
import nf.C10848t;
import tf.C12962d;

@Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
@AbstractC9636e(m14702c = "com.discord.analytics.InstallReferrerModule$get$1", m14701f = "InstallReferrerModule.kt", m14700l = {35}, m14699m = "invokeSuspend")
/* loaded from: classes.dex */
final class InstallReferrerModule$get$1 extends AbstractC9643k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $attempts;
    final /* synthetic */ Ref$ObjectRef<InstallReferrerClient> $client;
    final /* synthetic */ SharedPreferences $prefs;
    final /* synthetic */ Promise $promise;
    final /* synthetic */ Ref$ObjectRef<String> $referrer;
    int label;
    final /* synthetic */ InstallReferrerModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
    @AbstractC9636e(m14702c = "com.discord.analytics.InstallReferrerModule$get$1$1", m14701f = "InstallReferrerModule.kt", m14700l = {39}, m14699m = "invokeSuspend")
    /* renamed from: com.discord.analytics.InstallReferrerModule$get$1$1 */
    /* loaded from: classes.dex */
    public static final class C30921 extends AbstractC9643k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $attempts;
        final /* synthetic */ Ref$ObjectRef<InstallReferrerClient> $client;
        final /* synthetic */ SharedPreferences $prefs;
        final /* synthetic */ Promise $promise;
        final /* synthetic */ Ref$ObjectRef<String> $referrer;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        final /* synthetic */ InstallReferrerModule this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C30921(Ref$ObjectRef<InstallReferrerClient> ref$ObjectRef, InstallReferrerModule installReferrerModule, Ref$ObjectRef<String> ref$ObjectRef2, SharedPreferences sharedPreferences, Promise promise, int i, Continuation<? super C30921> continuation) {
            super(2, continuation);
            this.$client = ref$ObjectRef;
            this.this$0 = installReferrerModule;
            this.$referrer = ref$ObjectRef2;
            this.$prefs = sharedPreferences;
            this.$promise = promise;
            this.$attempts = i;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C30921 r8 = new C30921(this.$client, this.this$0, this.$referrer, this.$prefs, this.$promise, this.$attempts, continuation);
            r8.L$0 = obj;
            return r8;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C30921) create(coroutineScope, continuation)).invokeSuspend(Unit.f25780a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:25:0x007c A[Catch: all -> 0x00be, TryCatch #1 {all -> 0x00be, blocks: (B:6:0x0024, B:10:0x0041, B:12:0x0053, B:16:0x0068, B:20:0x0071, B:25:0x007c, B:27:0x0082, B:29:0x0088, B:31:0x008e, B:32:0x00b2, B:33:0x00bd), top: B:52:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00b2 A[Catch: all -> 0x00be, TryCatch #1 {all -> 0x00be, blocks: (B:6:0x0024, B:10:0x0041, B:12:0x0053, B:16:0x0068, B:20:0x0071, B:25:0x007c, B:27:0x0082, B:29:0x0088, B:31:0x008e, B:32:0x00b2, B:33:0x00bd), top: B:52:0x000c }] */
        /* JADX WARN: Type inference failed for: r1v8, types: [com.android.installreferrer.api.InstallReferrerClient, T] */
        /* JADX WARN: Unknown variable types count: 1 */
        @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 271
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.discord.analytics.InstallReferrerModule$get$1.C30921.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallReferrerModule$get$1(Ref$ObjectRef<InstallReferrerClient> ref$ObjectRef, InstallReferrerModule installReferrerModule, Ref$ObjectRef<String> ref$ObjectRef2, SharedPreferences sharedPreferences, Promise promise, int i, Continuation<? super InstallReferrerModule$get$1> continuation) {
        super(2, continuation);
        this.$client = ref$ObjectRef;
        this.this$0 = installReferrerModule;
        this.$referrer = ref$ObjectRef2;
        this.$prefs = sharedPreferences;
        this.$promise = promise;
        this.$attempts = i;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InstallReferrerModule$get$1(this.$client, this.this$0, this.$referrer, this.$prefs, this.$promise, this.$attempts, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InstallReferrerModule$get$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f25780a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Object invokeSuspend(Object obj) {
        Object d;
        d = C12962d.m4646d();
        int i = this.label;
        if (i == 0) {
            C10848t.m10930b(obj);
            C30921 r12 = new C30921(this.$client, this.this$0, this.$referrer, this.$prefs, this.$promise, this.$attempts, null);
            this.label = 1;
            if (C9932u2.m13985c(1000L, r12, this) == d) {
                return d;
            }
        } else if (i == 1) {
            C10848t.m10930b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f25780a;
    }
}
