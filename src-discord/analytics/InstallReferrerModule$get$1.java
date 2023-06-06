package com.discord.analytics;

import android.content.SharedPreferences;
import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.react.bridge.Promise;
import kg.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.u2;
import qg.d;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.analytics.InstallReferrerModule$get$1", f = "InstallReferrerModule.kt", l = {35}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class InstallReferrerModule$get$1 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $attempts;
    final /* synthetic */ Ref$ObjectRef<InstallReferrerClient> $client;
    final /* synthetic */ SharedPreferences $prefs;
    final /* synthetic */ Promise $promise;
    final /* synthetic */ Ref$ObjectRef<String> $referrer;
    int label;
    final /* synthetic */ InstallReferrerModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.discord.analytics.InstallReferrerModule$get$1$1", f = "InstallReferrerModule.kt", l = {39}, m = "invokeSuspend")
    /* renamed from: com.discord.analytics.InstallReferrerModule$get$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
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
        AnonymousClass1(Ref$ObjectRef<InstallReferrerClient> ref$ObjectRef, InstallReferrerModule installReferrerModule, Ref$ObjectRef<String> ref$ObjectRef2, SharedPreferences sharedPreferences, Promise promise, int i10, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$client = ref$ObjectRef;
            this.this$0 = installReferrerModule;
            this.$referrer = ref$ObjectRef2;
            this.$prefs = sharedPreferences;
            this.$promise = promise;
            this.$attempts = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 r82 = new AnonymousClass1(this.$client, this.this$0, this.$referrer, this.$prefs, this.$promise, this.$attempts, continuation);
            r82.L$0 = obj;
            return r82;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f22063a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:25:0x007c A[Catch: all -> 0x00be, TryCatch #1 {all -> 0x00be, blocks: (B:6:0x0024, B:10:0x0041, B:12:0x0053, B:16:0x0068, B:20:0x0071, B:25:0x007c, B:27:0x0082, B:29:0x0088, B:31:0x008e, B:32:0x00b2, B:33:0x00bd), top: B:52:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00b2 A[Catch: all -> 0x00be, TryCatch #1 {all -> 0x00be, blocks: (B:6:0x0024, B:10:0x0041, B:12:0x0053, B:16:0x0068, B:20:0x0071, B:25:0x007c, B:27:0x0082, B:29:0x0088, B:31:0x008e, B:32:0x00b2, B:33:0x00bd), top: B:52:0x000c }] */
        /* JADX WARN: Type inference failed for: r1v8, types: [com.android.installreferrer.api.InstallReferrerClient, T] */
        /* JADX WARN: Unknown variable types count: 1 */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 271
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.discord.analytics.InstallReferrerModule$get$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallReferrerModule$get$1(Ref$ObjectRef<InstallReferrerClient> ref$ObjectRef, InstallReferrerModule installReferrerModule, Ref$ObjectRef<String> ref$ObjectRef2, SharedPreferences sharedPreferences, Promise promise, int i10, Continuation<? super InstallReferrerModule$get$1> continuation) {
        super(2, continuation);
        this.$client = ref$ObjectRef;
        this.this$0 = installReferrerModule;
        this.$referrer = ref$ObjectRef2;
        this.$prefs = sharedPreferences;
        this.$promise = promise;
        this.$attempts = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InstallReferrerModule$get$1(this.$client, this.this$0, this.$referrer, this.$prefs, this.$promise, this.$attempts, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InstallReferrerModule$get$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f22063a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        d10 = d.d();
        int i10 = this.label;
        if (i10 == 0) {
            t.b(obj);
            AnonymousClass1 r12 = new AnonymousClass1(this.$client, this.this$0, this.$referrer, this.$prefs, this.$promise, this.$attempts, null);
            this.label = 1;
            if (u2.c(1000L, r12, this) == d10) {
                return d10;
            }
        } else if (i10 == 1) {
            t.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f22063a;
    }
}
