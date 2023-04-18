.class public final synthetic Ly6/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La7/b$a;


# instance fields
.field public final synthetic a:Lz6/c;


# direct methods
.method public synthetic constructor <init>(Lz6/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly6/h;->a:Lz6/c;

    return-void
.end method


# virtual methods
.method public final execute()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ly6/h;->a:Lz6/c;

    invoke-interface {v0}, Lz6/c;->k()Lu6/a;

    move-result-object v0

    return-object v0
.end method
