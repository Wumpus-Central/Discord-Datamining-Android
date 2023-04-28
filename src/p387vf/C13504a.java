package p387vf;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import p370uf.C13272a;

@Metadata(m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\r"}, m15073d2 = {"Lvf/a;", "Luf/a;", "", "version", "", "c", "", "cause", "exception", "", "a", "<init>", "()V", "kotlin-stdlib-jdk7"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: vf.a */
/* loaded from: classes8.dex */
public class C13504a extends C13272a {

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, m15073d2 = {"Lvf/a$a;", "", "", "b", "Ljava/lang/Integer;", "sdkVersion", "<init>", "()V", "kotlin-stdlib-jdk7"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: vf.a$a */
    /* loaded from: classes8.dex */
    public static final class C0443a {

        /* renamed from: a */
        public static final C0443a f30185a = new C0443a();

        /* renamed from: b */
        public static final Integer f30186b;

        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        static {
            /*
                vf.a$a r0 = new vf.a$a
                r0.<init>()
                p387vf.C13504a.C0443a.f30185a = r0
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: all -> 0x001f
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: all -> 0x001f
                java.lang.Object r1 = r1.get(r0)     // Catch: all -> 0x001f
                boolean r2 = r1 instanceof java.lang.Integer     // Catch: all -> 0x001f
                if (r2 == 0) goto L_0x001f
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: all -> 0x001f
                goto L_0x0020
            L_0x001f:
                r1 = r0
            L_0x0020:
                if (r1 == 0) goto L_0x002e
                int r2 = r1.intValue()
                if (r2 <= 0) goto L_0x002a
                r2 = 1
                goto L_0x002b
            L_0x002a:
                r2 = 0
            L_0x002b:
                if (r2 == 0) goto L_0x002e
                r0 = r1
            L_0x002e:
                p387vf.C13504a.C0443a.f30186b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p387vf.C13504a.C0443a.<clinit>():void");
        }

        private C0443a() {
        }
    }

    /* renamed from: c */
    private final boolean m3545c(int i) {
        Integer num = C0443a.f30186b;
        return num == null || num.intValue() >= i;
    }

    @Override // p370uf.C13272a
    /* renamed from: a */
    public void mo3546a(Throwable cause, Throwable exception) {
        C9971q.m14633g(cause, "cause");
        C9971q.m14633g(exception, "exception");
        if (m3545c(19)) {
            cause.addSuppressed(exception);
        } else {
            super.mo3546a(cause, exception);
        }
    }
}
