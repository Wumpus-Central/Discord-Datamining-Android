.class public final Lokhttp3/OkHttpClient$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/OkHttpClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00da\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010!\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u00002\u00020\u0001B\t\u00a2\u0006\u0006\u0008\u00bf\u0001\u0010\u00c0\u0001B\u0014\u0008\u0010\u0012\u0007\u0010\u00c1\u0001\u001a\u00020 \u00a2\u0006\u0006\u0008\u00bf\u0001\u0010\u00c2\u0001J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0008\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000cJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fJ\u0010\u0010\u0014\u001a\u00020\u00002\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012J\u0014\u0010\u0018\u001a\u00020\u00002\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u0015J\u0016\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bJ\u0016\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bJ\u0016\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bJ\u0006\u0010!\u001a\u00020 R\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010\"\u001a\u0004\u0008#\u0010$\"\u0004\u0008%\u0010&R\"\u0010-\u001a\u00020\'8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010(\u001a\u0004\u0008)\u0010*\"\u0004\u0008+\u0010,R \u00102\u001a\u0008\u0012\u0004\u0012\u00020\u00050.8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008!\u0010/\u001a\u0004\u00080\u00101R \u00104\u001a\u0008\u0012\u0004\u0012\u00020\u00050.8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010/\u001a\u0004\u00083\u00101R\"\u0010;\u001a\u0002058\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001d\u00106\u001a\u0004\u00087\u00108\"\u0004\u00089\u0010:R\"\u0010A\u001a\u00020\u000c8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010<\u001a\u0004\u0008=\u0010>\"\u0004\u0008?\u0010@R\"\u0010H\u001a\u00020B8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010C\u001a\u0004\u0008D\u0010E\"\u0004\u0008F\u0010GR\"\u0010\r\u001a\u00020\u000c8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010<\u001a\u0004\u0008I\u0010>\"\u0004\u0008J\u0010@R\"\u0010M\u001a\u00020\u000c8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010<\u001a\u0004\u0008K\u0010>\"\u0004\u0008L\u0010@R\"\u0010\u0010\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008D\u0010N\u001a\u0004\u0008O\u0010P\"\u0004\u0008Q\u0010RR$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008S\u0010T\u001a\u0004\u0008S\u0010U\"\u0004\u0008V\u0010WR\"\u0010_\u001a\u00020X8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008Y\u0010Z\u001a\u0004\u0008[\u0010\\\"\u0004\u0008]\u0010^R$\u0010g\u001a\u0004\u0018\u00010`8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008a\u0010b\u001a\u0004\u0008c\u0010d\"\u0004\u0008e\u0010fR$\u0010o\u001a\u0004\u0018\u00010h8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008i\u0010j\u001a\u0004\u0008k\u0010l\"\u0004\u0008m\u0010nR\"\u0010s\u001a\u00020B8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008p\u0010C\u001a\u0004\u0008q\u0010E\"\u0004\u0008r\u0010GR\"\u0010z\u001a\u00020t8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008)\u0010u\u001a\u0004\u0008v\u0010w\"\u0004\u0008x\u0010yR\'\u0010\u0082\u0001\u001a\u0004\u0018\u00010{8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0014\n\u0004\u0008|\u0010}\u001a\u0004\u0008~\u0010\u007f\"\u0006\u0008\u0080\u0001\u0010\u0081\u0001R+\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0083\u00018\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0017\n\u0005\u0008O\u0010\u0084\u0001\u001a\u0006\u0008\u0085\u0001\u0010\u0086\u0001\"\u0006\u0008\u0087\u0001\u0010\u0088\u0001R,\u0010\u008d\u0001\u001a\t\u0012\u0005\u0012\u00030\u008a\u00010\u00158\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0014\n\u0004\u0008#\u0010/\u001a\u0004\u0008|\u00101\"\u0006\u0008\u008b\u0001\u0010\u008c\u0001R+\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u00158\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0015\n\u0004\u0008[\u0010/\u001a\u0005\u0008\u008e\u0001\u00101\"\u0006\u0008\u008f\u0001\u0010\u008c\u0001R)\u0010\u0096\u0001\u001a\u00030\u0090\u00018\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0017\n\u0005\u00087\u0010\u0091\u0001\u001a\u0006\u0008\u0092\u0001\u0010\u0093\u0001\"\u0006\u0008\u0094\u0001\u0010\u0095\u0001R(\u0010\u009c\u0001\u001a\u00030\u0097\u00018\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0016\n\u0005\u0008I\u0010\u0098\u0001\u001a\u0005\u0008i\u0010\u0099\u0001\"\u0006\u0008\u009a\u0001\u0010\u009b\u0001R*\u0010\u00a2\u0001\u001a\u0005\u0018\u00010\u009d\u00018\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0016\n\u0005\u0008K\u0010\u009e\u0001\u001a\u0005\u0008a\u0010\u009f\u0001\"\u0006\u0008\u00a0\u0001\u0010\u00a1\u0001R)\u0010\u00a8\u0001\u001a\u00030\u00a3\u00018\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0017\n\u0006\u0008\u0092\u0001\u0010\u00a4\u0001\u001a\u0005\u0008Y\u0010\u00a5\u0001\"\u0006\u0008\u00a6\u0001\u0010\u00a7\u0001R(\u0010\u00aa\u0001\u001a\u00030\u00a3\u00018\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0016\n\u0005\u00080\u0010\u00a4\u0001\u001a\u0005\u0008p\u0010\u00a5\u0001\"\u0006\u0008\u00a9\u0001\u0010\u00a7\u0001R*\u0010\u00ae\u0001\u001a\u00030\u00a3\u00018\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0018\n\u0006\u0008\u00ab\u0001\u0010\u00a4\u0001\u001a\u0006\u0008\u00ac\u0001\u0010\u00a5\u0001\"\u0006\u0008\u00ad\u0001\u0010\u00a7\u0001R)\u0010\u00b1\u0001\u001a\u00030\u00a3\u00018\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0017\n\u0005\u00083\u0010\u00a4\u0001\u001a\u0006\u0008\u00af\u0001\u0010\u00a5\u0001\"\u0006\u0008\u00b0\u0001\u0010\u00a7\u0001R*\u0010\u00b4\u0001\u001a\u00030\u00a3\u00018\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0018\n\u0006\u0008\u00b2\u0001\u0010\u00a4\u0001\u001a\u0006\u0008\u00b2\u0001\u0010\u00a5\u0001\"\u0006\u0008\u00b3\u0001\u0010\u00a7\u0001R(\u0010\u00b8\u0001\u001a\u00020\u00198\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0017\n\u0005\u0008\u008e\u0001\u0010v\u001a\u0006\u0008\u00ab\u0001\u0010\u00b5\u0001\"\u0006\u0008\u00b6\u0001\u0010\u00b7\u0001R+\u0010\u00be\u0001\u001a\u0005\u0018\u00010\u00b9\u00018\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0017\n\u0005\u0008c\u0010\u00ba\u0001\u001a\u0006\u0008\u00a4\u0001\u0010\u00bb\u0001\"\u0006\u0008\u00bc\u0001\u0010\u00bd\u0001\u00a8\u0006\u00c3\u0001"
    }
    d2 = {
        "Lokhttp3/OkHttpClient$Builder;",
        "",
        "Lokhttp3/Dispatcher;",
        "dispatcher",
        "g",
        "Lokhttp3/Interceptor;",
        "interceptor",
        "a",
        "b",
        "Loj/n;",
        "eventListener",
        "h",
        "",
        "followRedirects",
        "i",
        "Lokhttp3/CookieJar;",
        "cookieJar",
        "f",
        "Loj/c;",
        "cache",
        "d",
        "",
        "Loj/q;",
        "protocols",
        "N",
        "",
        "timeout",
        "Ljava/util/concurrent/TimeUnit;",
        "unit",
        "e",
        "O",
        "P",
        "Lokhttp3/OkHttpClient;",
        "c",
        "Lokhttp3/Dispatcher;",
        "s",
        "()Lokhttp3/Dispatcher;",
        "setDispatcher$okhttp",
        "(Lokhttp3/Dispatcher;)V",
        "Loj/i;",
        "Loj/i;",
        "p",
        "()Loj/i;",
        "setConnectionPool$okhttp",
        "(Loj/i;)V",
        "connectionPool",
        "",
        "Ljava/util/List;",
        "y",
        "()Ljava/util/List;",
        "interceptors",
        "A",
        "networkInterceptors",
        "Loj/n$c;",
        "Loj/n$c;",
        "u",
        "()Loj/n$c;",
        "setEventListenerFactory$okhttp",
        "(Loj/n$c;)V",
        "eventListenerFactory",
        "Z",
        "H",
        "()Z",
        "setRetryOnConnectionFailure$okhttp",
        "(Z)V",
        "retryOnConnectionFailure",
        "Loj/b;",
        "Loj/b;",
        "j",
        "()Loj/b;",
        "setAuthenticator$okhttp",
        "(Loj/b;)V",
        "authenticator",
        "v",
        "setFollowRedirects$okhttp",
        "w",
        "setFollowSslRedirects$okhttp",
        "followSslRedirects",
        "Lokhttp3/CookieJar;",
        "r",
        "()Lokhttp3/CookieJar;",
        "setCookieJar$okhttp",
        "(Lokhttp3/CookieJar;)V",
        "k",
        "Loj/c;",
        "()Loj/c;",
        "setCache$okhttp",
        "(Loj/c;)V",
        "Loj/m;",
        "l",
        "Loj/m;",
        "t",
        "()Loj/m;",
        "setDns$okhttp",
        "(Loj/m;)V",
        "dns",
        "Ljava/net/Proxy;",
        "m",
        "Ljava/net/Proxy;",
        "D",
        "()Ljava/net/Proxy;",
        "setProxy$okhttp",
        "(Ljava/net/Proxy;)V",
        "proxy",
        "Ljava/net/ProxySelector;",
        "n",
        "Ljava/net/ProxySelector;",
        "F",
        "()Ljava/net/ProxySelector;",
        "setProxySelector$okhttp",
        "(Ljava/net/ProxySelector;)V",
        "proxySelector",
        "o",
        "E",
        "setProxyAuthenticator$okhttp",
        "proxyAuthenticator",
        "Ljavax/net/SocketFactory;",
        "Ljavax/net/SocketFactory;",
        "J",
        "()Ljavax/net/SocketFactory;",
        "setSocketFactory$okhttp",
        "(Ljavax/net/SocketFactory;)V",
        "socketFactory",
        "Ljavax/net/ssl/SSLSocketFactory;",
        "q",
        "Ljavax/net/ssl/SSLSocketFactory;",
        "K",
        "()Ljavax/net/ssl/SSLSocketFactory;",
        "setSslSocketFactoryOrNull$okhttp",
        "(Ljavax/net/ssl/SSLSocketFactory;)V",
        "sslSocketFactoryOrNull",
        "Ljavax/net/ssl/X509TrustManager;",
        "Ljavax/net/ssl/X509TrustManager;",
        "M",
        "()Ljavax/net/ssl/X509TrustManager;",
        "setX509TrustManagerOrNull$okhttp",
        "(Ljavax/net/ssl/X509TrustManager;)V",
        "x509TrustManagerOrNull",
        "Loj/j;",
        "setConnectionSpecs$okhttp",
        "(Ljava/util/List;)V",
        "connectionSpecs",
        "C",
        "setProtocols$okhttp",
        "Ljavax/net/ssl/HostnameVerifier;",
        "Ljavax/net/ssl/HostnameVerifier;",
        "x",
        "()Ljavax/net/ssl/HostnameVerifier;",
        "setHostnameVerifier$okhttp",
        "(Ljavax/net/ssl/HostnameVerifier;)V",
        "hostnameVerifier",
        "Loj/e;",
        "Loj/e;",
        "()Loj/e;",
        "setCertificatePinner$okhttp",
        "(Loj/e;)V",
        "certificatePinner",
        "Lbk/c;",
        "Lbk/c;",
        "()Lbk/c;",
        "setCertificateChainCleaner$okhttp",
        "(Lbk/c;)V",
        "certificateChainCleaner",
        "",
        "I",
        "()I",
        "setCallTimeout$okhttp",
        "(I)V",
        "callTimeout",
        "setConnectTimeout$okhttp",
        "connectTimeout",
        "z",
        "G",
        "setReadTimeout$okhttp",
        "readTimeout",
        "L",
        "setWriteTimeout$okhttp",
        "writeTimeout",
        "B",
        "setPingInterval$okhttp",
        "pingInterval",
        "()J",
        "setMinWebSocketMessageToCompress$okhttp",
        "(J)V",
        "minWebSocketMessageToCompress",
        "Ltj/i;",
        "Ltj/i;",
        "()Ltj/i;",
        "setRouteDatabase$okhttp",
        "(Ltj/i;)V",
        "routeDatabase",
        "<init>",
        "()V",
        "okHttpClient",
        "(Lokhttp3/OkHttpClient;)V",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# instance fields
.field private A:I

.field private B:I

.field private C:J

.field private D:Ltj/i;

.field private a:Lokhttp3/Dispatcher;

.field private b:Loj/i;

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lokhttp3/Interceptor;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lokhttp3/Interceptor;",
            ">;"
        }
    .end annotation
