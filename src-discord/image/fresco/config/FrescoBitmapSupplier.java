package com.discord.image.fresco.config;

import com.facebook.imagepipeline.cache.MemoryCacheParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p4.j;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/discord/image/fresco/config/FrescoBitmapSupplier;", "Lp4/j;", "Lcom/facebook/imagepipeline/cache/MemoryCacheParams;", "get", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "fresco_release"}, k = 1, mv = {1, 8, 0})

public final class FrescoBitmapSupplier extends j {
    public static final Companion Companion = new Companion(null);
    private static final int MAX_BITMAP_MEM_CACHE_SIZE_RATIO = 3;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/discord/image/fresco/config/FrescoBitmapSupplier$Companion;", "", "()V", "MAX_BITMAP_MEM_CACHE_SIZE_RATIO", "", "fresco_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    
    
    public FrescoBitmapSupplier(android.content.Context r2) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.image.fresco.config.FrescoBitmapSupplier.<init>(android.content.Context):void");
    }

    
    @Override 
    public MemoryCacheParams get() {
        MemoryCacheParams memoryCacheParams = super.get();
        int i10 = memoryCacheParams.f7818a;
        return new MemoryCacheParams(i10, memoryCacheParams.f7819b, memoryCacheParams.f7820c, memoryCacheParams.f7821d, i10 / 3);
    }
}
