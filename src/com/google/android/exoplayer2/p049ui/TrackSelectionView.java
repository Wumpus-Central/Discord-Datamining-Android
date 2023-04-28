package com.google.android.exoplayer2.p049ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import p029b9.AbstractC3419j;
import p029b9.C3405f;
import p042c9.AbstractC3793m;
import p042c9.C3783c;
import p042c9.C3790j;
import p042c9.C3791k;
import p079e7.C6722k;
import p119g9.C7510a;
import p153i8.C8302u0;

/* renamed from: com.google.android.exoplayer2.ui.TrackSelectionView */
/* loaded from: classes5.dex */
public class TrackSelectionView extends LinearLayout {

    /* renamed from: k */
    private final int f9643k;

    /* renamed from: l */
    private final LayoutInflater f9644l;

    /* renamed from: m */
    private final CheckedTextView f9645m;

    /* renamed from: n */
    private final CheckedTextView f9646n;

    /* renamed from: o */
    private final View$OnClickListenerC5269b f9647o;

    /* renamed from: p */
    private final SparseArray<C3405f.C0080f> f9648p;

    /* renamed from: q */
    private boolean f9649q;

    /* renamed from: r */
    private boolean f9650r;

    /* renamed from: s */
    private AbstractC3793m f9651s;

    /* renamed from: t */
    private CheckedTextView[][] f9652t;

    /* renamed from: u */
    private AbstractC3419j.C3420a f9653u;

    /* renamed from: v */
    private int f9654v;

    /* renamed from: w */
    private TrackGroupArray f9655w;

    /* renamed from: x */
    private boolean f9656x;

    /* renamed from: y */
    private Comparator<C5270c> f9657y;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.ui.TrackSelectionView$b */
    /* loaded from: classes5.dex */
    public class View$OnClickListenerC5269b implements View.OnClickListener {
        private View$OnClickListenerC5269b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrackSelectionView.this.m29691d(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.ui.TrackSelectionView$c */
    /* loaded from: classes5.dex */
    public static final class C5270c {

        /* renamed from: a */
        public final int f9659a;

        /* renamed from: b */
        public final int f9660b;

        /* renamed from: c */
        public final C6722k f9661c;

        public C5270c(int i, int i2, C6722k kVar) {
            this.f9659a = i;
            this.f9660b = i2;
            this.f9661c = kVar;
        }
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    private static int[] m29693b(int[] iArr, int i) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length + 1);
        copyOf[copyOf.length - 1] = i;
        return copyOf;
    }

