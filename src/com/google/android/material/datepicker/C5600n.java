package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.view.C2733w0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C5576h;
import p083eb.C6807f;
import p083eb.C6809h;

/* renamed from: com.google.android.material.datepicker.n */
/* loaded from: classes3.dex */
class C5600n extends RecyclerView.Adapter<C5602b> {

    /* renamed from: a */
    private final C5566a f10867a;

    /* renamed from: b */
    private final AbstractC5571d<?> f10868b;

    /* renamed from: c */
    private final C5576h.AbstractC5587l f10869c;

    /* renamed from: d */
    private final int f10870d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.n$a */
    /* loaded from: classes3.dex */
    public class C5601a implements AdapterView.OnItemClickListener {

        /* renamed from: k */
        final /* synthetic */ MaterialCalendarGridView f10871k;

        C5601a(MaterialCalendarGridView materialCalendarGridView) {
            this.f10871k = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.f10871k.getAdapter2().m28132n(i)) {
                C5600n.this.f10869c.mo28183a(this.f10871k.getAdapter2().getItem(i).longValue());
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.n$b */
    /* loaded from: classes3.dex */
    public static class C5602b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final TextView f10873a;

        /* renamed from: b */
        final MaterialCalendarGridView f10874b;

        C5602b(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(C6807f.f14610s);
            this.f10873a = textView;
            C2733w0.m36988r0(textView, true);
            this.f10874b = (MaterialCalendarGridView) linearLayout.findViewById(C6807f.f14606o);
            if (!z) {
                textView.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5600n(Context context, AbstractC5571d<?> dVar, C5566a aVar, C5576h.AbstractC5587l lVar) {
        int i;
        C5597l u = aVar.m28233u();
        C5597l p = aVar.m28236p();
        C5597l t = aVar.m28234t();
        if (u.compareTo(t) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (t.compareTo(p) <= 0) {
            int s = C5599m.f10861p * C5576h.m28192s(context);
            if (C5588i.m28166t(context)) {
                i = C5576h.m28192s(context);
            } else {
                i = 0;
            }
            this.f10870d = s + i;
            this.f10867a = aVar;
            this.f10868b = dVar;
            this.f10869c = lVar;
            setHasStableIds(true);
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C5597l m28130b(int i) {
        return this.f10867a.m28233u().m28149u(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public CharSequence m28129c(int i) {
        return m28130b(i).m28151r();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m28128d(C5597l lVar) {
        return this.f10867a.m28233u().m28148z(lVar);
    }

    /* renamed from: e */
    public void onBindViewHolder(C5602b bVar, int i) {
        C5597l u = this.f10867a.m28233u().m28149u(i);
        bVar.f10873a.setText(u.m28151r());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f10874b.findViewById(C6807f.f14606o);
        if (materialCalendarGridView.getAdapter2() == null || !u.equals(materialCalendarGridView.getAdapter2().f10862k)) {
            C5599m mVar = new C5599m(u, this.f10868b, this.f10867a);
            materialCalendarGridView.setNumColumns(u.f10857n);
            materialCalendarGridView.setAdapter((ListAdapter) mVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter2().m28133m(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new C5601a(materialCalendarGridView));
    }

    /* renamed from: f */
    public C5602b onCreateViewHolder(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C6809h.f14634n, viewGroup, false);
        if (!C5588i.m28166t(viewGroup.getContext())) {
            return new C5602b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.C3109i(-1, this.f10870d));
        return new C5602b(linearLayout, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f10867a.m28235r();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return this.f10867a.m28233u().m28149u(i).m28150t();
    }
}