.end field

.field private e:Loj/n$c;

.field private f:Z

.field private g:Loj/b;

.field private h:Z

.field private i:Z

.field private j:Lokhttp3/CookieJar;

.field private k:Loj/c;

.field private l:Loj/m;

.field private m:Ljava/net/Proxy;

.field private n:Ljava/net/ProxySelector;

.field private o:Loj/b;

.field private p:Ljavax/net/SocketFactory;

.field private q:Ljavax/net/ssl/SSLSocketFactory;

.field private r:Ljavax/net/ssl/X509TrustManager;

.field private s:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Loj/j;",
            ">;"
        }
    .end annotation
.end field

.field private t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Loj/q;",
            ">;"
        }
    .end annotation
.end field

.field private u:Ljavax/net/ssl/HostnameVerifier;

.field private v:Loj/e;

.field private w:Lbk/c;

.field private x:I

.field private y:I

.field private z:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lokhttp3/Dispatcher;

    invoke-direct {v0}, Lokhttp3/Dispatcher;-><init>()V

    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->a:Lokhttp3/Dispatcher;

    .line 3
    new-instance v0, Loj/i;

    invoke-direct {v0}, Loj/i;-><init>()V

    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->b:Loj/i;

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->c:Ljava/util/List;

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->d:Ljava/util/List;

    .line 6
    sget-object v0, Loj/n;->a:Loj/n;

    invoke-static {v0}, Lpj/c;->e(Loj/n;)Loj/n$c;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->e:Loj/n$c;

    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lokhttp3/OkHttpClient$Builder;->f:Z

    .line 8
    sget-object v1, Loj/b;->a:Loj/b;

    iput-object v1, p0, Lokhttp3/OkHttpClient$Builder;->g:Loj/b;

    .line 9
    iput-boolean v0, p0, Lokhttp3/OkHttpClient$Builder;->h:Z

    .line 10
    iput-boolean v0, p0, Lokhttp3/OkHttpClient$Builder;->i:Z

    .line 11
    sget-object v0, Lokhttp3/CookieJar;->a:Lokhttp3/CookieJar;

    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->j:Lokhttp3/CookieJar;

    .line 12
    sget-object v0, Loj/m;->a:Loj/m;

    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->l:Loj/m;

    .line 13
    iput-object v1, p0, Lokhttp3/OkHttpClient$Builder;->o:Loj/b;

    .line 14
    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    move-result-object v0

    const-string v1, "SocketFactory.getDefault()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->p:Ljavax/net/SocketFactory;

    .line 15
    sget-object v0, Lokhttp3/OkHttpClient;->Q:Lokhttp3/OkHttpClient$a;

    invoke-virtual {v0}, Lokhttp3/OkHttpClient$a;->a()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lokhttp3/OkHttpClient$Builder;->s:Ljava/util/List;

    .line 16
    invoke-virtual {v0}, Lokhttp3/OkHttpClient$a;->b()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->t:Ljava/util/List;

    .line 17
    sget-object v0, Lbk/d;->a:Lbk/d;

    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->u:Ljavax/net/ssl/HostnameVerifier;

    .line 18
    sget-object v0, Loj/e;->c:Loj/e;

    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->v:Loj/e;

    const/16 v0, 0x2710

    .line 19
    iput v0, p0, Lokhttp3/OkHttpClient$Builder;->y:I

    .line 20
    iput v0, p0, Lokhttp3/OkHttpClient$Builder;->z:I

    .line 21
    iput v0, p0, Lokhttp3/OkHttpClient$Builder;->A:I

    const-wide/16 v0, 0x400

    .line 22
    iput-wide v0, p0, Lokhttp3/OkHttpClient$Builder;->C:J

    return-void