    /* renamed from: c */
    private static int[] m29692c(int[] iArr, int i) {
        int[] iArr2 = new int[iArr.length - 1];
        int i2 = 0;
        for (int i3 : iArr) {
            if (i3 != i) {
                iArr2[i2] = i3;
                i2++;
            }
        }
        return iArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m29691d(View view) {
        if (view == this.f9645m) {
            m29689f();
        } else if (view == this.f9646n) {
            m29690e();
        } else {
            m29688g(view);
        }
        m29685j();
    }

    /* renamed from: e */
    private void m29690e() {
        this.f9656x = false;
        this.f9648p.clear();
    }

    /* renamed from: f */
    private void m29689f() {
        this.f9656x = true;
        this.f9648p.clear();
    }

    /* renamed from: g */
    private void m29688g(View view) {
        boolean z;
        this.f9656x = false;
        C5270c cVar = (C5270c) C7510a.m22367e(view.getTag());
        int i = cVar.f9659a;
        int i2 = cVar.f9660b;
        C3405f.C0080f fVar = this.f9648p.get(i);
        C7510a.m22367e(this.f9653u);
        if (fVar == null) {
            if (!this.f9650r && this.f9648p.size() > 0) {
                this.f9648p.clear();
            }
            this.f9648p.put(i, new C3405f.C0080f(i, i2));
            return;
        }
        int i3 = fVar.f5514m;
        int[] iArr = fVar.f5513l;
        boolean isChecked = ((CheckedTextView) view).isChecked();
        boolean h = m29687h(i);
        if (h || m29686i()) {
            z = true;
        } else {
            z = false;
        }
        if (!isChecked || !z) {
            if (isChecked) {
                return;
            }
            if (h) {
                this.f9648p.put(i, new C3405f.C0080f(i, m29693b(iArr, i2)));
            } else {
                this.f9648p.put(i, new C3405f.C0080f(i, i2));
            }
        } else if (i3 == 1) {
            this.f9648p.remove(i);
        } else {
            this.f9648p.put(i, new C3405f.C0080f(i, m29692c(iArr, i2)));
        }
    }

    /* renamed from: h */
    private boolean m29687h(int i) {
        if (!this.f9649q || this.f9655w.m29997a(i).f18099k <= 1 || this.f9653u.m34420a(this.f9654v, i, false) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private boolean m29686i() {
        return this.f9650r && this.f9655w.f9362k > 1;
    }

    /* renamed from: j */
    private void m29685j() {
        boolean z;
        this.f9645m.setChecked(this.f9656x);
        CheckedTextView checkedTextView = this.f9646n;
        if (this.f9656x || this.f9648p.size() != 0) {
            z = false;
        } else {
            z = true;
        }
        checkedTextView.setChecked(z);
        for (int i = 0; i < this.f9652t.length; i++) {
            C3405f.C0080f fVar = this.f9648p.get(i);
            int i2 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f9652t[i];
                if (i2 < checkedTextViewArr.length) {
                    if (fVar != null) {
                        this.f9652t[i][i2].setChecked(fVar.m34444a(((C5270c) C7510a.m22367e(checkedTextViewArr[i2].getTag())).f9660b));
                    } else {
                        checkedTextViewArr[i2].setChecked(false);
                    }
                    i2++;
                }
            }
        }
    }

    /* renamed from: k */
    private void m29684k() {
        int i;
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        if (this.f9653u == null) {
            this.f9645m.setEnabled(false);
            this.f9646n.setEnabled(false);
            return;
        }
        this.f9645m.setEnabled(true);
        this.f9646n.setEnabled(true);
        TrackGroupArray e = this.f9653u.m34416e(this.f9654v);
        this.f9655w = e;
        this.f9652t = new CheckedTextView[e.f9362k];
        boolean i2 = m29686i();
        int i3 = 0;
        while (true) {
            TrackGroupArray trackGroupArray = this.f9655w;
            if (i3 < trackGroupArray.f9362k) {
                C8302u0 a = trackGroupArray.m29997a(i3);
                boolean h = m29687h(i3);
                CheckedTextView[][] checkedTextViewArr = this.f9652t;
                int i4 = a.f18099k;
                checkedTextViewArr[i3] = new CheckedTextView[i4];
                C5270c[] cVarArr = new C5270c[i4];
                for (int i5 = 0; i5 < a.f18099k; i5++) {
                    cVarArr[i5] = new C5270c(i3, i5, a.m19990a(i5));
                }
                Comparator<C5270c> comparator = this.f9657y;
                if (comparator != null) {
                    Arrays.sort(cVarArr, comparator);
                }
                for (int i6 = 0; i6 < i4; i6++) {
                    if (i6 == 0) {
                        addView(this.f9644l.inflate(C3790j.f6237a, (ViewGroup) this, false));
                    }
                    if (h || i2) {
                        i = 17367056;
                    } else {
                        i = 17367055;
                    }
                    CheckedTextView checkedTextView = (CheckedTextView) this.f9644l.inflate(i, (ViewGroup) this, false);
                    checkedTextView.setBackgroundResource(this.f9643k);
                    checkedTextView.setText(this.f9651s.mo33587a(cVarArr[i6].f9661c));
                    checkedTextView.setTag(cVarArr[i6]);
                    if (this.f9653u.m34415f(this.f9654v, i3, i6) == 4) {
                        checkedTextView.setFocusable(true);
                        checkedTextView.setOnClickListener(this.f9647o);
                    } else {
                        checkedTextView.setFocusable(false);
                        checkedTextView.setEnabled(false);
                    }
                    this.f9652t[i3][i6] = checkedTextView;
                    addView(checkedTextView);
                }
                i3++;
            } else {
                m29685j();
                return;
            }
        }
    }

    public boolean getIsDisabled() {
        return this.f9656x;
    }

    public List<C3405f.C0080f> getOverrides() {
        ArrayList arrayList = new ArrayList(this.f9648p.size());
        for (int i = 0; i < this.f9648p.size(); i++) {
            arrayList.add(this.f9648p.valueAt(i));
        }
        return arrayList;
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.f9649q != z) {
            this.f9649q = z;
            m29684k();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.f9650r != z) {
            this.f9650r = z;
            if (!z && this.f9648p.size() > 1) {
                for (int size = this.f9648p.size() - 1; size > 0; size--) {
                    this.f9648p.remove(size);
                }
            }
            m29684k();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.f9645m.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(AbstractC3793m mVar) {
        this.f9651s = (AbstractC3793m) C7510a.m22367e(mVar);
        m29684k();
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        this.f9648p = new SparseArray<>();
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843534});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        this.f9643k = resourceId;
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        this.f9644l = from;
        View$OnClickListenerC5269b bVar = new View$OnClickListenerC5269b();
        this.f9647o = bVar;
        this.f9651s = new C3783c(getResources());
        this.f9655w = TrackGroupArray.f9361n;
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(17367055, (ViewGroup) this, false);
        this.f9645m = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(C3791k.f6256q);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(bVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(C3790j.f6237a, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(17367055, (ViewGroup) this, false);
        this.f9646n = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(C3791k.f6255p);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(bVar);
        addView(checkedTextView2);
    }
}
