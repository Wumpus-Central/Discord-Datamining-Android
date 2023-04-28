package nf;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\n\b\u0087@\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B\u0014\b\u0001\u0012\u0006\u0010\u0012\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0010\u0010\u0011\u0088\u0001\u0012\u0092\u0001\u00020\rø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, m15073d2 = {"Lnf/z;", "", "", "e", "(B)Ljava/lang/String;", "", "d", "(B)I", "", "other", "", "c", "(BLjava/lang/Object;)Z", "", "k", "B", "getData$annotations", "()V", "data", "b", "(B)B", "l", "a", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: nf.z */
/* loaded from: classes8.dex */
public final class C11100z implements Comparable<C11100z> {

    /* renamed from: l */
    public static final C11101a f24620l = new C11101a(null);

    /* renamed from: k */
    private final byte f24621k;

    @Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\f"}, m15073d2 = {"Lnf/z$a;", "", "Lnf/z;", "MAX_VALUE", "B", "MIN_VALUE", "", "SIZE_BITS", "I", "SIZE_BYTES", "<init>", "()V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: nf.z$a */
    /* loaded from: classes8.dex */
    public static final class C11101a {
        private C11101a() {
        }

        public /* synthetic */ C11101a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ C11100z(byte b) {
        this.f24621k = b;
    }

    /* renamed from: a */
    public static final /* synthetic */ C11100z m10920a(byte b) {
        return new C11100z(b);
    }

    /* renamed from: b */
    public static byte m10919b(byte b) {
        return b;
    }

    /* renamed from: c */
    public static boolean m10918c(byte b, Object obj) {
        return (obj instanceof C11100z) && b == ((C11100z) obj).m10915f();
    }

    /* renamed from: d */
    public static int m10917d(byte b) {
        return b;
    }

    /* renamed from: e */
    public static String m10916e(byte b) {
        return String.valueOf(b & 255);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(C11100z zVar) {
        return C9971q.m14631i(m10915f() & 255, zVar.m10915f() & 255);
    }

    public boolean equals(Object obj) {
        return m10918c(this.f24621k, obj);
    }

    /* renamed from: f */
    public final /* synthetic */ byte m10915f() {
        return this.f24621k;
    }

    public int hashCode() {
        return m10917d(this.f24621k);
    }

    public String toString() {
        return m10916e(this.f24621k);
    }
}
