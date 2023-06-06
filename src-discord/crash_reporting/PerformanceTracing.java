package com.discord.crash_reporting;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.uimanager.ViewProps;
import io.sentry.ISpan;
import io.sentry.k2;
import io.sentry.m0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kg.x;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.collections.w;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import lg.v;
import oj.u;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\b\u0018\u0000 M2\u00020\u0001:\u0003MNOB\u0007¢\u0006\u0004\bK\u0010LJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\r\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\u000bJ\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0004J\u0018\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004J$\u0010\u0018\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\u00152\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0016R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001d0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001f0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001cR$\u0010!\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010'\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R\"\u0010+\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00102\u001a\u0004\u0018\u0001018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001d\u00109\u001a\b\u0012\u0004\u0012\u000201088\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\"\u0010>\u001a\u00020=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR#\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040D8\u0006¢\u0006\f\n\u0004\bE\u0010\u001c\u001a\u0004\bF\u0010GR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00040H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006P"}, d2 = {"Lcom/discord/crash_reporting/PerformanceTracing;", "Lcom/facebook/react/bridge/ReactMarker$MarkerListener;", "Lcom/discord/crash_reporting/PerformanceTracing$TransactionMarker;", "transactionMarker", "", "getMarkerName", ZeroconfModule.KEY_SERVICE_NAME, "tag", "getMarker", "marker", "getParentSpanName", "", ViewProps.START, "stop", "startNativeModuleInit", "Lcom/discord/crash_reporting/TraceTransaction;", "transaction", "startTransaction", "stopTransaction", "logSpanForTransaction", "checkAndSetInitSection", "Lcom/facebook/react/bridge/ReactMarkerConstants;", "", "instanceKey", "logMarker", "", "Lio/sentry/m0;", "ongoingTransactions", "Ljava/util/Map;", "Lio/sentry/ISpan;", "ongoingSpans", "", "spanStarts", "lastNativeModuleSetupStart", "Lio/sentry/ISpan;", "getLastNativeModuleSetupStart", "()Lio/sentry/ISpan;", "setLastNativeModuleSetupStart", "(Lio/sentry/ISpan;)V", "lastProcessPackage", "getLastProcessPackage", "setLastProcessPackage", "", "stopped", "Z", "getStopped", "()Z", "setStopped", "(Z)V", "Lcom/discord/crash_reporting/PackageProcessTimings;", "currentProcessPackage", "Lcom/discord/crash_reporting/PackageProcessTimings;", "getCurrentProcessPackage", "()Lcom/discord/crash_reporting/PackageProcessTimings;", "setCurrentProcessPackage", "(Lcom/discord/crash_reporting/PackageProcessTimings;)V", "", "processPackageTimings", "Ljava/util/List;", "getProcessPackageTimings", "()Ljava/util/List;", "Lcom/discord/crash_reporting/StartupInitSection;", "startupInitSection", "Lcom/discord/crash_reporting/StartupInitSection;", "getStartupInitSection", "()Lcom/discord/crash_reporting/StartupInitSection;", "setStartupInitSection", "(Lcom/discord/crash_reporting/StartupInitSection;)V", "", "startupRootEventsTree", "getStartupRootEventsTree", "()Ljava/util/Map;", "", "wildcardEventNames", "Ljava/util/Set;", "<init>", "()V", "Companion", "MarkerEnd", "TransactionMarker", "crash_reporting_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class PerformanceTracing implements ReactMarker.MarkerListener {
    public static final Companion Companion = new Companion(null);
    private static PerformanceTracing performanceTracingInstance;
    private PackageProcessTimings currentProcessPackage;
    private ISpan lastNativeModuleSetupStart;
    private ISpan lastProcessPackage;
    private final Map<String, String> startupRootEventsTree;
    private final Set<String> wildcardEventNames;
    private final Map<TraceTransaction, m0> ongoingTransactions = new LinkedHashMap();
    private final Map<String, ISpan> ongoingSpans = new LinkedHashMap();
    private final Map<String, Long> spanStarts = new LinkedHashMap();
    private boolean stopped = true;
    private final List<PackageProcessTimings> processPackageTimings = new ArrayList();
    private StartupInitSection startupInitSection = StartupInitSection.ReactInstanceManager;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/discord/crash_reporting/PerformanceTracing$Companion;", "", "()V", "performanceTracingInstance", "Lcom/discord/crash_reporting/PerformanceTracing;", "get", "crash_reporting_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PerformanceTracing get() {
            if (PerformanceTracing.performanceTracingInstance == null) {
                PerformanceTracing.performanceTracingInstance = new PerformanceTracing();
            }
            PerformanceTracing performanceTracing = PerformanceTracing.performanceTracingInstance;
            q.d(performanceTracing);
            return performanceTracing;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/discord/crash_reporting/PerformanceTracing$MarkerEnd;", "", "(Ljava/lang/String;I)V", "START", "END", "crash_reporting_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public enum MarkerEnd {
        START,
        END
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/discord/crash_reporting/PerformanceTracing$TransactionMarker;", "", ZeroconfModule.KEY_SERVICE_NAME, "", "tag", "markerEnd", "Lcom/discord/crash_reporting/PerformanceTracing$MarkerEnd;", "(Ljava/lang/String;Ljava/lang/String;Lcom/discord/crash_reporting/PerformanceTracing$MarkerEnd;)V", "getMarkerEnd", "()Lcom/discord/crash_reporting/PerformanceTracing$MarkerEnd;", "getName", "()Ljava/lang/String;", "getTag", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "crash_reporting_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class TransactionMarker {
        private final MarkerEnd markerEnd;
        private final String name;
        private final String tag;

        public TransactionMarker(String name, String str, MarkerEnd markerEnd) {
            q.g(name, "name");
            q.g(markerEnd, "markerEnd");
            this.name = name;
            this.tag = str;
            this.markerEnd = markerEnd;
        }

        public static /* synthetic */ TransactionMarker copy$default(TransactionMarker transactionMarker, String str, String str2, MarkerEnd markerEnd, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = transactionMarker.name;
            }
            if ((i10 & 2) != 0) {
                str2 = transactionMarker.tag;
            }
            if ((i10 & 4) != 0) {
                markerEnd = transactionMarker.markerEnd;
            }
            return transactionMarker.copy(str, str2, markerEnd);
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.tag;
        }

        public final MarkerEnd component3() {
            return this.markerEnd;
        }

        public final TransactionMarker copy(String name, String str, MarkerEnd markerEnd) {
            q.g(name, "name");
            q.g(markerEnd, "markerEnd");
            return new TransactionMarker(name, str, markerEnd);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TransactionMarker)) {
                return false;
            }
            TransactionMarker transactionMarker = (TransactionMarker) obj;
            return q.b(this.name, transactionMarker.name) && q.b(this.tag, transactionMarker.tag) && this.markerEnd == transactionMarker.markerEnd;
        }

        public final MarkerEnd getMarkerEnd() {
            return this.markerEnd;
        }

        public final String getName() {
            return this.name;
        }

        public final String getTag() {
            return this.tag;
        }

        public int hashCode() {
            int hashCode = this.name.hashCode() * 31;
            String str = this.tag;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.markerEnd.hashCode();
        }

        public String toString() {
            String str = this.name;
            String str2 = this.tag;
            MarkerEnd markerEnd = this.markerEnd;
            return "TransactionMarker(name=" + str + ", tag=" + str2 + ", markerEnd=" + markerEnd + ")";
        }
    }

    public PerformanceTracing() {
        Map<String, String> k10;
        Set<String> i10;
        k10 = v.k(x.a("GET_REACT_INSTANCE_MANAGER", "root"), x.a("BUILD_REACT_INSTANCE_MANAGER", "GET_REACT_INSTANCE_MANAGER"), x.a("ROOT_VIEW_ON_MEASURE", "root"), x.a("ROOT_VIEW_ATTACH_TO_REACT_INSTANCE_MANAGER", "ROOT_VIEW_ON_MEASURE"), x.a("REACT_BRIDGE_LOADING", "root"), x.a("CREATE_REACT_CONTEXT", "REACT_BRIDGE_LOADING"), x.a("PROCESS_PACKAGES", "CREATE_REACT_CONTEXT"), x.a("PROCESS_CORE_REACT_PACKAGE", "PROCESS_PACKAGES"), x.a("PROCESS_PACKAGE", "PROCESS_PACKAGES"), x.a("PROCESS_PACKAGE_MODULE", "PROCESS_PACKAGE"), x.a("BUILD_NATIVE_MODULE_REGISTRY", "CREATE_REACT_CONTEXT"), x.a("CREATE_CATALYST_INSTANCE", "CREATE_REACT_CONTEXT"), x.a("LOAD_REACT_NATIVE_SO_FILE", "CREATE_CATALYST_INSTANCE"), x.a("PRE_RUN_JS_BUNDLE", "REACT_BRIDGE_LOADING"), x.a("SETUP_REACT_CONTEXT", "REACT_BRIDGE_LOADING"), x.a("ON_HOST_RESUME", "SETUP_REACT_CONTEXT"), x.a("ATTACH_MEASURED_ROOT_VIEWS", "SETUP_REACT_CONTEXT"), x.a("CREATE_MODULE UiManager", "ATTACH_MEASURED_ROOT_VIEWS"), x.a("CREATE_UI_MANAGER_MODULE", "CREATE_MODULE UiManager"), x.a("CREATE_VIEW_MANAGERS", "CREATE_UI_MANAGER_MODULE"), x.a("ROOT_VIEW_UPDATE_LAYOUT_SPECS", "SETUP_REACT_CONTEXT"), x.a("RUN_JS_BUNDLE", "root"));
        this.startupRootEventsTree = k10;
        i10 = w.i("NATIVE_MODULE_SETUP", "INITIALIZE_MODULE", "CREATE_REACT_CONTEXT", "CREATE_MODULE", "RUN_JS_BUNDLE", "PROCESS_PACKAGE", "PROCESS_PACKAGE_MODULE");
        this.wildcardEventNames = i10;
    }

    private final TransactionMarker getMarker(String str, String str2) {
        boolean s10;
        boolean s11;
        String q02;
        String q03;
        s10 = u.s(str, "_START", false, 2, null);
        if (s10) {
            q03 = oj.v.q0(str, "_START");
            return new TransactionMarker(q03, str2, MarkerEnd.START);
        }
        s11 = u.s(str, "_END", false, 2, null);
        if (!s11) {
            return null;
        }
        q02 = oj.v.q0(str, "_END");
        return new TransactionMarker(q02, str2, MarkerEnd.END);
    }

    private final String getMarkerName(TransactionMarker transactionMarker) {
        if (transactionMarker.getTag() == null || q.b(transactionMarker.getName(), "CREATE_REACT_CONTEXT")) {
            return transactionMarker.getName();
        }
        String name = transactionMarker.getName();
        String tag = transactionMarker.getTag();
        return name + " " + tag;
    }

    private final String getParentSpanName(TransactionMarker transactionMarker) {
        boolean M;
        String str = this.startupRootEventsTree.get(getMarkerName(transactionMarker));
        if (str != null) {
            return str;
        }
        if (!this.wildcardEventNames.contains(transactionMarker.getName())) {
            return null;
        }
        String str2 = this.startupRootEventsTree.get(transactionMarker.getName());
        M = r.M(this.wildcardEventNames, str2);
        if (!M) {
            return str2;
        }
        MarkerEnd markerEnd = transactionMarker.getMarkerEnd();
        return str2 + " " + markerEnd;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void checkAndSetInitSection(String marker) {
        StartupInitSection startupInitSection;
        q.g(marker, "marker");
        switch (marker.hashCode()) {
            case -1149178597:
                if (marker.equals("NATIVE_MODULE_INITIALIZE")) {
                    startupInitSection = StartupInitSection.NativeModuleInitialization;
                    break;
                }
                startupInitSection = null;
                break;
            case -464136890:
                if (marker.equals("REACT_BRIDGE_LOADING")) {
                    startupInitSection = StartupInitSection.ReactBridgeLoading;
                    break;
                }
                startupInitSection = null;
                break;
            case 291013106:
                if (marker.equals("NATIVE_MODULE_SETUP")) {
                    startupInitSection = StartupInitSection.NativeModuleSetup;
                    break;
                }
                startupInitSection = null;
                break;
            case 1036876780:
                if (marker.equals("GET_REACT_INSTANCE_MANAGER")) {
                    startupInitSection = StartupInitSection.ReactInstanceManager;
                    break;
                }
                startupInitSection = null;
                break;
            default:
                startupInitSection = null;
                break;
        }
        if (startupInitSection != null) {
            this.startupInitSection = startupInitSection;
        }
    }

    public final PackageProcessTimings getCurrentProcessPackage() {
        return this.currentProcessPackage;
    }

    public final ISpan getLastNativeModuleSetupStart() {
        return this.lastNativeModuleSetupStart;
    }

    public final ISpan getLastProcessPackage() {
        return this.lastProcessPackage;
    }

    public final List<PackageProcessTimings> getProcessPackageTimings() {
        return this.processPackageTimings;
    }

    public final StartupInitSection getStartupInitSection() {
        return this.startupInitSection;
    }

    public final Map<String, String> getStartupRootEventsTree() {
        return this.startupRootEventsTree;
    }

    public final boolean getStopped() {
        return this.stopped;
    }

    @Override // com.facebook.react.bridge.ReactMarker.MarkerListener
    public void logMarker(ReactMarkerConstants reactMarkerConstants, String str, int i10) {
        String str2;
        boolean u10;
        if (reactMarkerConstants != null) {
            str2 = reactMarkerConstants.name();
        } else {
            str2 = null;
        }
        if (str2 != null) {
            logSpanForTransaction(str2, str);
        }
        u10 = u.u(str2, "CONTENT_APPEARED", false, 2, null);
        if (u10) {
            stop();
        }
    }

    public final synchronized void logSpanForTransaction(TransactionMarker marker) {
        ISpan iSpan;
        PackageProcessTimings packageProcessTimings;
        List<String> modules;
        boolean s10;
        ISpan iSpan2;
        ISpan iSpan3;
        q.g(marker, "marker");
        checkAndSetInitSection(marker.getName());
        String markerName = getMarkerName(marker);
        String parentSpanName = getParentSpanName(marker);
        if (marker.getMarkerEnd() == MarkerEnd.START) {
            if (this.startupInitSection == StartupInitSection.NativeModuleSetup && q.b(marker.getName(), "NATIVE_MODULE_SETUP") && (iSpan3 = this.lastNativeModuleSetupStart) != null) {
                if (iSpan3 != null) {
                    iSpan3.d();
                }
                this.lastNativeModuleSetupStart = null;
            }
            if (q.b(marker.getName(), "RUN_JS_BUNDLE") && (iSpan2 = this.ongoingSpans.get("PRE_RUN_JS_BUNDLE")) != null) {
                iSpan2.d();
            }
            if (q.b(marker.getName(), "PROCESS_PACKAGE_MODULE")) {
                iSpan = this.lastProcessPackage;
            } else {
                iSpan = this.ongoingSpans.get(parentSpanName);
            }
            if (iSpan == null) {
                boolean z10 = false;
                if (parentSpanName != null) {
                    s10 = u.s(parentSpanName, "~", false, 2, null);
                    if (s10) {
                        z10 = true;
                    }
                }
                if (z10) {
                    ISpan iSpan4 = this.ongoingSpans.get(this.startupRootEventsTree.get(parentSpanName));
                    if (!(iSpan4 == null || (iSpan = iSpan4.g(markerName)) == null)) {
                        this.ongoingSpans.put(parentSpanName, iSpan);
                        this.spanStarts.put(parentSpanName, Long.valueOf(System.currentTimeMillis()));
                    }
                    return;
                }
            }
            if (iSpan != null) {
                ISpan g10 = iSpan.g(markerName);
                q.f(g10, "parentSpan.startChild(markerName)");
                this.ongoingSpans.put(markerName, g10);
                this.spanStarts.put(markerName, Long.valueOf(System.currentTimeMillis()));
                if (q.b(marker.getName(), "PROCESS_PACKAGE")) {
                    this.lastProcessPackage = g10;
                    PackageProcessTimings packageProcessTimings2 = new PackageProcessTimings();
                    this.currentProcessPackage = packageProcessTimings2;
                    this.processPackageTimings.add(packageProcessTimings2);
                }
                if (!(!q.b(marker.getName(), "PROCESS_PACKAGE_MODULE") || (packageProcessTimings = this.currentProcessPackage) == null || (modules = packageProcessTimings.getModules()) == null)) {
                    String tag = marker.getTag();
                    if (tag == null) {
                        tag = "";
                    }
                    modules.add(tag);
                }
            }
        } else {
            ISpan iSpan5 = this.ongoingSpans.get(markerName);
            if (iSpan5 != null) {
                iSpan5.d();
                this.ongoingSpans.remove(markerName);
                if (q.b(marker.getName(), "PROCESS_PACKAGE")) {
                    PackageProcessTimings packageProcessTimings3 = this.currentProcessPackage;
                    if (packageProcessTimings3 != null) {
                        packageProcessTimings3.setEndTime(System.currentTimeMillis());
                    }
                    this.currentProcessPackage = null;
                }
            }
        }
    }

    public final void setCurrentProcessPackage(PackageProcessTimings packageProcessTimings) {
        this.currentProcessPackage = packageProcessTimings;
    }

    public final void setLastNativeModuleSetupStart(ISpan iSpan) {
        this.lastNativeModuleSetupStart = iSpan;
    }

    public final void setLastProcessPackage(ISpan iSpan) {
        this.lastProcessPackage = iSpan;
    }

    public final void setStartupInitSection(StartupInitSection startupInitSection) {
        q.g(startupInitSection, "<set-?>");
        this.startupInitSection = startupInitSection;
    }

    public final void setStopped(boolean z10) {
        this.stopped = z10;
    }

    public final void start() {
        if (this.stopped) {
            ReactMarker.addListener(this);
            startNativeModuleInit();
            this.stopped = false;
        }
    }

    public final void startNativeModuleInit() {
        startTransaction(TraceTransaction.NativeModuleInit);
    }

    public final void startTransaction(TraceTransaction transaction) {
        q.g(transaction, "transaction");
        if (!this.ongoingTransactions.containsKey(transaction)) {
            m0 w10 = k2.w(transaction.getTransactionName(), transaction.getOperation());
            q.f(w10, "startTransaction(transac…e, transaction.operation)");
            this.ongoingTransactions.put(transaction, w10);
            this.ongoingSpans.put("root", w10);
            this.spanStarts.put("root", Long.valueOf(System.currentTimeMillis()));
        }
    }

    public final void stop() {
        if (!this.stopped) {
            stopTransaction(TraceTransaction.NativeModuleInit);
            ReactMarker.removeListener(this);
            this.stopped = true;
        }
    }

    public final void stopTransaction(TraceTransaction transaction) {
        q.g(transaction, "transaction");
        m0 m0Var = this.ongoingTransactions.get(transaction);
        if (m0Var != null) {
            m0Var.d();
        }
        this.ongoingTransactions.remove(transaction);
    }

    public final synchronized void logSpanForTransaction(String marker, String str) {
        q.g(marker, "marker");
        TransactionMarker marker2 = getMarker(marker, str);
        if (marker2 != null) {
            logSpanForTransaction(marker2);
        }
    }
}
