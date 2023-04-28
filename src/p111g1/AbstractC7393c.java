package p111g1;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: g1.c */
/* loaded from: classes.dex */
public abstract class AbstractC7393c extends AbstractC7389a {

    /* renamed from: s */
    private int f15931s;

    /* renamed from: t */
    private int f15932t;

    /* renamed from: u */
    private LayoutInflater f15933u;

    @Deprecated
    public AbstractC7393c(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f15932t = i;
        this.f15931s = i;
        this.f15933u = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // p111g1.AbstractC7389a
    /* renamed from: f */
    public View mo22751f(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f15933u.inflate(this.f15932t, viewGroup, false);
    }

    @Override // p111g1.AbstractC7389a
    /* renamed from: g */
    public View mo22750g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f15933u.inflate(this.f15931s, viewGroup, false);
    }
}
