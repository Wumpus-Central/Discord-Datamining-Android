package p161ij;

import java.lang.Comparable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p143hj.AbstractC8050e;

/* renamed from: ij.d */
/* loaded from: classes8.dex */
public abstract class AbstractC8634d<V extends Comparable<V>> extends AbstractC8050e<V> {

    /* renamed from: k */
    private static final Map<String, String> f19099k;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("YEAR_OF_DISPLAY", "L_year");
        hashMap.put("MONTH_AS_NUMBER", "L_month");
        hashMap.put("HOUR_FROM_0_TO_24", "L_hour");
        hashMap.put("DAY_OF_MONTH", "L_day");
        hashMap.put("DAY_OF_DIVISION", "L_day");
        f19099k = Collections.unmodifiableMap(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC8634d(String str) {
        super(str);
    }
}
