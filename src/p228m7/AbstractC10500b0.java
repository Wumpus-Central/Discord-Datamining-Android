package p228m7;

import java.util.Arrays;
import p079e7.C6722k;
import p081e9.AbstractC6774h;
import p119g9.C7570y;

/* renamed from: m7.b0 */
/* loaded from: classes7.dex */
public interface AbstractC10500b0 {

    /* renamed from: m7.b0$a */
    /* loaded from: classes7.dex */
    public static final class C10501a {

        /* renamed from: a */
        public final int f23198a;

        /* renamed from: b */
        public final byte[] f23199b;

        /* renamed from: c */
        public final int f23200c;

        /* renamed from: d */
        public final int f23201d;

        public C10501a(int i, byte[] bArr, int i2, int i3) {
            this.f23198a = i;
            this.f23199b = bArr;
            this.f23200c = i2;
            this.f23201d = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C10501a.class != obj.getClass()) {
                return false;
            }
            C10501a aVar = (C10501a) obj;
            if (this.f23198a == aVar.f23198a && this.f23200c == aVar.f23200c && this.f23201d == aVar.f23201d && Arrays.equals(this.f23199b, aVar.f23199b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f23198a * 31) + Arrays.hashCode(this.f23199b)) * 31) + this.f23200c) * 31) + this.f23201d;
        }
    }

    /* renamed from: a */
    int mo12390a(AbstractC6774h hVar, int i, boolean z, int i2);

    /* renamed from: b */
    void mo12389b(C7570y yVar, int i, int i2);

    /* renamed from: c */
    void mo12382c(long j, int i, int i2, int i3, C10501a aVar);

    /* renamed from: d */
    void mo12388d(C6722k kVar);

    /* renamed from: e */
    int mo12387e(AbstractC6774h hVar, int i, boolean z);

    /* renamed from: f */
    void mo12386f(C7570y yVar, int i);
}
