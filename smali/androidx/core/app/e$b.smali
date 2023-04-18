.class Landroidx/core/app/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/core/app/e;->i(Landroid/app/Activity;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Landroid/app/Application;

.field final synthetic l:Landroidx/core/app/e$d;


# direct methods
.method constructor <init>(Landroid/app/Application;Landroidx/core/app/e$d;)V
    .locals 0

    iput-object p1, p0, Landroidx/core/app/e$b;->k:Landroid/app/Application;

    iput-object p2, p0, Landroidx/core/app/e$b;->l:Landroidx/core/app/e$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Landroidx/core/app/e$b;->k:Landroid/app/Application;

    iget-object v1, p0, Landroidx/core/app/e$b;->l:Landroidx/core/app/e$d;

    invoke-virtual {v0, v1}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void
.end method
