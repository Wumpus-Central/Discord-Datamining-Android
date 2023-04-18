.class public Lokhttp3/OkHttpClient;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;
.implements Lokhttp3/Call$Factory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/OkHttpClient$Builder;,
        Lokhttp3/OkHttpClient$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00e6\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\n\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0016\u0018\u0000 \u008f\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\u0090\u0001\tB\u0014\u0008\u0000\u0012\u0007\u0010\u008b\u0001\u001a\u00020\u000e\u00a2\u0006\u0006\u0008\u008c\u0001\u0010\u008d\u0001B\u000b\u0008\u0016\u00a2\u0006\u0006\u0008\u008c\u0001\u0010\u008e\u0001J\u0008\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0008\u0010\u000f\u001a\u00020\u000eH\u0016R\u0017\u0010\u0015\u001a\u00020\u00108G\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u001b\u001a\u00020\u00168G\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u001d\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001c8G\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!R\u001d\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001c8G\u00a2\u0006\u000c\n\u0004\u0008#\u0010\u001f\u001a\u0004\u0008$\u0010!R\u0017\u0010*\u001a\u00020&8G\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\'\u001a\u0004\u0008(\u0010)R\u0017\u00100\u001a\u00020+8G\u00a2\u0006\u000c\n\u0004\u0008,\u0010-\u001a\u0004\u0008.\u0010/R\u0017\u00106\u001a\u0002018G\u00a2\u0006\u000c\n\u0004\u00082\u00103\u001a\u0004\u00084\u00105R\u0017\u00108\u001a\u00020+8G\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010-\u001a\u0004\u00087\u0010/R\u0017\u0010;\u001a\u00020+8G\u00a2\u0006\u000c\n\u0004\u00089\u0010-\u001a\u0004\u0008:\u0010/R\u0017\u0010?\u001a\u00020<8G\u00a2\u0006\u000c\n\u0004\u0008(\u0010=\u001a\u0004\u00082\u0010>R\u0019\u0010D\u001a\u0004\u0018\u00010@8G\u00a2\u0006\u000c\n\u0004\u00087\u0010A\u001a\u0004\u0008B\u0010CR\u0017\u0010H\u001a\u00020E8G\u00a2\u0006\u000c\n\u0004\u0008:\u0010F\u001a\u0004\u00089\u0010GR\u0019\u0010N\u001a\u0004\u0018\u00010I8G\u00a2\u0006\u000c\n\u0004\u0008J\u0010K\u001a\u0004\u0008L\u0010MR\u0017\u0010T\u001a\u00020O8G\u00a2\u0006\u000c\n\u0004\u0008P\u0010Q\u001a\u0004\u0008R\u0010SR\u0017\u0010V\u001a\u0002018G\u00a2\u0006\u000c\n\u0004\u0008 \u00103\u001a\u0004\u0008U\u00105R\u0017\u0010\\\u001a\u00020W8G\u00a2\u0006\u000c\n\u0004\u0008X\u0010Y\u001a\u0004\u0008Z\u0010[R\u0016\u0010_\u001a\u0004\u0018\u00010]8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010^R\u0019\u0010d\u001a\u0004\u0018\u00010`8G\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010a\u001a\u0004\u0008b\u0010cR\u001d\u0010f\u001a\u0008\u0012\u0004\u0012\u00020e0\u001c8G\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u001f\u001a\u0004\u0008,\u0010!R\u001d\u0010j\u001a\u0008\u0012\u0004\u0012\u00020g0\u001c8G\u00a2\u0006\u000c\n\u0004\u0008h\u0010\u001f\u001a\u0004\u0008i\u0010!R\u0017\u0010n\u001a\u00020k8G\u00a2\u0006\u000c\n\u0004\u0008i\u0010l\u001a\u0004\u0008P\u0010mR\u0017\u0010r\u001a\u00020o8G\u00a2\u0006\u000c\n\u0004\u0008L\u0010p\u001a\u0004\u0008\u001e\u0010qR\u0019\u0010v\u001a\u0004\u0018\u00010s8G\u00a2\u0006\u000c\n\u0004\u0008U\u0010t\u001a\u0004\u0008\u0011\u0010uR\u0017\u0010{\u001a\u00020w8G\u00a2\u0006\u000c\n\u0004\u0008R\u0010x\u001a\u0004\u0008y\u0010zR\u0017\u0010|\u001a\u00020w8G\u00a2\u0006\u000c\n\u0004\u0008x\u0010x\u001a\u0004\u0008#\u0010zR\u0017\u0010}\u001a\u00020w8G\u00a2\u0006\u000c\n\u0004\u0008.\u0010x\u001a\u0004\u0008x\u0010zR\u0017\u0010\u007f\u001a\u00020w8G\u00a2\u0006\u000c\n\u0004\u0008Z\u0010x\u001a\u0004\u0008~\u0010zR\u0019\u0010\u0081\u0001\u001a\u00020w8G\u00a2\u0006\r\n\u0005\u0008\u0080\u0001\u0010x\u001a\u0004\u0008h\u0010zR\u001a\u0010\u0084\u0001\u001a\u00030\u0082\u00018G\u00a2\u0006\r\n\u0004\u0008\u0005\u0010.\u001a\u0005\u0008X\u0010\u0083\u0001R\u001b\u0010\u0088\u0001\u001a\u00030\u0085\u00018\u0006\u00a2\u0006\u000e\n\u0005\u0008~\u0010\u0086\u0001\u001a\u0005\u0008J\u0010\u0087\u0001R\u0014\u0010\u008a\u0001\u001a\u00020]8G\u00a2\u0006\u0008\u001a\u0006\u0008\u0080\u0001\u0010\u0089\u0001\u00a8\u0006\u0091\u0001"
    }
    d2 = {
        "Lokhttp3/OkHttpClient;",
        "",
        "Lokhttp3/Call$Factory;",
        "",
        "",
        "M",
        "Lokhttp3/Request;",
        "request",
        "Lokhttp3/Call;",
        "a",
        "Loj/t;",
        "listener",
        "Lokhttp3/WebSocket;",
        "C",
        "Lokhttp3/OkHttpClient$Builder;",
        "B",
        "Lokhttp3/Dispatcher;",
        "k",
        "Lokhttp3/Dispatcher;",
        "r",
        "()Lokhttp3/Dispatcher;",
        "dispatcher",
        "Loj/i;",
        "l",
        "Loj/i;",
        "o",
        "()Loj/i;",
        "connectionPool",
        "",
        "Lokhttp3/Interceptor;",
        "m",
        "Ljava/util/List;",
        "y",
        "()Ljava/util/List;",
        "interceptors",
        "n",
        "A",
        "networkInterceptors",
        "Loj/n$c;",
        "Loj/n$c;",
        "t",
        "()Loj/n$c;",
        "eventListenerFactory",
        "",
        "p",
        "Z",
        "J",
        "()Z",
        "retryOnConnectionFailure",
        "Loj/b;",
        "q",
        "Loj/b;",
        "g",
        "()Loj/b;",
        "authenticator",
        "u",
        "followRedirects",
        "s",
        "v",
        "followSslRedirects",
        "Lokhttp3/CookieJar;",
        "Lokhttp3/CookieJar;",
        "()Lokhttp3/CookieJar;",
        "cookieJar",
        "Loj/c;",
        "Loj/c;",
        "h",
        "()Loj/c;",
        "cache",
        "Loj/m;",
        "Loj/m;",
        "()Loj/m;",
        "dns",
        "Ljava/net/Proxy;",
        "w",
        "Ljava/net/Proxy;",
        "F",
        "()Ljava/net/Proxy;",
        "proxy",
        "Ljava/net/ProxySelector;",
        "x",
        "Ljava/net/ProxySelector;",
        "H",
        "()Ljava/net/ProxySelector;",
        "proxySelector",
        "G",
        "proxyAuthenticator",
        "Ljavax/net/SocketFactory;",
        "z",
        "Ljavax/net/SocketFactory;",
        "K",
        "()Ljavax/net/SocketFactory;",
        "socketFactory",
        "Ljavax/net/ssl/SSLSocketFactory;",
        "Ljavax/net/ssl/SSLSocketFactory;",
        "sslSocketFactoryOrNull",
        "Ljavax/net/ssl/X509TrustManager;",
        "Ljavax/net/ssl/X509TrustManager;",
        "O",
        "()Ljavax/net/ssl/X509TrustManager;",
        "x509TrustManager",
        "Loj/j;",
        "connectionSpecs",
        "Loj/q;",
        "D",
        "E",
        "protocols",
        "Ljavax/net/ssl/HostnameVerifier;",
        "Ljavax/net/ssl/HostnameVerifier;",
        "()Ljavax/net/ssl/HostnameVerifier;",
        "hostnameVerifier",
        "Loj/e;",
        "Loj/e;",
        "()Loj/e;",
        "certificatePinner",
        "Lbk/c;",
        "Lbk/c;",
        "()Lbk/c;",
        "certificateChainCleaner",
        "",
        "I",
        "j",
        "()I",
        "callTimeoutMillis",
        "connectTimeoutMillis",
        "readTimeoutMillis",
        "N",
        "writeTimeoutMillis",
        "L",
        "pingIntervalMillis",
        "",
        "()J",
        "minWebSocketMessageToCompress",
        "Ltj/i;",
        "Ltj/i;",
        "()Ltj/i;",
        "routeDatabase",
        "()Ljavax/net/ssl/SSLSocketFactory;",
        "sslSocketFactory",
        "builder",
        "<init>",
        "(Lokhttp3/OkHttpClient$Builder;)V",
        "()V",
        "Q",
        "Builder",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# static fields
.field private static final O:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Loj/q;",
            ">;"
        }
    .end annotation
