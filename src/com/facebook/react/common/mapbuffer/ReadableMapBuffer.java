package com.facebook.react.common.mapbuffer;

import com.facebook.jni.HybridData;
import com.facebook.react.common.mapbuffer.MapBuffer;
import com.facebook.react.uimanager.ViewProps;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import nf.C11070g0;
import p078e6.AbstractC6709a;
import p326ri.C12694d;

@AbstractC6709a
@Metadata(m15074d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 @2\u00020\u0001:\u0002@AB\u0011\b\u0013\u0012\u0006\u0010<\u001a\u000200¢\u0006\u0004\b=\u0010>B\u0011\b\u0012\u0012\u0006\u00103\u001a\u00020\u0002¢\u0006\u0004\b=\u0010?J\t\u0010\u0003\u001a\u00020\u0002H\u0082 J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0002J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\nH\u0002J \u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J\u0010\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0006H\u0002J\u0010\u0010\u001d\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u0010\u001f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0006H\u0016J\u0010\u0010#\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u0010$\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u0010%\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u0010&\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u0010'\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u0010(\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010)\u001a\u00020\u0006H\u0016J\u0013\u0010,\u001a\u00020\u00172\b\u0010+\u001a\u0004\u0018\u00010*H\u0096\u0002J\b\u0010-\u001a\u00020\u0019H\u0016J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020!0.H\u0096\u0002R\u0016\u00101\u001a\u0004\u0018\u0001008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R$\u00106\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00068\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0014\u0010;\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u00109\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006B"}, m15073d2 = {"Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;", "Lcom/facebook/react/common/mapbuffer/MapBuffer;", "Ljava/nio/ByteBuffer;", "importByteBuffer", "", "readHeader", "", "intKey", "getBucketIndexForKey", "bucketIndex", "Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;", "readDataType", "key", "expected", "getTypedValueOffsetForKey", "bufferPosition", "Lnf/g0;", "readUnsignedShort-BwKQO78", "(I)S", "readUnsignedShort", "", "readDoubleValue", "readIntValue", "", "readBooleanValue", "", "readStringValue", ViewProps.POSITION, "readMapBufferValue", "getKeyOffsetForBucketIndex", "contains", "getKeyOffset", "offset", "Lcom/facebook/react/common/mapbuffer/MapBuffer$Entry;", "entryAt", "getType", "getInt", "getDouble", "getString", "getBoolean", "getMapBuffer", "hashCode", "", "other", "equals", "toString", "", "iterator", "Lcom/facebook/jni/HybridData;", "mHybridData", "Lcom/facebook/jni/HybridData;", "buffer", "Ljava/nio/ByteBuffer;", "<set-?>", "count", "I", "getCount", "()I", "getOffsetForDynamicData", "offsetForDynamicData", "hybridData", "<init>", "(Lcom/facebook/jni/HybridData;)V", "(Ljava/nio/ByteBuffer;)V", "Companion", "MapBufferEntry", "ReactAndroid_release"}, m15072k = 1, m15071mv = {1, 6, 0})
/* loaded from: classes7.dex */
public final class ReadableMapBuffer implements MapBuffer {
    private static final int ALIGNMENT = 254;
    private static final int BUCKET_SIZE = 12;
    public static final Companion Companion = new Companion(null);
    private static final int HEADER_SIZE = 8;
    private static final int TYPE_OFFSET = 2;
    private static final int VALUE_OFFSET = 4;
    private final ByteBuffer buffer;
    private int count;
    @AbstractC6709a
    private final HybridData mHybridData;

    @Metadata(m15074d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m15073d2 = {"Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$Companion;", "", "()V", "ALIGNMENT", "", "BUCKET_SIZE", "HEADER_SIZE", "TYPE_OFFSET", "VALUE_OFFSET", "ReactAndroid_release"}, m15072k = 1, m15071mv = {1, 6, 0}, m15069xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001bH\u0002R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, m15073d2 = {"Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$MapBufferEntry;", "Lcom/facebook/react/common/mapbuffer/MapBuffer$Entry;", "bucketOffset", "", "(Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;I)V", "booleanValue", "", "getBooleanValue", "()Z", "doubleValue", "", "getDoubleValue", "()D", "intValue", "getIntValue", "()I", "key", "getKey", "mapBufferValue", "Lcom/facebook/react/common/mapbuffer/MapBuffer;", "getMapBufferValue", "()Lcom/facebook/react/common/mapbuffer/MapBuffer;", "stringValue", "", "getStringValue", "()Ljava/lang/String;", "type", "Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;", "getType", "()Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;", "assertType", "", "expected", "ReactAndroid_release"}, m15072k = 1, m15071mv = {1, 6, 0}, m15069xi = 48)
    /* loaded from: classes7.dex */
    public final class MapBufferEntry implements MapBuffer.Entry {
        private final int bucketOffset;
        final /* synthetic */ ReadableMapBuffer this$0;

        public MapBufferEntry(ReadableMapBuffer this$0, int i) {
            C9971q.m14633g(this$0, "this$0");
            this.this$0 = this$0;
            this.bucketOffset = i;
        }

        private final void assertType(MapBuffer.DataType dataType) {
            boolean z;
            MapBuffer.DataType type = getType();
            if (dataType == type) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException(("Expected " + dataType + " for key: " + getKey() + " found " + type + " instead.").toString());
            }
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public boolean getBooleanValue() {
            assertType(MapBuffer.DataType.BOOL);
            return this.this$0.readBooleanValue(this.bucketOffset + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public double getDoubleValue() {
            assertType(MapBuffer.DataType.DOUBLE);
            return this.this$0.readDoubleValue(this.bucketOffset + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public int getIntValue() {
            assertType(MapBuffer.DataType.INT);
            return this.this$0.readIntValue(this.bucketOffset + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public int getKey() {
            return this.this$0.m42167readUnsignedShortBwKQO78(this.bucketOffset) & 65535;
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public MapBuffer getMapBufferValue() {
            assertType(MapBuffer.DataType.MAP);
            return this.this$0.readMapBufferValue(this.bucketOffset + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public String getStringValue() {
            assertType(MapBuffer.DataType.STRING);
            return this.this$0.readStringValue(this.bucketOffset + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public MapBuffer.DataType getType() {
            return MapBuffer.DataType.values()[this.this$0.m42167readUnsignedShortBwKQO78(this.bucketOffset + 2) & 65535];
        }
    }

    @Metadata(m15072k = 3, m15071mv = {1, 6, 0}, m15069xi = 48)
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MapBuffer.DataType.values().length];
            iArr[MapBuffer.DataType.BOOL.ordinal()] = 1;
            iArr[MapBuffer.DataType.INT.ordinal()] = 2;
            iArr[MapBuffer.DataType.DOUBLE.ordinal()] = 3;
            iArr[MapBuffer.DataType.STRING.ordinal()] = 4;
            iArr[MapBuffer.DataType.MAP.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        MapBufferSoLoader.staticInit();
    }

    @AbstractC6709a
    private ReadableMapBuffer(HybridData hybridData) {
        this.mHybridData = hybridData;
        this.buffer = importByteBuffer();
        readHeader();
    }

    private final int getBucketIndexForKey(int i) {
        boolean z;
        IntRange kEY_RANGE$ReactAndroid_release = MapBuffer.Companion.getKEY_RANGE$ReactAndroid_release();
        int a = kEY_RANGE$ReactAndroid_release.m14605a();
        int i2 = 0;
        if (i > kEY_RANGE$ReactAndroid_release.m14604b() || a > i) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return -1;
        }
        short b = C11070g0.m10978b((short) i);
        int count = getCount() - 1;
        while (i2 <= count) {
            int i3 = (i2 + count) >>> 1;
            int i4 = m42167readUnsignedShortBwKQO78(getKeyOffsetForBucketIndex(i3)) & 65535;
            int i5 = 65535 & b;
            if (C9971q.m14631i(i4, i5) < 0) {
                i2 = i3 + 1;
            } else if (C9971q.m14631i(i4, i5) <= 0) {
                return i3;
            } else {
                count = i3 - 1;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getKeyOffsetForBucketIndex(int i) {
        return (i * 12) + 8;
    }

    private final int getOffsetForDynamicData() {
        return getKeyOffsetForBucketIndex(getCount());
    }

    private final int getTypedValueOffsetForKey(int i, MapBuffer.DataType dataType) {
        boolean z;
        int bucketIndexForKey = getBucketIndexForKey(i);
        boolean z2 = true;
        if (bucketIndexForKey != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            MapBuffer.DataType readDataType = readDataType(bucketIndexForKey);
            if (readDataType != dataType) {
                z2 = false;
            }
            if (z2) {
                return getKeyOffsetForBucketIndex(bucketIndexForKey) + 4;
            }
            throw new IllegalStateException(("Expected " + dataType + " for key: " + i + ", found " + readDataType + " instead.").toString());
        }
        throw new IllegalArgumentException(C9971q.m14624p("Key not found: ", Integer.valueOf(i)).toString());
    }

    private final native ByteBuffer importByteBuffer();

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean readBooleanValue(int i) {
        return readIntValue(i) == 1;
    }

    private final MapBuffer.DataType readDataType(int i) {
        return MapBuffer.DataType.values()[m42167readUnsignedShortBwKQO78(getKeyOffsetForBucketIndex(i) + 2) & 65535];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double readDoubleValue(int i) {
        return this.buffer.getDouble(i);
    }

    private final void readHeader() {
        if (this.buffer.getShort() != ALIGNMENT) {
            this.buffer.order(ByteOrder.LITTLE_ENDIAN);
        }
        this.count = m42167readUnsignedShortBwKQO78(this.buffer.position()) & 65535;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int readIntValue(int i) {
        return this.buffer.getInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReadableMapBuffer readMapBufferValue(int i) {
        int offsetForDynamicData = getOffsetForDynamicData() + this.buffer.getInt(i);
        int i2 = this.buffer.getInt(offsetForDynamicData);
        byte[] bArr = new byte[i2];
        this.buffer.position(offsetForDynamicData + 4);
        this.buffer.get(bArr, 0, i2);
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        C9971q.m14634f(wrap, "wrap(newBuffer)");
        return new ReadableMapBuffer(wrap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String readStringValue(int i) {
        int offsetForDynamicData = getOffsetForDynamicData() + this.buffer.getInt(i);
        int i2 = this.buffer.getInt(offsetForDynamicData);
        byte[] bArr = new byte[i2];
        this.buffer.position(offsetForDynamicData + 4);
        this.buffer.get(bArr, 0, i2);
        return new String(bArr, C12694d.f28536b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: readUnsignedShort-BwKQO78  reason: not valid java name */
    public final short m42167readUnsignedShortBwKQO78(int i) {
        return C11070g0.m10978b(this.buffer.getShort(i));
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public boolean contains(int i) {
        return getBucketIndexForKey(i) != -1;
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public MapBuffer.Entry entryAt(int i) {
        return new MapBufferEntry(this, getKeyOffsetForBucketIndex(i));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ReadableMapBuffer)) {
            return false;
        }
        ByteBuffer byteBuffer = this.buffer;
        ByteBuffer byteBuffer2 = ((ReadableMapBuffer) obj).buffer;
        if (byteBuffer == byteBuffer2) {
            return true;
        }
        byteBuffer.rewind();
        byteBuffer2.rewind();
        return C9971q.m14638b(byteBuffer, byteBuffer2);
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public boolean getBoolean(int i) {
        return readBooleanValue(getTypedValueOffsetForKey(i, MapBuffer.DataType.BOOL));
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public int getCount() {
        return this.count;
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public double getDouble(int i) {
        return readDoubleValue(getTypedValueOffsetForKey(i, MapBuffer.DataType.DOUBLE));
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public int getInt(int i) {
        return readIntValue(getTypedValueOffsetForKey(i, MapBuffer.DataType.INT));
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public int getKeyOffset(int i) {
        return getBucketIndexForKey(i);
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public String getString(int i) {
        return readStringValue(getTypedValueOffsetForKey(i, MapBuffer.DataType.STRING));
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public MapBuffer.DataType getType(int i) {
        boolean z;
        int bucketIndexForKey = getBucketIndexForKey(i);
        if (bucketIndexForKey != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return readDataType(bucketIndexForKey);
        }
        throw new IllegalArgumentException(C9971q.m14624p("Key not found: ", Integer.valueOf(i)).toString());
    }

    public int hashCode() {
        this.buffer.rewind();
        return this.buffer.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<MapBuffer.Entry> iterator() {
        return new ReadableMapBuffer$iterator$1(this);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        Iterator<MapBuffer.Entry> it = iterator();
        while (it.hasNext()) {
            MapBuffer.Entry next = it.next();
            sb2.append(next.getKey());
            sb2.append('=');
            int i = WhenMappings.$EnumSwitchMapping$0[next.getType().ordinal()];
            if (i == 1) {
                sb2.append(next.getBooleanValue());
            } else if (i == 2) {
                sb2.append(next.getIntValue());
            } else if (i == 3) {
                sb2.append(next.getDoubleValue());
            } else if (i == 4) {
                sb2.append(next.getStringValue());
            } else if (i == 5) {
                sb2.append(next.getMapBufferValue().toString());
            }
            sb2.append(',');
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        C9971q.m14634f(sb3, "builder.toString()");
        return sb3;
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public ReadableMapBuffer getMapBuffer(int i) {
        return readMapBufferValue(getTypedValueOffsetForKey(i, MapBuffer.DataType.MAP));
    }

    private ReadableMapBuffer(ByteBuffer byteBuffer) {
        this.mHybridData = null;
        this.buffer = byteBuffer;
        readHeader();
    }
}
