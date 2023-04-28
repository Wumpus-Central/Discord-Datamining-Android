package com.facebook.react.common.mapbuffer;

import ag.AbstractC1385a;
import com.facebook.react.common.mapbuffer.MapBuffer;
import com.facebook.react.common.mapbuffer.WritableMapBuffer;
import java.util.Iterator;
import kotlin.Metadata;
import p163j$.util.Iterator;
import p163j$.util.function.Consumer;

@Metadata(m15074d1 = {"\u0000\u001f\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\t\u001a\u00020\nH\u0096\u0002J\t\u0010\u000b\u001a\u00020\u0002H\u0096\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, m15073d2 = {"com/facebook/react/common/mapbuffer/WritableMapBuffer$iterator$1", "", "Lcom/facebook/react/common/mapbuffer/MapBuffer$Entry;", "count", "", "getCount", "()I", "setCount", "(I)V", "hasNext", "", "next", "ReactAndroid_release"}, m15072k = 1, m15071mv = {1, 6, 0}, m15069xi = 48)
/* loaded from: classes7.dex */
public final class WritableMapBuffer$iterator$1 implements Iterator<MapBuffer.Entry>, AbstractC1385a, p163j$.util.Iterator {
    private int count;
    final /* synthetic */ WritableMapBuffer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public WritableMapBuffer$iterator$1(WritableMapBuffer writableMapBuffer) {
        this.this$0 = writableMapBuffer;
    }

    @Override // p163j$.util.Iterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super MapBuffer.Entry> consumer) {
        forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    public final int getCount() {
        return this.count;
    }

    @Override // java.util.Iterator, p163j$.util.Iterator
    public boolean hasNext() {
        return this.count < this.this$0.values.size();
    }

    @Override // java.util.Iterator, p163j$.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setCount(int i) {
        this.count = i;
    }

    @Override // java.util.Iterator, p163j$.util.Iterator
    public MapBuffer.Entry next() {
        WritableMapBuffer writableMapBuffer = this.this$0;
        int i = this.count;
        this.count = i + 1;
        return new WritableMapBuffer.MapBufferEntry(writableMapBuffer, i);
    }
}