.end field

.field private static final P:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Loj/j;",
            ">;"
        }
    .end annotation
.end field

.field public static final Q:Lokhttp3/OkHttpClient$a;


# instance fields
.field private final A:Ljavax/net/ssl/SSLSocketFactory;

.field private final B:Ljavax/net/ssl/X509TrustManager;

.field private final C:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Loj/j;",
            ">;"
        }
    .end annotation
.end field

.field private final D:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Loj/q;",
            ">;"
        }
    .end annotation
.end field

.field private final E:Ljavax/net/ssl/HostnameVerifier;

.field private final F:Loj/e;

.field private final G:Lbk/c;

.field private final H:I

.field private final I:I

.field private final J:I

.field private final K:I

.field private final L:I

.field private final M:J

.field private final N:Ltj/i;

.field private final k:Lokhttp3/Dispatcher;

.field private final l:Loj/i;

.field private final m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lokhttp3/Interceptor;",
            ">;"
        }
    .end annotation
.end field

.field private final n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lokhttp3/Interceptor;",
            ">;"
        }
    .end annotation
.end field

.field private final o:Loj/n$c;

.field private final p:Z

.field private final q:Loj/b;

.field private final r:Z

.field private final s:Z

.field private final t:Lokhttp3/CookieJar;

.field private final u:Loj/c;

