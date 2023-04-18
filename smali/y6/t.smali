.class public final synthetic Ly6/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Ly6/v;


# direct methods
.method public synthetic constructor <init>(Ly6/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly6/t;->k:Ly6/v;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Ly6/t;->k:Ly6/v;

    invoke-static {v0}, Ly6/v;->b(Ly6/v;)V

    return-void
.end method
