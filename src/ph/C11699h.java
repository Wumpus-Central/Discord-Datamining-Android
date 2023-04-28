package ph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ph.AbstractC11724q;
import ph.C11699h.AbstractC11701b;
import ph.C11710j;
import ph.C11714l;
import ph.C11747z;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ph.h */
/* loaded from: classes8.dex */
public final class C11699h<FieldDescriptorType extends AbstractC11701b<FieldDescriptorType>> {

    /* renamed from: d */
    private static final C11699h f26137d = new C11699h(true);

    /* renamed from: b */
    private boolean f26139b;

    /* renamed from: c */
    private boolean f26140c = false;

    /* renamed from: a */
    private final C11735v<FieldDescriptorType, Object> f26138a = C11735v.m8728o(16);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ph.h$a */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C11700a {

        /* renamed from: a */
        static final /* synthetic */ int[] f26141a;

        /* renamed from: b */
        static final /* synthetic */ int[] f26142b;

        static {
            int[] iArr = new int[C11747z.EnumC11749b.values().length];
            f26142b = iArr;
            try {
                iArr[C11747z.EnumC11749b.f26227m.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26142b[C11747z.EnumC11749b.f26228n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26142b[C11747z.EnumC11749b.f26229o.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26142b[C11747z.EnumC11749b.f26230p.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26142b[C11747z.EnumC11749b.f26231q.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26142b[C11747z.EnumC11749b.f26232r.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f26142b[C11747z.EnumC11749b.f26233s.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f26142b[C11747z.EnumC11749b.f26234t.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f26142b[C11747z.EnumC11749b.f26235u.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f26142b[C11747z.EnumC11749b.f26238x.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f26142b[C11747z.EnumC11749b.f26239y.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f26142b[C11747z.EnumC11749b.f39114A.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f26142b[C11747z.EnumC11749b.f39115B.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f26142b[C11747z.EnumC11749b.f39116C.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f26142b[C11747z.EnumC11749b.f39117D.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f26142b[C11747z.EnumC11749b.f26236v.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f26142b[C11747z.EnumC11749b.f26237w.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f26142b[C11747z.EnumC11749b.f26240z.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[C11747z.EnumC11753c.values().length];
            f26141a = iArr2;
            try {
                iArr2[C11747z.EnumC11753c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f26141a[C11747z.EnumC11753c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f26141a[C11747z.EnumC11753c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f26141a[C11747z.EnumC11753c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f26141a[C11747z.EnumC11753c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f26141a[C11747z.EnumC11753c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f26141a[C11747z.EnumC11753c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f26141a[C11747z.EnumC11753c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f26141a[C11747z.EnumC11753c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* renamed from: ph.h$b */
    /* loaded from: classes8.dex */
    public interface AbstractC11701b<T extends AbstractC11701b<T>> extends Comparable<T> {
        /* renamed from: A */
        C11747z.EnumC11749b mo8826A();

        /* renamed from: H */
        AbstractC11724q.AbstractC11725a mo8825H(AbstractC11724q.AbstractC11725a aVar, AbstractC11724q qVar);

        /* renamed from: O */
        C11747z.EnumC11753c mo8824O();

        /* renamed from: P */
        boolean mo8823P();

        int getNumber();

        /* renamed from: w */
        boolean mo8820w();
    }

    private C11699h() {
    }

    /* renamed from: c */
    private Object m8876c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: d */
    private static int m8875d(C11747z.EnumC11749b bVar, int i, Object obj) {
        int D = C11695f.m8957D(i);
        if (bVar == C11747z.EnumC11749b.f26236v) {
            D *= 2;
        }
        return D + m8874e(bVar, obj);
    }

    /* renamed from: e */
    private static int m8874e(C11747z.EnumC11749b bVar, Object obj) {
        switch (C11700a.f26142b[bVar.ordinal()]) {
            case 1:
                return C11695f.m8922g(((Double) obj).doubleValue());
            case 2:
                return C11695f.m8910m(((Float) obj).floatValue());
            case 3:
                return C11695f.m8902q(((Long) obj).longValue());
            case 4:
                return C11695f.m8955F(((Long) obj).longValue());
            case 5:
                return C11695f.m8904p(((Integer) obj).intValue());
            case 6:
                return C11695f.m8914k(((Long) obj).longValue());
            case 7:
                return C11695f.m8916j(((Integer) obj).intValue());
            case 8:
                return C11695f.m8932b(((Boolean) obj).booleanValue());
            case 9:
                return C11695f.m8958C((String) obj);
            case 10:
                if (obj instanceof AbstractC11691d) {
                    return C11695f.m8926e((AbstractC11691d) obj);
                }
                return C11695f.m8930c((byte[]) obj);
            case 11:
                return C11695f.m8956E(((Integer) obj).intValue());
            case 12:
                return C11695f.m8888x(((Integer) obj).intValue());
            case 13:
                return C11695f.m8886y(((Long) obj).longValue());
            case 14:
                return C11695f.m8884z(((Integer) obj).intValue());
            case 15:
                return C11695f.m8959B(((Long) obj).longValue());
            case 16:
                return C11695f.m8908n((AbstractC11724q) obj);
            case 17:
                if (obj instanceof C11714l) {
                    return C11695f.m8900r((C11714l) obj);
                }
                return C11695f.m8896t((AbstractC11724q) obj);
            case 18:
                if (obj instanceof C11710j.AbstractC11711a) {
                    return C11695f.m8918i(((C11710j.AbstractC11711a) obj).getNumber());
                }
                return C11695f.m8918i(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: f */
    public static int m8873f(AbstractC11701b<?> bVar, Object obj) {
        C11747z.EnumC11749b A = bVar.mo8826A();
        int number = bVar.getNumber();
        if (!bVar.mo8820w()) {
            return m8875d(A, number, obj);
        }
        int i = 0;
        if (bVar.mo8823P()) {
            for (Object obj2 : (List) obj) {
                i += m8874e(A, obj2);
            }
            return C11695f.m8957D(number) + i + C11695f.m8892v(i);
        }
        for (Object obj3 : (List) obj) {
            i += m8875d(A, number, obj3);
        }
        return i;
    }

    /* renamed from: g */
    public static <T extends AbstractC11701b<T>> C11699h<T> m8872g() {
        return f26137d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static int m8867l(C11747z.EnumC11749b bVar, boolean z) {
        if (z) {
            return 2;
        }
        return bVar.m8691b();
    }

    /* renamed from: o */
    private boolean m8864o(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.mo8824O() == C11747z.EnumC11753c.MESSAGE) {
            if (key.mo8820w()) {
                for (AbstractC11724q qVar : (List) entry.getValue()) {
                    if (!qVar.mo8775j()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof AbstractC11724q) {
                    if (!((AbstractC11724q) value).mo8775j()) {
                        return false;
                    }
                } else if (value instanceof C11714l) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* renamed from: s */
    private void m8860s(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C11714l) {
            value = ((C11714l) value).m8799e();
        }
        if (key.mo8820w()) {
            Object h = m8871h(key);
            if (h == null) {
                h = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) h).add(m8876c(obj));
            }
            this.f26138a.m8727p(key, h);
        } else if (key.mo8824O() == C11747z.EnumC11753c.MESSAGE) {
            Object h2 = m8871h(key);
            if (h2 == null) {
                this.f26138a.m8727p(key, m8876c(value));
                return;
            }
            this.f26138a.m8727p(key, key.mo8825H(((AbstractC11724q) h2).mo8782a(), (AbstractC11724q) value).build());
        } else {
            this.f26138a.m8727p(key, m8876c(value));
        }
    }

    /* renamed from: t */
    public static <T extends AbstractC11701b<T>> C11699h<T> m8859t() {
        return new C11699h<>();
    }

    /* renamed from: u */
    public static Object m8858u(C11694e eVar, C11747z.EnumC11749b bVar, boolean z) {
        switch (C11700a.f26142b[bVar.ordinal()]) {
            case 1:
                return Double.valueOf(eVar.m8974m());
            case 2:
                return Float.valueOf(eVar.m8970q());
            case 3:
                return Long.valueOf(eVar.m8967t());
            case 4:
                return Long.valueOf(eVar.m8994M());
            case 5:
                return Integer.valueOf(eVar.m8968s());
            case 6:
                return Long.valueOf(eVar.m8971p());
            case 7:
                return Integer.valueOf(eVar.m8972o());
            case 8:
                return Boolean.valueOf(eVar.m8976k());
            case 9:
                if (z) {
                    return eVar.m8997J();
                }
                return eVar.m8998I();
            case 10:
                return eVar.m8975l();
            case 11:
                return Integer.valueOf(eVar.m8995L());
            case 12:
                return Integer.valueOf(eVar.m9002E());
            case 13:
                return Long.valueOf(eVar.m9001F());
            case 14:
                return Integer.valueOf(eVar.m9000G());
            case 15:
                return Long.valueOf(eVar.m8999H());
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
        if ((r3 instanceof ph.C11710j.AbstractC11711a) == false) goto L_0x0030;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0030;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
        if ((r3 instanceof ph.C11714l) == false) goto L_0x0030;
     */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m8856w(ph.C11747z.EnumC11749b r2, java.lang.Object r3) {
        /*
            r3.getClass()
            int[] r0 = ph.C11699h.C11700a.f26141a
            ph.z$c r2 = r2.m8692a()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L_0x0042;
                case 2: goto L_0x003f;
                case 3: goto L_0x003c;
                case 4: goto L_0x0039;
                case 5: goto L_0x0036;
                case 6: goto L_0x0033;
                case 7: goto L_0x0027;
                case 8: goto L_0x001e;
                case 9: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0044
        L_0x0015:
            boolean r2 = r3 instanceof ph.AbstractC11724q
            if (r2 != 0) goto L_0x0031
            boolean r2 = r3 instanceof ph.C11714l
            if (r2 == 0) goto L_0x0030
            goto L_0x0031
        L_0x001e:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0031
            boolean r2 = r3 instanceof ph.C11710j.AbstractC11711a
            if (r2 == 0) goto L_0x0030
            goto L_0x0031
        L_0x0027:
            boolean r2 = r3 instanceof ph.AbstractC11691d
            if (r2 != 0) goto L_0x0031
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            r0 = r1
        L_0x0031:
            r1 = r0
            goto L_0x0044
        L_0x0033:
            boolean r1 = r3 instanceof java.lang.String
            goto L_0x0044
        L_0x0036:
            boolean r1 = r3 instanceof java.lang.Boolean
            goto L_0x0044
        L_0x0039:
            boolean r1 = r3 instanceof java.lang.Double
            goto L_0x0044
        L_0x003c:
            boolean r1 = r3 instanceof java.lang.Float
            goto L_0x0044
        L_0x003f:
            boolean r1 = r3 instanceof java.lang.Long
            goto L_0x0044
        L_0x0042:
            boolean r1 = r3 instanceof java.lang.Integer
        L_0x0044:
            if (r1 == 0) goto L_0x0047
            return
        L_0x0047:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ph.C11699h.m8856w(ph.z$b, java.lang.Object):void");
    }

    /* renamed from: x */
    private static void m8855x(C11695f fVar, C11747z.EnumC11749b bVar, int i, Object obj) {
        if (bVar == C11747z.EnumC11749b.f26236v) {
            fVar.m8936Y(i, (AbstractC11724q) obj);
            return;
        }
        fVar.m8889w0(i, m8867l(bVar, false));
        m8854y(fVar, bVar, obj);
    }

    /* renamed from: y */
    private static void m8854y(C11695f fVar, C11747z.EnumC11749b bVar, Object obj) {
        switch (C11700a.f26142b[bVar.ordinal()]) {
            case 1:
                fVar.m8943R(((Double) obj).doubleValue());
                return;
            case 2:
                fVar.m8937X(((Float) obj).floatValue());
                return;
            case 3:
                fVar.m8929c0(((Long) obj).longValue());
                return;
            case 4:
                fVar.m8883z0(((Long) obj).longValue());
                return;
            case 5:
                fVar.m8931b0(((Integer) obj).intValue());
                return;
            case 6:
                fVar.m8939V(((Long) obj).longValue());
                return;
            case 7:
                fVar.m8940U(((Integer) obj).intValue());
                return;
            case 8:
                fVar.m8948M(((Boolean) obj).booleanValue());
                return;
            case 9:
                fVar.m8891v0((String) obj);
                return;
            case 10:
                if (obj instanceof AbstractC11691d) {
                    fVar.m8945P((AbstractC11691d) obj);
                    return;
                } else {
                    fVar.m8947N((byte[]) obj);
                    return;
                }
            case 11:
                fVar.m8885y0(((Integer) obj).intValue());
                return;
            case 12:
                fVar.m8901q0(((Integer) obj).intValue());
                return;
            case 13:
                fVar.m8899r0(((Long) obj).longValue());
                return;
            case 14:
                fVar.m8897s0(((Integer) obj).intValue());
                return;
            case 15:
                fVar.m8893u0(((Long) obj).longValue());
                return;
            case 16:
                fVar.m8935Z((AbstractC11724q) obj);
                return;
            case 17:
                fVar.m8925e0((AbstractC11724q) obj);
                return;
            case 18:
                if (obj instanceof C11710j.AbstractC11711a) {
                    fVar.m8941T(((C11710j.AbstractC11711a) obj).getNumber());
                    return;
                } else {
                    fVar.m8941T(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    /* renamed from: z */
    public static void m8853z(AbstractC11701b<?> bVar, Object obj, C11695f fVar) {
        C11747z.EnumC11749b A = bVar.mo8826A();
        int number = bVar.getNumber();
        if (bVar.mo8820w()) {
            List<Object> list = (List) obj;
            if (bVar.mo8823P()) {
                fVar.m8889w0(number, 2);
                int i = 0;
                for (Object obj2 : list) {
                    i += m8874e(A, obj2);
                }
                fVar.m8905o0(i);
                for (Object obj3 : list) {
                    m8854y(fVar, A, obj3);
                }
                return;
            }
            for (Object obj4 : list) {
                m8855x(fVar, A, number, obj4);
            }
        } else if (obj instanceof C11714l) {
            m8855x(fVar, A, number, ((C11714l) obj).m8799e());
        } else {
            m8855x(fVar, A, number, obj);
        }
    }

    /* renamed from: a */
    public void m8878a(FieldDescriptorType fielddescriptortype, Object obj) {
        List list;
        if (fielddescriptortype.mo8820w()) {
            m8856w(fielddescriptortype.mo8826A(), obj);
            Object h = m8871h(fielddescriptortype);
            if (h == null) {
                list = new ArrayList();
                this.f26138a.m8727p(fielddescriptortype, list);
            } else {
                list = (List) h;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b */
    public C11699h<FieldDescriptorType> clone() {
        C11699h<FieldDescriptorType> t = m8859t();
        for (int i = 0; i < this.f26138a.m8732j(); i++) {
            Map.Entry<FieldDescriptorType, Object> i2 = this.f26138a.m8733i(i);
            t.m8857v(i2.getKey(), i2.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.f26138a.m8731k()) {
            t.m8857v(entry.getKey(), entry.getValue());
        }
        t.f26140c = this.f26140c;
        return t;
    }

    /* renamed from: h */
    public Object m8871h(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f26138a.get(fielddescriptortype);
        if (obj instanceof C11714l) {
            return ((C11714l) obj).m8799e();
        }
        return obj;
    }

    /* renamed from: i */
    public Object m8870i(FieldDescriptorType fielddescriptortype, int i) {
        if (fielddescriptortype.mo8820w()) {
            Object h = m8871h(fielddescriptortype);
            if (h != null) {
                return ((List) h).get(i);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: j */
    public int m8869j(FieldDescriptorType fielddescriptortype) {
        if (fielddescriptortype.mo8820w()) {
            Object h = m8871h(fielddescriptortype);
            if (h == null) {
                return 0;
            }
            return ((List) h).size();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: k */
    public int m8868k() {
        int i = 0;
        for (int i2 = 0; i2 < this.f26138a.m8732j(); i2++) {
            Map.Entry<FieldDescriptorType, Object> i3 = this.f26138a.m8733i(i2);
            i += m8873f(i3.getKey(), i3.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.f26138a.m8731k()) {
            i += m8873f(entry.getKey(), entry.getValue());
        }
        return i;
    }

    /* renamed from: m */
    public boolean m8866m(FieldDescriptorType fielddescriptortype) {
        if (fielddescriptortype.mo8820w()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        } else if (this.f26138a.get(fielddescriptortype) != null) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: n */
    public boolean m8865n() {
        for (int i = 0; i < this.f26138a.m8732j(); i++) {
            if (!m8864o(this.f26138a.m8733i(i))) {
                return false;
            }
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.f26138a.m8731k()) {
            if (!m8864o(entry)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: p */
    public Iterator<Map.Entry<FieldDescriptorType, Object>> m8863p() {
        if (this.f26140c) {
            return new C11714l.C11717c(this.f26138a.entrySet().iterator());
        }
        return this.f26138a.entrySet().iterator();
    }

    /* renamed from: q */
    public void m8862q() {
        if (!this.f26139b) {
            this.f26138a.mo8725n();
            this.f26139b = true;
        }
    }

    /* renamed from: r */
    public void m8861r(C11699h<FieldDescriptorType> hVar) {
        for (int i = 0; i < hVar.f26138a.m8732j(); i++) {
            m8860s(hVar.f26138a.m8733i(i));
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : hVar.f26138a.m8731k()) {
            m8860s(entry);
        }
    }

    /* renamed from: v */
    public void m8857v(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.mo8820w()) {
            m8856w(fielddescriptortype.mo8826A(), obj);
        } else if (obj instanceof List) {
            ArrayList<Object> arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            for (Object obj2 : arrayList) {
                m8856w(fielddescriptortype.mo8826A(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof C11714l) {
            this.f26140c = true;
        }
        this.f26138a.m8727p(fielddescriptortype, obj);
    }

    private C11699h(boolean z) {
        m8862q();
    }
}
