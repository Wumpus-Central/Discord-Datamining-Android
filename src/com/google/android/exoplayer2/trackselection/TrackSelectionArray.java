package com.google.android.exoplayer2.trackselection;

import java.util.Arrays;
import p029b9.AbstractC3421k;

/* loaded from: classes5.dex */
public final class TrackSelectionArray {

    /* renamed from: a */
    public final int f9544a;

    /* renamed from: b */
    private final AbstractC3421k[] f9545b;

    /* renamed from: c */
    private int f9546c;

    public TrackSelectionArray(AbstractC3421k... kVarArr) {
        this.f9545b = kVarArr;
        this.f9544a = kVarArr.length;
    }

    /* renamed from: a */
    public AbstractC3421k m29828a(int i) {
        return this.f9545b[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackSelectionArray.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f9545b, ((TrackSelectionArray) obj).f9545b);
    }

    public int hashCode() {
        if (this.f9546c == 0) {
            this.f9546c = 527 + Arrays.hashCode(this.f9545b);
        }
        return this.f9546c;
    }
}