.end method

.method public constructor <init>(Lokhttp3/OkHttpClient;)V
    .locals 2

    const-string v0, "okHttpClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-direct {p0}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    .line 24
    invoke-virtual {p1}, Lokhttp3/OkHttpClient;->r()Lokhttp3/Dispatcher;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->a:Lokhttp3/Dispatcher;

    .line 25
    invoke-virtual {p1}, Lokhttp3/OkHttpClient;->o()Loj/i;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->b:Loj/i;

    .line 26
    iget-object v0, p0, Lokhttp3/OkHttpClient$Builder;->c:Ljava/util/List;

    invoke-virtual {p1}, Lokhttp3/OkHttpClient;->y()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/collections/h;->y(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 27
    iget-object v0, p0, Lokhttp3/OkHttpClient$Builder;->d:Ljava/util/List;

    invoke-virtual {p1}, Lokhttp3/OkHttpClient;->A()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/collections/h;->y(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 28
    invoke-virtual {p1}, Lokhttp3/OkHttpClient;->t()Loj/n$c;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->e:Loj/n$c;

    .line 29
    invoke-virtual {p1}, Lokhttp3/OkHttpClient;->J()Z

    move-result v0

    iput-boolean v0, p0, Lokhttp3/OkHttpClient$Builder;->f:Z

    .line 30
    invoke-virtual {p1}, Lokhttp3/OkHttpClient;->g()Loj/b;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->g:Loj/b;

    .line 31
    invoke-virtual {p1}, Lokhttp3/OkHttpClient;->u()Z

    move-result v0

    iput-boolean v0, p0, Lokhttp3/OkHttpClient$Builder;->h:Z

    .line 32
    invoke-virtual {p1}, Lokhttp3/OkHttpClient;->v()Z

    move-result v0

    iput-boolean v0, p0, Lokhttp3/OkHttpClient$Builder;->i:Z

    .line 33
    invoke-virtual {p1}, Lokhttp3/OkHttpClient;->q()Lokhttp3/CookieJar;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->j:Lokhttp3/CookieJar;

    .line 34
    invoke-virtual {p1}, Lokhttp3/OkHttpClient;->h()Loj/c;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->k:Loj/c;

    .line 35
    invoke-virtual {p1}, Lokhttp3/OkHttpClient;->s()Loj/m;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->l:Loj/m;

    .line 36
    invoke-virtual {p1}, Lokhttp3/OkHttpClient;->F()Ljava/net/Proxy;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->m:Ljava/net/Proxy;

    .line 37
    invoke-virtual {p1}, Lokhttp3/OkHttpClient;->H()Ljava/net/ProxySelector;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->n:Ljava/net/ProxySelector;

    .line 38
    invoke-virtual {p1}, Lokhttp3/OkHttpClient;->G()Loj/b;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->o:Loj/b;

    .line 39
    invoke-virtual {p1}, Lokhttp3/OkHttpClient;->K()Ljavax/net/SocketFactory;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->p:Ljavax/net/SocketFactory;

    .line 40
    invoke-static {p1}, Lokhttp3/OkHttpClient;->e(Lokhttp3/OkHttpClient;)Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->q:Ljavax/net/ssl/SSLSocketFactory;

    .line 41
    invoke-virtual {p1}, Lokhttp3/OkHttpClient;->O()Ljavax/net/ssl/X509TrustManager;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->r:Ljavax/net/ssl/X509TrustManager;

    .line 42
    invoke-virtual {p1}, Lokhttp3/OkHttpClient;->p()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->s:Ljava/util/List;

    .line 43
    invoke-virtual {p1}, Lokhttp3/OkHttpClient;->E()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->t:Ljava/util/List;

    .line 44
    invoke-virtual {p1}, Lokhttp3/OkHttpClient;->x()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->u:Ljavax/net/ssl/HostnameVerifier;

    .line 45
    invoke-virtual {p1}, Lokhttp3/OkHttpClient;->m()Loj/e;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->v:Loj/e;

    .line 46
    invoke-virtual {p1}, Lokhttp3/OkHttpClient;->k()Lbk/c;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->w:Lbk/c;

    .line 47
    invoke-virtual {p1}, Lokhttp3/OkHttpClient;->j()I

    move-result v0

    iput v0, p0, Lokhttp3/OkHttpClient$Builder;->x:I

    .line 48
    invoke-virtual {p1}, Lokhttp3/OkHttpClient;->n()I

    move-result v0

    iput v0, p0, Lokhttp3/OkHttpClient$Builder;->y:I

    .line 49
    invoke-virtual {p1}, Lokhttp3/OkHttpClient;->I()I

    move-result v0

    iput v0, p0, Lokhttp3/OkHttpClient$Builder;->z:I

    .line 50
    invoke-virtual {p1}, Lokhttp3/OkHttpClient;->N()I

    move-result v0

    iput v0, p0, Lokhttp3/OkHttpClient$Builder;->A:I

    .line 51
    invoke-virtual {p1}, Lokhttp3/OkHttpClient;->D()I

    move-result v0

    iput v0, p0, Lokhttp3/OkHttpClient$Builder;->B:I

    .line 52
    invoke-virtual {p1}, Lokhttp3/OkHttpClient;->z()J

    move-result-wide v0

    iput-wide v0, p0, Lokhttp3/OkHttpClient$Builder;->C:J

    .line 53
    invoke-virtual {p1}, Lokhttp3/OkHttpClient;->w()Ltj/i;

    move-result-object p1

    iput-object p1, p0, Lokhttp3/OkHttpClient$Builder;->D:Ltj/i;

    return-void
.end method


# virtual methods
.method public final A()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lokhttp3/Interceptor;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lokhttp3/OkHttpClient$Builder;->d:Ljava/util/List;

    return-object v0
.end method

.method public final B()I
    .locals 1

    iget v0, p0, Lokhttp3/OkHttpClient$Builder;->B:I

    return v0
.end method

.method public final C()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Loj/q;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lokhttp3/OkHttpClient$Builder;->t:Ljava/util/List;

    return-object v0
.end method

.method public final D()Ljava/net/Proxy;
    .locals 1

    iget-object v0, p0, Lokhttp3/OkHttpClient$Builder;->m:Ljava/net/Proxy;

    return-object v0
.end method

.method public final E()Loj/b;
    .locals 1

    iget-object v0, p0, Lokhttp3/OkHttpClient$Builder;->o:Loj/b;

    return-object v0
.end method

.method public final F()Ljava/net/ProxySelector;
    .locals 1

    iget-object v0, p0, Lokhttp3/OkHttpClient$Builder;->n:Ljava/net/ProxySelector;

    return-object v0
.end method

.method public final G()I
    .locals 1

    iget v0, p0, Lokhttp3/OkHttpClient$Builder;->z:I

    return v0
.end method

.method public final H()Z
    .locals 1

    iget-boolean v0, p0, Lokhttp3/OkHttpClient$Builder;->f:Z

    return v0
.end method

.method public final I()Ltj/i;
    .locals 1

    iget-object v0, p0, Lokhttp3/OkHttpClient$Builder;->D:Ltj/i;

    return-object v0
.end method

.method public final J()Ljavax/net/SocketFactory;
    .locals 1

    iget-object v0, p0, Lokhttp3/OkHttpClient$Builder;->p:Ljavax/net/SocketFactory;

    return-object v0
.end method

.method public final K()Ljavax/net/ssl/SSLSocketFactory;
    .locals 1

    iget-object v0, p0, Lokhttp3/OkHttpClient$Builder;->q:Ljavax/net/ssl/SSLSocketFactory;

    return-object v0
.end method

.method public final L()I
    .locals 1

    iget v0, p0, Lokhttp3/OkHttpClient$Builder;->A:I

    return v0
.end method

.method public final M()Ljavax/net/ssl/X509TrustManager;
    .locals 1

    iget-object v0, p0, Lokhttp3/OkHttpClient$Builder;->r:Ljavax/net/ssl/X509TrustManager;

    return-object v0
.end method

.method public final N(Ljava/util/List;)Lokhttp3/OkHttpClient$Builder;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Loj/q;",
            ">;)",
            "Lokhttp3/OkHttpClient$Builder;"
        }
    .end annotation

    .line 1
    const-string v0, "protocols"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lkotlin/collections/h;->F0(Ljava/util/Collection;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    sget-object v0, Loj/q;->p:Loj/q;

    .line 11
    .line 12
    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x1

    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    sget-object v1, Loj/q;->m:Loj/q;

    .line 21
    .line 22
    invoke-interface {p1, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v1, v2

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    :goto_0
    move v1, v3

    .line 32
    :goto_1
    if-eqz v1, :cond_8

    .line 33
    .line 34
    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-gt v0, v3, :cond_3

    .line 45
    .line 46
    :cond_2
    move v2, v3

    .line 47
    :cond_3
    if-eqz v2, :cond_7

    .line 48
    .line 49
    sget-object v0, Loj/q;->l:Loj/q;

    .line 50
    .line 51
    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    xor-int/2addr v0, v3

    .line 56
    if-eqz v0, :cond_6

    .line 57
    .line 58
    const/4 v0, 0x0

    .line 59
    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    xor-int/2addr v1, v3

    .line 64
    if-eqz v1, :cond_5

    .line 65
    .line 66
    sget-object v1, Loj/q;->n:Loj/q;

    .line 67
    .line 68
    invoke-interface {p1, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    iget-object v1, p0, Lokhttp3/OkHttpClient$Builder;->t:Ljava/util/List;

    .line 72
    .line 73
    invoke-static {p1, v1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    xor-int/2addr v1, v3

    .line 78
    if-eqz v1, :cond_4

    .line 79
    .line 80
    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->D:Ltj/i;

    .line 81
    .line 82
    :cond_4
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    const-string v0, "Collections.unmodifiableList(protocolsCopy)"

    .line 87
    .line 88
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    iput-object p1, p0, Lokhttp3/OkHttpClient$Builder;->t:Ljava/util/List;

    .line 92
    .line 93
    return-object p0

    .line 94
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 95
    .line 96
    const-string v0, "protocols must not contain null"

    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw p1

    .line 106
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 109
    .line 110
    .line 111
    const-string v1, "protocols must not contain http/1.0: "

    .line 112
    .line 113
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 124
    .line 125
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    throw v0

    .line 133
    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 134
    .line 135
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 136
    .line 137
    .line 138
    const-string v1, "protocols containing h2_prior_knowledge cannot use other protocols: "

    .line 139
    .line 140
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 151
    .line 152
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    throw v0

    .line 160
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 163
    .line 164
    .line 165
    const-string v1, "protocols must contain h2_prior_knowledge or http/1.1: "

    .line 166
    .line 167
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 178
    .line 179
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    throw v0
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
.end method

.method public final O(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;
    .locals 1

    .line 1
    const-string v0, "unit"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "timeout"

    .line 7
    .line 8
    invoke-static {v0, p1, p2, p3}, Lpj/c;->h(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iput p1, p0, Lokhttp3/OkHttpClient$Builder;->z:I

    .line 13
    .line 14
    return-object p0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method

.method public final P(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;
    .locals 1

    .line 1
    const-string v0, "unit"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "timeout"

    .line 7
    .line 8
    invoke-static {v0, p1, p2, p3}, Lpj/c;->h(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iput p1, p0, Lokhttp3/OkHttpClient$Builder;->A:I

    .line 13
    .line 14
    return-object p0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method

.method public final a(Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;
    .locals 1

    .line 1
    const-string v0, "interceptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lokhttp3/OkHttpClient$Builder;->c:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-object p0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public final b(Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;
    .locals 1

    .line 1
    const-string v0, "interceptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lokhttp3/OkHttpClient$Builder;->d:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-object p0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public final c()Lokhttp3/OkHttpClient;
    .locals 1

    new-instance v0, Lokhttp3/OkHttpClient;

    invoke-direct {v0, p0}, Lokhttp3/OkHttpClient;-><init>(Lokhttp3/OkHttpClient$Builder;)V

    return-object v0
.end method

.method public final d(Loj/c;)Lokhttp3/OkHttpClient$Builder;
    .locals 0

    iput-object p1, p0, Lokhttp3/OkHttpClient$Builder;->k:Loj/c;

    return-object p0
.end method

.method public final e(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;
    .locals 1

    .line 1
    const-string v0, "unit"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "timeout"

    .line 7
    .line 8
    invoke-static {v0, p1, p2, p3}, Lpj/c;->h(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iput p1, p0, Lokhttp3/OkHttpClient$Builder;->y:I

    .line 13
    .line 14
    return-object p0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method

.method public final f(Lokhttp3/CookieJar;)Lokhttp3/OkHttpClient$Builder;
    .locals 1

    .line 1
    const-string v0, "cookieJar"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lokhttp3/OkHttpClient$Builder;->j:Lokhttp3/CookieJar;

    .line 7
    .line 8
    return-object p0
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public final g(Lokhttp3/Dispatcher;)Lokhttp3/OkHttpClient$Builder;
    .locals 1

    .line 1
    const-string v0, "dispatcher"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lokhttp3/OkHttpClient$Builder;->a:Lokhttp3/Dispatcher;

    .line 7
    .line 8
    return-object p0
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public final h(Loj/n;)Lokhttp3/OkHttpClient$Builder;
    .locals 1

    .line 1
    const-string v0, "eventListener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lpj/c;->e(Loj/n;)Loj/n$c;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lokhttp3/OkHttpClient$Builder;->e:Loj/n$c;

    .line 11
    .line 12
    return-object p0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public final i(Z)Lokhttp3/OkHttpClient$Builder;
    .locals 0

    iput-boolean p1, p0, Lokhttp3/OkHttpClient$Builder;->h:Z

    return-object p0
.end method

.method public final j()Loj/b;
    .locals 1

    iget-object v0, p0, Lokhttp3/OkHttpClient$Builder;->g:Loj/b;

    return-object v0
.end method

.method public final k()Loj/c;
    .locals 1

    iget-object v0, p0, Lokhttp3/OkHttpClient$Builder;->k:Loj/c;

    return-object v0
.end method

.method public final l()I
    .locals 1

    iget v0, p0, Lokhttp3/OkHttpClient$Builder;->x:I

    return v0
.end method

.method public final m()Lbk/c;
    .locals 1

    iget-object v0, p0, Lokhttp3/OkHttpClient$Builder;->w:Lbk/c;

    return-object v0
.end method

.method public final n()Loj/e;
    .locals 1

    iget-object v0, p0, Lokhttp3/OkHttpClient$Builder;->v:Loj/e;

    return-object v0
.end method

.method public final o()I
    .locals 1

    iget v0, p0, Lokhttp3/OkHttpClient$Builder;->y:I

    return v0
.end method

.method public final p()Loj/i;
    .locals 1

    iget-object v0, p0, Lokhttp3/OkHttpClient$Builder;->b:Loj/i;

    return-object v0
.end method

.method public final q()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Loj/j;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lokhttp3/OkHttpClient$Builder;->s:Ljava/util/List;

    return-object v0
.end method

.method public final r()Lokhttp3/CookieJar;
    .locals 1

    iget-object v0, p0, Lokhttp3/OkHttpClient$Builder;->j:Lokhttp3/CookieJar;

    return-object v0
.end method

.method public final s()Lokhttp3/Dispatcher;
    .locals 1

    iget-object v0, p0, Lokhttp3/OkHttpClient$Builder;->a:Lokhttp3/Dispatcher;

    return-object v0
.end method

.method public final t()Loj/m;
    .locals 1

    iget-object v0, p0, Lokhttp3/OkHttpClient$Builder;->l:Loj/m;

    return-object v0
.end method

.method public final u()Loj/n$c;
    .locals 1

    iget-object v0, p0, Lokhttp3/OkHttpClient$Builder;->e:Loj/n$c;

    return-object v0
.end method

.method public final v()Z
    .locals 1

    iget-boolean v0, p0, Lokhttp3/OkHttpClient$Builder;->h:Z

    return v0
.end method

.method public final w()Z
    .locals 1

    iget-boolean v0, p0, Lokhttp3/OkHttpClient$Builder;->i:Z

    return v0
.end method

.method public final x()Ljavax/net/ssl/HostnameVerifier;
    .locals 1

    iget-object v0, p0, Lokhttp3/OkHttpClient$Builder;->u:Ljavax/net/ssl/HostnameVerifier;

    return-object v0
.end method

.method public final y()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lokhttp3/Interceptor;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lokhttp3/OkHttpClient$Builder;->c:Ljava/util/List;

    return-object v0
.end method

.method public final z()J
    .locals 2

    iget-wide v0, p0, Lokhttp3/OkHttpClient$Builder;->C:J

    return-wide v0
.end method
