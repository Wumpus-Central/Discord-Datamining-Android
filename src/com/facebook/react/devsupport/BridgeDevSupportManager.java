package com.facebook.react.devsupport;

import android.content.Context;
import android.widget.Toast;
import com.facebook.react.C5072R;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JavaJSExecutor;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.SurfaceDelegateFactory;
import com.facebook.react.common.futures.SimpleSettableFuture;
import com.facebook.react.devsupport.DevSupportManagerBase;
import com.facebook.react.devsupport.WebsocketJavaScriptExecutor;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.facebook.react.devsupport.interfaces.DevOptionHandler;
import com.facebook.react.devsupport.interfaces.DevSplitBundleCallback;
import com.facebook.react.devsupport.interfaces.RedBoxHandler;
import com.facebook.react.packagerconnection.RequestHandler;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p059d6.C6399a;
import p128h4.C7799c;
import p149i4.C8212a;
import p414x3.C13925a;

/* loaded from: classes7.dex */
public final class BridgeDevSupportManager extends DevSupportManagerBase {
    private boolean mIsSamplingProfilerEnabled = false;

    public BridgeDevSupportManager(Context context, ReactInstanceDevHelper reactInstanceDevHelper, String str, boolean z, RedBoxHandler redBoxHandler, DevBundleDownloadListener devBundleDownloadListener, int i, Map<String, RequestHandler> map, SurfaceDelegateFactory surfaceDelegateFactory) {
        super(context, reactInstanceDevHelper, str, z, redBoxHandler, devBundleDownloadListener, i, map, surfaceDelegateFactory);
        String str2;
        String str3;
        if (getDevSettings().isStartSamplingProfilerOnInit()) {
            if (!this.mIsSamplingProfilerEnabled) {
                toggleJSSamplingProfiler();
            } else {
                Toast.makeText(context, "JS Sampling Profiler was already running, so did not start the sampling profiler", 1).show();
            }
        }
        if (this.mIsSamplingProfilerEnabled) {
            str2 = "Disable Sampling Profiler";
        } else {
            str2 = "Enable Sampling Profiler";
        }
        addCustomDevOption(str2, new DevOptionHandler() { // from class: com.facebook.react.devsupport.BridgeDevSupportManager.1
            @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
            public void onOptionSelected() {
                BridgeDevSupportManager.this.toggleJSSamplingProfiler();
            }
        });
        if (!getDevSettings().isDeviceDebugEnabled()) {
            if (getDevSettings().isRemoteJSDebugEnabled()) {
                str3 = context.getString(C5072R.string.catalyst_debug_stop);
            } else {
                str3 = context.getString(C5072R.string.catalyst_debug);
            }
            addCustomDevOption(str3, new DevOptionHandler() { // from class: com.facebook.react.devsupport.BridgeDevSupportManager.2
                @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                public void onOptionSelected() {
                    BridgeDevSupportManager.this.getDevSettings().setRemoteJSDebugEnabled(!BridgeDevSupportManager.this.getDevSettings().isRemoteJSDebugEnabled());
                    BridgeDevSupportManager.this.handleReloadJS();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WebsocketJavaScriptExecutor.JSExecutorConnectCallback getExecutorConnectCallback(final SimpleSettableFuture<Boolean> simpleSettableFuture) {
        return new WebsocketJavaScriptExecutor.JSExecutorConnectCallback() { // from class: com.facebook.react.devsupport.BridgeDevSupportManager.4
            @Override // com.facebook.react.devsupport.WebsocketJavaScriptExecutor.JSExecutorConnectCallback
            public void onFailure(Throwable th2) {
                BridgeDevSupportManager.this.hideDevLoadingView();
                C13925a.m2287k(ReactConstants.TAG, "Failed to connect to debugger!", th2);
                simpleSettableFuture.setException(new IOException(BridgeDevSupportManager.this.getApplicationContext().getString(C5072R.string.catalyst_debug_error), th2));
            }

            @Override // com.facebook.react.devsupport.WebsocketJavaScriptExecutor.JSExecutorConnectCallback
            public void onSuccess() {
                simpleSettableFuture.set(Boolean.TRUE);
                BridgeDevSupportManager.this.hideDevLoadingView();
            }
        };
    }

    private void reloadJSInProxyMode() {
        getDevServerHelper().launchJSDevtools();
        getReactInstanceDevHelper().onReloadWithJSDebugger(new JavaJSExecutor.Factory() { // from class: com.facebook.react.devsupport.BridgeDevSupportManager.5
            @Override // com.facebook.react.bridge.JavaJSExecutor.Factory
            public JavaJSExecutor create() {
                Throwable e;
                WebsocketJavaScriptExecutor websocketJavaScriptExecutor = new WebsocketJavaScriptExecutor();
                SimpleSettableFuture simpleSettableFuture = new SimpleSettableFuture();
                websocketJavaScriptExecutor.connect(BridgeDevSupportManager.this.getDevServerHelper().getWebsocketProxyURL(), BridgeDevSupportManager.this.getExecutorConnectCallback(simpleSettableFuture));
                try {
                    simpleSettableFuture.get(90L, TimeUnit.SECONDS);
                    return websocketJavaScriptExecutor;
                } catch (InterruptedException e2) {
                    e = e2;
                    throw new RuntimeException(e);
                } catch (ExecutionException e3) {
                    throw ((Exception) e3.getCause());
                } catch (TimeoutException e4) {
                    e = e4;
                    throw new RuntimeException(e);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v0, types: [int, boolean] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void toggleJSSamplingProfiler() {
        /*
            r7 = this;
            com.facebook.react.devsupport.ReactInstanceDevHelper r0 = r7.getReactInstanceDevHelper()
            com.facebook.react.bridge.JavaScriptExecutorFactory r0 = r0.getJavaScriptExecutorFactory()
            boolean r1 = r7.mIsSamplingProfilerEnabled
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0048
            r0.startSamplingProfiler()     // Catch: all -> 0x0022, UnsupportedOperationException -> 0x0024
            android.content.Context r1 = r7.getApplicationContext()     // Catch: all -> 0x0022, UnsupportedOperationException -> 0x0024
            java.lang.String r4 = "Starting Sampling Profiler"
            android.widget.Toast r1 = android.widget.Toast.makeText(r1, r4, r2)     // Catch: all -> 0x0022, UnsupportedOperationException -> 0x0024
            r1.show()     // Catch: all -> 0x0022, UnsupportedOperationException -> 0x0024
        L_0x001e:
            r7.mIsSamplingProfilerEnabled = r3
            goto L_0x00a8
        L_0x0022:
            r0 = move-exception
            goto L_0x0045
        L_0x0024:
            android.content.Context r1 = r7.getApplicationContext()     // Catch: all -> 0x0022
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: all -> 0x0022
            r2.<init>()     // Catch: all -> 0x0022
            java.lang.String r0 = r0.toString()     // Catch: all -> 0x0022
            r2.append(r0)     // Catch: all -> 0x0022
            java.lang.String r0 = " does not support Sampling Profiler"
            r2.append(r0)     // Catch: all -> 0x0022
            java.lang.String r0 = r2.toString()     // Catch: all -> 0x0022
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r3)     // Catch: all -> 0x0022
            r0.show()     // Catch: all -> 0x0022
            goto L_0x001e
        L_0x0045:
            r7.mIsSamplingProfilerEnabled = r3
            throw r0
        L_0x0048:
            java.lang.String r1 = "sampling-profiler-trace"
            java.lang.String r4 = ".cpuprofile"
            android.content.Context r5 = r7.getApplicationContext()     // Catch: all -> 0x007c, UnsupportedOperationException -> 0x007e, IOException -> 0x009f
            java.io.File r5 = r5.getCacheDir()     // Catch: all -> 0x007c, UnsupportedOperationException -> 0x007e, IOException -> 0x009f
            java.io.File r1 = java.io.File.createTempFile(r1, r4, r5)     // Catch: all -> 0x007c, UnsupportedOperationException -> 0x007e, IOException -> 0x009f
            java.lang.String r1 = r1.getPath()     // Catch: all -> 0x007c, UnsupportedOperationException -> 0x007e, IOException -> 0x009f
            r0.stopSamplingProfiler(r1)     // Catch: all -> 0x007c, UnsupportedOperationException -> 0x007e, IOException -> 0x009f
            android.content.Context r4 = r7.getApplicationContext()     // Catch: all -> 0x007c, UnsupportedOperationException -> 0x007e, IOException -> 0x009f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: all -> 0x007c, UnsupportedOperationException -> 0x007e, IOException -> 0x009f
            r5.<init>()     // Catch: all -> 0x007c, UnsupportedOperationException -> 0x007e, IOException -> 0x009f
            java.lang.String r6 = "Saved results from Profiler to "
            r5.append(r6)     // Catch: all -> 0x007c, UnsupportedOperationException -> 0x007e, IOException -> 0x009f
            r5.append(r1)     // Catch: all -> 0x007c, UnsupportedOperationException -> 0x007e, IOException -> 0x009f
            java.lang.String r1 = r5.toString()     // Catch: all -> 0x007c, UnsupportedOperationException -> 0x007e, IOException -> 0x009f
            android.widget.Toast r1 = android.widget.Toast.makeText(r4, r1, r3)     // Catch: all -> 0x007c, UnsupportedOperationException -> 0x007e, IOException -> 0x009f
            r1.show()     // Catch: all -> 0x007c, UnsupportedOperationException -> 0x007e, IOException -> 0x009f
            goto L_0x00a6
        L_0x007c:
            r0 = move-exception
            goto L_0x00a9
        L_0x007e:
            android.content.Context r1 = r7.getApplicationContext()     // Catch: all -> 0x007c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: all -> 0x007c
            r4.<init>()     // Catch: all -> 0x007c
            java.lang.String r0 = r0.toString()     // Catch: all -> 0x007c
            r4.append(r0)     // Catch: all -> 0x007c
            java.lang.String r0 = "does not support Sampling Profiler"
            r4.append(r0)     // Catch: all -> 0x007c
            java.lang.String r0 = r4.toString()     // Catch: all -> 0x007c
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r3)     // Catch: all -> 0x007c
            r0.show()     // Catch: all -> 0x007c
            goto L_0x00a6
        L_0x009f:
            java.lang.String r0 = "ReactNative"
            java.lang.String r1 = "Could not create temporary file for saving results from Sampling Profiler"
            p414x3.C13925a.m2288j(r0, r1)     // Catch: all -> 0x007c
        L_0x00a6:
            r7.mIsSamplingProfilerEnabled = r2
        L_0x00a8:
            return
        L_0x00a9:
            r7.mIsSamplingProfilerEnabled = r2
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.devsupport.BridgeDevSupportManager.toggleJSSamplingProfiler():void");
    }

    @Override // com.facebook.react.devsupport.DevSupportManagerBase
    protected String getUniqueTag() {
        return "Bridge";
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void handleReloadJS() {
        UiThreadUtil.assertOnUiThread();
        ReactMarker.logMarker(ReactMarkerConstants.RELOAD, getDevSettings().getPackagerConnectionSettings().getDebugServerHost());
        hideRedboxDialog();
        if (getDevSettings().isRemoteJSDebugEnabled()) {
            C7799c.m21315a().mo21318a(C8212a.f17760c, "RNCore: load from Proxy");
            showDevLoadingViewForRemoteJSEnabled();
            reloadJSInProxyMode();
            return;
        }
        C7799c.m21315a().mo21318a(C8212a.f17760c, "RNCore: load from Server");
        reloadJSFromServer(getDevServerHelper().getDevServerBundleURL((String) C6399a.m25622c(getJSAppBundleName())));
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void loadSplitBundleFromServer(final String str, final DevSplitBundleCallback devSplitBundleCallback) {
        fetchSplitBundleAndCreateBundleLoader(str, new DevSupportManagerBase.CallbackWithBundleLoader() { // from class: com.facebook.react.devsupport.BridgeDevSupportManager.3
            @Override // com.facebook.react.devsupport.DevSupportManagerBase.CallbackWithBundleLoader
            public void onError(String str2, Throwable th2) {
                devSplitBundleCallback.onError(str2, th2);
            }

            @Override // com.facebook.react.devsupport.DevSupportManagerBase.CallbackWithBundleLoader
            public void onSuccess(JSBundleLoader jSBundleLoader) {
                jSBundleLoader.loadScript(BridgeDevSupportManager.this.getCurrentContext().getCatalystInstance());
                ((HMRClient) BridgeDevSupportManager.this.getCurrentContext().getJSModule(HMRClient.class)).registerBundle(BridgeDevSupportManager.this.getDevServerHelper().getDevServerSplitBundleURL(str));
                devSplitBundleCallback.onSuccess();
            }
        });
    }
}
