package com.discord.image.dominant_color;

import android.graphics.Bitmap;
import android.util.Base64;
import com.facebook.react.bridge.Promise;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "bitmap", "Landroid/graphics/Bitmap;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class ImageManagerModule$getAvatarBase64$1 extends s implements Function1<Bitmap, Unit> {
    final  Promise $promise;

    
    
    public ImageManagerModule$getAvatarBase64$1(Promise promise) {
        super(1);
        this.$promise = promise;
    }

    @Override 
    public   Unit invoke(Bitmap bitmap) {
        invoke2(bitmap);
        return Unit.f20664a;
    }

    
    public final void invoke2(Bitmap bitmap) {
        if (bitmap != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
            this.$promise.resolve(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0));
            return;
        }
        this.$promise.reject(new Exception("Unable to decode image source."));
    }
}
