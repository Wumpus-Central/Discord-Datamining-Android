package com.discord.media.engine.types;

import com.discord.p047native.engine.AudioInputDeviceDescription;
import com.discord.p047native.engine.AudioOutputDeviceDescription;
import com.discord.p047native.engine.ConnectionInfo;
import com.discord.p047native.engine.VideoInputDeviceDescription;
import com.discord.p047native.engine.VideoInputDeviceFacing;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C9906j;
import kotlin.collections.C9907k;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import nf.C11098x;
import p267of.C11289v;

@Metadata(m15074d1 = {"\u00000\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a)\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0002\u0010\u0007\u001a)\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001*\b\u0012\u0004\u0012\u00020\b0\u0005H\u0000¢\u0006\u0002\u0010\t\u001a)\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001*\b\u0012\u0004\u0012\u00020\n0\u0005H\u0000¢\u0006\u0002\u0010\u000b\u001a\u0018\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002*\u00020\rH\u0000¨\u0006\u000e"}, m15073d2 = {"toListOfMaps", "", "", "", "", "", "Lcom/discord/native/engine/AudioInputDeviceDescription;", "([Lcom/discord/native/engine/AudioInputDeviceDescription;)Ljava/util/List;", "Lcom/discord/native/engine/AudioOutputDeviceDescription;", "([Lcom/discord/native/engine/AudioOutputDeviceDescription;)Ljava/util/List;", "Lcom/discord/native/engine/VideoInputDeviceDescription;", "([Lcom/discord/native/engine/VideoInputDeviceDescription;)Ljava/util/List;", "toMap", "Lcom/discord/native/engine/ConnectionInfo;", "media_engine_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class NativeTypeExtensionsKt {

    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes5.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoInputDeviceFacing.values().length];
            try {
                iArr[VideoInputDeviceFacing.Front.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoInputDeviceFacing.Back.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final List<Map<String, Object>> toListOfMaps(AudioInputDeviceDescription[] audioInputDeviceDescriptionArr) {
        Map k;
        C9971q.m14633g(audioInputDeviceDescriptionArr, "<this>");
        ArrayList arrayList = new ArrayList(audioInputDeviceDescriptionArr.length);
        int i = 0;
        for (AudioInputDeviceDescription audioInputDeviceDescription : audioInputDeviceDescriptionArr) {
            i++;
            k = C11289v.m10248k(C11098x.m10921a("name", audioInputDeviceDescription.getName()), C11098x.m10921a("guid", audioInputDeviceDescription.getGuid()), C11098x.m10921a("index", Integer.valueOf(i)));
            arrayList.add(k);
        }
        return arrayList;
    }

    public static final Map<String, Object> toMap(ConnectionInfo connectionInfo) {
        Map<String, Object> k;
        C9971q.m14633g(connectionInfo, "<this>");
        k = C11289v.m10248k(C11098x.m10921a("protocol", connectionInfo.getProtocol()), C11098x.m10921a("address", connectionInfo.getLocalAddress()), C11098x.m10921a("port", Integer.valueOf(connectionInfo.getLocalPort())));
        return k;
    }

    public static final List<Map<String, Object>> toListOfMaps(AudioOutputDeviceDescription[] audioOutputDeviceDescriptionArr) {
        Map k;
        C9971q.m14633g(audioOutputDeviceDescriptionArr, "<this>");
        ArrayList arrayList = new ArrayList(audioOutputDeviceDescriptionArr.length);
        int i = 0;
        for (AudioOutputDeviceDescription audioOutputDeviceDescription : audioOutputDeviceDescriptionArr) {
            i++;
            k = C11289v.m10248k(C11098x.m10921a("name", audioOutputDeviceDescription.getName()), C11098x.m10921a("guid", audioOutputDeviceDescription.getGuid()), C11098x.m10921a("index", Integer.valueOf(i)));
            arrayList.add(k);
        }
        return arrayList;
    }

    public static final List<Map<String, Object>> toListOfMaps(VideoInputDeviceDescription[] videoInputDeviceDescriptionArr) {
        Object W;
        Object W2;
        List l;
        List R;
        int t;
        Map k;
        C9971q.m14633g(videoInputDeviceDescriptionArr, "<this>");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = videoInputDeviceDescriptionArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                break;
            }
            VideoInputDeviceDescription videoInputDeviceDescription = videoInputDeviceDescriptionArr[i];
            if (videoInputDeviceDescription.getFacing() != VideoInputDeviceFacing.Front) {
                z = false;
            }
            if (z) {
                arrayList.add(videoInputDeviceDescription);
            } else {
                arrayList2.add(videoInputDeviceDescription);
            }
            i++;
        }
        Pair pair = new Pair(arrayList, arrayList2);
        W = C9914r.m14768W((List) pair.m15067a());
        W2 = C9914r.m14768W((List) pair.m15066b());
        l = C9906j.m14817l((VideoInputDeviceDescription) W, (VideoInputDeviceDescription) W2);
        R = C9914r.m14773R(l);
        t = C9907k.m14809t(R, 10);
        ArrayList arrayList3 = new ArrayList(t);
        int i2 = 0;
        for (Object obj : R) {
            i2++;
            if (i2 < 0) {
                C9906j.m14810s();
            }
            VideoInputDeviceDescription videoInputDeviceDescription2 = (VideoInputDeviceDescription) obj;
            int i3 = WhenMappings.$EnumSwitchMapping$0[videoInputDeviceDescription2.getFacing().ordinal()];
            k = C11289v.m10248k(C11098x.m10921a("name", videoInputDeviceDescription2.getName()), C11098x.m10921a("guid", videoInputDeviceDescription2.getGuid()), C11098x.m10921a("facing", i3 != 1 ? i3 != 2 ? "unknown" : "back" : "front"), C11098x.m10921a("index", Integer.valueOf(i2)));
            arrayList3.add(k);
        }
        return arrayList3;
    }
}
