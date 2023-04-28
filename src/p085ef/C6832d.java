package p085ef;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.C9897e;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p085ef.C6832d;

@Metadata(m15074d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b/\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b%\b\u0016\u0018\u0000 Ã\u0001*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002:\u0003jmpB\t¢\u0006\u0006\bÆ\u0001\u0010Ç\u0001J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u0012\u001a\u00020\u000eH\u0002J\b\u0010\u0013\u001a\u00020\u000eH\u0002J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0018\u0010\u001a\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00182\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0007H\u0002J\u000f\u0010\u001d\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010 \u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0016J\u0010\u0010!\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\"\u001a\u00020\u000eH\u0016J\b\u0010#\u001a\u00020\u000eH\u0016J\u0012\u0010%\u001a\u00020\u000b2\n\u0010$\u001a\u0006\u0012\u0002\b\u00030\u0000J\u0015\u0010'\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\u000b¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00028\u00002\u0006\u0010)\u001a\u00020\u000b¢\u0006\u0004\b*\u0010(J\u0015\u0010,\u001a\u00028\u00002\u0006\u0010+\u001a\u00020\u000b¢\u0006\u0004\b,\u0010(J=\u00104\u001a\u00028\u00002\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020-2\u0006\u00100\u001a\u00020-2\u0006\u00101\u001a\u00020-2\u0006\u00102\u001a\u00020-2\u0006\u00103\u001a\u00020-¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00028\u00002\b\u00107\u001a\u0004\u0018\u000106¢\u0006\u0004\b8\u00109J\u001a\u0010>\u001a\u00020\u000e2\b\u0010;\u001a\u0004\u0018\u00010:2\b\u0010=\u001a\u0004\u0018\u00010<J\b\u0010?\u001a\u00020\u000eH\u0014J\u000e\u0010A\u001a\u00020\u000e2\u0006\u0010@\u001a\u00020\u0007J\u000e\u0010B\u001a\u00020\u000e2\u0006\u0010@\u001a\u00020\u0007J\u0016\u0010E\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020\t2\u0006\u0010D\u001a\u00020\tJ\u000e\u0010F\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tJ\b\u0010H\u001a\u0004\u0018\u00010GJ\b\u0010I\u001a\u0004\u0018\u00010GJ\u0006\u0010J\u001a\u00020\u000bJ\u0014\u0010L\u001a\u00020\u000b2\n\u0010K\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0016J\u0012\u0010M\u001a\u00020\u000b2\n\u0010K\u001a\u0006\u0012\u0002\b\u00030\u0000J\u0014\u0010N\u001a\u00020\u000b2\n\u0010K\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0016J\u0014\u0010O\u001a\u00020\u000b2\n\u0010K\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0016J \u0010R\u001a\u00020\u000b2\b\u0010;\u001a\u0004\u0018\u00010:2\u0006\u0010P\u001a\u00020-2\u0006\u0010Q\u001a\u00020-J\u0006\u0010S\u001a\u00020\u000eJ\u0006\u0010T\u001a\u00020\u000eJ\u0006\u0010U\u001a\u00020\u000eJ\u0010\u0010W\u001a\u00020\u000e2\u0006\u0010V\u001a\u00020\u000bH\u0016J\u0006\u0010X\u001a\u00020\u000eJ\u0006\u0010Y\u001a\u00020\u000eJ\b\u0010Z\u001a\u00020\u000eH\u0016J\u0018\u0010[\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010D\u001a\u00020\tH\u0014J\u0018\u0010]\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\\\u001a\u00020\u0007H\u0014J\b\u0010^\u001a\u00020\u000eH\u0014J\b\u0010_\u001a\u00020\u000eH\u0014J\u0010\u0010b\u001a\u00020`2\u0006\u0010a\u001a\u00020`H\u0004J\u0006\u0010c\u001a\u00020\u000eJ\u0014\u0010f\u001a\u0006\u0012\u0002\b\u00030\u00002\b\u0010e\u001a\u0004\u0018\u00010dJ\b\u0010h\u001a\u00020gH\u0016R\u0014\u0010l\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0016\u0010o\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010q\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010kR\"\u0010w\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\br\u0010n\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR(\u0010;\u001a\u0004\u0018\u00010:2\b\u0010x\u001a\u0004\u0018\u00010:8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\b{\u0010|R$\u0010\u007f\u001a\u00020\u00072\u0006\u0010x\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b}\u0010n\u001a\u0004\b~\u0010tR(\u0010\"\u001a\u00020-2\u0006\u0010x\u001a\u00020-8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R(\u0010\u0011\u001a\u00020-2\u0006\u0010x\u001a\u00020-8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0084\u0001\u0010\u0081\u0001\u001a\u0006\b\u0085\u0001\u0010\u0083\u0001R)\u0010\u0089\u0001\u001a\u00020\u000b2\u0006\u0010x\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R(\u0010\u008b\u0001\u001a\u00020\u000b2\u0006\u0010x\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\bU\u0010\u0087\u0001\u001a\u0006\b\u008a\u0001\u0010\u0088\u0001R%\u0010\u008e\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bW\u0010n\u001a\u0005\b\u008c\u0001\u0010t\"\u0005\b\u008d\u0001\u0010vR,\u0010\u0092\u0001\u001a\u0004\u0018\u00010G2\b\u0010x\u001a\u0004\u0018\u00010G8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b\r\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R,\u0010\u0094\u0001\u001a\u0004\u0018\u00010G2\b\u0010x\u001a\u0004\u0018\u00010G8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b\u0016\u0010\u008f\u0001\u001a\u0006\b\u0093\u0001\u0010\u0091\u0001R&\u0010\u0096\u0001\u001a\u00020\u00072\u0006\u0010x\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\r\n\u0004\b\u0017\u0010n\u001a\u0005\b\u0095\u0001\u0010tR&\u0010\u0098\u0001\u001a\u00020\u00072\u0006\u0010x\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\r\n\u0004\bX\u0010n\u001a\u0005\b\u0097\u0001\u0010tR\u001f\u0010\u009b\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0099\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bS\u0010\u009a\u0001R(\u0010\u009f\u0001\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0013\u0010\u0087\u0001\u001a\u0006\b\u009c\u0001\u0010\u0088\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001b\u0010¢\u0001\u001a\u0005\u0018\u00010 \u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bI\u0010¡\u0001R)\u0010¦\u0001\u001a\u00030£\u00012\u0007\u0010x\u001a\u00030£\u00018\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0004\bH\u0010{\u001a\u0006\b¤\u0001\u0010¥\u0001R(\u0010¨\u0001\u001a\u00020-2\u0006\u0010x\u001a\u00020-8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b\u001a\u0010\u0081\u0001\u001a\u0006\b§\u0001\u0010\u0083\u0001R(\u0010ª\u0001\u001a\u00020-2\u0006\u0010x\u001a\u00020-8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b!\u0010\u0081\u0001\u001a\u0006\b©\u0001\u0010\u0083\u0001R\u0017\u0010+\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b \u0010\u0087\u0001R\u0018\u0010«\u0001\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u000f\u0010\u0081\u0001R\u0018\u0010¬\u0001\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\"\u0010\u0081\u0001R\u0017\u0010&\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0011\u0010\u0087\u0001R&\u0010®\u0001\u001a\u00020\u00072\u0006\u0010x\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\r\n\u0004\b\u0010\u0010n\u001a\u0005\b\u00ad\u0001\u0010tR\u0019\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bY\u0010¯\u0001R\u001a\u0010±\u0001\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0012\u0010°\u0001R\u001a\u0010³\u0001\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bT\u0010²\u0001R%\u0010µ\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\b\u0010n\u001a\u0005\b\u0081\u0001\u0010t\"\u0005\b´\u0001\u0010vR)\u0010¸\u0001\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010\u0087\u0001\u001a\u0006\b¶\u0001\u0010\u0088\u0001\"\u0006\b·\u0001\u0010\u009e\u0001R)\u0010»\u0001\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0081\u0001\u0010\u0087\u0001\u001a\u0006\b¹\u0001\u0010\u0088\u0001\"\u0006\bº\u0001\u0010\u009e\u0001R)\u0010¾\u0001\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¤\u0001\u0010\u0087\u0001\u001a\u0006\b¼\u0001\u0010\u0088\u0001\"\u0006\b½\u0001\u0010\u009e\u0001R\u0014\u0010À\u0001\u001a\u00020-8F¢\u0006\b\u001a\u0006\b¿\u0001\u0010\u0083\u0001R\u0014\u0010Â\u0001\u001a\u00020-8F¢\u0006\b\u001a\u0006\bÁ\u0001\u0010\u0083\u0001R\u0014\u0010Ä\u0001\u001a\u00020-8F¢\u0006\b\u001a\u0006\bÃ\u0001\u0010\u0083\u0001R\u0013\u0010Å\u0001\u001a\u00020-8F¢\u0006\u0007\u001a\u0005\bn\u0010\u0083\u0001¨\u0006È\u0001"}, m15073d2 = {"Lef/d;", "ConcreteGestureHandlerT", "", "Landroid/content/Context;", "context", "Landroid/view/Window;", "T", "", "D", "Landroid/view/MotionEvent;", "event", "", "c0", "l", "", "w", "z", "y", "B", "q", "Lef/d$c;", "pointerData", "m", "n", "Lcom/facebook/react/bridge/WritableMap;", "kotlin.jvm.PlatformType", "t", "newState", "b0", "m0", "()Lef/d;", "prevState", "v", "u", "x", "k0", "other", "V", "shouldCancelWhenOutside", "y0", "(Z)Lef/d;", ViewProps.ENABLED, "r0", "manualActivation", "v0", "", "leftPad", "topPad", "rightPad", "bottomPad", "width", "height", "t0", "(FFFFFF)Lef/d;", "Lef/e;", "controller", "u0", "(Lef/e;)Lef/d;", "Landroid/view/View;", "view", "Lef/g;", "orchestrator", "i0", "f0", "pointerId", "F0", "G0", "transformedEvent", "sourceEvent", "U", "I0", "Lcom/facebook/react/bridge/WritableArray;", "s", "r", "J0", "handler", "D0", "E0", "C0", "B0", "posX", "posY", "a0", "p", "C", "j", "force", "k", "o", "A", "l0", "e0", "previousState", "h0", "g0", "d0", "Landroid/graphics/PointF;", "point", "H0", "j0", "Lef/n;", "listener", "x0", "", "toString", "", "a", "[I", "trackedPointerIDs", "b", "I", "trackedPointersIDsCount", "c", "windowOffset", "d", "P", "()I", "A0", "(I)V", "tag", "<set-?>", "e", "Landroid/view/View;", "S", "()Landroid/view/View;", "f", "O", "state", "g", "F", "getX", "()F", "h", "getY", "i", "Z", "()Z", "isWithinBounds", "Y", "isEnabled", "E", "n0", "actionType", "Lcom/facebook/react/bridge/WritableArray;", "getChangedTouchesPayload", "()Lcom/facebook/react/bridge/WritableArray;", "changedTouchesPayload", "getAllTouchesPayload", "allTouchesPayload", "Q", "touchEventType", "R", "trackedPointersCount", "", "[Lef/d$c;", "trackedPointers", "L", "w0", "(Z)V", "needsPointerData", "", "[F", "hitSlop", "", "G", "()S", "eventCoalescingKey", "getLastAbsolutePositionX", "lastAbsolutePositionX", "getLastAbsolutePositionY", "lastAbsolutePositionY", "lastEventOffsetX", "lastEventOffsetY", "M", "numberOfPointers", "Lef/g;", "Lef/n;", "onTouchEventListener", "Lef/e;", "interactionController", "o0", "activationIndex", "W", "p0", "isActive", "X", "q0", "isAwaiting", "N", "z0", "shouldResetProgress", "J", "lastRelativePositionX", "K", "lastRelativePositionY", "H", "lastPositionInWindowX", "lastPositionInWindowY", "<init>", "()V", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: ef.d */
/* loaded from: classes8.dex */
public class C6832d<ConcreteGestureHandlerT extends C6832d<ConcreteGestureHandlerT>> {

    /* renamed from: H */
    public static final C6834b f38245H = new C6834b(null);

    /* renamed from: I */
    private static MotionEvent.PointerProperties[] f38246I;

    /* renamed from: J */
    private static MotionEvent.PointerCoords[] f38247J;

    /* renamed from: K */
    private static short f38248K;

    /* renamed from: A */
    private C6838g f38249A;

    /* renamed from: B */
    private AbstractC6853n f38250B;

    /* renamed from: C */
    private AbstractC6836e f38251C;

    /* renamed from: D */
    private int f38252D;

    /* renamed from: E */
    private boolean f38253E;

    /* renamed from: F */
    private boolean f38254F;

    /* renamed from: G */
    private boolean f38255G;

    /* renamed from: a */
    private final int[] f14916a = new int[12];

    /* renamed from: b */
    private int f14917b;

    /* renamed from: c */
    private final int[] f14918c;

    /* renamed from: d */
    private int f14919d;

    /* renamed from: e */
    private View f14920e;

    /* renamed from: f */
    private int f14921f;

    /* renamed from: g */
    private float f14922g;

    /* renamed from: h */
    private float f14923h;

    /* renamed from: i */
    private boolean f14924i;

    /* renamed from: j */
    private boolean f14925j;

    /* renamed from: k */
    private int f14926k;

    /* renamed from: l */
    private WritableArray f14927l;

    /* renamed from: m */
    private WritableArray f14928m;

    /* renamed from: n */
    private int f14929n;

    /* renamed from: o */
    private int f14930o;

    /* renamed from: p */
    private final C6835c[] f14931p;

    /* renamed from: q */
    private boolean f14932q;

    /* renamed from: r */
    private float[] f14933r;

    /* renamed from: s */
    private short f14934s;

    /* renamed from: t */
    private float f14935t;

    /* renamed from: u */
    private float f14936u;

    /* renamed from: v */
    private boolean f14937v;

    /* renamed from: w */
    private float f14938w;

    /* renamed from: x */
    private float f14939x;

    /* renamed from: y */
    private boolean f14940y;

    /* renamed from: z */
    private int f14941z;

    @Metadata(m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B'\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m15073d2 = {"Lef/d$a;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lef/d;", "handler", "Landroid/view/MotionEvent;", "event", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "e", "<init>", "(Lef/d;Landroid/view/MotionEvent;Ljava/lang/IllegalArgumentException;)V", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: ef.d$a */
    /* loaded from: classes8.dex */
    public static final class C6833a extends Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C6833a(p085ef.C6832d<?> r12, android.view.MotionEvent r13, java.lang.IllegalArgumentException r14) {
            /*
                r11 = this;
                java.lang.String r0 = "handler"
                kotlin.jvm.internal.C9971q.m14633g(r12, r0)
                java.lang.String r0 = "event"
                kotlin.jvm.internal.C9971q.m14633g(r13, r0)
                java.lang.String r0 = "e"
                kotlin.jvm.internal.C9971q.m14633g(r14, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "\n    handler: "
                r0.append(r1)
                java.lang.Class r1 = r12.getClass()
                kotlin.reflect.KClass r1 = kotlin.jvm.internal.C9951f0.m14684b(r1)
                java.lang.String r1 = r1.mo14598l()
                r0.append(r1)
                java.lang.String r1 = "\n    state: "
                r0.append(r1)
                int r1 = r12.m24226O()
                r0.append(r1)
                java.lang.String r1 = "\n    view: "
                r0.append(r1)
                android.view.View r1 = r12.m24222S()
                r0.append(r1)
                java.lang.String r1 = "\n    orchestrator: "
                r0.append(r1)
                ef.g r1 = p085ef.C6832d.m24212b(r12)
                r0.append(r1)
                java.lang.String r1 = "\n    isEnabled: "
                r0.append(r1)
                boolean r1 = r12.m24216Y()
                r0.append(r1)
                java.lang.String r1 = "\n    isActive: "
                r0.append(r1)
                boolean r1 = r12.m24218W()
                r0.append(r1)
                java.lang.String r1 = "\n    isAwaiting: "
                r0.append(r1)
                boolean r1 = r12.m24217X()
                r0.append(r1)
                java.lang.String r1 = "\n    trackedPointersCount: "
                r0.append(r1)
                int r1 = p085ef.C6832d.m24206f(r12)
                r0.append(r1)
                java.lang.String r1 = "\n    trackedPointers: "
                r0.append(r1)
                int[] r2 = p085ef.C6832d.m24207e(r12)
                java.lang.String r3 = ", "
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 62
                r10 = 0
                java.lang.String r12 = kotlin.collections.C9894b.m15036b0(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                r0.append(r12)
                java.lang.String r12 = "\n    while handling event: "
                r0.append(r12)
                r0.append(r13)
                java.lang.String r12 = "\n    "
                r0.append(r12)
                java.lang.String r12 = r0.toString()
                java.lang.String r12 = p326ri.C12707l.m5785f(r12)
                r11.<init>(r12, r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p085ef.C6832d.C6833a.<init>(ef.d, android.view.MotionEvent, java.lang.IllegalArgumentException):void");
        }
    }

    @Metadata(m15074d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b,\u0010-J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000bR\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000bR\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000bR\u0014\u0010\u0016\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000bR\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000bR\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u000bR\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u000bR\u0014\u0010\u001c\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u000bR\u0014\u0010\u001d\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u000bR\u0014\u0010\u001e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u000bR\u0014\u0010\u001f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u000bR\u0014\u0010 \u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u000bR\u0014\u0010!\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u000bR\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001e\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u001e\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006."}, m15073d2 = {"Lef/d$b;", "", "", "size", "", "d", "", "value", "", "c", "ACTION_TYPE_JS_FUNCTION_NEW_API", "I", "ACTION_TYPE_JS_FUNCTION_OLD_API", "ACTION_TYPE_NATIVE_ANIMATED_EVENT", "ACTION_TYPE_REANIMATED_WORKLET", "DIRECTION_DOWN", "DIRECTION_LEFT", "DIRECTION_RIGHT", "DIRECTION_UP", "HIT_SLOP_BOTTOM_IDX", "HIT_SLOP_HEIGHT_IDX", "HIT_SLOP_LEFT_IDX", "HIT_SLOP_NONE", "F", "HIT_SLOP_RIGHT_IDX", "HIT_SLOP_TOP_IDX", "HIT_SLOP_WIDTH_IDX", "MAX_POINTERS_COUNT", "STATE_ACTIVE", "STATE_BEGAN", "STATE_CANCELLED", "STATE_END", "STATE_FAILED", "STATE_UNDETERMINED", "", "nextEventCoalescingKey", "S", "", "Landroid/view/MotionEvent$PointerCoords;", "pointerCoords", "[Landroid/view/MotionEvent$PointerCoords;", "Landroid/view/MotionEvent$PointerProperties;", "pointerProps", "[Landroid/view/MotionEvent$PointerProperties;", "<init>", "()V", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: ef.d$b */
    /* loaded from: classes8.dex */
    public static final class C6834b {
        private C6834b() {
        }

        public /* synthetic */ C6834b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public final boolean m24170c(float f) {
            return !Float.isNaN(f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public final void m24169d(int i) {
            if (C6832d.f38246I == null) {
                C6832d.f38246I = new MotionEvent.PointerProperties[12];
                C6832d.f38247J = new MotionEvent.PointerCoords[12];
            }
            while (i > 0) {
                MotionEvent.PointerProperties[] pointerPropertiesArr = C6832d.f38246I;
                MotionEvent.PointerCoords[] pointerCoordsArr = null;
                if (pointerPropertiesArr == null) {
                    C9971q.m14615y("pointerProps");
                    pointerPropertiesArr = null;
                }
                int i2 = i - 1;
                if (pointerPropertiesArr[i2] == null) {
                    MotionEvent.PointerProperties[] pointerPropertiesArr2 = C6832d.f38246I;
                    if (pointerPropertiesArr2 == null) {
                        C9971q.m14615y("pointerProps");
                        pointerPropertiesArr2 = null;
                    }
                    pointerPropertiesArr2[i2] = new MotionEvent.PointerProperties();
                    MotionEvent.PointerCoords[] pointerCoordsArr2 = C6832d.f38247J;
                    if (pointerCoordsArr2 == null) {
                        C9971q.m14615y("pointerCoords");
                    } else {
                        pointerCoordsArr = pointerCoordsArr2;
                    }
                    pointerCoordsArr[i2] = new MotionEvent.PointerCoords();
                    i--;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0011\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u000e\u0012\u0006\u0010\u001a\u001a\u00020\u000e\u0012\u0006\u0010\u001c\u001a\u00020\u000e¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0018\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\"\u0010\u001a\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\t\u0010\u0012\"\u0004\b\u0019\u0010\u0014R\"\u0010\u001c\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u000f\u0010\u0012\"\u0004\b\u001b\u0010\u0014¨\u0006\u001f"}, m15073d2 = {"Lef/d$c;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "c", "()I", "pointerId", "", "b", "F", "d", "()F", "h", "(F)V", "x", "e", "i", "y", "f", "absoluteX", "g", "absoluteY", "<init>", "(IFFFF)V", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: ef.d$c */
    /* loaded from: classes8.dex */
    public static final class C6835c {

        /* renamed from: a */
        private final int f14942a;

        /* renamed from: b */
        private float f14943b;

        /* renamed from: c */
        private float f14944c;

        /* renamed from: d */
        private float f14945d;

        /* renamed from: e */
        private float f14946e;

        public C6835c(int i, float f, float f2, float f3, float f4) {
            this.f14942a = i;
            this.f14943b = f;
            this.f14944c = f2;
            this.f14945d = f3;
            this.f14946e = f4;
        }

        /* renamed from: a */
        public final float m24168a() {
            return this.f14945d;
        }

        /* renamed from: b */
        public final float m24167b() {
            return this.f14946e;
        }

        /* renamed from: c */
        public final int m24166c() {
            return this.f14942a;
        }

        /* renamed from: d */
        public final float m24165d() {
            return this.f14943b;
        }

        /* renamed from: e */
        public final float m24164e() {
            return this.f14944c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6835c)) {
                return false;
            }
            C6835c cVar = (C6835c) obj;
            return this.f14942a == cVar.f14942a && Float.compare(this.f14943b, cVar.f14943b) == 0 && Float.compare(this.f14944c, cVar.f14944c) == 0 && Float.compare(this.f14945d, cVar.f14945d) == 0 && Float.compare(this.f14946e, cVar.f14946e) == 0;
        }

        /* renamed from: f */
        public final void m24163f(float f) {
            this.f14945d = f;
        }

        /* renamed from: g */
        public final void m24162g(float f) {
            this.f14946e = f;
        }

        /* renamed from: h */
        public final void m24161h(float f) {
            this.f14943b = f;
        }

        public int hashCode() {
            return (((((((this.f14942a * 31) + Float.floatToIntBits(this.f14943b)) * 31) + Float.floatToIntBits(this.f14944c)) * 31) + Float.floatToIntBits(this.f14945d)) * 31) + Float.floatToIntBits(this.f14946e);
        }

        /* renamed from: i */
        public final void m24160i(float f) {
            this.f14944c = f;
        }

        public String toString() {
            return "PointerData(pointerId=" + this.f14942a + ", x=" + this.f14943b + ", y=" + this.f14944c + ", absoluteX=" + this.f14945d + ", absoluteY=" + this.f14946e + ')';
        }
    }

    public C6832d() {
        int[] iArr = new int[2];
        for (int i = 0; i < 2; i++) {
            iArr[i] = 0;
        }
        this.f14918c = iArr;
        this.f14925j = true;
        C6835c[] cVarArr = new C6835c[12];
        for (int i2 = 0; i2 < 12; i2++) {
            cVarArr[i2] = null;
        }
        this.f14931p = cVarArr;
    }

    /* renamed from: B */
    private final void m24246B() {
        C6835c[] cVarArr;
        this.f14928m = null;
        for (C6835c cVar : this.f14931p) {
            if (cVar != null) {
                m24196n(cVar);
            }
        }
    }

    /* renamed from: D */
    private final int m24244D() {
        int[] iArr;
        int i = 0;
        while (i < this.f14917b) {
            int i2 = 0;
            while (true) {
                iArr = this.f14916a;
                if (i2 >= iArr.length || iArr[i2] == i) {
                    break;
                }
                i2++;
            }
            if (i2 == iArr.length) {
                return i;
            }
            i++;
        }
        return i;
    }

    /* renamed from: T */
    private final Window m24221T(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return ((Activity) context).getWindow();
        }
        if (context instanceof ContextWrapper) {
            return m24221T(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* renamed from: b0 */
    private final void m24211b0(int i) {
        UiThreadUtil.assertOnUiThread();
        if (this.f14921f != i) {
            if (this.f14930o > 0 && (i == 5 || i == 3 || i == 1)) {
                m24190q();
            }
            int i2 = this.f14921f;
            this.f14921f = i;
            if (i == 4) {
                short s = f38248K;
                f38248K = (short) (s + 1);
                this.f14934s = s;
            }
            C6838g gVar = this.f38249A;
            C9971q.m14636d(gVar);
            gVar.m24133t(this, i, i2);
            mo24105h0(i, i2);
        }
    }

    /* renamed from: c0 */
    private final boolean m24209c0(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != this.f14917b) {
            return true;
        }
        int length = this.f14916a.length;
        for (int i = 0; i < length; i++) {
            int i2 = this.f14916a[i];
            if (!(i2 == -1 || i2 == i)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00b6 A[EDGE_INSN: B:83:0x00b6->B:44:0x00b6 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.view.MotionEvent$PointerProperties[]] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.view.MotionEvent m24199l(android.view.MotionEvent r27) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p085ef.C6832d.m24199l(android.view.MotionEvent):android.view.MotionEvent");
    }

    /* renamed from: m */
    private final void m24198m(C6835c cVar) {
        if (this.f14927l == null) {
            this.f14927l = Arguments.createArray();
        }
        WritableArray writableArray = this.f14927l;
        C9971q.m14636d(writableArray);
        writableArray.pushMap(m24184t(cVar));
    }

    /* renamed from: n */
    private final void m24196n(C6835c cVar) {
        if (this.f14928m == null) {
            this.f14928m = Arguments.createArray();
        }
        WritableArray writableArray = this.f14928m;
        C9971q.m14636d(writableArray);
        writableArray.pushMap(m24184t(cVar));
    }

    /* renamed from: q */
    private final void m24190q() {
        C6835c[] cVarArr;
        this.f14929n = 4;
        this.f14927l = null;
        m24246B();
        for (C6835c cVar : this.f14931p) {
            if (cVar != null) {
                m24198m(cVar);
            }
        }
        this.f14930o = 0;
        C9897e.m14982m(this.f14931p, null, 0, 0, 6, null);
        m24178x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s0 */
    public static final void m24185s0(C6832d this_applySelf) {
        C9971q.m14633g(this_applySelf, "$this_applySelf");
        this_applySelf.m24192p();
    }

    /* renamed from: t */
    private final WritableMap m24184t(C6835c cVar) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", cVar.m24166c());
        createMap.putDouble("x", PixelUtil.toDIPFromPixel(cVar.m24165d()));
        createMap.putDouble("y", PixelUtil.toDIPFromPixel(cVar.m24164e()));
        createMap.putDouble("absoluteX", PixelUtil.toDIPFromPixel(cVar.m24168a()));
        createMap.putDouble("absoluteY", PixelUtil.toDIPFromPixel(cVar.m24167b()));
        return createMap;
    }

    /* renamed from: w */
    private final void m24180w(MotionEvent motionEvent) {
        this.f14927l = null;
        this.f14929n = 1;
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        this.f14931p[pointerId] = new C6835c(pointerId, motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex()), (motionEvent.getX(motionEvent.getActionIndex()) + (motionEvent.getRawX() - motionEvent.getX())) - this.f14918c[0], (motionEvent.getY(motionEvent.getActionIndex()) + (motionEvent.getRawY() - motionEvent.getY())) - this.f14918c[1]);
        this.f14930o++;
        C6835c cVar = this.f14931p[pointerId];
        C9971q.m14636d(cVar);
        m24198m(cVar);
        m24246B();
        m24178x();
    }

    /* renamed from: y */
    private final void m24176y(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        this.f14927l = null;
        this.f14929n = 2;
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        int pointerCount = motionEvent.getPointerCount();
        int i = 0;
        for (int i2 = 0; i2 < pointerCount; i2++) {
            C6835c cVar = this.f14931p[motionEvent.getPointerId(i2)];
            if (cVar != null) {
                if (cVar.m24165d() == motionEvent.getX(i2)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (cVar.m24164e() == motionEvent.getY(i2)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                    }
                }
                cVar.m24161h(motionEvent.getX(i2));
                cVar.m24160i(motionEvent.getY(i2));
                cVar.m24163f((motionEvent.getX(i2) + rawX) - this.f14918c[0]);
                cVar.m24162g((motionEvent.getY(i2) + rawY) - this.f14918c[1]);
                m24198m(cVar);
                i++;
            }
        }
        if (i > 0) {
            m24246B();
            m24178x();
        }
    }

    /* renamed from: z */
    private final void m24174z(MotionEvent motionEvent) {
        m24246B();
        this.f14927l = null;
        this.f14929n = 3;
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        this.f14931p[pointerId] = new C6835c(pointerId, motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex()), (motionEvent.getX(motionEvent.getActionIndex()) + (motionEvent.getRawX() - motionEvent.getX())) - this.f14918c[0], (motionEvent.getY(motionEvent.getActionIndex()) + (motionEvent.getRawY() - motionEvent.getY())) - this.f14918c[1]);
        C6835c cVar = this.f14931p[pointerId];
        C9971q.m14636d(cVar);
        m24198m(cVar);
        this.f14931p[pointerId] = null;
        this.f14930o--;
        m24178x();
    }

    /* renamed from: A */
    public final void m24248A() {
        int i = this.f14921f;
        if (i == 2 || i == 4) {
            m24211b0(5);
        }
    }

    /* renamed from: A0 */
    public final void m24247A0(int i) {
        this.f14919d = i;
    }

    /* renamed from: B0 */
    public boolean mo24102B0(C6832d<?> handler) {
        AbstractC6836e eVar;
        C9971q.m14633g(handler, "handler");
        if (handler == this || (eVar = this.f38251C) == null) {
            return false;
        }
        return eVar.mo24158b(this, handler);
    }

    /* renamed from: C */
    public final void m24245C() {
        int i = this.f14921f;
        if (i == 4 || i == 0 || i == 2) {
            m24211b0(1);
        }
    }

    /* renamed from: C0 */
    public boolean mo24101C0(C6832d<?> handler) {
        C9971q.m14633g(handler, "handler");
        if (handler == this) {
            return true;
        }
        AbstractC6836e eVar = this.f38251C;
        if (eVar != null) {
            return eVar.mo24159a(this, handler);
        }
        return false;
    }

    /* renamed from: D0 */
    public boolean m24243D0(C6832d<?> handler) {
        AbstractC6836e eVar;
        C9971q.m14633g(handler, "handler");
        if (handler == this || (eVar = this.f38251C) == null) {
            return false;
        }
        return eVar.mo24156d(this, handler);
    }

    /* renamed from: E */
    public final int m24242E() {
        return this.f14926k;
    }

    /* renamed from: E0 */
    public final boolean m24241E0(C6832d<?> handler) {
        AbstractC6836e eVar;
        C9971q.m14633g(handler, "handler");
        if (handler == this || (eVar = this.f38251C) == null) {
            return false;
        }
        return eVar.mo24157c(this, handler);
    }

    /* renamed from: F */
    public final int m24240F() {
        return this.f38252D;
    }

    /* renamed from: F0 */
    public final void m24239F0(int i) {
        int[] iArr = this.f14916a;
        if (iArr[i] == -1) {
            iArr[i] = m24244D();
            this.f14917b++;
        }
    }

    /* renamed from: G */
    public final short m24238G() {
        return this.f14934s;
    }

    /* renamed from: G0 */
    public final void m24237G0(int i) {
        int[] iArr = this.f14916a;
        if (iArr[i] != -1) {
            iArr[i] = -1;
            this.f14917b--;
        }
    }

    /* renamed from: H */
    public final float m24236H() {
        return (this.f14935t + this.f14938w) - this.f14918c[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: H0 */
    public final PointF m24235H0(PointF point) {
        PointF A;
        C9971q.m14633g(point, "point");
        C6838g gVar = this.f38249A;
        if (gVar != null && (A = gVar.m24155A(this.f14920e, point)) != null) {
            return A;
        }
        point.x = Float.NaN;
        point.y = Float.NaN;
        return point;
    }

    /* renamed from: I */
    public final float m24234I() {
        return (this.f14936u + this.f14939x) - this.f14918c[1];
    }

    /* renamed from: I0 */
    public final void m24233I0(MotionEvent event) {
        C9971q.m14633g(event, "event");
        if (event.getActionMasked() == 0 || event.getActionMasked() == 5) {
            m24180w(event);
            m24176y(event);
        } else if (event.getActionMasked() == 1 || event.getActionMasked() == 6) {
            m24176y(event);
            m24174z(event);
        } else if (event.getActionMasked() == 2) {
            m24176y(event);
        }
    }

    /* renamed from: J */
    public final float m24232J() {
        return this.f14935t;
    }

    /* renamed from: J0 */
    public final boolean m24231J0() {
        int i;
        if (!this.f14925j || (i = this.f14921f) == 1 || i == 3 || i == 5 || this.f14917b <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: K */
    public final float m24230K() {
        return this.f14936u;
    }

    /* renamed from: L */
    public final boolean m24229L() {
        return this.f14932q;
    }

    /* renamed from: M */
    public final int m24228M() {
        return this.f14941z;
    }

    /* renamed from: N */
    public final boolean m24227N() {
        return this.f38255G;
    }

    /* renamed from: O */
    public final int m24226O() {
        return this.f14921f;
    }

    /* renamed from: P */
    public final int m24225P() {
        return this.f14919d;
    }

    /* renamed from: Q */
    public final int m24224Q() {
        return this.f14929n;
    }

    /* renamed from: R */
    public final int m24223R() {
        return this.f14930o;
    }

    /* renamed from: S */
    public final View m24222S() {
        return this.f14920e;
    }

    /* renamed from: U */
    public final void m24220U(MotionEvent transformedEvent, MotionEvent sourceEvent) {
        int i;
        C9971q.m14633g(transformedEvent, "transformedEvent");
        C9971q.m14633g(sourceEvent, "sourceEvent");
        if (this.f14925j && (i = this.f14921f) != 3 && i != 1 && i != 5 && this.f14917b >= 1) {
            try {
                MotionEvent l = m24199l(sourceEvent);
                MotionEvent motionEvent = new MotionEvent[]{m24199l(transformedEvent), l}[0];
                this.f14922g = motionEvent.getX();
                this.f14923h = motionEvent.getY();
                this.f14941z = motionEvent.getPointerCount();
                boolean a0 = m24213a0(this.f14920e, this.f14922g, this.f14923h);
                this.f14924i = a0;
                if (!this.f14940y || a0) {
                    C6842i iVar = C6842i.f14968a;
                    this.f14935t = iVar.m24112a(motionEvent, true);
                    this.f14936u = iVar.m24111b(motionEvent, true);
                    this.f14938w = motionEvent.getRawX() - motionEvent.getX();
                    this.f14939x = motionEvent.getRawY() - motionEvent.getY();
                    mo23998e0(motionEvent, l);
                    if (!C9971q.m14638b(motionEvent, transformedEvent)) {
                        motionEvent.recycle();
                    }
                    if (!C9971q.m14638b(l, sourceEvent)) {
                        l.recycle();
                        return;
                    }
                    return;
                }
                int i2 = this.f14921f;
                if (i2 == 4) {
                    m24192p();
                } else if (i2 == 2) {
                    m24245C();
                }
            } catch (C6833a unused) {
                m24245C();
            }
        }
    }

    /* renamed from: V */
    public final boolean m24219V(C6832d<?> other) {
        C9971q.m14633g(other, "other");
        int length = this.f14916a.length;
        for (int i = 0; i < length; i++) {
            if (!(this.f14916a[i] == -1 || other.f14916a[i] == -1)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: W */
    public final boolean m24218W() {
        return this.f38253E;
    }

    /* renamed from: X */
    public final boolean m24217X() {
        return this.f38254F;
    }

    /* renamed from: Y */
    public final boolean m24216Y() {
        return this.f14925j;
    }

    /* renamed from: Z */
    public final boolean m24215Z() {
        return this.f14924i;
    }

    /* renamed from: a0 */
    public final boolean m24213a0(View view, float f, float f2) {
        float f3;
        boolean z;
        boolean z2;
        float f4;
        C9971q.m14636d(view);
        float width = view.getWidth();
        float height = view.getHeight();
        float[] fArr = this.f14933r;
        float f5 = 0.0f;
        if (fArr != null) {
            float f6 = fArr[0];
            float f7 = fArr[1];
            float f8 = fArr[2];
            float f9 = fArr[3];
            C6834b bVar = f38245H;
            if (bVar.m24170c(f6)) {
                f4 = 0.0f - f6;
            } else {
                f4 = 0.0f;
            }
            if (bVar.m24170c(f7)) {
                f5 = 0.0f - f7;
            }
            if (bVar.m24170c(f8)) {
                width += f8;
            }
            if (bVar.m24170c(f9)) {
                height += f9;
            }
            float f10 = fArr[4];
            float f11 = fArr[5];
            if (bVar.m24170c(f10)) {
                if (!bVar.m24170c(f6)) {
                    f4 = width - f10;
                } else if (!bVar.m24170c(f8)) {
                    width = f10 + f4;
                }
            }
            if (bVar.m24170c(f11)) {
                if (!bVar.m24170c(f7)) {
                    f5 = height - f11;
                } else if (!bVar.m24170c(f9)) {
                    height = f11 + f5;
                }
            }
            f3 = f5;
            f5 = f4;
        } else {
            f3 = 0.0f;
        }
        if (f5 > f || f > width) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (f3 > f2 || f2 > height) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d0 */
    protected void mo23999d0() {
    }

    /* renamed from: e0 */
    protected void mo23998e0(MotionEvent event, MotionEvent sourceEvent) {
        C9971q.m14633g(event, "event");
        C9971q.m14633g(sourceEvent, "sourceEvent");
        m24211b0(1);
    }

    /* renamed from: f0 */
    protected void mo24097f0() {
    }

    /* renamed from: g0 */
    protected void mo23997g0() {
    }

    /* renamed from: h0 */
    protected void mo24105h0(int i, int i2) {
    }

    /* renamed from: i0 */
    public final void m24202i0(View view, C6838g gVar) {
        boolean z;
        Context context;
        if (this.f14920e == null && this.f38249A == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Arrays.fill(this.f14916a, -1);
            this.f14917b = 0;
            this.f14921f = 0;
            this.f14920e = view;
            this.f38249A = gVar;
            View view2 = null;
            if (view != null) {
                context = view.getContext();
            } else {
                context = null;
            }
            Window T = m24221T(context);
            if (T != null) {
                view2 = T.getDecorView();
            }
            if (view2 != null) {
                Rect rect = new Rect();
                view2.getWindowVisibleDisplayFrame(rect);
                int[] iArr = this.f14918c;
                iArr[0] = rect.left;
                iArr[1] = rect.top;
            } else {
                int[] iArr2 = this.f14918c;
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            mo24097f0();
            return;
        }
        throw new IllegalStateException("Already prepared or hasn't been reset".toString());
    }

    /* renamed from: j */
    public final void m24201j() {
        mo23996k(false);
    }

    /* renamed from: j0 */
    public final void m24200j0() {
        this.f14920e = null;
        this.f38249A = null;
        Arrays.fill(this.f14916a, -1);
        this.f14917b = 0;
        this.f14930o = 0;
        C9897e.m14982m(this.f14931p, null, 0, 0, 6, null);
        this.f14929n = 0;
        mo23997g0();
    }

    /* renamed from: k */
    public void mo23996k(boolean z) {
        if (!this.f14937v || z) {
            int i = this.f14921f;
            if (i == 0 || i == 2) {
                m24211b0(4);
            }
        }
    }

    /* renamed from: k0 */
    public void mo23995k0() {
        this.f14932q = false;
        this.f14937v = false;
        this.f14940y = false;
        this.f14925j = true;
        this.f14933r = null;
    }

    /* renamed from: l0 */
    public void mo24030l0() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m0 */
    public final ConcreteGestureHandlerT m24197m0() {
        C9971q.m14635e(this, "null cannot be cast to non-null type ConcreteGestureHandlerT of com.swmansion.gesturehandler.core.GestureHandler");
        return this;
    }

    /* renamed from: n0 */
    public final void m24195n0(int i) {
        this.f14926k = i;
    }

    /* renamed from: o */
    public final void m24194o() {
        if (this.f14921f == 0) {
            m24211b0(2);
        }
    }

    /* renamed from: o0 */
    public final void m24193o0(int i) {
        this.f38252D = i;
    }

    /* renamed from: p */
    public final void m24192p() {
        int i = this.f14921f;
        if (i == 4 || i == 0 || i == 2) {
            mo23999d0();
            m24211b0(3);
        }
    }

    /* renamed from: p0 */
    public final void m24191p0(boolean z) {
        this.f38253E = z;
    }

    /* renamed from: q0 */
    public final void m24189q0(boolean z) {
        this.f38254F = z;
    }

    /* renamed from: r */
    public final WritableArray m24188r() {
        WritableArray writableArray = this.f14928m;
        this.f14928m = null;
        return writableArray;
    }

    /* renamed from: r0 */
    public final ConcreteGestureHandlerT m24187r0(boolean z) {
        final ConcreteGestureHandlerT concretegesturehandlert = (ConcreteGestureHandlerT) m24197m0();
        if (!(concretegesturehandlert.f14920e == null || concretegesturehandlert.f14925j == z)) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: ef.c
                @Override // java.lang.Runnable
                public final void run() {
                    C6832d.m24185s0(C6832d.this);
                }
            });
        }
        concretegesturehandlert.f14925j = z;
        return concretegesturehandlert;
    }

    /* renamed from: s */
    public final WritableArray m24186s() {
        WritableArray writableArray = this.f14927l;
        this.f14927l = null;
        return writableArray;
    }

    /* renamed from: t0 */
    public final ConcreteGestureHandlerT m24183t0(float f, float f2, float f3, float f4, float f5, float f6) {
        boolean z;
        boolean z2;
        boolean z3;
        ConcreteGestureHandlerT concretegesturehandlert = (ConcreteGestureHandlerT) m24197m0();
        if (concretegesturehandlert.f14933r == null) {
            concretegesturehandlert.f14933r = new float[6];
        }
        float[] fArr = concretegesturehandlert.f14933r;
        C9971q.m14636d(fArr);
        boolean z4 = false;
        fArr[0] = f;
        float[] fArr2 = concretegesturehandlert.f14933r;
        C9971q.m14636d(fArr2);
        fArr2[1] = f2;
        float[] fArr3 = concretegesturehandlert.f14933r;
        C9971q.m14636d(fArr3);
        fArr3[2] = f3;
        float[] fArr4 = concretegesturehandlert.f14933r;
        C9971q.m14636d(fArr4);
        fArr4[3] = f4;
        float[] fArr5 = concretegesturehandlert.f14933r;
        C9971q.m14636d(fArr5);
        fArr5[4] = f5;
        float[] fArr6 = concretegesturehandlert.f14933r;
        C9971q.m14636d(fArr6);
        fArr6[5] = f6;
        C6834b bVar = f38245H;
        if (!bVar.m24170c(f5) || !bVar.m24170c(f) || !bVar.m24170c(f3)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!bVar.m24170c(f5) || bVar.m24170c(f) || bVar.m24170c(f3)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (!bVar.m24170c(f6) || !bVar.m24170c(f4) || !bVar.m24170c(f2)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (!bVar.m24170c(f6) || bVar.m24170c(f4) || bVar.m24170c(f2)) {
                        z4 = true;
                    }
                    if (z4) {
                        return concretegesturehandlert;
                    }
                    throw new IllegalArgumentException("When height is set one of top or bottom pads need to be defined".toString());
                }
                throw new IllegalArgumentException("Cannot have all of top, bottom and height defined".toString());
            }
            throw new IllegalArgumentException("When width is set one of left or right pads need to be defined".toString());
        }
        throw new IllegalArgumentException("Cannot have all of left, right and width defined".toString());
    }

    public String toString() {
        String str;
        View view = this.f14920e;
        if (view == null) {
            str = null;
        } else {
            C9971q.m14636d(view);
            str = view.getClass().getSimpleName();
        }
        return getClass().getSimpleName() + "@[" + this.f14919d + "]:" + str;
    }

    /* renamed from: u */
    public void mo24104u(MotionEvent event) {
        C9971q.m14633g(event, "event");
        AbstractC6853n nVar = this.f38250B;
        if (nVar != null) {
            nVar.mo24081b(m24197m0(), event);
        }
    }

    /* renamed from: u0 */
    public final ConcreteGestureHandlerT m24182u0(AbstractC6836e eVar) {
        ConcreteGestureHandlerT concretegesturehandlert = (ConcreteGestureHandlerT) m24197m0();
        concretegesturehandlert.f38251C = eVar;
        return concretegesturehandlert;
    }

    /* renamed from: v */
    public void mo24103v(int i, int i2) {
        AbstractC6853n nVar = this.f38250B;
        if (nVar != null) {
            nVar.mo24080c(m24197m0(), i, i2);
        }
    }

    /* renamed from: v0 */
    public final ConcreteGestureHandlerT m24181v0(boolean z) {
        ConcreteGestureHandlerT concretegesturehandlert = (ConcreteGestureHandlerT) m24197m0();
        concretegesturehandlert.f14937v = z;
        return concretegesturehandlert;
    }

    /* renamed from: w0 */
    public final void m24179w0(boolean z) {
        this.f14932q = z;
    }

    /* renamed from: x */
    public void m24178x() {
        AbstractC6853n nVar;
        if (this.f14927l != null && (nVar = this.f38250B) != null) {
            nVar.mo24082a(m24197m0());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: x0 */
    public final C6832d<?> m24177x0(AbstractC6853n nVar) {
        this.f38250B = nVar;
        return this;
    }

    /* renamed from: y0 */
    public final ConcreteGestureHandlerT m24175y0(boolean z) {
        ConcreteGestureHandlerT concretegesturehandlert = (ConcreteGestureHandlerT) m24197m0();
        concretegesturehandlert.f14940y = z;
        return concretegesturehandlert;
    }

    /* renamed from: z0 */
    public final void m24173z0(boolean z) {
        this.f38255G = z;
    }
}
