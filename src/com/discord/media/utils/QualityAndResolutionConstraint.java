package com.discord.media.utils;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import p216lf.C10411c;
import p232mf.AbstractC10594a;

@Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\u000f"}, m15073d2 = {"Lcom/discord/media/utils/QualityAndResolutionConstraint;", "Lmf/a;", "Ljava/io/File;", "imageFile", "", "isSatisfied", "satisfy", "", "quality", "I", "shouldResize", "Z", "isResolved", "<init>", "(IZ)V", "media_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class QualityAndResolutionConstraint implements AbstractC10594a {
    private boolean isResolved;
    private final int quality;
    private final boolean shouldResize;

    public QualityAndResolutionConstraint(int i, boolean z) {
        this.quality = i;
        this.shouldResize = z;
    }

    @Override // p232mf.AbstractC10594a
    public boolean isSatisfied(File imageFile) {
        C9971q.m14633g(imageFile, "imageFile");
        return this.isResolved;
    }

    @Override // p232mf.AbstractC10594a
    public File satisfy(File imageFile) {
        File file;
        C9971q.m14633g(imageFile, "imageFile");
        if (this.shouldResize) {
            file = C10411c.m13461k(imageFile, C10411c.m13466f(imageFile, C10411c.m13467e(imageFile, 612, 816)), null, this.quality, 4, null);
        } else {
            file = C10411c.m13461k(imageFile, C10411c.m13463i(imageFile), null, this.quality, 4, null);
        }
        this.isResolved = true;
        return file;
    }
}