.field private final v:Loj/m;

.field private final w:Ljava/net/Proxy;

.field private final x:Ljava/net/ProxySelector;

.field private final y:Loj/b;

.field private final z:Ljavax/net/SocketFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lokhttp3/OkHttpClient$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lokhttp3/OkHttpClient$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lokhttp3/OkHttpClient;->Q:Lokhttp3/OkHttpClient$a;

    .line 8
    .line 9
    const/4 v0, 0x2

    .line 10
    new-array v1, v0, [Loj/q;

    .line 11
    .line 12
    sget-object v2, Loj/q;->o:Loj/q;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    aput-object v2, v1, v3

    .line 16
    .line 17
    sget-object v2, Loj/q;->m:Loj/q;

    .line 18
    .line 19
    const/4 v4, 0x1

    .line 20
    aput-object v2, v1, v4

    .line 21
    .line 22
    invoke-static {v1}, Lpj/c;->t([Ljava/lang/Object;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    sput-object v1, Lokhttp3/OkHttpClient;->O:Ljava/util/List;

    .line 27
    .line 28
    new-array v0, v0, [Loj/j;

    .line 29
    .line 30
    sget-object v1, Loj/j;->h:Loj/j;

    .line 31
    .line 32
    aput-object v1, v0, v3

    .line 33
    .line 34
    sget-object v1, Loj/j;->j:Loj/j;

    .line 35
    .line 36
    aput-object v1, v0, v4

    .line 37
    .line 38
    invoke-static {v0}, Lpj/c;->t([Ljava/lang/Object;)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    sput-object v0, Lokhttp3/OkHttpClient;->P:Ljava/util/List;

    .line 43
    .line 44
    return-void
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
.end method

.method public constructor <init>()V
    .locals 1

    .line 49
    new-instance v0, Lokhttp3/OkHttpClient$Builder;

    invoke-direct {v0}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    invoke-direct {p0, v0}, Lokhttp3/OkHttpClient;-><init>(Lokhttp3/OkHttpClient$Builder;)V

    return-void
.end method

.method public constructor <init>(Lokhttp3/OkHttpClient$Builder;)V
    .locals 3

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p1}, Lokhttp3/OkHttpClient$Builder;->s()Lokhttp3/Dispatcher;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/OkHttpClient;->k:Lokhttp3/Dispatcher;

    .line 3
    invoke-virtual {p1}, Lokhttp3/OkHttpClient$Builder;->p()Loj/i;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/OkHttpClient;->l:Loj/i;

    .line 4
    invoke-virtual {p1}, Lokhttp3/OkHttpClient$Builder;->y()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lpj/c;->R(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/OkHttpClient;->m:Ljava/util/List;

    .line 5
    invoke-virtual {p1}, Lokhttp3/OkHttpClient$Builder;->A()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lpj/c;->R(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/OkHttpClient;->n:Ljava/util/List;

    .line 6
    invoke-virtual {p1}, Lokhttp3/OkHttpClient$Builder;->u()Loj/n$c;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/OkHttpClient;->o:Loj/n$c;

    .line 7
    invoke-virtual {p1}, Lokhttp3/OkHttpClient$Builder;->H()Z

    move-result v0

    iput-boolean v0, p0, Lokhttp3/OkHttpClient;->p:Z

    .line 8
    invoke-virtual {p1}, Lokhttp3/OkHttpClient$Builder;->j()Loj/b;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/OkHttpClient;->q:Loj/b;

    .line 9
    invoke-virtual {p1}, Lokhttp3/OkHttpClient$Builder;->v()Z

    move-result v0

    iput-boolean v0, p0, Lokhttp3/OkHttpClient;->r:Z

    .line 10
    invoke-virtual {p1}, Lokhttp3/OkHttpClient$Builder;->w()Z

    move-result v0

    iput-boolean v0, p0, Lokhttp3/OkHttpClient;->s:Z

    .line 11
    invoke-virtual {p1}, Lokhttp3/OkHttpClient$Builder;->r()Lokhttp3/CookieJar;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/OkHttpClient;->t:Lokhttp3/CookieJar;

    .line 12
    invoke-virtual {p1}, Lokhttp3/OkHttpClient$Builder;->k()Loj/c;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/OkHttpClient;->u:Loj/c;

    .line 13
    invoke-virtual {p1}, Lokhttp3/OkHttpClient$Builder;->t()Loj/m;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/OkHttpClient;->v:Loj/m;

    .line 14
    invoke-virtual {p1}, Lokhttp3/OkHttpClient$Builder;->D()Ljava/net/Proxy;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/OkHttpClient;->w:Ljava/net/Proxy;

    .line 15
    invoke-virtual {p1}, Lokhttp3/OkHttpClient$Builder;->D()Ljava/net/Proxy;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v0, Lak/a;->a:Lak/a;

    goto :goto_1

    .line 16
    :cond_0
    invoke-virtual {p1}, Lokhttp3/OkHttpClient$Builder;->F()Ljava/net/ProxySelector;

    move-result-object v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {}, Ljava/net/ProxySelector;->getDefault()Ljava/net/ProxySelector;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    sget-object v0, Lak/a;->a:Lak/a;

    .line 17
    :goto_1
    iput-object v0, p0, Lokhttp3/OkHttpClient;->x:Ljava/net/ProxySelector;

    .line 18
    invoke-virtual {p1}, Lokhttp3/OkHttpClient$Builder;->E()Loj/b;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/OkHttpClient;->y:Loj/b;

    .line 19
    invoke-virtual {p1}, Lokhttp3/OkHttpClient$Builder;->J()Ljavax/net/SocketFactory;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/OkHttpClient;->z:Ljavax/net/SocketFactory;

    .line 20
    invoke-virtual {p1}, Lokhttp3/OkHttpClient$Builder;->q()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/OkHttpClient;->C:Ljava/util/List;

    .line 21
    invoke-virtual {p1}, Lokhttp3/OkHttpClient$Builder;->C()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lokhttp3/OkHttpClient;->D:Ljava/util/List;

    .line 22
    invoke-virtual {p1}, Lokhttp3/OkHttpClient$Builder;->x()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v1

    iput-object v1, p0, Lokhttp3/OkHttpClient;->E:Ljavax/net/ssl/HostnameVerifier;

    .line 23
    invoke-virtual {p1}, Lokhttp3/OkHttpClient$Builder;->l()I

    move-result v1

    iput v1, p0, Lokhttp3/OkHttpClient;->H:I

    .line 24
    invoke-virtual {p1}, Lokhttp3/OkHttpClient$Builder;->o()I

    move-result v1

    iput v1, p0, Lokhttp3/OkHttpClient;->I:I

    .line 25
    invoke-virtual {p1}, Lokhttp3/OkHttpClient$Builder;->G()I

    move-result v1

    iput v1, p0, Lokhttp3/OkHttpClient;->J:I

    .line 26
    invoke-virtual {p1}, Lokhttp3/OkHttpClient$Builder;->L()I

    move-result v1

    iput v1, p0, Lokhttp3/OkHttpClient;->K:I

    .line 27
    invoke-virtual {p1}, Lokhttp3/OkHttpClient$Builder;->B()I

    move-result v1

    iput v1, p0, Lokhttp3/OkHttpClient;->L:I

    .line 28
    invoke-virtual {p1}, Lokhttp3/OkHttpClient$Builder;->z()J

    move-result-wide v1

    iput-wide v1, p0, Lokhttp3/OkHttpClient;->M:J

    .line 29
    invoke-virtual {p1}, Lokhttp3/OkHttpClient$Builder;->I()Ltj/i;

    move-result-object v1

    if-eqz v1, :cond_3

    goto :goto_2

    :cond_3
    new-instance v1, Ltj/i;

    invoke-direct {v1}, Ltj/i;-><init>()V

    :goto_2
    iput-object v1, p0, Lokhttp3/OkHttpClient;->N:Ltj/i;

    .line 30
    instance-of v1, v0, Ljava/util/Collection;

    const/4 v2, 0x1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_3

    .line 31
    :cond_4
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Loj/j;

    .line 32
    invoke-virtual {v1}, Loj/j;->f()Z

    move-result v1

    if-eqz v1, :cond_5

    const/4 v2, 0x0

    :cond_6
    :goto_3
    if-eqz v2, :cond_7

    const/4 p1, 0x0

    .line 33
    iput-object p1, p0, Lokhttp3/OkHttpClient;->A:Ljavax/net/ssl/SSLSocketFactory;

    .line 34
    iput-object p1, p0, Lokhttp3/OkHttpClient;->G:Lbk/c;

    .line 35
    iput-object p1, p0, Lokhttp3/OkHttpClient;->B:Ljavax/net/ssl/X509TrustManager;

    .line 36
    sget-object p1, Loj/e;->c:Loj/e;

    iput-object p1, p0, Lokhttp3/OkHttpClient;->F:Loj/e;

    goto :goto_4

    .line 37
    :cond_7
    invoke-virtual {p1}, Lokhttp3/OkHttpClient$Builder;->K()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 38
    invoke-virtual {p1}, Lokhttp3/OkHttpClient$Builder;->K()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/OkHttpClient;->A:Ljavax/net/ssl/SSLSocketFactory;

    .line 39
    invoke-virtual {p1}, Lokhttp3/OkHttpClient$Builder;->m()Lbk/c;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    iput-object v0, p0, Lokhttp3/OkHttpClient;->G:Lbk/c;

    .line 40
    invoke-virtual {p1}, Lokhttp3/OkHttpClient$Builder;->M()Ljavax/net/ssl/X509TrustManager;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    iput-object v1, p0, Lokhttp3/OkHttpClient;->B:Ljavax/net/ssl/X509TrustManager;

    .line 41
    invoke-virtual {p1}, Lokhttp3/OkHttpClient$Builder;->n()Loj/e;

    move-result-object p1

    .line 42
    invoke-static {v0}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Loj/e;->e(Lbk/c;)Loj/e;

    move-result-object p1

    iput-object p1, p0, Lokhttp3/OkHttpClient;->F:Loj/e;

    goto :goto_4

    .line 43
    :cond_8
    sget-object v0, Lyj/k;->c:Lyj/k$a;

    invoke-virtual {v0}, Lyj/k$a;->g()Lyj/k;

    move-result-object v1

    invoke-virtual {v1}, Lyj/k;->p()Ljavax/net/ssl/X509TrustManager;

    move-result-object v1

    iput-object v1, p0, Lokhttp3/OkHttpClient;->B:Ljavax/net/ssl/X509TrustManager;

    .line 44
    invoke-virtual {v0}, Lyj/k$a;->g()Lyj/k;

    move-result-object v0

    invoke-static {v1}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lyj/k;->o(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/OkHttpClient;->A:Ljavax/net/ssl/SSLSocketFactory;

    .line 45
    sget-object v0, Lbk/c;->a:Lbk/c$a;

    invoke-static {v1}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lbk/c$a;->a(Ljavax/net/ssl/X509TrustManager;)Lbk/c;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/OkHttpClient;->G:Lbk/c;

    .line 46
    invoke-virtual {p1}, Lokhttp3/OkHttpClient$Builder;->n()Loj/e;

    move-result-object p1

    .line 47
    invoke-static {v0}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Loj/e;->e(Lbk/c;)Loj/e;

    move-result-object p1

    iput-object p1, p0, Lokhttp3/OkHttpClient;->F:Loj/e;

    .line 48
    :goto_4
    invoke-direct {p0}, Lokhttp3/OkHttpClient;->M()V

    return-void
.end method

.method private final M()V
    .locals 4

    .line 1
    iget-object v0, p0, Lokhttp3/OkHttpClient;->m:Ljava/util/List;

    .line 2
    .line 3
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>"

    .line 4
    .line 5
    if-eqz v0, :cond_11

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v3, 0x1

    .line 13
    xor-int/2addr v0, v3

    .line 14
    if-eqz v0, :cond_10

    .line 15
    .line 16
    iget-object v0, p0, Lokhttp3/OkHttpClient;->n:Ljava/util/List;

    .line 17
    .line 18
    if-eqz v0, :cond_f

    .line 19
    .line 20
    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    xor-int/2addr v0, v3

    .line 25
    if-eqz v0, :cond_e

    .line 26
    .line 27
    iget-object v0, p0, Lokhttp3/OkHttpClient;->C:Ljava/util/List;

    .line 28
    .line 29
    instance-of v1, v0, Ljava/util/Collection;

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    :cond_0
    move v0, v3

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_0

    .line 51
    .line 52
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, Loj/j;

    .line 57
    .line 58
    invoke-virtual {v1}, Loj/j;->f()Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_2

    .line 63
    .line 64
    move v0, v2

    .line 65
    :goto_0
    if-eqz v0, :cond_a

    .line 66
    .line 67
    iget-object v0, p0, Lokhttp3/OkHttpClient;->A:Ljavax/net/ssl/SSLSocketFactory;

    .line 68
    .line 69
    if-nez v0, :cond_3

    .line 70
    .line 71
    move v0, v3

    .line 72
    goto :goto_1

    .line 73
    :cond_3
    move v0, v2

    .line 74
    :goto_1
    const-string v1, "Check failed."

    .line 75
    .line 76
    if-eqz v0, :cond_9

    .line 77
    .line 78
    iget-object v0, p0, Lokhttp3/OkHttpClient;->G:Lbk/c;

    .line 79
    .line 80
    if-nez v0, :cond_4

    .line 81
    .line 82
    move v0, v3

    .line 83
    goto :goto_2

    .line 84
    :cond_4
    move v0, v2

    .line 85
    :goto_2
    if-eqz v0, :cond_8

    .line 86
    .line 87
    iget-object v0, p0, Lokhttp3/OkHttpClient;->B:Ljavax/net/ssl/X509TrustManager;

    .line 88
    .line 89
    if-nez v0, :cond_5

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_5
    move v3, v2

    .line 93
    :goto_3
    if-eqz v3, :cond_7

    .line 94
    .line 95
    iget-object v0, p0, Lokhttp3/OkHttpClient;->F:Loj/e;

    .line 96
    .line 97
    sget-object v2, Loj/e;->c:Loj/e;

    .line 98
    .line 99
    invoke-static {v0, v2}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_6

    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 107
    .line 108
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw v0

    .line 116
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 117
    .line 118
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    throw v0

    .line 126
    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw v0

    .line 136
    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 137
    .line 138
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    throw v0

    .line 146
    :cond_a
    iget-object v0, p0, Lokhttp3/OkHttpClient;->A:Ljavax/net/ssl/SSLSocketFactory;

    .line 147
    .line 148
    if-eqz v0, :cond_d

    .line 149
    .line 150
    iget-object v0, p0, Lokhttp3/OkHttpClient;->G:Lbk/c;

    .line 151
    .line 152
    if-eqz v0, :cond_c

    .line 153
    .line 154
    iget-object v0, p0, Lokhttp3/OkHttpClient;->B:Ljavax/net/ssl/X509TrustManager;

    .line 155
    .line 156
    if-eqz v0, :cond_b

    .line 157
    .line 158
    :goto_4
    return-void

    .line 159
    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 160
    .line 161
    const-string v1, "x509TrustManager == null"

    .line 162
    .line 163
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    throw v0

    .line 171
    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 172
    .line 173
    const-string v1, "certificateChainCleaner == null"

    .line 174
    .line 175
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    throw v0

    .line 183
    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 184
    .line 185
    const-string v1, "sslSocketFactory == null"

    .line 186
    .line 187
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    throw v0

    .line 195
    :cond_e
    new-instance v0, Ljava/lang/StringBuilder;

    .line 196
    .line 197
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 198
    .line 199
    .line 200
    const-string v1, "Null network interceptor: "

    .line 201
    .line 202
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    iget-object v1, p0, Lokhttp3/OkHttpClient;->n:Ljava/util/List;

    .line 206
    .line 207
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 215
    .line 216
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    throw v1

    .line 224
    :cond_f
    new-instance v0, Ljava/lang/NullPointerException;

    .line 225
    .line 226
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    throw v0

    .line 230
    :cond_10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 231
    .line 232
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 233
    .line 234
    .line 235
    const-string v1, "Null interceptor: "

    .line 236
    .line 237
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    iget-object v1, p0, Lokhttp3/OkHttpClient;->m:Ljava/util/List;

    .line 241
    .line 242
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 250
    .line 251
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    throw v1

    .line 259
    :cond_11
    new-instance v0, Ljava/lang/NullPointerException;

    .line 260
    .line 261
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    throw v0
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
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
.end method

.method public static final synthetic c()Ljava/util/List;
    .locals 1

    sget-object v0, Lokhttp3/OkHttpClient;->P:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic d()Ljava/util/List;
    .locals 1

    sget-object v0, Lokhttp3/OkHttpClient;->O:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic e(Lokhttp3/OkHttpClient;)Ljavax/net/ssl/SSLSocketFactory;
    .locals 0

    iget-object p0, p0, Lokhttp3/OkHttpClient;->A:Ljavax/net/ssl/SSLSocketFactory;

    return-object p0
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

    iget-object v0, p0, Lokhttp3/OkHttpClient;->n:Ljava/util/List;

    return-object v0
.end method

.method public B()Lokhttp3/OkHttpClient$Builder;
    .locals 1

    new-instance v0, Lokhttp3/OkHttpClient$Builder;

    invoke-direct {v0, p0}, Lokhttp3/OkHttpClient$Builder;-><init>(Lokhttp3/OkHttpClient;)V

    return-object v0
.end method

.method public C(Lokhttp3/Request;Loj/t;)Lokhttp3/WebSocket;
    .locals 11

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "listener"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lck/d;

    .line 12
    .line 13
    sget-object v2, Lsj/e;->h:Lsj/e;

    .line 14
    .line 15
    new-instance v5, Ljava/util/Random;

    .line 16
    .line 17
    invoke-direct {v5}, Ljava/util/Random;-><init>()V

    .line 18
    .line 19
    .line 20
    iget v1, p0, Lokhttp3/OkHttpClient;->L:I

    .line 21
    .line 22
    int-to-long v6, v1

    .line 23
    const/4 v8, 0x0

    .line 24
    iget-wide v9, p0, Lokhttp3/OkHttpClient;->M:J

    .line 25
    .line 26
    move-object v1, v0

    .line 27
    move-object v3, p1

    .line 28
    move-object v4, p2

    .line 29
    invoke-direct/range {v1 .. v10}, Lck/d;-><init>(Lsj/e;Lokhttp3/Request;Loj/t;Ljava/util/Random;JLck/e;J)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p0}, Lck/d;->p(Lokhttp3/OkHttpClient;)V

    .line 33
    .line 34
    .line 35
    return-object v0
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

.method public final D()I
    .locals 1

    iget v0, p0, Lokhttp3/OkHttpClient;->L:I

    return v0
.end method

.method public final E()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Loj/q;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lokhttp3/OkHttpClient;->D:Ljava/util/List;

    return-object v0
.end method

.method public final F()Ljava/net/Proxy;
    .locals 1

    iget-object v0, p0, Lokhttp3/OkHttpClient;->w:Ljava/net/Proxy;

    return-object v0
.end method

.method public final G()Loj/b;
    .locals 1

    iget-object v0, p0, Lokhttp3/OkHttpClient;->y:Loj/b;

    return-object v0
.end method

.method public final H()Ljava/net/ProxySelector;
    .locals 1

    iget-object v0, p0, Lokhttp3/OkHttpClient;->x:Ljava/net/ProxySelector;

    return-object v0
.end method

.method public final I()I
    .locals 1

    iget v0, p0, Lokhttp3/OkHttpClient;->J:I

    return v0
.end method

.method public final J()Z
    .locals 1

    iget-boolean v0, p0, Lokhttp3/OkHttpClient;->p:Z

    return v0
.end method

.method public final K()Ljavax/net/SocketFactory;
    .locals 1

    iget-object v0, p0, Lokhttp3/OkHttpClient;->z:Ljavax/net/SocketFactory;

    return-object v0
.end method

.method public final L()Ljavax/net/ssl/SSLSocketFactory;
    .locals 2

    iget-object v0, p0, Lokhttp3/OkHttpClient;->A:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "CLEARTEXT-only client"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final N()I
    .locals 1

    iget v0, p0, Lokhttp3/OkHttpClient;->K:I

    return v0
.end method

.method public final O()Ljavax/net/ssl/X509TrustManager;
    .locals 1

    iget-object v0, p0, Lokhttp3/OkHttpClient;->B:Ljavax/net/ssl/X509TrustManager;

    return-object v0
.end method

.method public a(Lokhttp3/Request;)Lokhttp3/Call;
    .locals 2

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ltj/e;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p0, p1, v1}, Ltj/e;-><init>(Lokhttp3/OkHttpClient;Lokhttp3/Request;Z)V

    .line 10
    .line 11
    .line 12
    return-object v0
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

.method public clone()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final g()Loj/b;
    .locals 1

    iget-object v0, p0, Lokhttp3/OkHttpClient;->q:Loj/b;

    return-object v0
.end method

.method public final h()Loj/c;
    .locals 1

    iget-object v0, p0, Lokhttp3/OkHttpClient;->u:Loj/c;

    return-object v0
.end method

.method public final j()I
    .locals 1

    iget v0, p0, Lokhttp3/OkHttpClient;->H:I

    return v0
.end method

.method public final k()Lbk/c;
    .locals 1

    iget-object v0, p0, Lokhttp3/OkHttpClient;->G:Lbk/c;

    return-object v0
.end method

.method public final m()Loj/e;
    .locals 1

    iget-object v0, p0, Lokhttp3/OkHttpClient;->F:Loj/e;

    return-object v0
.end method

.method public final n()I
    .locals 1

    iget v0, p0, Lokhttp3/OkHttpClient;->I:I

    return v0
.end method

.method public final o()Loj/i;
    .locals 1

    iget-object v0, p0, Lokhttp3/OkHttpClient;->l:Loj/i;

    return-object v0
.end method

.method public final p()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Loj/j;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lokhttp3/OkHttpClient;->C:Ljava/util/List;

    return-object v0
.end method

.method public final q()Lokhttp3/CookieJar;
    .locals 1

    iget-object v0, p0, Lokhttp3/OkHttpClient;->t:Lokhttp3/CookieJar;

    return-object v0
.end method

.method public final r()Lokhttp3/Dispatcher;
    .locals 1

    iget-object v0, p0, Lokhttp3/OkHttpClient;->k:Lokhttp3/Dispatcher;

    return-object v0
.end method

.method public final s()Loj/m;
    .locals 1

    iget-object v0, p0, Lokhttp3/OkHttpClient;->v:Loj/m;

    return-object v0
.end method

.method public final t()Loj/n$c;
    .locals 1

    iget-object v0, p0, Lokhttp3/OkHttpClient;->o:Loj/n$c;

    return-object v0
.end method

.method public final u()Z
    .locals 1

    iget-boolean v0, p0, Lokhttp3/OkHttpClient;->r:Z

    return v0
.end method

.method public final v()Z
    .locals 1

    iget-boolean v0, p0, Lokhttp3/OkHttpClient;->s:Z

    return v0
.end method

.method public final w()Ltj/i;
    .locals 1

    iget-object v0, p0, Lokhttp3/OkHttpClient;->N:Ltj/i;

    return-object v0
.end method

.method public final x()Ljavax/net/ssl/HostnameVerifier;
    .locals 1

    iget-object v0, p0, Lokhttp3/OkHttpClient;->E:Ljavax/net/ssl/HostnameVerifier;

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

    iget-object v0, p0, Lokhttp3/OkHttpClient;->m:Ljava/util/List;

    return-object v0
.end method

.method public final z()J
    .locals 2

    iget-wide v0, p0, Lokhttp3/OkHttpClient;->M:J

    return-wide v0
.end method
