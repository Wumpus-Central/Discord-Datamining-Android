package p096f5;

import android.graphics.PointF;
import android.graphics.Rect;
import android.net.Uri;
import java.util.Map;
import p115g5.AbstractC7415b;

/* renamed from: f5.a */
/* loaded from: classes7.dex */
public class C7015a {
    /* renamed from: a */
    public static AbstractC7415b.C7416a m23647a(Map<String, Object> map, Map<String, Object> map2, Map<String, Object> map3, Rect rect, String str, PointF pointF, Map<String, Object> map4, Object obj, Uri uri) {
        AbstractC7415b.C7416a aVar = new AbstractC7415b.C7416a();
        if (rect != null) {
            aVar.f15984g = rect.width();
            aVar.f15985h = rect.height();
        }
        aVar.f15986i = str;
        if (pointF != null) {
            aVar.f15987j = pointF.x;
            aVar.f15988k = pointF.y;
        }
        aVar.f15982e = obj;
        aVar.f15983f = uri;
        aVar.f15980c = map3;
        aVar.f15981d = map4;
        aVar.f15979b = map2;
        aVar.f15978a = map;
        return aVar;
    }
}
