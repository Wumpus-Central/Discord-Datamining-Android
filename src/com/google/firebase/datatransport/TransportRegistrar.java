package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import cd.C3985h;
import com.google.android.datatransport.cct.C5138a;
import com.google.firebase.datatransport.TransportRegistrar;
import java.util.Arrays;
import java.util.List;
import p177jc.AbstractC9528e;
import p177jc.AbstractC9534h;
import p177jc.AbstractC9535i;
import p177jc.C9523d;
import p177jc.C9548q;
import p279p6.AbstractC11577g;
import p315r6.C12436t;

@Keep
/* loaded from: classes3.dex */
public class TransportRegistrar implements AbstractC9535i {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AbstractC11577g lambda$getComponents$0(AbstractC9528e eVar) {
        C12436t.m6781f((Context) eVar.mo16062a(Context.class));
        return C12436t.m6784c().m6780g(C5138a.f8936h);
    }

    @Override // p177jc.AbstractC9535i
    public List<C9523d<?>> getComponents() {
        return Arrays.asList(C9523d.m16092c(AbstractC11577g.class).m16077b(C9548q.m16018i(Context.class)).m16074e(new AbstractC9534h() { // from class: kc.a
            @Override // p177jc.AbstractC9534h
            /* renamed from: a */
            public final Object mo4207a(AbstractC9528e eVar) {
                AbstractC11577g lambda$getComponents$0;
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(eVar);
                return lambda$getComponents$0;
            }
        }).m16075d(), C3985h.m33198b("fire-transport", "18.1.1"));
    }
}
