.class public final Lcom/facebook/react/packagerconnection/JSPackagerClient;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/packagerconnection/ReconnectingWebSocket$MessageCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/packagerconnection/JSPackagerClient$ResponderImpl;
    }
.end annotation


# static fields
.field private static final PROTOCOL_VERSION:I = 0x2

.field private static final TAG:Ljava/lang/String; = "JSPackagerClient"


# instance fields
.field private mRequestHandlers:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/facebook/react/packagerconnection/RequestHandler;",
            ">;"
        }
    .end annotation
.end field

.field private mWebSocket:Lcom/facebook/react/packagerconnection/ReconnectingWebSocket;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/facebook/react/packagerconnection/PackagerConnectionSettings;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/facebook/react/packagerconnection/PackagerConnectionSettings;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/facebook/react/packagerconnection/RequestHandler;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/facebook/react/packagerconnection/JSPackagerClient;-><init>(Ljava/lang/String;Lcom/facebook/react/packagerconnection/PackagerConnectionSettings;Ljava/util/Map;Lcom/facebook/react/packagerconnection/ReconnectingWebSocket$ConnectionCallback;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/facebook/react/packagerconnection/PackagerConnectionSettings;Ljava/util/Map;Lcom/facebook/react/packagerconnection/ReconnectingWebSocket$ConnectionCallback;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/facebook/react/packagerconnection/PackagerConnectionSettings;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/facebook/react/packagerconnection/RequestHandler;",
            ">;",
            "Lcom/facebook/react/packagerconnection/ReconnectingWebSocket$ConnectionCallback;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Landroid/net/Uri$Builder;

    invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V

    const-string v1, "ws"

    .line 4
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    .line 5
    invoke-virtual {p2}, Lcom/facebook/react/packagerconnection/PackagerConnectionSettings;->getDebugServerHost()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->encodedAuthority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    const-string v2, "message"

    .line 6
    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    const-string v2, "device"

    .line 7
    invoke-static {}, Lcom/facebook/react/modules/systeminfo/AndroidInfoHelpers;->getFriendlyDeviceName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    const-string v2, "app"

    .line 8
    invoke-virtual {p2}, Lcom/facebook/react/packagerconnection/PackagerConnectionSettings;->getPackageName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, v2, p2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p2

    const-string v1, "clientid"

    .line 9
    invoke-virtual {p2, v1, p1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 10
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    .line 11
    new-instance p2, Lcom/facebook/react/packagerconnection/ReconnectingWebSocket;

    invoke-direct {p2, p1, p0, p4}, Lcom/facebook/react/packagerconnection/ReconnectingWebSocket;-><init>(Ljava/lang/String;Lcom/facebook/react/packagerconnection/ReconnectingWebSocket$MessageCallback;Lcom/facebook/react/packagerconnection/ReconnectingWebSocket$ConnectionCallback;)V

    iput-object p2, p0, Lcom/facebook/react/packagerconnection/JSPackagerClient;->mWebSocket:Lcom/facebook/react/packagerconnection/ReconnectingWebSocket;

    .line 12
    iput-object p3, p0, Lcom/facebook/react/packagerconnection/JSPackagerClient;->mRequestHandlers:Ljava/util/Map;

    return-void
.end method

.method private abortOnMessage(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance v0, Lcom/facebook/react/packagerconnection/JSPackagerClient$ResponderImpl;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lcom/facebook/react/packagerconnection/JSPackagerClient$ResponderImpl;-><init>(Lcom/facebook/react/packagerconnection/JSPackagerClient;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p2}, Lcom/facebook/react/packagerconnection/JSPackagerClient$ResponderImpl;->error(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    sget-object p1, Lcom/facebook/react/packagerconnection/JSPackagerClient;->TAG:Ljava/lang/String;

    .line 12
    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v1, "Handling the message failed with reason: "

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-static {p1, p2}, Lw3/a;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void
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
.end method

.method static synthetic access$000(Lcom/facebook/react/packagerconnection/JSPackagerClient;)Lcom/facebook/react/packagerconnection/ReconnectingWebSocket;
    .locals 0

    iget-object p0, p0, Lcom/facebook/react/packagerconnection/JSPackagerClient;->mWebSocket:Lcom/facebook/react/packagerconnection/ReconnectingWebSocket;

    return-object p0
.end method

.method static synthetic access$100()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/facebook/react/packagerconnection/JSPackagerClient;->TAG:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public close()V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/packagerconnection/JSPackagerClient;->mWebSocket:Lcom/facebook/react/packagerconnection/ReconnectingWebSocket;

    invoke-virtual {v0}, Lcom/facebook/react/packagerconnection/ReconnectingWebSocket;->closeQuietly()V

    return-void
.end method

.method public init()V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/packagerconnection/JSPackagerClient;->mWebSocket:Lcom/facebook/react/packagerconnection/ReconnectingWebSocket;

    invoke-virtual {v0}, Lcom/facebook/react/packagerconnection/ReconnectingWebSocket;->connect()V

    return-void
.end method

.method public onMessage(Ljava/lang/String;)V
    .locals 4

    .line 1
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p1, "version"

    .line 2
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p1

    const-string v1, "method"

    .line 3
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "id"

    .line 4
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "params"

    .line 5
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const/4 v3, 0x2

    if-eq p1, v3, :cond_0

    .line 6
    sget-object v0, Lcom/facebook/react/packagerconnection/JSPackagerClient;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Message with incompatible or missing version of protocol received: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lw3/a;->j(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    if-nez v1, :cond_1

    const-string p1, "No method provided"

    .line 7
    invoke-direct {p0, v2, p1}, Lcom/facebook/react/packagerconnection/JSPackagerClient;->abortOnMessage(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    .line 8
    :cond_1
    iget-object p1, p0, Lcom/facebook/react/packagerconnection/JSPackagerClient;->mRequestHandlers:Ljava/util/Map;

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/packagerconnection/RequestHandler;

    if-nez p1, :cond_2

    .line 9
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "No request handler for method: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v2, p1}, Lcom/facebook/react/packagerconnection/JSPackagerClient;->abortOnMessage(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    :cond_2
    if-nez v2, :cond_3

    .line 10
    invoke-interface {p1, v0}, Lcom/facebook/react/packagerconnection/RequestHandler;->onNotification(Ljava/lang/Object;)V

    goto :goto_0

    .line 11
    :cond_3
    new-instance v1, Lcom/facebook/react/packagerconnection/JSPackagerClient$ResponderImpl;

    invoke-direct {v1, p0, v2}, Lcom/facebook/react/packagerconnection/JSPackagerClient$ResponderImpl;-><init>(Lcom/facebook/react/packagerconnection/JSPackagerClient;Ljava/lang/Object;)V

    invoke-interface {p1, v0, v1}, Lcom/facebook/react/packagerconnection/RequestHandler;->onRequest(Ljava/lang/Object;Lcom/facebook/react/packagerconnection/Responder;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 12
    sget-object v0, Lcom/facebook/react/packagerconnection/JSPackagerClient;->TAG:Ljava/lang/String;

    const-string v1, "Handling the message failed"

    invoke-static {v0, v1, p1}, Lw3/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public onMessage(Lokio/ByteString;)V
    .locals 1

    .line 13
    sget-object p1, Lcom/facebook/react/packagerconnection/JSPackagerClient;->TAG:Ljava/lang/String;

    const-string v0, "Websocket received message with payload of unexpected type binary"

    invoke-static {p1, v0}, Lw3/a;->H(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
