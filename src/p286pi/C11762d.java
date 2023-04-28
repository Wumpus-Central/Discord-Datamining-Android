package p286pi;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AbstractC9973s;

/* renamed from: pi.d */
/* loaded from: classes8.dex */
public final class C11762d {

    /* renamed from: a */
    private static final Function1<Object, Object> f26257a = C11767f.f26268k;

    /* renamed from: b */
    private static final Function1<Object, Boolean> f26258b = C11764b.f26264k;

    /* renamed from: c */
    private static final Function1<Object, Object> f26259c = C11763a.f26263k;

    /* renamed from: d */
    private static final Function1<Object, Unit> f26260d = C11765c.f26265k;

    /* renamed from: e */
    private static final Function2<Object, Object, Unit> f26261e = C0377d.f26266k;

    /* renamed from: f */
    private static final Function3<Object, Object, Object, Unit> f26262f = C11766e.f26267k;

    /* renamed from: pi.d$a */
    /* loaded from: classes8.dex */
    static final class C11763a extends AbstractC9973s implements Function1 {

        /* renamed from: k */
        public static final C11763a f26263k = new C11763a();

        C11763a() {
            super(1);
        }

        /* renamed from: a */
        public final Void invoke(Object obj) {
            return null;
        }
    }

    /* renamed from: pi.d$b */
    /* loaded from: classes8.dex */
    static final class C11764b extends AbstractC9973s implements Function1<Object, Boolean> {

        /* renamed from: k */
        public static final C11764b f26264k = new C11764b();

        C11764b() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* renamed from: pi.d$c */
    /* loaded from: classes8.dex */
    static final class C11765c extends AbstractC9973s implements Function1<Object, Unit> {

        /* renamed from: k */
        public static final C11765c f26265k = new C11765c();

        C11765c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Object obj) {
        }
    }

    /* renamed from: pi.d$d */
    /* loaded from: classes8.dex */
    static final class C0377d extends AbstractC9973s implements Function2<Object, Object, Unit> {

        /* renamed from: k */
        public static final C0377d f26266k = new C0377d();

        C0377d() {
            super(2);
        }

        /* renamed from: a */
        public final void m8668a(Object obj, Object obj2) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2) {
            m8668a(obj, obj2);
            return Unit.f22042a;
        }
    }

    /* renamed from: pi.d$e */
    /* loaded from: classes8.dex */
    static final class C11766e extends AbstractC9973s implements Function3<Object, Object, Object, Unit> {

        /* renamed from: k */
        public static final C11766e f26267k = new C11766e();

        C11766e() {
            super(3);
        }

        /* renamed from: a */
        public final void m8667a(Object obj, Object obj2, Object obj3) {
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2, Object obj3) {
            m8667a(obj, obj2, obj3);
            return Unit.f22042a;
        }
    }

    /* renamed from: pi.d$f */
    /* loaded from: classes8.dex */
    static final class C11767f extends AbstractC9973s implements Function1<Object, Object> {

        /* renamed from: k */
        public static final C11767f f26268k = new C11767f();

        C11767f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return obj;
        }
    }

    /* renamed from: a */
    public static final <T> Function1<T, Boolean> m8672a() {
        return (Function1<T, Boolean>) f26258b;
    }

    /* renamed from: b */
    public static final Function3<Object, Object, Object, Unit> m8671b() {
        return f26262f;
    }
}
