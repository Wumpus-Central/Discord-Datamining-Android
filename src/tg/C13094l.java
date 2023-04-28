package tg;

import kotlin.jvm.internal.C9971q;
import p069dh.AbstractC6462a;
import p069dh.AbstractC6463b;
import p086eh.AbstractC6900l;
import p268og.AbstractC11304b1;
import ug.AbstractC13306p;

/* renamed from: tg.l */
/* loaded from: classes8.dex */
public final class C13094l implements AbstractC6463b {

    /* renamed from: a */
    public static final C13094l f29403a = new C13094l();

    /* renamed from: tg.l$a */
    /* loaded from: classes8.dex */
    public static final class C13095a implements AbstractC6462a {

        /* renamed from: b */
        private final AbstractC13306p f29404b;

        public C13095a(AbstractC13306p javaElement) {
            C9971q.m14633g(javaElement, "javaElement");
            this.f29404b = javaElement;
        }

        @Override // p268og.AbstractC11299a1
        /* renamed from: b */
        public AbstractC11304b1 mo4612b() {
            AbstractC11304b1 NO_SOURCE_FILE = AbstractC11304b1.f25237a;
            C9971q.m14634f(NO_SOURCE_FILE, "NO_SOURCE_FILE");
            return NO_SOURCE_FILE;
        }

        /* renamed from: d */
        public AbstractC13306p mo4611c() {
            return this.f29404b;
        }

        public String toString() {
            return C13095a.class.getName() + ": " + mo4611c();
        }
    }

    private C13094l() {
    }

    @Override // p069dh.AbstractC6463b
    /* renamed from: a */
    public AbstractC6462a mo4613a(AbstractC6900l javaElement) {
        C9971q.m14633g(javaElement, "javaElement");
        return new C13095a((AbstractC13306p) javaElement);
    }
}
