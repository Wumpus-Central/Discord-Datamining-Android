package com.facebook.react.modules.fresco;

import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.react.bridge.ReadableMap;

/* loaded from: classes7.dex */
public class ReactNetworkImageRequest extends ImageRequest {
    private final ReadableMap mHeaders;

    protected ReactNetworkImageRequest(ImageRequestBuilder imageRequestBuilder, ReadableMap readableMap) {
        super(imageRequestBuilder);
        this.mHeaders = readableMap;
    }

    public static ReactNetworkImageRequest fromBuilderWithHeaders(ImageRequestBuilder imageRequestBuilder, ReadableMap readableMap) {
        return new ReactNetworkImageRequest(imageRequestBuilder, readableMap);
    }

    public ReadableMap getHeaders() {
        return this.mHeaders;
    }
}
