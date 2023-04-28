package com.discord.samsung;

import android.net.Uri;
import com.discord.samsung.SamsungModule;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9914r;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9931e;
import kotlin.coroutines.jvm.internal.AbstractC9938k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9971q;
import kotlinx.coroutines.CoroutineScope;
import nf.C11093t;
import nf.C11098x;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import p267of.C11289v;
import tf.C13080d;

@Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
@AbstractC9931e(m14702c = "com.discord.samsung.SamsungModule$finishSamsungAuthorization$1$1$1", m14701f = "SamsungModule.kt", m14700l = {}, m14699m = "invokeSuspend")
/* loaded from: classes6.dex */
final class SamsungModule$finishSamsungAuthorization$1$1$1 extends AbstractC9938k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
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

    @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SamsungModule$finishSamsungAuthorization$1$1$1(this.$location, this.this$0, this.$client, this.$state, this.$authCode, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SamsungModule$finishSamsungAuthorization$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f22042a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
    public final Object invokeSuspend(Object obj) {
        Uri handleSamsungCallback;
        String queryParameter;
        Map k;
        String e0;
        C13080d.m4646d();
        if (this.label == 0) {
            C11093t.m10930b(obj);
            Request.Builder d = new Request.Builder().m9873d();
            String str = this.$location;
            C9971q.m14636d(str);
            handleSamsungCallback = this.this$0.handleSamsungCallback(this.$client.mo9954a(d.m9865l(str).m9875b()).execute());
            if (handleSamsungCallback == null || (queryParameter = handleSamsungCallback.getQueryParameter("redirect_uri")) == null) {
                throw new SamsungModule.Companion.SamsungCallbackException("no_redirect_uri", "No redirect uri returned from GET /callback");
            }
            String str2 = this.$authCode;
            k = C11289v.m10248k(C11098x.m10921a("state", this.$state), C11098x.m10921a("code", "{\"code\":\"" + str2 + "\"}"));
            ArrayList arrayList = new ArrayList(k.size());
            for (Map.Entry entry : k.entrySet()) {
                arrayList.add(((String) entry.getKey()) + "=" + ((String) entry.getValue()));
            }
            e0 = C9914r.m14760e0(arrayList, "&", null, null, 0, null, null, 62, null);
            this.this$0.handleSamsungCallback(this.$client.mo9954a(new Request.Builder().m9869h(RequestBody.Companion.m9862b(e0, MediaType.f25402g.m9980a("application/x-www-form-urlencoded"))).m9865l(queryParameter).m9875b()).execute());
            SamsungModule.resolveConnection$default(this.this$0, null, 1, null);
            return Unit.f22042a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
