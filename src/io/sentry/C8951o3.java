package io.sentry;

import com.reactnativecommunity.webview.RNCWebViewManager;
import io.sentry.cache.AbstractC8821e;
import io.sentry.clientreport.AbstractC8830g;
import io.sentry.clientreport.C8826d;
import io.sentry.clientreport.C8832i;
import io.sentry.internal.modules.AbstractC8900a;
import io.sentry.internal.modules.C8902c;
import io.sentry.protocol.C8997n;
import io.sentry.transport.AbstractC9081q;
import io.sentry.transport.C9082r;
import io.sentry.transport.C9084t;
import io.sentry.util.C9113m;
import io.sentry.util.C9114n;
import io.sentry.util.C9115o;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p163j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.o3 */
/* loaded from: classes8.dex */
public class C8951o3 {
    static final EnumC8942n3 DEFAULT_DIAGNOSTIC_LEVEL = EnumC8942n3.DEBUG;
    private boolean attachServerName;
    private boolean attachStacktrace;
    private boolean attachThreads;
    private AbstractC8952a beforeBreadcrumb;
    private AbstractC8953b beforeSend;
    private AbstractC8954c beforeSendTransaction;
    private String cacheDirPath;
    AbstractC8830g clientReportRecorder;
    private int connectionTimeoutMillis;
    private final List<String> contextTags;
    private boolean debug;
    private final List<String> defaultTracePropagationTargets;
    private EnumC8942n3 diagnosticLevel;
    private String dist;
    private String distinctId;
    private String dsn;
    private String dsnHash;
    private boolean enableAutoSessionTracking;
    private boolean enableDeduplication;
    private boolean enableExternalConfiguration;
    private boolean enableNdk;
    private boolean enableScopeSync;
    private boolean enableShutdownHook;
    private boolean enableUncaughtExceptionHandler;
    private AbstractC8821e envelopeDiskCache;
    private AbstractC8811c0 envelopeReader;
    private String environment;
    private final List<AbstractC9053t> eventProcessors;
    private AbstractC8913k0 executorService;
    private long flushTimeoutMillis;
    private HostnameVerifier hostnameVerifier;
    private Long idleTimeout;
    private final Set<Class<? extends Throwable>> ignoredExceptionsForType;
    private final List<String> inAppExcludes;
    private final List<String> inAppIncludes;
    private EnumC8961p0 instrumenter;
    private final List<AbstractC9023q0> integrations;
    private AbstractC8869g0 logger;
    private long maxAttachmentSize;
    private int maxBreadcrumbs;
    private int maxCacheItems;
    private int maxDepth;
    private int maxQueueSize;
    private EnumC8957f maxRequestBodySize;
    private int maxSpans;
    private long maxTraceFileSize;
    private AbstractC8900a modulesLoader;
    private final List<AbstractC8876h0> observers;
    private boolean printUncaughtStackTrace;
    private Double profilesSampleRate;
    private AbstractC8955d profilesSampler;
    private String proguardUuid;
    private C8956e proxy;
    private int readTimeoutMillis;
    private String release;
    private Double sampleRate;
    private C8997n sdkVersion;
    private boolean sendClientReports;
    private boolean sendDefaultPii;
    private String sentryClientName;
    private AbstractC8924l0 serializer;
    private String serverName;
    private long sessionTrackingIntervalMillis;
    private long shutdownTimeoutMillis;
    private SSLSocketFactory sslSocketFactory;
    private final Map<String, String> tags;
    private List<String> tracePropagationTargets;
    private boolean traceSampling;
    private Double tracesSampleRate;
    private AbstractC8958g tracesSampler;
    private AbstractC8939n0 transactionProfiler;
    private AbstractC8946o0 transportFactory;
    private AbstractC9081q transportGate;

    /* renamed from: io.sentry.o3$a */
    /* loaded from: classes8.dex */
    public interface AbstractC8952a {
    }

    /* renamed from: io.sentry.o3$b */
    /* loaded from: classes8.dex */
    public interface AbstractC8953b {
        /* renamed from: a */
        C8908j3 mo17169a(C8908j3 j3Var, C9116v vVar);
    }

    /* renamed from: io.sentry.o3$c */
    /* loaded from: classes8.dex */
    public interface AbstractC8954c {
    }

    /* renamed from: io.sentry.o3$d */
    /* loaded from: classes8.dex */
    public interface AbstractC8955d {
    }

    /* renamed from: io.sentry.o3$e */
    /* loaded from: classes8.dex */
    public static final class C8956e {

