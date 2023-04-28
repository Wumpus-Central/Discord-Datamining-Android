package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import p411x0.AbstractC13919a;

/* renamed from: androidx.constraintlayout.widget.b */
/* loaded from: classes.dex */
public abstract class AbstractC2143b extends View {

    /* renamed from: k */
    protected int[] f2788k;

    /* renamed from: l */
    protected int f2789l;

    /* renamed from: m */
    protected Context f2790m;

    /* renamed from: n */
    protected AbstractC13919a f2791n;

    /* renamed from: o */
    protected boolean f2792o;

    /* renamed from: p */
    protected String f2793p;

    /* renamed from: q */
    private View[] f2794q;

    /* renamed from: r */
    private HashMap<Integer, String> f2795r;

    public AbstractC2143b(Context context) {
        super(context);
        this.f2788k = new int[32];
        this.f2792o = false;
        this.f2794q = null;
        this.f2795r = new HashMap<>();
        this.f2790m = context;
        mo38746g(null);
    }

    /* renamed from: a */
    private void m38762a(String str) {
        if (str != null && str.length() != 0 && this.f2790m != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            }
            int f = m38757f(trim);
            if (f != 0) {
                this.f2795r.put(Integer.valueOf(f), trim);
                m38761b(f);
                return;
            }
            Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
        }
    }

    /* renamed from: b */
    private void m38761b(int i) {
        if (i != getId()) {
            int i2 = this.f2789l + 1;
            int[] iArr = this.f2788k;
            if (i2 > iArr.length) {
                this.f2788k = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.f2788k;
            int i3 = this.f2789l;
            iArr2[i3] = i;
            this.f2789l = i3 + 1;
        }
    }

    /* renamed from: e */
    private int m38758e(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f2790m.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* renamed from: f */
    private int m38757f(String str) {
        ConstraintLayout constraintLayout;
        if (getParent() instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout) getParent();
        } else {
            constraintLayout = null;
        }
        int i = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object designInformation = constraintLayout.getDesignInformation(0, str);
            if (designInformation instanceof Integer) {
                i = ((Integer) designInformation).intValue();
            }
        }
        if (i == 0 && constraintLayout != null) {
            i = m38758e(constraintLayout, str);
        }
        if (i == 0) {
            try {
                i = C2147e.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (i == 0) {
            return this.f2790m.getResources().getIdentifier(str, "id", this.f2790m.getPackageName());
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public void m38760c() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            m38759d((ConstraintLayout) parent);
        }
    }

    /* renamed from: d */
    protected void m38759d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f2789l; i++) {
            View viewById = constraintLayout.getViewById(this.f2788k[i]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public void mo38746g(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C2148f.f2813a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C2148f.f2894m1) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f2793p = string;
                    setIds(string);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f2788k, this.f2789l);
    }

    /* renamed from: h */
    public void mo38756h(ConstraintWidget constraintWidget, boolean z) {
    }

    /* renamed from: i */
    public void mo38755i(ConstraintLayout constraintLayout) {
    }

    /* renamed from: j */
    public void m38754j(ConstraintLayout constraintLayout) {
    }

    /* renamed from: k */
    public void m38753k(ConstraintLayout constraintLayout) {
    }

    /* renamed from: l */
    public void m38752l(ConstraintLayout constraintLayout) {
        String str;
        int e;
        if (isInEditMode()) {
            setIds(this.f2793p);
        }
        AbstractC13919a aVar = this.f2791n;
        if (aVar != null) {
            aVar.mo2321b();
            for (int i = 0; i < this.f2789l; i++) {
                int i2 = this.f2788k[i];
                View viewById = constraintLayout.getViewById(i2);
                if (viewById == null && (e = m38758e(constraintLayout, (str = this.f2795r.get(Integer.valueOf(i2))))) != 0) {
                    this.f2788k[i] = e;
                    this.f2795r.put(Integer.valueOf(e), str);
                    viewById = constraintLayout.getViewById(e);
                }
                if (viewById != null) {
                    this.f2791n.mo2322a(constraintLayout.getViewWidget(viewById));
                }
            }
            this.f2791n.mo2320c(constraintLayout.mLayoutWidget);
        }
    }

    /* renamed from: m */
    public void m38751m() {
        if (this.f2791n != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                ((ConstraintLayout.LayoutParams) layoutParams).f2656n0 = (ConstraintWidget) this.f2791n;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f2793p;
        if (str != null) {
            setIds(str);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f2792o) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    protected void setIds(String str) {
        this.f2793p = str;
        if (str != null) {
            int i = 0;
            this.f2789l = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    m38762a(str.substring(i));
                    return;
                } else {
                    m38762a(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f2793p = null;
        this.f2789l = 0;
        for (int i : iArr) {
            m38761b(i);
        }
    }

    public AbstractC2143b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2788k = new int[32];
        this.f2792o = false;
        this.f2794q = null;
        this.f2795r = new HashMap<>();
        this.f2790m = context;
        mo38746g(attributeSet);
    }
}
