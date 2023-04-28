package com.google.android.material.chip;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.C2733w0;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.internal.C5642a;
import com.google.android.material.internal.C5648e;
import java.util.List;
import java.util.Set;
import p083eb.C6803b;
import p083eb.C6811j;

/* loaded from: classes3.dex */
public class ChipGroup extends C5648e {

    /* renamed from: u */
    private static final int f10722u = C6811j.f14666l;

    /* renamed from: o */
    private int f10723o;

    /* renamed from: p */
    private int f10724p;

    /* renamed from: q */
    private AbstractC5562e f10725q;

    /* renamed from: r */
    private final C5642a<Chip> f10726r;

    /* renamed from: s */
    private final int f10727s;

    /* renamed from: t */
    private final ViewGroup$OnHierarchyChangeListenerC5563f f10728t;

    /* renamed from: com.google.android.material.chip.ChipGroup$a */
    /* loaded from: classes3.dex */
    class C5558a implements C5642a.AbstractC5643b {
        C5558a() {
        }

        @Override // com.google.android.material.internal.C5642a.AbstractC5643b
        /* renamed from: a */
        public void mo27943a(Set<Integer> set) {
            if (ChipGroup.this.f10725q != null) {
                AbstractC5562e eVar = ChipGroup.this.f10725q;
                ChipGroup chipGroup = ChipGroup.this;
                eVar.mo28388a(chipGroup, chipGroup.f10726r.m27953j(ChipGroup.this));
            }
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$b */
    /* loaded from: classes3.dex */
    class C5559b implements AbstractC5562e {
        C5559b(AbstractC5561d dVar) {
        }

        @Override // com.google.android.material.chip.ChipGroup.AbstractC5562e
        /* renamed from: a */
        public void mo28388a(ChipGroup chipGroup, List<Integer> list) {
            if (ChipGroup.this.f10726r.m27951l()) {
                ChipGroup.this.getCheckedChipId();
                throw null;
            }
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$c */
    /* loaded from: classes3.dex */
    public static class C5560c extends ViewGroup.MarginLayoutParams {
        public C5560c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C5560c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C5560c(int i, int i2) {
            super(i, i2);
        }
    }

    @Deprecated
    /* renamed from: com.google.android.material.chip.ChipGroup$d */
    /* loaded from: classes3.dex */
    public interface AbstractC5561d {
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$e */
    /* loaded from: classes3.dex */
    public interface AbstractC5562e {
        /* renamed from: a */
        void mo28388a(ChipGroup chipGroup, List<Integer> list);
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$f */
    /* loaded from: classes3.dex */
    private class ViewGroup$OnHierarchyChangeListenerC5563f implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: k */
        private ViewGroup.OnHierarchyChangeListener f10731k;

        private ViewGroup$OnHierarchyChangeListenerC5563f() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(C2733w0.m37003k());
                }
                ChipGroup.this.f10726r.m27958e((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f10731k;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                chipGroup.f10726r.m27949n((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f10731k;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }

        /* synthetic */ ViewGroup$OnHierarchyChangeListenerC5563f(ChipGroup chipGroup, C5558a aVar) {
            this();
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6803b.f14531e);
    }

    private int getChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                i++;
            }
        }
        return i;
    }

    @Override // com.google.android.material.internal.C5648e
    /* renamed from: c */
    public boolean mo27870c() {
        return super.mo27870c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C5560c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m28390g(View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                if (((Chip) getChildAt(i2)) == view) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C5560c(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C5560c(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.f10726r.m27952k();
    }

    public List<Integer> getCheckedChipIds() {
        return this.f10726r.m27953j(this);
    }

    public int getChipSpacingHorizontal() {
        return this.f10723o;
    }

    public int getChipSpacingVertical() {
        return this.f10724p;
    }

    /* renamed from: h */
    public boolean m28389h() {
        return this.f10726r.m27951l();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f10727s;
        if (i != -1) {
            this.f10726r.m27957f(i);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        int i2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat I0 = AccessibilityNodeInfoCompat.m37408I0(accessibilityNodeInfo);
        if (mo27870c()) {
            i = getChipCount();
        } else {
            i = -1;
        }
        int rowCount = getRowCount();
        if (m28389h()) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        I0.m37385c0(AccessibilityNodeInfoCompat.C2557b.m37333b(rowCount, i, false, i2));
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.f10723o != i) {
            this.f10723o = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.f10724p != i) {
            this.f10724p = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(AbstractC5561d dVar) {
        if (dVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new C5559b(dVar));
        }
    }

    public void setOnCheckedStateChangeListener(AbstractC5562e eVar) {
        this.f10725q = eVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f10728t.f10731k = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.f10726r.m27947p(z);
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // com.google.android.material.internal.C5648e
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(boolean z) {
        this.f10726r.m27946q(z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ChipGroup(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r4 = com.google.android.material.chip.ChipGroup.f10722u
            android.content.Context r9 = p462zb.C14615a.m126c(r9, r10, r11, r4)
            r8.<init>(r9, r10, r11)
            com.google.android.material.internal.a r9 = new com.google.android.material.internal.a
            r9.<init>()
            r8.f10726r = r9
            com.google.android.material.chip.ChipGroup$f r6 = new com.google.android.material.chip.ChipGroup$f
            r0 = 0
            r6.<init>(r8, r0)
            r8.f10728t = r6
            android.content.Context r0 = r8.getContext()
            int[] r2 = p083eb.C6812k.f14703d1
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r10
            r3 = r11
            android.content.res.TypedArray r10 = com.google.android.material.internal.C5662m.m27838h(r0, r1, r2, r3, r4, r5)
            int r11 = p083eb.C6812k.f14719f1
            int r11 = r10.getDimensionPixelOffset(r11, r7)
            int r0 = p083eb.C6812k.f14727g1
            int r0 = r10.getDimensionPixelOffset(r0, r11)
            r8.setChipSpacingHorizontal(r0)
            int r0 = p083eb.C6812k.f14735h1
            int r11 = r10.getDimensionPixelOffset(r0, r11)
            r8.setChipSpacingVertical(r11)
            int r11 = p083eb.C6812k.f14751j1
            boolean r11 = r10.getBoolean(r11, r7)
            r8.setSingleLine(r11)
            int r11 = p083eb.C6812k.f14759k1
            boolean r11 = r10.getBoolean(r11, r7)
            r8.setSingleSelection(r11)
            int r11 = p083eb.C6812k.f14743i1
            boolean r11 = r10.getBoolean(r11, r7)
            r8.setSelectionRequired(r11)
            int r11 = p083eb.C6812k.f14711e1
            r0 = -1
            int r11 = r10.getResourceId(r11, r0)
            r8.f10727s = r11
            r10.recycle()
            com.google.android.material.chip.ChipGroup$a r10 = new com.google.android.material.chip.ChipGroup$a
            r10.<init>()
            r9.m27948o(r10)
            super.setOnHierarchyChangeListener(r6)
            r9 = 1
            androidx.core.view.C2733w0.m37064A0(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C5560c(layoutParams);
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
