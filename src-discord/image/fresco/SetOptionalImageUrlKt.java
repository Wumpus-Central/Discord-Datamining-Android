package com.discord.image.fresco;

import android.net.Uri;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.uimanager.ViewProps;
import h4.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import oj.u;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a4\u0010\t\u001a\u00020\u0007*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u001a\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0002¨\u0006\f"}, d2 = {"Lcom/facebook/drawee/view/SimpleDraweeView;", "", "imageUrl", "", "autoPlayAnimations", "Lkotlin/Function1;", "Lcom/facebook/drawee/backends/pipeline/PipelineDraweeControllerBuilder;", "", ViewProps.TRANSFORM, "setOptionalImageUrl", "url", "hasGif", "fresco_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class SetOptionalImageUrlKt {
    private static final boolean hasGif(String str) {
        String lastPathSegment;
        boolean r10;
        Uri o10 = f.o(str);
        if (o10 == null || (lastPathSegment = o10.getLastPathSegment()) == null) {
            return false;
        }
        r10 = u.r(lastPathSegment, ".gif", true);
        return r10;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void setOptionalImageUrl(com.facebook.drawee.view.SimpleDraweeView r2, java.lang.String r3, boolean r4, kotlin.jvm.functions.Function1<? super com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder, kotlin.Unit> r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.q.g(r2, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.q.g(r5, r0)
            r0 = 0
            if (r3 == 0) goto L_0x0016
            boolean r1 = oj.l.w(r3)
            if (r1 == 0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            r1 = r0
            goto L_0x0017
        L_0x0016:
            r1 = 1
        L_0x0017:
            if (r1 != 0) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            r0 = 8
        L_0x001c:
            r2.setVisibility(r0)
            com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder r0 = o4.c.g()
            com.facebook.imagepipeline.request.ImageRequest r3 = com.facebook.imagepipeline.request.ImageRequest.fromUri(r3)
            com.facebook.drawee.controller.AbstractDraweeControllerBuilder r3 = r0.D(r3)
            com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder r3 = (com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder) r3
            com.facebook.drawee.controller.AbstractDraweeControllerBuilder r3 = r3.z(r4)
            java.lang.String r4 = "newDraweeControllerBuild…tions(autoPlayAnimations)"
            kotlin.jvm.internal.q.f(r3, r4)
            r5.invoke(r3)
            com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder r3 = (com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder) r3
            com.facebook.drawee.controller.a r3 = r3.build()
            r2.setController(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.image.fresco.SetOptionalImageUrlKt.setOptionalImageUrl(com.facebook.drawee.view.SimpleDraweeView, java.lang.String, boolean, kotlin.jvm.functions.Function1):void");
    }

    public static /* synthetic */ void setOptionalImageUrl$default(SimpleDraweeView simpleDraweeView, String str, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = hasGif(str);
        }
        if ((i10 & 4) != 0) {
            function1 = SetOptionalImageUrlKt$setOptionalImageUrl$1.INSTANCE;
        }
        setOptionalImageUrl(simpleDraweeView, str, z10, function1);
    }
}