        /* renamed from: a */
        private String f19664a;

        /* renamed from: b */
        private String f19665b;

        /* renamed from: c */
        private String f19666c;

        /* renamed from: d */
        private String f19667d;

        public C8956e(String str, String str2, String str3, String str4) {
            this.f19664a = str;
            this.f19665b = str2;
            this.f19666c = str3;
            this.f19667d = str4;
        }

        /* renamed from: a */
        public String m17558a() {
            return this.f19664a;
        }

        /* renamed from: b */
        public String m17557b() {
            return this.f19667d;
        }

        /* renamed from: c */
        public String m17556c() {
            return this.f19665b;
        }

        /* renamed from: d */
        public String m17555d() {
            return this.f19666c;
        }
    }

    /* renamed from: io.sentry.o3$f */
    /* loaded from: classes8.dex */
    public enum EnumC8957f {
        NONE,
        SMALL,
        MEDIUM,
        ALWAYS
    }

    /* renamed from: io.sentry.o3$g */
    /* loaded from: classes8.dex */
    public interface AbstractC8958g {
    }

    public C8951o3() {
        this(false);
    }

    private C8997n createSdkVersion() {
        C8997n nVar = new C8997n("sentry.java", "6.9.2");
        nVar.m17336k("6.9.2");
        nVar.m17343d("maven:io.sentry:sentry", "6.9.2");
        return nVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C8951o3 empty() {
        return new C8951o3(true);
    }

    public void addContextTag(String str) {
        this.contextTags.add(str);
    }

    public void addEventProcessor(AbstractC9053t tVar) {
        this.eventProcessors.add(tVar);
    }

    public void addIgnoredExceptionForType(Class<? extends Throwable> cls) {
        this.ignoredExceptionsForType.add(cls);
    }

    public void addInAppExclude(String str) {
        this.inAppExcludes.add(str);
    }

    public void addInAppInclude(String str) {
        this.inAppIncludes.add(str);
    }

    public void addIntegration(AbstractC9023q0 q0Var) {
        this.integrations.add(q0Var);
    }

    public void addScopeObserver(AbstractC8876h0 h0Var) {
        this.observers.add(h0Var);
    }

    @Deprecated
    public void addTracingOrigin(String str) {
        if (this.tracePropagationTargets == null) {
            this.tracePropagationTargets = new CopyOnWriteArrayList();
        }
        if (!str.isEmpty()) {
            this.tracePropagationTargets.add(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean containsIgnoredExceptionForType(Throwable th2) {
        return this.ignoredExceptionsForType.contains(th2.getClass());
    }

    public AbstractC8952a getBeforeBreadcrumb() {
        return null;
    }

    public AbstractC8953b getBeforeSend() {
        return this.beforeSend;
    }

    public AbstractC8954c getBeforeSendTransaction() {
        return null;
    }

    public String getCacheDirPath() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        if (this.dsnHash != null) {
            return new File(this.cacheDirPath, this.dsnHash).getAbsolutePath();
        }
        return this.cacheDirPath;
    }

    public AbstractC8830g getClientReportRecorder() {
        return this.clientReportRecorder;
    }

    public int getConnectionTimeoutMillis() {
        return this.connectionTimeoutMillis;
    }

    public List<String> getContextTags() {
        return this.contextTags;
    }

    public EnumC8942n3 getDiagnosticLevel() {
        return this.diagnosticLevel;
    }

    public String getDist() {
        return this.dist;
    }

    public String getDistinctId() {
        return this.distinctId;
    }

    public String getDsn() {
        return this.dsn;
    }

    public AbstractC8821e getEnvelopeDiskCache() {
        return this.envelopeDiskCache;
    }

    public AbstractC8811c0 getEnvelopeReader() {
        return this.envelopeReader;
    }

    public String getEnvironment() {
        return this.environment;
    }

    public List<AbstractC9053t> getEventProcessors() {
        return this.eventProcessors;
    }

    public AbstractC8913k0 getExecutorService() {
        return this.executorService;
    }

    public long getFlushTimeoutMillis() {
        return this.flushTimeoutMillis;
    }

    public HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    public Long getIdleTimeout() {
        return this.idleTimeout;
    }

    public Set<Class<? extends Throwable>> getIgnoredExceptionsForType() {
        return this.ignoredExceptionsForType;
    }

    public List<String> getInAppExcludes() {
        return this.inAppExcludes;
    }

    public List<String> getInAppIncludes() {
        return this.inAppIncludes;
    }

    public EnumC8961p0 getInstrumenter() {
        return this.instrumenter;
    }

    public List<AbstractC9023q0> getIntegrations() {
        return this.integrations;
    }

    public AbstractC8869g0 getLogger() {
        return this.logger;
    }

    public long getMaxAttachmentSize() {
        return this.maxAttachmentSize;
    }

    public int getMaxBreadcrumbs() {
        return this.maxBreadcrumbs;
    }

    public int getMaxCacheItems() {
        return this.maxCacheItems;
    }

    public int getMaxDepth() {
        return this.maxDepth;
    }

    public int getMaxQueueSize() {
        return this.maxQueueSize;
    }

    public EnumC8957f getMaxRequestBodySize() {
        return this.maxRequestBodySize;
    }

    public int getMaxSpans() {
        return this.maxSpans;
    }

    public long getMaxTraceFileSize() {
        return this.maxTraceFileSize;
    }

    public AbstractC8900a getModulesLoader() {
        return this.modulesLoader;
    }

    public String getOutboxPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "outbox").getAbsolutePath();
    }

    public Double getProfilesSampleRate() {
        return this.profilesSampleRate;
    }

    public AbstractC8955d getProfilesSampler() {
        return null;
    }

    public String getProfilingTracesDirPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "profiling_traces").getAbsolutePath();
    }

    public String getProguardUuid() {
        return this.proguardUuid;
    }

    public C8956e getProxy() {
        return this.proxy;
    }

    public int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public String getRelease() {
        return this.release;
    }

    public Double getSampleRate() {
        return this.sampleRate;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<AbstractC8876h0> getScopeObservers() {
        return this.observers;
    }

    public C8997n getSdkVersion() {
        return this.sdkVersion;
    }

    public String getSentryClientName() {
        return this.sentryClientName;
    }

    public AbstractC8924l0 getSerializer() {
        return this.serializer;
    }

    public String getServerName() {
        return this.serverName;
    }

    public long getSessionTrackingIntervalMillis() {
        return this.sessionTrackingIntervalMillis;
    }

    @Deprecated
    public long getShutdownTimeout() {
        return this.shutdownTimeoutMillis;
    }

    public long getShutdownTimeoutMillis() {
        return this.shutdownTimeoutMillis;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public List<String> getTracePropagationTargets() {
        List<String> list = this.tracePropagationTargets;
        if (list == null) {
            return this.defaultTracePropagationTargets;
        }
        return list;
    }

    public Double getTracesSampleRate() {
        return this.tracesSampleRate;
    }

    public AbstractC8958g getTracesSampler() {
        return null;
    }

    @Deprecated
    public List<String> getTracingOrigins() {
        return getTracePropagationTargets();
    }

    public AbstractC8939n0 getTransactionProfiler() {
        return this.transactionProfiler;
    }

    public AbstractC8946o0 getTransportFactory() {
        return this.transportFactory;
    }

    public AbstractC9081q getTransportGate() {
        return this.transportGate;
    }

    public boolean isAttachServerName() {
        return this.attachServerName;
    }

    public boolean isAttachStacktrace() {
        return this.attachStacktrace;
    }

    public boolean isAttachThreads() {
        return this.attachThreads;
    }

    public boolean isDebug() {
        return this.debug;
    }

    public boolean isEnableAutoSessionTracking() {
        return this.enableAutoSessionTracking;
    }

    public boolean isEnableDeduplication() {
        return this.enableDeduplication;
    }

    public boolean isEnableExternalConfiguration() {
        return this.enableExternalConfiguration;
    }

    public boolean isEnableNdk() {
        return this.enableNdk;
    }

    public boolean isEnableScopeSync() {
        return this.enableScopeSync;
    }

    public boolean isEnableShutdownHook() {
        return this.enableShutdownHook;
    }

    public boolean isEnableUncaughtExceptionHandler() {
        return this.enableUncaughtExceptionHandler;
    }

    public boolean isPrintUncaughtStackTrace() {
        return this.printUncaughtStackTrace;
    }

    public boolean isProfilingEnabled() {
        if (getProfilesSampleRate() != null && getProfilesSampleRate().doubleValue() > 0.0d) {
            return true;
        }
        getProfilesSampler();
        return false;
    }

    public boolean isSendClientReports() {
        return this.sendClientReports;
    }

    public boolean isSendDefaultPii() {
        return this.sendDefaultPii;
    }

    public boolean isTraceSampling() {
        return this.traceSampling;
    }

    public boolean isTracingEnabled() {
        if (getTracesSampleRate() != null) {
            return true;
        }
        getTracesSampler();
        return false;
    }

    public void merge(C9093u uVar) {
        if (uVar.m17057j() != null) {
            setDsn(uVar.m17057j());
        }
        if (uVar.m17054m() != null) {
            setEnvironment(uVar.m17054m());
        }
        if (uVar.m17045v() != null) {
            setRelease(uVar.m17045v());
        }
        if (uVar.m17058i() != null) {
            setDist(uVar.m17058i());
        }
        if (uVar.m17043x() != null) {
            setServerName(uVar.m17043x());
        }
        if (uVar.m17046u() != null) {
            setProxy(uVar.m17046u());
        }
        if (uVar.m17055l() != null) {
            setEnableUncaughtExceptionHandler(uVar.m17055l().booleanValue());
        }
        if (uVar.m17049r() != null) {
            setPrintUncaughtStackTrace(uVar.m17049r().booleanValue());
        }
        if (uVar.m17084A() != null) {
            setTracesSampleRate(uVar.m17084A());
        }
        if (uVar.m17048s() != null) {
            setProfilesSampleRate(uVar.m17048s());
        }
        if (uVar.m17059h() != null) {
            setDebug(uVar.m17059h().booleanValue());
        }
        if (uVar.m17056k() != null) {
            setEnableDeduplication(uVar.m17056k().booleanValue());
        }
        if (uVar.m17044w() != null) {
            setSendClientReports(uVar.m17044w().booleanValue());
        }
        for (Map.Entry entry : new HashMap(uVar.m17042y()).entrySet()) {
            this.tags.put((String) entry.getKey(), (String) entry.getValue());
        }
        for (String str : new ArrayList(uVar.m17050q())) {
            addInAppInclude(str);
        }
        for (String str2 : new ArrayList(uVar.m17051p())) {
            addInAppExclude(str2);
        }
        Iterator it = new HashSet(uVar.m17052o()).iterator();
        while (it.hasNext()) {
            addIgnoredExceptionForType((Class) it.next());
        }
        if (uVar.m17041z() != null) {
            setTracePropagationTargets(new ArrayList(uVar.m17041z()));
        }
        for (String str3 : new ArrayList(uVar.m17060g())) {
            addContextTag(str3);
        }
        if (uVar.m17047t() != null) {
            setProguardUuid(uVar.m17047t());
        }
        if (uVar.m17053n() != null) {
            setIdleTimeout(uVar.m17053n());
        }
    }

    public void setAttachServerName(boolean z) {
        this.attachServerName = z;
    }

    public void setAttachStacktrace(boolean z) {
        this.attachStacktrace = z;
    }

    public void setAttachThreads(boolean z) {
        this.attachThreads = z;
    }

    public void setBeforeBreadcrumb(AbstractC8952a aVar) {
    }

    public void setBeforeSend(AbstractC8953b bVar) {
        this.beforeSend = bVar;
    }

    public void setBeforeSendTransaction(AbstractC8954c cVar) {
    }

    public void setCacheDirPath(String str) {
        this.cacheDirPath = str;
    }

    public void setConnectionTimeoutMillis(int i) {
        this.connectionTimeoutMillis = i;
    }

    public void setDebug(boolean z) {
        this.debug = z;
    }

    public void setDiagnosticLevel(EnumC8942n3 n3Var) {
        if (n3Var == null) {
            n3Var = DEFAULT_DIAGNOSTIC_LEVEL;
        }
        this.diagnosticLevel = n3Var;
    }

    public void setDist(String str) {
        this.dist = str;
    }

    public void setDistinctId(String str) {
        this.distinctId = str;
    }

    public void setDsn(String str) {
        this.dsn = str;
        this.dsnHash = C9115o.m16985a(str, this.logger);
    }

    public void setEnableAutoSessionTracking(boolean z) {
        this.enableAutoSessionTracking = z;
    }

    public void setEnableDeduplication(boolean z) {
        this.enableDeduplication = z;
    }

    public void setEnableExternalConfiguration(boolean z) {
        this.enableExternalConfiguration = z;
    }

    public void setEnableNdk(boolean z) {
        this.enableNdk = z;
    }

    public void setEnableScopeSync(boolean z) {
        this.enableScopeSync = z;
    }

    public void setEnableShutdownHook(boolean z) {
        this.enableShutdownHook = z;
    }

    public void setEnableUncaughtExceptionHandler(boolean z) {
        this.enableUncaughtExceptionHandler = z;
    }

    public void setEnvelopeDiskCache(AbstractC8821e eVar) {
        if (eVar == null) {
            eVar = C9082r.m17115a();
        }
        this.envelopeDiskCache = eVar;
    }

    public void setEnvelopeReader(AbstractC8811c0 c0Var) {
        if (c0Var == null) {
            c0Var = C8870g1.m17854b();
        }
        this.envelopeReader = c0Var;
    }

    public void setEnvironment(String str) {
        this.environment = str;
    }

    public void setExecutorService(AbstractC8913k0 k0Var) {
        if (k0Var != null) {
            this.executorService = k0Var;
        }
    }

    public void setFlushTimeoutMillis(long j) {
        this.flushTimeoutMillis = j;
    }

    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.hostnameVerifier = hostnameVerifier;
    }

    public void setIdleTimeout(Long l) {
        this.idleTimeout = l;
    }

    public void setInstrumenter(EnumC8961p0 p0Var) {
        this.instrumenter = p0Var;
    }

    public void setLogger(AbstractC8869g0 g0Var) {
        this.logger = g0Var == null ? C8895i1.m17768e() : new C8893i(this, g0Var);
    }

    public void setMaxAttachmentSize(long j) {
        this.maxAttachmentSize = j;
    }

    public void setMaxBreadcrumbs(int i) {
        this.maxBreadcrumbs = i;
    }

    public void setMaxCacheItems(int i) {
        this.maxCacheItems = i;
    }

    public void setMaxDepth(int i) {
        this.maxDepth = i;
    }

    public void setMaxQueueSize(int i) {
        if (i > 0) {
            this.maxQueueSize = i;
        }
    }

    public void setMaxRequestBodySize(EnumC8957f fVar) {
        this.maxRequestBodySize = fVar;
    }

    public void setMaxSpans(int i) {
        this.maxSpans = i;
    }

    public void setMaxTraceFileSize(long j) {
        this.maxTraceFileSize = j;
    }

    public void setModulesLoader(AbstractC8900a aVar) {
        if (aVar == null) {
            aVar = C8902c.m17754b();
        }
        this.modulesLoader = aVar;
    }

    public void setPrintUncaughtStackTrace(boolean z) {
        this.printUncaughtStackTrace = z;
    }

    public void setProfilesSampleRate(Double d) {
        if (C9114n.m16991a(d)) {
            this.profilesSampleRate = d;
            return;
        }
        throw new IllegalArgumentException("The value " + d + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setProfilesSampler(AbstractC8955d dVar) {
    }

    @Deprecated
    public void setProfilingEnabled(boolean z) {
        Double d;
        if (getProfilesSampleRate() == null) {
            if (z) {
                d = Double.valueOf(1.0d);
            } else {
                d = null;
            }
            setProfilesSampleRate(d);
        }
    }

    public void setProguardUuid(String str) {
        this.proguardUuid = str;
    }

    public void setProxy(C8956e eVar) {
        this.proxy = eVar;
    }

    public void setReadTimeoutMillis(int i) {
        this.readTimeoutMillis = i;
    }

    public void setRelease(String str) {
        this.release = str;
    }

    public void setSampleRate(Double d) {
        if (C9114n.m16989c(d)) {
            this.sampleRate = d;
            return;
        }
        throw new IllegalArgumentException("The value " + d + " is not valid. Use null to disable or values > 0.0 and <= 1.0.");
    }

    public void setSdkVersion(C8997n nVar) {
        this.sdkVersion = nVar;
    }

    public void setSendClientReports(boolean z) {
        this.sendClientReports = z;
        if (z) {
            this.clientReportRecorder = new C8826d(this);
        } else {
            this.clientReportRecorder = new C8832i();
        }
    }

    public void setSendDefaultPii(boolean z) {
        this.sendDefaultPii = z;
    }

    public void setSentryClientName(String str) {
        this.sentryClientName = str;
    }

    public void setSerializer(AbstractC8924l0 l0Var) {
        if (l0Var == null) {
            l0Var = C8933m1.m17602f();
        }
        this.serializer = l0Var;
    }

    public void setServerName(String str) {
        this.serverName = str;
    }

    public void setSessionTrackingIntervalMillis(long j) {
        this.sessionTrackingIntervalMillis = j;
    }

    @Deprecated
    public void setShutdownTimeout(long j) {
        this.shutdownTimeoutMillis = j;
    }

    public void setShutdownTimeoutMillis(long j) {
        this.shutdownTimeoutMillis = j;
    }

    public void setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.sslSocketFactory = sSLSocketFactory;
    }

    public void setTag(String str, String str2) {
        this.tags.put(str, str2);
    }

    public void setTracePropagationTargets(List<String> list) {
        if (list == null) {
            this.tracePropagationTargets = list;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(str);
            }
        }
        this.tracePropagationTargets = arrayList;
    }

    @Deprecated
    public void setTraceSampling(boolean z) {
        this.traceSampling = z;
    }

    public void setTracesSampleRate(Double d) {
        if (C9114n.m16987e(d)) {
            this.tracesSampleRate = d;
            return;
        }
        throw new IllegalArgumentException("The value " + d + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setTracesSampler(AbstractC8958g gVar) {
    }

    @Deprecated
    public void setTracingOrigins(List<String> list) {
        setTracePropagationTargets(list);
    }

    public void setTransactionProfiler(AbstractC8939n0 n0Var) {
        if (n0Var == null) {
            n0Var = C8962p1.m17551c();
        }
        this.transactionProfiler = n0Var;
    }

    public void setTransportFactory(AbstractC8946o0 o0Var) {
        if (o0Var == null) {
            o0Var = C9024q1.m17209b();
        }
        this.transportFactory = o0Var;
    }

    public void setTransportGate(AbstractC9081q qVar) {
        if (qVar == null) {
            qVar = C9084t.m17108b();
        }
        this.transportGate = qVar;
    }

    private C8951o3(boolean z) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.eventProcessors = copyOnWriteArrayList;
        this.ignoredExceptionsForType = new CopyOnWriteArraySet();
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        this.integrations = copyOnWriteArrayList2;
        this.shutdownTimeoutMillis = 2000L;
        this.flushTimeoutMillis = 15000L;
        this.enableNdk = true;
        this.logger = C8895i1.m17768e();
        this.diagnosticLevel = DEFAULT_DIAGNOSTIC_LEVEL;
        this.envelopeReader = new C8938n(new C8812c1(this));
        this.serializer = new C8812c1(this);
        this.maxDepth = 100;
        this.maxCacheItems = 30;
        this.maxQueueSize = 30;
        this.maxBreadcrumbs = 100;
        this.inAppExcludes = new CopyOnWriteArrayList();
        this.inAppIncludes = new CopyOnWriteArrayList();
        this.transportFactory = C9024q1.m17209b();
        this.transportGate = C9084t.m17108b();
        this.attachStacktrace = true;
        this.enableAutoSessionTracking = true;
        this.sessionTrackingIntervalMillis = 30000L;
        this.attachServerName = true;
        this.enableUncaughtExceptionHandler = true;
        this.printUncaughtStackTrace = false;
        this.executorService = C8925l1.m17672e();
        this.connectionTimeoutMillis = 5000;
        this.readTimeoutMillis = 5000;
        this.envelopeDiskCache = C9082r.m17115a();
        this.sendDefaultPii = false;
        this.observers = new ArrayList();
        this.tags = new ConcurrentHashMap();
        this.maxAttachmentSize = 20971520L;
        this.enableDeduplication = true;
        this.maxSpans = RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
        this.enableShutdownHook = true;
        this.maxRequestBodySize = EnumC8957f.NONE;
        this.traceSampling = true;
        this.maxTraceFileSize = 5242880L;
        this.transactionProfiler = C8962p1.m17551c();
        this.tracePropagationTargets = null;
        this.defaultTracePropagationTargets = Collections.singletonList(".*");
        this.idleTimeout = 3000L;
        this.contextTags = new CopyOnWriteArrayList();
        this.sendClientReports = true;
        this.clientReportRecorder = new C8826d(this);
        this.modulesLoader = C8902c.m17754b();
        this.instrumenter = EnumC8961p0.SENTRY;
        if (!z) {
            this.executorService = new C8929l3();
            copyOnWriteArrayList2.add(new C9035r4());
            copyOnWriteArrayList2.add(new C8694a4());
            copyOnWriteArrayList.add(new C8846d1(this));
            copyOnWriteArrayList.add(new C8931m(this));
            if (C9113m.m16992a()) {
                copyOnWriteArrayList.add(new C8964p3());
            }
            setSentryClientName("sentry.java/6.9.2");
            setSdkVersion(createSdkVersion());
        }
    }
}
