package com.google.android.exoplayer2.upstream;

import android.content.Context;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSource;
import p081e9.AbstractC6795x;

/* renamed from: com.google.android.exoplayer2.upstream.c */
/* loaded from: classes5.dex */
public final class C5291c implements DataSource.Factory {

    /* renamed from: a */
    private final Context f9778a;

    /* renamed from: b */
    private final AbstractC6795x f9779b;

    /* renamed from: c */
    private final DataSource.Factory f9780c;

    public C5291c(Context context) {
        this(context, (String) null, (AbstractC6795x) null);
    }

    /* renamed from: a */
    public C5290b createDataSource() {
        C5290b bVar = new C5290b(this.f9778a, this.f9780c.createDataSource());
        AbstractC6795x xVar = this.f9779b;
        if (xVar != null) {
            bVar.mo12541c(xVar);
        }
        return bVar;
    }

    public C5291c(Context context, String str, AbstractC6795x xVar) {
        this(context, xVar, new DefaultHttpDataSource.Factory().m29630b(str));
    }

    public C5291c(Context context, AbstractC6795x xVar, DataSource.Factory factory) {
        this.f9778a = context.getApplicationContext();
        this.f9779b = xVar;
        this.f9780c = factory;
    }
}
