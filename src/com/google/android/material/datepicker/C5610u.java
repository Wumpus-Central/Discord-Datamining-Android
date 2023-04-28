package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C5576h;
import java.util.Calendar;
import java.util.Locale;
import p083eb.C6809h;
import p083eb.C6810i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.datepicker.u */
/* loaded from: classes3.dex */
public class C5610u extends RecyclerView.Adapter<C5612b> {

    /* renamed from: a */
    private final C5576h<?> f10881a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.u$a */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC5611a implements View.OnClickListener {

        /* renamed from: k */
        final /* synthetic */ int f10882k;

        View$OnClickListenerC5611a(int i) {
            this.f10882k = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5610u.this.f10881a.m28187x(C5610u.this.f10881a.m28196o().m28238i(C5597l.m28157b(this.f10882k, C5610u.this.f10881a.m28194q().f10855l)));
            C5610u.this.f10881a.m28186y(C5576h.EnumC5586k.DAY);
        }
    }

    /* renamed from: com.google.android.material.datepicker.u$b */
    /* loaded from: classes3.dex */
    public static class C5612b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final TextView f10884a;

        C5612b(TextView textView) {
            super(textView);
            this.f10884a = textView;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5610u(C5576h<?> hVar) {
        this.f10881a = hVar;
    }

    /* renamed from: b */
    private View.OnClickListener m28103b(int i) {
        return new View$OnClickListenerC5611a(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m28102c(int i) {
        return i - this.f10881a.m28196o().m28233u().f10856m;
    }

    /* renamed from: d */
    int m28101d(int i) {
        return this.f10881a.m28196o().m28233u().f10856m + i;
    }

    /* renamed from: e */
    public void onBindViewHolder(C5612b bVar, int i) {
        C5569b bVar2;
        int d = m28101d(i);
        String string = bVar.f10884a.getContext().getString(C6810i.f14649k);
        bVar.f10884a.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(d)));
        bVar.f10884a.setContentDescription(String.format(string, Integer.valueOf(d)));
        C5570c p = this.f10881a.m28195p();
        Calendar i2 = C5609t.m28109i();
        if (i2.get(1) == d) {
            bVar2 = p.f10785f;
        } else {
            bVar2 = p.f10783d;
        }
        for (Long l : this.f10881a.m28193r().m28221J()) {
            i2.setTimeInMillis(l.longValue());
            if (i2.get(1) == d) {
                bVar2 = p.f10784e;
            }
        }
        bVar2.m28224d(bVar.f10884a);
        bVar.f10884a.setOnClickListener(m28103b(d));
    }

    /* renamed from: f */
    public C5612b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C5612b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C6809h.f14636p, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f10881a.m28196o().m28232w();
    }
}
