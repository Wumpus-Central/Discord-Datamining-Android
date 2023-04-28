package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.datepicker.m */
/* loaded from: classes3.dex */
public class C5599m extends BaseAdapter {

    /* renamed from: p */
    static final int f10861p = C5609t.m28107k().getMaximum(4);

    /* renamed from: k */
    final C5597l f10862k;

    /* renamed from: l */
    final AbstractC5571d<?> f10863l;

    /* renamed from: m */
    private Collection<Long> f10864m;

    /* renamed from: n */
    C5570c f10865n;

    /* renamed from: o */
    final C5566a f10866o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5599m(C5597l lVar, AbstractC5571d<?> dVar, C5566a aVar) {
        this.f10862k = lVar;
        this.f10863l = dVar;
        this.f10866o = aVar;
        this.f10864m = dVar.m28221J();
    }

    /* renamed from: e */
    private void m28141e(Context context) {
        if (this.f10865n == null) {
            this.f10865n = new C5570c(context);
        }
    }

    /* renamed from: h */
    private boolean m28138h(long j) {
        for (Long l : this.f10863l.m28221J()) {
            if (C5609t.m28117a(j) == C5609t.m28117a(l.longValue())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    private void m28135k(TextView textView, long j) {
        C5569b bVar;
        if (textView != null) {
            if (this.f10866o.m28237j().mo28210o(j)) {
                textView.setEnabled(true);
                if (m28138h(j)) {
                    bVar = this.f10865n.f10781b;
                } else if (C5609t.m28109i().getTimeInMillis() == j) {
                    bVar = this.f10865n.f10782c;
                } else {
                    bVar = this.f10865n.f10780a;
                }
            } else {
                textView.setEnabled(false);
                bVar = this.f10865n.f10786g;
            }
            bVar.m28224d(textView);
        }
    }

    /* renamed from: l */
    private void m28134l(MaterialCalendarGridView materialCalendarGridView, long j) {
        if (C5597l.m28156e(j).equals(this.f10862k)) {
            m28135k((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter2().m28145a(this.f10862k.m28152p(j)) - materialCalendarGridView.getFirstVisiblePosition()), j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m28145a(int i) {
        return m28144b() + (i - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m28144b() {
        return this.f10862k.m28154i();
    }

    /* renamed from: c */
    public Long getItem(int i) {
        if (i < this.f10862k.m28154i() || i > m28137i()) {
            return null;
        }
        return Long.valueOf(this.f10862k.m28153j(m28136j(i)));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.m28141e(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x001e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = p083eb.C6809h.f14631k
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x001e:
            int r7 = r5.m28144b()
            int r7 = r6 - r7
            if (r7 < 0) goto L_0x0075
            com.google.android.material.datepicker.l r8 = r5.f10862k
            int r2 = r8.f10858o
            if (r7 < r2) goto L_0x002d
            goto L_0x0075
        L_0x002d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            com.google.android.material.datepicker.l r8 = r5.f10862k
            long r7 = r8.m28153j(r7)
            com.google.android.material.datepicker.l r3 = r5.f10862k
            int r3 = r3.f10856m
            com.google.android.material.datepicker.l r4 = com.google.android.material.datepicker.C5597l.m28155f()
            int r4 = r4.f10856m
            if (r3 != r4) goto L_0x0067
            java.lang.String r7 = com.google.android.material.datepicker.C5572e.m28216a(r7)
            r0.setContentDescription(r7)
            goto L_0x006e
        L_0x0067:
            java.lang.String r7 = com.google.android.material.datepicker.C5572e.m28213d(r7)
            r0.setContentDescription(r7)
        L_0x006e:
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L_0x007d
        L_0x0075:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L_0x007d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L_0x0084
            return r0
        L_0x0084:
            long r6 = r6.longValue()
            r5.m28135k(r0, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.C5599m.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean m28140f(int i) {
        return i % this.f10862k.f10857n == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean m28139g(int i) {
        return (i + 1) % this.f10862k.f10857n == 0;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f10862k.f10858o + m28144b();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i / this.f10862k.f10857n;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int m28137i() {
        return (this.f10862k.m28154i() + this.f10862k.f10858o) - 1;
    }

    /* renamed from: j */
    int m28136j(int i) {
        return (i - this.f10862k.m28154i()) + 1;
    }

    /* renamed from: m */
    public void m28133m(MaterialCalendarGridView materialCalendarGridView) {
        for (Long l : this.f10864m) {
            m28134l(materialCalendarGridView, l.longValue());
        }
        AbstractC5571d<?> dVar = this.f10863l;
        if (dVar != null) {
            for (Long l2 : dVar.m28221J()) {
                m28134l(materialCalendarGridView, l2.longValue());
            }
            this.f10864m = this.f10863l.m28221J();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean m28132n(int i) {
        return i >= m28144b() && i <= m28137i();
    }
}
