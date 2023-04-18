.class public final synthetic Li0/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/core/util/b;


# instance fields
.field public final synthetic a:Li0/r;


# direct methods
.method public synthetic constructor <init>(Li0/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li0/r0;->a:Li0/r;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Li0/r0;->a:Li0/r;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, p1}, Li0/o0$i;->b(Li0/r;Landroid/net/Uri;)V

    return-void
.end method
