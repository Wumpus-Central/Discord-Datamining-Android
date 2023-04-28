package p188k2;

import java.util.List;
import p223m2.C10470b;
import p358u2.C13178a;
import p358u2.C13179b;
import p358u2.C13180c;

/* renamed from: k2.o */
/* loaded from: classes.dex */
public class C9741o extends AbstractC9733g<C10470b> {

    /* renamed from: k2.o$a */
    /* loaded from: classes.dex */
    class C9742a extends C13180c<C10470b> {

        /* renamed from: d */
        final /* synthetic */ C13179b f21650d;

        /* renamed from: e */
        final /* synthetic */ C13180c f21651e;

        /* renamed from: f */
        final /* synthetic */ C10470b f21652f;

        C9742a(C13179b bVar, C13180c cVar, C10470b bVar2) {
            this.f21650d = bVar;
            this.f21651e = cVar;
            this.f21652f = bVar2;
        }

        /* renamed from: d */
        public C10470b mo4403a(C13179b<C10470b> bVar) {
            C10470b bVar2;
            this.f21650d.m4404h(bVar.m4406f(), bVar.m4411a(), bVar.m4405g().f23106a, bVar.m4410b().f23106a, bVar.m4408d(), bVar.m4409c(), bVar.m4407e());
            String str = (String) this.f21651e.mo4403a(this.f21650d);
            if (bVar.m4409c() == 1.0f) {
                bVar2 = bVar.m4410b();
            } else {
                bVar2 = bVar.m4405g();
            }
            C10470b bVar3 = bVar2;
            this.f21652f.m13104a(str, bVar3.f23107b, bVar3.f23108c, bVar3.f23109d, bVar3.f23110e, bVar3.f23111f, bVar3.f23112g, bVar3.f23113h, bVar3.f23114i, bVar3.f23115j, bVar3.f23116k);
            return this.f21652f;
        }
    }

    public C9741o(List<C13178a<C10470b>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public C10470b mo15448i(C13178a<C10470b> aVar, float f) {
        C10470b bVar;
        float f2;
        C10470b bVar2;
        C13180c<A> cVar = this.f21610e;
        if (cVar != 0) {
            float f3 = aVar.f29545g;
            Float f4 = aVar.f29546h;
            if (f4 == null) {
                f2 = Float.MAX_VALUE;
            } else {
                f2 = f4.floatValue();
            }
            C10470b bVar3 = aVar.f29540b;
            C10470b bVar4 = bVar3;
            C10470b bVar5 = aVar.f29541c;
            if (bVar5 == null) {
                bVar2 = bVar3;
            } else {
                bVar2 = bVar5;
            }
            return (C10470b) cVar.m4402b(f3, f2, bVar4, bVar2, f, m15509d(), m15507f());
        } else if (f != 1.0f || (bVar = aVar.f29541c) == null) {
            return aVar.f29540b;
        } else {
            return bVar;
        }
    }

    /* renamed from: q */
    public void m15462q(C13180c<String> cVar) {
        super.m15504n(new C9742a(new C13179b(), cVar, new C10470b()));
    }
}
