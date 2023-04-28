package com.facebook.react.views.image;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;

/* loaded from: classes7.dex */
public class ImageLoadEvent extends Event<ImageLoadEvent> {
    public static final int ON_ERROR = 1;
    public static final int ON_LOAD = 2;
    public static final int ON_LOAD_END = 3;
    public static final int ON_LOAD_START = 4;
    public static final int ON_PROGRESS = 5;
    private final String mErrorMessage;
    private final int mEventType;
    private final int mHeight;
    private final int mLoaded;
    private final String mSourceUri;
    private final int mTotal;
    private final int mWidth;

    private ImageLoadEvent(int i, int i2, int i3) {
        this(i, i2, i3, null, null, 0, 0, 0, 0);
    }

    @Deprecated
    public static final ImageLoadEvent createErrorEvent(int i, Throwable th2) {
        return createErrorEvent(-1, i, th2);
    }

    private WritableMap createEventDataSource() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("uri", this.mSourceUri);
        createMap.putDouble("width", this.mWidth);
        createMap.putDouble("height", this.mHeight);
        return createMap;
    }

    @Deprecated
    public static final ImageLoadEvent createLoadEndEvent(int i) {
        return createLoadEndEvent(-1, i);
    }

    @Deprecated
    public static final ImageLoadEvent createLoadEvent(int i, String str, int i2, int i3) {
        return createLoadEvent(-1, i, str, i2, i3);
    }

    @Deprecated
    public static final ImageLoadEvent createLoadStartEvent(int i) {
        return createLoadStartEvent(-1, i);
    }

    @Deprecated
    public static final ImageLoadEvent createProgressEvent(int i, String str, int i2, int i3) {
        return createProgressEvent(-1, i, str, i2, i3);
    }

    public static String eventNameForType(int i) {
        if (i == 1) {
            return "topError";
        }
        if (i == 2) {
            return "topLoad";
        }
        if (i == 3) {
            return "topLoadEnd";
        }
        if (i == 4) {
            return "topLoadStart";
        }
        if (i == 5) {
            return "topProgress";
        }
        throw new IllegalStateException("Invalid image event: " + Integer.toString(i));
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return (short) this.mEventType;
    }

    @Override // com.facebook.react.uimanager.events.Event
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        int i = this.mEventType;
        if (i == 1) {
            createMap.putString("error", this.mErrorMessage);
        } else if (i == 2) {
            createMap.putMap("source", createEventDataSource());
        } else if (i == 5) {
            createMap.putInt("loaded", this.mLoaded);
            createMap.putInt("total", this.mTotal);
        }
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return eventNameForType(this.mEventType);
    }

    private ImageLoadEvent(int i, int i2, int i3, String str, String str2, int i4, int i5, int i6, int i7) {
        super(i, i2);
        this.mEventType = i3;
        this.mErrorMessage = str;
        this.mSourceUri = str2;
        this.mWidth = i4;
        this.mHeight = i5;
        this.mLoaded = i6;
        this.mTotal = i7;
    }

    public static final ImageLoadEvent createErrorEvent(int i, int i2, Throwable th2) {
        return new ImageLoadEvent(i, i2, 1, th2.getMessage(), null, 0, 0, 0, 0);
    }

    public static final ImageLoadEvent createLoadEndEvent(int i, int i2) {
        return new ImageLoadEvent(i, i2, 3);
    }

    public static final ImageLoadEvent createLoadEvent(int i, int i2, String str, int i3, int i4) {
        return new ImageLoadEvent(i, i2, 2, null, str, i3, i4, 0, 0);
    }

    public static final ImageLoadEvent createLoadStartEvent(int i, int i2) {
        return new ImageLoadEvent(i, i2, 4);
    }

    public static final ImageLoadEvent createProgressEvent(int i, int i2, String str, int i3, int i4) {
        return new ImageLoadEvent(i, i2, 5, null, str, 0, 0, i3, i4);
    }
}
