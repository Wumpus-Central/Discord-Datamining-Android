.class public interface abstract Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract addDocumentStartJavaScript(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/reflect/InvocationHandler;
.end method

.method public abstract addWebMessageListener(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/reflect/InvocationHandler;)V
.end method

.method public abstract createWebMessageChannel()[Ljava/lang/reflect/InvocationHandler;
.end method

.method public abstract getWebChromeClient()Landroid/webkit/WebChromeClient;
.end method

.method public abstract getWebViewClient()Landroid/webkit/WebViewClient;
.end method

.method public abstract getWebViewRenderer()Ljava/lang/reflect/InvocationHandler;
.end method

.method public abstract getWebViewRendererClient()Ljava/lang/reflect/InvocationHandler;
.end method

.method public abstract insertVisualStateCallback(JLjava/lang/reflect/InvocationHandler;)V
.end method

.method public abstract postMessageToMainFrame(Ljava/lang/reflect/InvocationHandler;Landroid/net/Uri;)V
.end method

.method public abstract removeWebMessageListener(Ljava/lang/String;)V
.end method

.method public abstract setWebViewRendererClient(Ljava/lang/reflect/InvocationHandler;)V
.end method
