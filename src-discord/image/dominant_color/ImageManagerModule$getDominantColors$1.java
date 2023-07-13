package com.discord.image.dominant_color;

import android.graphics.Bitmap;
import com.discord.image.DominantColor;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.facebook.react.bridge.Promise;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "bitmap", "Landroid/graphics/Bitmap;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class ImageManagerModule$getDominantColors$1 extends s implements Function1<Bitmap, Unit> {
    final  Promise $promise;

    
    
    public ImageManagerModule$getDominantColors$1(Promise promise) {
        super(1);
        this.$promise = promise;
    }

    @Override 
    public   Unit invoke(Bitmap bitmap) {
        invoke2(bitmap);
        return Unit.f20663a;
    }

    
    public final void invoke2(Bitmap bitmap) {
        int s10;
        if (bitmap != null) {
            List<Integer> representativeColors = DominantColor.INSTANCE.getRepresentativeColors(bitmap);
            if (representativeColors != null) {
                s10 = k.s(representativeColors, 10);
                ArrayList arrayList = new ArrayList(s10);
                for (Number number : representativeColors) {
                    int intValue = number.intValue();
                    arrayList.add(NativeArrayExtensionsKt.nativeArrayOf(Integer.valueOf((intValue >> 16) & 255), Integer.valueOf((intValue >> 8) & 255), Integer.valueOf(intValue & 255)));
                }
                this.$promise.resolve(NativeArrayExtensionsKt.toNativeArray(arrayList));
                return;
            }
            this.$promise.reject(new Exception("Unable get representative color."));
            return;
        }
        this.$promise.reject(new Exception("Unable to decode image source."));
    }
}
