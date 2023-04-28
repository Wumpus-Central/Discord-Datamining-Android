package co.discord.media_engine;

import com.facebook.react.animated.InterpolationAnimatedNode;
import java.util.Map;
import kotlin.Metadata;

@Metadata(m15074d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0002\u001a\u0018\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0002\u001a \u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0002\u001a.\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¨\u0006\u0013"}, m15073d2 = {"_calculateMos", "", "rtt", "lossRate", "_calculateR", "delay", InterpolationAnimatedNode.EXTRAPOLATE_TYPE_CLAMP, "x", "min", "max", "explodePlayoutMetric", "", "key", "", "metric", "Lco/discord/media_engine/PlayoutMetric;", "result", "", "", "android_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public final class VoiceQualityKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final double _calculateMos(double d, double d2) {
        double _calculateR = _calculateR(d, d2);
        if (_calculateR < 0.0d) {
            return 1.0d;
        }
        if (_calculateR > 100.0d) {
            return 4.5d;
        }
        return 1 + (0.035d * _calculateR) + (7.1E-6d * _calculateR * (_calculateR - 60) * (100 - _calculateR));
    }

    private static final double _calculateR(double d, double d2) {
        double d3 = (0.024d * d) + (d > 177.3d ? (d - 177.3d) * 0.11d : 0.0d);
        double d4 = 10;
        return (93.4d - d3) - (d4 + ((122 * d2) / (d2 + d4)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double clamp(double d, double d2, double d3) {
        return d < d2 ? d2 : d3 < d ? d3 : d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void explodePlayoutMetric(String str, PlayoutMetric playoutMetric, Map<String, Object> map) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        String str2 = str + "_mean";
        int i = 0;
        if (playoutMetric != null) {
            obj = Double.valueOf(playoutMetric.getMean());
        } else {
            obj = 0;
        }
        map.put(str2, obj);
        String str3 = str + "_p75";
        if (playoutMetric != null) {
            obj2 = Double.valueOf(playoutMetric.getP75());
        } else {
            obj2 = 0;
        }
        map.put(str3, obj2);
        String str4 = str + "_p95";
        if (playoutMetric != null) {
            obj3 = Double.valueOf(playoutMetric.getP95());
        } else {
            obj3 = 0;
        }
        map.put(str4, obj3);
        String str5 = str + "_p99";
        if (playoutMetric != null) {
            obj4 = Double.valueOf(playoutMetric.getP99());
        } else {
            obj4 = 0;
        }
        map.put(str5, obj4);
        String str6 = str + "_max";
        if (playoutMetric != null) {
            i = Double.valueOf(playoutMetric.getMax());
        }
        map.put(str6, i);
    }
}
