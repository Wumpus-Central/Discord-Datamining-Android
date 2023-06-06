package com.discord.samsung;

import android.net.Uri;
import com.discord.samsung.SamsungModule;
import java.util.ArrayList;
import java.util.Map;
import kg.t;
import kg.x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.r;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;
import kotlinx.coroutines.CoroutineScope;
import lg.v;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import qg.d;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.samsung.SamsungModule$finishSamsungAuthorization$1$1$1", f = "SamsungModule.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class SamsungModule$finishSamsungAuthorization$1$1$1 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $authCode;
    final /* synthetic */ OkHttpClient $client;
    final /* synthetic */ String $location;
    final /* synthetic */ String $state;
    int label;
    final /* synthetic */ SamsungModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SamsungModule$finishSamsungAuthorization$1$1$1(String str, SamsungModule samsungModule, OkHttpClient okHttpClient, String str2, String str3, Continuation<? super SamsungModule$finishSamsungAuthorization$1$1$1> continuation) {
        super(2, continuation);
        this.$location = str;
        this.this$0 = samsungModule;
        this.$client = okHttpClient;
        this.$state = str2;
        this.$authCode = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SamsungModule$finishSamsungAuthorization$1$1$1(this.$location, this.this$0, this.$client, this.$state, this.$authCode, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SamsungModule$finishSamsungAuthorization$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f22063a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Uri handleSamsungCallback;
        String queryParameter;
        Map k10;
        String e02;
        d.d();
        if (this.label == 0) {
            t.b(obj);
            Request.Builder d10 = new Request.Builder().d();
            String str = this.$location;
            q.d(str);
            handleSamsungCallback = this.this$0.handleSamsungCallback(this.$client.a(d10.l(str).b()).execute());
            if (handleSamsungCallback == null || (queryParameter = handleSamsungCallback.getQueryParameter("redirect_uri")) == null) {
                throw new SamsungModule.Companion.SamsungCallbackException("no_redirect_uri", "No redirect uri returned from GET /callback");
            }
            String str2 = this.$authCode;
            k10 = v.k(x.a("state", this.$state), x.a("code", "{\"code\":\"" + str2 + "\"}"));
            ArrayList arrayList = new ArrayList(k10.size());
            for (Map.Entry entry : k10.entrySet()) {
                arrayList.add(((String) entry.getKey()) + "=" + ((String) entry.getValue()));
            }
            e02 = r.e0(arrayList, "&", null, null, 0, null, null, 62, null);
            this.this$0.handleSamsungCallback(this.$client.a(new Request.Builder().h(RequestBody.Companion.b(e02, MediaType.f26508g.a("application/x-www-form-urlencoded"))).l(queryParameter).b()).execute());
            SamsungModule.resolveConnection$default(this.this$0, null, 1, null);
            return Unit.f22063a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
