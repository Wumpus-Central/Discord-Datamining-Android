package com.facebook.react.devsupport;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.util.Pair;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.react.C5072R;
import com.facebook.react.bridge.DefaultJSExceptionHandler;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.DebugServerException;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.ShakeDetector;
import com.facebook.react.common.SurfaceDelegate;
import com.facebook.react.common.SurfaceDelegateFactory;
import com.facebook.react.devsupport.BundleDownloader;
import com.facebook.react.devsupport.DevInternalSettings;
import com.facebook.react.devsupport.DevServerHelper;
import com.facebook.react.devsupport.InspectorPackagerConnection;
import com.facebook.react.devsupport.JSCHeapCapture;
import com.facebook.react.devsupport.interfaces.BundleLoadCallback;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.facebook.react.devsupport.interfaces.DevOptionHandler;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.devsupport.interfaces.ErrorCustomizer;
import com.facebook.react.devsupport.interfaces.ErrorType;
import com.facebook.react.devsupport.interfaces.PackagerStatusCallback;
import com.facebook.react.devsupport.interfaces.RedBoxHandler;
import com.facebook.react.devsupport.interfaces.StackFrame;
import com.facebook.react.modules.core.RCTNativeAppEventEmitter;
import com.facebook.react.packagerconnection.RequestHandler;
import com.facebook.react.packagerconnection.Responder;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p059d6.C6399a;
import p414x3.C13925a;

