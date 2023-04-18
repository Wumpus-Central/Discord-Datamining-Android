.class public final synthetic Ly6/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La7/b$a;


# instance fields
.field public final synthetic a:Lz6/d;


# direct methods
.method public synthetic constructor <init>(Lz6/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly6/i;->a:Lz6/d;

    return-void
.end method


# virtual methods
.method public final execute()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ly6/i;->a:Lz6/d;

    invoke-interface {v0}, Lz6/d;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
