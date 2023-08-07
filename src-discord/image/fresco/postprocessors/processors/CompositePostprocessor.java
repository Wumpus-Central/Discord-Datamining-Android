package com.discord.image.fresco.postprocessors.processors;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.request.BasePostprocessor;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/discord/image/fresco/postprocessors/processors/CompositePostprocessor;", "Lcom/facebook/imagepipeline/request/BasePostprocessor;", "postprocessors", "", "(Ljava/util/List;)V", "process", "", "destBitmap", "Landroid/graphics/Bitmap;", "sourceBitmap", "fresco_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class CompositePostprocessor extends BasePostprocessor {
    private final List<BasePostprocessor> postprocessors;

    
    public CompositePostprocessor(List<? extends BasePostprocessor> postprocessors) {
        q.h(postprocessors, "postprocessors");
        this.postprocessors = postprocessors;
    }

    @Override 
    public void process(Bitmap destBitmap, Bitmap sourceBitmap) {
        q.h(destBitmap, "destBitmap");
        q.h(sourceBitmap, "sourceBitmap");
        for (BasePostprocessor basePostprocessor : this.postprocessors) {
            basePostprocessor.process(destBitmap, sourceBitmap);
        }
    }
}
