package com.google.firebase.installations;

import androidx.annotation.Keep;
import cd.C3985h;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.Arrays;
import java.util.List;
import p136hc.C7984d;
import p177jc.AbstractC9528e;
import p177jc.AbstractC9534h;
import p177jc.AbstractC9535i;
import p177jc.C9523d;
import p177jc.C9548q;
import p321rc.AbstractC12563j;
import p321rc.C12561i;
import p367uc.AbstractC13254d;

@Keep
/* loaded from: classes3.dex */
public class FirebaseInstallationsRegistrar implements AbstractC9535i {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AbstractC13254d lambda$getComponents$0(AbstractC9528e eVar) {
        return new C5794c((C7984d) eVar.mo16062a(C7984d.class), eVar.mo16059d(AbstractC12563j.class));
    }

    @Override // p177jc.AbstractC9535i
    public List<C9523d<?>> getComponents() {
        return Arrays.asList(C9523d.m16092c(AbstractC13254d.class).m16077b(C9548q.m16018i(C7984d.class)).m16077b(C9548q.m16019h(AbstractC12563j.class)).m16074e(new AbstractC9534h() { // from class: uc.e
            @Override // p177jc.AbstractC9534h
            /* renamed from: a */
            public final Object mo4207a(AbstractC9528e eVar) {
                AbstractC13254d lambda$getComponents$0;
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(eVar);
                return lambda$getComponents$0;
            }
        }).m16075d(), C12561i.m6551a(), C3985h.m33198b("fire-installations", "17.0.1"));
    }
}
