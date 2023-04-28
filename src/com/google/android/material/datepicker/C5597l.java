package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.datepicker.l */
/* loaded from: classes3.dex */
public final class C5597l implements Comparable<C5597l>, Parcelable {
    public static final Parcelable.Creator<C5597l> CREATOR = new C5598a();

    /* renamed from: k */
    private final Calendar f10854k;

    /* renamed from: l */
    final int f10855l;

    /* renamed from: m */
    final int f10856m;

    /* renamed from: n */
    final int f10857n;

    /* renamed from: o */
    final int f10858o;

    /* renamed from: p */
    final long f10859p;

    /* renamed from: q */
    private String f10860q;

    /* renamed from: com.google.android.material.datepicker.l$a */
    /* loaded from: classes3.dex */
    class C5598a implements Parcelable.Creator<C5597l> {
        C5598a() {
        }

        /* renamed from: a */
        public C5597l createFromParcel(Parcel parcel) {
            return C5597l.m28157b(parcel.readInt(), parcel.readInt());
        }

        /* renamed from: b */
        public C5597l[] newArray(int i) {
            return new C5597l[i];
        }
    }

    private C5597l(Calendar calendar) {
        calendar.set(5, 1);
        Calendar d = C5609t.m28114d(calendar);
        this.f10854k = d;
        this.f10855l = d.get(2);
        this.f10856m = d.get(1);
        this.f10857n = d.getMaximum(7);
        this.f10858o = d.getActualMaximum(5);
        this.f10859p = d.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C5597l m28157b(int i, int i2) {
        Calendar k = C5609t.m28107k();
        k.set(1, i);
        k.set(2, i2);
        return new C5597l(k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static C5597l m28156e(long j) {
        Calendar k = C5609t.m28107k();
        k.setTimeInMillis(j);
        return new C5597l(k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static C5597l m28155f() {
        return new C5597l(C5609t.m28109i());
    }

    /* renamed from: a */
    public int compareTo(C5597l lVar) {
        return this.f10854k.compareTo(lVar.f10854k);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5597l)) {
            return false;
        }
        C5597l lVar = (C5597l) obj;
        if (this.f10855l == lVar.f10855l && this.f10856m == lVar.f10856m) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10855l), Integer.valueOf(this.f10856m)});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int m28154i() {
        int firstDayOfWeek = this.f10854k.get(7) - this.f10854k.getFirstDayOfWeek();
        if (firstDayOfWeek < 0) {
            return firstDayOfWeek + this.f10857n;
        }
        return firstDayOfWeek;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public long m28153j(int i) {
        Calendar d = C5609t.m28114d(this.f10854k);
        d.set(5, i);
        return d.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public int m28152p(long j) {
        Calendar d = C5609t.m28114d(this.f10854k);
        d.setTimeInMillis(j);
        return d.get(5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public String m28151r() {
        if (this.f10860q == null) {
            this.f10860q = C5572e.m28214c(this.f10854k.getTimeInMillis());
        }
        return this.f10860q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public long m28150t() {
        return this.f10854k.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public C5597l m28149u(int i) {
        Calendar d = C5609t.m28114d(this.f10854k);
        d.add(2, i);
        return new C5597l(d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f10856m);
        parcel.writeInt(this.f10855l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public int m28148z(C5597l lVar) {
        if (this.f10854k instanceof GregorianCalendar) {
            return ((lVar.f10856m - this.f10856m) * 12) + (lVar.f10855l - this.f10855l);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }
}
