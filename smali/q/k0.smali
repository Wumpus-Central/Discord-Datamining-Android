.class public final synthetic Lq/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lq/j0$g$b;


# direct methods
.method public synthetic constructor <init>(Lq/j0$g$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq/k0;->k:Lq/j0$g$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lq/k0;->k:Lq/j0$g$b;

    invoke-static {v0}, Lq/j0$g$b;->a(Lq/j0$g$b;)V

    return-void
.end method
