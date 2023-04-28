package nf;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\n\b\u0087@\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B\u0014\b\u0001\u0012\u0006\u0010\u0012\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0010\u0010\u0011\u0088\u0001\u0012\u0092\u0001\u00020\rø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, m15073d2 = {"Lnf/g0;", "", "", "e", "(S)Ljava/lang/String;", "", "d", "(S)I", "", "other", "", "c", "(SLjava/lang/Object;)Z", "", "k", "S", "getData$annotations", "()V", "data", "b", "(S)S", "l", "a", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: nf.g0 */
/* loaded from: classes8.dex */
public final class C11070g0 implements Comparable<C11070g0> {

    /* renamed from: l */
    public static final C11071a f24586l = new C11071a(null);

    /* renamed from: k */
    private final short f24587k;

    @Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\f"}, m15073d2 = {"Lnf/g0$a;", "", "Lnf/g0;", "MAX_VALUE", "S", "MIN_VALUE", "", "SIZE_BITS", "I", "SIZE_BYTES", "<init>", "()V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: nf.g0$a */
    /* loaded from: classes8.dex */
    public static final class C11071a {
        private C11071a() {
        }

        public /* synthetic */ C11071a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ C11070g0(short s) {
        this.f24587k = s;
    }

    /* renamed from: a */
    public static final /* synthetic */ C11070g0 m10979a(short s) {
        return new C11070g0(s);
    }

    /* renamed from: b */
    public static short m10978b(short s) {
        return s;
    }

    /* renamed from: c */
    public static boolean m10977c(short s, Object obj) {
        return (obj instanceof C11070g0) && s == ((C11070g0) obj).m10974f();
    }

    /* renamed from: d */
    public static int m10976d(short s) {
        return s;
    }

    /* renamed from: e */
    public static String m10975e(short s) {
        return String.valueOf(s & 65535);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(C11070g0 g0Var) {
        return C9971q.m14631i(m10974f() & 65535, g0Var.m10974f() & 65535);
    }

    public boolean equals(Object obj) {
        return m10977c(this.f24587k, obj);
    }

    /* renamed from: f */
    public final /* synthetic */ short m10974f() {
        return this.f24587k;
    }

    public int hashCode() {
        return m10976d(this.f24587k);
    }

    public String toString() {
        return m10975e(this.f24587k);
    }
}
