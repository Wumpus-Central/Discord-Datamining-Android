package p268og;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9965m;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KDeclarationContainer;
import kotlin.sequences.Sequence;
import p249nh.C11136b;
import p306qi.C12193m;
import p306qi.C12200o;

/* renamed from: og.x */
/* loaded from: classes8.dex */
public final class C11393x {

    /* renamed from: og.x$a */
    /* loaded from: classes8.dex */
    /* synthetic */ class C11394a extends C9965m implements Function1<C11136b, C11136b> {

        /* renamed from: k */
        public static final C11394a f25313k = new C11394a();

        C11394a() {
            super(1);
        }

        @Override // kotlin.jvm.internal.AbstractC9947e, kotlin.reflect.KCallable
        public final String getName() {
            return "getOuterClassId";
        }

        @Override // kotlin.jvm.internal.AbstractC9947e
        public final KDeclarationContainer getOwner() {
            return C9951f0.m14684b(C11136b.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9947e
        public final String getSignature() {
            return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
        }

        /* renamed from: i */
        public final C11136b invoke(C11136b p0) {
            C9971q.m14633g(p0, "p0");
            return p0.m10811g();
        }
    }

    /* renamed from: og.x$b */
    /* loaded from: classes8.dex */
    static final class C11395b extends AbstractC9973s implements Function1<C11136b, Integer> {

        /* renamed from: k */
        public static final C11395b f25314k = new C11395b();

        C11395b() {
            super(1);
        }

        /* renamed from: a */
        public final Integer invoke(C11136b it) {
            C9971q.m14633g(it, "it");
            return 0;
        }
    }

    /* renamed from: a */
    public static final AbstractC11313e m10149a(AbstractC11327h0 h0Var, C11136b classId) {
        C9971q.m14633g(h0Var, "<this>");
        C9971q.m14633g(classId, "classId");
        AbstractC11326h b = m10148b(h0Var, classId);
        if (b instanceof AbstractC11313e) {
            return (AbstractC11313e) b;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014b  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final p268og.AbstractC11326h m10148b(p268og.AbstractC11327h0 r10, p249nh.C11136b r11) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p268og.C11393x.m10148b(og.h0, nh.b):og.h");
    }

    /* renamed from: c */
    public static final AbstractC11313e m10147c(AbstractC11327h0 h0Var, C11136b classId, C11337k0 notFoundClasses) {
        Sequence h;
        Sequence y;
        List<Integer> E;
        C9971q.m14633g(h0Var, "<this>");
        C9971q.m14633g(classId, "classId");
        C9971q.m14633g(notFoundClasses, "notFoundClasses");
        AbstractC11313e a = m10149a(h0Var, classId);
        if (a != null) {
            return a;
        }
        h = C12193m.m7445h(classId, C11394a.f25313k);
        y = C12200o.m7420y(h, C11395b.f25314k);
        E = C12200o.m7436E(y);
        return notFoundClasses.m10197d(classId, E);
    }

    /* renamed from: d */
    public static final AbstractC11316e1 m10146d(AbstractC11327h0 h0Var, C11136b classId) {
        C9971q.m14633g(h0Var, "<this>");
        C9971q.m14633g(classId, "classId");
        AbstractC11326h b = m10148b(h0Var, classId);
        if (b instanceof AbstractC11316e1) {
            return (AbstractC11316e1) b;
        }
        return null;
    }
}
