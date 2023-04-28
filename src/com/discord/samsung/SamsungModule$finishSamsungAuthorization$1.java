package com.discord.samsung;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9931e;
import kotlin.coroutines.jvm.internal.AbstractC9938k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.C10129j;
import kotlinx.coroutines.C10230y0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import nf.C11090s;
import nf.C11093t;
import okhttp3.OkHttpClient;
import tf.C13080d;

@Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
@AbstractC9931e(m14702c = "com.discord.samsung.SamsungModule$finishSamsungAuthorization$1", m14701f = "SamsungModule.kt", m14700l = {151}, m14699m = "invokeSuspend")
/* loaded from: classes6.dex */
final class SamsungModule$finishSamsungAuthorization$1 extends AbstractC9938k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $authCode;
    final /* synthetic */ String $location;
    final /* synthetic */ String $state;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SamsungModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SamsungModule$finishSamsungAuthorization$1(String str, SamsungModule samsungModule, String str2, String str3, Continuation<? super SamsungModule$finishSamsungAuthorization$1> continuation) {
        super(2, continuation);
        this.$location = str;
        this.this$0 = samsungModule;
        this.$state = str2;
        this.$authCode = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SamsungModule$finishSamsungAuthorization$1 samsungModule$finishSamsungAuthorization$1 = new SamsungModule$finishSamsungAuthorization$1(this.$location, this.this$0, this.$state, this.$authCode, continuation);
        samsungModule$finishSamsungAuthorization$1.L$0 = obj;
        return samsungModule$finishSamsungAuthorization$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SamsungModule$finishSamsungAuthorization$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f22042a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
    public final Object invokeSuspend(Object obj) {
        Object d;
        Object obj2;
        d = C13080d.m4646d();
        int i = this.label;
        try {
            if (i == 0) {
                C11093t.m10930b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                String str = this.$location;
                SamsungModule samsungModule = this.this$0;
                String str2 = this.$state;
                String str3 = this.$authCode;
                C11090s.C11091a aVar = C11090s.f24606l;
                OkHttpClient c = new OkHttpClient.Builder().m9908i(false).m9914c();
                CoroutineDispatcher b = C10230y0.m13946b();
                SamsungModule$finishSamsungAuthorization$1$1$1 samsungModule$finishSamsungAuthorization$1$1$1 = new SamsungModule$finishSamsungAuthorization$1$1$1(str, samsungModule, c, str2, str3, null);
                this.label = 1;
                if (C10129j.m14192g(b, samsungModule$finishSamsungAuthorization$1$1$1, this) == d) {
                    return d;
                }
            } else if (i == 1) {
                C11093t.m10930b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = C11090s.m10940b(Unit.f22042a);
        } catch (Throwable th2) {
            C11090s.C11091a aVar2 = C11090s.f24606l;
            obj2 = C11090s.m10940b(C11093t.m10931a(th2));
        }
        SamsungModule samsungModule2 = this.this$0;
        Throwable e = C11090s.m10937e(obj2);
        if (e != null) {
            if (!(e instanceof CancellationException)) {
                samsungModule2.rejectConnection(e);
            } else {
                throw e;
            }
        }
        return Unit.f22042a;
    }
}
