package nf;

import co.discord.media_engine.C4081a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\b\u0087@\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B\u0014\b\u0001\u0012\u0006\u0010\u0012\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0010\u0010\u0011\u0088\u0001\u0012\u0092\u0001\u00020\rø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, m15073d2 = {"Lnf/d0;", "", "", "e", "(J)Ljava/lang/String;", "", "d", "(J)I", "", "other", "", "c", "(JLjava/lang/Object;)Z", "", "k", "J", "getData$annotations", "()V", "data", "b", "(J)J", "l", "a", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: nf.d0 */
/* loaded from: classes8.dex */
public final class C11062d0 implements Comparable<C11062d0> {

    /* renamed from: l */
    public static final C11063a f24580l = new C11063a(null);

    /* renamed from: k */
    private final long f24581k;

    @Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\f"}, m15073d2 = {"Lnf/d0$a;", "", "Lnf/d0;", "MAX_VALUE", "J", "MIN_VALUE", "", "SIZE_BITS", "I", "SIZE_BYTES", "<init>", "()V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: nf.d0$a */
    /* loaded from: classes8.dex */
    public static final class C11063a {
        private C11063a() {
        }

        public /* synthetic */ C11063a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ C11062d0(long j) {
        this.f24581k = j;
    }

    /* renamed from: a */
    public static final /* synthetic */ C11062d0 m11006a(long j) {
        return new C11062d0(j);
    }

    /* renamed from: b */
    public static long m11005b(long j) {
        return j;
    }

    /* renamed from: c */
    public static boolean m11004c(long j, Object obj) {
        return (obj instanceof C11062d0) && j == ((C11062d0) obj).m11001f();
    }

    /* renamed from: d */
    public static int m11003d(long j) {
        return C4081a.m32873a(j);
    }

    /* renamed from: e */
    public static String m11002e(long j) {
        return C11081k0.m10951c(j);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(C11062d0 d0Var) {
        return C11081k0.m10952b(m11001f(), d0Var.m11001f());
    }

    public boolean equals(Object obj) {
        return m11004c(this.f24581k, obj);
    }

    /* renamed from: f */
    public final /* synthetic */ long m11001f() {
        return this.f24581k;
    }

    public int hashCode() {
        return m11003d(this.f24581k);
    }

    public String toString() {
        return m11002e(this.f24581k);
    }
}
