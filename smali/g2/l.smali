.class public final synthetic Lg2/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lg2/i;


# direct methods
.method public synthetic constructor <init>(Lg2/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg2/l;->a:Lg2/i;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lg2/l;->a:Lg2/i;

    invoke-static {v0}, Lg2/q;->e(Lg2/i;)Lg2/k0;

    move-result-object v0

    return-object v0
.end method
