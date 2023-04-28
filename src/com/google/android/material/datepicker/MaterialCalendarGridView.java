package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.util.C2515e;
import androidx.core.view.C2549a;
import androidx.core.view.C2733w0;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.internal.C5665o;
import java.util.Calendar;
import java.util.Iterator;
import p083eb.C6807f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class MaterialCalendarGridView extends GridView {

    /* renamed from: k */
    private final Calendar f10759k;

    /* renamed from: l */
    private final boolean f10760l;

    /* renamed from: com.google.android.material.datepicker.MaterialCalendarGridView$a */
    /* loaded from: classes3.dex */
    class C5565a extends C2549a {
        C5565a() {
        }

        @Override // androidx.core.view.C2549a
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.m37385c0(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m28247a(int i, Rect rect) {
        if (i == 33) {
            setSelection(getAdapter2().m28137i());
        } else if (i == 130) {
            setSelection(getAdapter2().m28144b());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    /* renamed from: c */
    private View m28245c(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    /* renamed from: d */
    private static int m28244d(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    /* renamed from: e */
    private static boolean m28243e(Long l, Long l2, Long l3, Long l4) {
        return l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue();
    }

    /* renamed from: b */
    public C5599m getAdapter2() {
        return (C5599m) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter2().notifyDataSetChanged();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        C5599m b = getAdapter2();
        AbstractC5571d<?> dVar = b.f10863l;
        C5570c cVar = b.f10865n;
        int max = Math.max(b.m28144b(), getFirstVisiblePosition());
        int min = Math.min(b.m28137i(), getLastVisiblePosition());
        Long c = b.getItem(max);
        Long c2 = b.getItem(min);
        Iterator<C2515e<Long, Long>> it = dVar.m28217y().iterator();
        while (it.hasNext()) {
            C2515e<Long, Long> next = it.next();
            Long l = next.f3485a;
            if (l == null) {
                materialCalendarGridView = this;
            } else if (next.f3486b != null) {
                long longValue = l.longValue();
                long longValue2 = next.f3486b.longValue();
                if (!m28243e(c, c2, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                    boolean e = C5665o.m27826e(this);
                    if (longValue < c.longValue()) {
                        if (b.m28140f(max)) {
                            i10 = 0;
                        } else if (!e) {
                            i10 = materialCalendarGridView.m28245c(max - 1).getRight();
                        } else {
                            i10 = materialCalendarGridView.m28245c(max - 1).getLeft();
                        }
                        i = i10;
                        i2 = max;
                    } else {
                        materialCalendarGridView.f10759k.setTimeInMillis(longValue);
                        i2 = b.m28145a(materialCalendarGridView.f10759k.get(5));
                        i = m28244d(materialCalendarGridView.m28245c(i2));
                    }
                    if (longValue2 > c2.longValue()) {
                        if (b.m28139g(min)) {
                            i9 = getWidth();
                        } else if (!e) {
                            i9 = materialCalendarGridView.m28245c(min).getRight();
                        } else {
                            i9 = materialCalendarGridView.m28245c(min).getLeft();
                        }
                        i3 = i9;
                        i4 = min;
                    } else {
                        materialCalendarGridView.f10759k.setTimeInMillis(longValue2);
                        i4 = b.m28145a(materialCalendarGridView.f10759k.get(5));
                        i3 = m28244d(materialCalendarGridView.m28245c(i4));
                    }
                    int itemId = (int) b.getItemId(i2);
                    int itemId2 = (int) b.getItemId(i4);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        int numColumns2 = (numColumns + getNumColumns()) - 1;
                        View c3 = materialCalendarGridView.m28245c(numColumns);
                        int top = c3.getTop() + cVar.f10780a.m28225c();
                        int bottom = c3.getBottom() - cVar.f10780a.m28226b();
                        if (!e) {
                            if (numColumns > i2) {
                                i6 = 0;
                            } else {
                                i6 = i;
                            }
                            if (i4 > numColumns2) {
                                i5 = getWidth();
                            } else {
                                i5 = i3;
                            }
                        } else {
                            if (i4 > numColumns2) {
                                i7 = 0;
                            } else {
                                i7 = i3;
                            }
                            if (numColumns > i2) {
                                i8 = getWidth();
                            } else {
                                i8 = i;
                            }
                            i5 = i8;
                            i6 = i7;
                        }
                        canvas.drawRect(i6, top, i5, bottom, cVar.f10787h);
                        itemId++;
                        materialCalendarGridView = this;
                        it = it;
                        b = b;
                    }
                    materialCalendarGridView = this;
                    max = max;
                    min = min;
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            m28247a(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter2().m28144b()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter2().m28144b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f10760l) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i) {
        if (i < getAdapter2().m28144b()) {
            super.setSelection(getAdapter2().m28144b());
        } else {
            super.setSelection(i);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10759k = C5609t.m28107k();
        if (C5588i.m28166t(getContext())) {
            setNextFocusLeftId(C6807f.f14592a);
            setNextFocusRightId(C6807f.f14594c);
        }
        this.f10760l = C5588i.m28165u(getContext());
        C2733w0.m36990q0(this, new C5565a());
    }

    @Override // android.widget.GridView, android.widget.AbsListView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof C5599m) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), C5599m.class.getCanonicalName()));
    }
}
