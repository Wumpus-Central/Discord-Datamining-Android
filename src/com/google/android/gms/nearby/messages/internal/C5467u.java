package com.google.android.gms.nearby.messages.internal;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C5378d;
import com.google.android.gms.common.api.internal.C5382e;
import com.google.android.gms.common.api.internal.C5386g;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.SubscribeOptions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p384v9.AbstractC13468e;
import p384v9.C13456a;
import p400w9.AbstractC13827i;
import p420x9.C13964d;
import p420x9.C14004p;
import p442ya.AbstractC14327b;
import p442ya.AbstractC14329d;
import p442ya.AbstractC14334h;
import p442ya.C14330e;
import p442ya.C14332g;
import za.C14598f;

/* renamed from: com.google.android.gms.nearby.messages.internal.u */
/* loaded from: classes3.dex */
public final class C5467u extends AbstractC13468e implements AbstractC14329d {

    /* renamed from: l */
    private static final C13456a.C13464g f10347l;

    /* renamed from: m */
    private static final C13456a.AbstractC0437a f10348m;

    /* renamed from: n */
    private static final C13456a f10349n;

    /* renamed from: o */
    public static final /* synthetic */ int f10350o = 0;

    /* renamed from: k */
    private final int f10351k;

    static {
        C13456a.C13464g gVar = new C13456a.C13464g();
        f10347l = gVar;
        C5453k kVar = new C5453k();
        f10348m = kVar;
        f10349n = new C13456a("Nearby.MESSAGES_API", kVar, gVar);
    }

    public C5467u(Context context, C14330e eVar) {
        super(context, f10349n, eVar, AbstractC13468e.C13469a.f30078c);
        this.f10351k = C5435b.m28924l0(context);
    }

    /* renamed from: G */
    private final C5378d m28906G(Object obj) {
        if (obj == null) {
            return null;
        }
        return m3621w(obj, obj.getClass().getName());
    }

    /* renamed from: H */
    private final C5378d m28905H(TaskCompletionSource taskCompletionSource) {
        return m3621w(new C5459n(this, taskCompletionSource), Status.class.getName());
    }

    /* renamed from: I */
    private final Task m28904I(C5378d dVar, final AbstractC5462p pVar, final AbstractC5462p pVar2, int i) {
        return m3631m(C5386g.m29044a().m29039e(dVar).m29042b(new AbstractC13827i() { // from class: com.google.android.gms.nearby.messages.internal.f
            @Override // p400w9.AbstractC13827i
            public final void accept(Object obj, Object obj2) {
                C5467u.this.m28908E(pVar, (C5435b) obj, (TaskCompletionSource) obj2);
            }
        }).m29040d(new AbstractC13827i() { // from class: com.google.android.gms.nearby.messages.internal.g
            @Override // p400w9.AbstractC13827i
            public final void accept(Object obj, Object obj2) {
                C5467u.this.m28909D(pVar2, (C5435b) obj, (TaskCompletionSource) obj2);
            }
        }).m29041c(i).m29043a());
    }

