package com.facebook.imagepipeline.datasource;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.AbstractC4779b;
import com.facebook.datasource.DataSource;
import p380v5.AbstractC13431b;
import p380v5.AbstractC13432c;

/* renamed from: com.facebook.imagepipeline.datasource.b */
/* loaded from: classes7.dex */
public abstract class AbstractC4910b extends AbstractC4779b<CloseableReference<AbstractC13432c>> {
    protected abstract void onNewResultImpl(Bitmap bitmap);

    @Override // com.facebook.datasource.AbstractC4779b
    public void onNewResultImpl(DataSource<CloseableReference<AbstractC13432c>> dataSource) {
        Bitmap bitmap;
        if (dataSource.mo32020a()) {
            CloseableReference<AbstractC13432c> g = dataSource.mo31326g();
            if (g == null || !(g.m32039C() instanceof AbstractC13431b)) {
                bitmap = null;
            } else {
                bitmap = ((AbstractC13431b) g.m32039C()).mo3732n();
            }
            try {
                onNewResultImpl(bitmap);
            } finally {
                CloseableReference.m32025t(g);
            }
        }
    }
}
