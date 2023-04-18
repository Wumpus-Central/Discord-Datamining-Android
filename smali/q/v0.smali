.class public final synthetic Lq/v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lq/r0$c;


# direct methods
.method public synthetic constructor <init>(Lq/r0$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq/v0;->k:Lq/r0$c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lq/v0;->k:Lq/r0$c;

    invoke-static {v0}, Lq/r0$c;->a(Lq/r0$c;)V

    return-void
.end method
