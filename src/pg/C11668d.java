package pg;

import fi.AbstractC7267g0;
import java.util.Map;
import p249nh.C11137c;
import p249nh.C11142f;
import p268og.AbstractC11299a1;
import p305qh.AbstractC12137c;
import pg.AbstractC11666c;
import th.AbstractC13104g;

/* renamed from: pg.d */
/* loaded from: classes8.dex */
public class C11668d implements AbstractC11666c {

    /* renamed from: a */
    private final AbstractC7267g0 f26024a;

    /* renamed from: b */
    private final Map<C11142f, AbstractC13104g<?>> f26025b;

    /* renamed from: c */
    private final AbstractC11299a1 f26026c;

    public C11668d(AbstractC7267g0 g0Var, Map<C11142f, AbstractC13104g<?>> map, AbstractC11299a1 a1Var) {
        if (g0Var == null) {
            m9055b(0);
        }
        if (map == null) {
            m9055b(1);
        }
        if (a1Var == null) {
            m9055b(2);
        }
        this.f26024a = g0Var;
        this.f26025b = map;
        this.f26026c = a1Var;
    }

    /* renamed from: b */
    private static /* synthetic */ void m9055b(int i) {
        String str = (i == 3 || i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "valueArguments";
        } else if (i == 2) {
            objArr[0] = "source";
        } else if (i == 3 || i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i == 3) {
            objArr[1] = "getType";
        } else if (i == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (!(i == 3 || i == 4 || i == 5)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i == 3 || i == 4 || i == 5) {
            throw new IllegalStateException(format);
        }
    }

    @Override // pg.AbstractC11666c
    /* renamed from: a */
    public Map<C11142f, AbstractC13104g<?>> mo700a() {
        Map<C11142f, AbstractC13104g<?>> map = this.f26025b;
        if (map == null) {
            m9055b(4);
        }
        return map;
    }

    @Override // pg.AbstractC11666c
    /* renamed from: e */
    public C11137c mo722e() {
        return AbstractC11666c.C11667a.m9056a(this);
    }

    @Override // pg.AbstractC11666c
    public AbstractC7267g0 getType() {
        AbstractC7267g0 g0Var = this.f26024a;
        if (g0Var == null) {
            m9055b(3);
        }
        return g0Var;
    }

    @Override // pg.AbstractC11666c
    /* renamed from: j */
    public AbstractC11299a1 mo721j() {
        AbstractC11299a1 a1Var = this.f26026c;
        if (a1Var == null) {
            m9055b(5);
        }
        return a1Var;
    }

    public String toString() {
        return AbstractC12137c.f27230g.mo7627r(this, null);
    }
}
