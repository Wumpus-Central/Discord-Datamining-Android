package com.google.firebase.messaging;

import androidx.annotation.Keep;
import cd.AbstractC3987i;
import cd.C3985h;
import java.util.Arrays;
import java.util.List;
import p136hc.C7984d;
import p177jc.AbstractC9528e;
import p177jc.AbstractC9534h;
import p177jc.AbstractC9535i;
import p177jc.C9523d;
import p177jc.C9548q;
import p279p6.AbstractC11577g;
import p300qc.AbstractC12106d;
import p321rc.AbstractC12564k;
import p367uc.AbstractC13254d;
import sc.AbstractC12861a;

@Keep
/* loaded from: classes3.dex */
public class FirebaseMessagingRegistrar implements AbstractC9535i {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(AbstractC9528e eVar) {
        return new FirebaseMessaging((C7984d) eVar.mo16062a(C7984d.class), (AbstractC12861a) eVar.mo16062a(AbstractC12861a.class), eVar.mo16059d(AbstractC3987i.class), eVar.mo16059d(AbstractC12564k.class), (AbstractC13254d) eVar.mo16062a(AbstractC13254d.class), (AbstractC11577g) eVar.mo16062a(AbstractC11577g.class), (AbstractC12106d) eVar.mo16062a(AbstractC12106d.class));
    }

    @Override // p177jc.AbstractC9535i
    @Keep
    public List<C9523d<?>> getComponents() {
        return Arrays.asList(C9523d.m16092c(FirebaseMessaging.class).m16077b(C9548q.m16018i(C7984d.class)).m16077b(C9548q.m16020g(AbstractC12861a.class)).m16077b(C9548q.m16019h(AbstractC3987i.class)).m16077b(C9548q.m16019h(AbstractC12564k.class)).m16077b(C9548q.m16020g(AbstractC11577g.class)).m16077b(C9548q.m16018i(AbstractC13254d.class)).m16077b(C9548q.m16018i(AbstractC12106d.class)).m16074e(new AbstractC9534h() { // from class: com.google.firebase.messaging.x
            @Override // p177jc.AbstractC9534h
            /* renamed from: a */
            public final Object mo4207a(AbstractC9528e eVar) {
                FirebaseMessaging lambda$getComponents$0;
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(eVar);
                return lambda$getComponents$0;
            }
        }).m16076c().m16075d(), C3985h.m33198b("fire-fcm", "23.0.1"));
    }
}
