package nf;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087@\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B\u0014\b\u0001\u0012\u0006\u0010\u0011\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u000f\u0010\u0010\u0088\u0001\u0011\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, m15073d2 = {"Lnf/b0;", "", "", "e", "(I)Ljava/lang/String;", "", "d", "(I)I", "", "other", "", "c", "(ILjava/lang/Object;)Z", "k", "I", "getData$annotations", "()V", "data", "b", "l", "a", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: nf.b0 */
/* loaded from: classes8.dex */
public final class C11056b0 implements Comparable<C11056b0> {

    /* renamed from: l */
    public static final C11057a f24571l = new C11057a(null);

    /* renamed from: k */
    private final int f24572k;

    @Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u000b"}, m15073d2 = {"Lnf/b0$a;", "", "Lnf/b0;", "MAX_VALUE", "I", "MIN_VALUE", "", "SIZE_BITS", "SIZE_BYTES", "<init>", "()V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: nf.b0$a */
    /* loaded from: classes8.dex */
    public static final class C11057a {
        private C11057a() {
        }

        public /* synthetic */ C11057a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ C11056b0(int i) {
        this.f24572k = i;
    }

    /* renamed from: a */
    public static final /* synthetic */ C11056b0 m11031a(int i) {
        return new C11056b0(i);
    }

    /* renamed from: b */
    public static int m11030b(int i) {
        return i;
    }

    /* renamed from: c */
    public static boolean m11029c(int i, Object obj) {
        return (obj instanceof C11056b0) && i == ((C11056b0) obj).m11026f();
    }

    /* renamed from: d */
    public static int m11028d(int i) {
        return i;
    }

    /* renamed from: e */
    public static String m11027e(int i) {
        return String.valueOf(i & 4294967295L);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(C11056b0 b0Var) {
        return C11081k0.m10953a(m11026f(), b0Var.m11026f());
    }

    public boolean equals(Object obj) {
        return m11029c(this.f24572k, obj);
    }

    /* renamed from: f */
    public final /* synthetic */ int m11026f() {
        return this.f24572k;
    }

    public int hashCode() {
        return m11028d(this.f24572k);
    }

    public String toString() {
        return m11027e(this.f24572k);
    }
}
