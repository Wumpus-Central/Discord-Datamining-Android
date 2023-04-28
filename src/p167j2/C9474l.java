package p167j2;

import android.annotation.TargetApi;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import p254o2.C11177i;

@TargetApi(19)
/* renamed from: j2.l */
/* loaded from: classes.dex */
public class C9474l implements AbstractC9476m, AbstractC9472j {

    /* renamed from: d */
    private final String f20929d;

    /* renamed from: f */
    private final C11177i f20931f;

    /* renamed from: a */
    private final Path f20926a = new Path();

    /* renamed from: b */
    private final Path f20927b = new Path();

    /* renamed from: c */
    private final Path f20928c = new Path();

    /* renamed from: e */
    private final List<AbstractC9476m> f20930e = new ArrayList();

    /* renamed from: j2.l$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C9475a {

        /* renamed from: a */
        static final /* synthetic */ int[] f20932a;

        static {
            int[] iArr = new int[C11177i.EnumC11178a.values().length];
            f20932a = iArr;
            try {
                iArr[C11177i.EnumC11178a.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20932a[C11177i.EnumC11178a.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20932a[C11177i.EnumC11178a.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20932a[C11177i.EnumC11178a.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20932a[C11177i.EnumC11178a.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C9474l(C11177i iVar) {
        this.f20929d = iVar.m10584c();
        this.f20931f = iVar;
    }

    /* renamed from: a */
    private void m16175a() {
        for (int i = 0; i < this.f20930e.size(); i++) {
            this.f20928c.addPath(this.f20930e.get(i).mo16163d());
        }
    }

    @TargetApi(19)
    /* renamed from: c */
    private void m16174c(Path.Op op) {
        this.f20927b.reset();
        this.f20926a.reset();
        for (int size = this.f20930e.size() - 1; size >= 1; size--) {
            AbstractC9476m mVar = this.f20930e.get(size);
            if (mVar instanceof C9466d) {
                C9466d dVar = (C9466d) mVar;
                List<AbstractC9476m> k = dVar.m16187k();
                for (int size2 = k.size() - 1; size2 >= 0; size2--) {
                    Path d = k.get(size2).mo16163d();
                    d.transform(dVar.m16186l());
                    this.f20927b.addPath(d);
                }
            } else {
                this.f20927b.addPath(mVar.mo16163d());
            }
        }
        AbstractC9476m mVar2 = this.f20930e.get(0);
        if (mVar2 instanceof C9466d) {
            C9466d dVar2 = (C9466d) mVar2;
            List<AbstractC9476m> k2 = dVar2.m16187k();
            for (int i = 0; i < k2.size(); i++) {
                Path d2 = k2.get(i).mo16163d();
                d2.transform(dVar2.m16186l());
                this.f20926a.addPath(d2);
            }
        } else {
            this.f20926a.set(mVar2.mo16163d());
        }
        this.f20928c.op(this.f20926a, this.f20927b, op);
    }

    @Override // p167j2.AbstractC9465c
    /* renamed from: b */
    public void mo9523b(List<AbstractC9465c> list, List<AbstractC9465c> list2) {
        for (int i = 0; i < this.f20930e.size(); i++) {
            this.f20930e.get(i).mo9523b(list, list2);
        }
    }

    @Override // p167j2.AbstractC9476m
    /* renamed from: d */
    public Path mo16163d() {
        this.f20928c.reset();
        if (this.f20931f.m10583d()) {
            return this.f20928c;
        }
        int i = C9475a.f20932a[this.f20931f.m10585b().ordinal()];
        if (i == 1) {
            m16175a();
        } else if (i == 2) {
            m16174c(Path.Op.UNION);
        } else if (i == 3) {
            m16174c(Path.Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            m16174c(Path.Op.INTERSECT);
        } else if (i == 5) {
            m16174c(Path.Op.XOR);
        }
        return this.f20928c;
    }

    @Override // p167j2.AbstractC9472j
    /* renamed from: g */
    public void mo16169g(ListIterator<AbstractC9465c> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            AbstractC9465c previous = listIterator.previous();
            if (previous instanceof AbstractC9476m) {
                this.f20930e.add((AbstractC9476m) previous);
                listIterator.remove();
            }
        }
    }
}
