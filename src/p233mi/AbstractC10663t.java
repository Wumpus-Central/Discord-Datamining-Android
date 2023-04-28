package p233mi;

import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p233mi.AbstractC10628f;
import p268og.AbstractC11397y;

/* renamed from: mi.t */
/* loaded from: classes8.dex */
public abstract class AbstractC10663t implements AbstractC10628f {

    /* renamed from: a */
    private final String f23589a;

    /* renamed from: mi.t$a */
    /* loaded from: classes8.dex */
    public static final class C10664a extends AbstractC10663t {

        /* renamed from: b */
        private final int f23590b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C10664a(int r3) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "must have at least "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r1 = " value parameter"
                r0.append(r1)
                r1 = 1
                if (r3 <= r1) goto L_0x0018
                java.lang.String r1 = "s"
                goto L_0x001a
            L_0x0018:
                java.lang.String r1 = ""
            L_0x001a:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 0
                r2.<init>(r0, r1)
                r2.f23590b = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p233mi.AbstractC10663t.C10664a.<init>(int):void");
        }

        @Override // p233mi.AbstractC10628f
        /* renamed from: a */
        public boolean mo12674a(AbstractC11397y functionDescriptor) {
            C9971q.m14633g(functionDescriptor, "functionDescriptor");
            if (functionDescriptor.mo6242i().size() >= this.f23590b) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: mi.t$b */
    /* loaded from: classes8.dex */
    public static final class C10665b extends AbstractC10663t {

        /* renamed from: b */
        private final int f23591b;

        public C10665b(int i) {
            super("must have exactly " + i + " value parameters", null);
            this.f23591b = i;
        }

        @Override // p233mi.AbstractC10628f
        /* renamed from: a */
        public boolean mo12674a(AbstractC11397y functionDescriptor) {
            C9971q.m14633g(functionDescriptor, "functionDescriptor");
            if (functionDescriptor.mo6242i().size() == this.f23591b) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: mi.t$c */
    /* loaded from: classes8.dex */
    public static final class C10666c extends AbstractC10663t {

        /* renamed from: b */
        public static final C10666c f23592b = new C10666c();

        private C10666c() {
            super("must have no value parameters", null);
        }

        @Override // p233mi.AbstractC10628f
        /* renamed from: a */
        public boolean mo12674a(AbstractC11397y functionDescriptor) {
            C9971q.m14633g(functionDescriptor, "functionDescriptor");
            return functionDescriptor.mo6242i().isEmpty();
        }
    }

    /* renamed from: mi.t$d */
    /* loaded from: classes8.dex */
    public static final class C10667d extends AbstractC10663t {

        /* renamed from: b */
        public static final C10667d f23593b = new C10667d();

        private C10667d() {
            super("must have a single value parameter", null);
        }

        @Override // p233mi.AbstractC10628f
        /* renamed from: a */
        public boolean mo12674a(AbstractC11397y functionDescriptor) {
            C9971q.m14633g(functionDescriptor, "functionDescriptor");
            if (functionDescriptor.mo6242i().size() == 1) {
                return true;
            }
            return false;
        }
    }

    private AbstractC10663t(String str) {
        this.f23589a = str;
    }

    public /* synthetic */ AbstractC10663t(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // p233mi.AbstractC10628f
    /* renamed from: b */
    public String mo12675b(AbstractC11397y yVar) {
        return AbstractC10628f.C10629a.m12707a(this, yVar);
    }

    @Override // p233mi.AbstractC10628f
    public String getDescription() {
        return this.f23589a;
    }
}
