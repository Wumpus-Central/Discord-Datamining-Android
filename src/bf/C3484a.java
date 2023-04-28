package bf;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u001f\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, m15073d2 = {"Lbf/a;", "Lcom/facebook/react/uimanager/events/Event;", "Lcom/facebook/react/bridge/WritableMap;", "serializeEventData", "", "getEventName", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "rctEventEmitter", "", "dispatch", "", "a", "I", "mPosition", "", "b", "F", "mOffset", "viewTag", "offset", "<init>", "(IIF)V", "c", "react-native-pager-view_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: bf.a */
/* loaded from: classes6.dex */
public final class C3484a extends Event<C3484a> {

    /* renamed from: c */
    public static final C0085a f5617c = new C0085a(null);

    /* renamed from: a */
    private final int f5618a;

    /* renamed from: b */
    private final float f5619b;

    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m15073d2 = {"Lbf/a$a;", "", "", "EVENT_NAME", "Ljava/lang/String;", "<init>", "()V", "react-native-pager-view_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: bf.a$a */
    /* loaded from: classes6.dex */
    public static final class C0085a {
        private C0085a() {
        }

        public /* synthetic */ C0085a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C3484a(int i, int i2, float f) {
        super(i);
        this.f5618a = i2;
        this.f5619b = (Float.isInfinite(f) || Float.isNaN(f)) ? 0.0f : f;
    }

    private final WritableMap serializeEventData() {
        WritableMap eventData = Arguments.createMap();
        eventData.putInt(ViewProps.POSITION, this.f5618a);
        eventData.putDouble("offset", this.f5619b);
        C9971q.m14634f(eventData, "eventData");
        return eventData;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(RCTEventEmitter rctEventEmitter) {
        C9971q.m14633g(rctEventEmitter, "rctEventEmitter");
        rctEventEmitter.receiveEvent(getViewTag(), getEventName(), serializeEventData());
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topPageScroll";
    }
}
