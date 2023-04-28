package bf;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0012"}, m15073d2 = {"Lbf/b;", "Lcom/facebook/react/uimanager/events/Event;", "Lcom/facebook/react/bridge/WritableMap;", "serializeEventData", "", "getEventName", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "rctEventEmitter", "", "dispatch", "a", "Ljava/lang/String;", "mPageScrollState", "", "viewTag", "<init>", "(ILjava/lang/String;)V", "b", "react-native-pager-view_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: bf.b */
/* loaded from: classes6.dex */
public final class C3485b extends Event<C3485b> {

    /* renamed from: b */
    public static final C3486a f5620b = new C3486a(null);

    /* renamed from: a */
    private final String f5621a;

    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m15073d2 = {"Lbf/b$a;", "", "", "EVENT_NAME", "Ljava/lang/String;", "<init>", "()V", "react-native-pager-view_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: bf.b$a */
    /* loaded from: classes6.dex */
    public static final class C3486a {
        private C3486a() {
        }

        public /* synthetic */ C3486a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3485b(int i, String mPageScrollState) {
        super(i);
        C9971q.m14633g(mPageScrollState, "mPageScrollState");
        this.f5621a = mPageScrollState;
    }

    private final WritableMap serializeEventData() {
        WritableMap eventData = Arguments.createMap();
        eventData.putString("pageScrollState", this.f5621a);
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
        return "topPageScrollStateChanged";
    }
}
