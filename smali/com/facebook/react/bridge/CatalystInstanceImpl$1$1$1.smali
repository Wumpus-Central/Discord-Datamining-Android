.class Lcom/facebook/react/bridge/CatalystInstanceImpl$1$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/bridge/CatalystInstanceImpl$1$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$2:Lcom/facebook/react/bridge/CatalystInstanceImpl$1$1;


# direct methods
.method constructor <init>(Lcom/facebook/react/bridge/CatalystInstanceImpl$1$1;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/bridge/CatalystInstanceImpl$1$1$1;->this$2:Lcom/facebook/react/bridge/CatalystInstanceImpl$1$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    new-instance v0, Lcom/facebook/react/bridge/CatalystInstanceImpl$1$1$1$1;

    invoke-direct {v0, p0}, Lcom/facebook/react/bridge/CatalystInstanceImpl$1$1$1$1;-><init>(Lcom/facebook/react/bridge/CatalystInstanceImpl$1$1$1;)V

    invoke-static {v0}, Landroid/os/AsyncTask;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
