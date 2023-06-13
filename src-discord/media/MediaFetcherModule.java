package com.discord.media;

import com.discord.media.react.GetPhotosData;
import com.discord.media.utils.ContentResolverMedia;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.Comparator;
import java.util.List;
import kg.x;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.q;
import ng.c;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0002¨\u0006\u0010"}, d2 = {"Lcom/discord/media/MediaFetcherModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "getPhotos", "", "params", "Lcom/facebook/react/bridge/ReadableMap;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "getQueryType", "Lcom/discord/media/utils/ContentResolverMedia$QueryType;", "filter", "media_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MediaFetcherModule extends ReactContextBaseJavaModule {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaFetcherModule(ReactApplicationContext reactContext) {
        super(reactContext);
        q.g(reactContext, "reactContext");
    }

    private final ContentResolverMedia.QueryType getQueryType(String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -989034367) {
                if (hashCode != -816678056) {
                    if (hashCode == 65921 && str.equals("All")) {
                        return ContentResolverMedia.QueryType.ALL;
                    }
                } else if (str.equals("videos")) {
                    return ContentResolverMedia.QueryType.VIDEO;
                }
            } else if (str.equals("photos")) {
                return ContentResolverMedia.QueryType.IMAGE;
            }
        }
        throw new IllegalArgumentException("Unknown filter type: " + str);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "CameraRollUtils";
    }

    @ReactMethod
    public final void getPhotos(ReadableMap params, Promise promise) {
        Integer num;
        List w02;
        List x02;
        WritableNativeMap writableNativeMap;
        Object U;
        Object g02;
        q.g(params, "params");
        q.g(promise, "promise");
        int i10 = params.getInt("first");
        if (params.hasKey("offset")) {
            num = Integer.valueOf(params.getInt("offset"));
        } else {
            num = null;
        }
        ContentResolverMedia.QueryType queryType = getQueryType(params.getString("assetType"));
        try {
            ContentResolverMedia.Companion companion = ContentResolverMedia.Companion;
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            q.f(reactApplicationContext, "reactApplicationContext");
            w02 = r.w0(companion.getMedia(reactApplicationContext, queryType, i10, num), new Comparator() { // from class: com.discord.media.MediaFetcherModule$getPhotos$$inlined$sortedByDescending$1
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    int d10;
                    d10 = c.d(Integer.valueOf(((ContentResolverMedia) t11).getDateAdded()), Integer.valueOf(((ContentResolverMedia) t10).getDateAdded()));
                    return d10;
                }
            });
            x02 = r.x0(w02, i10);
            if (x02.size() == i10) {
                U = r.U(x02);
                g02 = r.g0(x02);
                writableNativeMap = NativeMapExtensionsKt.nativeMapOf(x.a("start_cursor", String.valueOf(((ContentResolverMedia) U).getUri())), x.a("end_cursor", String.valueOf(((ContentResolverMedia) g02).getUri())), x.a("has_next_page", Boolean.TRUE));
            } else {
                writableNativeMap = NativeMapExtensionsKt.nativeMapOf(x.a("has_next_page", Boolean.FALSE));
            }
            WritableNativeMap nativeMap = new GetPhotosData(x02).toNativeMap();
            nativeMap.putMap("page_info", writableNativeMap);
            promise.resolve(nativeMap);
        } catch (Exception e10) {
            promise.reject(GetPhotosData.FAILED_TO_LOAD, e10);
        }
    }
}