    /* renamed from: J */
    private final Task m28903J(Object obj, int i) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m3629o(C5382e.m29051b(obj, obj.getClass().getName()), i).mo28871b(new C5461o(this, taskCompletionSource));
        return taskCompletionSource.m28902a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public final /* synthetic */ void m28910C(Message message, BinderC5464r rVar, C14332g gVar, C5435b bVar, C5378d dVar) {
        bVar.m28922n0(dVar, C14598f.m136p(message), rVar, gVar, this.f10351k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public final /* synthetic */ void m28909D(AbstractC5462p pVar, C5435b bVar, TaskCompletionSource taskCompletionSource) {
        pVar.mo28911a(bVar, m28905H(taskCompletionSource));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public final /* synthetic */ void m28908E(AbstractC5462p pVar, C5435b bVar, TaskCompletionSource taskCompletionSource) {
        pVar.mo28911a(bVar, m28905H(taskCompletionSource));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public final /* synthetic */ void m28907F(C5378d dVar, BinderC5466t tVar, SubscribeOptions subscribeOptions, C5435b bVar, C5378d dVar2) {
        bVar.m28920p0(dVar2, dVar, tVar, subscribeOptions, null, this.f10351k);
    }

    @Override // p442ya.AbstractC14329d
    /* renamed from: a */
    public final Task<Void> mo830a(AbstractC14334h hVar) {
        C14004p.m2051j(hVar);
        final C5378d G = m28906G(hVar);
        return m28904I(G, new AbstractC5462p() { // from class: com.google.android.gms.nearby.messages.internal.d
            @Override // com.google.android.gms.nearby.messages.internal.AbstractC5462p
            /* renamed from: a */
            public final void mo28911a(C5435b bVar, C5378d dVar) {
                C5378d dVar2 = C5378d.this;
                int i = C5467u.f10350o;
                bVar.m28921o0(dVar, dVar2);
            }
        }, new AbstractC5462p() { // from class: com.google.android.gms.nearby.messages.internal.e
            @Override // com.google.android.gms.nearby.messages.internal.AbstractC5462p
            /* renamed from: a */
            public final void mo28911a(C5435b bVar, C5378d dVar) {
                C5378d dVar2 = C5378d.this;
                int i = C5467u.f10350o;
                bVar.m28918r0(dVar, dVar2);
            }
        }, 1270);
    }

    @Override // p442ya.AbstractC14329d
    /* renamed from: b */
    public final Task<Void> mo829b(AbstractC14327b bVar, final SubscribeOptions subscribeOptions) {
        boolean z;
        C14004p.m2051j(bVar);
        C14004p.m2051j(subscribeOptions);
        if (subscribeOptions.m28932c().m820p() == 0) {
            z = true;
        } else {
            z = false;
        }
        C14004p.m2059b(z, "Strategy.setBackgroundScanMode() is only supported by background subscribe (the version which takes a PendingIntent).");
        final C5378d G = m28906G(bVar);
        C5378d G2 = m28906G(subscribeOptions.m28934a());
        final BinderC5457m mVar = new BinderC5457m(this, G2, G2);
        return m28904I(G, new AbstractC5462p() { // from class: com.google.android.gms.nearby.messages.internal.h
            @Override // com.google.android.gms.nearby.messages.internal.AbstractC5462p
            /* renamed from: a */
            public final void mo28911a(C5435b bVar2, C5378d dVar) {
                C5467u.this.m28907F(G, mVar, subscribeOptions, bVar2, dVar);
            }
        }, new AbstractC5462p() { // from class: com.google.android.gms.nearby.messages.internal.i
            @Override // com.google.android.gms.nearby.messages.internal.AbstractC5462p
            /* renamed from: a */
            public final void mo28911a(C5435b bVar2, C5378d dVar) {
                C5378d dVar2 = C5378d.this;
                int i = C5467u.f10350o;
                bVar2.m28925k0(dVar, dVar2);
            }
        }, 1289);
    }

    @Override // p442ya.AbstractC14329d
    /* renamed from: c */
    public final Task<Void> mo828c(final Message message) {
        final C14332g gVar = C14332g.f32449c;
        C14004p.m2051j(message);
        C14004p.m2051j(gVar);
        C5378d G = m28906G(message);
        final BinderC5455l lVar = new BinderC5455l(this, m28906G(gVar.m823a()), G);
        return m28904I(G, new AbstractC5462p() { // from class: com.google.android.gms.nearby.messages.internal.j
            @Override // com.google.android.gms.nearby.messages.internal.AbstractC5462p
            /* renamed from: a */
            public final void mo28911a(C5435b bVar, C5378d dVar) {
                C5467u.this.m28910C(message, lVar, gVar, bVar, dVar);
            }
        }, new AbstractC5462p() { // from class: com.google.android.gms.nearby.messages.internal.c
            @Override // com.google.android.gms.nearby.messages.internal.AbstractC5462p
            /* renamed from: a */
            public final void mo28911a(C5435b bVar, C5378d dVar) {
                Message message2 = Message.this;
                int i = C5467u.f10350o;
                bVar.m28919q0(dVar, C14598f.m136p(message2));
            }
        }, 1291);
    }

    @Override // p442ya.AbstractC14329d
    /* renamed from: d */
    public final Task<Void> mo827d(Message message) {
        C14004p.m2051j(message);
        return m28903J(message, 1290);
    }

    @Override // p442ya.AbstractC14329d
    /* renamed from: e */
    public final Task<Void> mo826e(AbstractC14327b bVar) {
        C14004p.m2051j(bVar);
        return m28903J(bVar, 1286);
    }

    @Override // p442ya.AbstractC14329d
    /* renamed from: g */
    public final Task<Void> mo825g(AbstractC14334h hVar) {
        C14004p.m2051j(hVar);
        return m28903J(hVar, 1271);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p384v9.AbstractC13468e
    /* renamed from: i */
    public final C13964d.C13965a mo3635i() {
        C13964d.C13965a i = super.mo3635i();
        if (m3625s() != null) {
            String str = ((C14330e) m3625s()).f32448m;
        }
        return i;
    }
}
