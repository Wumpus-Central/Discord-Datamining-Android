package p232mf;

import android.graphics.Bitmap;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import p216lf.C10411c;

@Metadata(m15074d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\f¨\u0006\u0018"}, m15073d2 = {"Lmf/b;", "Lmf/a;", "Ljava/io/File;", "imageFile", "", "isSatisfied", "satisfy", "a", "Z", "isResolved", "", "b", "I", "width", "c", "height", "Landroid/graphics/Bitmap$CompressFormat;", "d", "Landroid/graphics/Bitmap$CompressFormat;", "format", "e", "quality", "<init>", "(IILandroid/graphics/Bitmap$CompressFormat;I)V", "compressor_release"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: mf.b */
/* loaded from: classes8.dex */
public final class C10595b implements AbstractC10594a {

    /* renamed from: a */
    private boolean f23454a;

    /* renamed from: b */
    private final int f23455b;

    /* renamed from: c */
    private final int f23456c;

    /* renamed from: d */
    private final Bitmap.CompressFormat f23457d;

    /* renamed from: e */
    private final int f23458e;

    public C10595b(int i, int i2, Bitmap.CompressFormat format, int i3) {
        C9971q.m14632h(format, "format");
        this.f23455b = i;
        this.f23456c = i2;
        this.f23457d = format;
        this.f23458e = i3;
    }

    @Override // p232mf.AbstractC10594a
    public boolean isSatisfied(File imageFile) {
        C9971q.m14632h(imageFile, "imageFile");
        return this.f23454a;
    }

    @Override // p232mf.AbstractC10594a
    public File satisfy(File imageFile) {
        C9971q.m14632h(imageFile, "imageFile");
        File j = C10411c.m13462j(imageFile, C10411c.m13466f(imageFile, C10411c.m13467e(imageFile, this.f23455b, this.f23456c)), this.f23457d, this.f23458e);
        this.f23454a = true;
        return j;
    }
}
