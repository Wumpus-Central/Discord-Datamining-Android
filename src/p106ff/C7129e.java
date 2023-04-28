package p106ff;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001c2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\fB/\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001d"}, m15073d2 = {"Lff/e;", "Lcom/facebook/react/uimanager/events/Event;", "Lff/b;", "", "getEventName", "", "getCoalescingKey", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "rctEventEmitter", "", "dispatch", "", "a", "F", "mProgress", "", "b", "Z", "mClosing", "c", "mGoingForward", "d", "S", "mCoalescingKey", "", "viewId", "<init>", "(IFZZS)V", "e", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: ff.e */
/* loaded from: classes8.dex */
public final class C7129e extends Event<C7123b> {

    /* renamed from: e */
    public static final C7130a f15530e = new C7130a(null);

    /* renamed from: a */
    private final float f15531a;

    /* renamed from: b */
    private final boolean f15532b;

    /* renamed from: c */
    private final boolean f15533c;

    /* renamed from: d */
    private final short f15534d;

    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m15073d2 = {"Lff/e$a;", "", "", "EVENT_NAME", "Ljava/lang/String;", "<init>", "()V", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: ff.e$a */
    /* loaded from: classes8.dex */
    public static final class C7130a {
        private C7130a() {
        }

        public /* synthetic */ C7130a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C7129e(int i, float f, boolean z, boolean z2, short s) {
        super(i);
        this.f15531a = f;
        this.f15532b = z;
        this.f15533c = z2;
        this.f15534d = s;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(RCTEventEmitter rctEventEmitter) {
        C9971q.m14633g(rctEventEmitter, "rctEventEmitter");
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("progress", this.f15531a);
        createMap.putInt("closing", this.f15532b ? 1 : 0);
        createMap.putInt("goingForward", this.f15533c ? 1 : 0);
        rctEventEmitter.receiveEvent(getViewTag(), getEventName(), createMap);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return this.f15534d;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topTransitionProgress";
    }
}
