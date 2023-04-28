package p045cj;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p014aj.AbstractC1432i;

@Metadata(m15074d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0001J\u0006\u0010\f\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\u0002J\u0006\u0010\u000f\u001a\u00020\u000eJ\b\u0010\u0010\u001a\u00020\u000eH\u0016R\u001e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017¨\u0006\u001b"}, m15073d2 = {"Lcj/c0;", "", "", "e", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "sd", "c", "", "index", "g", "key", "f", "d", "b", "", "a", "toString", "", "[Ljava/lang/Object;", "currentObjectPath", "", "[I", "indicies", "I", "currentDepth", "<init>", "()V", "kotlinx-serialization-json"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: cj.c0 */
/* loaded from: classes8.dex */
public final class C4030c0 {

    /* renamed from: a */
    private Object[] f6624a = new Object[8];

    /* renamed from: b */
    private int[] f6625b;

    /* renamed from: c */
    private int f6626c;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m15073d2 = {"Lcj/c0$a;", "", "<init>", "()V", "kotlinx-serialization-json"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: cj.c0$a */
    /* loaded from: classes8.dex */
    public static final class C4031a {

        /* renamed from: a */
        public static final C4031a f6627a = new C4031a();

        private C4031a() {
        }
    }

    public C4030c0() {
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.f6625b = iArr;
        this.f6626c = -1;
    }

    /* renamed from: e */
    private final void m32989e() {
        int i = this.f6626c * 2;
        Object[] copyOf = Arrays.copyOf(this.f6624a, i);
        C9971q.m14634f(copyOf, "copyOf(this, newSize)");
        this.f6624a = copyOf;
        int[] copyOf2 = Arrays.copyOf(this.f6625b, i);
        C9971q.m14634f(copyOf2, "copyOf(this, newSize)");
        this.f6625b = copyOf2;
    }

    /* renamed from: a */
    public final String m32993a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("$");
        int i = this.f6626c + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = this.f6624a[i2];
            if (obj instanceof SerialDescriptor) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                if (!C9971q.m14638b(serialDescriptor.mo13678g(), AbstractC1432i.C1434b.f482a)) {
                    int i3 = this.f6625b[i2];
                    if (i3 >= 0) {
                        sb2.append(".");
                        sb2.append(serialDescriptor.mo13680e(i3));
                    }
                } else if (this.f6625b[i2] != -1) {
                    sb2.append("[");
                    sb2.append(this.f6625b[i2]);
                    sb2.append("]");
                }
            } else if (obj != C4031a.f6627a) {
                sb2.append("[");
                sb2.append("'");
                sb2.append(obj);
                sb2.append("'");
                sb2.append("]");
            }
        }
        String sb3 = sb2.toString();
        C9971q.m14634f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* renamed from: b */
    public final void m32992b() {
        int i = this.f6626c;
        int[] iArr = this.f6625b;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            this.f6626c = i - 1;
        }
        int i2 = this.f6626c;
        if (i2 != -1) {
            this.f6626c = i2 - 1;
        }
    }

    /* renamed from: c */
    public final void m32991c(SerialDescriptor sd2) {
        C9971q.m14633g(sd2, "sd");
        int i = this.f6626c + 1;
        this.f6626c = i;
        if (i == this.f6624a.length) {
            m32989e();
        }
        this.f6624a[i] = sd2;
    }

    /* renamed from: d */
    public final void m32990d() {
        int[] iArr = this.f6625b;
        int i = this.f6626c;
        if (iArr[i] == -2) {
            this.f6624a[i] = C4031a.f6627a;
        }
    }

    /* renamed from: f */
    public final void m32988f(Object obj) {
        int[] iArr = this.f6625b;
        int i = this.f6626c;
        if (iArr[i] != -2) {
            int i2 = i + 1;
            this.f6626c = i2;
            if (i2 == this.f6624a.length) {
                m32989e();
            }
        }
        Object[] objArr = this.f6624a;
        int i3 = this.f6626c;
        objArr[i3] = obj;
        this.f6625b[i3] = -2;
    }

    /* renamed from: g */
    public final void m32987g(int i) {
        this.f6625b[this.f6626c] = i;
    }

    public String toString() {
        return m32993a();
    }
}
