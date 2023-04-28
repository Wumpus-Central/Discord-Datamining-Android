package gh;

import bi.AbstractC3601u;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p086eh.AbstractC6895g;
import p249nh.C11136b;

/* renamed from: gh.p */
/* loaded from: classes8.dex */
public interface AbstractC7633p extends AbstractC3601u {

    /* renamed from: gh.p$a */
    /* loaded from: classes8.dex */
    public static abstract class AbstractC7634a {

        /* renamed from: gh.p$a$a */
        /* loaded from: classes8.dex */
        public static final class C0241a extends AbstractC7634a {

            /* renamed from: a */
            private final byte[] f16644a;

            /* renamed from: b */
            public final byte[] m21821b() {
                return this.f16644a;
            }
        }

        /* renamed from: gh.p$a$b */
        /* loaded from: classes8.dex */
        public static final class C7635b extends AbstractC7634a {

            /* renamed from: a */
            private final AbstractC7637r f16645a;

            /* renamed from: b */
            private final byte[] f16646b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7635b(AbstractC7637r kotlinJvmBinaryClass, byte[] bArr) {
                super(null);
                C9971q.m14633g(kotlinJvmBinaryClass, "kotlinJvmBinaryClass");
                this.f16645a = kotlinJvmBinaryClass;
                this.f16646b = bArr;
            }

            /* renamed from: b */
            public final AbstractC7637r m21820b() {
                return this.f16645a;
            }

            public /* synthetic */ C7635b(AbstractC7637r rVar, byte[] bArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(rVar, (i & 2) != 0 ? null : bArr);
            }
        }

        private AbstractC7634a() {
        }

        public /* synthetic */ AbstractC7634a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final AbstractC7637r m21822a() {
            C7635b bVar = this instanceof C7635b ? (C7635b) this : null;
            if (bVar != null) {
                return bVar.m21820b();
            }
            return null;
        }
    }

    /* renamed from: b */
    AbstractC7634a mo4625b(C11136b bVar);

    /* renamed from: c */
    AbstractC7634a mo4624c(AbstractC6895g gVar);
}
