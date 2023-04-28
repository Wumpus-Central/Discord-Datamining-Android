package p180jg;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9897e;
import kotlin.collections.C9899f;
import kotlin.jvm.internal.C9960j0;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p180jg.AbstractC9579e;

@Metadata(m15074d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u0015*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\b\b\n\u0013\u0007\u0015 !\"B5\b\u0004\u0012\u0006\u0010\f\u001a\u00028\u0000\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\f\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0012\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0004R\u0017\u0010\f\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\b\u0010\u001a\u0082\u0001\u0007#$%&'()¨\u0006*"}, m15073d2 = {"Ljg/f;", "Ljava/lang/reflect/Member;", "M", "Ljg/e;", "", "obj", "", "d", "a", "Ljava/lang/reflect/Member;", "b", "()Ljava/lang/reflect/Member;", "member", "Ljava/lang/reflect/Type;", "Ljava/lang/reflect/Type;", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "Ljava/lang/Class;", "c", "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "instanceClass", "", "Ljava/util/List;", "()Ljava/util/List;", "parameterTypes", "", "valueParameterTypes", "<init>", "(Ljava/lang/reflect/Member;Ljava/lang/reflect/Type;Ljava/lang/Class;[Ljava/lang/reflect/Type;)V", "f", "g", "h", "Ljg/f$a;", "Ljg/f$b;", "Ljg/f$c;", "Ljg/f$e;", "Ljg/f$f;", "Ljg/f$g;", "Ljg/f$h;", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: jg.f */
/* loaded from: classes8.dex */
public abstract class AbstractC9581f<M extends Member> implements AbstractC9579e<M> {

    /* renamed from: e */
    public static final C9585d f21258e = new C9585d(null);

    /* renamed from: a */
    private final M f21259a;

    /* renamed from: b */
    private final Type f21260b;

    /* renamed from: c */
    private final Class<?> f21261c;

    /* renamed from: d */
    private final List<Type> f21262d;

    @Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u00020\u0003B\u001d\u0012\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, m15073d2 = {"Ljg/f$a;", "Ljg/f;", "Ljava/lang/reflect/Constructor;", "Ljg/d;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "f", "Ljava/lang/Object;", "boundReceiver", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: jg.f$a */
    /* loaded from: classes8.dex */
    public static final class C9582a extends AbstractC9581f<Constructor<?>> implements AbstractC9578d {

        /* renamed from: f */
        private final Object f21263f;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C9582a(java.lang.reflect.Constructor<?> r8, java.lang.Object r9) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                kotlin.jvm.internal.C9971q.m14633g(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "constructor.declaringClass"
                kotlin.jvm.internal.C9971q.m14634f(r3, r0)
                r4 = 0
                java.lang.reflect.Type[] r0 = r8.getGenericParameterTypes()
                java.lang.String r1 = "constructor.genericParameterTypes"
                kotlin.jvm.internal.C9971q.m14634f(r0, r1)
                int r1 = r0.length
                r2 = 2
                if (r1 > r2) goto L_0x0020
                r0 = 0
                java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
                goto L_0x0027
            L_0x0020:
                int r1 = r0.length
                r2 = 1
                int r1 = r1 - r2
                java.lang.Object[] r0 = kotlin.collections.C9894b.m15022j(r0, r2, r1)
            L_0x0027:
                r5 = r0
                java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
                r6 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                r7.f21263f = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p180jg.AbstractC9581f.C9582a.<init>(java.lang.reflect.Constructor, java.lang.Object):void");
        }

        @Override // p180jg.AbstractC9579e
        public Object call(Object[] args) {
            C9971q.m14633g(args, "args");
            mo15950c(args);
            C9960j0 j0Var = new C9960j0(3);
            j0Var.m14660a(this.f21263f);
            j0Var.m14659b(args);
            j0Var.m14660a(null);
            return mo15931b().newInstance(j0Var.m14657d(new Object[j0Var.m14658c()]));
        }
    }

    @Metadata(m15074d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0013\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, m15073d2 = {"Ljg/f$b;", "Ljg/f;", "Ljava/lang/reflect/Constructor;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;)V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: jg.f$b */
    /* loaded from: classes8.dex */
    public static final class C9583b extends AbstractC9581f<Constructor<?>> {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C9583b(java.lang.reflect.Constructor<?> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                kotlin.jvm.internal.C9971q.m14633g(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "constructor.declaringClass"
                kotlin.jvm.internal.C9971q.m14634f(r3, r0)
                r4 = 0
                java.lang.reflect.Type[] r0 = r8.getGenericParameterTypes()
                java.lang.String r1 = "constructor.genericParameterTypes"
                kotlin.jvm.internal.C9971q.m14634f(r0, r1)
                int r1 = r0.length
                r2 = 0
                r5 = 1
                if (r1 > r5) goto L_0x0020
                java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r2]
                goto L_0x0026
            L_0x0020:
                int r1 = r0.length
                int r1 = r1 - r5
                java.lang.Object[] r0 = kotlin.collections.C9894b.m15022j(r0, r2, r1)
            L_0x0026:
                r5 = r0
                java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
                r6 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p180jg.AbstractC9581f.C9583b.<init>(java.lang.reflect.Constructor):void");
        }

        @Override // p180jg.AbstractC9579e
        public Object call(Object[] args) {
            C9971q.m14633g(args, "args");
            mo15950c(args);
            C9960j0 j0Var = new C9960j0(2);
            j0Var.m14659b(args);
            j0Var.m14660a(null);
            return mo15931b().newInstance(j0Var.m14657d(new Object[j0Var.m14658c()]));
        }
    }

    @Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\u0018\u00002\u00020\u00012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002B\u001d\u0012\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, m15073d2 = {"Ljg/f$c;", "Ljg/d;", "Ljg/f;", "Ljava/lang/reflect/Constructor;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "f", "Ljava/lang/Object;", "boundReceiver", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: jg.f$c */
    /* loaded from: classes8.dex */
    public static final class C9584c extends AbstractC9581f<Constructor<?>> implements AbstractC9578d {

        /* renamed from: f */
        private final Object f21264f;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C9584c(java.lang.reflect.Constructor<?> r8, java.lang.Object r9) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                kotlin.jvm.internal.C9971q.m14633g(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "constructor.declaringClass"
                kotlin.jvm.internal.C9971q.m14634f(r3, r0)
                r4 = 0
                java.lang.reflect.Type[] r5 = r8.getGenericParameterTypes()
                java.lang.String r0 = "constructor.genericParameterTypes"
                kotlin.jvm.internal.C9971q.m14634f(r5, r0)
                r6 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                r7.f21264f = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p180jg.AbstractC9581f.C9584c.<init>(java.lang.reflect.Constructor, java.lang.Object):void");
        }

        @Override // p180jg.AbstractC9579e
        public Object call(Object[] args) {
            C9971q.m14633g(args, "args");
            mo15950c(args);
            C9960j0 j0Var = new C9960j0(2);
            j0Var.m14660a(this.f21264f);
            j0Var.m14659b(args);
            return mo15931b().newInstance(j0Var.m14657d(new Object[j0Var.m14658c()]));
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ*\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0001\u0010\u0002\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0003H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0001\u0010\u0002\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0003H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0005J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0001\u0010\u0002\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0003H\u0086\b¢\u0006\u0004\b\u0007\u0010\u0005¨\u0006\n"}, m15073d2 = {"Ljg/f$d;", "", "T", "", "dropFirst", "([Ljava/lang/Object;)[Ljava/lang/Object;", "dropFirstAndLast", "dropLast", "<init>", "()V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: jg.f$d */
    /* loaded from: classes8.dex */
    public static final class C9585d {
        private C9585d() {
        }

        public /* synthetic */ C9585d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m15074d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0013\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, m15073d2 = {"Ljg/f$e;", "Ljg/f;", "Ljava/lang/reflect/Constructor;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;)V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: jg.f$e */
    /* loaded from: classes8.dex */
    public static final class C9586e extends AbstractC9581f<Constructor<?>> {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C9586e(java.lang.reflect.Constructor<?> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                kotlin.jvm.internal.C9971q.m14633g(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "constructor.declaringClass"
                kotlin.jvm.internal.C9971q.m14634f(r3, r0)
                java.lang.Class r0 = r8.getDeclaringClass()
                java.lang.Class r1 = r0.getDeclaringClass()
                if (r1 == 0) goto L_0x0024
                int r0 = r0.getModifiers()
                boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
                if (r0 != 0) goto L_0x0024
                r4 = r1
                goto L_0x0026
            L_0x0024:
                r0 = 0
                r4 = r0
            L_0x0026:
                java.lang.reflect.Type[] r5 = r8.getGenericParameterTypes()
                java.lang.String r0 = "constructor.genericParameterTypes"
                kotlin.jvm.internal.C9971q.m14634f(r5, r0)
                r6 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p180jg.AbstractC9581f.C9586e.<init>(java.lang.reflect.Constructor):void");
        }

        @Override // p180jg.AbstractC9579e
        public Object call(Object[] args) {
            C9971q.m14633g(args, "args");
            mo15950c(args);
            return mo15931b().newInstance(Arrays.copyOf(args, args.length));
        }
    }

    @Metadata(m15074d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\r\u000e\u000f\u0010\u0011B\u0019\b\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0005\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, m15073d2 = {"Ljg/f$f;", "Ljg/f;", "Ljava/lang/reflect/Field;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "field", "", "requiresInstance", "<init>", "(Ljava/lang/reflect/Field;Z)V", "a", "b", "c", "d", "e", "Ljg/f$f$a;", "Ljg/f$f$b;", "Ljg/f$f$c;", "Ljg/f$f$d;", "Ljg/f$f$e;", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: jg.f$f */
    /* loaded from: classes8.dex */
    public static abstract class AbstractC0290f extends AbstractC9581f<Field> {

        @Metadata(m15074d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, m15073d2 = {"Ljg/f$f$a;", "Ljg/d;", "Ljg/f$f;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "f", "Ljava/lang/Object;", "boundReceiver", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;Ljava/lang/Object;)V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
        /* renamed from: jg.f$f$a */
        /* loaded from: classes8.dex */
        public static final class a extends AbstractC0290f implements AbstractC9578d {

            /* renamed from: f */
            private final Object f21265f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Field field, Object obj) {
                super(field, false, null);
                C9971q.m14633g(field, "field");
                this.f21265f = obj;
            }

            @Override // p180jg.AbstractC9581f.AbstractC0290f, p180jg.AbstractC9579e
            public Object call(Object[] args) {
                C9971q.m14633g(args, "args");
                mo15950c(args);
                return mo15931b().get(this.f21265f);
            }
        }

        @Metadata(m15074d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m15073d2 = {"Ljg/f$f$b;", "Ljg/d;", "Ljg/f$f;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
        /* renamed from: jg.f$f$b */
        /* loaded from: classes8.dex */
        public static final class b extends AbstractC0290f implements AbstractC9578d {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Field field) {
                super(field, false, null);
                C9971q.m14633g(field, "field");
            }
        }

        @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m15073d2 = {"Ljg/f$f$c;", "Ljg/f$f;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
        /* renamed from: jg.f$f$c */
        /* loaded from: classes8.dex */
        public static final class c extends AbstractC0290f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Field field) {
                super(field, true, null);
                C9971q.m14633g(field, "field");
            }
        }

        @Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m15073d2 = {"Ljg/f$f$d;", "Ljg/f$f;", "", "args", "", "c", "([Ljava/lang/Object;)V", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
        /* renamed from: jg.f$f$d */
        /* loaded from: classes8.dex */
        public static final class d extends AbstractC0290f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Field field) {
                super(field, true, null);
                C9971q.m14633g(field, "field");
            }

            @Override // p180jg.AbstractC9581f
            /* renamed from: c */
            public void mo15950c(Object[] args) {
                Object E;
                C9971q.m14633g(args, "args");
                AbstractC9581f.super.mo15950c(args);
                E = C9899f.m14964E(args);
                m15952d(E);
            }
        }

        @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m15073d2 = {"Ljg/f$f$e;", "Ljg/f$f;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
        /* renamed from: jg.f$f$e */
        /* loaded from: classes8.dex */
        public static final class e extends AbstractC0290f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Field field) {
                super(field, false, null);
                C9971q.m14633g(field, "field");
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private AbstractC0290f(java.lang.reflect.Field r7, boolean r8) {
            /*
                r6 = this;
                java.lang.reflect.Type r2 = r7.getGenericType()
                java.lang.String r0 = "field.genericType"
                kotlin.jvm.internal.C9971q.m14634f(r2, r0)
                if (r8 == 0) goto L_0x0010
                java.lang.Class r8 = r7.getDeclaringClass()
                goto L_0x0011
            L_0x0010:
                r8 = 0
            L_0x0011:
                r3 = r8
                r8 = 0
                java.lang.reflect.Type[] r4 = new java.lang.reflect.Type[r8]
                r5 = 0
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p180jg.AbstractC9581f.AbstractC0290f.<init>(java.lang.reflect.Field, boolean):void");
        }

        public /* synthetic */ AbstractC0290f(Field field, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(field, z);
        }

        @Override // p180jg.AbstractC9579e
        public Object call(Object[] args) {
            Object obj;
            C9971q.m14633g(args, "args");
            mo15950c(args);
            Field b2 = mo15931b();
            if (m15951e() != null) {
                obj = C9899f.m14966D(args);
            } else {
                obj = null;
            }
            return b2.get(obj);
        }
    }

    @Metadata(m15074d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0013\u0014\u0006\u0015\u0016B!\b\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0082\u0001\u0005\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, m15073d2 = {"Ljg/f$g;", "Ljg/f;", "Ljava/lang/reflect/Field;", "", "args", "", "c", "([Ljava/lang/Object;)V", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "", "f", "Z", "notNull", "field", "requiresInstance", "<init>", "(Ljava/lang/reflect/Field;ZZ)V", "a", "b", "d", "e", "Ljg/f$g$a;", "Ljg/f$g$b;", "Ljg/f$g$c;", "Ljg/f$g$d;", "Ljg/f$g$e;", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: jg.f$g */
    /* loaded from: classes8.dex */
    public static abstract class AbstractC9587g extends AbstractC9581f<Field> {

        /* renamed from: f */
        private final boolean f21266f;

        @Metadata(m15074d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u0011"}, m15073d2 = {"Ljg/f$g$a;", "Ljg/d;", "Ljg/f$g;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "g", "Ljava/lang/Object;", "boundReceiver", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;ZLjava/lang/Object;)V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
        /* renamed from: jg.f$g$a */
        /* loaded from: classes8.dex */
        public static final class C9588a extends AbstractC9587g implements AbstractC9578d {

            /* renamed from: g */
            private final Object f21267g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9588a(Field field, boolean z, Object obj) {
                super(field, z, false, null);
                C9971q.m14633g(field, "field");
                this.f21267g = obj;
            }

            @Override // p180jg.AbstractC9581f.AbstractC9587g, p180jg.AbstractC9579e
            public Object call(Object[] args) {
                Object D;
                C9971q.m14633g(args, "args");
                mo15950c(args);
                Object obj = this.f21267g;
                D = C9899f.m14966D(args);
                mo15931b().set(obj, D);
                return Unit.f22042a;
            }
        }

        @Metadata(m15074d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, m15073d2 = {"Ljg/f$g$b;", "Ljg/d;", "Ljg/f$g;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
        /* renamed from: jg.f$g$b */
        /* loaded from: classes8.dex */
        public static final class C9589b extends AbstractC9587g implements AbstractC9578d {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9589b(Field field, boolean z) {
                super(field, z, false, null);
                C9971q.m14633g(field, "field");
            }

            @Override // p180jg.AbstractC9581f.AbstractC9587g, p180jg.AbstractC9579e
            public Object call(Object[] args) {
                Object d0;
                C9971q.m14633g(args, "args");
                mo15950c(args);
                d0 = C9899f.m14933d0(args);
                mo15931b().set(null, d0);
                return Unit.f22042a;
            }
        }

        @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m15073d2 = {"Ljg/f$g$c;", "Ljg/f$g;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
        /* renamed from: jg.f$g$c */
        /* loaded from: classes8.dex */
        public static final class C9590c extends AbstractC9587g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9590c(Field field, boolean z) {
                super(field, z, true, null);
                C9971q.m14633g(field, "field");
            }
        }

        @Metadata(m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\r"}, m15073d2 = {"Ljg/f$g$d;", "Ljg/f$g;", "", "args", "", "c", "([Ljava/lang/Object;)V", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
        /* renamed from: jg.f$g$d */
        /* loaded from: classes8.dex */
        public static final class C9591d extends AbstractC9587g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9591d(Field field, boolean z) {
                super(field, z, true, null);
                C9971q.m14633g(field, "field");
            }

            @Override // p180jg.AbstractC9581f.AbstractC9587g, p180jg.AbstractC9581f
            /* renamed from: c */
            public void mo15950c(Object[] args) {
                Object E;
                C9971q.m14633g(args, "args");
                super.mo15950c(args);
                E = C9899f.m14964E(args);
                m15952d(E);
            }
        }

        @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m15073d2 = {"Ljg/f$g$e;", "Ljg/f$g;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
        /* renamed from: jg.f$g$e */
        /* loaded from: classes8.dex */
        public static final class C9592e extends AbstractC9587g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9592e(Field field, boolean z) {
                super(field, z, false, null);
                C9971q.m14633g(field, "field");
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private AbstractC9587g(java.lang.reflect.Field r7, boolean r8, boolean r9) {
            /*
                r6 = this;
                java.lang.Class r2 = java.lang.Void.TYPE
                java.lang.String r0 = "TYPE"
                kotlin.jvm.internal.C9971q.m14634f(r2, r0)
                if (r9 == 0) goto L_0x000e
                java.lang.Class r9 = r7.getDeclaringClass()
                goto L_0x000f
            L_0x000e:
                r9 = 0
            L_0x000f:
                r3 = r9
                r9 = 1
                java.lang.reflect.Type[] r4 = new java.lang.reflect.Type[r9]
                java.lang.reflect.Type r9 = r7.getGenericType()
                java.lang.String r0 = "field.genericType"
                kotlin.jvm.internal.C9971q.m14634f(r9, r0)
                r0 = 0
                r4[r0] = r9
                r5 = 0
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                r6.f21266f = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p180jg.AbstractC9581f.AbstractC9587g.<init>(java.lang.reflect.Field, boolean, boolean):void");
        }

        public /* synthetic */ AbstractC9587g(Field field, boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
            this(field, z, z2);
        }

        @Override // p180jg.AbstractC9581f
        /* renamed from: c */
        public void mo15950c(Object[] args) {
            Object d0;
            C9971q.m14633g(args, "args");
            AbstractC9581f.super.mo15950c(args);
            if (this.f21266f) {
                d0 = C9899f.m14933d0(args);
                if (d0 == null) {
                    throw new IllegalArgumentException("null is not allowed as a value for this property.");
                }
            }
        }

        @Override // p180jg.AbstractC9579e
        public Object call(Object[] args) {
            Object obj;
            Object d0;
            C9971q.m14633g(args, "args");
            mo15950c(args);
            Field b = mo15931b();
            if (m15951e() != null) {
                obj = C9899f.m14966D(args);
            } else {
                obj = null;
            }
            d0 = C9899f.m14933d0(args);
            b.set(obj, d0);
            return Unit.f22042a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0025, code lost:
        if (r1 == null) goto L_0x0027;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private AbstractC9581f(M r1, java.lang.reflect.Type r2, java.lang.Class<?> r3, java.lang.reflect.Type[] r4) {
        /*
            r0 = this;
            r0.<init>()
            r0.f21259a = r1
            r0.f21260b = r2
            r0.f21261c = r3
            if (r3 == 0) goto L_0x0027
            kotlin.jvm.internal.j0 r1 = new kotlin.jvm.internal.j0
            r2 = 2
            r1.<init>(r2)
            r1.m14660a(r3)
            r1.m14659b(r4)
            int r2 = r1.m14658c()
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
            java.lang.Object[] r1 = r1.m14657d(r2)
            java.util.List r1 = kotlin.collections.C9904h.m14856l(r1)
            if (r1 != 0) goto L_0x002b
        L_0x0027:
            java.util.List r1 = kotlin.collections.C9894b.m15002u0(r4)
        L_0x002b:
            r0.f21262d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p180jg.AbstractC9581f.<init>(java.lang.reflect.Member, java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type[]):void");
    }

    public /* synthetic */ AbstractC9581f(Member member, Type type, Class cls, Type[] typeArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(member, type, cls, typeArr);
    }

    @Override // p180jg.AbstractC9579e
    /* renamed from: a */
    public List<Type> mo15932a() {
        return this.f21262d;
    }

    @Override // p180jg.AbstractC9579e
    /* renamed from: b */
    public final M mo15931b() {
        return this.f21259a;
    }

    /* renamed from: c */
    public void mo15950c(Object[] objArr) {
        AbstractC9579e.C9580a.m15953a(this, objArr);
    }

    /* renamed from: d */
    protected final void m15952d(Object obj) {
        if (obj == null || !this.f21259a.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    /* renamed from: e */
    public final Class<?> m15951e() {
        return this.f21261c;
    }

    @Override // p180jg.AbstractC9579e
    public final Type getReturnType() {
        return this.f21260b;
    }

    @Metadata(m15074d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\u0012\u0013\u0014\u0015\u0016\u0007B+\b\u0004\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\n\u0082\u0001\u0006\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, m15073d2 = {"Ljg/f$h;", "Ljg/f;", "Ljava/lang/reflect/Method;", "", "instance", "", "args", "f", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "", "Z", "isVoidMethod", "method", "requiresInstance", "Ljava/lang/reflect/Type;", "parameterTypes", "<init>", "(Ljava/lang/reflect/Method;Z[Ljava/lang/reflect/Type;)V", "a", "b", "c", "d", "e", "Ljg/f$h$a;", "Ljg/f$h$b;", "Ljg/f$h$c;", "Ljg/f$h$d;", "Ljg/f$h$e;", "Ljg/f$h$f;", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: jg.f$h */
    /* loaded from: classes8.dex */
    public static abstract class AbstractC9593h extends AbstractC9581f<Method> {

        /* renamed from: f */
        private final boolean f21268f;

        @Metadata(m15074d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, m15073d2 = {"Ljg/f$h$a;", "Ljg/d;", "Ljg/f$h;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "g", "Ljava/lang/Object;", "boundReceiver", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
        /* renamed from: jg.f$h$a */
        /* loaded from: classes8.dex */
        public static final class C9594a extends AbstractC9593h implements AbstractC9578d {

            /* renamed from: g */
            private final Object f21269g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9594a(Method method, Object obj) {
                super(method, false, null, 4, null);
                C9971q.m14633g(method, "method");
                this.f21269g = obj;
            }

            @Override // p180jg.AbstractC9579e
            public Object call(Object[] args) {
                C9971q.m14633g(args, "args");
                mo15950c(args);
                return m15949f(this.f21269g, args);
            }
        }

        @Metadata(m15074d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\f"}, m15073d2 = {"Ljg/f$h$b;", "Ljg/d;", "Ljg/f$h;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
        /* renamed from: jg.f$h$b */
        /* loaded from: classes8.dex */
        public static final class C9595b extends AbstractC9593h implements AbstractC9578d {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9595b(Method method) {
                super(method, false, null, 4, null);
                C9971q.m14633g(method, "method");
            }

            @Override // p180jg.AbstractC9579e
            public Object call(Object[] args) {
                C9971q.m14633g(args, "args");
                mo15950c(args);
                return m15949f(null, args);
            }
        }

        @Metadata(m15074d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, m15073d2 = {"Ljg/f$h$c;", "Ljg/d;", "Ljg/f$h;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "g", "Ljava/lang/Object;", "boundReceiver", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
        /* renamed from: jg.f$h$c */
        /* loaded from: classes8.dex */
        public static final class C9596c extends AbstractC9593h implements AbstractC9578d {

            /* renamed from: g */
            private final Object f21270g;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public C9596c(java.lang.reflect.Method r5, java.lang.Object r6) {
                /*
                    r4 = this;
                    java.lang.String r0 = "method"
                    kotlin.jvm.internal.C9971q.m14633g(r5, r0)
                    java.lang.reflect.Type[] r0 = r5.getGenericParameterTypes()
                    java.lang.String r1 = "method.genericParameterTypes"
                    kotlin.jvm.internal.C9971q.m14634f(r0, r1)
                    int r1 = r0.length
                    r2 = 0
                    r3 = 1
                    if (r1 > r3) goto L_0x0016
                    java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r2]
                    goto L_0x001b
                L_0x0016:
                    int r1 = r0.length
                    java.lang.Object[] r0 = kotlin.collections.C9894b.m15022j(r0, r3, r1)
                L_0x001b:
                    java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
                    r1 = 0
                    r4.<init>(r5, r2, r0, r1)
                    r4.f21270g = r6
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p180jg.AbstractC9581f.AbstractC9593h.C9596c.<init>(java.lang.reflect.Method, java.lang.Object):void");
            }

            @Override // p180jg.AbstractC9579e
            public Object call(Object[] args) {
                C9971q.m14633g(args, "args");
                mo15950c(args);
                C9960j0 j0Var = new C9960j0(2);
                j0Var.m14660a(this.f21270g);
                j0Var.m14659b(args);
                return m15949f(null, j0Var.m14657d(new Object[j0Var.m14658c()]));
            }
        }

        @Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m15073d2 = {"Ljg/f$h$d;", "Ljg/f$h;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
        /* renamed from: jg.f$h$d */
        /* loaded from: classes8.dex */
        public static final class C9597d extends AbstractC9593h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9597d(Method method) {
                super(method, false, null, 6, null);
                C9971q.m14633g(method, "method");
            }

            @Override // p180jg.AbstractC9579e
            public Object call(Object[] args) {
                Object[] objArr;
                C9971q.m14633g(args, "args");
                mo15950c(args);
                Object obj = args[0];
                if (args.length <= 1) {
                    objArr = new Object[0];
                } else {
                    objArr = C9897e.m14985j(args, 1, args.length);
                }
                return m15949f(obj, objArr);
            }
        }

        @Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m15073d2 = {"Ljg/f$h$e;", "Ljg/f$h;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
        /* renamed from: jg.f$h$e */
        /* loaded from: classes8.dex */
        public static final class C9598e extends AbstractC9593h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9598e(Method method) {
                super(method, true, null, 4, null);
                C9971q.m14633g(method, "method");
            }

            @Override // p180jg.AbstractC9579e
            public Object call(Object[] args) {
                Object E;
                Object[] objArr;
                C9971q.m14633g(args, "args");
                mo15950c(args);
                E = C9899f.m14964E(args);
                m15952d(E);
                if (args.length <= 1) {
                    objArr = new Object[0];
                } else {
                    objArr = C9897e.m14985j(args, 1, args.length);
                }
                return m15949f(null, objArr);
            }
        }

        @Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m15073d2 = {"Ljg/f$h$f;", "Ljg/f$h;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
        /* renamed from: jg.f$h$f */
        /* loaded from: classes8.dex */
        public static final class C0291f extends AbstractC9593h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0291f(Method method) {
                super(method, false, null, 6, null);
                C9971q.m14633g(method, "method");
            }

            @Override // p180jg.AbstractC9579e
            public Object call(Object[] args) {
                C9971q.m14633g(args, "args");
                mo15950c(args);
                return m15949f(null, args);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public /* synthetic */ AbstractC9593h(java.lang.reflect.Method r1, boolean r2, java.lang.reflect.Type[] r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
            /*
                r0 = this;
                r5 = r4 & 2
                if (r5 == 0) goto L_0x000e
                int r2 = r1.getModifiers()
                boolean r2 = java.lang.reflect.Modifier.isStatic(r2)
                r2 = r2 ^ 1
            L_0x000e:
                r4 = r4 & 4
                if (r4 == 0) goto L_0x001b
                java.lang.reflect.Type[] r3 = r1.getGenericParameterTypes()
                java.lang.String r4 = "method.genericParameterTypes"
                kotlin.jvm.internal.C9971q.m14634f(r3, r4)
            L_0x001b:
                r4 = 0
                r0.<init>(r1, r2, r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p180jg.AbstractC9581f.AbstractC9593h.<init>(java.lang.reflect.Method, boolean, java.lang.reflect.Type[], int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public /* synthetic */ AbstractC9593h(Method method, boolean z, Type[] typeArr, DefaultConstructorMarker defaultConstructorMarker) {
            this(method, z, typeArr);
        }

        /* renamed from: f */
        protected final Object m15949f(Object obj, Object[] args) {
            C9971q.m14633g(args, "args");
            Object invoke = mo15931b().invoke(obj, Arrays.copyOf(args, args.length));
            if (this.f21268f) {
                return Unit.f22042a;
            }
            return invoke;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private AbstractC9593h(java.lang.reflect.Method r7, boolean r8, java.lang.reflect.Type[] r9) {
            /*
                r6 = this;
                java.lang.reflect.Type r2 = r7.getGenericReturnType()
                java.lang.String r0 = "method.genericReturnType"
                kotlin.jvm.internal.C9971q.m14634f(r2, r0)
                if (r8 == 0) goto L_0x0010
                java.lang.Class r8 = r7.getDeclaringClass()
                goto L_0x0011
            L_0x0010:
                r8 = 0
            L_0x0011:
                r3 = r8
                r5 = 0
                r0 = r6
                r1 = r7
                r4 = r9
                r0.<init>(r1, r2, r3, r4, r5)
                java.lang.reflect.Type r7 = r6.getReturnType()
                java.lang.Class r8 = java.lang.Void.TYPE
                boolean r7 = kotlin.jvm.internal.C9971q.m14638b(r7, r8)
                r6.f21268f = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p180jg.AbstractC9581f.AbstractC9593h.<init>(java.lang.reflect.Method, boolean, java.lang.reflect.Type[]):void");
        }
    }
}
