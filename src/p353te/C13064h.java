package p353te;

import android.util.Range;
import android.util.Size;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C9907k;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R#\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\f¨\u0006\u0014"}, m15073d2 = {"Lte/h;", "", "", "Landroid/util/Range;", "", "a", "Ljava/util/List;", "()Ljava/util/List;", "frameRateRanges", "Landroid/util/Size;", "b", "Landroid/util/Size;", "()Landroid/util/Size;", "photoSize", "c", "videoSize", "Lcom/facebook/react/bridge/ReadableMap;", "map", "<init>", "(Lcom/facebook/react/bridge/ReadableMap;)V", "react-native-vision-camera_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: te.h */
/* loaded from: classes6.dex */
public final class C13064h {

    /* renamed from: a */
    private final List<Range<Integer>> f29368a;

    /* renamed from: b */
    private final Size f29369b;

    /* renamed from: c */
    private final Size f29370c;

    public C13064h(ReadableMap map) {
        int t;
        String str;
        C9971q.m14633g(map, "map");
        ReadableArray array = map.getArray("frameRateRanges");
        C9971q.m14636d(array);
        ArrayList<Object> arrayList = array.toArrayList();
        C9971q.m14634f(arrayList, "map.getArray(\"frameRateRanges\")!!.toArrayList()");
        t = C9907k.m14809t(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(t);
        for (Object range : arrayList) {
            if (range instanceof HashMap) {
                Map map2 = (Map) range;
                arrayList2.add(C13065i.m4665a(map2.get("minFrameRate"), map2.get("maxFrameRate")));
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("DeviceFormat: frameRateRanges contained a Range that was not of type HashMap<*,*>! Actual Type: ");
                if (range != null) {
                    C9971q.m14634f(range, "range");
                    str = range.getClass().getName();
                } else {
                    str = null;
                }
                sb2.append(str);
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        this.f29368a = arrayList2;
        this.f29369b = new Size(map.getInt("photoWidth"), map.getInt("photoHeight"));
        this.f29370c = new Size(map.getInt("videoWidth"), map.getInt("videoHeight"));
    }

    /* renamed from: a */
    public final List<Range<Integer>> m4668a() {
        return this.f29368a;
    }

    /* renamed from: b */
    public final Size m4667b() {
        return this.f29369b;
    }

    /* renamed from: c */
    public final Size m4666c() {
        return this.f29370c;
    }
}
