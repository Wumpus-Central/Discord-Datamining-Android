package p066dd;

import p137hd.C7996a;
import p137hd.C7997b;

/* renamed from: dd.c */
/* loaded from: classes3.dex */
public final class C6434c {

    /* renamed from: a */
    private final AbstractC6433b f13489a;

    /* renamed from: b */
    private C7997b f13490b;

    public C6434c(AbstractC6433b bVar) {
        if (bVar != null) {
            this.f13489a = bVar;
            return;
        }
        throw new IllegalArgumentException("Binarizer must be non-null.");
    }

    /* renamed from: a */
    public C7997b m25568a() {
        if (this.f13490b == null) {
            this.f13490b = this.f13489a.mo20883b();
        }
        return this.f13490b;
    }

    /* renamed from: b */
    public C7996a m25567b(int i, C7996a aVar) {
        return this.f13489a.mo20891c(i, aVar);
    }

    /* renamed from: c */
    public int m25566c() {
        return this.f13489a.m25571d();
    }

    /* renamed from: d */
    public int m25565d() {
        return this.f13489a.m25569f();
    }

    /* renamed from: e */
    public boolean m25564e() {
        return this.f13489a.m25570e().mo25556f();
    }

    /* renamed from: f */
    public C6434c m25563f() {
        return new C6434c(this.f13489a.mo20884a(this.f13489a.m25570e().mo25555g()));
    }

    public String toString() {
        try {
            return m25568a().toString();
        } catch (C6441j unused) {
            return "";
        }
    }
}
