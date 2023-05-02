package com.discord.samsung;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.j;
import kotlinx.coroutines.y0;
import nf.s;
import nf.t;
import okhttp3.OkHttpClient;
import tf.d;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.samsung.SamsungModule$finishSamsungAuthorization$1", f = "SamsungModule.kt", l = {151}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class SamsungModule$finishSamsungAuthorization$1 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
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

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SamsungModule$finishSamsungAuthorization$1 samsungModule$finishSamsungAuthorization$1 = new SamsungModule$finishSamsungAuthorization$1(this.$location, this.this$0, this.$state, this.$authCode, continuation);
        samsungModule$finishSamsungAuthorization$1.L$0 = obj;
        return samsungModule$finishSamsungAuthorization$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SamsungModule$finishSamsungAuthorization$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f22035a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        Object obj2;
        d10 = d.d();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                t.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                String str = this.$location;
                SamsungModule samsungModule = this.this$0;
                String str2 = this.$state;
                String str3 = this.$authCode;
                s.a aVar = s.f24599l;
                OkHttpClient c10 = new OkHttpClient.Builder().i(false).c();
                CoroutineDispatcher b10 = y0.b();
                SamsungModule$finishSamsungAuthorization$1$1$1 samsungModule$finishSamsungAuthorization$1$1$1 = new SamsungModule$finishSamsungAuthorization$1$1$1(str, samsungModule, c10, str2, str3, null);
                this.label = 1;
                if (j.g(b10, samsungModule$finishSamsungAuthorization$1$1$1, this) == d10) {
                    return d10;
                }
            } else if (i10 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = s.b(Unit.f22035a);
        } catch (Throwable th2) {
            s.a aVar2 = s.f24599l;
            obj2 = s.b(t.a(th2));
        }
        SamsungModule samsungModule2 = this.this$0;
        Throwable e10 = s.e(obj2);
        if (e10 != null) {
            if (!(e10 instanceof CancellationException)) {
                samsungModule2.rejectConnection(e10);
            } else {
                throw e10;
            }
        }
        return Unit.f22035a;
    }
}
