package p370uf;

import cg.AbstractC4002c;
import cg.C4000b;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, m15073d2 = {"Luf/a;", "", "", "cause", "exception", "", "a", "Lcg/c;", "b", "<init>", "()V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: uf.a */
/* loaded from: classes8.dex */
public class C13272a {

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\n"}, m15073d2 = {"Luf/a$a;", "", "Ljava/lang/reflect/Method;", "b", "Ljava/lang/reflect/Method;", "addSuppressed", "c", "getSuppressed", "<init>", "()V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: uf.a$a */
    /* loaded from: classes8.dex */
    public static final class C0432a {

        /* renamed from: a */
        public static final C0432a f29797a = new C0432a();

        /* renamed from: b */
        public static final Method f29798b;

        /* renamed from: c */
        public static final Method f29799c;

        /* JADX WARN: Removed duplicated region for block: B:12:0x003f A[LOOP:0: B:3:0x0015->B:12:0x003f, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[EDGE_INSN: B:23:0x0043->B:14:0x0043 ?: BREAK  , SYNTHETIC] */
        static {
            /*
                uf.a$a r0 = new uf.a$a
                r0.<init>()
                p370uf.C13272a.C0432a.f29797a = r0
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                kotlin.jvm.internal.C9971q.m14634f(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = r3
            L_0x0015:
                r5 = 0
                if (r4 >= r2) goto L_0x0042
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = kotlin.jvm.internal.C9971q.m14638b(r7, r8)
                if (r7 == 0) goto L_0x003b
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r8 = "it.parameterTypes"
                kotlin.jvm.internal.C9971q.m14634f(r7, r8)
                java.lang.Object r7 = kotlin.collections.C9894b.m15023i0(r7)
                boolean r7 = kotlin.jvm.internal.C9971q.m14638b(r7, r0)
                if (r7 == 0) goto L_0x003b
                r7 = 1
                goto L_0x003c
            L_0x003b:
                r7 = r3
            L_0x003c:
                if (r7 == 0) goto L_0x003f
                goto L_0x0043
            L_0x003f:
                int r4 = r4 + 1
                goto L_0x0015
            L_0x0042:
                r6 = r5
            L_0x0043:
                p370uf.C13272a.C0432a.f29798b = r6
                int r0 = r1.length
            L_0x0046:
                if (r3 >= r0) goto L_0x005b
                r2 = r1[r3]
                java.lang.String r4 = r2.getName()
                java.lang.String r6 = "getSuppressed"
                boolean r4 = kotlin.jvm.internal.C9971q.m14638b(r4, r6)
                if (r4 == 0) goto L_0x0058
                r5 = r2
                goto L_0x005b
            L_0x0058:
                int r3 = r3 + 1
                goto L_0x0046
            L_0x005b:
                p370uf.C13272a.C0432a.f29799c = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p370uf.C13272a.C0432a.<clinit>():void");
        }

        private C0432a() {
        }
    }

    /* renamed from: a */
    public void mo3546a(Throwable cause, Throwable exception) {
        C9971q.m14633g(cause, "cause");
        C9971q.m14633g(exception, "exception");
        Method method = C0432a.f29798b;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    /* renamed from: b */
    public AbstractC4002c mo2414b() {
        return new C4000b();
    }
}
