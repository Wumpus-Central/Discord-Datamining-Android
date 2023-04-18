.class public final synthetic Li0/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/core/util/b;


# instance fields
.field public final synthetic a:Li0/o0;


# direct methods
.method public synthetic constructor <init>(Li0/o0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li0/b0;->a:Li0/o0;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Li0/b0;->a:Li0/o0;

    check-cast p1, Landroidx/camera/core/v2$f;

    invoke-static {v0, p1}, Li0/o0;->r(Li0/o0;Landroidx/camera/core/v2$f;)V

    return-void
.end method
