package p353te;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.util.Log;
import androidx.camera.core.ImageProxy;
import androidx.exifinterface.media.C2892a;
import com.facebook.react.util.JSStackTrace;
import com.mrousavy.camera.C6085y;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000 \n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u001a\u0010\t\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\n"}, m15073d2 = {"", "imageBytes", "a", "Landroidx/camera/core/ImageProxy;", "Ljava/io/File;", JSStackTrace.FILE_KEY, "", "flipHorizontally", "", "b", "react-native-vision-camera_release"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: te.m */
/* loaded from: classes6.dex */
public final class C13069m {
    /* renamed from: a */
    public static final byte[] m4660a(byte[] imageBytes) {
        C9971q.m14633g(imageBytes, "imageBytes");
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(imageBytes, 0, imageBytes.length);
        Matrix matrix = new Matrix();
        switch (new C2892a(new ByteArrayInputStream(imageBytes)).m36319h("Orientation", 0)) {
            case 3:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
        }
        Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, true);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createBitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        C9971q.m14634f(byteArray, "stream.toByteArray()");
        return byteArray;
    }

    /* renamed from: b */
    public static final void m4659b(ImageProxy imageProxy, File file, boolean z) {
        C9971q.m14633g(imageProxy, "<this>");
        C9971q.m14633g(file, "file");
        int format = imageProxy.getFormat();
        if (format == 35) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            allocate.putInt(imageProxy.getWidth()).putInt(imageProxy.getHeight()).putInt(imageProxy.mo39701d0()[1].mo39899e()).putInt(imageProxy.mo39701d0()[1].mo39900d());
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(allocate.array());
            for (int i = 0; i < 3; i++) {
                ByteBuffer c = imageProxy.mo39701d0()[i].mo39901c();
                C9971q.m14634f(c, "planes[i].buffer");
                byte[] bArr = new byte[c.remaining()];
                c.get(bArr);
                fileOutputStream.write(bArr);
            }
            fileOutputStream.close();
        } else if (format == 256) {
            ByteBuffer c2 = imageProxy.mo39701d0()[0].mo39901c();
            C9971q.m14634f(c2, "planes[0].buffer");
            byte[] bArr2 = new byte[c2.remaining()];
            c2.get(bArr2);
            if (z) {
                long currentTimeMillis = System.currentTimeMillis();
                bArr2 = m4660a(bArr2);
                Log.i("CameraView.performance", "Flipping Image took " + (System.currentTimeMillis() - currentTimeMillis) + " ms.");
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            fileOutputStream2.write(bArr2);
            fileOutputStream2.close();
        } else {
            throw new C6085y(imageProxy.getFormat());
        }
    }
}