/* loaded from: classes7.dex */
public abstract class DevSupportManagerBase implements DevSupportManager {
    public static final String EMOJI_FACE_WITH_NO_GOOD_GESTURE = " 🙅";
    public static final String EMOJI_HUNDRED_POINTS_SYMBOL = " 💯";
    private static final String EXOPACKAGE_LOCATION_FORMAT = "/data/local/tmp/exopackage/%s//secondary-dex";
    private static final String FLIPPER_DEBUGGER_URL = "flipper://null/Hermesdebuggerrn?device=React%20Native";
    private static final String FLIPPER_DEVTOOLS_URL = "flipper://null/React?device=React%20Native";
    private static final int JAVA_ERROR_COOKIE = -1;
    private static final int JSEXCEPTION_ERROR_COOKIE = -1;
    private static final String RELOAD_APP_ACTION_SUFFIX = ".RELOAD_APP_ACTION";
    private Activity currentActivity;
    private final Context mApplicationContext;
    private DevBundleDownloadListener mBundleDownloadListener;
    private ReactContext mCurrentContext;
    private Map<String, RequestHandler> mCustomPackagerCommandHandlers;
    private DebugOverlayController mDebugOverlayController;
    private final DevLoadingViewController mDevLoadingViewController;
    private AlertDialog mDevOptionsDialog;
    private final DevServerHelper mDevServerHelper;
    private DevInternalSettings mDevSettings;
    private List<ErrorCustomizer> mErrorCustomizers;
    private final String mJSAppBundleName;
    private final File mJSBundleDownloadedFile;
    private final File mJSSplitBundlesDir;
    private StackFrame[] mLastErrorStack;
    private String mLastErrorTitle;
    private ErrorType mLastErrorType;
    private DevSupportManager.PackagerLocationCustomizer mPackagerLocationCustomizer;
    private final ReactInstanceDevHelper mReactInstanceDevHelper;
    private RedBoxHandler mRedBoxHandler;
    private SurfaceDelegate mRedBoxSurfaceDelegate;
    private final ShakeDetector mShakeDetector;
    private final SurfaceDelegateFactory mSurfaceDelegateFactory;
    private final LinkedHashMap<String, DevOptionHandler> mCustomDevOptions = new LinkedHashMap<>();
    private boolean mDevLoadingViewVisible = false;
    private int mPendingJSSplitBundleRequests = 0;
    private boolean mIsReceiverRegistered = false;
    private boolean mIsShakeDetectorStarted = false;
    private boolean mIsDevSupportEnabled = false;
    private int mLastErrorCookie = 0;
    private InspectorPackagerConnection.BundleStatus mBundleStatus = new InspectorPackagerConnection.BundleStatus();
    private final BroadcastReceiver mReloadAppBroadcastReceiver = new BroadcastReceiver() { // from class: com.facebook.react.devsupport.DevSupportManagerBase.4
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (DevSupportManagerBase.getReloadAppAction(context).equals(intent.getAction())) {
                if (intent.getBooleanExtra(DevServerHelper.RELOAD_APP_EXTRA_JS_PROXY, false)) {
                    DevSupportManagerBase.this.mDevSettings.setRemoteJSDebugEnabled(true);
                    DevSupportManagerBase.this.mDevServerHelper.launchJSDevtools();
                } else {
                    DevSupportManagerBase.this.mDevSettings.setRemoteJSDebugEnabled(false);
                }
                DevSupportManagerBase.this.handleReloadJS();
            }
        }
    };
    private final DefaultJSExceptionHandler mDefaultJSExceptionHandler = new DefaultJSExceptionHandler();

    /* renamed from: com.facebook.react.devsupport.DevSupportManagerBase$18 */
    /* loaded from: classes7.dex */
    class AnonymousClass18 implements Runnable {
        final /* synthetic */ File val$bundleFile;
        final /* synthetic */ String val$bundleUrl;
        final /* synthetic */ CallbackWithBundleLoader val$callback;

        AnonymousClass18(String str, File file, CallbackWithBundleLoader callbackWithBundleLoader) {
            this.val$bundleUrl = str;
            this.val$bundleFile = file;
            this.val$callback = callbackWithBundleLoader;
        }

        @Override // java.lang.Runnable
        public void run() {
            DevSupportManagerBase.this.showSplitBundleDevLoadingView(this.val$bundleUrl);
            DevSupportManagerBase.this.mDevServerHelper.downloadBundleFromURL(new DevBundleDownloadListener() { // from class: com.facebook.react.devsupport.DevSupportManagerBase.18.1
                @Override // com.facebook.react.devsupport.interfaces.DevBundleDownloadListener
                public void onFailure(Exception exc) {
                    UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.DevSupportManagerBase.18.1.2
                        @Override // java.lang.Runnable
                        public void run() {
                            DevSupportManagerBase.this.hideSplitBundleDevLoadingView();
                        }
                    });
                    AnonymousClass18 r0 = AnonymousClass18.this;
                    r0.val$callback.onError(r0.val$bundleUrl, exc);
                }

                @Override // com.facebook.react.devsupport.interfaces.DevBundleDownloadListener
                public void onProgress(String str, Integer num, Integer num2) {
                    DevSupportManagerBase.this.mDevLoadingViewController.updateProgress(str, num, num2);
                }

                @Override // com.facebook.react.devsupport.interfaces.DevBundleDownloadListener
                public void onSuccess() {
                    UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.DevSupportManagerBase.18.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            DevSupportManagerBase.this.hideSplitBundleDevLoadingView();
                        }
                    });
                    ReactContext reactContext = DevSupportManagerBase.this.mCurrentContext;
                    if (reactContext != null && reactContext.hasActiveReactInstance()) {
                        AnonymousClass18 r0 = AnonymousClass18.this;
                        AnonymousClass18.this.val$callback.onSuccess(JSBundleLoader.createCachedSplitBundleFromNetworkLoader(r0.val$bundleUrl, r0.val$bundleFile.getAbsolutePath()));
                    }
                }
            }, this.val$bundleFile, this.val$bundleUrl, null);
        }
    }

    /* loaded from: classes7.dex */
    public interface CallbackWithBundleLoader {
        void onError(String str, Throwable th2);

        void onSuccess(JSBundleLoader jSBundleLoader);
    }

    public DevSupportManagerBase(Context context, ReactInstanceDevHelper reactInstanceDevHelper, String str, boolean z, RedBoxHandler redBoxHandler, DevBundleDownloadListener devBundleDownloadListener, int i, Map<String, RequestHandler> map, SurfaceDelegateFactory surfaceDelegateFactory) {
        this.mReactInstanceDevHelper = reactInstanceDevHelper;
        this.mApplicationContext = context;
        this.mJSAppBundleName = str;
        this.mDevSettings = new DevInternalSettings(context, new DevInternalSettings.Listener() { // from class: com.facebook.react.devsupport.DevSupportManagerBase.1
            @Override // com.facebook.react.devsupport.DevInternalSettings.Listener
            public void onInternalSettingsChanged() {
                DevSupportManagerBase.this.reloadSettings();
            }
        });
        this.mDevServerHelper = new DevServerHelper(this.mDevSettings, context.getPackageName(), new InspectorPackagerConnection.BundleStatusProvider() { // from class: com.facebook.react.devsupport.DevSupportManagerBase.2
            @Override // com.facebook.react.devsupport.InspectorPackagerConnection.BundleStatusProvider
            public InspectorPackagerConnection.BundleStatus getBundleStatus() {
                return DevSupportManagerBase.this.mBundleStatus;
            }
        });
        this.mBundleDownloadListener = devBundleDownloadListener;
        this.mShakeDetector = new ShakeDetector(new ShakeDetector.ShakeListener() { // from class: com.facebook.react.devsupport.DevSupportManagerBase.3
            @Override // com.facebook.react.common.ShakeDetector.ShakeListener
            public void onShake() {
                DevSupportManagerBase.this.showDevOptionsDialog();
            }
        }, i);
        this.mCustomPackagerCommandHandlers = map;
        String uniqueTag = getUniqueTag();
        this.mJSBundleDownloadedFile = new File(context.getFilesDir(), uniqueTag + "ReactNativeDevBundle.js");
        this.mJSSplitBundlesDir = context.getDir(uniqueTag.toLowerCase(Locale.ROOT) + "_dev_js_split_bundles", 0);
        setDevSupportEnabled(z);
        this.mRedBoxHandler = redBoxHandler;
        this.mDevLoadingViewController = new DevLoadingViewController(reactInstanceDevHelper);
        this.mSurfaceDelegateFactory = surfaceDelegateFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getReloadAppAction(Context context) {
        return context.getPackageName() + RELOAD_APP_ACTION_SUFFIX;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleCaptureHeap(final Responder responder) {
        JSCHeapCapture jSCHeapCapture;
        ReactContext reactContext = this.mCurrentContext;
        if (reactContext != null && (jSCHeapCapture = (JSCHeapCapture) reactContext.getNativeModule(JSCHeapCapture.class)) != null) {
            jSCHeapCapture.captureHeap(this.mApplicationContext.getCacheDir().getPath(), new JSCHeapCapture.CaptureCallback() { // from class: com.facebook.react.devsupport.DevSupportManagerBase.20
                @Override // com.facebook.react.devsupport.JSCHeapCapture.CaptureCallback
                public void onFailure(JSCHeapCapture.CaptureException captureException) {
                    responder.error(captureException.toString());
                }

                @Override // com.facebook.react.devsupport.JSCHeapCapture.CaptureCallback
                public void onSuccess(File file) {
                    responder.respond(file.toString());
                }
            });
        }
    }

    private void hideDevOptionsDialog() {
        AlertDialog alertDialog = this.mDevOptionsDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
            this.mDevOptionsDialog = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideSplitBundleDevLoadingView() {
        int i = this.mPendingJSSplitBundleRequests - 1;
        this.mPendingJSSplitBundleRequests = i;
        if (i == 0) {
            hideDevLoadingView();
        }
    }

    private void logJSException(Exception exc) {
        String str;
        if (exc.getMessage() == null) {
            str = "Exception in native call from JS";
        } else {
            str = exc.getMessage();
        }
        StringBuilder sb2 = new StringBuilder(str);
        for (Throwable cause = exc.getCause(); cause != null; cause = cause.getCause()) {
            sb2.append("\n\n");
            sb2.append(cause.getMessage());
        }
        if (exc instanceof JSException) {
            C13925a.m2287k(ReactConstants.TAG, "Exception in native call from JS", exc);
            String stack = ((JSException) exc).getStack();
            sb2.append("\n\n");
            sb2.append(stack);
            showNewError(sb2.toString(), new StackFrame[0], -1, ErrorType.JS);
            return;
        }
        showNewJavaError(sb2.toString(), exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reload() {
        UiThreadUtil.assertOnUiThread();
        if (this.mIsDevSupportEnabled) {
            DebugOverlayController debugOverlayController = this.mDebugOverlayController;
            if (debugOverlayController != null) {
                debugOverlayController.setFpsDebugViewVisible(this.mDevSettings.isFpsDebugEnabled());
            }
            if (!this.mIsShakeDetectorStarted) {
                this.mShakeDetector.start((SensorManager) this.mApplicationContext.getSystemService("sensor"));
                this.mIsShakeDetectorStarted = true;
            }
            if (!this.mIsReceiverRegistered) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(getReloadAppAction(this.mApplicationContext));
                this.mApplicationContext.registerReceiver(this.mReloadAppBroadcastReceiver, intentFilter);
                this.mIsReceiverRegistered = true;
            }
            if (this.mDevLoadingViewVisible) {
                this.mDevLoadingViewController.showMessage("Reloading...");
            }
            this.mDevServerHelper.openPackagerConnection(getClass().getSimpleName(), new DevServerHelper.PackagerCommandListener() { // from class: com.facebook.react.devsupport.DevSupportManagerBase.28
                @Override // com.facebook.react.devsupport.DevServerHelper.PackagerCommandListener
                public Map<String, RequestHandler> customCommandHandlers() {
                    return DevSupportManagerBase.this.mCustomPackagerCommandHandlers;
                }

                @Override // com.facebook.react.devsupport.DevServerHelper.PackagerCommandListener
                public void onCaptureHeapCommand(final Responder responder) {
                    UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.DevSupportManagerBase.28.3
                        @Override // java.lang.Runnable
                        public void run() {
                            DevSupportManagerBase.this.handleCaptureHeap(responder);
                        }
                    });
                }

                @Override // com.facebook.react.devsupport.DevServerHelper.PackagerCommandListener
                public void onPackagerConnected() {
                }

                @Override // com.facebook.react.devsupport.DevServerHelper.PackagerCommandListener
                public void onPackagerDevMenuCommand() {
                    UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.DevSupportManagerBase.28.2
                        @Override // java.lang.Runnable
                        public void run() {
                            DevSupportManagerBase.this.showDevOptionsDialog();
                        }
                    });
                }

                @Override // com.facebook.react.devsupport.DevServerHelper.PackagerCommandListener
                public void onPackagerDisconnected() {
                }

                @Override // com.facebook.react.devsupport.DevServerHelper.PackagerCommandListener
                public void onPackagerReloadCommand() {
                    DevSupportManagerBase.this.mDevServerHelper.disableDebugger();
                    UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.DevSupportManagerBase.28.1
                        @Override // java.lang.Runnable
                        public void run() {
                            DevSupportManagerBase.this.handleReloadJS();
                        }
                    });
                }
            });
            return;
        }
        DebugOverlayController debugOverlayController2 = this.mDebugOverlayController;
        if (debugOverlayController2 != null) {
            debugOverlayController2.setFpsDebugViewVisible(false);
        }
        if (this.mIsShakeDetectorStarted) {
            this.mShakeDetector.stop();
            this.mIsShakeDetectorStarted = false;
        }
        if (this.mIsReceiverRegistered) {
            this.mApplicationContext.unregisterReceiver(this.mReloadAppBroadcastReceiver);
            this.mIsReceiverRegistered = false;
        }
        hideRedboxDialog();
        hideDevOptionsDialog();
        this.mDevLoadingViewController.hide();
        this.mDevServerHelper.closePackagerConnection();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportBundleLoadingFailure(final Exception exc) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.DevSupportManagerBase.23
            @Override // java.lang.Runnable
            public void run() {
                Exception exc2 = exc;
                if (exc2 instanceof DebugServerException) {
                    DevSupportManagerBase.this.showNewJavaError(((DebugServerException) exc2).getMessage(), exc);
                    return;
                }
                DevSupportManagerBase devSupportManagerBase = DevSupportManagerBase.this;
                devSupportManagerBase.showNewJavaError(devSupportManagerBase.mApplicationContext.getString(C5072R.string.catalyst_reload_error), exc);
            }
        });
    }

    private void resetCurrentContext(ReactContext reactContext) {
        int i;
        if (this.mCurrentContext != reactContext) {
            this.mCurrentContext = reactContext;
            DebugOverlayController debugOverlayController = this.mDebugOverlayController;
            if (debugOverlayController != null) {
                debugOverlayController.setFpsDebugViewVisible(false);
            }
            if (reactContext != null) {
                this.mDebugOverlayController = new DebugOverlayController(reactContext);
            }
            if (this.mCurrentContext != null) {
                try {
                    URL url = new URL(getSourceUrl());
                    String substring = url.getPath().substring(1);
                    String host = url.getHost();
                    if (url.getPort() != -1) {
                        i = url.getPort();
                    } else {
                        i = url.getDefaultPort();
                    }
                    ((HMRClient) this.mCurrentContext.getJSModule(HMRClient.class)).setup("android", substring, host, i, this.mDevSettings.isHotModuleReplacementEnabled());
                } catch (MalformedURLException e) {
                    showNewJavaError(e.getMessage(), e);
                }
            }
            reloadSettings();
        }
    }

    private void showDevLoadingViewForUrl(String str) {
        this.mDevLoadingViewController.showForUrl(str);
        this.mDevLoadingViewVisible = true;
    }

    private void showNewError(final String str, final StackFrame[] stackFrameArr, final int i, final ErrorType errorType) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.DevSupportManagerBase.6
            @Override // java.lang.Runnable
            public void run() {
                DevSupportManagerBase.this.updateLastErrorInfo(str, stackFrameArr, i, errorType);
                if (DevSupportManagerBase.this.mRedBoxSurfaceDelegate == null) {
                    SurfaceDelegate createSurfaceDelegate = DevSupportManagerBase.this.createSurfaceDelegate("RedBox");
                    if (createSurfaceDelegate != null) {
                        DevSupportManagerBase.this.mRedBoxSurfaceDelegate = createSurfaceDelegate;
                    } else {
                        DevSupportManagerBase devSupportManagerBase = DevSupportManagerBase.this;
                        devSupportManagerBase.mRedBoxSurfaceDelegate = new RedBoxDialogSurfaceDelegate(devSupportManagerBase);
                    }
                    DevSupportManagerBase.this.mRedBoxSurfaceDelegate.createContentView("RedBox");
                }
                if (!DevSupportManagerBase.this.mRedBoxSurfaceDelegate.isShowing()) {
                    DevSupportManagerBase.this.mRedBoxSurfaceDelegate.show();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showSplitBundleDevLoadingView(String str) {
        showDevLoadingViewForUrl(str);
        this.mPendingJSSplitBundleRequests++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateLastErrorInfo(String str, StackFrame[] stackFrameArr, int i, ErrorType errorType) {
        this.mLastErrorTitle = str;
        this.mLastErrorStack = stackFrameArr;
        this.mLastErrorCookie = i;
        this.mLastErrorType = errorType;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void addCustomDevOption(String str, DevOptionHandler devOptionHandler) {
        this.mCustomDevOptions.put(str, devOptionHandler);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public View createRootView(String str) {
        return this.mReactInstanceDevHelper.createRootView(str);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public SurfaceDelegate createSurfaceDelegate(String str) {
        SurfaceDelegateFactory surfaceDelegateFactory = this.mSurfaceDelegateFactory;
        if (surfaceDelegateFactory == null) {
            return null;
        }
        return surfaceDelegateFactory.createSurfaceDelegate(str);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void destroyRootView(View view) {
        this.mReactInstanceDevHelper.destroyRootView(view);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public File downloadBundleResourceFromUrlSync(String str, File file) {
        return this.mDevServerHelper.downloadBundleResourceFromUrlSync(str, file);
    }

    public void fetchSplitBundleAndCreateBundleLoader(String str, CallbackWithBundleLoader callbackWithBundleLoader) {
        String devServerSplitBundleURL = this.mDevServerHelper.getDevServerSplitBundleURL(str);
        File file = this.mJSSplitBundlesDir;
        UiThreadUtil.runOnUiThread(new AnonymousClass18(devServerSplitBundleURL, new File(file, str.replaceAll("/", "_") + ".jsbundle"), callbackWithBundleLoader));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public Activity getCurrentActivity() {
        return this.mReactInstanceDevHelper.getCurrentActivity();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ReactContext getCurrentContext() {
        return this.mCurrentContext;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public DevServerHelper getDevServerHelper() {
        return this.mDevServerHelper;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public boolean getDevSupportEnabled() {
        return this.mIsDevSupportEnabled;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public String getDownloadedJSBundleFile() {
        return this.mJSBundleDownloadedFile.getAbsolutePath();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getJSAppBundleName() {
        return this.mJSAppBundleName;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public String getJSBundleURLForRemoteDebugging() {
        return this.mDevServerHelper.getJSBundleURLForRemoteDebugging((String) C6399a.m25622c(this.mJSAppBundleName));
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public int getLastErrorCookie() {
        return this.mLastErrorCookie;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public StackFrame[] getLastErrorStack() {
        return this.mLastErrorStack;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public String getLastErrorTitle() {
        return this.mLastErrorTitle;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public ErrorType getLastErrorType() {
        return this.mLastErrorType;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ReactInstanceDevHelper getReactInstanceDevHelper() {
        return this.mReactInstanceDevHelper;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public RedBoxHandler getRedBoxHandler() {
        return this.mRedBoxHandler;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public String getSourceMapUrl() {
        String str = this.mJSAppBundleName;
        if (str == null) {
            return "";
        }
        return this.mDevServerHelper.getSourceMapUrl((String) C6399a.m25622c(str));
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public String getSourceUrl() {
        String str = this.mJSAppBundleName;
        if (str == null) {
            return "";
        }
        return this.mDevServerHelper.getSourceUrl((String) C6399a.m25622c(str));
    }

    protected abstract String getUniqueTag();

    @Override // com.facebook.react.bridge.JSExceptionHandler
    public void handleException(Exception exc) {
        if (this.mIsDevSupportEnabled) {
            logJSException(exc);
        } else {
            this.mDefaultJSExceptionHandler.handleException(exc);
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public boolean hasUpToDateJSBundleInCache() {
        if (this.mIsDevSupportEnabled && this.mJSBundleDownloadedFile.exists()) {
            try {
                String packageName = this.mApplicationContext.getPackageName();
                if (this.mJSBundleDownloadedFile.lastModified() > this.mApplicationContext.getPackageManager().getPackageInfo(packageName, 0).lastUpdateTime) {
                    File file = new File(String.format(Locale.US, EXOPACKAGE_LOCATION_FORMAT, packageName));
                    if (!file.exists()) {
                        return true;
                    }
                    if (this.mJSBundleDownloadedFile.lastModified() > file.lastModified()) {
                        return true;
                    }
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                C13925a.m2288j(ReactConstants.TAG, "DevSupport is unable to get current app info");
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void hideDevLoadingView() {
        this.mDevLoadingViewController.hide();
        this.mDevLoadingViewVisible = false;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void hideRedboxDialog() {
        SurfaceDelegate surfaceDelegate = this.mRedBoxSurfaceDelegate;
        if (surfaceDelegate != null) {
            surfaceDelegate.hide();
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void isPackagerRunning(final PackagerStatusCallback packagerStatusCallback) {
        Runnable runnable = new Runnable() { // from class: com.facebook.react.devsupport.DevSupportManagerBase.19
            @Override // java.lang.Runnable
            public void run() {
                DevSupportManagerBase.this.mDevServerHelper.isPackagerRunning(packagerStatusCallback);
            }
        };
        DevSupportManager.PackagerLocationCustomizer packagerLocationCustomizer = this.mPackagerLocationCustomizer;
        if (packagerLocationCustomizer != null) {
            packagerLocationCustomizer.run(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void onNewReactContextCreated(ReactContext reactContext) {
        resetCurrentContext(reactContext);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void onReactInstanceDestroyed(ReactContext reactContext) {
        if (reactContext == this.mCurrentContext) {
            resetCurrentContext(null);
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public Pair<String, StackFrame[]> processErrorCustomizers(Pair<String, StackFrame[]> pair) {
        List<ErrorCustomizer> list = this.mErrorCustomizers;
        if (list == null) {
            return pair;
        }
        for (ErrorCustomizer errorCustomizer : list) {
            Pair<String, StackFrame[]> customizeErrorInfo = errorCustomizer.customizeErrorInfo(pair);
            if (customizeErrorInfo != null) {
                pair = customizeErrorInfo;
            }
        }
        return pair;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void registerErrorCustomizer(ErrorCustomizer errorCustomizer) {
        if (this.mErrorCustomizers == null) {
            this.mErrorCustomizers = new ArrayList();
        }
        this.mErrorCustomizers.add(errorCustomizer);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void reloadJSFromServer(String str) {
        reloadJSFromServer(str, new BundleLoadCallback() { // from class: com.facebook.react.devsupport.DevSupportManagerBase.21
            @Override // com.facebook.react.devsupport.interfaces.BundleLoadCallback
            public void onSuccess() {
                UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.DevSupportManagerBase.21.1
                    @Override // java.lang.Runnable
                    public void run() {
                        DevSupportManagerBase.this.mReactInstanceDevHelper.onJSBundleLoadedFromServer();
                    }
                });
            }
        });
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void reloadSettings() {
        if (UiThreadUtil.isOnUiThread()) {
            reload();
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.DevSupportManagerBase.17
                @Override // java.lang.Runnable
                public void run() {
                    DevSupportManagerBase.this.reload();
                }
            });
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void setDevSupportEnabled(boolean z) {
        this.mIsDevSupportEnabled = z;
        reloadSettings();
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void setFpsDebugEnabled(final boolean z) {
        if (this.mIsDevSupportEnabled) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.DevSupportManagerBase.26
                @Override // java.lang.Runnable
                public void run() {
                    DevSupportManagerBase.this.mDevSettings.setFpsDebugEnabled(z);
                }
            });
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void setHotModuleReplacementEnabled(final boolean z) {
        if (this.mIsDevSupportEnabled) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.DevSupportManagerBase.24
                @Override // java.lang.Runnable
                public void run() {
                    DevSupportManagerBase.this.mDevSettings.setHotModuleReplacementEnabled(z);
                    DevSupportManagerBase.this.handleReloadJS();
                }
            });
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void setPackagerLocationCustomizer(DevSupportManager.PackagerLocationCustomizer packagerLocationCustomizer) {
        this.mPackagerLocationCustomizer = packagerLocationCustomizer;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void setRemoteJSDebugEnabled(final boolean z) {
        if (this.mIsDevSupportEnabled) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.DevSupportManagerBase.25
                @Override // java.lang.Runnable
                public void run() {
                    DevSupportManagerBase.this.mDevSettings.setRemoteJSDebugEnabled(z);
                    DevSupportManagerBase.this.handleReloadJS();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void showDevLoadingViewForRemoteJSEnabled() {
        this.mDevLoadingViewController.showForRemoteJSEnabled();
        this.mDevLoadingViewVisible = true;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void showDevOptionsDialog() {
        String str;
        String str2;
        String str3;
        if (this.mDevOptionsDialog == null && this.mIsDevSupportEnabled && !ActivityManager.isUserAMonkey()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(this.mApplicationContext.getString(C5072R.string.catalyst_reload), new DevOptionHandler() { // from class: com.facebook.react.devsupport.DevSupportManagerBase.7
                @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                public void onOptionSelected() {
                    if (!DevSupportManagerBase.this.mDevSettings.isJSDevModeEnabled() && DevSupportManagerBase.this.mDevSettings.isHotModuleReplacementEnabled()) {
                        Toast.makeText(DevSupportManagerBase.this.mApplicationContext, DevSupportManagerBase.this.mApplicationContext.getString(C5072R.string.catalyst_hot_reloading_auto_disable), 1).show();
                        DevSupportManagerBase.this.mDevSettings.setHotModuleReplacementEnabled(false);
                    }
                    DevSupportManagerBase.this.handleReloadJS();
                }
            });
            if (this.mDevSettings.isDeviceDebugEnabled()) {
                if (this.mDevSettings.isRemoteJSDebugEnabled()) {
                    this.mDevSettings.setRemoteJSDebugEnabled(false);
                    handleReloadJS();
                }
                linkedHashMap.put(this.mApplicationContext.getString(C5072R.string.catalyst_debug_open), new DevOptionHandler() { // from class: com.facebook.react.devsupport.DevSupportManagerBase.8
                    @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                    public void onOptionSelected() {
                        DevSupportManagerBase.this.mDevServerHelper.openUrl(DevSupportManagerBase.this.mCurrentContext, DevSupportManagerBase.FLIPPER_DEBUGGER_URL, DevSupportManagerBase.this.mApplicationContext.getString(C5072R.string.catalyst_open_flipper_error));
                    }
                });
                linkedHashMap.put(this.mApplicationContext.getString(C5072R.string.catalyst_devtools_open), new DevOptionHandler() { // from class: com.facebook.react.devsupport.DevSupportManagerBase.9
                    @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                    public void onOptionSelected() {
                        DevSupportManagerBase.this.mDevServerHelper.openUrl(DevSupportManagerBase.this.mCurrentContext, DevSupportManagerBase.FLIPPER_DEVTOOLS_URL, DevSupportManagerBase.this.mApplicationContext.getString(C5072R.string.catalyst_open_flipper_error));
                    }
                });
            }
            linkedHashMap.put(this.mApplicationContext.getString(C5072R.string.catalyst_change_bundle_location), new DevOptionHandler() { // from class: com.facebook.react.devsupport.DevSupportManagerBase.10
                @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                public void onOptionSelected() {
                    Activity currentActivity = DevSupportManagerBase.this.mReactInstanceDevHelper.getCurrentActivity();
                    if (currentActivity == null || currentActivity.isFinishing()) {
                        C13925a.m2288j(ReactConstants.TAG, "Unable to launch change bundle location because react activity is not available");
                        return;
                    }
                    final EditText editText = new EditText(currentActivity);
                    editText.setHint("localhost:8081");
                    new AlertDialog.Builder(currentActivity).setTitle(DevSupportManagerBase.this.mApplicationContext.getString(C5072R.string.catalyst_change_bundle_location)).setView(editText).setPositiveButton(17039370, new DialogInterface.OnClickListener() { // from class: com.facebook.react.devsupport.DevSupportManagerBase.10.1
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            DevSupportManagerBase.this.mDevSettings.getPackagerConnectionSettings().setDebugServerHost(editText.getText().toString());
                            DevSupportManagerBase.this.handleReloadJS();
                        }
                    }).create().show();
                }
            });
            if (this.mDevSettings.isElementInspectorEnabled()) {
                str = this.mApplicationContext.getString(C5072R.string.catalyst_inspector_stop);
            } else {
                str = this.mApplicationContext.getString(C5072R.string.catalyst_inspector);
            }
            linkedHashMap.put(str, new DevOptionHandler() { // from class: com.facebook.react.devsupport.DevSupportManagerBase.11
                @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                public void onOptionSelected() {
                    DevSupportManagerBase.this.mDevSettings.setElementInspectorEnabled(!DevSupportManagerBase.this.mDevSettings.isElementInspectorEnabled());
                    DevSupportManagerBase.this.mReactInstanceDevHelper.toggleElementInspector();
                }
            });
            if (this.mDevSettings.isHotModuleReplacementEnabled()) {
                str2 = this.mApplicationContext.getString(C5072R.string.catalyst_hot_reloading_stop);
            } else {
                str2 = this.mApplicationContext.getString(C5072R.string.catalyst_hot_reloading);
            }
            linkedHashMap.put(str2, new DevOptionHandler() { // from class: com.facebook.react.devsupport.DevSupportManagerBase.12
                @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                public void onOptionSelected() {
                    boolean z = !DevSupportManagerBase.this.mDevSettings.isHotModuleReplacementEnabled();
                    DevSupportManagerBase.this.mDevSettings.setHotModuleReplacementEnabled(z);
                    if (DevSupportManagerBase.this.mCurrentContext != null) {
                        if (z) {
                            ((HMRClient) DevSupportManagerBase.this.mCurrentContext.getJSModule(HMRClient.class)).enable();
                        } else {
                            ((HMRClient) DevSupportManagerBase.this.mCurrentContext.getJSModule(HMRClient.class)).disable();
                        }
                    }
                    if (z && !DevSupportManagerBase.this.mDevSettings.isJSDevModeEnabled()) {
                        Toast.makeText(DevSupportManagerBase.this.mApplicationContext, DevSupportManagerBase.this.mApplicationContext.getString(C5072R.string.catalyst_hot_reloading_auto_enable), 1).show();
                        DevSupportManagerBase.this.mDevSettings.setJSDevModeEnabled(true);
                        DevSupportManagerBase.this.handleReloadJS();
                    }
                }
            });
            if (this.mDevSettings.isFpsDebugEnabled()) {
                str3 = this.mApplicationContext.getString(C5072R.string.catalyst_perf_monitor_stop);
            } else {
                str3 = this.mApplicationContext.getString(C5072R.string.catalyst_perf_monitor);
            }
            linkedHashMap.put(str3, new DevOptionHandler() { // from class: com.facebook.react.devsupport.DevSupportManagerBase.13
                @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                public void onOptionSelected() {
                    if (!DevSupportManagerBase.this.mDevSettings.isFpsDebugEnabled()) {
                        Activity currentActivity = DevSupportManagerBase.this.mReactInstanceDevHelper.getCurrentActivity();
                        if (currentActivity == null) {
                            C13925a.m2288j(ReactConstants.TAG, "Unable to get reference to react activity");
                        } else {
                            DebugOverlayController.requestPermission(currentActivity);
                        }
                    }
                    DevSupportManagerBase.this.mDevSettings.setFpsDebugEnabled(!DevSupportManagerBase.this.mDevSettings.isFpsDebugEnabled());
                }
            });
            linkedHashMap.put(this.mApplicationContext.getString(C5072R.string.catalyst_settings), new DevOptionHandler() { // from class: com.facebook.react.devsupport.DevSupportManagerBase.14
                @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                public void onOptionSelected() {
                    Intent intent = new Intent(DevSupportManagerBase.this.mApplicationContext, DevSettingsActivity.class);
                    intent.setFlags(268435456);
                    DevSupportManagerBase.this.mApplicationContext.startActivity(intent);
                }
            });
            if (this.mCustomDevOptions.size() > 0) {
                linkedHashMap.putAll(this.mCustomDevOptions);
            }
            final DevOptionHandler[] devOptionHandlerArr = (DevOptionHandler[]) linkedHashMap.values().toArray(new DevOptionHandler[0]);
            Activity currentActivity = this.mReactInstanceDevHelper.getCurrentActivity();
            if (currentActivity == null || currentActivity.isFinishing()) {
                C13925a.m2288j(ReactConstants.TAG, "Unable to launch dev options menu because react activity isn't available");
                return;
            }
            TextView textView = new TextView(getApplicationContext());
            textView.setText("React Native DevMenu (" + getUniqueTag() + ")");
            textView.setPadding(0, 50, 0, 0);
            textView.setGravity(17);
            textView.setTextColor(-16777216);
            textView.setTextSize(17.0f);
            textView.setTypeface(textView.getTypeface(), 1);
            AlertDialog create = new AlertDialog.Builder(currentActivity).setCustomTitle(textView).setItems((CharSequence[]) linkedHashMap.keySet().toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: com.facebook.react.devsupport.DevSupportManagerBase.16
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    devOptionHandlerArr[i].onOptionSelected();
                    DevSupportManagerBase.this.mDevOptionsDialog = null;
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.facebook.react.devsupport.DevSupportManagerBase.15
                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    DevSupportManagerBase.this.mDevOptionsDialog = null;
                }
            }).create();
            this.mDevOptionsDialog = create;
            create.show();
            ReactContext reactContext = this.mCurrentContext;
            if (reactContext != null) {
                ((RCTNativeAppEventEmitter) reactContext.getJSModule(RCTNativeAppEventEmitter.class)).emit("RCTDevMenuShown", null);
            }
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void showNewJSError(String str, ReadableArray readableArray, int i) {
        showNewError(str, StackTraceHelper.convertJsStackTrace(readableArray), i, ErrorType.JS);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void showNewJavaError(String str, Throwable th2) {
        C13925a.m2287k(ReactConstants.TAG, "Exception in native call", th2);
        showNewError(str, StackTraceHelper.convertJavaStackTrace(th2), -1, ErrorType.NATIVE);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void startInspector() {
        if (this.mIsDevSupportEnabled) {
            this.mDevServerHelper.openInspectorConnection();
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void stopInspector() {
        this.mDevServerHelper.closeInspectorConnection();
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void toggleElementInspector() {
        if (this.mIsDevSupportEnabled) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.DevSupportManagerBase.27
                @Override // java.lang.Runnable
                public void run() {
                    DevSupportManagerBase.this.mDevSettings.setElementInspectorEnabled(!DevSupportManagerBase.this.mDevSettings.isElementInspectorEnabled());
                    DevSupportManagerBase.this.mReactInstanceDevHelper.toggleElementInspector();
                }
            });
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void updateJSError(final String str, final ReadableArray readableArray, final int i) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.DevSupportManagerBase.5
            @Override // java.lang.Runnable
            public void run() {
                if (DevSupportManagerBase.this.mRedBoxSurfaceDelegate.isShowing() && i == DevSupportManagerBase.this.mLastErrorCookie) {
                    DevSupportManagerBase.this.updateLastErrorInfo(str, StackTraceHelper.convertJsStackTrace(readableArray), i, ErrorType.JS);
                    DevSupportManagerBase.this.mRedBoxSurfaceDelegate.show();
                }
            }
        });
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public DevInternalSettings getDevSettings() {
        return this.mDevSettings;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void reloadJSFromServer(String str, final BundleLoadCallback bundleLoadCallback) {
        ReactMarker.logMarker(ReactMarkerConstants.DOWNLOAD_START);
        showDevLoadingViewForUrl(str);
        final BundleDownloader.BundleInfo bundleInfo = new BundleDownloader.BundleInfo();
        this.mDevServerHelper.downloadBundleFromURL(new DevBundleDownloadListener() { // from class: com.facebook.react.devsupport.DevSupportManagerBase.22
            @Override // com.facebook.react.devsupport.interfaces.DevBundleDownloadListener
            public void onFailure(Exception exc) {
                DevSupportManagerBase.this.hideDevLoadingView();
                synchronized (DevSupportManagerBase.this) {
                    DevSupportManagerBase.this.mBundleStatus.isLastDownloadSucess = Boolean.FALSE;
                }
                if (DevSupportManagerBase.this.mBundleDownloadListener != null) {
                    DevSupportManagerBase.this.mBundleDownloadListener.onFailure(exc);
                }
                C13925a.m2287k(ReactConstants.TAG, "Unable to download JS bundle", exc);
                DevSupportManagerBase.this.reportBundleLoadingFailure(exc);
            }

            @Override // com.facebook.react.devsupport.interfaces.DevBundleDownloadListener
            public void onProgress(String str2, Integer num, Integer num2) {
                DevSupportManagerBase.this.mDevLoadingViewController.updateProgress(str2, num, num2);
                if (DevSupportManagerBase.this.mBundleDownloadListener != null) {
                    DevSupportManagerBase.this.mBundleDownloadListener.onProgress(str2, num, num2);
                }
            }

            @Override // com.facebook.react.devsupport.interfaces.DevBundleDownloadListener
            public void onSuccess() {
                DevSupportManagerBase.this.hideDevLoadingView();
                synchronized (DevSupportManagerBase.this) {
                    DevSupportManagerBase.this.mBundleStatus.isLastDownloadSucess = Boolean.TRUE;
                    DevSupportManagerBase.this.mBundleStatus.updateTimestamp = System.currentTimeMillis();
                }
                if (DevSupportManagerBase.this.mBundleDownloadListener != null) {
                    DevSupportManagerBase.this.mBundleDownloadListener.onSuccess();
                }
                ReactMarker.logMarker(ReactMarkerConstants.DOWNLOAD_END, bundleInfo.toJSONString());
                bundleLoadCallback.onSuccess();
            }
        }, this.mJSBundleDownloadedFile, str, bundleInfo);
    }
}
