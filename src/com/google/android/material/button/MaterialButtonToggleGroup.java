package com.google.android.material.button;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.core.view.C2549a;
import androidx.core.view.C2731w;
import androidx.core.view.C2733w0;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.C5665o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import p083eb.C6803b;
import p083eb.C6811j;
import p422xb.AbstractC14034c;
import p422xb.C14032a;
import p422xb.C14045k;

/* loaded from: classes3.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: u */
    private static final String f10634u = "MaterialButtonToggleGroup";

    /* renamed from: v */
    private static final int f10635v = C6811j.f14672r;

    /* renamed from: k */
    private final List<C5548c> f10636k;

    /* renamed from: l */
    private final C5550e f10637l;

    /* renamed from: m */
    private final LinkedHashSet<AbstractC5549d> f10638m;

    /* renamed from: n */
    private final Comparator<MaterialButton> f10639n;

    /* renamed from: o */
    private Integer[] f10640o;

    /* renamed from: p */
    private boolean f10641p;

    /* renamed from: q */
    private boolean f10642q;

    /* renamed from: r */
    private boolean f10643r;

    /* renamed from: s */
    private final int f10644s;

    /* renamed from: t */
    private Set<Integer> f10645t;

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$a */
    /* loaded from: classes3.dex */
    class C5546a implements Comparator<MaterialButton> {
        C5546a() {
        }

        /* renamed from: b */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            return Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$b */
    /* loaded from: classes3.dex */
    class C5547b extends C2549a {
        C5547b() {
        }

        @Override // androidx.core.view.C2549a
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.m37383d0(AccessibilityNodeInfoCompat.C2558c.m37331b(0, 1, MaterialButtonToggleGroup.this.m28540i(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$c */
    /* loaded from: classes3.dex */
    public static class C5548c {

        /* renamed from: e */
        private static final AbstractC14034c f10648e = new C14032a(0.0f);

        /* renamed from: a */
        AbstractC14034c f10649a;

        /* renamed from: b */
        AbstractC14034c f10650b;

        /* renamed from: c */
        AbstractC14034c f10651c;

        /* renamed from: d */
        AbstractC14034c f10652d;

        C5548c(AbstractC14034c cVar, AbstractC14034c cVar2, AbstractC14034c cVar3, AbstractC14034c cVar4) {
            this.f10649a = cVar;
            this.f10650b = cVar3;
            this.f10651c = cVar4;
            this.f10652d = cVar2;
        }

        /* renamed from: a */
        public static C5548c m28528a(C5548c cVar) {
            AbstractC14034c cVar2 = f10648e;
            return new C5548c(cVar2, cVar.f10652d, cVar2, cVar.f10651c);
        }

        /* renamed from: b */
        public static C5548c m28527b(C5548c cVar, View view) {
            return C5665o.m27826e(view) ? m28526c(cVar) : m28525d(cVar);
        }

        /* renamed from: c */
        public static C5548c m28526c(C5548c cVar) {
            AbstractC14034c cVar2 = cVar.f10649a;
            AbstractC14034c cVar3 = cVar.f10652d;
            AbstractC14034c cVar4 = f10648e;
            return new C5548c(cVar2, cVar3, cVar4, cVar4);
        }

        /* renamed from: d */
        public static C5548c m28525d(C5548c cVar) {
            AbstractC14034c cVar2 = f10648e;
            return new C5548c(cVar2, cVar2, cVar.f10650b, cVar.f10651c);
        }

        /* renamed from: e */
        public static C5548c m28524e(C5548c cVar, View view) {
            return C5665o.m27826e(view) ? m28525d(cVar) : m28526c(cVar);
        }

        /* renamed from: f */
        public static C5548c m28523f(C5548c cVar) {
            AbstractC14034c cVar2 = cVar.f10649a;
            AbstractC14034c cVar3 = f10648e;
            return new C5548c(cVar2, cVar3, cVar.f10650b, cVar3);
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$d */
    /* loaded from: classes3.dex */
    public interface AbstractC5549d {
        /* renamed from: a */
        void mo27392a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$e */
    /* loaded from: classes3.dex */
    public class C5550e implements MaterialButton.AbstractC5543b {
        private C5550e() {
        }

        @Override // com.google.android.material.button.MaterialButton.AbstractC5543b
        /* renamed from: a */
        public void mo28522a(MaterialButton materialButton, boolean z) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        /* synthetic */ C5550e(MaterialButtonToggleGroup materialButtonToggleGroup, C5546a aVar) {
            this();
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6803b.f14546t);
    }

    /* renamed from: c */
    private void m28546c() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
                MaterialButton h = m28541h(i);
                int min = Math.min(h.getStrokeWidth(), m28541h(i - 1).getStrokeWidth());
                LinearLayout.LayoutParams d = m28545d(h);
                if (getOrientation() == 0) {
                    C2731w.m37075c(d, 0);
                    C2731w.m37074d(d, -min);
                    d.topMargin = 0;
                } else {
                    d.bottomMargin = 0;
                    d.topMargin = -min;
                    C2731w.m37074d(d, 0);
                }
                h.setLayoutParams(d);
            }
            m28535n(firstVisibleChildIndex);
        }
    }

    /* renamed from: d */
    private LinearLayout.LayoutParams m28545d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    /* renamed from: e */
    private void m28544e(int i, boolean z) {
        if (i == -1) {
            String str = f10634u;
            Log.e(str, "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.f10645t);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.f10642q && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else if (!z && hashSet.contains(Integer.valueOf(i))) {
            if (!this.f10643r || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        } else {
            return;
        }
        m28532q(hashSet);
    }

    /* renamed from: g */
    private void m28542g(int i, boolean z) {
        Iterator<AbstractC5549d> it = this.f10638m.iterator();
        while (it.hasNext()) {
            it.next().mo27392a(this, i, z);
        }
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (m28538k(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m28538k(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && m28538k(i2)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: h */
    private MaterialButton m28541h(int i) {
        return (MaterialButton) getChildAt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public int m28540i(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) == view) {
                return i;
            }
            if ((getChildAt(i2) instanceof MaterialButton) && m28538k(i2)) {
                i++;
            }
        }
        return -1;
    }

    /* renamed from: j */
    private C5548c m28539j(int i, int i2, int i3) {
        boolean z;
        C5548c cVar = this.f10636k.get(i);
        if (i2 == i3) {
            return cVar;
        }
        if (getOrientation() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i == i2) {
            if (z) {
                return C5548c.m28524e(cVar, this);
            }
            return C5548c.m28523f(cVar);
        } else if (i != i3) {
            return null;
        } else {
            if (z) {
                return C5548c.m28527b(cVar, this);
            }
            return C5548c.m28528a(cVar);
        }
    }

    /* renamed from: k */
    private boolean m28538k(int i) {
        if (getChildAt(i).getVisibility() != 8) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    private void m28535n(int i) {
        if (getChildCount() != 0 && i != -1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) m28541h(i).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams.topMargin = 0;
                layoutParams.bottomMargin = 0;
                return;
            }
            C2731w.m37075c(layoutParams, 0);
            C2731w.m37074d(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    /* renamed from: o */
    private void m28534o(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof MaterialButton) {
            this.f10641p = true;
            ((MaterialButton) findViewById).setChecked(z);
            this.f10641p = false;
        }
    }

    /* renamed from: p */
    private static void m28533p(C14045k.C14047b bVar, C5548c cVar) {
        if (cVar == null) {
            bVar.m1890o(0.0f);
        } else {
            bVar.m1909B(cVar.f10649a).m1885t(cVar.f10652d).m1905F(cVar.f10650b).m1881x(cVar.f10651c);
        }
    }

    /* renamed from: q */
    private void m28532q(Set<Integer> set) {
        Set<Integer> set2 = this.f10645t;
        this.f10645t = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id2 = m28541h(i).getId();
            m28534o(id2, set.contains(Integer.valueOf(id2)));
            if (set2.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                m28542g(id2, set.contains(Integer.valueOf(id2)));
            }
        }
        invalidate();
    }

    /* renamed from: r */
    private void m28531r() {
        TreeMap treeMap = new TreeMap(this.f10639n);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(m28541h(i), Integer.valueOf(i));
        }
        this.f10640o = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(C2733w0.m37003k());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f10637l);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(f10634u, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        m28544e(materialButton.getId(), materialButton.isChecked());
        C14045k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f10636k.add(new C5548c(shapeAppearanceModel.m1918r(), shapeAppearanceModel.m1926j(), shapeAppearanceModel.m1916t(), shapeAppearanceModel.m1924l()));
        C2733w0.m36990q0(materialButton, new C5547b());
    }

    /* renamed from: b */
    public void m28547b(AbstractC5549d dVar) {
        this.f10638m.add(dVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        m28531r();
        super.dispatchDraw(canvas);
    }

    /* renamed from: f */
    public void m28543f() {
        m28532q(new HashSet());
    }

    public int getCheckedButtonId() {
        if (!this.f10642q || this.f10645t.isEmpty()) {
            return -1;
        }
        return this.f10645t.iterator().next().intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id2 = m28541h(i).getId();
            if (this.f10645t.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f10640o;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w(f10634u, "Child order wasn't updated");
        return i2;
    }

    /* renamed from: l */
    public boolean m28537l() {
        return this.f10642q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m28536m(MaterialButton materialButton, boolean z) {
        if (!this.f10641p) {
            m28544e(materialButton.getId(), z);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f10644s;
        if (i != -1) {
            m28532q(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat I0 = AccessibilityNodeInfoCompat.m37408I0(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (m28537l()) {
            i = 1;
        } else {
            i = 2;
        }
        I0.m37385c0(AccessibilityNodeInfoCompat.C2557b.m37333b(1, visibleButtonCount, false, i));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        m28530s();
        m28546c();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f10636k.remove(indexOfChild);
        }
        m28530s();
        m28546c();
    }

    /* renamed from: s */
    void m28530s() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton h = m28541h(i);
            if (h.getVisibility() != 8) {
                C14045k.C14047b v = h.getShapeAppearanceModel().m1914v();
                m28533p(v, m28539j(i, firstVisibleChildIndex, lastVisibleChildIndex));
                h.setShapeAppearanceModel(v.m1892m());
            }
        }
    }

    public void setSelectionRequired(boolean z) {
        this.f10643r = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.f10642q != z) {
            this.f10642q = z;
            m28543f();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialButtonToggleGroup(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.button.MaterialButtonToggleGroup.f10635v
            android.content.Context r7 = p462zb.C14615a.m126c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.f10636k = r7
            com.google.android.material.button.MaterialButtonToggleGroup$e r7 = new com.google.android.material.button.MaterialButtonToggleGroup$e
            r0 = 0
            r7.<init>(r6, r0)
            r6.f10637l = r7
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r6.f10638m = r7
            com.google.android.material.button.MaterialButtonToggleGroup$a r7 = new com.google.android.material.button.MaterialButtonToggleGroup$a
            r7.<init>()
            r6.f10639n = r7
            r7 = 0
            r6.f10641p = r7
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r6.f10645t = r0
            android.content.Context r0 = r6.getContext()
            int[] r2 = p083eb.C6812k.f38154P2
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.C5662m.m27838h(r0, r1, r2, r3, r4, r5)
            int r9 = p083eb.C6812k.f38178S2
            boolean r9 = r8.getBoolean(r9, r7)
            r6.setSingleSelection(r9)
            int r9 = p083eb.C6812k.f38162Q2
            r0 = -1
            int r9 = r8.getResourceId(r9, r0)
            r6.f10644s = r9
            int r9 = p083eb.C6812k.f38170R2
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f10643r = r7
            r7 = 1
            r6.setChildrenDrawingOrderEnabled(r7)
            r8.recycle()
            androidx.core.view.C2733w0.m37064A0(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButtonToggleGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
