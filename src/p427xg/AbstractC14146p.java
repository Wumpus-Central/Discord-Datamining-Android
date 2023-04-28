package p427xg;

import java.util.Arrays;
import java.util.Set;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p086eh.AbstractC6895g;
import p086eh.AbstractC6909u;
import p249nh.C11136b;
import p249nh.C11137c;

/* renamed from: xg.p */
/* loaded from: classes8.dex */
public interface AbstractC14146p {
    /* renamed from: a */
    AbstractC6895g mo1525a(C14147a aVar);

    /* renamed from: b */
    AbstractC6909u mo1524b(C11137c cVar, boolean z);

    /* renamed from: c */
    Set<String> mo1523c(C11137c cVar);

    /* renamed from: xg.p$a */
    /* loaded from: classes8.dex */
    public static final class C14147a {

        /* renamed from: a */
        private final C11136b f31952a;

        /* renamed from: b */
        private final byte[] f31953b;

        /* renamed from: c */
        private final AbstractC6895g f31954c;

        public C14147a(C11136b classId, byte[] bArr, AbstractC6895g gVar) {
            C9971q.m14633g(classId, "classId");
            this.f31952a = classId;
            this.f31953b = bArr;
            this.f31954c = gVar;
        }

        /* renamed from: a */
        public final C11136b m1522a() {
            return this.f31952a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C14147a)) {
                return false;
            }
            C14147a aVar = (C14147a) obj;
            return C9971q.m14638b(this.f31952a, aVar.f31952a) && C9971q.m14638b(this.f31953b, aVar.f31953b) && C9971q.m14638b(this.f31954c, aVar.f31954c);
        }

        public int hashCode() {
            int hashCode = this.f31952a.hashCode() * 31;
            byte[] bArr = this.f31953b;
            int i = 0;
            int hashCode2 = (hashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            AbstractC6895g gVar = this.f31954c;
            if (gVar != null) {
                i = gVar.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            return "Request(classId=" + this.f31952a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.f31953b) + ", outerClass=" + this.f31954c + ')';
        }

        public /* synthetic */ C14147a(C11136b bVar, byte[] bArr, AbstractC6895g gVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(bVar, (i & 2) != 0 ? null : bArr, (i & 4) != 0 ? null : gVar);
        }
    }
}
