package p030bc;

import com.facebook.react.uimanager.ViewDefaults;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: bc.l */
/* loaded from: classes3.dex */
public final class C3460l {

    /* renamed from: a */
    private final AbstractC3446c f5599a;

    /* renamed from: b */
    private final boolean f5600b;

    /* renamed from: c */
    private final AbstractC3463c f5601c;

    /* renamed from: d */
    private final int f5602d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bc.l$a */
    /* loaded from: classes3.dex */
    public class C3461a implements AbstractC3463c {

        /* renamed from: a */
        final /* synthetic */ AbstractC3446c f5603a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: bc.l$a$a */
        /* loaded from: classes3.dex */
        public class C0083a extends AbstractC3462b {
            C0083a(C3460l lVar, CharSequence charSequence) {
                super(lVar, charSequence);
            }

            @Override // p030bc.C3460l.AbstractC3462b
            /* renamed from: f */
            int mo34334f(int i) {
                return i + 1;
            }

            @Override // p030bc.C3460l.AbstractC3462b
            /* renamed from: g */
            int mo34333g(int i) {
                return C3461a.this.f5603a.mo34366d(this.f5605m, i);
            }
        }

        C3461a(AbstractC3446c cVar) {
            this.f5603a = cVar;
        }

        /* renamed from: b */
        public AbstractC3462b mo34332a(C3460l lVar, CharSequence charSequence) {
            return new C0083a(lVar, charSequence);
        }
    }

    /* renamed from: bc.l$b */
    /* loaded from: classes3.dex */
    private static abstract class AbstractC3462b extends AbstractC3443a<String> {

        /* renamed from: m */
        final CharSequence f5605m;

        /* renamed from: n */
        final AbstractC3446c f5606n;

        /* renamed from: o */
        final boolean f5607o;

        /* renamed from: p */
        int f5608p = 0;

        /* renamed from: q */
        int f5609q;

        protected AbstractC3462b(C3460l lVar, CharSequence charSequence) {
            this.f5606n = lVar.f5599a;
            this.f5607o = lVar.f5600b;
            this.f5609q = lVar.f5602d;
            this.f5605m = charSequence;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: e */
        public String mo34336b() {
            int g;
            int i = this.f5608p;
            while (true) {
                int i2 = this.f5608p;
                if (i2 == -1) {
                    return m34381c();
                }
                g = mo34333g(i2);
                if (g == -1) {
                    g = this.f5605m.length();
                    this.f5608p = -1;
                } else {
                    this.f5608p = mo34334f(g);
                }
                int i3 = this.f5608p;
                if (i3 == i) {
                    int i4 = i3 + 1;
                    this.f5608p = i4;
                    if (i4 > this.f5605m.length()) {
                        this.f5608p = -1;
                    }
                } else {
                    while (i < g && this.f5606n.mo34365g(this.f5605m.charAt(i))) {
                        i++;
                    }
                    while (g > i && this.f5606n.mo34365g(this.f5605m.charAt(g - 1))) {
                        g--;
                    }
                    if (!this.f5607o || i != g) {
                        break;
                    }
                    i = this.f5608p;
                }
            }
            int i5 = this.f5609q;
            if (i5 == 1) {
                g = this.f5605m.length();
                this.f5608p = -1;
                while (g > i && this.f5606n.mo34365g(this.f5605m.charAt(g - 1))) {
                    g--;
                }
            } else {
                this.f5609q = i5 - 1;
            }
            return this.f5605m.subSequence(i, g).toString();
        }

        /* renamed from: f */
        abstract int mo34334f(int i);

        /* renamed from: g */
        abstract int mo34333g(int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bc.l$c */
    /* loaded from: classes3.dex */
    public interface AbstractC3463c {
        /* renamed from: a */
        Iterator<String> mo34332a(C3460l lVar, CharSequence charSequence);
    }

    private C3460l(AbstractC3463c cVar) {
        this(cVar, false, AbstractC3446c.m34371h(), ViewDefaults.NUMBER_OF_LINES);
    }

    /* renamed from: d */
    public static C3460l m34341d(char c) {
        return m34340e(AbstractC3446c.m34373e(c));
    }

    /* renamed from: e */
    public static C3460l m34340e(AbstractC3446c cVar) {
        C3457i.m34352i(cVar);
        return new C3460l(new C3461a(cVar));
    }

    /* renamed from: g */
    private Iterator<String> m34338g(CharSequence charSequence) {
        return this.f5601c.mo34332a(this, charSequence);
    }

    /* renamed from: f */
    public List<String> m34339f(CharSequence charSequence) {
        C3457i.m34352i(charSequence);
        Iterator<String> g = m34338g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (g.hasNext()) {
            arrayList.add(g.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    private C3460l(AbstractC3463c cVar, boolean z, AbstractC3446c cVar2, int i) {
        this.f5601c = cVar;
        this.f5600b = z;
        this.f5599a = cVar2;
        this.f5602d = i;
    }
}
