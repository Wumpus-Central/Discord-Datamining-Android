package p240n4;

import p416x5.C13934a;

/* renamed from: n4.c */
/* loaded from: classes7.dex */
public class C10710c extends C13934a {

    /* renamed from: a */
    private String f23679a;

    /* renamed from: b */
    private final AbstractC10709b f23680b;

    public C10710c(String str, AbstractC10709b bVar) {
        this.f23680b = bVar;
        m12619a(str);
    }

    /* renamed from: a */
    public void m12619a(String str) {
        this.f23679a = str;
    }

    @Override // p416x5.C13934a, com.facebook.imagepipeline.producers.AbstractC5013o0
    public void onUltimateProducerReached(String str, String str2, boolean z) {
        AbstractC10709b bVar = this.f23680b;
        if (bVar != null) {
            bVar.mo10505a(this.f23679a, C10711d.m12618a(str2), z, str2);
        }
    }
}
