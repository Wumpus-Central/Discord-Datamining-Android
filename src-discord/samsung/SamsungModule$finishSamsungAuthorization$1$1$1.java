package com.discord.samsung;

import android.net.Uri;
import com.discord.samsung.SamsungModule;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.r;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import pf.t;
import pf.x;
import qf.v;
import vf.d;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.samsung.SamsungModule$finishSamsungAuthorization$1$1$1", f = "SamsungModule.kt", l = {}, m = "invokeSuspend")

final class SamsungModule$finishSamsungAuthorization$1$1$1 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final  String $authCode;
    final  OkHttpClient $client;
    final  String $location;
    final  String $state;
    int label;
    final  SamsungModule this$0;

    
    
    public SamsungModule$finishSamsungAuthorization$1$1$1(String str, SamsungModule samsungModule, OkHttpClient okHttpClient, String str2, String str3, Continuation<? super SamsungModule$finishSamsungAuthorization$1$1$1> continuation) {
        super(2, continuation);
        this.$location = str;
        this.this$0 = samsungModule;
        this.$client = okHttpClient;
        this.$state = str2;
        this.$authCode = str3;
    }

    @Override 
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SamsungModule$finishSamsungAuthorization$1$1$1(this.$location, this.this$0, this.$client, this.$state, this.$authCode, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SamsungModule$finishSamsungAuthorization$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f21600a);
    }

    @Override 
    public final Object invokeSuspend(Object obj) {
        Uri handleSamsungCallback;
        String queryParameter;
        Map k10;
        String d02;
        d.d();
        if (this.label == 0) {
            t.b(obj);
            Request.Builder d10 = new Request.Builder().d();
            String str = this.$location;
            q.e(str);
            handleSamsungCallback = this.this$0.handleSamsungCallback(this.$client.b(d10.l(str).b()).execute());
            if (handleSamsungCallback == null || (queryParameter = handleSamsungCallback.getQueryParameter("redirect_uri")) == null) {
                throw new SamsungModule.Companion.SamsungCallbackException("no_redirect_uri", "No redirect uri returned from GET /callback");
            }
            String str2 = this.$authCode;
            k10 = v.k(x.a("state", this.$state), x.a("code", "{\"code\":\"" + str2 + "\"}"));
            ArrayList arrayList = new ArrayList(k10.size());
            for (Map.Entry entry : k10.entrySet()) {
                arrayList.add(((String) entry.getKey()) + "=" + ((String) entry.getValue()));
            }
            d02 = r.d0(arrayList, "&", null, null, 0, null, null, 62, null);
            this.this$0.handleSamsungCallback(this.$client.b(new Request.Builder().h(RequestBody.Companion.b(d02, MediaType.f25347g.a("application/x-www-form-urlencoded"))).l(queryParameter).b()).execute());
            SamsungModule.resolveConnection$default(this.this$0, null, 1, null);
            return Unit.f21600a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
