package gg;

import fi.AbstractC7267g0;
import fi.AbstractC7268g1;
import fi.AbstractC7304o0;
import fi.C7232c1;
import fi.C7270h0;
import fi.C7296m1;
import fi.C7329u0;
import fi.EnumC7338w1;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9906j;
import kotlin.collections.C9907k;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KType;
import nf.C11088q;
import p107fg.AbstractC7139c;
import p107fg.C7151j;
import p107fg.EnumC7154k;
import p158ig.AbstractC8489n;
import p158ig.C8418e0;
import p158ig.C8430h0;
import p268og.AbstractC11319f1;
import p268og.AbstractC11326h;

@Metadata(m15074d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a6\u0010\t\u001a\u00020\b*\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001H\u0007\u001a.\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¨\u0006\u0010"}, m15073d2 = {"Lfg/c;", "", "Lfg/j;", "arguments", "", "nullable", "", "annotations", "Lkotlin/reflect/KType;", "b", "Lfi/c1;", "attributes", "Lfi/g1;", "typeConstructor", "Lfi/o0;", "a", "kotlin-reflection"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: gg.c */
/* loaded from: classes8.dex */
public final class C7591c {

    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: gg.c$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C7592a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f16538a;

        static {
            int[] iArr = new int[EnumC7154k.values().length];
            try {
                iArr[EnumC7154k.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC7154k.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC7154k.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f16538a = iArr;
        }
    }

    /* renamed from: a */
    private static final AbstractC7304o0 m21951a(C7232c1 c1Var, AbstractC7268g1 g1Var, List<C7151j> list, boolean z) {
        int t;
        AbstractC7267g0 g0Var;
        int i;
        Object obj;
        List<AbstractC11319f1> parameters = g1Var.getParameters();
        C9971q.m14634f(parameters, "typeConstructor.parameters");
        t = C9907k.m14809t(list, 10);
        ArrayList arrayList = new ArrayList(t);
        int i2 = 0;
        for (Object obj2 : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C9906j.m14810s();
            }
            C7151j jVar = (C7151j) obj2;
            C8418e0 e0Var = (C8418e0) jVar.m23335c();
            if (e0Var != null) {
                g0Var = e0Var.m19799o();
            } else {
                g0Var = null;
            }
            EnumC7154k d = jVar.m23334d();
            if (d == null) {
                i = -1;
            } else {
                i = C7592a.f16538a[d.ordinal()];
            }
            if (i == -1) {
                AbstractC11319f1 f1Var = parameters.get(i2);
                C9971q.m14634f(f1Var, "parameters[index]");
                obj = new C7329u0(f1Var);
            } else if (i == 1) {
                EnumC7338w1 w1Var = EnumC7338w1.INVARIANT;
                C9971q.m14636d(g0Var);
                obj = new C7296m1(w1Var, g0Var);
            } else if (i == 2) {
                EnumC7338w1 w1Var2 = EnumC7338w1.IN_VARIANCE;
                C9971q.m14636d(g0Var);
                obj = new C7296m1(w1Var2, g0Var);
            } else if (i == 3) {
                EnumC7338w1 w1Var3 = EnumC7338w1.OUT_VARIANCE;
                C9971q.m14636d(g0Var);
                obj = new C7296m1(w1Var3, g0Var);
            } else {
                throw new C11088q();
            }
            arrayList.add(obj);
            i2 = i3;
        }
        return C7270h0.m23050j(c1Var, g1Var, arrayList, z, null, 16, null);
    }

    /* renamed from: b */
    public static final KType m21950b(AbstractC7139c cVar, List<C7151j> arguments, boolean z, List<? extends Annotation> annotations) {
        AbstractC8489n nVar;
        AbstractC11326h descriptor;
        C7232c1 c1Var;
        C9971q.m14633g(cVar, "<this>");
        C9971q.m14633g(arguments, "arguments");
        C9971q.m14633g(annotations, "annotations");
        if (cVar instanceof AbstractC8489n) {
            nVar = (AbstractC8489n) cVar;
        } else {
            nVar = null;
        }
        if (nVar == null || (descriptor = nVar.getDescriptor()) == null) {
            throw new C8430h0("Cannot create type for an unsupported classifier: " + cVar + " (" + cVar.getClass() + ')');
        }
        AbstractC7268g1 k = descriptor.mo6111k();
        C9971q.m14634f(k, "descriptor.typeConstructor");
        List<AbstractC11319f1> parameters = k.getParameters();
        C9971q.m14634f(parameters, "typeConstructor.parameters");
        if (parameters.size() == arguments.size()) {
            if (annotations.isEmpty()) {
                c1Var = C7232c1.f15671l.m23149h();
            } else {
                c1Var = C7232c1.f15671l.m23149h();
            }
            return new C8418e0(m21951a(c1Var, k, arguments, z), null, 2, null);
        }
        throw new IllegalArgumentException("Class declares " + parameters.size() + " type parameters, but " + arguments.size() + " were provided.");
    }
}
