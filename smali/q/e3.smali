.class public final synthetic Lq/e3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/concurrent/futures/c$c;


# instance fields
.field public final synthetic a:Lq/h3;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(Lq/h3;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq/e3;->a:Lq/h3;

    iput-boolean p2, p0, Lq/e3;->b:Z

    return-void
.end method


# virtual methods
.method public final a(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lq/e3;->a:Lq/h3;

    iget-boolean v1, p0, Lq/e3;->b:Z

    invoke-static {v0, v1, p1}, Lq/h3;->c(Lq/h3;ZLandroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
