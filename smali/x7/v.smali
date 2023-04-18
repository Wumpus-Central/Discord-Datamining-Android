.class public final synthetic Lx7/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/x$g;


# instance fields
.field public final synthetic a:Ld7/k;


# direct methods
.method public synthetic constructor <init>(Ld7/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx7/v;->a:Ld7/k;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lx7/v;->a:Ld7/k;

    check-cast p1, Lx7/m;

    invoke-static {v0, p1}, Lx7/x;->c(Ld7/k;Lx7/m;)I

    move-result p1

    return p1
.end method
