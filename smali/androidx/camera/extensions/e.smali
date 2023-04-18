.class public final synthetic Landroidx/camera/extensions/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/concurrent/futures/c$c;


# instance fields
.field public final synthetic a:Le0/p;

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Landroidx/camera/core/s;


# direct methods
.method public synthetic constructor <init>(Le0/p;Landroid/content/Context;Landroidx/camera/core/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/extensions/e;->a:Le0/p;

    iput-object p2, p0, Landroidx/camera/extensions/e;->b:Landroid/content/Context;

    iput-object p3, p0, Landroidx/camera/extensions/e;->c:Landroidx/camera/core/s;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Landroidx/camera/extensions/e;->a:Le0/p;

    iget-object v1, p0, Landroidx/camera/extensions/e;->b:Landroid/content/Context;

    iget-object v2, p0, Landroidx/camera/extensions/e;->c:Landroidx/camera/core/s;

    invoke-static {v0, v1, v2, p1}, Landroidx/camera/extensions/ExtensionsManager;->a(Le0/p;Landroid/content/Context;Landroidx/camera/core/s;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
