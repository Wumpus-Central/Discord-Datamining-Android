package com.discord.media.react;

import com.discord.media.utils.ContentResolverMedia;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kg.x;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\f\u0010\u0006\u001a\u00020\u0007*\u00020\u0004H\u0002R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/discord/media/react/GetPhotosData;", "", "edges", "", "Lcom/discord/media/utils/ContentResolverMedia;", "(Ljava/util/List;)V", "toNativeMap", "Lcom/facebook/react/bridge/WritableNativeMap;", "Companion", "media_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetPhotosData {
    public static final Companion Companion = new Companion(null);
    public static final String FAILED_TO_LOAD = "E_UNABLE_TO_LOAD";
    private final List<ContentResolverMedia> edges;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/discord/media/react/GetPhotosData$Companion;", "", "()V", "FAILED_TO_LOAD", "", "media_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public GetPhotosData(List<ContentResolverMedia> edges) {
        q.g(edges, "edges");
        this.edges = edges;
    }

    public final WritableNativeMap toNativeMap() {
        int t10;
        Pair[] pairArr = new Pair[1];
        List<ContentResolverMedia> list = this.edges;
        t10 = k.t(list, 10);
        ArrayList arrayList = new ArrayList(t10);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(NativeMapExtensionsKt.nativeMapOf(x.a("node", toNativeMap((ContentResolverMedia) it.next()))));
        }
        pairArr[0] = x.a("edges", NativeArrayExtensionsKt.toNativeArray(arrayList));
        return NativeMapExtensionsKt.nativeMapOf(pairArr);
    }

    private final WritableNativeMap toNativeMap(ContentResolverMedia contentResolverMedia) {
        return NativeMapExtensionsKt.nativeMapOf(x.a("type", String.valueOf(contentResolverMedia.getMediaType())), x.a("image", NativeMapExtensionsKt.nativeMapOf(x.a("uri", String.valueOf(contentResolverMedia.getUri())), x.a("mimeType", contentResolverMedia.getMimeType()), x.a("filename", contentResolverMedia.getName()), x.a("width", Integer.valueOf(contentResolverMedia.getWidth())), x.a("height", Integer.valueOf(contentResolverMedia.getHeight())), x.a("playableDuration", Integer.valueOf(contentResolverMedia.getDuration())))));
    }
}
