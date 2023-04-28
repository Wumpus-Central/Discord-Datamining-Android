package com.google.android.gms.nearby.messages;

import p442ya.AbstractC14337j;
import p442ya.C14326a;
import p442ya.C14335i;
import p442ya.C14342o;

/* loaded from: classes3.dex */
public final class SubscribeOptions {

    /* renamed from: f */
    public static final SubscribeOptions f10262f = new C5431a().m28931a();

    /* renamed from: a */
    private final C14335i f10263a;

    /* renamed from: b */
    private final C14326a f10264b;

    /* renamed from: c */
    private final AbstractC14337j f10265c;

    /* renamed from: d */
    public final boolean f10266d = false;

    /* renamed from: e */
    public final int f10267e = 0;

    /* renamed from: com.google.android.gms.nearby.messages.SubscribeOptions$a */
    /* loaded from: classes3.dex */
    public static class C5431a {

        /* renamed from: a */
        private C14335i f10268a = C14335i.f32454s;

        /* renamed from: b */
        private C14326a f10269b = C14326a.f32434q;

        /* renamed from: c */
        private AbstractC14337j f10270c;

        /* renamed from: a */
        public SubscribeOptions m28931a() {
            return new SubscribeOptions(this.f10268a, this.f10269b, this.f10270c, false, 0, null);
        }

        /* renamed from: b */
        public C5431a m28930b(C14335i iVar) {
            this.f10268a = iVar;
            return this;
        }
    }

    /* synthetic */ SubscribeOptions(C14335i iVar, C14326a aVar, AbstractC14337j jVar, boolean z, int i, C14342o oVar) {
        this.f10263a = iVar;
        this.f10264b = aVar;
        this.f10265c = jVar;
    }

    /* renamed from: a */
    public AbstractC14337j m28934a() {
        return this.f10265c;
    }

    /* renamed from: b */
    public C14326a m28933b() {
        return this.f10264b;
    }

    /* renamed from: c */
    public C14335i m28932c() {
        return this.f10263a;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f10263a);
        String valueOf2 = String.valueOf(this.f10264b);
        return "SubscribeOptions{strategy=" + valueOf + ", filter=" + valueOf2 + "}";
    }
}
