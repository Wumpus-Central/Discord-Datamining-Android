.class public final synthetic Lq/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly/a;


# instance fields
.field public final synthetic a:Lq/r0$c;


# direct methods
.method public synthetic constructor <init>(Lq/r0$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq/t0;->a:Lq/r0$c;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Lfc/b;
    .locals 1

    iget-object v0, p0, Lq/t0;->a:Lq/r0$c;

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {v0, p1}, Lq/r0$c;->e(Lq/r0$c;Ljava/lang/Boolean;)Lfc/b;

    move-result-object p1

    return-object p1
.end method
