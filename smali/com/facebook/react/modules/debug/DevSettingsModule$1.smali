.class Lcom/facebook/react/modules/debug/DevSettingsModule$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/modules/debug/DevSettingsModule;->reload()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/modules/debug/DevSettingsModule;


# direct methods
.method constructor <init>(Lcom/facebook/react/modules/debug/DevSettingsModule;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/modules/debug/DevSettingsModule$1;->this$0:Lcom/facebook/react/modules/debug/DevSettingsModule;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/modules/debug/DevSettingsModule$1;->this$0:Lcom/facebook/react/modules/debug/DevSettingsModule;

    invoke-static {v0}, Lcom/facebook/react/modules/debug/DevSettingsModule;->access$000(Lcom/facebook/react/modules/debug/DevSettingsModule;)Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->handleReloadJS()V

    return-void
.end method
