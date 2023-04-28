package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.util.C2513d;
import java.util.Arrays;

/* renamed from: com.google.android.material.datepicker.a */
/* loaded from: classes3.dex */
public final class C5566a implements Parcelable {
    public static final Parcelable.Creator<C5566a> CREATOR = new C0155a();

    /* renamed from: k */
    private final C5597l f10762k;

    /* renamed from: l */
    private final C5597l f10763l;

    /* renamed from: m */
    private final AbstractC5568c f10764m;

    /* renamed from: n */
    private C5597l f10765n;

    /* renamed from: o */
    private final int f10766o;

    /* renamed from: p */
    private final int f10767p;

    /* renamed from: com.google.android.material.datepicker.a$a */
    /* loaded from: classes3.dex */
    class C0155a implements Parcelable.Creator<C5566a> {
        C0155a() {
        }

        /* renamed from: a */
        public C5566a createFromParcel(Parcel parcel) {
            return new C5566a((C5597l) parcel.readParcelable(C5597l.class.getClassLoader()), (C5597l) parcel.readParcelable(C5597l.class.getClassLoader()), (AbstractC5568c) parcel.readParcelable(AbstractC5568c.class.getClassLoader()), (C5597l) parcel.readParcelable(C5597l.class.getClassLoader()), null);
        }

        /* renamed from: b */
        public C5566a[] newArray(int i) {
            return new C5566a[i];
        }
    }

    /* renamed from: com.google.android.material.datepicker.a$b */
    /* loaded from: classes3.dex */
    public static final class C5567b {

        /* renamed from: e */
        static final long f10768e = C5609t.m28117a(C5597l.m28157b(1900, 0).f10859p);

        /* renamed from: f */
        static final long f10769f = C5609t.m28117a(C5597l.m28157b(2100, 11).f10859p);

        /* renamed from: a */
        private long f10770a;

        /* renamed from: b */
        private long f10771b;

        /* renamed from: c */
        private Long f10772c;

        /* renamed from: d */
        private AbstractC5568c f10773d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C5567b(C5566a aVar) {
            this.f10770a = f10768e;
            this.f10771b = f10769f;
            this.f10773d = C5573f.m28211a(Long.MIN_VALUE);
            this.f10770a = aVar.f10762k.f10859p;
            this.f10771b = aVar.f10763l.f10859p;
            this.f10772c = Long.valueOf(aVar.f10765n.f10859p);
            this.f10773d = aVar.f10764m;
        }

        /* renamed from: a */
        public C5566a m28229a() {
            C5597l lVar;
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f10773d);
            C5597l e = C5597l.m28156e(this.f10770a);
            C5597l e2 = C5597l.m28156e(this.f10771b);
            AbstractC5568c cVar = (AbstractC5568c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l = this.f10772c;
            if (l == null) {
                lVar = null;
            } else {
                lVar = C5597l.m28156e(l.longValue());
            }
            return new C5566a(e, e2, cVar, lVar, null);
        }

        /* renamed from: b */
        public C5567b m28228b(long j) {
            this.f10772c = Long.valueOf(j);
            return this;
        }
    }

    /* renamed from: com.google.android.material.datepicker.a$c */
    /* loaded from: classes3.dex */
    public interface AbstractC5568c extends Parcelable {
        /* renamed from: o */
        boolean mo28210o(long j);
    }

    /* synthetic */ C5566a(C5597l lVar, C5597l lVar2, AbstractC5568c cVar, C5597l lVar3, C0155a aVar) {
        this(lVar, lVar2, cVar, lVar3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5566a)) {
            return false;
        }
        C5566a aVar = (C5566a) obj;
        if (!this.f10762k.equals(aVar.f10762k) || !this.f10763l.equals(aVar.f10763l) || !C2513d.m37601a(this.f10765n, aVar.f10765n) || !this.f10764m.equals(aVar.f10764m)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10762k, this.f10763l, this.f10765n, this.f10764m});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C5597l m28238i(C5597l lVar) {
        if (lVar.compareTo(this.f10762k) < 0) {
            return this.f10762k;
        }
        if (lVar.compareTo(this.f10763l) > 0) {
            return this.f10763l;
        }
        return lVar;
    }

    /* renamed from: j */
    public AbstractC5568c m28237j() {
        return this.f10764m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public C5597l m28236p() {
        return this.f10763l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public int m28235r() {
        return this.f10767p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public C5597l m28234t() {
        return this.f10765n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public C5597l m28233u() {
        return this.f10762k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public int m28232w() {
        return this.f10766o;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f10762k, 0);
        parcel.writeParcelable(this.f10763l, 0);
        parcel.writeParcelable(this.f10765n, 0);
        parcel.writeParcelable(this.f10764m, 0);
    }

    private C5566a(C5597l lVar, C5597l lVar2, AbstractC5568c cVar, C5597l lVar3) {
        this.f10762k = lVar;
        this.f10763l = lVar2;
        this.f10765n = lVar3;
        this.f10764m = cVar;
        if (lVar3 != null && lVar.compareTo(lVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (lVar3 == null || lVar3.compareTo(lVar2) <= 0) {
            this.f10767p = lVar.m28148z(lVar2) + 1;
            this.f10766o = (lVar2.f10856m - lVar.f10856m) + 1;
        } else {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
    }
}
