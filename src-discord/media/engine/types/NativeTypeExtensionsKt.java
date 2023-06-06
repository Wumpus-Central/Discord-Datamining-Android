package com.discord.media.engine.types;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.discord.p000native.engine.AudioInputDeviceDescription;
import com.discord.p000native.engine.AudioOutputDeviceDescription;
import com.discord.p000native.engine.ConnectionInfo;
import com.discord.p000native.engine.VideoInputDeviceDescription;
import com.discord.p000native.engine.VideoInputDeviceFacing;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kg.x;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.j;
import kotlin.collections.k;
import kotlin.collections.r;
import kotlin.jvm.internal.q;
import lg.v;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a)\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0002\u0010\u0007\u001a)\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001*\b\u0012\u0004\u0012\u00020\b0\u0005H\u0000¢\u0006\u0002\u0010\t\u001a)\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001*\b\u0012\u0004\u0012\u00020\n0\u0005H\u0000¢\u0006\u0002\u0010\u000b\u001a\u0018\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002*\u00020\rH\u0000¨\u0006\u000e"}, d2 = {"toListOfMaps", "", "", "", "", "", "Lcom/discord/native/engine/AudioInputDeviceDescription;", "([Lcom/discord/native/engine/AudioInputDeviceDescription;)Ljava/util/List;", "Lcom/discord/native/engine/AudioOutputDeviceDescription;", "([Lcom/discord/native/engine/AudioOutputDeviceDescription;)Ljava/util/List;", "Lcom/discord/native/engine/VideoInputDeviceDescription;", "([Lcom/discord/native/engine/VideoInputDeviceDescription;)Ljava/util/List;", "toMap", "Lcom/discord/native/engine/ConnectionInfo;", "media_engine_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NativeTypeExtensionsKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
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
        Map k10;
        q.g(audioInputDeviceDescriptionArr, "<this>");
        ArrayList arrayList = new ArrayList(audioInputDeviceDescriptionArr.length);
        int i10 = 0;
        for (AudioInputDeviceDescription audioInputDeviceDescription : audioInputDeviceDescriptionArr) {
            i10++;
            k10 = v.k(x.a(ZeroconfModule.KEY_SERVICE_NAME, audioInputDeviceDescription.getName()), x.a("guid", audioInputDeviceDescription.getGuid()), x.a("index", Integer.valueOf(i10)));
            arrayList.add(k10);
        }
        return arrayList;
    }

    public static final Map<String, Object> toMap(ConnectionInfo connectionInfo) {
        Map<String, Object> k10;
        q.g(connectionInfo, "<this>");
        k10 = v.k(x.a("protocol", connectionInfo.getProtocol()), x.a("address", connectionInfo.getLocalAddress()), x.a(ZeroconfModule.KEY_SERVICE_PORT, Integer.valueOf(connectionInfo.getLocalPort())));
        return k10;
    }

    public static final List<Map<String, Object>> toListOfMaps(AudioOutputDeviceDescription[] audioOutputDeviceDescriptionArr) {
        Map k10;
        q.g(audioOutputDeviceDescriptionArr, "<this>");
        ArrayList arrayList = new ArrayList(audioOutputDeviceDescriptionArr.length);
        int i10 = 0;
        for (AudioOutputDeviceDescription audioOutputDeviceDescription : audioOutputDeviceDescriptionArr) {
            i10++;
            k10 = v.k(x.a(ZeroconfModule.KEY_SERVICE_NAME, audioOutputDeviceDescription.getName()), x.a("guid", audioOutputDeviceDescription.getGuid()), x.a("index", Integer.valueOf(i10)));
            arrayList.add(k10);
        }
        return arrayList;
    }

    public static final List<Map<String, Object>> toListOfMaps(VideoInputDeviceDescription[] videoInputDeviceDescriptionArr) {
        Object W;
        Object W2;
        List l10;
        List R;
        int t10;
        Map k10;
        q.g(videoInputDeviceDescriptionArr, "<this>");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = videoInputDeviceDescriptionArr.length;
        int i10 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= length) {
                break;
            }
            VideoInputDeviceDescription videoInputDeviceDescription = videoInputDeviceDescriptionArr[i10];
            if (videoInputDeviceDescription.getFacing() != VideoInputDeviceFacing.Front) {
                z10 = false;
            }
            if (z10) {
                arrayList.add(videoInputDeviceDescription);
            } else {
                arrayList2.add(videoInputDeviceDescription);
            }
            i10++;
        }
        Pair pair = new Pair(arrayList, arrayList2);
        W = r.W((List) pair.a());
        W2 = r.W((List) pair.b());
        l10 = j.l((VideoInputDeviceDescription) W, (VideoInputDeviceDescription) W2);
        R = r.R(l10);
        t10 = k.t(R, 10);
        ArrayList arrayList3 = new ArrayList(t10);
        int i11 = 0;
        for (Object obj : R) {
            i11++;
            if (i11 < 0) {
                j.s();
            }
            VideoInputDeviceDescription videoInputDeviceDescription2 = (VideoInputDeviceDescription) obj;
            int i12 = WhenMappings.$EnumSwitchMapping$0[videoInputDeviceDescription2.getFacing().ordinal()];
            k10 = v.k(x.a(ZeroconfModule.KEY_SERVICE_NAME, videoInputDeviceDescription2.getName()), x.a("guid", videoInputDeviceDescription2.getGuid()), x.a("facing", i12 != 1 ? i12 != 2 ? "unknown" : "back" : "front"), x.a("index", Integer.valueOf(i11)));
            arrayList3.add(k10);
        }
        return arrayList3;
    }
}
