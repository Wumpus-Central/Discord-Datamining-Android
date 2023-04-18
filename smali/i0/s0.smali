.class public final synthetic Li0/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/core/util/b;


# instance fields
.field public final synthetic a:Li0/r;

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Li0/r;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li0/s0;->a:Li0/r;

    iput-object p2, p0, Li0/s0;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Li0/s0;->a:Li0/r;

    iget-object v1, p0, Li0/s0;->b:Landroid/content/Context;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, v1, p1}, Li0/o0$i;->f(Li0/r;Landroid/content/Context;Landroid/net/Uri;)V

    return-void
.end method
