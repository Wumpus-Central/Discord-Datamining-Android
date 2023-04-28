package p353te;

import androidx.exifinterface.media.C2892a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, m15073d2 = {"Landroidx/exifinterface/media/a;", "Lcom/facebook/react/bridge/WritableMap;", "a", "react-native-vision-camera_release"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: te.j */
/* loaded from: classes6.dex */
public final class C13066j {
    /* renamed from: a */
    public static final WritableMap m4664a(C2892a aVar) {
        C9971q.m14633g(aVar, "<this>");
        WritableMap metadataMap = Arguments.createMap();
        metadataMap.putInt("Orientation", aVar.m36319h("Orientation", 1));
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("ResolutionUnit", aVar.m36319h("ResolutionUnit", 0));
        createMap.putString("Software", aVar.m36323f("Software"));
        createMap.putString("Make", aVar.m36323f("Make"));
        createMap.putString("DateTime", aVar.m36323f("DateTime"));
        createMap.putDouble("XResolution", aVar.m36321g("XResolution", 0.0d));
        createMap.putString("Model", aVar.m36323f("Model"));
        createMap.putDouble("YResolution", aVar.m36321g("YResolution", 0.0d));
        metadataMap.putMap("{TIFF}", createMap);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putString("DateTimeOriginal", aVar.m36323f("DateTimeOriginal"));
        createMap2.putDouble("ExposureTime", aVar.m36321g("ExposureTime", 0.0d));
        createMap2.putDouble("FNumber", aVar.m36321g("FNumber", 0.0d));
        WritableArray createArray = Arguments.createArray();
        long[] i = aVar.m36318i("LensSpecification");
        if (i != null) {
            for (long j : i) {
                createArray.pushInt((int) j);
            }
        }
        createMap2.putArray("LensSpecification", createArray);
        createMap2.putDouble("ExposureBiasValue", aVar.m36321g("ExposureBiasValue", 0.0d));
        createMap2.putInt("ColorSpace", aVar.m36319h("ColorSpace", 1));
        createMap2.putInt("FocalLenIn35mmFilm", aVar.m36319h("FocalLengthIn35mmFilm", 0));
        createMap2.putDouble("BrightnessValue", aVar.m36321g("BrightnessValue", 0.0d));
        createMap2.putInt("ExposureMode", aVar.m36319h("ExposureMode", 0));
        createMap2.putString("LensModel", aVar.m36323f("LensModel"));
        createMap2.putInt("SceneType", aVar.m36319h("SceneType", 1));
        createMap2.putInt("PixelXDimension", aVar.m36319h("PixelXDimension", 0));
        createMap2.putDouble("ShutterSpeedValue", aVar.m36321g("ShutterSpeedValue", 0.0d));
        createMap2.putInt("SensingMethod", aVar.m36319h("SensingMethod", 1));
        WritableArray createArray2 = Arguments.createArray();
        long[] i2 = aVar.m36318i("SubjectArea");
        if (i2 != null) {
            for (long j2 : i2) {
                createArray2.pushInt((int) j2);
            }
        }
        createMap2.putArray("SubjectArea", createArray2);
        createMap2.putDouble("ApertureValue", aVar.m36321g("ApertureValue", 0.0d));
        createMap2.putString("SubsecTimeDigitized", aVar.m36323f("SubSecTimeDigitized"));
        createMap2.putDouble("FocalLength", aVar.m36321g("FocalLength", 0.0d));
        createMap2.putString("LensMake", aVar.m36323f("LensMake"));
        createMap2.putString("SubsecTimeOriginal", aVar.m36323f("SubSecTimeOriginal"));
        createMap2.putString("OffsetTimeDigitized", aVar.m36323f("OffsetTimeDigitized"));
        createMap2.putInt("PixelYDimension", aVar.m36319h("PixelYDimension", 0));
        WritableArray createArray3 = Arguments.createArray();
        long[] i3 = aVar.m36318i("PhotographicSensitivity");
        if (i3 != null) {
            for (long j3 : i3) {
                createArray3.pushInt((int) j3);
            }
        }
        createMap2.putArray("ISOSpeedRatings", createArray3);
        createMap2.putInt("WhiteBalance", aVar.m36319h("WhiteBalance", 0));
        createMap2.putString("DateTimeDigitized", aVar.m36323f("DateTimeDigitized"));
        createMap2.putString("OffsetTimeOriginal", aVar.m36323f("OffsetTimeOriginal"));
        createMap2.putString("ExifVersion", aVar.m36323f("ExifVersion"));
        createMap2.putString("OffsetTime", aVar.m36323f("OffsetTime"));
        createMap2.putInt("Flash", aVar.m36319h("Flash", 1));
        createMap2.putInt("ExposureProgram", aVar.m36319h("ExposureProgram", 0));
        createMap2.putInt("MeteringMode", aVar.m36319h("MeteringMode", 0));
        metadataMap.putMap("{Exif}", createMap2);
        C9971q.m14634f(metadataMap, "metadataMap");
        return metadataMap;
    }
}
