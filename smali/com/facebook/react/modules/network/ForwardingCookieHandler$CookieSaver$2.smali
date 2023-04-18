.class Lcom/facebook/react/modules/network/ForwardingCookieHandler$CookieSaver$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/modules/network/ForwardingCookieHandler$CookieSaver;->persistCookies()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/facebook/react/modules/network/ForwardingCookieHandler$CookieSaver;


# direct methods
.method constructor <init>(Lcom/facebook/react/modules/network/ForwardingCookieHandler$CookieSaver;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/modules/network/ForwardingCookieHandler$CookieSaver$2;->this$1:Lcom/facebook/react/modules/network/ForwardingCookieHandler$CookieSaver;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/modules/network/ForwardingCookieHandler$CookieSaver$2;->this$1:Lcom/facebook/react/modules/network/ForwardingCookieHandler$CookieSaver;

    invoke-static {v0}, Lcom/facebook/react/modules/network/ForwardingCookieHandler$CookieSaver;->access$100(Lcom/facebook/react/modules/network/ForwardingCookieHandler$CookieSaver;)V

    return-void
.end method
