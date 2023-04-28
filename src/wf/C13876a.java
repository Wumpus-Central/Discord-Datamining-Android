package wf;

import cg.AbstractC4002c;
import kotlin.Metadata;
import p068dg.C6461a;
import p387vf.C13504a;

@Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u000b"}, m15073d2 = {"Lwf/a;", "Lvf/a;", "", "version", "", "c", "Lcg/c;", "b", "<init>", "()V", "a", "kotlin-stdlib-jdk8"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: wf.a */
/* loaded from: classes8.dex */
public class C13876a extends C13504a {

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, m15073d2 = {"Lwf/a$a;", "", "", "b", "Ljava/lang/Integer;", "sdkVersion", "<init>", "()V", "kotlin-stdlib-jdk8"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: wf.a$a */
    /* loaded from: classes8.dex */
    public static final class C0447a {

        /* renamed from: a */
        public static final C0447a f31275a = new C0447a();

        /* renamed from: b */
        public static final Integer f31276b;

        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        static {
            /*
                wf.a$a r0 = new wf.a$a
                r0.<init>()
                wf.C13876a.C0447a.f31275a = r0
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
                wf.C13876a.C0447a.f31276b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wf.C13876a.C0447a.<clinit>():void");
        }

        private C0447a() {
        }
    }

    /* renamed from: c */
    private final boolean m2413c(int i) {
        Integer num = C0447a.f31276b;
        return num == null || num.intValue() >= i;
    }

    @Override // p370uf.C13272a
    /* renamed from: b */
    public AbstractC4002c mo2414b() {
        return m2413c(34) ? new C6461a() : super.mo2414b();
    }
}
