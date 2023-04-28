package p304qg;

import kotlin.jvm.internal.C9971q;
import p268og.AbstractC11313e;
import p268og.AbstractC11404z0;

/* renamed from: qg.c */
/* loaded from: classes8.dex */
public interface AbstractC12127c {

    /* renamed from: qg.c$a */
    /* loaded from: classes8.dex */
    public static final class C12128a implements AbstractC12127c {

        /* renamed from: a */
        public static final C12128a f27211a = new C12128a();

        private C12128a() {
        }

        @Override // p304qg.AbstractC12127c
        /* renamed from: d */
        public boolean mo7766d(AbstractC11313e classDescriptor, AbstractC11404z0 functionDescriptor) {
            C9971q.m14633g(classDescriptor, "classDescriptor");
            C9971q.m14633g(functionDescriptor, "functionDescriptor");
            return true;
        }
    }

    /* renamed from: qg.c$b */
    /* loaded from: classes8.dex */
    public static final class C12129b implements AbstractC12127c {

        /* renamed from: a */
        public static final C12129b f27212a = new C12129b();

        private C12129b() {
        }

        @Override // p304qg.AbstractC12127c
        /* renamed from: d */
        public boolean mo7766d(AbstractC11313e classDescriptor, AbstractC11404z0 functionDescriptor) {
            C9971q.m14633g(classDescriptor, "classDescriptor");
            C9971q.m14633g(functionDescriptor, "functionDescriptor");
            return !functionDescriptor.getAnnotations().mo9037l(C12130d.m7765a());
        }
    }

    /* renamed from: d */
    boolean mo7766d(AbstractC11313e eVar, AbstractC11404z0 z0Var);
}
