.class public final synthetic Li0/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/core/util/b;


# instance fields
.field public final synthetic a:Li0/w;


# direct methods
.method public synthetic constructor <init>(Li0/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li0/p0;->a:Li0/w;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Li0/p0;->a:Li0/w;

    check-cast p1, Li0/j1$a;

    invoke-static {v0, p1}, Li0/o0$h;->a(Li0/w;Li0/j1$a;)V

    return-void
.end method
