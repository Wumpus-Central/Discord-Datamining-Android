package ph;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ph.AbstractC11686a;
import ph.AbstractC11724q;
import ph.C11699h;
import ph.C11710j;
import ph.C11747z;

/* renamed from: ph.i */
/* loaded from: classes8.dex */
public abstract class AbstractC11702i extends AbstractC11686a implements Serializable {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ph.i$a */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C11703a {

        /* renamed from: a */
        static final /* synthetic */ int[] f26143a;

        static {
            int[] iArr = new int[C11747z.EnumC11753c.values().length];
            f26143a = iArr;
            try {
                iArr[C11747z.EnumC11753c.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26143a[C11747z.EnumC11753c.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: ph.i$b */
    /* loaded from: classes8.dex */
    public static abstract class AbstractC11704b<MessageType extends AbstractC11702i, BuilderType extends AbstractC11704b> extends AbstractC11686a.AbstractC0372a<BuilderType> {

        /* renamed from: k */
        private AbstractC11691d f26144k = AbstractC11691d.f26108k;

        /* renamed from: m */
        public BuilderType clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        /* renamed from: n */
        public final AbstractC11691d m8845n() {
            return this.f26144k;
        }

        /* renamed from: o */
        public abstract BuilderType mo8844o(MessageType messagetype);

        /* renamed from: q */
        public final BuilderType m8843q(AbstractC11691d dVar) {
            this.f26144k = dVar;
            return this;
        }
    }

    /* renamed from: ph.i$c */
    /* loaded from: classes8.dex */
    public static abstract class AbstractC11705c<MessageType extends AbstractC11706d<MessageType>, BuilderType extends AbstractC11705c<MessageType, BuilderType>> extends AbstractC11704b<MessageType, BuilderType> implements AbstractC11726r {

        /* renamed from: l */
        private C11699h<C11708e> f26145l = C11699h.m8872g();

        /* renamed from: m */
        private boolean f26146m;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s */
        public C11699h<C11708e> m8841s() {
            this.f26145l.m8862q();
            this.f26146m = false;
            return this.f26145l;
        }

        /* renamed from: t */
        private void m8840t() {
            if (!this.f26146m) {
                this.f26145l = this.f26145l.clone();
                this.f26146m = true;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: u */
        public final void m8839u(MessageType messagetype) {
            m8840t();
            this.f26145l.m8861r(((AbstractC11706d) messagetype).f26147l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ph.i$e */
    /* loaded from: classes8.dex */
    public static final class C11708e implements C11699h.AbstractC11701b<C11708e> {

        /* renamed from: k */
        final C11710j.AbstractC11712b<?> f26152k;

        /* renamed from: l */
        final int f26153l;

        /* renamed from: m */
        final C11747z.EnumC11749b f26154m;

        /* renamed from: n */
        final boolean f26155n;

        /* renamed from: o */
        final boolean f26156o;

        C11708e(C11710j.AbstractC11712b<?> bVar, int i, C11747z.EnumC11749b bVar2, boolean z, boolean z2) {
            this.f26152k = bVar;
            this.f26153l = i;
            this.f26154m = bVar2;
            this.f26155n = z;
            this.f26156o = z2;
        }

        @Override // ph.C11699h.AbstractC11701b
        /* renamed from: A */
        public C11747z.EnumC11749b mo8826A() {
            return this.f26154m;
        }

        @Override // ph.C11699h.AbstractC11701b
        /* renamed from: H */
        public AbstractC11724q.AbstractC11725a mo8825H(AbstractC11724q.AbstractC11725a aVar, AbstractC11724q qVar) {
            return ((AbstractC11704b) aVar).mo8844o((AbstractC11702i) qVar);
        }

        @Override // ph.C11699h.AbstractC11701b
        /* renamed from: O */
        public C11747z.EnumC11753c mo8824O() {
            return this.f26154m.m8692a();
        }

        @Override // ph.C11699h.AbstractC11701b
        /* renamed from: P */
        public boolean mo8823P() {
            return this.f26156o;
        }

        /* renamed from: a */
        public int compareTo(C11708e eVar) {
            return this.f26153l - eVar.f26153l;
        }

        /* renamed from: b */
        public C11710j.AbstractC11712b<?> m8821b() {
            return this.f26152k;
        }

        @Override // ph.C11699h.AbstractC11701b
        public int getNumber() {
            return this.f26153l;
        }

        @Override // ph.C11699h.AbstractC11701b
        /* renamed from: w */
        public boolean mo8820w() {
            return this.f26155n;
        }
    }

    /* renamed from: ph.i$f */
    /* loaded from: classes8.dex */
    public static class C11709f<ContainingType extends AbstractC11724q, Type> {

        /* renamed from: a */
        final ContainingType f26157a;

        /* renamed from: b */
        final Type f26158b;

        /* renamed from: c */
        final AbstractC11724q f26159c;

        /* renamed from: d */
        final C11708e f26160d;

        /* renamed from: e */
        final Class f26161e;

        /* renamed from: f */
        final Method f26162f;

        C11709f(ContainingType containingtype, Type type, AbstractC11724q qVar, C11708e eVar, Class cls) {
            if (containingtype == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            } else if (eVar.mo8826A() == C11747z.EnumC11749b.f26237w && qVar == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            } else {
                this.f26157a = containingtype;
                this.f26158b = type;
                this.f26159c = qVar;
                this.f26160d = eVar;
                this.f26161e = cls;
                if (C11710j.AbstractC11711a.class.isAssignableFrom(cls)) {
                    this.f26162f = AbstractC11702i.m8851l(cls, "valueOf", Integer.TYPE);
                } else {
                    this.f26162f = null;
                }
            }
        }

        /* renamed from: a */
        Object m8819a(Object obj) {
            if (!this.f26160d.mo8820w()) {
                return m8815e(obj);
            }
            if (this.f26160d.mo8824O() != C11747z.EnumC11753c.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (List) obj) {
                arrayList.add(m8815e(obj2));
            }
            return arrayList;
        }

        /* renamed from: b */
        public ContainingType m8818b() {
            return this.f26157a;
        }

        /* renamed from: c */
        public AbstractC11724q m8817c() {
            return this.f26159c;
        }

        /* renamed from: d */
        public int m8816d() {
            return this.f26160d.getNumber();
        }

        /* renamed from: e */
        Object m8815e(Object obj) {
            if (this.f26160d.mo8824O() == C11747z.EnumC11753c.ENUM) {
                return AbstractC11702i.m8850m(this.f26162f, null, (Integer) obj);
            }
            return obj;
        }

        /* renamed from: f */
        Object m8814f(Object obj) {
            if (this.f26160d.mo8824O() == C11747z.EnumC11753c.ENUM) {
                return Integer.valueOf(((C11710j.AbstractC11711a) obj).getNumber());
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11702i() {
    }

    /* renamed from: l */
    static Method m8851l(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            String name = cls.getName();
            String valueOf = String.valueOf(str);
            StringBuilder sb2 = new StringBuilder(name.length() + 45 + valueOf.length());
            sb2.append("Generated message class \"");
            sb2.append(name);
            sb2.append("\" missing method \"");
            sb2.append(valueOf);
            sb2.append("\".");
            throw new RuntimeException(sb2.toString(), e);
        }
    }

    /* renamed from: m */
    static Object m8850m(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    /* renamed from: o */
    public static <ContainingType extends AbstractC11724q, Type> C11709f<ContainingType, Type> m8849o(ContainingType containingtype, AbstractC11724q qVar, C11710j.AbstractC11712b<?> bVar, int i, C11747z.EnumC11749b bVar2, boolean z, Class cls) {
        return new C11709f<>(containingtype, Collections.emptyList(), qVar, new C11708e(bVar, i, bVar2, true, z), cls);
    }

    /* renamed from: p */
    public static <ContainingType extends AbstractC11724q, Type> C11709f<ContainingType, Type> m8848p(ContainingType containingtype, Type type, AbstractC11724q qVar, C11710j.AbstractC11712b<?> bVar, int i, C11747z.EnumC11749b bVar2, Class cls) {
        return new C11709f<>(containingtype, type, qVar, new C11708e(bVar, i, bVar2, false, false), cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <MessageType extends ph.AbstractC11724q> boolean m8847r(ph.C11699h<ph.AbstractC11702i.C11708e> r5, MessageType r6, ph.C11694e r7, ph.C11695f r8, ph.C11697g r9, int r10) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ph.AbstractC11702i.m8847r(ph.h, ph.q, ph.e, ph.f, ph.g, int):boolean");
    }

    @Override // ph.AbstractC11724q
    /* renamed from: h */
    public AbstractC11727s<? extends AbstractC11724q> mo8778h() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public void mo8837n() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public boolean mo8836q(C11694e eVar, C11695f fVar, C11697g gVar, int i) {
        return eVar.m8991P(i, fVar);
    }

    /* renamed from: ph.i$d */
    /* loaded from: classes8.dex */
    public static abstract class AbstractC11706d<MessageType extends AbstractC11706d<MessageType>> extends AbstractC11702i implements AbstractC11726r {

        /* renamed from: l */
        private final C11699h<C11708e> f26147l;

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: ph.i$d$a */
        /* loaded from: classes8.dex */
        public class C11707a {

            /* renamed from: a */
            private final Iterator<Map.Entry<C11708e, Object>> f26148a;

            /* renamed from: b */
            private Map.Entry<C11708e, Object> f26149b;

            /* renamed from: c */
            private final boolean f26150c;

            /* synthetic */ C11707a(AbstractC11706d dVar, boolean z, C11703a aVar) {
                this(z);
            }

            /* renamed from: a */
            public void m8827a(int i, C11695f fVar) {
                while (true) {
                    Map.Entry<C11708e, Object> entry = this.f26149b;
                    if (entry != null && entry.getKey().getNumber() < i) {
                        C11708e key = this.f26149b.getKey();
                        if (!this.f26150c || key.mo8824O() != C11747z.EnumC11753c.MESSAGE || key.mo8820w()) {
                            C11699h.m8853z(key, this.f26149b.getValue(), fVar);
                        } else {
                            fVar.m8923f0(key.getNumber(), (AbstractC11724q) this.f26149b.getValue());
                        }
                        if (this.f26148a.hasNext()) {
                            this.f26149b = this.f26148a.next();
                        } else {
                            this.f26149b = null;
                        }
                    } else {
                        return;
                    }
                }
            }

            private C11707a(boolean z) {
                Iterator<Map.Entry<C11708e, Object>> p = AbstractC11706d.this.f26147l.m8863p();
                this.f26148a = p;
                if (p.hasNext()) {
                    this.f26149b = p.next();
                }
                this.f26150c = z;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public AbstractC11706d() {
            this.f26147l = C11699h.m8859t();
        }

        /* renamed from: A */
        private void m8838A(C11709f<MessageType, ?> fVar) {
            if (fVar.m8818b() != mo8776f()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ph.AbstractC11702i
        /* renamed from: n */
        public void mo8837n() {
            this.f26147l.m8862q();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ph.AbstractC11702i
        /* renamed from: q */
        public boolean mo8836q(C11694e eVar, C11695f fVar, C11697g gVar, int i) {
            return AbstractC11702i.m8847r(this.f26147l, mo8776f(), eVar, fVar, gVar, i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: t */
        public boolean m8834t() {
            return this.f26147l.m8865n();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: u */
        public int m8833u() {
            return this.f26147l.m8868k();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: v */
        public final <Type> Type m8832v(C11709f<MessageType, Type> fVar) {
            m8838A(fVar);
            Object h = this.f26147l.m8871h(fVar.f26160d);
            if (h == null) {
                return fVar.f26158b;
            }
            return (Type) fVar.m8819a(h);
        }

        /* renamed from: w */
        public final <Type> Type m8831w(C11709f<MessageType, List<Type>> fVar, int i) {
            m8838A(fVar);
            return (Type) fVar.m8815e(this.f26147l.m8870i(fVar.f26160d, i));
        }

        /* renamed from: x */
        public final <Type> int m8830x(C11709f<MessageType, List<Type>> fVar) {
            m8838A(fVar);
            return this.f26147l.m8869j(fVar.f26160d);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: y */
        public final <Type> boolean m8829y(C11709f<MessageType, Type> fVar) {
            m8838A(fVar);
            return this.f26147l.m8866m(fVar.f26160d);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: z */
        public AbstractC11706d<MessageType>.C11707a m8828z() {
            return new C11707a(this, false, null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public AbstractC11706d(AbstractC11705c<MessageType, ?> cVar) {
            this.f26147l = cVar.m8841s();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11702i(AbstractC11704b bVar) {
    }
}
