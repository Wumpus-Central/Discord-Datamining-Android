.class Lcom/facebook/react/modules/network/ForwardingCookieHandler$CookieSaver;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/modules/network/ForwardingCookieHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "CookieSaver"
.end annotation


# static fields
.field private static final MSG_PERSIST_COOKIES:I = 0x1

.field private static final TIMEOUT:I = 0x7530


# instance fields
.field private final mHandler:Landroid/os/Handler;

.field final synthetic this$0:Lcom/facebook/react/modules/network/ForwardingCookieHandler;


# direct methods
.method public constructor <init>(Lcom/facebook/react/modules/network/ForwardingCookieHandler;)V
    .locals 3

    .line 1
    iput-object p1, p0, Lcom/facebook/react/modules/network/ForwardingCookieHandler$CookieSaver;->this$0:Lcom/facebook/react/modules/network/ForwardingCookieHandler;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/os/Handler;

    .line 7
    .line 8
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Lcom/facebook/react/modules/network/ForwardingCookieHandler$CookieSaver$1;

    .line 13
    .line 14
    invoke-direct {v2, p0, p1}, Lcom/facebook/react/modules/network/ForwardingCookieHandler$CookieSaver$1;-><init>(Lcom/facebook/react/modules/network/ForwardingCookieHandler$CookieSaver;Lcom/facebook/react/modules/network/ForwardingCookieHandler;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/facebook/react/modules/network/ForwardingCookieHandler$CookieSaver;->mHandler:Landroid/os/Handler;

    .line 21
    .line 22
    return-void
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
.end method

.method static synthetic access$100(Lcom/facebook/react/modules/network/ForwardingCookieHandler$CookieSaver;)V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/modules/network/ForwardingCookieHandler$CookieSaver;->flush()V

    return-void
.end method

.method private flush()V
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/network/ForwardingCookieHandler$CookieSaver;->this$0:Lcom/facebook/react/modules/network/ForwardingCookieHandler;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/facebook/react/modules/network/ForwardingCookieHandler;->access$300(Lcom/facebook/react/modules/network/ForwardingCookieHandler;)Landroid/webkit/CookieManager;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/webkit/CookieManager;->flush()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
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
.end method


# virtual methods
.method public onCookiesModified()V
    .locals 0

    return-void
.end method

.method public persistCookies()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/network/ForwardingCookieHandler$CookieSaver;->mHandler:Landroid/os/Handler;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/facebook/react/modules/network/ForwardingCookieHandler$CookieSaver;->this$0:Lcom/facebook/react/modules/network/ForwardingCookieHandler;

    .line 8
    .line 9
    new-instance v1, Lcom/facebook/react/modules/network/ForwardingCookieHandler$CookieSaver$2;

    .line 10
    .line 11
    invoke-direct {v1, p0}, Lcom/facebook/react/modules/network/ForwardingCookieHandler$CookieSaver$2;-><init>(Lcom/facebook/react/modules/network/ForwardingCookieHandler$CookieSaver;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lcom/facebook/react/modules/network/ForwardingCookieHandler;->access$200(Lcom/facebook/react/modules/network/ForwardingCookieHandler;Ljava/lang/Runnable;)V

    .line 15
    .line 16
    .line 17
    return-void
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
.end method
