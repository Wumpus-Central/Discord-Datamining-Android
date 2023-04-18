.class Landroidx/camera/extensions/ExtensionsManager$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/extensions/impl/InitializerImpl$OnExtensionsDeinitializedCallback;


# instance fields
.field final synthetic this$0:Landroidx/camera/extensions/ExtensionsManager;

.field final synthetic val$completer:Landroidx/concurrent/futures/c$a;


# direct methods
.method constructor <init>(Landroidx/camera/extensions/ExtensionsManager;Landroidx/concurrent/futures/c$a;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/extensions/ExtensionsManager$2;->this$0:Landroidx/camera/extensions/ExtensionsManager;

    iput-object p2, p0, Landroidx/camera/extensions/ExtensionsManager$2;->val$completer:Landroidx/concurrent/futures/c$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(I)V
    .locals 2

    iget-object p1, p0, Landroidx/camera/extensions/ExtensionsManager$2;->val$completer:Landroidx/concurrent/futures/c$a;

    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Failed to deinitialize extensions."

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public onSuccess()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/extensions/ExtensionsManager$2;->val$completer:Landroidx/concurrent/futures/c$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    return-void
.end method
