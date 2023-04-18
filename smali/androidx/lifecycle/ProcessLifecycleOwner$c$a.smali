.class Landroidx/lifecycle/ProcessLifecycleOwner$c$a;
.super Landroidx/lifecycle/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/lifecycle/ProcessLifecycleOwner$c;->onActivityPreCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Landroidx/lifecycle/ProcessLifecycleOwner$c;


# direct methods
.method constructor <init>(Landroidx/lifecycle/ProcessLifecycleOwner$c;)V
    .locals 0

    iput-object p1, p0, Landroidx/lifecycle/ProcessLifecycleOwner$c$a;->this$1:Landroidx/lifecycle/ProcessLifecycleOwner$c;

    invoke-direct {p0}, Landroidx/lifecycle/d;-><init>()V

    return-void
.end method


# virtual methods
.method public onActivityPostResumed(Landroid/app/Activity;)V
    .locals 0

    iget-object p1, p0, Landroidx/lifecycle/ProcessLifecycleOwner$c$a;->this$1:Landroidx/lifecycle/ProcessLifecycleOwner$c;

    iget-object p1, p1, Landroidx/lifecycle/ProcessLifecycleOwner$c;->this$0:Landroidx/lifecycle/ProcessLifecycleOwner;

    invoke-virtual {p1}, Landroidx/lifecycle/ProcessLifecycleOwner;->b()V

    return-void
.end method

.method public onActivityPostStarted(Landroid/app/Activity;)V
    .locals 0

    iget-object p1, p0, Landroidx/lifecycle/ProcessLifecycleOwner$c$a;->this$1:Landroidx/lifecycle/ProcessLifecycleOwner$c;

    iget-object p1, p1, Landroidx/lifecycle/ProcessLifecycleOwner$c;->this$0:Landroidx/lifecycle/ProcessLifecycleOwner;

    invoke-virtual {p1}, Landroidx/lifecycle/ProcessLifecycleOwner;->c()V

    return-void
.end method
